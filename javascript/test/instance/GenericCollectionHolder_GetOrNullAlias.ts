/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullOr} from "@joookiwi/type"

import {ABCDEFGHIJ} from "../constantCollections"

import {GenericCollectionHolder} from "../../src/GenericCollectionHolder"

export class GenericCollectionHolder_GetOrNullAlias
    extends GenericCollectionHolder {

    public amountOfCall = 0

    public constructor() { super(ABCDEFGHIJ,) }

    public override getOrNull(index: number,): NullOr<unknown> {
        this.amountOfCall++
        return super.getOrNull(index,)
    }

}
