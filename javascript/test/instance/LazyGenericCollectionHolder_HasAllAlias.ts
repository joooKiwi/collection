/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                           from "../../src/CollectionHolder"
import type {PossibleIterableArraySetOrCollectionHolder} from "../../src/CollectionHolder.types"
import type {MinimalistCollectionHolder}                 from "../../src/MinimalistCollectionHolder"
import type {CollectionIterator}                         from "../../src/iterator/CollectionIterator"

import {LazyGenericCollectionHolder} from "../../src/LazyGenericCollectionHolder"

export class LazyGenericCollectionHolder_HasAllAlias
    extends LazyGenericCollectionHolder {

    public amountOfCall = 0

    public constructor() { super([],) }

    public override hasAll(values: readonly unknown[],): boolean
    public override hasAll(values: ReadonlySet<unknown>,): boolean
    public override hasAll(values: CollectionHolder,): boolean
    public override hasAll(values: MinimalistCollectionHolder,): boolean
    public override hasAll(values: CollectionIterator,): boolean
    public override hasAll(values: Iterable<unknown>,): boolean
    public override hasAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public override hasAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) {
        this.amountOfCall++
        return super.hasAll(values,)
    }

}
