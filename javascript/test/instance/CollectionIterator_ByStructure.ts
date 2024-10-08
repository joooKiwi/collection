/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullOrNumber, NullOrZeroNumber} from "@joookiwi/type"

import type {IndexValueCallback, ValueIndexCallback}                                                                       from "../../src/CollectionHolder.types"
import type {MinimalistCollectionHolder}                                                                                   from "../../src/MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                           from "../../src/iterator/CollectionIterator"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol, CollectionIteratorName} from "../../src/iterator/CollectionIterator.types"

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

    public constructor(array: readonly T[],) { this.reference = new CollectionIteratorFromArray(array,) }

    //#region -------------------- Reference methods --------------------

    public get collection(): MinimalistCollectionHolder<T> { return this.reference.collection }

    //#endregion -------------------- Reference methods --------------------
    //#region -------------------- Size methods --------------------

    public get size(): this["collection"]["size"] { return this.reference.size }
    public get length(): this["size"] { return this.reference.length }
    public get count(): this["size"] { return this.reference.count }

    public get isEmpty(): boolean { return this.reference.isEmpty }
    public get isNotEmpty(): boolean { return this.reference.isNotEmpty }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- End-point index methods --------------------

    get firstIndex(): NullOrZeroNumber { return this.reference.firstIndex }
    get lastIndex(): NullOrNumber { return this.reference.lastIndex }

    //#endregion -------------------- End-point index methods --------------------

    //#region -------------------- Current methods --------------------

    public get currentIndex(): NullOrNumber { return this.reference.currentIndex }
    public get index(): NullOrNumber { return this.reference.index }

    //#endregion -------------------- Current methods --------------------
    //#region -------------------- Next methods --------------------

    public get hasNext(): boolean { return this.reference.hasNext }
    public get nextIndex(): NullOrNumber { return this.reference.nextIndex }
    public get nextValue(): T { return this.reference.nextValue }

    public next(): IteratorResult<T, AfterLastValueInCollectionIteratorSymbol> { return this.reference.next() }

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    public get hasPrevious(): boolean { return this.reference.hasPrevious }
    public get previousValue(): T { return this.reference.previousValue }
    public get previousIndex(): NullOrNumber { return this.reference.previousIndex }

    public previous(): IteratorResult<T, BeforeFirstValueInCollectionIteratorSymbol> { return this.reference.previous() }

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
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): CollectionIterator<T> { return this.reference[Symbol.iterator]() }

    public get [Symbol.toStringTag](): CollectionIteratorName { return this.reference[Symbol.toStringTag] }

    //#endregion -------------------- Javascript methods --------------------

}
