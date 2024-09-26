/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionIteratorForTest} from "./CollectionIteratorForTest"

import {EmptyCollectionIterator} from "../../src/iterator/EmptyCollectionIterator"

export class EmptyCollectionIterator_ForEachIndexedWatcher
    extends EmptyCollectionIterator
    implements CollectionIteratorForTest<never> {

    public amountOfCall = 0

    public constructor() { super() }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public override forEachIndexed(): this {
        this.amountOfCall++
        return super.forEach()
    }

}
