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

import {ArrayOf2AsCollectionHolder} from "../../src/ArrayOf2AsCollectionHolder"
import {AB}                         from "../value/arrays"

export class ArrayOf2AsCollectionHolder_SizeAlias
    extends ArrayOf2AsCollectionHolder<string>
    implements StraightCollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(AB,) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override get size(): 2 {
        this.amountOfCall++
        return super.size
    }

}
