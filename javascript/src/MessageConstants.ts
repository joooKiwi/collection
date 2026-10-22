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

import type {CollectionHolder}   from "./CollectionHolder"
import type {CollectionIterator} from "./iterator/CollectionIterator"

/**
 * A utility class containing the messages on exceptions being thrown in a {@link CollectionHolder} or {@link CollectionIterator}
 *
 * Note that attempting to create it will result in a {@link EvalError}
 * due to being a utility class and not a namespace.
 */
export class MessageConstants {

    /** @throws {EvalError} The class cannot be created */
    private constructor() {
        throw new EvalError("The utility class “MessageConstants” cannot be created.",)
    }

}

export namespace MessageConstants {

    /**
     * The default message of a {@link NullCollectionException} when its message received is <code>null</code>
     *
     * @see NullCollectionException.DEFAULT_MESSAGE
     */
    export const NULL_COLLECTION_MESSAGE = "Null collection. No element at any index could be found since it is null."
    /**
     * The default message of an {@link EmptyCollectionException} when its message received is <code>null</code>
     *
     * @see EmptyCollectionException.DEFAULT_MESSAGE
     */
    export const EMPTY_COLLECTION_MESSAGE = "Empty collection. No element at any index could be found since it it empty."

    /**
     * The message when {@link CollectionIterator.previousValue} is not present
     *
     * @see NoElementFoundInCollectionException.AT_THE_START_MESSAGE
     */
    export const ITERATOR_IS_AT_THE_START_MESSAGE = "No element found. The collection iterator is at the start of the line."
    /**
     * The message when {@link CollectionIterator.previousValue} is not present
     *
     * @see NoElementFoundInCollectionException.AT_OR_BEFORE_THE_START_MESSAGE
     */
    export const ITERATOR_IS_AT_OR_BEFORE_THE_START_MESSAGE = "No element found. The collection iterator is at or before the start of the line."
    /**
     * The message when {@link CollectionIterator.nextValue} is not present
     *
     * @see NoElementFoundInCollectionException.AT_THE_END_MESSAGE
     */
    export const ITERATOR_IS_AT_THE_END_MESSAGE = "No element found. The collection iterator is at the end of the line."
    /**
     * The message when {@link CollectionIterator.nextValue} is not present
     *
     * @see NoElementFoundInCollectionException.AT_OR_AFTER_THE_END_MESSAGE
     */
    export const ITERATOR_IS_AT_OR_AFTER_THE_END_MESSAGE = "No element found. The collection iterator is at or after the end of the line."

}

export interface MessageConstants {

    /**
     * @param args Any possible arguments sent
     * @throws {EvalError} The class cannot be created
     */
    new(...args: Array<unknown>): never

}
