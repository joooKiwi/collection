/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {IndexValueCallback, ValueIndexCallback}                                                                       from "../CollectionHolder.types"
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

    public get collection(): EmptyCollectionHolder {
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    }
    public get size(): 0 { return 0 }
    public get length(): 0 { return 0 }
    public get count(): 0 { return 0 }

    public get index(): 0 { return 0 }
    public get nextIndex(): 0 { return 0 }
    public get previousIndex(): 0 { return 0 }

    public get hasNext(): false { return false }
    public get hasPrevious(): false { return false }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    public next(): IteratorReturnResult<AfterLastValueInCollectionIteratorSymbol> { return GenericAfterLastIteratorValue.get }
    public get nextValue(): never { throw new NoElementFoundInCollectionHolderException("An empty collection iterator has no value to retrieve",) }

    public previous(): IteratorReturnResult<BeforeFirstValueInCollectionIteratorSymbol> { return GenericBeforeFirstIteratorValue.get }
    public get previousValue(): never { throw new NoElementFoundInCollectionHolderException("An empty collection iterator has no value to retrieve",) }

    //#region -------------------- Loop methods --------------------

    public forEach(operation?: ValueIndexCallback<never>,): this
    public forEach() { return this }

    public forEachIndexed(operation?: IndexValueCallback<never>,): this
    public forEachIndexed() { return this }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): this { return this }

    public get [Symbol.toStringTag](): CollectionIteratorName { return CollectionConstants.COLLECTION_ITERATOR_TO_STRING_TAG }

    //#endregion -------------------- Javascript methods --------------------

    //#endregion -------------------- Methods --------------------

}
