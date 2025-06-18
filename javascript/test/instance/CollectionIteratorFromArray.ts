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

import type {CollectionIterator}      from "../../src/iterator/CollectionIterator"
import type {CollectionIteratorValue} from "../../src/iterator/value/CollectionIteratorValue"

import {AbstractCollectionIterator}     from "../../src/iterator/AbstractCollectionIterator"
import {GenericCollectionIteratorValue} from "../../src/iterator/value/GenericCollectionIteratorValue"
import {CollectionHolderFromArray}      from "./CollectionHolderFromArray"

/**
 * A {@link CollectionIterator} having the functionality from an {@link ReadonlyArray array}.
 *
 * Internally, it is using {@link CollectionHolderFromArray} as the {@link CollectionIterator.collection}
 */
export class CollectionIteratorFromArray<const T, >
    extends AbstractCollectionIterator<T> {

    public readonly array
    public override readonly collection

    public constructor(array: readonly T[],) {
        super()
        this.array = array
        this.collection = new CollectionHolderFromArray(array,)
    }

    public override get size(): number {
        return this.array.length
    }

    protected override _getIteratorValue(index: number,): CollectionIteratorValue<T> {
        return new GenericCollectionIteratorValue(this, this.collection, index,)
    }

    protected override _getValue(index: number,): T {
        return this.collection.get(index,)
    }

    public override [Symbol.iterator](): CollectionIterator<T> {
        return new CollectionIteratorFromArray(this.array,)
    }

}
