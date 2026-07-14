//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {NullOrNumber} from "@joookiwi/type"

import type {IteratorValueOf1On2}                                                                  from "./value/IteratorValueOf1On2"
import type {IteratorValueOf2On2}                                                                  from "./value/IteratorValueOf2On2"
import type {IndexValueCallback, ValueIndexCallback}                                               from "../type/callback"
import type {PossibleIteratorValue}                                                                from "../type/iteratorValue"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol} from "../type/symbol"

import {AbstractUnimplementedCollectionIterator} from "./AbstractUnimplementedCollectionIterator"
import {NoElementFoundInCollectionException}     from "../exception/NoElementFoundInCollectionException"
import {GenericAfterLastIteratorValue}           from "./value/GenericAfterLastIteratorValue"
import {GenericBeforeFirstIteratorValue}         from "./value/GenericBeforeFirstIteratorValue"

/**
 * A definition of a {@link CollectionIterator} of 2 values to have a common ancestor.
 * It is a specialization of the {@link AbstractCollectionIterator}
 * without the internal values required for an unknown amount of elements.
 *
 * @typeParam T  The element type
 * @typeParam T1 The first element type (`T` by default)
 * @typeParam T2 The second element type (`T` by default)
 * @see EmptyCollectionIterator
 * @see CollectionIteratorOf2
 */
export abstract class AbstractCollectionIteratorOf2<const T,
    const T1 extends T = T,
    const T2 extends T = T, >
    extends AbstractUnimplementedCollectionIterator<T> {

    //#region -------------------- Fields --------------------

    #previousIndex?: NullOrNumber<| 0 | 1>
    #currentIndex: NullOrNumber<| 0 | 1>
    #nextIndex?: NullOrNumber<| 0 | 1>

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected constructor() {
        super()
        this.#currentIndex = null
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Reference methods --------------------

    /** The first value (out of 2) of the current instance */
    public abstract get value1(): T1

    /** The second value (out of 2) of the current instance */
    public abstract get value2(): T2

    protected abstract get _valueResult1(): IteratorValueOf1On2<T1>

    protected abstract get _valueResult2(): IteratorValueOf2On2<T2>

    //#endregion -------------------- Reference methods --------------------
    //#region -------------------- Size methods --------------------

    public override get size(): 2 { return 2 }

    public override get isEmpty(): false { return false }
    public override get isNotEmpty(): true { return true }

    public override get hasExactly1Element(): false { return false }
    public override get hasAtMost1Element(): false { return false }

    public override get hasAtLeast2Elements(): true { return true }
    public override get hasExactly2Elements(): true { return true }
    public override get hasAtMost2Elements(): true { return true }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- End-point index methods --------------------

    public get firstIndex(): 0 { return 0 }

    public get lastIndex(): 1 { return 1 }

    //#endregion -------------------- End-point index methods --------------------

    //#region -------------------- Current methods --------------------

    public override get currentIndex(): NullOrNumber<| 0 | 1> { return this._currentIndex }

    /**
     * Get the index that the {@link AbstractCollectionIteratorOf2 instance} is at
     *
     * @synchronyzedWith<{@link _previousIndex}, {@link _nextIndex}>
     */
    protected get _currentIndex(): NullOrNumber<| 0 | 1> { return this.#currentIndex }

    /**
     * Set the index that the {@link AbstractCollectionIteratorOf2 instance} is at
     *
     * @param value The value to set
     */
    protected set _currentIndex(value: NullOrNumber<| 0 | 1>,) { this.#currentIndex = value }

    //#endregion -------------------- Current methods --------------------
    //#region -------------------- Next methods --------------------

    public override get hasNext(): boolean {
        if (this._isNextIndexInitialized)
            return this._nextIndex != null
        return true
    }


    public override get nextIndex(): NullOrNumber<| 0 | 1> { return this._nextIndex }

    /**
     * Get the next index that the {@link AbstractCollectionIteratorOf2 instance} should be at
     *
     * @initializedOnFirstCall
     * @synchronyzedWith<{@link _previousIndex}, {@link _currentIndex}>
     */
    protected get _nextIndex(): NullOrNumber<| 0 | 1> {
        const value = this.#nextIndex
        if (value !== undefined)
            return value
        return this.#nextIndex = 0
    }

    /**
     * Set the next index that the {@link AbstractCollectionIteratorOf2 instance} should be at
     *
     * @param value The value to set
     */
    protected set _nextIndex(value: NullOrNumber<| 0 | 1>,) { this.#nextIndex = value }

    /** Tell that the next index has been initialized to either <b>null</b> or a {@link Number} */
    protected get _isNextIndexInitialized(): boolean { return this.#nextIndex !== undefined }


    public override get nextValue(): T {
        const currentIndex = this._currentIndex
        if (currentIndex == null) {
            // The direction has not been determined yet, it will set up the CollectionIterator to be from start to end
            this._previousIndex = null
            this._currentIndex = 0
            this._nextIndex = 1
            return this.value1
        }

        if (this._nextIndex == null) // At the end of the line
            throw new NoElementFoundInCollectionException("No element found. The collection iterator is at or after the end of the line.",)

        if (this._previousIndex == null) { // At the start of the line
            this._previousIndex = 0
            this._currentIndex = 1
            this._nextIndex = null
            return this.value2
        }

        if (currentIndex === 0) {
            this._previousIndex = 0
            this._currentIndex = 1
            this._nextIndex = null
            return this.value2
        }

        // currentIndex === 1
        throw new NoElementFoundInCollectionException("No element found. The collection iterator is at the end of the line.",)
    }


    public override next(): PossibleIteratorValue<T, AfterLastValueInCollectionIteratorSymbol> {
        const currentIndex = this._currentIndex
        if (currentIndex == null) {
            // The direction has not been determined yet, it will set up the CollectionIterator to be from start to end
            this._previousIndex = null
            this._currentIndex = 0
            this._nextIndex = 1
            return this._valueResult1
        }

        if (this._nextIndex == null) // At the end of the line
            return GenericAfterLastIteratorValue.get

        if (this._previousIndex == null) { // At the start of the line
            this._previousIndex = 0
            this._currentIndex = 1
            this._nextIndex = null
            return this._valueResult2
        }

        if (currentIndex === 0) {
            this._previousIndex = 0
            this._currentIndex = 1
            this._nextIndex = null
            return this._valueResult2
        }

        // currentIndex === 1
        return GenericAfterLastIteratorValue.get
    }

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    public override get hasPrevious(): boolean {
        if (this._isPreviousIndexInitialized)
            return this._previousIndex != null
        return true
    }


    public override get previousIndex(): NullOrNumber<| 0 | 1> { return this._previousIndex }

    /**
     * Get the previous index that the {@link AbstractCollectionIteratorOf2 instance} should be at
     *
     * @initializedOnFirstCall
     * @synchronyzedWith<{@link _currentIndex}, {@link _nextIndex}>
     */
    protected get _previousIndex(): NullOrNumber<| 0 | 1> {
        const value = this.#previousIndex
        if (value !== undefined)
            return value
        return this.#previousIndex = 1
    }

    /**
     * Set the previous index that the {@link AbstractCollectionIteratorOf2 instance} should be at
     *
     * @param value The value to set
     */
    protected set _previousIndex(value: NullOrNumber<| 0 | 1>,) { this.#previousIndex = value }

    /** Tell that the previous index has been initialized to either <b>null</b> or a {@link Number} */
    protected get _isPreviousIndexInitialized(): boolean { return this.#previousIndex !== undefined }


    public override get previousValue(): T {
        const currentIndex = this._currentIndex
        if (currentIndex == null) {
            // The direction has not been determined yet, it will set up the CollectionIterator to be from end to start
            this._previousIndex = 0
            this._currentIndex = 1
            this._nextIndex = null
            return this.value2
        }

        if (this._previousIndex == null) // At the start of the line
            throw new NoElementFoundInCollectionException("No element found. The collection iterator is at or before the start of the line.",)

        if (this._nextIndex == null) { // At the end of the line
            this._previousIndex = null
            this._currentIndex = 0
            this._nextIndex = 1
            return this.value1
        }

        if (currentIndex === 1) { // At the 2nd index
            this._previousIndex = null
            this._currentIndex = 0
            this._nextIndex = 1
            return this.value1
        }

        // currentIndex === 0
        throw new NoElementFoundInCollectionException("No element found. The collection iterator is at the start of the line.",)
    }


    public override previous(): PossibleIteratorValue<T, BeforeFirstValueInCollectionIteratorSymbol> {
        const currentIndex = this._currentIndex
        if (currentIndex == null) {
            // The direction has not been determined yet, it will set up the CollectionIterator to be from end to start
            this._previousIndex = 0
            this._currentIndex = 1
            this._nextIndex = null
            return this._valueResult2
        }

        if (this._previousIndex == null) // At the start of the line
            return GenericBeforeFirstIteratorValue.get

        if (this._nextIndex == null) { // At the end of the line
            this._previousIndex = null
            this._currentIndex = 0
            this._nextIndex = 1
            return this._valueResult1
        }

        if (currentIndex === 1) { // At the 2nd index
            this._previousIndex = null
            this._currentIndex = 0
            this._nextIndex = 1
            return this._valueResult1
        }

        // currentIndex === 0
        return GenericBeforeFirstIteratorValue.get
    }

    //#endregion -------------------- Previous methods --------------------
    //#region -------------------- Reset methods --------------------

    public override reset(): void {
        this._previousIndex = null
        this._currentIndex = null
        this._nextIndex = null
    }

    //#endregion -------------------- Reset methods --------------------

    //#region -------------------- Loop methods --------------------

    public override forEach(operation: ValueIndexCallback<T>,): this {
        const currentIndex = this._currentIndex
        if (currentIndex != null)
            return this

        operation(this.value1, 0,)
        operation(this.value2, 1,)
        this._previousIndex = 0
        this._currentIndex = 1
        this._nextIndex = null
        return this
    }

    public override forEachIndexed(operation: IndexValueCallback<T>,): this {
        const currentIndex = this._currentIndex
        if (currentIndex != null)
            return this

        operation(0, this.value1,)
        operation(1, this.value2,)
        this._previousIndex = 0
        this._currentIndex = 1
        this._nextIndex = null
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public abstract override [Symbol.iterator](): AbstractCollectionIteratorOf2<T, T1, T2>

    //#endregion -------------------- JavaScript methods --------------------

    //#endregion -------------------- Methods --------------------

}
