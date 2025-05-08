//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {NullOrNumber, NullOrZeroNumber} from "@joookiwi/type"

import type {MinimalistCollectionHolder}                                                           from "../MinimalistCollectionHolder"
import type {CollectionIterator}                                                                   from "./CollectionIterator"
import type {IteratorValue}                                                                        from "./value/IteratorValue"
import type {IndexValueCallback, ValueIndexCallback}                                               from "../type/callback"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol} from "../type/symbol"
import type {CollectionIteratorName}                                                               from "../type/toStringTag"

import {NoElementFoundInCollectionException} from "../exception/NoElementFoundInCollectionException"
import {GenericAfterLastIteratorValue}       from "./value/GenericAfterLastIteratorValue"
import {GenericBeforeFirstIteratorValue}     from "./value/GenericBeforeFirstIteratorValue"

export abstract class AbstractCollectionIterator<const T,
    const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >
    implements CollectionIterator<T> {

    //#region -------------------- Fields --------------------

    #previousIndex?: NullOrNumber
    #currentIndex: NullOrNumber
    #nextIndex?: NullOrNumber

    #firstIndex?: NullOrZeroNumber
    #lastIndex?: NullOrNumber

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected constructor() {
        this.#currentIndex = null
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Reference methods --------------------

    public abstract get collection(): COLLECTION

    //#endregion -------------------- Reference methods --------------------
    //#region -------------------- Size methods --------------------

    public get size(): number { return this.collection.size }
    public get length(): number { return this.size }
    public get count(): number { return this.size }


    /** The {@link size} minus 1 */
    protected get _sizeMinus1(): number { return this.size - 1 }

    /** The {@link size} minus 2 */
    protected get _sizeMinus2(): number { return this.size - 2 }


    public get isEmpty(): boolean { return this.size == 0 }
    public get isNotEmpty(): boolean { return this.size != 0 }


    /** Tell that the {@link size} is only of <b>1</b> */
    protected get _hasOnly1Element(): boolean { return this.size == 1 }

    /** Tell that the {@link size} is only of <b>2</b> */
    protected get _hasOnly2Elements(): boolean { return this.size == 2 }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- End-point index methods --------------------

    /** @initializedOnFirstCall */
    public get firstIndex(): NullOrZeroNumber {
        const value = this.#firstIndex
        if (value !== undefined)
            return value

        if (this.isEmpty)
            return this.#firstIndex = null
        return this.#firstIndex = 0
    }

    /** Tell that the {@link firstIndex} has yet to be retrieved */
    protected get _isFirstIndexInitialized(): boolean { return this.#firstIndex !== undefined }


    /** @initializedOnFirstCall */
    public get lastIndex(): NullOrNumber {
        const value = this.#lastIndex
        if (value !== undefined)
            return value

        if (this.isEmpty)
            return this.#lastIndex = null
        return this.#lastIndex ??= this.size - 1
    }

    /** Tell that the {@link lastIndex} has yet to be retrieved */
    protected get _isLastIndexInitialized(): boolean { return this.#lastIndex !== undefined }

    //#endregion -------------------- End-point index methods --------------------

    //#region -------------------- Current methods --------------------

    public get currentIndex(): NullOrNumber { return this._currentIndex }

    /**
     * Get the index that the {@link AbstractCollectionIterator instance} is at
     *
     * @synchronyzedWith<{@link _previousIndex}, {@link _nextIndex}>
     */
    protected get _currentIndex(): NullOrNumber { return this.#currentIndex }

    /**
     * Set the index that the {@link AbstractCollectionIterator instance} is at
     *
     * @param value The value to set
     */
    protected set _currentIndex(value: NullOrNumber,) { this.#currentIndex = value }


    public get index(): NullOrNumber { return this.currentIndex }

    //#endregion -------------------- Current methods --------------------
    //#region -------------------- Next methods --------------------

    public get hasNext(): boolean {
        if (this.isEmpty)
            return false

        if (this._isNextIndexInitialized)
            return this._nextIndex != null

        const currentIndex = this._currentIndex
        if (currentIndex == null)
            return true
        return currentIndex < this.size
    }


    public get nextIndex(): NullOrNumber { return this._nextIndex }

    /**
     * Get the next index that the {@link AbstractCollectionIterator instance} should be at
     *
     * @initializedOnFirstCall
     * @synchronyzedWith<{@link _previousIndex}, {@link _currentIndex}>
     */
    protected get _nextIndex(): NullOrNumber {
        const value = this.#nextIndex
        if (value !== undefined)
            return value
        return this.#nextIndex = this.firstIndex
    }

    /**
     * Set the next index that the {@link AbstractCollectionIterator instance} should be at
     *
     * @param value The value to set
     */
    protected set _nextIndex(value: NullOrNumber,) { this.#nextIndex = value }

    /** Tell that the next index has been initialized to either <b>null</b> or a {@link Number} */
    protected get _isNextIndexInitialized(): boolean { return this.#nextIndex !== undefined }


    public get nextValue(): T {
        if (this.isEmpty)
            throw new NoElementFoundInCollectionException("The collection iterator is at or after the end of the line.",)

        const currentIndex = this._currentIndex
        if (currentIndex == null) {
            // The direction has not been determined yet, it will set up the CollectionIterator to be from start to end
            if (this._hasOnly1Element) {
                this._previousIndex = null
                this._nextIndex = null
                return this._getValue(this._currentIndex = 0,)
            }

            this._previousIndex = null
            this._nextIndex = 1
            return this._getValue(this._currentIndex = 0,)
        }

        if (this._hasOnly1Element)
            throw new NoElementFoundInCollectionException("The collection iterator is at or after the end of the line.",)

        if (this._nextIndex == null) // At the end of the line
            throw new NoElementFoundInCollectionException("The collection iterator is at or after the end of the line.",)

        if (this._previousIndex == null) { // At the start of the line
            if (this._hasOnly2Elements) {
                this._previousIndex = 0
                this._nextIndex = null
                return this._getValue(this._currentIndex = 1,)
            }

            this._previousIndex = 0
            this._nextIndex = 2
            return this._getValue(this._currentIndex = 1,)
        }

        if (currentIndex == this._sizeMinus2) { // At the end of the line (but no internal value set)
            this._previousIndex = currentIndex
            this._nextIndex = null
            return this._getValue(this._currentIndex = currentIndex + 1,)
        }

        // Somewhere in the line
        this._previousIndex = currentIndex
        this._nextIndex = currentIndex + 2
        return this._getValue(this._currentIndex = currentIndex + 1,)
    }


    public next(): IteratorResult<T, AfterLastValueInCollectionIteratorSymbol> {
        if (this.isEmpty)
            return GenericAfterLastIteratorValue.get

        const currentIndex = this._currentIndex
        if (currentIndex == null) {
            // The direction has not been determined yet, it will set up the CollectionIterator to be from start to end
            if (this._hasOnly1Element) {
                this._previousIndex = null
                this._nextIndex = null
                return this._getIteratorValue(this._currentIndex = 0,)
            }

            this._previousIndex = null
            this._nextIndex = 1
            return this._getIteratorValue(this._currentIndex = 0,)
        }

        if (this._hasOnly1Element)
            return GenericAfterLastIteratorValue.get

        if (this._nextIndex == null) // At the end of the line
            return GenericAfterLastIteratorValue.get

        if (this._previousIndex == null) { // At the start of the line
            if (this._hasOnly2Elements) {
                this._previousIndex = 0
                this._nextIndex = null
                return this._getIteratorValue(this._currentIndex = 1,)
            }

            this._previousIndex = 0
            this._nextIndex = 2
            return this._getIteratorValue(this._currentIndex = 1,)
        }

        if (currentIndex == this._sizeMinus2) { // At the end of the line (but no internal value set)
            this._previousIndex = currentIndex
            this._nextIndex = null
            this._currentIndex = currentIndex + 1
            return this._getIteratorValue(this._currentIndex = currentIndex + 1,)
        }

        // Somewhere in the line
        this._previousIndex = currentIndex
        this._nextIndex = currentIndex + 2
        return this._getIteratorValue(this._currentIndex = currentIndex + 1,)
    }

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    public get hasPrevious(): boolean {
        if (this.isEmpty)
            return false

        if (this._isPreviousIndexInitialized)
            return this._previousIndex != null

        const currentIndex = this._currentIndex
        if (currentIndex == null)
            return true
        return currentIndex > 0
    }


    public get previousIndex(): NullOrNumber { return this._previousIndex }

    /**
     * Get the previous index that the {@link AbstractCollectionIterator instance} should be at
     *
     * @initializedOnFirstCall
     * @synchronyzedWith<{@link _currentIndex}, {@link _nextIndex}>
     */
    protected get _previousIndex(): NullOrNumber {
        const value = this.#previousIndex
        if (value !== undefined)
            return value
        return this.#previousIndex = this.lastIndex
    }

    /**
     * Set the previous index that the {@link AbstractCollectionIterator instance} should be at
     *
     * @param value The value to set
     */
    protected set _previousIndex(value: NullOrNumber,) { this.#previousIndex = value }

    /** Tell that the previous index has been initialized to either <b>null</b> or a {@link Number} */
    protected get _isPreviousIndexInitialized(): boolean { return this.#previousIndex !== undefined }


    public get previousValue(): T {
        if (this.isEmpty)
            throw new NoElementFoundInCollectionException("The collection iterator is at or before the start of the line.",)

        const currentIndex = this._currentIndex
        if (currentIndex == null) {
            // The direction has not been determined yet, it will set up the CollectionIterator to be from end to start
            if (this._hasOnly1Element) {
                this._previousIndex = null
                this._nextIndex = null
                return this._getValue(this._currentIndex = 0,)
            }

            this._previousIndex = this._sizeMinus2
            this._nextIndex = null
            return this._getValue(this._currentIndex = this._sizeMinus1,)
        }

        if (this._hasOnly1Element)
            throw new NoElementFoundInCollectionException("The collection iterator is at or before the start of the line.",)

        if (this._previousIndex == null) // At the start of the line
            throw new NoElementFoundInCollectionException("The collection iterator is at or before the start of the line.",)

        if (this._nextIndex == null) { // At the end of the line
            if (this._hasOnly2Elements) {
                this._previousIndex = null
                this._nextIndex = 1
                return this._getValue(this._currentIndex = 0,)
            }

            this._previousIndex = currentIndex - 2
            this._nextIndex = currentIndex
            return this._getValue(this._currentIndex = currentIndex - 1,)
        }

        if (currentIndex == 1) { // At the 2nd index
            this._previousIndex = null
            this._nextIndex = 1
            return this._getValue(this._currentIndex = 0,)
        }

        // Somewhere in the line
        this._previousIndex = currentIndex - 2
        this._nextIndex = currentIndex
        return this._getValue(this._currentIndex = currentIndex - 1,)
    }


    public previous(): IteratorResult<T, BeforeFirstValueInCollectionIteratorSymbol> {
        if (this.isEmpty)
            return GenericBeforeFirstIteratorValue.get

        const currentIndex = this._currentIndex
        if (currentIndex == null) {
            // The direction has not been determined yet, it will set up the CollectionIterator to be from end to start
            if (this._hasOnly1Element) {
                this._previousIndex = null
                this._nextIndex = null
                return this._getIteratorValue(this._currentIndex = 0,)
            }

            this._previousIndex = this._sizeMinus2
            this._nextIndex = null
            return this._getIteratorValue(this._currentIndex = this._sizeMinus1,)
        }

        if (this._hasOnly1Element)
            return GenericBeforeFirstIteratorValue.get

        if (this._previousIndex == null) // At the start of the line
            return GenericBeforeFirstIteratorValue.get

        if (this._nextIndex == null) { // At the end of the line
            if (this._hasOnly2Elements) {
                this._previousIndex = null
                this._nextIndex = 1
                return this._getIteratorValue(this._currentIndex = 0,)
            }

            this._previousIndex = currentIndex - 2
            this._nextIndex = currentIndex
            return this._getIteratorValue(this._currentIndex = currentIndex - 1,)
        }

        if (currentIndex == 1) { // At the 2nd index
            this._previousIndex = null
            this._nextIndex = 1
            return this._getIteratorValue(this._currentIndex = 0,)
        }

        // Somewhere in the line
        this._previousIndex = currentIndex - 2
        this._nextIndex = currentIndex
        return this._getIteratorValue(this._currentIndex = currentIndex - 1,)
    }

    //#endregion -------------------- Previous methods --------------------
    //#region -------------------- Value methods --------------------

    /**
     * Get the value encapsulated in an {@link IteratorValue} at the specified {@link index}
     *
     * @param index The positive in-bound index to retrieve the value
     */
    protected abstract _getIteratorValue(index: number,): IteratorValue<T>

    /**
     * Get the value directly from the {@link collection} at the specified {@link index}
     *
     * @param index The positive in-bound index to retrieve the value
     */
    protected abstract _getValue(index: number,): T

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Reset methods --------------------

    public reset(): this {
        this._previousIndex = null
        this._currentIndex = null
        this._nextIndex = null
        return this
    }

    //#endregion -------------------- Reset methods --------------------

    //#region -------------------- Loop methods --------------------

    public forEach(operation: ValueIndexCallback<T>,): this {
        if (this.isEmpty)
            return this

        if (this._hasOnly1Element) {
            const currentIndex = this._currentIndex
            if (currentIndex != null)
                return this

            operation(this.collection.get(0,), 0,)
            this._previousIndex = null
            this._currentIndex = 0
            this._nextIndex = null
            return this
        }

        const collection = this.collection
        const size = this.size

        let index = (this._currentIndex ?? 0) - 1
        while (++index < size)
            operation(collection.get(index,), index,)
        this._previousIndex = index - 2
        this._currentIndex = index - 1
        this._nextIndex = null
        return this
    }

    public forEachIndexed(operation: IndexValueCallback<T>,): this {
        if (this.isEmpty)
            return this

        if (this._hasOnly1Element) {
            const currentIndex = this._currentIndex
            if (currentIndex != null)
                return this

            operation(0, this.collection.get(0,),)
            this._previousIndex = null
            this._currentIndex = 0
            this._nextIndex = null
            return this
        }

        const collection = this.collection
        const size = this.size

        let index = (this._currentIndex ?? 0) - 1
        while (++index < size)
            operation(index, collection.get(index,),)
        this._previousIndex = index - 2
        this._currentIndex = index - 1
        this._nextIndex = null
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public abstract [Symbol.iterator](): CollectionIterator<T>

    public get [Symbol.toStringTag](): CollectionIteratorName { return "CollectionIterator" }

    //#endregion -------------------- JavaScript methods --------------------

    //#endregion -------------------- Methods --------------------

}
