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

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolderOf1}   from "../../src/CollectionHolderOf1"
import type {CollectionHolderOf2}   from "../../src/CollectionHolderOf2"
import type {EmptyCollectionHolder} from "../../src/EmptyCollectionHolder"
import type {Optional}              from "../../src/optional/Optional"
import type {Couple}                from "../../src/tuple/Couple"

import {LazyCollectionHolderOf0Or1Or2} from "../../src/LazyCollectionHolderOf0Or1Or2"

export class LazyCollectionHolderOf0Or1Or2_InnerCollectionTest<const T, >
    extends LazyCollectionHolderOf0Or1Or2<T> {

    public constructor(latePossibleValue: () => Optional<Couple<Optional<T>>>)
    public constructor(latePossibleValue: () => Nullable<Couple<Optional<T>>>)
    public constructor(latePossibleValue: () => Optional<Couple<Optional<T>>> | Nullable<Couple<Optional<T>>>,) {
        // @ts-ignore: It is only there to keep the constructor integrity
        super(latePossibleValue,)
    }

    public get innerCollection(): | CollectionHolderOf2<T> | CollectionHolderOf1<T> | EmptyCollectionHolder { return this._innerCollection }

}
