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

import type {Array, Nullable, NullableNumber, NullOrUndefined, NumberArray, NumberSet, Set} from "@joookiwi/type"

import type {CollectionHolder}                                                              from "./CollectionHolder"
import type {CollectionHolderOf1}                                                           from "./CollectionHolderOf1"
import type {CollectionHolderOf2}                                                           from "./CollectionHolderOf2"
import type {MinimalistCollectionHolder}                                                    from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                            from "./iterator/CollectionIterator"
import type {BooleanCallback, RestrainedBooleanCallback}                                    from "./type/callback"
import type {CollectionHolderOf1Or2, CollectionHolderOfAny1Or2, CollectionHolderOfLast1Or2} from "./type/collection"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                            from "./type/possibleInstance"

import {AbstractUnimplementedCollectionHolderOf2} from "./AbstractUnimplementedCollectionHolderOf2"
import {isArrayByStructure}                       from "./method/isArrayByStructure"
import {isCollectionHolder}                       from "./method/isCollectionHolder"
import {isCollectionHolderByStructure}            from "./method/isCollectionHolderByStructure"
import {isCollectionIterator}                     from "./method/isCollectionIterator"
import {isCollectionIteratorByStructure}          from "./method/isCollectionIteratorByStructure"
import {isIteratorByStructure}                    from "./method/isIteratorByStructure"
import {isMinimalistCollectionHolder}             from "./method/isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure}  from "./method/isMinimalistCollectionHolderByStructure"
import {isSetByStructure}                         from "./method/isSetByStructure"

/**
 * A definition of a {@link CollectionHolderOf2} to have a common ancestor.
 * It does not use any implementation like its parent {@link AbstractUnimplementedCollectionHolderOf2},
 * but gives less overhead on the methods that have multiple possible arguments.
 *
 * @apiNote This class is used to reduce complexity of methods that can support different type of arguments
 * @typeParam T1 The 1st type (**mandatory**)
 * @typeParam T2 The 2nd type (**mandatory**)
 * @see AbstractPartiallyUnimplementedCollectionHolder
 * @see AbstractPartiallyUnimplementedCollectionHolderOf1
 */
export abstract class AbstractPartiallyUnimplementedCollectionHolderOf2<const T1,
    const T2, >
    extends AbstractUnimplementedCollectionHolderOf2<T1, T2> {

    //#region -------------------- Constructor --------------------

    protected constructor() { super() }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Validation methods --------------------

    //#region -------------------- Any --------------------

    public override any(): this["isNotEmpty"]
    public override any<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): this is CollectionHolderOf1<S>
    public override any(predicate: NullOrUndefined,): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<| T1 | T2>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<| T1 | T2>>,) {
        if (predicate == null)
            return this.isNotEmpty
        return this._any(predicate,)
    }

    public override some(): this["isNotEmpty"]
    public override some<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): this is CollectionHolderOf1<S>
    public override some(predicate: NullOrUndefined,): this["isNotEmpty"]
    public override some(predicate: Nullable<BooleanCallback<| T1 | T2>>,): boolean
    public override some(predicate?: Nullable<BooleanCallback<| T1 | T2>>,) {
        if (predicate == null)
            return this.isNotEmpty
        return this._any(predicate,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolderOf2.any CollectionHolderOf2.any(predicate)} */
    protected abstract _any(predicate: BooleanCallback<| T1 | T2>,): boolean

    //#endregion -------------------- Any --------------------
    //#region -------------------- All --------------------

    public override all<const S extends T1, >(predicate: RestrainedBooleanCallback<| T1 | T2, | S | T2>,): this is CollectionHolderOf2<S, T2>
    public override all<const S extends T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, | T1 | S>,): this is CollectionHolderOf2<T1, S>
    public override all<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): this is CollectionHolderOf2<S, S>
    public override all(predicate: BooleanCallback<| T1 | T2>,): boolean
    public override all(predicate: BooleanCallback<| T1 | T2>,) {
        return this._all(predicate,)
    }

    public override every<const S extends T1, >(predicate: RestrainedBooleanCallback<| T1 | T2, | S | T2>,): this is CollectionHolderOf2<S, T2>
    public override every<const S extends T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, | T1 | S>,): this is CollectionHolderOf2<T1, S>
    public override every<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): this is CollectionHolderOf2<S, S>
    public override every(predicate: BooleanCallback<| T1 | T2>,): boolean
    public override every(predicate: BooleanCallback<| T1 | T2>,) {
        return this._all(predicate,)
    }

    protected abstract _all(predicate: BooleanCallback<| T1 | T2>,): boolean

    //#endregion -------------------- All --------------------
    //#region -------------------- None --------------------

    public override none(): this["isEmpty"]
    public override none<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): this is CollectionHolderOf1<Exclude<| T1 | T2, S>>
    public override none(predicate: NullOrUndefined,): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<| T1 | T2>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<| T1 | T2>>,) {
        if (predicate == null)
            return this.isEmpty
        return this._none(predicate,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolderOf2.none CollectionHolderOf2.none(predicate)} */
    protected abstract _none(predicate: BooleanCallback<| T1 | T2>,): boolean

    //#endregion -------------------- None --------------------

    //#region -------------------- Has one --------------------

    public override hasOne(values: Nullable<Array<| T1 | T2>>,): boolean
    public override hasOne(values: Nullable<Set<| T1 | T2>>,): boolean
    public override hasOne(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean
    public override hasOne(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean
    public override hasOne(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean
    public override hasOne(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,) {
        if (values == null)
            return this._hasOneByNull(values,)

        if (values instanceof Array)
            return this._hasOneByArray(values,)
        if (values instanceof Set)
            return this._hasOneBySet(values,)
        if (isCollectionHolder(values))
            return this._hasOneByCollectionHolder(values,)
        if (isMinimalistCollectionHolder(values,))
            return this._hasOneByMinimalistCollectionHolder(values,)
        if (isCollectionIterator(values,))
            return this._hasOneByCollectionIterator(values,)
        if (values instanceof Iterator)
            return this._hasOneByIterator(values,)

        if (isArrayByStructure<| T1 | T2>(values))
            return this._hasOneByArray(values,)
        if (isSetByStructure<| T1 | T2>(values))
            return this._hasOneBySet(values,)
        if (isCollectionHolderByStructure<| T1 | T2>(values))
            return this._hasOneByCollectionHolder(values,)
        if (isMinimalistCollectionHolderByStructure<| T1 | T2>(values,))
            return this._hasOneByMinimalistCollectionHolder(values,)
        if (isCollectionIteratorByStructure<| T1 | T2>(values,))
            return this._hasOneByCollectionIterator(values,)
        if (isIteratorByStructure<| T1 | T2>(values,))
            return this._hasOneByIterator(values,)
        return this._hasOneByIterable(values,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasOne CollectionHolderOf2.hasOne(values: NullOrUndefined)} */
    protected _hasOneByNull(_values: NullOrUndefined,): this["isNotEmpty"] {
        return this.isNotEmpty
    }

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasOne CollectionHolderOf2.hasOne(values: Array<T1 | T2>)} */
    protected abstract _hasOneByArray(values: Array<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasOne CollectionHolderOf2.hasOne(values: Set<T1 | T2>)} */
    protected abstract _hasOneBySet(values: Set<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasOne CollectionHolderOf2.hasOne(values: MinimalistCollectionHolder<T1 | T2>)} */
    protected abstract _hasOneByMinimalistCollectionHolder(values: MinimalistCollectionHolder<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasOne CollectionHolderOf2.hasOne(values: CollectionHolder<T1 | T2>)} */
    protected abstract _hasOneByCollectionHolder(values: CollectionHolder<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasOne CollectionHolderOf2.hasOne(values: CollectionIterator<T1 | T2>)} */
    protected abstract _hasOneByCollectionIterator(values: CollectionIterator<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasOne CollectionHolderOf2.hasOne(values: Iterator<T1 | T2>)} */
    protected abstract _hasOneByIterator(values: Iterator<| T1 | T2, unknown, unknown>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasOne CollectionHolderOf2.hasOne(values: Iterable<T1 | T2>)} */
    protected abstract _hasOneByIterable(values: Iterable<| T1 | T2, unknown, unknown>,): boolean

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

    public override hasNotOne(values: Nullable<Array<| T1 | T2>>,): boolean
    public override hasNotOne(values: Nullable<Set<| T1 | T2>>,): boolean
    public override hasNotOne(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean
    public override hasNotOne(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean
    public override hasNotOne(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean
    public override hasNotOne(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,) {
        if (values == null)
            return this._hasNotOneByNull(values,)

        if (values instanceof Array)
            return this._hasNotOneByArray(values,)
        if (values instanceof Set)
            return this._hasNotOneBySet(values,)
        if (isCollectionHolder(values,))
            return this._hasNotOneByCollectionHolder(values,)
        if (isMinimalistCollectionHolder(values,))
            return this._hasNotOneByMinimalistCollectionHolder(values,)
        if (isCollectionIterator(values,))
            return this._hasNotOneByCollectionIterator(values,)
        if (values instanceof Iterator)
            return this._hasNotOneByIterator(values,)

        if (isArrayByStructure<| T1 | T2>(values))
            return this._hasNotOneByArray(values,)
        if (isSetByStructure<| T1 | T2>(values))
            return this._hasNotOneBySet(values,)
        if (isCollectionHolderByStructure<| T1 | T2>(values))
            return this._hasNotOneByCollectionHolder(values,)
        if (isMinimalistCollectionHolderByStructure<| T1 | T2>(values,))
            return this._hasNotOneByMinimalistCollectionHolder(values,)
        if (isCollectionIteratorByStructure<| T1 | T2>(values,))
            return this._hasNotOneByCollectionIterator(values,)
        if (isIteratorByStructure<| T1 | T2>(values,))
            return this._hasNotOneByIterator(values,)
        return this._hasNotOneByIterable(values,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasNotOne CollectionHolderOf2.hasNotOne(values: NullOrUndefined)} */
    protected _hasNotOneByNull(_values: NullOrUndefined,): this["isEmpty"] {
        return this.isEmpty
    }

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasNotOne CollectionHolderOf2.hasNotOne(values: Array<T1 | T2>)} */
    protected abstract _hasNotOneByArray(values: Array<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasNotOne CollectionHolderOf2.hasNotOne(values: Set<T1 | T2>)} */
    protected abstract _hasNotOneBySet(values: Set<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasNotOne CollectionHolderOf2.hasNotOne(values: MinimalistCollectionHolder<T1 | T2>)} */
    protected abstract _hasNotOneByMinimalistCollectionHolder(values: MinimalistCollectionHolder<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasNotOne CollectionHolderOf2.hasNotOne(values: CollectionHolder<T1 | T2>)} */
    protected abstract _hasNotOneByCollectionHolder(values: CollectionHolder<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasNotOne CollectionHolderOf2.hasNotOne(values: CollectionIterator<T1 | T2>)} */
    protected abstract _hasNotOneByCollectionIterator(values: CollectionIterator<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasNotOne CollectionHolderOf2.hasNotOne(values: Iterator<T1 | T2>)} */
    protected abstract _hasNotOneByIterator(values: Iterator<| T1 | T2, unknown, unknown>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasNotOne CollectionHolderOf2.hasNotOne(values: Iterable<T1 | T2>)} */
    protected abstract _hasNotOneByIterable(values: Iterable<| T1 | T2, unknown, unknown>,): boolean

    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

    public override hasAll(values: Nullable<Array<| T1 | T2>>,): boolean
    public override hasAll(values: Nullable<Set<| T1 | T2>>,): boolean
    public override hasAll(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean
    public override hasAll(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean
    public override hasAll(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean
    public override hasAll(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,) {
        if (values == null)
            return this._hasAllByNull(values,)

        if (values instanceof Array)
            return this._hasAllByArray(values,)
        if (values instanceof Set)
            return this._hasAllBySet(values,)
        if (isCollectionHolder(values))
            return this._hasAllByCollectionHolder(values,)
        if (isMinimalistCollectionHolder(values,))
            return this._hasAllByMinimalistCollectionHolder(values,)
        if (isCollectionIterator(values,))
            return this._hasAllByCollectionIterator(values,)
        if (values instanceof Iterator)
            return this._hasAllByIterator(values,)

        if (isArrayByStructure<| T1 | T2>(values))
            return this._hasAllByArray(values,)
        if (isSetByStructure<| T1 | T2>(values))
            return this._hasAllBySet(values,)
        if (isCollectionHolderByStructure<| T1 | T2>(values))
            return this._hasAllByCollectionHolder(values,)
        if (isMinimalistCollectionHolderByStructure<| T1 | T2>(values,))
            return this._hasAllByMinimalistCollectionHolder(values,)
        if (isCollectionIteratorByStructure<| T1 | T2>(values,))
            return this._hasAllByCollectionIterator(values,)
        if (isIteratorByStructure<| T1 | T2>(values,))
            return this._hasAllByIterator(values,)
        return this._hasAllByIterable(values,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasAll CollectionHolderOf2.hasAll(values: NullOrUndefined)} */
    protected _hasAllByNull(_values: NullOrUndefined,): true {
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasAll CollectionHolderOf2.hasAll(values: Array<T1 | T2>)} */
    protected abstract _hasAllByArray(values: Array<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasAll CollectionHolderOf2.hasAll(values: Set<T1 | T2>)} */
    protected abstract _hasAllBySet(values: Set<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasAll CollectionHolderOf2.hasAll(values: MinimalistCollectionHolder<T1 | T2>)} */
    protected abstract _hasAllByMinimalistCollectionHolder(values: MinimalistCollectionHolder<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasAll CollectionHolderOf2.hasAll(values: CollectionHolder<T1 | T2>)} */
    protected abstract _hasAllByCollectionHolder(values: CollectionHolder<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasAll CollectionHolderOf2.hasAll(values: CollectionIterator<T1 | T2>)} */
    protected abstract _hasAllByCollectionIterator(values: CollectionIterator<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasAll CollectionHolderOf2.hasAll(values: Iterator<T1 | T2>)} */
    protected abstract _hasAllByIterator(values: Iterator<| T1 | T2, unknown, unknown>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasAll CollectionHolderOf2.hasAll(values: Iterable<T1 | T2>)} */
    protected abstract _hasAllByIterable(values: Iterable<| T1 | T2, unknown, unknown>,): boolean

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

    public override hasNotAll(values: Nullable<Array<| T1 | T2>>,): boolean
    public override hasNotAll(values: Nullable<Set<| T1 | T2>>,): boolean
    public override hasNotAll(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean
    public override hasNotAll(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean
    public override hasNotAll(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean
    public override hasNotAll(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,) {
        if (values == null)
            return this._hasNotAllByNull(values,)

        if (values instanceof Array)
            return this._hasNotAllByArray(values,)
        if (values instanceof Set)
            return this._hasNotAllBySet(values,)
        if (isCollectionHolder(values,))
            return this._hasNotAllByCollectionHolder(values,)
        if (isMinimalistCollectionHolder(values,))
            return this._hasNotAllByMinimalistCollectionHolder(values,)
        if (isCollectionIterator(values,))
            return this._hasNotAllByCollectionIterator(values,)
        if (values instanceof Iterator)
            return this._hasNotAllByIterator(values,)

        if (isArrayByStructure<| T1 | T2>(values,))
            return this._hasNotAllByArray(values,)
        if (isSetByStructure<| T1 | T2>(values,))
            return this._hasNotAllBySet(values,)
        if (isCollectionHolderByStructure<| T1 | T2>(values,))
            return this._hasNotAllByCollectionHolder(values,)
        if (isMinimalistCollectionHolderByStructure<| T1 | T2>(values,))
            return this._hasNotAllByMinimalistCollectionHolder(values,)
        if (isCollectionIteratorByStructure<| T1 | T2>(values,))
            return this._hasNotAllByCollectionIterator(values,)
        if (isIteratorByStructure<| T1 | T2>(values,))
            return this._hasNotAllByIterator(values,)
        return this._hasNotAllByIterable(values,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasNotAll CollectionHolderOf2.hasNotAll(values: NullOrUndefined)} */
    protected _hasNotAllByNull(_values: NullOrUndefined,): false {
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasNotAll CollectionHolderOf2.hasNotAll(values: Array<T1 | T2>)} */
    protected abstract _hasNotAllByArray(values: Array<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasNotAll CollectionHolderOf2.hasNotAll(values: Set<T1 | T2>)} */
    protected abstract _hasNotAllBySet(values: Set<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasNotAll CollectionHolderOf2.hasNotAll(values: MinimalistCollectionHolder<T1 | T2>)} */
    protected abstract _hasNotAllByMinimalistCollectionHolder(values: MinimalistCollectionHolder<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasNotAll CollectionHolderOf2.hasNotAll(values: CollectionHolder<T1 | T2>)} */
    protected abstract _hasNotAllByCollectionHolder(values: CollectionHolder<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasNotAll CollectionHolderOf2.hasNotAll(values: CollectionIterator<T1 | T2>)} */
    protected abstract _hasNotAllByCollectionIterator(values: CollectionIterator<| T1 | T2>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasNotAll CollectionHolderOf2.hasNotAll(values: Iterator<T1 | T2>)} */
    protected abstract _hasNotAllByIterator(values: Iterator<| T1 | T2, unknown, unknown>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.hasNotAll CollectionHolderOf2.hasNotAll(values: Iterable<T1 | T2>)} */
    protected abstract _hasNotAllByIterable(values: Iterable<| T1 | T2, unknown, unknown>,): boolean

    //#endregion -------------------- Has not all --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Slice --------------------

    public override slice(): CollectionHolderOf2<T1, T2>
    public override slice(from?: NullableNumber, to?: NullableNumber,): CollectionHolderOf1Or2<T1, T2>
    public override slice(indices: NumberArray,): CollectionHolder<| T1 | T2>
    public override slice(indices: NumberSet,): CollectionHolder<| T1 | T2>
    public override slice(indices: CollectionHolder<number>,): CollectionHolder<| T1 | T2>
    public override slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<| T1 | T2>
    public override slice(indices: CollectionIterator<number>,): CollectionHolder<| T1 | T2>
    public override slice(indices: Iterator<number, unknown, unknown>,): CollectionHolder<| T1 | T2>
    public override slice(indices: Iterable<number, unknown, unknown>,): CollectionHolder<| T1 | T2>
    public override slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<| T1 | T2>
    public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,): CollectionHolder<| T1 | T2>
    public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,) {
        //#region -------------------- 0 arguments --------------------

        if (arguments.length === 0)
            return this._sliceWith0Argument()

        //#endregion -------------------- 0 arguments --------------------
        //#region -------------------- 1 argument --------------------

        if (arguments.length === 1)
            if (indicesOrFrom == null)
                return this._sliceWith0Argument()
            else if (typeof indicesOrFrom == "number")
                return this._sliceWith1Argument(indicesOrFrom,)
            else if (indicesOrFrom instanceof Array)
                return this._sliceByArray(indicesOrFrom,)
            else if (indicesOrFrom instanceof Set)
                return this._sliceBySet(indicesOrFrom,)
            else if (isCollectionHolder(indicesOrFrom,))
                return this._sliceByCollectionHolder(indicesOrFrom,)
            else if (isMinimalistCollectionHolder(indicesOrFrom,))
                return this._sliceByMinimalistCollectionHolder(indicesOrFrom,)
            else if (isCollectionIterator(indicesOrFrom,))
                return this._sliceByCollectionIterator(indicesOrFrom,)
            else if (indicesOrFrom instanceof Iterator)
                return this._sliceByIterator(indicesOrFrom,)

            else if (isArrayByStructure<number>(indicesOrFrom,))
                return this._sliceByArray(indicesOrFrom,)
            else if (isSetByStructure<number>(indicesOrFrom,))
                return this._sliceBySet(indicesOrFrom,)
            else if (isCollectionHolderByStructure<number>(indicesOrFrom,))
                return this._sliceByCollectionHolder(indicesOrFrom,)
            else if (isMinimalistCollectionHolderByStructure<number>(indicesOrFrom,))
                return this._sliceByMinimalistCollectionHolder(indicesOrFrom,)
            else if (isCollectionIteratorByStructure<number>(indicesOrFrom,))
                return this._sliceByCollectionIterator(indicesOrFrom,)
            else if (isIteratorByStructure<number>(indicesOrFrom,))
                return this._sliceByIterator(indicesOrFrom,)
            else
                return this._sliceByIterable(indicesOrFrom,)

        //#endregion -------------------- 1 argument --------------------
        //#region -------------------- 2 arguments --------------------

        if (indicesOrFrom == null)
            if (to == null)
                return this._sliceWith0Argument()
            else
                return this._sliceWith2ArgumentWhere1stIsNull(indicesOrFrom, to,)


        if (to == null)
            if (typeof indicesOrFrom == "number")
                return this._sliceWith1Argument(indicesOrFrom,)
            else if (indicesOrFrom instanceof Array)
                return this._sliceByArray(indicesOrFrom,)
            else if (indicesOrFrom instanceof Set)
                return this._sliceBySet(indicesOrFrom,)
            else if (isCollectionHolder(indicesOrFrom,))
                return this._sliceByCollectionHolder(indicesOrFrom,)
            else if (isMinimalistCollectionHolder(indicesOrFrom,))
                return this._sliceByMinimalistCollectionHolder(indicesOrFrom,)
            else if (isCollectionIterator(indicesOrFrom,))
                return this._sliceByCollectionIterator(indicesOrFrom,)
            else if (indicesOrFrom instanceof Iterator)
                return this._sliceByIterator(indicesOrFrom,)

            else if (isArrayByStructure<number>(indicesOrFrom,))
                return this._sliceByArray(indicesOrFrom,)
            else if (isSetByStructure<number>(indicesOrFrom,))
                return this._sliceBySet(indicesOrFrom,)
            else if (isCollectionHolderByStructure<number>(indicesOrFrom,))
                return this._sliceByCollectionHolder(indicesOrFrom,)
            else if (isMinimalistCollectionHolderByStructure<number>(indicesOrFrom,))
                return this._sliceByMinimalistCollectionHolder(indicesOrFrom,)
            else if (isCollectionIteratorByStructure<number>(indicesOrFrom,))
                return this._sliceByCollectionIterator(indicesOrFrom,)
            else if (isIteratorByStructure<number>(indicesOrFrom,))
                return this._sliceByIterator(indicesOrFrom,)
            else
                return this._sliceByIterable(indicesOrFrom,)


        if (typeof indicesOrFrom == "number")
            return this._sliceWith2Argument(indicesOrFrom, to,)
        if (indicesOrFrom instanceof Array)
            return this._sliceByArray(indicesOrFrom,)
        if (indicesOrFrom instanceof Set)
            return this._sliceBySet(indicesOrFrom,)
        if (isCollectionHolder(indicesOrFrom,))
            return this._sliceByCollectionHolder(indicesOrFrom,)
        if (isMinimalistCollectionHolder(indicesOrFrom,))
            return this._sliceByMinimalistCollectionHolder(indicesOrFrom,)
        if (isCollectionIterator(indicesOrFrom,))
            return this._sliceByCollectionIterator(indicesOrFrom,)
        if (indicesOrFrom instanceof Iterator)
            return this._sliceByIterator(indicesOrFrom,)

        if (isArrayByStructure<number>(indicesOrFrom,))
            return this._sliceByArray(indicesOrFrom,)
        if (isSetByStructure<number>(indicesOrFrom,))
            return this._sliceBySet(indicesOrFrom,)
        if (isCollectionHolderByStructure<number>(indicesOrFrom,))
            return this._sliceByCollectionHolder(indicesOrFrom,)
        if (isMinimalistCollectionHolderByStructure<number>(indicesOrFrom,))
            return this._sliceByMinimalistCollectionHolder(indicesOrFrom,)
        if (isCollectionIteratorByStructure<number>(indicesOrFrom,))
            return this._sliceByCollectionIterator(indicesOrFrom,)
        if (isIteratorByStructure<number>(indicesOrFrom,))
            return this._sliceByIterator(indicesOrFrom,)
        return this._sliceByIterable(indicesOrFrom,)

        //#endregion -------------------- 2 arguments --------------------
    }


    /** An additional method to be the equivalent of {@link CollectionHolderOf2.slice CollectionHolderOf2.slice()} */
    protected abstract _sliceWith0Argument(): CollectionHolderOf2<T1, T2>

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.slice CollectionHolderOf2.slice(from)} */
    protected abstract _sliceWith1Argument(from: number,): CollectionHolderOfLast1Or2<T1, T2>

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.slice CollectionHolderOf2.slice(from, to)} */
    protected abstract _sliceWith2Argument(from: number, to: number,): CollectionHolderOfAny1Or2<T1, T2>

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.slice CollectionHolderOf2.slice(null, to)} */
    protected abstract _sliceWith2ArgumentWhere1stIsNull(from: NullOrUndefined, to: number,): CollectionHolderOf1Or2<T1, T2>

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.slice CollectionHolderOf2.slice(indices: NumberArray)} */
    protected abstract _sliceByArray(indices: NumberArray,): CollectionHolder<| T1 | T2>

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.slice CollectionHolderOf2.slice(indices: NumberSet)} */
    protected abstract _sliceBySet(indices: NumberSet,): CollectionHolder<| T1 | T2>

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.slice CollectionHolderOf2.slice(indices: MinimalistCollectionHolder<number>)} */
    protected abstract _sliceByMinimalistCollectionHolder(indices: MinimalistCollectionHolder<number>,): CollectionHolder<| T1 | T2>

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.slice CollectionHolderOf2.slice(indices: CollectionHolder<number>)} */
    protected abstract _sliceByCollectionHolder(indices: CollectionHolder<number>,): CollectionHolder<| T1 | T2>

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.slice CollectionHolderOf2.slice(indices: CollectionIterator<number>)} */
    protected abstract _sliceByCollectionIterator(indices: CollectionIterator<number>,): CollectionHolder<| T1 | T2>

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.slice CollectionHolderOf2.slice(indices: Iterator<number>)} */
    protected abstract _sliceByIterator(indices: Iterator<number, unknown, unknown>,): CollectionHolder<| T1 | T2>

    /** An additional method to be the equivalent of {@link CollectionHolderOf2.slice CollectionHolderOf2.slice(indices: Iterable<number>)} */
    protected abstract _sliceByIterable(indices: Iterable<number, unknown, unknown>,): CollectionHolder<| T1 | T2>

    //#endregion -------------------- Slice --------------------

    //#endregion -------------------- Transformation methods --------------------

    //#region -------------------- Methods --------------------

}
