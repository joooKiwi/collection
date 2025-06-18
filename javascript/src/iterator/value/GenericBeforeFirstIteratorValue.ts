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
import type {OutsideIteratorValue}                       from "./OutsideIteratorValue"

import {CollectionConstants}   from "../../CollectionConstants"
import {AbstractIteratorValue} from "./AbstractIteratorValue"

/**
 * An implementation of an {@link OutsideIteratorValue} when it is
 * before the first element of a {@link CollectionIterator}
 *
 * @singleton
 */
export class GenericBeforeFirstIteratorValue
    extends AbstractIteratorValue<BeforeFirstValueInCollectionIteratorSymbol, true>
    implements OutsideIteratorValue<BeforeFirstValueInCollectionIteratorSymbol> {

    //#region -------------------- Singleton usage --------------------

    static #instance?: GenericBeforeFirstIteratorValue

    protected constructor() { super() }

    public static get get(): GenericBeforeFirstIteratorValue {
        return GenericBeforeFirstIteratorValue.#instance ??= new GenericBeforeFirstIteratorValue()
    }

    //#endregion -------------------- Singleton usage --------------------

    public override isDone(): true { return true }

    public override get value(): BeforeFirstValueInCollectionIteratorSymbol {
        return CollectionConstants.BEFORE_FIRST_VALUE_IN_ITERATOR_SYMBOL
    }

}
