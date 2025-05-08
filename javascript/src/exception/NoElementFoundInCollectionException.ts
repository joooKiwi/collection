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

import type {Nullable} from "@joookiwi/type"

/**
 * Tell that the {@link CollectionHolder} could not find an element
 *
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/NoSuchElementException.html Java NoSuchElementException
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-no-such-element-exception Kotlin NoSuchElementException
 * @see https://learn.microsoft.com/dotnet/api/system.invalidoperationexception C# InvalidOperationException
 */
export class NoElementFoundInCollectionException<const CAUSE extends Error = never, >
    extends ReferenceError {

    /**
     * The message when the {@link CollectionIterator.previousValue} is not present
     *
     * @see CollectionConstants.ITERATOR_IS_AT_THE_START_MESSAGE
     */
    public static readonly AT_THE_START_MESSAGE: string = "No element found. The collection iterator is at or before the start of the line."
    /**
     * The message when the {@link CollectionIterator.nextValue} is not present
     *
     * @see CollectionConstants.ITERATOR_IS_AT_THE_END_MESSAGE
     */
    public static readonly AT_THE_END_MESSAGE: string = "No element found. The collection iterator is at or after the end of the line."

    public override readonly name = this.constructor.name
    readonly #cause

    public constructor(message: string, cause?: Nullable<CAUSE>,) {
        super(message,)
        this.#cause = cause ?? null
    }

    /** The cause of the {@link Error exception} */
    public override get cause(): Nullable<CAUSE> {
        return this.#cause
    }

}
