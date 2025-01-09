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

import type {CollectionIteratorForTest} from "./CollectionIteratorForTest"

import {EmptyCollectionIterator} from "../../src/iterator/EmptyCollectionIterator"

export class EmptyCollectionIterator_ForEachWatcher
    extends EmptyCollectionIterator
    implements CollectionIteratorForTest<never> {

    public amountOfCall = 0

    public constructor() { super() }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override forEach(): this {
        this.amountOfCall++
        return super.forEach()
    }

}
