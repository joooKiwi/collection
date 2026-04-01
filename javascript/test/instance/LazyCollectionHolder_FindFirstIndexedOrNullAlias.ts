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

import type {NullOr}                                                   from "@joookiwi/type"
import type {ReverseBooleanCallback, ReverseRestrainedBooleanCallback} from "../../src/type/callback"
import type {StraightCollectionHolderForTest}                          from "./StraightCollectionHolderForTest"

import {LazyCollectionHolder} from "../../src/LazyCollectionHolder"
import {ABCD}                 from "../value/arrays"

export class LazyCollectionHolder_FindFirstIndexedOrNullAlias
    extends LazyCollectionHolder<string>
    implements StraightCollectionHolderForTest<string> {

    public amountOfCall = 0

    public constructor() { super(ABCD,) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override findFirstIndexedOrNull<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<string>,): NullOr<string>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<string>,) {
        this.amountOfCall++
        return super.findFirstIndexedOrNull(predicate,)
    }

}
