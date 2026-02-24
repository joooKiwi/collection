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

import type {BooleanCallback, RestrainedBooleanCallback} from "../../src/type/callback"
import type {StraightCollectionHolderForTest}            from "./StraightCollectionHolderForTest"

import {LazyGenericCollectionHolder} from "../../src/LazyGenericCollectionHolder"
import {ABCD}                        from "../value/arrays"

export class LazyGenericCollectionHolder_FindFirstAlias
    extends LazyGenericCollectionHolder<string>
    implements StraightCollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(ABCD,) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override findFirst<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): S
    public override findFirst(predicate: BooleanCallback<string>,): string
    public override findFirst(predicate: BooleanCallback<string>,) {
        this.amountOfCall++
        return super.findFirst(predicate,)
    }

}
