//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Array} from "@joookiwi/type"

/**
 * A utility class containing every {@link symbol} used by any {@link CollectionIterator} instances and the {@link Symbol.toString} values.
 *
 * Note that attempting to create it will result in a {@link EvalError}
 * due to being a utility class and not a namespace.
 */
export class SymbolConstants {

    /** @throws {EvalError} The class cannot be created */
    private constructor() {
        throw new EvalError("The utility class “SymbolConstants” cannot be created.",)
    }

}

export namespace SymbolConstants {

    /**
     * The {@link Symbol.toStringTag} of an {@link CollectionHolder}
     *
     * @uniqueJavascriptVariable
     */
    export const COLLECTION_HOLDER_TO_STRING_TAG = "CollectionHolder"
    /**
     * The {@link Symbol.toStringTag} of an {@link CollectionIterator}
     *
     * @uniqueJavascriptVariable
     */
    export const COLLECTION_ITERATOR_TO_STRING_TAG = "CollectionIterator"

    /**
     * The {@link Symbol.toStringTag} of a {@link Tuple}
     *
     * @uniqueJavascriptVariable
     */
    export const TUPLE_TO_STRING_TAG = "Tuple"
    /**
     * The {@link Symbol.toStringTag} of a {@link Optional}
     *
     * @uniqueJavascriptVariable
     */
    export const OPTIONAL_TO_STRING_TAG = "Optional"

    /** The value before the first value in a {@link CollectionIterator} */
    export const BEFORE_FIRST_VALUE_IN_ITERATOR_SYMBOL = Symbol("Before first CollectionIterator value",)
    /** The value after the last value in a {@link CollectionIterator} */
    export const AFTER_LAST_VALUE_IN_ITERATOR_SYMBOL = Symbol("After last CollectionIterator value",)

}

export interface SymbolConstants {

    /**
     * @param args Any possible arguments sent
     * @throws {EvalError} The class cannot be created
     */
    new(...args: Array<unknown>): never

}
