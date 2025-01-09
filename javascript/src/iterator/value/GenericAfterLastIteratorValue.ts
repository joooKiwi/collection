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

import type {AfterLastValueInCollectionIteratorSymbol} from "../../type/symbol"

import {CollectionConstants} from "../../CollectionConstants"

/**
 * An implementation of a {@link IteratorReturnResult} for the last element
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
