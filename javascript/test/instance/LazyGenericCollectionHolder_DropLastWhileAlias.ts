//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {CollectionHolder}                           from "../../src/CollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../../src/type/callback"
import type {StraightCollectionHolderForTest}            from "./StraightCollectionHolderForTest"

import {LazyGenericCollectionHolder} from "../../src/LazyGenericCollectionHolder"
import {ABCD}                        from "../value/arrays"

export class LazyGenericCollectionHolder_DropLastWhileAlias
    extends LazyGenericCollectionHolder<string, readonly string[]>
    implements StraightCollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(ABCD,) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override dropLastWhile<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<string>,): CollectionHolder<string>
    public override dropLastWhile(predicate: BooleanCallback<string>,) {
        this.amountOfCall++
        return super.dropLastWhile(predicate,)
    }

}
