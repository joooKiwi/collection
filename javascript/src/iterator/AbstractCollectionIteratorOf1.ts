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

import type {NullOrZeroNumber} from "@joookiwi/type"

import type {IteratorValueOf1}                                                                     from "./value/IteratorValueOf1"
import type {IndexValueCallback, ValueIndexCallback}                                               from "../type/callback"
import type {PossibleIteratorValue}                                                                from "../type/iteratorValue"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol} from "../type/symbol"

import {AbstractUnimplementedCollectionIterator} from "./AbstractUnimplementedCollectionIterator"
import {NoElementFoundInCollectionException}     from "../exception/NoElementFoundInCollectionException"
import {GenericAfterLastIteratorValue}           from "./value/GenericAfterLastIteratorValue"
import {GenericBeforeFirstIteratorValue}         from "./value/GenericBeforeFirstIteratorValue"

/**
 * A definition of a {@link CollectionIterator} of 1 value to have a common ancestor.
 * It is a specialization of the {@link AbstractCollectionIterator}
 * without the internal values required for an unknown amount of elements.
 *
 * @typeParam T The element type
 * @see EmptyCollectionIterator
 * @see CollectionIteratorOf1
 */
export abstract class AbstractCollectionIteratorOf1<const T, >
    extends AbstractUnimplementedCollectionIterator<T> {

    //#region -------------------- Fields --------------------

    #isAtTheCurrentValue: boolean = false

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected constructor() { super() }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Reference methods --------------------

    /** The only value of the current instance */
    public abstract get value(): T

    protected abstract get _valueResult(): IteratorValueOf1<T>

    //#endregion -------------------- Reference methods --------------------
    //#region -------------------- Size methods --------------------

    public override get size(): 1 { return 1 }

    public override get isEmpty(): false { return false }
    public override get isNotEmpty(): true { return true }

    public override get hasExactly1Element(): true { return true }
    public override get hasAtMost1Element(): true { return true }

    public override get hasAtLeast2Elements(): false { return false }
    public override get hasExactly2Elements(): false { return false }
    public override get hasAtMost2Elements(): true { return true }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- End-point index methods --------------------

    public override get firstIndex(): 0 { return 0 }

    public override get lastIndex(): 0 { return 0 }

    //#endregion -------------------- End-point index methods --------------------

    //#region -------------------- Current methods --------------------

    public override get currentIndex(): NullOrZeroNumber {
        if (this.#isAtTheCurrentValue)
            return 0
        return null
    }

    //#endregion -------------------- Current methods --------------------
    //#region -------------------- Next methods --------------------

    public override get hasNext(): boolean { return !this.#isAtTheCurrentValue }

    public override get nextIndex(): NullOrZeroNumber {
        if (this.#isAtTheCurrentValue)
            return null

        this.#isAtTheCurrentValue = true
        return 0
    }

    public override get nextValue(): T {
        if (this.#isAtTheCurrentValue)
            throw new NoElementFoundInCollectionException("No element found. The collection iterator is at or after the end of the line.",)

        this.#isAtTheCurrentValue = true
        return this.value
    }

    public override next(): PossibleIteratorValue<T, AfterLastValueInCollectionIteratorSymbol> {
        if (this.#isAtTheCurrentValue)
            return GenericAfterLastIteratorValue.get

        this.#isAtTheCurrentValue = true
        return this._valueResult
    }

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    public override get hasPrevious(): boolean { return !this.#isAtTheCurrentValue }

    public override get previousIndex(): NullOrZeroNumber {
        if (this.#isAtTheCurrentValue)
            return null

        this.#isAtTheCurrentValue = true
        return 0
    }

    public override get previousValue(): T {
        if (this.#isAtTheCurrentValue)
            throw new NoElementFoundInCollectionException("No element found. The collection iterator is at or before the start of the line.",)

        this.#isAtTheCurrentValue = true
        return this.value
    }

    public override previous(): PossibleIteratorValue<T, BeforeFirstValueInCollectionIteratorSymbol> {
        if (this.#isAtTheCurrentValue)
            return GenericBeforeFirstIteratorValue.get

        this.#isAtTheCurrentValue = true
        return this._valueResult
    }

    //#endregion -------------------- Previous methods --------------------
    //#region -------------------- Reset methods --------------------

    public override reset(): void {
        this.#isAtTheCurrentValue = false
    }

    //#endregion -------------------- Reset methods --------------------

    //#region -------------------- Loop methods --------------------

    public override forEach(operation: ValueIndexCallback<T>,): this {
        if (this.#isAtTheCurrentValue)
            return this

        operation(this.value, 0,)
        this.#isAtTheCurrentValue = true
        return this
    }

    public override forEachIndexed(operation: IndexValueCallback<T>,): this {
        if (this.#isAtTheCurrentValue)
            return this

        operation(0, this.value,)
        this.#isAtTheCurrentValue = true
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public abstract override [Symbol.iterator](): AbstractCollectionIteratorOf1<T>

    //#endregion -------------------- JavaScript methods --------------------

    //#endregion -------------------- Methods --------------------

}
