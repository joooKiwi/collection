/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {BeforeFirstValueInCollectionIteratorSymbol} from "../CollectionIterator.types"

import {CollectionConstants} from "../../CollectionConstants"

/**
 * A simple implementation of a {@link IteratorReturnResult} for the element
 * before the first element on a {@link CollectionIterator}
 *
 * @singleton
 */
export class GenericBeforeFirstIteratorValue
    implements IteratorReturnResult<BeforeFirstValueInCollectionIteratorSymbol> {

    //#region -------------------- Singleton usage --------------------

    static #instance?: GenericBeforeFirstIteratorValue

    protected constructor() {
    }

    public static get get(): GenericBeforeFirstIteratorValue {
        return GenericBeforeFirstIteratorValue.#instance ??= new GenericBeforeFirstIteratorValue()
    }

    //#endregion -------------------- Singleton usage --------------------

    public get done(): true {
        return true
    }

    public get value(): BeforeFirstValueInCollectionIteratorSymbol {
        return CollectionConstants.BEFORE_FIRST_VALUE_IN_ITERATOR_SYMBOL
    }

}
