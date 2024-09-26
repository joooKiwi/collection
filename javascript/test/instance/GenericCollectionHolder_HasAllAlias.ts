/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {PossibleIterableArraySetOrCollectionHolder} from "../../src/CollectionHolder.types"
import type {CollectionHolderForTest}                    from "./CollectionHolderForTest"

import {GenericCollectionHolder} from "../../src/GenericCollectionHolder"
import {ABCD}                    from "../value/arrays"

export class GenericCollectionHolder_HasAllAlias
    extends GenericCollectionHolder<string, readonly string[]>
    implements CollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(ABCD,) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override hasAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean {
        this.amountOfCall++
        return super.hasAll(values,)
    }

}
