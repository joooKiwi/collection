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

import type {CollectionIteratorForTest} from "./CollectionIteratorForTest"

import {CollectionIteratorOf1} from "../../src/iterator/CollectionIteratorOf1"

export class CollectionIteratorOf1_SizeAlias
    extends CollectionIteratorOf1<string>
    implements CollectionIteratorForTest<string> {

    public amountOfCall = 0

    public constructor() { super('a',) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override get size(): 1 {
        this.amountOfCall++
        return super.size
    }

}
