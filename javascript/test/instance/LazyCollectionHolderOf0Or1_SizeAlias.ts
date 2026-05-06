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

import type {StraightCollectionHolderForTest} from "./StraightCollectionHolderForTest"

import {LazyCollectionHolderOf0Or1} from "../../src/LazyCollectionHolderOf0Or1"
import {EmptyOptional}              from "../../src/optional/EmptyOptional"

export class LazyCollectionHolderOf0Or1_SizeAlias
    extends LazyCollectionHolderOf0Or1<string>
    implements StraightCollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(() => EmptyOptional.get,) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override get size(): | 0 | 1 {
        this.amountOfCall++
        return super.size
    }

}
