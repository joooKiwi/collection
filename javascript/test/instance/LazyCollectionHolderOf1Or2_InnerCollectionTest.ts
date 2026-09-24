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

import type {CollectionHolderOf1} from "../../src/CollectionHolderOf1"
import type {CollectionHolderOf2} from "../../src/CollectionHolderOf2"
import type {Optional}            from "../../src/optional/Optional"
import type {Couple}              from "../../src/tuple/Couple"

import {LazyCollectionHolderOf1Or2} from "../../src/LazyCollectionHolderOf1Or2"

/**
 * A {@link LazyCollectionHolderOf1Or2} that exposes the inner-collection for the purpose of the tests
 *
 * @typeParam T The type (**mandatory**)
 */
export class LazyCollectionHolderOf1Or2_InnerCollectionTest<const T, >
    extends LazyCollectionHolderOf1Or2<T> {

    public constructor(latePossibleValue: () => Couple<T, Optional<T>>,) { super(latePossibleValue,) }

    public get innerCollection(): | CollectionHolderOf2<T> | CollectionHolderOf1<T> { return this._innerCollection }

}
