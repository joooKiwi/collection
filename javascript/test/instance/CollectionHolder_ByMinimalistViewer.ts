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

import {MinimalistCollectionViewer}                       from "../../src/MinimalistCollectionViewer"
import {AbstractMinimalistCollectionHolderForTest}        from "./AbstractMinimalistCollectionHolderForTest"
import {CollectionHolderFromArray}                        from "./CollectionHolderFromArray"

/**
 * A class to test the functionality of a {@link MinimalistCollectionViewer}
 * for both {@link MinimalistCollectionViewer.size get size}
 * and {@link MinimalistCollectionViewer.get get}.
 *
 * The remaining methods are from the extension methods for a {@link MinimalistCollectionHolder}
 *
 * @typeParam T The type
 */
export class CollectionHolder_ByMinimalistViewer<const T, >
    extends AbstractMinimalistCollectionHolderForTest<T, Array<T>> {

    /** The internal instance that is tested */
    public readonly instance: MinimalistCollectionViewer<T, CollectionHolderFromArray<T>>

    public readonly reference: CollectionHolderFromArray<T>

    public constructor(array: Array<T>,) {
        super(array,)
        const $this = this
        this.instance = new class CollectionHolder_CountingGetByMinimalistViewer
            extends MinimalistCollectionViewer<T, CollectionHolderFromArray<T>> {

            public override get(index: number,): T {
                $this.amountOfCall++
                return super.get(index,)
            }

        }(this.reference = new CollectionHolderFromArray(array,),)
    }

    public override get size(): number {
        return this.instance.size
    }

    public override get(index: number,): T { return this.instance.get(index,) }

}
