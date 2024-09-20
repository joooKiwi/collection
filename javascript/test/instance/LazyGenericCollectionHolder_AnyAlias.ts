/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {BooleanCallback} from "../../src/CollectionHolder.types"

import {LazyGenericCollectionHolder} from "../../src/LazyGenericCollectionHolder"

export class LazyGenericCollectionHolder_AnyAlias
    extends LazyGenericCollectionHolder {

    public amountOfCall = 0

    public constructor() { super([],) }

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<unknown>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<unknown>>,) {
        this.amountOfCall++
        return super.any(predicate,)
    }

}
