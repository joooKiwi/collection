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
import type {OutsideIteratorValue}                     from "./OutsideIteratorValue"

import {CollectionConstants}   from "../../CollectionConstants"
import {AbstractIteratorValue} from "./AbstractIteratorValue"

/**
 * An implementation of an {@link OutsideIteratorValue} when it is
 * after the last element of a {@link CollectionIterator}
 *
 * @singleton
 */
export class GenericAfterLastIteratorValue
    extends AbstractIteratorValue<AfterLastValueInCollectionIteratorSymbol, true>
    implements OutsideIteratorValue<AfterLastValueInCollectionIteratorSymbol> {

    //#region -------------------- Singleton usage --------------------

    static #instance?: GenericAfterLastIteratorValue

    protected constructor() { super() }

    public static get get(): GenericAfterLastIteratorValue {
        return GenericAfterLastIteratorValue.#instance ??= new GenericAfterLastIteratorValue()
    }

    //#endregion -------------------- Singleton usage --------------------

    public override isDone(): true { return true }
    public override isNotDone(): false { return false }

    public override get value(): AfterLastValueInCollectionIteratorSymbol {
        return CollectionConstants.AFTER_LAST_VALUE_IN_ITERATOR_SYMBOL
    }

}
