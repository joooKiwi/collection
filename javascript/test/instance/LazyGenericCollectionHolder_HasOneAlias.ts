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

export class LazyGenericCollectionHolder_HasOneAlias
    extends LazyGenericCollectionHolder {

    public amountOfCall = 0

    public constructor() { super([],) }

    public override hasOne(values: readonly unknown[],): boolean
    public override hasOne(values: ReadonlySet<unknown>,): boolean
    public override hasOne(values: CollectionHolder,): boolean
    public override hasOne(values: MinimalistCollectionHolder,): boolean
    public override hasOne(values: CollectionIterator,): boolean
    public override hasOne(values: Iterable<unknown>,): boolean
    public override hasOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public override hasOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) {
        this.amountOfCall++
        return super.hasOne(values,)
    }

}
