/*******************************************************************************
 Copyright (c) 2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {ABCDEFGHIJ} from "../constantCollections"

import type {CollectionHolder} from "../../src/CollectionHolder"
import type {Nullable}         from "../../src/general type"

import {LazyGenericCollectionHolder} from "../../src/LazyGenericCollectionHolder"

export class LazyGenericCollectionHolder_ToReverseAlias
    extends LazyGenericCollectionHolder {

    public amountOfCall = 0

    public constructor() { super(ABCDEFGHIJ,) }

    public override toReverse(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder {
        this.amountOfCall++
        return super.toReverse(fromIndex, toIndex, limit,)
    }
}
