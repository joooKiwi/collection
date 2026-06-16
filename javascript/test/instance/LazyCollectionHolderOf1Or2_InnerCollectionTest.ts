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

import {CollectionHolderOf1} from "../../src/CollectionHolderOf1"
import {CollectionHolderOf2} from "../../src/CollectionHolderOf2"
import {Optional}            from "../../src/optional/Optional"
import {Couple}              from "../../src/tuple/Couple"

import {LazyCollectionHolderOf1Or2} from "../../src/LazyCollectionHolderOf1Or2"

export class LazyCollectionHolderOf1Or2_InnerCollectionTest<const T, >
    extends LazyCollectionHolderOf1Or2<T> {

    public constructor(latePossibleValue: () => Couple<| T | Optional<T>, T, Optional<T>>,) { super(latePossibleValue,) }

    public get innerCollection(): | CollectionHolderOf2<T> | CollectionHolderOf1<T> { return this._innerCollection }

}
