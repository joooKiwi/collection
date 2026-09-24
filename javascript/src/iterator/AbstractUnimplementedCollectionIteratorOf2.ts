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

import type {NullOrNumber} from "@joookiwi/type"

import type {CollectionIteratorOf2} from "./CollectionIteratorOf2"

import {AbstractUnimplementedCollectionIterator} from "./AbstractUnimplementedCollectionIterator"

/**
 * A definition of a {@link CollectionIteratorOf2} to have a common ancestor.
 * But requiring nothing out of the instance in comparison to the direct implementors.
 *
 * @note This class should be inherited if new classes are being made to be more usable by the tools
 * @typeParam T1 The 1st type (**mandatory**)
 * @typeParam T1 The 2nd type (**mandatory**)
 * @see AbstractCollectionIteratorOf2
 * @see AbstractUnimplementedCollectionIterator
 * @see AbstractUnimplementedCollectionIteratorOf1
 */
export abstract class AbstractUnimplementedCollectionIteratorOf2<const T1, const T2, >
    extends AbstractUnimplementedCollectionIterator<| T1 | T2>
    implements CollectionIteratorOf2<T1, T2> {

    //#region -------------------- Constructor --------------------

    protected constructor() { super() }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Value methods --------------------

    public abstract readonly 0: T1
    public abstract readonly 1: T2

    public abstract readonly value1: T1
    public abstract readonly value2: T2

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Size methods --------------------

    public abstract override readonly size: 2

    public abstract override readonly isEmpty: false
    public abstract override readonly isNotEmpty: true

    public abstract override readonly hasExactly1Element: false
    public abstract override readonly hasAtMost1Element: false

    public abstract override readonly hasAtLeast2Elements: true
    public abstract override readonly hasExactly2Elements: true
    public abstract override readonly hasAtMost2Elements: true

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Index methods --------------------

    public abstract override readonly firstIndex: 0
    public abstract override readonly lastIndex: 1

    public abstract override readonly currentIndex: NullOrNumber<| 0 | 1>

    public abstract override readonly nextIndex: NullOrNumber<| 0 | 1>

    public abstract override readonly previousIndex: NullOrNumber<| 0 | 1>

    //#endregion -------------------- Index methods --------------------

    //#region -------------------- JavaScript methods --------------------

    public abstract override [Symbol.iterator](): AbstractUnimplementedCollectionIteratorOf2<T1, T2>

    //#endregion -------------------- JavaScript methods --------------------

    //#endregion -------------------- Methods --------------------

}
