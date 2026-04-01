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

import type {CollectionHolder}                           from "../../src/CollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../../src/type/callback"
import type {StraightCollectionHolderForTest}            from "./StraightCollectionHolderForTest"

import {LazyCollectionHolder} from "../../src/LazyCollectionHolder"
import {ABCD}                 from "../value/arrays"

export class LazyCollectionHolder_TakeLastWhileAlias
    extends LazyCollectionHolder<string>
    implements StraightCollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(ABCD,) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override takeLastWhile<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<string>,): CollectionHolder<string>
    public override takeLastWhile(predicate: BooleanCallback<string>,) {
        this.amountOfCall++
        return super.takeLastWhile(predicate,)
    }

}
