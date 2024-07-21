/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}         from "../CollectionHolder"
import type {PossibleIterableWithSize} from "../iterable/types"

import {AbstractCollectionHandlerBy2Values} from "./AbstractCollectionHandlerBy2Values"

/**
 * An implementation of a {@link CollectionHandler} for an iterable with
 * a {@link IterableWithSize size}, {@link IterableWithLength length} or {@link IterableWithCount count} field
 * with only two elements
 *
 * @beta
 * @see CollectionHandlerByIterable
 * @see CollectionHandlerByIterableWithSize
 * @see CollectionHandlerByIterableWithSizeOf1
 */
export class CollectionHandlerByIterableWithSizeOf2<const T = unknown,
    const REFERENCE extends PossibleIterableWithSize<T> = PossibleIterableWithSize<T>,
    const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandlerBy2Values<T, REFERENCE, COLLECTION> {

    #iterator?: Iterator<T, unknown>

    public constructor(collection: COLLECTION, reference: REFERENCE, size: number,) {
        super(collection, reference,)
        if (size !== 2)
            throw new TypeError(`The iterable received in the "${this.constructor.name}" cannot have a different size than 2.`,)
    }

    get #__iterator(): Iterator<T, unknown> { return this.#iterator ??= this._reference[Symbol.iterator]() }

    protected override _retrieveFirst(): T { return this.#__iterator.next().value as T }

    protected override _retrieveSecond(): T {
        this._first
        const value = this.#__iterator.next().value as T
        this._hasFinished = true
        return value
    }

}
