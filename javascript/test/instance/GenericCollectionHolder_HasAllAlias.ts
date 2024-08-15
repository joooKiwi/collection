/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {PossibleIterableArraySetOrCollectionHolder} from "../../src/CollectionHolder.types"

import {GenericCollectionHolder} from "../../src/GenericCollectionHolder"

export class GenericCollectionHolder_HasAllAlias
    extends GenericCollectionHolder {

    public amountOfCall = 0

    public constructor() { super([],) }

    public override hasAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean {
        this.amountOfCall++
        return super.hasAll(values,)
    }

}
