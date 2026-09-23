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

import type {CollectionHolder}                                                                                                                                                                                                                                                           from "./CollectionHolder"

/**
 * A utility class containing the default fields mostly on the `joinToString` or `toString` {@link CollectionHolder} methods.
 *
 * Note that attempting to create it will result in a {@link EvalError}
 * due to being a utility class and not a namespace.
 */
export class DefaultConstants {

    /** @throws {EvalError} The class cannot be created */
    private constructor() {
        throw new EvalError("The utility class “DefaultConstants” cannot be created.",)
    }

}

export namespace DefaultConstants {

    /** The default value for the separator {@link String string} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    export const DEFAULT_JOIN_SEPARATOR = ", "
    /** The default value for the prefix {@link String character} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    export const DEFAULT_JOIN_PREFIX = '['
    /** The default value for the truncated {@link String character} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    export const DEFAULT_JOIN_TRUNCATED = '…'
    /** The default value for the postfix {@link String character} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    export const DEFAULT_JOIN_POSTFIX = ']'
    /** The default {@link String} value for an empty {@link CollectionHolder} */
    export const DEFAULT_EMPTY_COLLECTION = "[]"
    /** The default {@link String} value for a filled {@link CollectionHolder}, but as nothing being shown */
    export const DEFAULT_ZERO_FILLED_COLLECTION = "[…]"

}

export interface DefaultConstants {

    /**
     * @param args Any possible arguments sent
     * @throws {EvalError} The class cannot be created
     */
    new(...args: Array<unknown>): never

}
