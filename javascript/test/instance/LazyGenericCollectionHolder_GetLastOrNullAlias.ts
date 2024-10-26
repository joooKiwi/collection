/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullOr}                          from "@joookiwi/type"
import type {StraightCollectionHolderForTest} from "./StraightCollectionHolderForTest"

import {LazyGenericCollectionHolder} from "../../src/LazyGenericCollectionHolder"
import {ABCD}                        from "../value/arrays"

export class LazyGenericCollectionHolder_GetLastOrNullAlias
    extends LazyGenericCollectionHolder<string, readonly string[]>
    implements StraightCollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(ABCD,) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override getLastOrNull(): NullOr<string> {
        this.amountOfCall++
        return super.getLastOrNull()
    }

}
