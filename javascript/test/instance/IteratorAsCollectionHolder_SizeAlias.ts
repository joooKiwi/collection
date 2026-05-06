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

import {IteratorAsCollectionHolder}  from "../../src/IteratorAsCollectionHolder"
import {CollectionIteratorFromArray} from "./CollectionIteratorFromArray"
import {ABCD}                        from "../value/arrays"

export class IteratorAsCollectionHolder_SizeAlias
    extends IteratorAsCollectionHolder<string>
    implements StraightCollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(new CollectionIteratorFromArray(ABCD,),) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override get size(): number {
        this.amountOfCall++
        return super.size
    }

}
