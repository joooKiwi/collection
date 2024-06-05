/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {ValueHolder} from "./ValueHolder"

import {ForbiddenIndexException} from "../../exception/ForbiddenIndexException"

/**
 * A {@link ValueHolder} meant to give a {@link ForbiddenIndexException} {@link cause}
 * because of an index {@link Number.POSITIVE_INFINITY +∞} while it {@link isForbidden is forbidden}
 *
 * @beta
 * @see NaNIndexValueHolder
 * @see NegativeInfinityIndexValueHolder
 */
export class PositiveInfinityIndexValueHolder
    implements ValueHolder<never> {

    readonly #index

    public constructor(index: number,) { this.#index = index }

    public get value(): null { return null }
    public get isForbidden(): true { return true }
    public get cause(): ForbiddenIndexException {
        return new ForbiddenIndexException("Forbidden index. The index cannot be +∞.", this.#index,)
    }

}