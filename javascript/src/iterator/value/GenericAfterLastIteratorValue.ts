/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {AfterLastValueInCollectionIteratorSymbol} from "../CollectionIterator.types"

import {CollectionConstants} from "../../CollectionConstants"

/**
 * A simple implementation of a {@link IteratorReturnResult} for the last element
 * after the last element on a {@link CollectionIterator}
 *
 * @singleton
 */
export class GenericAfterLastIteratorValue
    implements IteratorReturnResult<AfterLastValueInCollectionIteratorSymbol> {

    //#region -------------------- Singleton usage --------------------

    static #instance?: GenericAfterLastIteratorValue

    protected constructor() {
    }

    public static get get(): GenericAfterLastIteratorValue {
        return GenericAfterLastIteratorValue.#instance ??= new GenericAfterLastIteratorValue()
    }

    //#endregion -------------------- Singleton usage --------------------

    public get done(): true {
        return true
    }

    public get value(): AfterLastValueInCollectionIteratorSymbol {
        return CollectionConstants.AFTER_LAST_VALUE_IN_ITERATOR_SYMBOL
    }

}
