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

import type {CollectionHolderOf1}   from "../../src/CollectionHolderOf1"
import type {EmptyCollectionHolder} from "../../src/EmptyCollectionHolder"
import type {Optional}              from "../../src/optional/Optional"

import {LazyCollectionHolderOf0Or1} from "../../src/LazyCollectionHolderOf0Or1"

export class LazyCollectionHolderOf0Or1_InnerCollectionTest<const T, >
    extends LazyCollectionHolderOf0Or1<T> {

    public constructor(latePossibleValue: () => Optional<T>,) { super(latePossibleValue,) }

    public get innerCollection(): | CollectionHolderOf1<T> | EmptyCollectionHolder { return this._innerCollection }

}
