/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullableNumber} from "@joookiwi/type"

import type {CollectionHolder}        from "../../src/CollectionHolder"
import type {CollectionHolderForTest} from "./CollectionHolderForTest"

import {GenericCollectionHolder} from "../../src/GenericCollectionHolder"
import {ABCD}                    from "../value/arrays"

export class GenericCollectionHolder_ToReverseAlias
    extends GenericCollectionHolder<string, readonly string[]>
    implements CollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(ABCD,) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<string> {
        this.amountOfCall++
        return super.toReverse(fromIndex, toIndex,)
    }

}
