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

import type {BeforeFirstValueInCollectionIteratorSymbol} from "../../type/symbol"

import {CollectionConstants} from "../../CollectionConstants"

/**
 * An implementation of a {@link IteratorReturnResult} for the element
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
