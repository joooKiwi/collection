/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullableNumber} from "@joookiwi/type"

import type {ReverseBooleanCallback}          from "../../src/CollectionHolder.types"
import type {StraightCollectionHolderForTest} from "./StraightCollectionHolderForTest"

import {GenericCollectionHolder} from "../../src/GenericCollectionHolder"
import {ABCD}                    from "../value/arrays"

export class GenericCollectionHolder_IndexOfLastIndexedAlias
    extends GenericCollectionHolder<string, readonly string[]>
    implements StraightCollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(ABCD,) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<string>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number {
        this.amountOfCall++
        return super.indexOfLastIndexed(predicate, fromIndex, toIndex,)
    }

}