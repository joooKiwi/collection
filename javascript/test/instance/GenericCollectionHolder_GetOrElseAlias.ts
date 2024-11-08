/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {IndexWithReturnCallback}         from "../../src/type/callback"
import type {StraightCollectionHolderForTest} from "./StraightCollectionHolderForTest"

import {GenericCollectionHolder} from "../../src/GenericCollectionHolder"
import {ABCD}                    from "../value/arrays"

export class GenericCollectionHolder_GetOrElseAlias
    extends GenericCollectionHolder<string, readonly string[]>
    implements StraightCollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(ABCD,) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | string | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<string>,): string
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        this.amountOfCall++
        return super.getOrElse(index, defaultValue,)
    }

}
