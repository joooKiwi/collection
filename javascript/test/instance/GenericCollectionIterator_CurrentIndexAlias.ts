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

import type {NullOrNumber}              from "@joookiwi/type"
import type {CollectionIteratorForTest} from "./CollectionIteratorForTest"

import {GenericCollectionIterator} from "../../src/iterator/GenericCollectionIterator"
import {CollectionHolderFromArray} from "./CollectionHolderFromArray"
import {ABCD}                      from "../value/arrays"

export class GenericCollectionIterator_CurrentIndexAlias
    extends GenericCollectionIterator<string, CollectionHolderFromArray<string>>
    implements CollectionIteratorForTest<string> {

    public amountOfCall = 0

    public constructor() { super(new CollectionHolderFromArray(ABCD,),) }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override get currentIndex(): NullOrNumber {
        this.amountOfCall++
        return super.currentIndex
    }

}
