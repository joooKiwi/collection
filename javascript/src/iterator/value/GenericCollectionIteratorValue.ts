//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {MinimalistCollectionHolder} from "../../MinimalistCollectionHolder"
import type {CollectionIterator}         from "../CollectionIterator"
import type {CollectionIteratorValue}    from "./CollectionIteratorValue"

import {AbstractIteratorValue} from "./AbstractIteratorValue"

export class GenericCollectionIteratorValue<const T = unknown,
    const REFERENCE extends CollectionIterator<T> = CollectionIterator<T>,
    const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>,
    const INDEX extends number = number, >
    extends AbstractIteratorValue<T, false>
    implements CollectionIteratorValue<T> {

    readonly #iterator
    readonly #collection
    readonly #index

    public constructor(iterator: REFERENCE, collection: COLLECTION, index: INDEX,) {
        super()
        this.#iterator = iterator
        this.#collection = collection
        this.#index = index
    }

    /** The {@link CollectionIterator} that was the origin of the current {@link CollectionIteratorValue instance} */
    protected get _iterator(): REFERENCE { return this.#iterator }

    public get collection(): COLLECTION { return this.#collection }

    public get index(): INDEX { return this.#index }

    public override isDone(): false { return false }

    public override get value(): T { return this.collection.get(this.index,) }

}
