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

import {SetOf1AsCollectionHolder} from "../../src/SetOf1AsCollectionHolder"
import {A}                        from "../value/arrays"

export class SetOf1AsCollectionHolder_SizeAlias
    extends SetOf1AsCollectionHolder<string>
    implements StraightCollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(new Set(A,),) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override get size(): 1 {
        this.amountOfCall++
        return super.size
    }

}
