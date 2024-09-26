/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {PossibleIterableArraySetOrCollectionHolder} from "../../src/CollectionHolder.types"

import {LazyGenericCollectionHolder} from "../../src/LazyGenericCollectionHolder"

export class LazyGenericCollectionHolder_ConstructorTest<T>
    extends LazyGenericCollectionHolder<T> {

    public constructor(reference: PossibleIterableArraySetOrCollectionHolder<T>,) {
        super(reference,)
        this.forEach(_ => {
        },)
    }

}
