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

import {AbstractMinimalistCollectionHolder} from "../../src/AbstractMinimalistCollectionHolder"

/**
 * A {@link MinimalistCollectionHolder} having the functionality from an {@link ReadonlyArray array}
 * without handling negative indexes in the {@link MinimalistCollectionHolder.get} method
 */
export class MinimalistCollectionHolderFromArray<const T, >
    extends AbstractMinimalistCollectionHolder<T> {

    readonly #array
    readonly #size

    public constructor(array: readonly T[],) {
        super()
        this.#size = (this.#array = array).length
    }

    public get size(): number { return this.#size }

    public override get(index: number,): T {
        const array = this.#array
        if (index in array)
            return array[index] as T
        throw new Error(`The method get was attempting to retrieve an invalid index (“${index}”)`,)
    }

}
