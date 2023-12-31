/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../../CollectionHolder"
import type {IteratorValue}    from "./IteratorValue"

export class GenericIteratorValue<const out T = unknown, >
    implements IteratorValue<T> {

    readonly #collection
    readonly #index

    public constructor(collection: CollectionHolder<T>, index: number,) {
        this.#collection = collection
        this.#index = index
    }

    public get collection(): CollectionHolder<T> {
        return this.#collection
    }

    public get index(): number {
        return this.#index
    }

    public get done(): false {
        return false
    }

    public get value(): T {
        return this.collection.get(this.index,)
    }

}