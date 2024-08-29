/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {IndexWithReturnCallback} from "../../src/CollectionHolder.types"

import {AbstractCollectionHolder} from "../../src/AbstractCollectionHolder"

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

    public override getOrElse<const U, >(index?: number, defaultValue?: IndexWithReturnCallback<U>,): never
    public override getOrElse(index?: number, defaultValue?: IndexWithReturnCallback<T>,): never
    public override getOrElse() { throw new Error("The method getOrElse was not expected to be called",) }

    public override getOrNull(index?: number,): never
    public override getOrNull() { throw new Error("The method getOrNull was not expected to be called",) }

}
