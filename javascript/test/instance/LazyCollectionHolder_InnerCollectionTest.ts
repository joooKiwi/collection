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

import type {Array, Set} from "@joookiwi/type"

import type {CollectionHolder}                                   from "../../src/CollectionHolder"
import type {MinimalistCollectionHolder}                         from "../../src/MinimalistCollectionHolder"
import type {IterableWithCount}                                  from "../../src/iterable/IterableWithCount"
import type {IterableWithLength}                                 from "../../src/iterable/IterableWithLength"
import type {IterableWithPossibleSize}                           from "../../src/iterable/IterableWithPossibleSize"
import type {IterableWithSize}                                   from "../../src/iterable/IterableWithSize"
import type {CollectionIterator}                                 from "../../src/iterator/CollectionIterator"
import type {PossibleIterableIteratorArraySetOrCollectionHolder} from "../../src/type/possibleInstance"

import {LazyCollectionHolder} from "../../src/LazyCollectionHolder"

export class LazyCollectionHolder_InnerCollectionTest<const T, >
    extends LazyCollectionHolder<T> {

    public constructor(array:                                Array<T>,)
    public constructor(lateArray:                      () => Array<T>,)
    public constructor(set:                                  Set<T>,)
    public constructor(lateSet:                        () => Set<T>,)
    public constructor(collectionHolder:                     CollectionHolder<T>,)
    public constructor(lateCollectionHolder:           () => CollectionHolder<T>,)
    public constructor(minimalistCollectionHolder:           MinimalistCollectionHolder<T>,)
    public constructor(lateMinimalistCollectionHolder: () => MinimalistCollectionHolder<T>,)
    public constructor(collectionIterator:                   CollectionIterator<T>,)
    public constructor(lateCollectionIterator:         () => CollectionIterator<T>,)
    public constructor(iterator:                             Iterator<T, unknown, unknown>,)
    public constructor(lateIterator:                   () => Iterator<T, unknown, unknown>,)
    public constructor(iterableWithSize:                     IterableWithSize<T>,)
    public constructor(lateIterableWithSize:           () => IterableWithSize<T>,)
    public constructor(iterableWithLength:                   IterableWithLength<T>,)
    public constructor(lateIterableWithLength:         () => IterableWithLength<T>,)
    public constructor(iterableWithCount:                    IterableWithCount<T>,)
    public constructor(lateIterableWithCount:          () => IterableWithCount<T>,)
    public constructor(iterable:                             Iterable<T, unknown, unknown>,)
    public constructor(lateIterable:                   () => Iterable<T, unknown, unknown>,)
    public constructor(iterableWithPossibleSize:             IterableWithPossibleSize<T>,)
    public constructor(lateIterableWithPossibleSize:   () => IterableWithPossibleSize<T>,)
    public constructor(reference:                            PossibleIterableIteratorArraySetOrCollectionHolder<T>,)
    public constructor(lateReference:                  () => PossibleIterableIteratorArraySetOrCollectionHolder<T>,)
    public constructor(reference: PossibleIterableIteratorArraySetOrCollectionHolder<T> | (() => PossibleIterableIteratorArraySetOrCollectionHolder<T>),)
    public constructor(reference: | PossibleIterableIteratorArraySetOrCollectionHolder<T> | (() => PossibleIterableIteratorArraySetOrCollectionHolder<T>),) {
        super(reference,)
    }

    public get innerCollection(): CollectionHolder<T> { return this._innerCollection }

}
