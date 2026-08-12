//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {CollectionHolder}        from "../../CollectionHolder"
import type {CollectionIterator}      from "../CollectionIterator"
import type {CollectionIteratorValue} from "./CollectionIteratorValue"

import {AbstractIteratorValue} from "./AbstractIteratorValue"

/**
 * An implementation of a {@link CollectionIteratorValue}
 * with specified {@link CollectionIterator} (for debugging purpose),
 * a {@link CollectionHolder} (for debugging purpose)
 * and the {@link index} to give the index that the {@link value} needs to be retrieved.
 *
 * @typeParam T          The element type (`unknown` by default)
 * @typeParam REFERENCE  The {@link CollectionIterator} source (`CollectionIterator<T>` by default)
 * @typeParam COLLECTION The {@link CollectionHolder} source (`CollectionHolder<T>` by default)
 * @typeParam INDEX      The index to retrieve in the {@link collection} (`number` by default)
 */
export class GenericCollectionIteratorValue<const T = unknown,
    const REFERENCE extends CollectionIterator<T> = CollectionIterator<T>,
    const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>,
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
    public override isNotDone(): true { return true }

    public override get value(): T { return this.collection.get(this.index,) }

}
