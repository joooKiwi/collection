/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullOr} from "@joookiwi/type"

/**
 * An exception to tell that an edge case {@link Number} (±∞ / {@link Number.NaN NaN}) was used
 *
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/lang/IllegalArgumentException.html Java IllegalArgumentException
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-illegal-argument-exception Kotlin IllegalArgumentException
 * @see https://learn.microsoft.com/dotnet/api/system.argumentoutofrangeexception C# ArgumentOutOfRangeException
 */
export class ForbiddenIndexException<const T extends number = number,
    const ERROR extends Error = never, >
    extends ReferenceError {

    public override readonly name = this.constructor.name
    readonly #value
    readonly #cause

    public constructor(message: string, value: T, cause?: Nullable<ERROR>,) {
        super(message,)
        this.#value = value
        this.#cause = cause ?? null
    }

    /** The forbidden {@link Number} that was ±∞ or {@link Number.NaN NaN} */
    public get value(): T {
        return this.#value
    }

    public override get cause(): NullOr<ERROR> {
        return this.#cause
    }

}
