/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {EmptyCollectionHolder}                                                                                        from "../EmptyCollectionHolder"
import type {CollectionIterator}                                                                                           from "./CollectionIterator"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol, CollectionIteratorName} from "./CollectionIterator.types"

import {CollectionConstants}                       from "../CollectionConstants"
import {NoElementFoundInCollectionHolderException} from "../exception/NoElementFoundInCollectionHolderException"
import {GenericAfterLastIteratorValue}             from "./value/GenericAfterLastIteratorValue"
import {GenericBeforeFirstIteratorValue}           from "./value/GenericBeforeFirstIteratorValue"

export class EmptyCollectionIterator
    implements CollectionIterator<never> {

    //#region -------------------- Singleton usage --------------------

    static #instance?: EmptyCollectionIterator

    protected constructor() {}

    public static get get(): EmptyCollectionIterator { return EmptyCollectionIterator.#instance ??= new EmptyCollectionIterator() }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Getter methods --------------------

    public get collection(): EmptyCollectionHolder { return CollectionConstants.EMPTY_COLLECTION_HOLDER }

    public get size(): 0 { return 0 }
    public get length(): 0 { return 0 }
    public get count(): 0 { return 0 }

    public get index(): null { return null }
    public get currentIndex(): null { return null }

    public get nextIndex(): null { return null }
    public get previousIndex(): null { return null }

    public get hasNext(): false { return false }
    public get hasPrevious(): false { return false }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Next methods --------------------

    public next(... _: readonly unknown[]): IteratorReturnResult<AfterLastValueInCollectionIteratorSymbol>
    public next() { return GenericAfterLastIteratorValue.get }

    public get nextValue(): never { throw new NoElementFoundInCollectionHolderException("An empty collection iterator has no value to retrieve",) }

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    public previous(... _: readonly unknown[]): IteratorReturnResult<BeforeFirstValueInCollectionIteratorSymbol>
    public previous() { return GenericBeforeFirstIteratorValue.get }

    public get previousValue(): never { throw new NoElementFoundInCollectionHolderException("An empty collection iterator has no value to retrieve",) }

    //#endregion -------------------- Previous methods --------------------
    //#region -------------------- Reset methods --------------------

    public reset(... _: readonly unknown[]): this
    public reset() { return this }

    //#endregion -------------------- Reset methods --------------------

    //#region -------------------- Loop methods --------------------

    public forEach(... _: readonly unknown[]): this
    public forEach() { return this }

    public forEachIndexed(... _: readonly unknown[]): this
    public forEachIndexed() { return this }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): this { return this }

    public get [Symbol.toStringTag](): CollectionIteratorName { return "CollectionIterator" }

    //#endregion -------------------- Javascript methods --------------------

    //#endregion -------------------- Methods --------------------

}
