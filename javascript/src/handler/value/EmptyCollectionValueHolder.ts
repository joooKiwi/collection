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

import type {ValueHolder} from "./ValueHolder"

import {EmptyCollectionException} from "../../exception/EmptyCollectionException"

/**
 * A {@link ValueHolder} meant to not hold a {@link value},
 * throw a {@link EmptyCollectionException}
 * and give if it {@link isForbidden is forbidden}
 *
 * @beta
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

    public get cause(): EmptyCollectionException<number> {
        return new EmptyCollectionException(null, this.#index,)
    }

}
