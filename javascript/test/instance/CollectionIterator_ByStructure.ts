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
import type {CollectionIteratorName}                                                               from "../../src/type/toStringTag"

import {CollectionIteratorFromArray} from "./CollectionIteratorFromArray"

/**
 * A {@link CollectionIterator} having the structure of it,
 * but without inheriting the {@link AbstractCollectionIterator}.
 *
 * Internally, it is using a {@link CollectionIteratorFromArray} for every method
 */
export class CollectionIterator_ByStructure<const T, >
    implements CollectionIterator<T> {

    public readonly reference

    public constructor(array: Array<T>,) { this.reference = new CollectionIteratorFromArray(array,) }

    //#region -------------------- Size methods --------------------

    public get size(): this["reference"]["size"] { return this.reference.size }
    public get length(): this["size"] { return this.reference.length }
    public get count(): this["size"] { return this.reference.count }

    public get isEmpty(): boolean { return this.reference.isEmpty }
    public get isNotEmpty(): boolean { return this.reference.isNotEmpty }

    public get hasAtLeast1Element(): this["isNotEmpty"] { return this.reference.hasAtLeast1Element }
    public get containsAtLeast1Element(): this["isNotEmpty"] { return this.reference.containsAtLeast1Element }
    public get includesAtLeast1Element(): this["isNotEmpty"] { return this.reference.includesAtLeast1Element }

    public get hasExactly1Element(): boolean { return this.reference.hasExactly1Element }
    public get containsExactly1Element(): this["hasExactly1Element"] { return this.reference.containsExactly1Element }
    public get includesExactly1Element(): this["hasExactly1Element"] { return this.reference.includesExactly1Element }

    public get hasAtMost1Element(): boolean { return this.reference.hasAtMost1Element }
    public get containsAtMost1Element(): this["hasAtMost1Element"] { return this.reference.containsAtMost1Element }
    public get includesAtMost1Element(): this["hasAtMost1Element"] { return this.reference.includesAtMost1Element }

    public get hasAtLeast2Elements(): boolean { return this.reference.hasAtLeast2Elements }
    public get containsAtLeast2Elements(): this["hasAtLeast2Elements"] { return this.reference.containsAtLeast2Elements }
    public get includesAtLeast2Elements(): this["hasAtLeast2Elements"] { return this.reference.includesAtLeast2Elements }

    public get hasExactly2Elements(): boolean { return this.reference.hasExactly2Elements }
    public get containsExactly2Elements(): this["hasExactly2Elements"] { return this.reference.containsExactly2Elements }
    public get includesExactly2Elements(): this["hasExactly2Elements"] { return this.reference.includesExactly2Elements }

    public get hasAtMost2Elements(): boolean { return this.reference.hasAtMost2Elements }
    public get containsAtMost2Elements(): this["hasAtMost2Elements"] { return this.reference.containsAtMost2Elements }
    public get includesAtMost2Elements(): this["hasAtMost2Elements"] { return this.reference.includesAtMost2Elements }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- End-point index methods --------------------

    get firstIndex(): NullOrZeroNumber { return this.reference.firstIndex }
    get lastIndex(): NullOrNumber { return this.reference.lastIndex }

    //#endregion -------------------- End-point index methods --------------------

    //#region -------------------- Current methods --------------------

    public get currentIndex(): NullOrNumber { return this.reference.currentIndex }
    public get index(): this["currentIndex"] { return this.reference.index }

    //#endregion -------------------- Current methods --------------------
    //#region -------------------- Next methods --------------------

    public get hasNext(): boolean { return this.reference.hasNext }
    public get nextIndex(): NullOrNumber { return this.reference.nextIndex }
    public get nextValue(): T { return this.reference.nextValue }

    public next(): PossibleIteratorValue<T, AfterLastValueInCollectionIteratorSymbol> { return this.reference.next() }

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    public get hasPrevious(): boolean { return this.reference.hasPrevious }
    public get previousValue(): T { return this.reference.previousValue }
    public get previousIndex(): NullOrNumber { return this.reference.previousIndex }

    public previous(): PossibleIteratorValue<T, BeforeFirstValueInCollectionIteratorSymbol> { return this.reference.previous() }

    //#endregion -------------------- Previous methods --------------------
    //#region -------------------- Reset methods --------------------

    public reset(): this {
        this.reference.reset()
        return this
    }

    //#endregion -------------------- Reset methods --------------------

    //#region -------------------- Loop methods --------------------

    public forEach(operation: ValueIndexCallback<T>,): this {
        this.reference.forEach(operation,)
        return this
    }

    public forEachIndexed(operation: IndexValueCallback<T>,): this {
        this.reference.forEachIndexed(operation,)
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public [Symbol.iterator](): CollectionIterator<T> { return this.reference[Symbol.iterator]() }

    public get [Symbol.toStringTag](): CollectionIteratorName { return this.reference[Symbol.toStringTag] }

    //#endregion -------------------- JavaScript methods --------------------

}
