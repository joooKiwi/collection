/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"

import {AbstractCollectionHandler} from "./AbstractCollection.handler"
import {ValueHolder}               from "./ValueHolder"

/** A simple implementation of a {@link CollectionHandler} for a {@link CollectionHolder} */
export class CollectionCollectionHandler<out T = unknown, const REFERENCE extends CollectionHolder<T> = CollectionHolder<T>, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandler<T, REFERENCE, COLLECTION> {

    public constructor(collection: COLLECTION, reference: REFERENCE,) {
        super(collection, reference,)
    }

    public get isEmpty(): REFERENCE["isEmpty"] {
        return this._reference.isEmpty
    }

    public get size(): REFERENCE["size"] {
        return this._reference.size
    }

    public get(index: number,): ValueHolder<T> {
        const reference = this._reference,
            value = reference.getOrNull(index,)
        if (value == null) {
            if ((index < 0 ? this.size + index : index) in reference)
                return { value: value as T, cause: null, }
            const $this = this
            return { value: null, get cause() { return new ReferenceError(`The value doesn't exist in the collection "${$this._collection.constructor.name}" at the index ${index}.`,) }, }
        }

        const indexOfValue = reference.indexOf(value,)
        if (indexOfValue == null) {
            const $this = this
            return { value: null, get cause() { return new ReferenceError(`The index doesn't exist in the collection "${$this._collection.constructor.name}" at the index ${index}.`,) }, }
        }

        return {value: this._collection[indexOfValue] = value, cause: null,}
    }




}
