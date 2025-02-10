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

import type {CollectionHolder}         from "../CollectionHolder"
import type {PossibleIterableWithSize} from "../iterable/types"

import {AbstractCollectionHandlerBy1Value} from "./AbstractCollectionHandlerBy1Value"

/**
 * An implementation of a {@link CollectionHandler} for an iterable with
 * a {@link IterableWithSize size}, {@link IterableWithLength length} or {@link IterableWithCount count} field
 * with only one element
 *
 * @beta
 * @see CollectionHandlerByIterable
 * @see CollectionHandlerByIterableWithSize
 * @see CollectionHandlerByIterableWithSizeOf2
 */
export class CollectionHandlerByIterableWithSizeOf1<const T = unknown,
    const REFERENCE extends PossibleIterableWithSize<T> = PossibleIterableWithSize<T>,
    const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandlerBy1Value<T, REFERENCE, COLLECTION> {

    public constructor(collection: COLLECTION, reference: REFERENCE, size: number,) {
        super(collection, reference,)
        if (size !== 1)
            throw new TypeError(`The iterable received in the “${this.constructor.name}” cannot have a different size than 1.`,)
    }

    protected override _retrieveFirst(): T { return this._reference[Symbol.iterator]().next().value }

}
