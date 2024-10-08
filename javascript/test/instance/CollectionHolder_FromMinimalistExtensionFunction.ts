/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {MinimalistCollectionHolder} from "../../src/MinimalistCollectionHolder"

import {AbstractMinimalistCollectionHolderForTest} from "./AbstractMinimalistCollectionHolderForTest"

/** A test instance to test exclusively the extension methods for a {@link MinimalistCollectionHolder} */
export class CollectionHolder_FromMinimalistExtensionFunction<const T, >
    extends AbstractMinimalistCollectionHolderForTest<T> {

    public constructor(array: readonly T[],) {
        super(array,)
    }

    public override get amountOfCall(): never {
        throw new Error("The getter method “amountOfCall” was not expected to be called on an extension function only test instance.",)
    }

    public override set amountOfCall(_: unknown,) {
        throw new Error("The setter method “amountOfCall” was not expected to be called on an extension function only test instance.",)
    }

    public override get(index: number,): T {
        if (index < 0)
            throw new Error("The method “get” was not expected to be called with a negative index",)
        if (index >= this.array.length)
            throw new Error("The method “get” was not expected to be called with an index equal or over the size",)
        return this.array[index] as T
    }

}
