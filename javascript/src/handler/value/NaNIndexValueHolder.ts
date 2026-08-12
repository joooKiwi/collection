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

import type {ValueHolder} from "./ValueHolder"

import {ForbiddenIndexException} from "../../exception/ForbiddenIndexException"

/**
 * A {@link ValueHolder} meant to give a {@link ForbiddenIndexException} {@link cause}
 * because of an index {@link Number.NaN NaN} while it {@link isForbidden is forbidden}
 *
 * @see NegativeInfinityIndexValueHolder
 * @see PositiveInfinityIndexValueHolder
 * @deprecated Since the handler will be removed, this should no longer be usable. This will be removed in version 2.1
 */
export class NaNIndexValueHolder
    implements ValueHolder<never> {

    readonly #index

    public constructor(index: number,) { this.#index = index }

    public get value(): null { return null }
    public get isForbidden(): true { return true }

    public get cause(): ForbiddenIndexException {
        return new ForbiddenIndexException("Forbidden index. The index cannot be NaN.", this.#index,)
    }

}
