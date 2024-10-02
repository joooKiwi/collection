/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {MinimalistCollectionHolder} from "../../src/MinimalistCollectionHolder"

import {GenericMinimalistCollectionHolder}                from "../../src/GenericMinimalistCollectionHolder"
import {AbstractMinimalistCollectionHolderForTest}        from "./AbstractMinimalistCollectionHolderForTest"

/**
 * A class to test the functionality of a {@link GenericMinimalistCollectionHolder}
 * for both {@link GenericMinimalistCollectionHolder.size get size}
 * and {@link GenericMinimalistCollectionHolder.get get}.
 *
 * The remaining methods are from the extension methods for a {@link MinimalistCollectionHolder}
 */
export class CollectionHolder_ByMinimalistCollection<const T, >
    extends AbstractMinimalistCollectionHolderForTest<T> {

    /** The internal instance that is tested */
    public readonly instance

    public constructor(array: readonly T[],) {
        super(array,)
        this.instance = new GenericMinimalistCollectionHolder(array,)
    }

    public override get size(): number {
        return this.instance.size
    }

    public override get(index: number,): T {
        this.amountOfCall++
        return this.instance.get(index,)
    }

}
