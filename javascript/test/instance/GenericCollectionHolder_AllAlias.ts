/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                           from "../../src/CollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../../src/CollectionHolder.types"

import {GenericCollectionHolder} from "../../src/GenericCollectionHolder"

export class GenericCollectionHolder_AllAlias
    extends GenericCollectionHolder {

    public amountOfCall = 0

    public constructor() { super([],) }

    public override all<S extends unknown, >(predicate: RestrainedBooleanCallback<unknown, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<unknown>,): boolean
    public override all(predicate: BooleanCallback<unknown>,) {
        this.amountOfCall++
        return super.has(predicate,)
    }

}
