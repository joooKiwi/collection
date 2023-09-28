/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullOr, PossibleNumeric} from "../general type"

/**
 * A simple {@link Error exception} that tell there is an invalid index that was received
 *
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/ArrayIndexOutOfBoundsException.html Java ArrayIndexOutOfBoundsException
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-index-out-of-bounds-exception Kotlin IndexOutOfBoundsException
 * @see https://learn.microsoft.com/dotnet/api/system.indexoutofrangeexception C# IndexOutOfRangeException
 */
export class CollectionHolderIndexOutOfBoundsException<const T extends NullOr<PossibleNumeric> = NullOr<PossibleNumeric>, >
    extends RangeError {

    readonly #invalidIndex: T

    public constructor(message: string, invalidIndex: T,) {
        super(message,)
        this.name = this.constructor.name
        this.#invalidIndex = invalidIndex
    }

    /** The invalid index */
    public get invalidIndex(): T {
        return this.#invalidIndex
    }

}
