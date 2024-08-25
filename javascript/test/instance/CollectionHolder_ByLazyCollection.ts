/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullOr} from "@joookiwi/type"

import type {IndexWithReturnCallback} from "../../src/CollectionHolder.types"

import {AbstractCollectionHolder}    from "../../src/AbstractCollectionHolder"
import {LazyGenericCollectionHolder} from "../../src/LazyGenericCollectionHolder"

export class CollectionHolder_ByLazyCollection<const out T, >
    extends AbstractCollectionHolder<T> {

    readonly #instance

    public constructor(array: readonly T[],) {
        super()
        this.#instance = new LazyGenericCollectionHolder(array,)
    }

    public override get size(): number { return this.#instance.size }

    public override get(index: number,): T { return this.#instance.get(index,) }

    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) { return this.#instance.getOrElse(index, defaultValue,) }

    public override getOrNull(index: number,): NullOr<T> { return this.#instance.getOrNull(index,) }

}
