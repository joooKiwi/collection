/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                                         from "../../src/CollectionHolder"
import type {ReverseBooleanCallback, ReverseRestrainedBooleanCallback} from "../../src/type/callback"
import type {StraightCollectionHolderForTest}                          from "./StraightCollectionHolderForTest"

import {LazyGenericCollectionHolder} from "../../src/LazyGenericCollectionHolder"
import {ABCD}                        from "../value/arrays"

export class LazyGenericCollectionHolder_DropLastWhileIndexedAlias
    extends LazyGenericCollectionHolder<string, readonly string[]>
    implements StraightCollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(ABCD,) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override dropLastWhileIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<string>,): CollectionHolder<string>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<string>,) {
        this.amountOfCall++
        return super.dropLastWhileIndexed(predicate,)
    }

}
