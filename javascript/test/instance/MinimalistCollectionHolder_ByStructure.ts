/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {PossibleIterableArraySetOrCollectionHolder} from "../../src/CollectionHolder.types"
import type {MinimalistCollectionHolder}                 from "../../src/MinimalistCollectionHolder"

import {GenericMinimalistCollectionHolder} from "../../src/GenericMinimalistCollectionHolder"

export class MinimalistCollectionHolder_ByStructure<const out T, >
    implements MinimalistCollectionHolder<T> {

    readonly #internalReference: GenericMinimalistCollectionHolder<T>

    public constructor(reference: PossibleIterableArraySetOrCollectionHolder<T> | (() => PossibleIterableArraySetOrCollectionHolder<T>),) { this.#internalReference = new GenericMinimalistCollectionHolder(reference,) }

    public get size(): number { return this.#internalReference.size }

    public get(index: number,): T { return this.#internalReference.get(index,) }

}
