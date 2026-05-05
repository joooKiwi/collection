//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {PossibleIterableIteratorArraySetOrCollectionHolder} from "../../src/type/possibleInstance"

import {LazyCollectionHolder} from "../../src/LazyCollectionHolder"

export class LazyCollectionHolder_ConstructorTest<const T, >
    extends LazyCollectionHolder<T> {

    public constructor(reference: PossibleIterableIteratorArraySetOrCollectionHolder<T>,) {
        super(reference,)
        this.forEach(_ => {
        },)
    }

}
