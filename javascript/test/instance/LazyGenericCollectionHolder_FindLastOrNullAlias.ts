/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullOr}                                     from "@joookiwi/type"
import type {BooleanCallback, RestrainedBooleanCallback} from "../../src/type/callback"
import type {StraightCollectionHolderForTest}            from "./StraightCollectionHolderForTest"

import {LazyGenericCollectionHolder} from "../../src/LazyGenericCollectionHolder"
import {ABCD}                        from "../value/arrays"

export class LazyGenericCollectionHolder_FindLastOrNullAlias
    extends LazyGenericCollectionHolder<string, readonly string[]>
    implements StraightCollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(ABCD,) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override findLastOrNull<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<string>,): NullOr<string>
    public override findLastOrNull(predicate: BooleanCallback<string>,) {
        this.amountOfCall++
        return super.findLastOrNull(predicate,)
    }

}
