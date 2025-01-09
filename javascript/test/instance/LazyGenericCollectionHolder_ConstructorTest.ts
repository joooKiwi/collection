//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {PossibleIterableArraySetOrCollectionHolder} from "../../src/type/possibleInstance"

import {LazyGenericCollectionHolder} from "../../src/LazyGenericCollectionHolder"

export class LazyGenericCollectionHolder_ConstructorTest<T>
    extends LazyGenericCollectionHolder<T> {

    public constructor(reference: PossibleIterableArraySetOrCollectionHolder<T>,) {
        super(reference,)
        this.forEach(_ => {
        },)
    }

}
