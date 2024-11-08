/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                                         from "../../src/CollectionHolder"
import type {ReverseBooleanCallback, ReverseRestrainedBooleanCallback} from "../../src/type/callback"
import type {StraightCollectionHolderForTest}                          from "./StraightCollectionHolderForTest"

import {GenericCollectionHolder} from "../../src/GenericCollectionHolder"
import {ABCD}                    from "../value/arrays"

export class GenericCollectionHolder_DropWhileIndexedAlias
    extends GenericCollectionHolder<string, readonly string[]>
    implements StraightCollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(ABCD,) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override dropWhileIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<string>,): CollectionHolder<string>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<string>,) {
        this.amountOfCall++
        return super.dropWhileIndexed(predicate,)
    }

}
