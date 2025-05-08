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

import type {EmptyCollectionHolder}                                                                from "../EmptyCollectionHolder"
import type {CollectionIterator}                                                                   from "./CollectionIterator"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol} from "../type/symbol"
import type {CollectionIteratorName}                                                               from "../type/toStringTag"

import {CollectionConstants}                 from "../CollectionConstants"
import {NoElementFoundInCollectionException} from "../exception/NoElementFoundInCollectionException"
import {GenericAfterLastIteratorValue}       from "./value/GenericAfterLastIteratorValue"
import {GenericBeforeFirstIteratorValue}     from "./value/GenericBeforeFirstIteratorValue"

export class EmptyCollectionIterator
    implements CollectionIterator<never> {

    //#region -------------------- Singleton usage --------------------

    static #instance?: EmptyCollectionIterator

    protected constructor() {}

    public static get get(): EmptyCollectionIterator { return EmptyCollectionIterator.#instance ??= new EmptyCollectionIterator() }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Reference methods --------------------

    public get collection(): EmptyCollectionHolder { return CollectionConstants.EMPTY_COLLECTION_HOLDER }

    //#endregion -------------------- Reference methods --------------------
    //#region -------------------- Size methods --------------------

    public get size(): 0 { return 0 }
    public get length(): 0 { return 0 }
    public get count(): 0 { return 0 }

    public get isEmpty(): true { return true }
    public get isNotEmpty(): false { return false }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- End-point index methods --------------------

    public get firstIndex(): null { return null }

    public get lastIndex(): null { return null }

    //#endregion -------------------- End-point index methods --------------------

    //#region -------------------- Current methods --------------------

    public get index(): null { return null }
    public get currentIndex(): null { return null }

    //#endregion -------------------- Current methods --------------------
    //#region -------------------- Next methods --------------------

    public get hasNext(): false { return false }

    public get nextIndex(): null { return null }
    public get nextValue(): never { throw new NoElementFoundInCollectionException("An empty collection iterator has no value to retrieve",) }

    public next(... _: readonly unknown[]): IteratorReturnResult<AfterLastValueInCollectionIteratorSymbol>
    public next() { return GenericAfterLastIteratorValue.get }

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    public get hasPrevious(): false { return false }

    public get previousIndex(): null { return null }
    public get previousValue(): never { throw new NoElementFoundInCollectionException("An empty collection iterator has no value to retrieve",) }

    public previous(... _: readonly unknown[]): IteratorReturnResult<BeforeFirstValueInCollectionIteratorSymbol>
    public previous() { return GenericBeforeFirstIteratorValue.get }

    //#endregion -------------------- Previous methods --------------------
    //#region -------------------- Reset methods --------------------

    public reset(... _: readonly unknown[]): void
    public reset() {}

    //#endregion -------------------- Reset methods --------------------

    //#region -------------------- Loop methods --------------------

    public forEach(... _: readonly unknown[]): this
    public forEach() { return this }

    public forEachIndexed(... _: readonly unknown[]): this
    public forEachIndexed() { return this }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public [Symbol.iterator](): this { return this }

    public get [Symbol.toStringTag](): CollectionIteratorName { return "CollectionIterator" }

    //#endregion -------------------- JavaScript methods --------------------

    //#endregion -------------------- Methods --------------------

}
