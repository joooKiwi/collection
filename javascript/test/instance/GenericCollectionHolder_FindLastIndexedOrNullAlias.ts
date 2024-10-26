/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullOr}                                                   from "@joookiwi/type"
import type {ReverseBooleanCallback, ReverseRestrainedBooleanCallback} from "../../src/CollectionHolder.types"
import type {StraightCollectionHolderForTest}                          from "./StraightCollectionHolderForTest"

import {GenericCollectionHolder} from "../../src/GenericCollectionHolder"
import {ABCD}                    from "../value/arrays"

export class GenericCollectionHolder_FindLastIndexedOrNullAlias
    extends GenericCollectionHolder<string, readonly string[]>
    implements StraightCollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(ABCD,) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override findLastIndexedOrNull<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<string>,): NullOr<string>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<string>,) {
        this.amountOfCall++
        return super.findLastIndexedOrNull(predicate,)
    }

}