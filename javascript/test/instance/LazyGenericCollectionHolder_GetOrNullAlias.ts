/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullOrString}            from "@joookiwi/type"
import type {CollectionHolderForTest} from "./CollectionHolderForTest"

import {LazyGenericCollectionHolder} from "../../src/LazyGenericCollectionHolder"
import {ABCD}                        from "../value/arrays"

export class LazyGenericCollectionHolder_GetOrNullAlias
    extends LazyGenericCollectionHolder<string, readonly string[]>
    implements CollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(ABCD,) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override getOrNull(index: number,): NullOrString {
        this.amountOfCall++
        return super.getOrNull(index,)
    }

}
