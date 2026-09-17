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

import type {Array} from "@joookiwi/type"

import {AbstractCollectionHolderForTest} from "./AbstractCollectionHolderForTest"
import {CollectionHolderFromArray}       from "./CollectionHolderFromArray"

/**
 * A class to test the functionality of a {@link CollectionHolder}
 * having its {@link CollectionHolder.get get method} being called.
 *
 * Note that all the methods are on the extension method for {@link CollectionHolder}.
 *
 * @typeParam T The type
 */
export class CollectionHolder_ByGenericCollection<const T, >
    extends AbstractCollectionHolderForTest<T> {

    /** The amount of time the specific method ({@link CollectionHolder.get}) has been called */
    public amountOfCall = 0

    /** The internal instance that is tested */
    public readonly instance: CollectionHolderFromArray<T>

    public constructor(/** The array received in the constructor */ public readonly array: Array<T>,) {
        super()
        this.instance = new CollectionHolderFromArray(array,)
    }

    public override get size(): number { return this.instance.size }

    public override get(index: number,): T {
        this.amountOfCall++
        return this.instance.get(index,)
    }

}
