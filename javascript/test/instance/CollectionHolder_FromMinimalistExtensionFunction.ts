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

import type {MinimalistCollectionHolder} from "../../src/MinimalistCollectionHolder"

import {AbstractMinimalistCollectionHolderForTest} from "./AbstractMinimalistCollectionHolderForTest"

/** A test instance to exclusively test the extension methods for a {@link MinimalistCollectionHolder} */
export class CollectionHolder_FromMinimalistExtensionFunction<const T, >
    extends AbstractMinimalistCollectionHolderForTest<T, readonly T[]> {

    public override get amountOfCall(): never {
        throw new Error("The getter method “amountOfCall” was not expected to be called on an extension function only test instance.",)
    }

    public override set amountOfCall(_: unknown,) {
        throw new Error("The setter method “amountOfCall” was not expected to be called on an extension function only test instance.",)
    }

    public override get size(): number {
        return this.array.length
    }

    public override get(index: number,): T {
        if (index < 0)
            throw new Error("The method “get” was not expected to be called with a negative index",)

        const array = this.array
        if (index >= array.length)
            throw new Error("The method “get” was not expected to be called with an index equal or over the size",)
        return array[index] as T
    }

}
