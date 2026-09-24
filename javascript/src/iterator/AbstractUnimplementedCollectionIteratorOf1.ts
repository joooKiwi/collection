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

import type {NullOrZeroNumber} from "@joookiwi/type"

import type {CollectionIteratorOf1} from "./CollectionIteratorOf1"

import {AbstractUnimplementedCollectionIterator} from "./AbstractUnimplementedCollectionIterator"

/**
 * A definition of a {@link CollectionIteratorOf1} to have a common ancestor.
 * But requiring nothing out of the instance in comparison to the direct implementors.
 *
 * @note This class should be inherited if new classes are being made to be more usable by the tools
 * @typeParam T The type (**mandatory**)
 * @see AbstractCollectionIteratorOf1
 * @see AbstractUnimplementedCollectionIterator
 * @see AbstractUnimplementedCollectionIteratorOf2
 */
export abstract class AbstractUnimplementedCollectionIteratorOf1<const T, >
    extends AbstractUnimplementedCollectionIterator<T>
    implements CollectionIteratorOf1<T> {

    //#region -------------------- Constructor --------------------

    protected constructor() { super() }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Value methods --------------------

    public abstract readonly 0: T

    public abstract readonly value: T

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Size methods --------------------

    public abstract override readonly size: 1

    public abstract override readonly isEmpty: false
    public abstract override readonly isNotEmpty: true

    public abstract override readonly hasExactly1Element: true
    public abstract override readonly hasAtMost1Element: true

    public abstract override readonly hasAtLeast2Elements: false
    public abstract override readonly hasExactly2Elements: false
    public abstract override readonly hasAtMost2Elements: true

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Index methods --------------------

    public abstract override readonly firstIndex: 0
    public abstract override readonly lastIndex: 0

    public abstract override readonly currentIndex: NullOrZeroNumber

    public abstract override readonly nextIndex: NullOrZeroNumber

    public abstract override readonly previousIndex: NullOrZeroNumber

    //#endregion -------------------- Index methods --------------------

    //#region -------------------- JavaScript methods --------------------

    public abstract override [Symbol.iterator](): AbstractUnimplementedCollectionIteratorOf1<T>

    //#endregion -------------------- JavaScript methods --------------------

    //#endregion -------------------- Methods --------------------

}
