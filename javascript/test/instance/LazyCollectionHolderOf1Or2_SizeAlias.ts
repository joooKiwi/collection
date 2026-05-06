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

import {LazyCollectionHolderOf1Or2} from "../../src/LazyCollectionHolderOf1Or2"
import {EmptyOptional}              from "../../src/optional/EmptyOptional"
import {Couple}                     from "../../src/tuple/Couple"

export class LazyCollectionHolderOf1Or2_SizeAlias
    extends LazyCollectionHolderOf1Or2<string>
    implements StraightCollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(() => new Couple('a', EmptyOptional.get,),) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override get size(): | 1 | 2 {
        this.amountOfCall++
        return super.size
    }

}
