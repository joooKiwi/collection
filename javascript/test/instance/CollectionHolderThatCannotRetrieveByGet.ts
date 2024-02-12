/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}        from "../../src/CollectionHolder"
import type {IndexWithReturnCallback} from "../../src/CollectionHolder.types"
import type {NullOr}                  from "../../src/general type"

import {AbstractCollectionHolder} from "../../src/AbstractCollectionHolder"

export class CollectionHolderThatCannotRetrieveByGet<const out T = unknown, >
    extends AbstractCollectionHolder<T> {

    readonly #collection: CollectionHolder<T>

    public constructor(collection: CollectionHolder<T>,) {
        super()
        this.#collection = collection
        let index = collection.size
        while (index-- > 0)
            this[index] = collection.get(index,)
    }

    public override get isEmpty() { return this.#collection.isEmpty }
    public override get size() { return this.#collection.size }


    public override get(index: number,): never
    public override get(): never { throw new Error("The \"get\" method should not fail normally.",) }

    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(): never { throw new Error("The \"getOrElse\" method should not fail normally.",) }

    public override getOrNull(index: number,): NullOr<T>
    public override getOrNull(): never { throw new Error("The \"getOrNull\" method should not fail normally.",) }

}
