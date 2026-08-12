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

import {IndexOutOfBoundsException} from "../../exception/IndexOutOfBoundsException"

/**
 * A {@link ValueHolder} meant to not hold a {@link value},
 * throw a {@link IndexOutOfBoundsException} (with {@link EmptyCollectionException.DEFAULT_MESSAGE})
 * and give if it {@link isForbidden is forbidden}
 *
 * @deprecated Since the handler will be removed, this should no longer be usable. This will be removed in version 2.1
 */
export class EmptyCollectionValueHolder
    implements ValueHolder<never> {

    readonly #index
    #isForbidden?: boolean

    public constructor(index: number,) { this.#index = index }

    public get value(): null { return null }

    public get isForbidden(): boolean {
        const value = this.#isForbidden
        if (value != null)
            return value

        const index = this.#index
        if (Number.isNaN(index,))
            return this.#isForbidden = true
        if (index === Number.NEGATIVE_INFINITY)
            return this.#isForbidden = true
        if (index === Number.POSITIVE_INFINITY)
            return this.#isForbidden = true
        return this.#isForbidden = false
    }

    public get cause(): IndexOutOfBoundsException<number> {
        return new IndexOutOfBoundsException("Empty collection. No element at any index could be found since it it empty.", this.#index,)
    }

}
