/*******************************************************************************
 Copyright (c) 2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {ABCDEFGHIJ} from "../constantCollections"

import type {IndexWithReturnCallback} from "../../src/CollectionHolder.types"

import {GenericCollectionHolder} from "../../src/GenericCollectionHolder"

export class GenericCollectionHolder_GetOrElseAlias
    extends GenericCollectionHolder {

    public amountOfCall = 0

    public constructor() { super(ABCDEFGHIJ,) }

    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | unknown | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,): unknown
    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<| unknown | U>,) {
        this.amountOfCall++
        return super.getOrElse(index, defaultValue,)
    }

}
