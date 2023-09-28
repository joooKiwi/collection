/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "../general type"

/**
 * Tell that the {@link CollectionHolder} could not find an element
 *
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/NoSuchElementException.html Java NoSuchElementException
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-no-such-element-exception Kotlin NoSuchElementException
 * @see https://learn.microsoft.com/dotnet/api/system.invalidoperationexception C# InvalidOperationException
 */
export class NoElementFoundInCollectionHolderException<const out CAUSE extends Error = never, >
    extends ReferenceError {

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
