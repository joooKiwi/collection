/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AbstractCollectionHolder} from "../../src/AbstractCollectionHolder"

/**
 * A {@link CollectionHolder} having the functionality from an {@link ReadonlyArray array}
 * without handling negative indexes in the {@link CollectionHolder.get} method
 */
export class CollectionHolderFromArray<const out T = unknown, >
    extends AbstractCollectionHolder<T> {

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
