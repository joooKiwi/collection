/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {IndexWithReturnCallback}      from "../../src/CollectionHolder.types"
import type {NullOr}                       from "../../src/general type"

import {AbstractCollectionHolder}          from "../../src/AbstractCollectionHolder"
import {GenericCollectionHolder}           from "../../src/GenericCollectionHolder"

export class CollectionHolder_ByGenericCollection<const out T, >
    extends AbstractCollectionHolder<T> {

    readonly #instance

    public constructor(array: readonly T[],) {
        super()
        this.#instance = new GenericCollectionHolder(array,)
    }

    public override get size(): number { return this.#instance.size }

    public override get(index: number,): T { return this.#instance.get(index,) }

    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<| T | U>,) { return this.#instance.getOrElse(index, defaultValue,) }

    public getOrNull(index: number,): NullOr<T> { return this.#instance.getOrNull(index,) }

}
