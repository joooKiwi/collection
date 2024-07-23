/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullOrNumber, NullOrZeroNumber} from "@joookiwi/type"

import type {IndexValueCallback, ValueIndexCallback}                                                                       from "../CollectionHolder.types"
import type {MinimalistCollectionHolder}                                                                                   from "../MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                           from "./CollectionIterator"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol, CollectionIteratorName} from "./CollectionIterator.types"

import {NoElementFoundInCollectionHolderException} from "../exception/NoElementFoundInCollectionHolderException"
import {GenericAfterLastIteratorValue}             from "./value/GenericAfterLastIteratorValue"
import {GenericBeforeFirstIteratorValue}           from "./value/GenericBeforeFirstIteratorValue"
import {GenericIteratorValue}                      from "./value/GenericIteratorValue"

export class GenericCollectionIterator<const T = unknown,
    const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >
    implements CollectionIterator<T> {

    //#region -------------------- Fields --------------------

    readonly #collection: COLLECTION
    #size?: COLLECTION["size"]
    #sizeMinus1?: number
    #sizeMinus2?: number
    #isEmpty?: boolean
    #isNotEmpty?: boolean
    #hasOnly1Element?: boolean
    #hasOnly2Elements?: boolean

    #previousIndex?: NullOrNumber
    #currentIndex: NullOrNumber
    #nextIndex?: NullOrNumber

    #firstIndex?: NullOrZeroNumber
    #lastIndex?: NullOrNumber

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION,) {
        this.#collection = collection
        this.#currentIndex = null
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter & setter methods --------------------

    public get collection(): COLLECTION { return this.#collection }

    //#region -------------------- Size methods --------------------

    public get size(): COLLECTION["size"] { return this.#size ??= this.collection.size }
    public get length(): this["size"] { return this.size }
    public get count(): this["size"] { return this.size }

    /**
     * The {@link size} minus 1
     *
     * @initializedOnFirstCall
     */
    protected get _sizeMinus1(): number { return this.#sizeMinus1 ??= this.size - 1 }

    /**
     * The {@link size} minus 2
     *
     * @initializedOnFirstCall
     */
    protected get _sizeMinus2(): number { return this.#sizeMinus2 ??= this.size - 2 }

    /**
     * Tell if the {@link collection} is empty by <code>{@link CollectionHolder.size size} == 0</code>
     *
     * @initializedOnFirstCall
     */
    protected get _isEmpty(): boolean { return this.#isEmpty ??= this.size == 0 }

    /**
     * Tell if the {@link collection} is not empty by <code>{@link CollectionHolder.size size} != 0</code>
     *
     * @initializedOnFirstCall
     */
    protected get _isNotEmpty(): boolean { return this.#isNotEmpty ??= !this._isEmpty }

    /**
     * Tell that the {@link size} is only of <b>1</b>
     *
     * @initializedOnFirstCall
     */
    protected get _hasOnly1Element(): boolean { return this.#hasOnly1Element ??= this.size == 1 }

    /**
     * Tell that the {@link size} is only of <b>2</b>
     *
     * @initializedOnFirstCall
     */
    protected get _hasOnly2Elements(): boolean { return this.#hasOnly2Elements ??= this.size == 2 }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Current index methods --------------------

    public get currentIndex(): NullOrNumber { return this._currentIndex }

    /**
     * Get the index that the {@link GenericCollectionIterator} is at
     *
     * @synchronyzedWith<{@link _previousIndex}, {@link _nextIndex}>
     */
    protected get _currentIndex(): NullOrNumber { return this.#currentIndex }

    /**
     * Set the index that the {@link GenericCollectionIterator} is at
     *
     * @param value The value to set
     */
    protected set _currentIndex(value: NullOrNumber,) { this.#currentIndex = value }


    public get index(): NullOrNumber { return this.currentIndex }

    //#endregion -------------------- Current index methods --------------------
    //#region -------------------- End-point index methods --------------------

    /**
     * Get the first index of the {@link collection}.
     * If it is <b>null</b>, then it is empty, otherwise, it should be <b>0</b>.
     *
     * @initializedOnFirstCall
     */
    protected get _firstIndex(): NullOrZeroNumber {
        const value = this.#firstIndex
        if (value !== undefined)
            return value

        if (this._isEmpty)
            return this.#firstIndex = null
        return this.#firstIndex = 0
    }

    /** Tell that the {@link _firstIndex} has yet to be retrieved */
    protected get _isFirstIndexInitialized(): boolean { return this.#firstIndex !== undefined }

    /**
     * Get the last index of the {@link collection}.
     * If it is <b>null</b>, then it is empty, otherwise, it should be <code>size - 1</code>.
     *
     * @initializedOnFirstCall
     */
    protected get _lastIndex(): NullOrNumber {
        const value = this.#lastIndex
        if (value !== undefined)
            return value

        if (this._isEmpty)
            return this.#lastIndex = null
        return this.#lastIndex ??= this.size - 1
    }

    /** Tell that the {@link _lastIndex} has yet to be retrieved */
    protected get _isLastIndexInitialized(): boolean { return this.#lastIndex !== undefined }

    //#endregion -------------------- End-point index methods --------------------
    //#region -------------------- Next methods --------------------

    public get nextIndex(): NullOrNumber { return this._nextIndex }

    /**
     * Get the next index that the {@link GenericCollectionIterator} should be at
     *
     * @initializedOnFirstCall
     * @synchronyzedWith<{@link _previousIndex}, {@link _currentIndex}>
     */
    protected get _nextIndex(): NullOrNumber {
        const value = this.#nextIndex
        if (value !== undefined)
            return value
        return this.#nextIndex = this._firstIndex
    }

    /**
     * Set the next index that the {@link GenericCollectionIterator} should be at
     *
     * @param value The value to set
     */
    protected set _nextIndex(value: NullOrNumber,) { this.#nextIndex = value }

    /** Tell that the next index has been initialized to either <b>null</b> or a {@link Number} */
    protected get _isNextIndexInitialized(): boolean { return this.#nextIndex !== undefined }

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    public get previousIndex(): NullOrNumber { return this._previousIndex }

    /**
     * Get the previous index that the {@link GenericCollectionIterator} should be at
     *
     * @initializedOnFirstCall
     * @synchronyzedWith<{@link _currentIndex}, {@link _nextIndex}>
     */
    protected get _previousIndex(): NullOrNumber {
        const value = this.#previousIndex
        if (value !== undefined)
            return value
        return this.#previousIndex = this._lastIndex
    }

    /**
     * Set the previous index that the {@link GenericCollectionIterator} should be at
     *
     * @param value The value to set
     */
    protected set _previousIndex(value: NullOrNumber,) { this.#previousIndex = value }

    /** Tell that the previous index has been initialized to either <b>null</b> or a {@link Number} */
    protected get _isPreviousIndexInitialized(): boolean { return this.#previousIndex !== undefined }

    //#endregion -------------------- Previous methods --------------------

    //#endregion -------------------- Getter & setter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Next methods --------------------

    public get hasNext(): boolean {
        if (this._isEmpty)
            return false

        if (this._isNextIndexInitialized)
            return this._nextIndex != null

        const currentIndex = this._currentIndex
        if (currentIndex == null)
            return true
        return currentIndex < this.size
    }

    public next(): IteratorResult<T, AfterLastValueInCollectionIteratorSymbol> {
        if (this._isEmpty)
            return GenericAfterLastIteratorValue.get

        const currentIndex = this._currentIndex
        if (currentIndex == null) {
            // The direction has not been determined yet, it will set up the CollectionIterator to be from start to end
            if (this._hasOnly1Element) {
                this._previousIndex = null
                this._nextIndex = null
                return new GenericIteratorValue<T, COLLECTION, 0>(this.collection, this._currentIndex = 0,)
            }

            this._previousIndex = null
            this._nextIndex = 1
            return new GenericIteratorValue<T, COLLECTION, 0>(this.collection, this._currentIndex = 0,)
        }

        if (this._hasOnly1Element)
            return GenericAfterLastIteratorValue.get

        if (this._nextIndex == null) // At the end of the line
            return GenericAfterLastIteratorValue.get

        if (this._previousIndex == null) { // At the start of the line
            if (this._hasOnly2Elements) {
                this._previousIndex = 0
                this._nextIndex = null
                return new GenericIteratorValue<T, COLLECTION, 1>(this.collection, this._currentIndex = 1,)
            }

            this._previousIndex = 0
            this._nextIndex = 2
            return new GenericIteratorValue<T, COLLECTION, 1>(this.collection, this._currentIndex = 1,)
        }

        if (currentIndex == this._sizeMinus2) { // At the end of the line (but no internal value set)
            this._previousIndex = currentIndex
            this._nextIndex = null
            this._currentIndex = currentIndex + 1
            return new GenericIteratorValue<T, COLLECTION>(this.collection, this._currentIndex = currentIndex + 1,)
        }

        // Somewhere in the line
        this._previousIndex = currentIndex
        this._nextIndex = currentIndex + 2
        return new GenericIteratorValue<T, COLLECTION>(this.collection, this._currentIndex = currentIndex + 1,)
    }

    public get nextValue(): T {
        if (this._isEmpty)
            throw new NoElementFoundInCollectionHolderException("The collection iterator is at or after the end of the line.",)

        const currentIndex = this._currentIndex
        if (currentIndex == null) {
            // The direction has not been determined yet, it will set up the CollectionIterator to be from start to end
            if (this._hasOnly1Element) {
                this._previousIndex = null
                this._nextIndex = null
                return this.collection.get(this._currentIndex = 0,)
            }

            this._previousIndex = null
            this._nextIndex = 1
            return this.collection.get(this._currentIndex = 0,)
        }

        if (this._hasOnly1Element)
            throw new NoElementFoundInCollectionHolderException("The collection iterator is at or after the end of the line.",)

        if (this._nextIndex == null) // At the end of the line
            throw new NoElementFoundInCollectionHolderException("The collection iterator is at or after the end of the line.",)

        if (this._previousIndex == null) { // At the start of the line
            if (this._hasOnly2Elements) {
                this._previousIndex = 0
                this._nextIndex = null
                return this.collection.get(this._currentIndex = 1,)
            }

            this._previousIndex = 0
            this._nextIndex = 2
            return this.collection.get(this._currentIndex = 1,)
        }

        if (currentIndex == this._sizeMinus2) { // At the end of the line (but no internal value set)
            this._previousIndex = currentIndex
            this._nextIndex = null
            return this.collection.get(this._currentIndex = currentIndex + 1,)
        }

        // Somewhere in the line
        this._previousIndex = currentIndex
        this._nextIndex = currentIndex + 2
        return this.collection.get(this._currentIndex = currentIndex + 1,)
    }

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    public get hasPrevious(): boolean {
        if (this._isEmpty)
            return false

        if (this._isPreviousIndexInitialized)
            return this._previousIndex != null

        const currentIndex = this._currentIndex
        if (currentIndex == null)
            return true
        return currentIndex > 0
    }

    public previous(): IteratorResult<T, BeforeFirstValueInCollectionIteratorSymbol> {
        if (this._isEmpty)
            return GenericBeforeFirstIteratorValue.get

        const currentIndex = this._currentIndex
        if (currentIndex == null) {
            // The direction has not been determined yet, it will set up the CollectionIterator to be from end to start
            if (this._hasOnly1Element) {
                this._previousIndex = null
                this._nextIndex = null
                return new GenericIteratorValue<T, COLLECTION, 0>(this.collection, this._currentIndex = 0,)
            }

            this._previousIndex = this._sizeMinus2
            this._nextIndex = null
            return new GenericIteratorValue<T, COLLECTION>(this.collection, this._currentIndex = this._sizeMinus1,)
        }

        if (this._hasOnly1Element)
            return GenericBeforeFirstIteratorValue.get

        if (this._previousIndex == null) // At the start of the line
            return GenericBeforeFirstIteratorValue.get

        if (this._nextIndex == null) { // At the end of the line
            if (this._hasOnly2Elements) {
                this._previousIndex = null
                this._nextIndex = 1
                return new GenericIteratorValue<T, COLLECTION, 0>(this.collection, this._currentIndex = 0,)
            }

            this._previousIndex = currentIndex - 2
            this._nextIndex = currentIndex
            return new GenericIteratorValue<T, COLLECTION>(this.collection, this._currentIndex = currentIndex - 1,)
        }

        if (currentIndex == 1) { // At the 2nd index
            this._previousIndex = null
            this._nextIndex = 1
            return new GenericIteratorValue<T, COLLECTION, 0>(this.collection, this._currentIndex = 0,)
        }

        // Somewhere in the line
        this._previousIndex = currentIndex - 2
        this._nextIndex = currentIndex
        return new GenericIteratorValue<T, COLLECTION>(this.collection, this._currentIndex = currentIndex - 1,)
    }

    public get previousValue(): T {
        if (this._isEmpty)
            throw new NoElementFoundInCollectionHolderException("The collection iterator is at or before the start of the line.",)

        const currentIndex = this._currentIndex
        if (currentIndex == null) {
            // The direction has not been determined yet, it will set up the CollectionIterator to be from end to start
            if (this._hasOnly1Element) {
                this._previousIndex = null
                this._nextIndex = null
                return this.collection.get(this._currentIndex = 0,)
            }

            this._previousIndex = this._sizeMinus2
            this._nextIndex = null
            return this.collection.get(this._currentIndex = this._sizeMinus1,)
        }

        if (this._hasOnly1Element)
            throw new NoElementFoundInCollectionHolderException("The collection iterator is at or before the start of the line.",)

        if (this._previousIndex == null) // At the start of the line
            throw new NoElementFoundInCollectionHolderException("The collection iterator is at or before the start of the line.",)

        if (this._nextIndex == null) { // At the end of the line
            if (this._hasOnly2Elements) {
                this._previousIndex = null
                this._nextIndex = 1
                return this.collection.get(this._currentIndex = 0,)
            }

            this._previousIndex = currentIndex - 2
            this._nextIndex = currentIndex
            return this.collection.get(this._currentIndex = currentIndex - 1,)
        }

        if (currentIndex == 1) { // At the 2nd index
            this._previousIndex = null
            this._nextIndex = 1
            return this.collection.get(this._currentIndex = 0,)
        }

        // Somewhere in the line
        this._previousIndex = currentIndex - 2
        this._nextIndex = currentIndex
        return this.collection.get(this._currentIndex = currentIndex - 1,)
    }

    //#endregion -------------------- Previous methods --------------------

    public reset(): this {
        this._previousIndex = this._currentIndex = this._nextIndex = null
        return this
    }

    //#region -------------------- Loop methods --------------------

    public forEach(operation: ValueIndexCallback<T>,): this {
        if (this._isEmpty)
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
        if (this._isEmpty)
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
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): CollectionIterator<T> { return new GenericCollectionIterator(this.collection,) }

    public get [Symbol.toStringTag](): CollectionIteratorName { return "CollectionIterator" }

    //#endregion -------------------- Javascript methods --------------------

    //#endregion -------------------- Methods --------------------

}
