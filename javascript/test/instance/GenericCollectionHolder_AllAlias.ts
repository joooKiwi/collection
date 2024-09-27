/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                           from "../../src/CollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../../src/CollectionHolder.types"
import type {CollectionHolderForTest}                    from "./CollectionHolderForTest"

import {GenericCollectionHolder} from "../../src/GenericCollectionHolder"
import {ABCD}                    from "../value/arrays"

export class GenericCollectionHolder_AllAlias
    extends GenericCollectionHolder<string, readonly string[]>
    implements CollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(ABCD,) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override all<S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<string>,): boolean
    public override all(predicate: BooleanCallback<string>,) {
        this.amountOfCall++
        return super.all(predicate,)
    }

}