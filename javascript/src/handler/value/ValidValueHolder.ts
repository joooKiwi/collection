/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {ValueHolder} from "./ValueHolder"

/**
 * A {@link ValueHolder} meant to only hold a valid {@link value}
 *
 * @beta
 */
export class ValidValueHolder<const T = unknown, >
    implements ValueHolder<T> {

    readonly #value

    public constructor(value: T,) { this.#value = value }

    public get value(): T { return this.#value }
    public get isForbidden(): false { return false }
    public get cause(): null { return null }

}
