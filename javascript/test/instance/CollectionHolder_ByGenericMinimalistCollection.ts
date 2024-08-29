/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AbstractCollectionHolder}          from "../../src/AbstractCollectionHolder"
import {GenericMinimalistCollectionHolder} from "../../src/GenericMinimalistCollectionHolder"

export class CollectionHolder_ByGenericMinimalistCollection<const out T, >
    extends AbstractCollectionHolder<T> {

    readonly #instance

    public constructor(array: readonly T[],) {
        super()
        this.#instance = new GenericMinimalistCollectionHolder(array,)
    }

    public override get size(): number { return this.#instance.size }

    public override get(index: number,): T { return this.#instance.get(index,) }

}
