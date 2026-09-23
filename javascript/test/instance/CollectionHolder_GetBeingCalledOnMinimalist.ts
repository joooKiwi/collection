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

import {__get}                                     from "../../src/method/_array utility"
import {AbstractMinimalistCollectionHolderForTest} from "./AbstractMinimalistCollectionHolderForTest"

/**
 * A class to test the functionality of a {@link MinimalistCollectionHolder}
 * having its {@link MinimalistCollectionHolder.get get method} being called.
 *
 * Note that all the methods are on the extension method for {@link MinimalistCollectionHolder}.
 *
 * @typeParam T The type
 */
export class CollectionHolder_GetBeingCalledOnMinimalist<const T, >
    extends AbstractMinimalistCollectionHolderForTest<T> {

    /** The amount of time the specific method ({@link MinimalistCollectionHolder.get}) has been called */
    public amountOfCall = 0

    public constructor(/** The array received in the constructor */ public readonly array: Array<T>,) {
        super()
    }

    public override get size(): number {
        return this.array.length
    }

    public override get(index: number,): T {
        this.amountOfCall++
        return __get(this.array, index,)
    }

}
