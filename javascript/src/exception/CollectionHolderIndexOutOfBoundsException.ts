/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullOr, NumericOrObject} from "@joookiwi/type"

/**
 * An {@link Error exception} that tell there is an invalid index that was received
 *
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/ArrayIndexOutOfBoundsException.html Java ArrayIndexOutOfBoundsException
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-index-out-of-bounds-exception Kotlin IndexOutOfBoundsException
 * @see https://learn.microsoft.com/dotnet/api/system.indexoutofrangeexception C# IndexOutOfRangeException
 */
export class CollectionHolderIndexOutOfBoundsException<const T extends NullOr<NumericOrObject> = NullOr<NumericOrObject>,
    const out CAUSE extends Error = never, >
    extends RangeError {

    public override readonly name = this.constructor.name
    readonly #invalidIndex: T
    readonly #cause

    public constructor(message: string, invalidIndex: T, cause?: Nullable<CAUSE>,) {
        super(message,)
        this.#invalidIndex = invalidIndex
        this.#cause = cause ?? null
    }

    /** The invalid index */
    public get invalidIndex(): T {
        return this.#invalidIndex
    }

    /** The cause of the {@link Error exception} */
    public override get cause(): NullOr<CAUSE> {
        return this.#cause
    }

}
