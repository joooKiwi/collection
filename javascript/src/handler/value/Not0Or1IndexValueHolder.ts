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
 * A {@link ValueHolder} meant to give a {@link IndexOutOfBoundsException} {@link cause}
 * because of an index that was not 1, 0, -1 or -2
 *
 * @see Not0Or1IndexAfterCalculationValueHolder
 * @deprecated Since the handler will be removed, this should no longer be usable. This will be removed in version 2.1
 */
export class Not0Or1IndexValueHolder
    implements ValueHolder<never> {

    readonly #index

    public constructor(index: number,) { this.#index = index }

    public get value(): null { return null }
    public get isForbidden(): false { return false }

    public get cause(): IndexOutOfBoundsException {
        const index = this.#index
        return new IndexOutOfBoundsException(`Index out of bound. The index ${index} was not 0, 1, -1 or -2.`, index,)
    }

}
