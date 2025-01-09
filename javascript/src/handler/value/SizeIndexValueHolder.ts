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

import {IndexOutOfBoundsException} from "../../exception/IndexOutOfBoundsException"

/**
 * A {@link ValueHolder} meant to throw a {@link IndexOutOfBoundsException}
 * because the <b>index</b> was the {@link CollectionHolder collection} {@link CollectionHolder.size size}
 *
 * @beta
 * @see SizeIndexAfterCalculationValueHolder
 */
export class SizeIndexValueHolder
    implements ValueHolder<never> {

    readonly #index
    readonly #size

    public constructor(index: number, size: number,) {
        this.#index = index
        this.#size = size
    }

    public get value(): null { return null }
    public get isForbidden(): false { return false }

    public get cause(): IndexOutOfBoundsException<number> {
        const index = this.#index
        return new IndexOutOfBoundsException(`Index out of bound. The index ${index} is the size of the collection (${this.#size}).`, index,)
    }

}
