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

import type {Array, NullOrNumber, NullOrZeroNumber} from "@joookiwi/type"

import type {CollectionIterator}                                                                   from "../../src/iterator/CollectionIterator"
import type {IndexValueCallback, ValueIndexCallback}                                               from "../../src/type/callback"
import type {PossibleIteratorValue}                                                                from "../../src/type/iteratorValue"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol} from "../../src/type/symbol"

import {AbstractUnimplementedCollectionIteratorForTest} from "./AbstractUnimplementedCollectionIteratorForTest"
import {CollectionIteratorFromArray}                    from "./CollectionIteratorFromArray"

/**
 * A {@link CollectionIterator} having the structure of it,
 * but without inheriting the {@link AbstractCollectionIterator}.
 *
 * Internally, it is using a {@link CollectionIteratorFromArray} for every method.
 *
 * @typeParam T The type (**mandatory**)
 */
export class CollectionIterator_ByStructure<const T, >
    extends AbstractUnimplementedCollectionIteratorForTest<T> {

    public readonly reference

    public constructor(/** The array received in the constructor */ public readonly array: Array<T>,) {
        super()
        this.reference = new CollectionIteratorFromArray(array,)
    }

    //#region -------------------- Size methods --------------------

    public override get size(): this["reference"]["size"] { return this.reference.size }

    public override get isEmpty(): boolean { return this.reference.isEmpty }
    public override get isNotEmpty(): boolean { return this.reference.isNotEmpty }

    public override get hasExactly1Element(): boolean { return this.reference.hasExactly1Element }
    public override get hasAtMost1Element(): boolean { return this.reference.hasAtMost1Element }

    public override get hasAtLeast2Elements(): boolean { return this.reference.hasAtLeast2Elements }
    public override get hasExactly2Elements(): boolean { return this.reference.hasExactly2Elements }
    public override get hasAtMost2Elements(): boolean { return this.reference.hasAtMost2Elements }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- End-point index methods --------------------

    public override get firstIndex(): NullOrZeroNumber { return this.reference.firstIndex }
    public override get lastIndex(): NullOrNumber { return this.reference.lastIndex }

    //#endregion -------------------- End-point index methods --------------------

    //#region -------------------- Current methods --------------------

    public override get currentIndex(): NullOrNumber { return this.reference.currentIndex }

    //#endregion -------------------- Current methods --------------------
    //#region -------------------- Next methods --------------------

    public override get hasNext(): boolean { return this.reference.hasNext }
    public override get nextIndex(): NullOrNumber { return this.reference.nextIndex }
    public override get nextValue(): T { return this.reference.nextValue }

    public override next(): PossibleIteratorValue<T, AfterLastValueInCollectionIteratorSymbol> { return this.reference.next() }

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    public override get hasPrevious(): boolean { return this.reference.hasPrevious }
    public override get previousValue(): T { return this.reference.previousValue }
    public override get previousIndex(): NullOrNumber { return this.reference.previousIndex }

    public override previous(): PossibleIteratorValue<T, BeforeFirstValueInCollectionIteratorSymbol> { return this.reference.previous() }

    //#endregion -------------------- Previous methods --------------------
    //#region -------------------- Reset methods --------------------

    public override reset(): this {
        this.reference.reset()
        return this
    }

    //#endregion -------------------- Reset methods --------------------

    //#region -------------------- Loop methods --------------------

    public override forEach(operation: ValueIndexCallback<T>,): this {
        this.reference.forEach(operation,)
        return this
    }

    public override forEachIndexed(operation: IndexValueCallback<T>,): this {
        this.reference.forEachIndexed(operation,)
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public override [Symbol.iterator](): CollectionIterator<T> { return this.reference[Symbol.iterator]() }

    //#endregion -------------------- JavaScript methods --------------------

}
