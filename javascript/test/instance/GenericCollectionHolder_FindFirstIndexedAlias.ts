/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {ReverseBooleanCallback, ReverseRestrainedBooleanCallback} from "../../src/CollectionHolder.types"
import type {StraightCollectionHolderForTest}                          from "./StraightCollectionHolderForTest"

import {GenericCollectionHolder} from "../../src/GenericCollectionHolder"
import {ABCD}                    from "../value/arrays"

export class GenericCollectionHolder_FindFirstIndexedAlias
    extends GenericCollectionHolder<string, readonly string[]>
    implements StraightCollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(ABCD,) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override findFirstIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<string>,): string
    public override findFirstIndexed(predicate: ReverseBooleanCallback<string>,) {
        this.amountOfCall++
        return super.findFirstIndexed(predicate,)
    }

}
