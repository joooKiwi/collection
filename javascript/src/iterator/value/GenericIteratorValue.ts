/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {MinimalistCollectionHolder} from "../../MinimalistCollectionHolder"
import type {IteratorValue}              from "./IteratorValue"

export class GenericIteratorValue<const T = unknown,
    const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>,
    const INDEX extends number = number, >
    implements IteratorValue<T> {

    readonly #collection
    readonly #index

    public constructor(collection: COLLECTION, index: INDEX,) {
        this.#collection = collection
        this.#index = index
    }

    public get collection(): COLLECTION { return this.#collection }

    public get index(): INDEX { return this.#index }

    public get done(): false { return false }

    public get value(): T { return this.collection.get(this.index,) }

}
