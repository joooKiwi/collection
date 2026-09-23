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

import type {CollectionHolder}                                   from "./CollectionHolder"
import type {CollectionHolderOf1}                                from "./CollectionHolderOf1"
import type {MinimalistCollectionHolder}                         from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                 from "./iterator/CollectionIterator"
import type {BooleanCallback, RestrainedBooleanCallback}         from "./type/callback"
import type {PossibleIterableIteratorArraySetOrCollectionHolder} from "./type/possibleInstance"

import {AbstractUnimplementedCollectionHolderOf1} from "./AbstractUnimplementedCollectionHolderOf1"
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
 * A definition of a {@link CollectionHolderOf1} to have a common ancestor.
 * It does not use any implementation like its parent {@link AbstractUnimplementedCollectionHolderOf1},
 * but gives less overhead on the methods that have multiple possible arguments.
 *
 * @apiNote This class is used to reduce complexity of methods that can support different type of arguments
 * @typeParam T The type (by default `unknown`)
 * @see AbstractPartiallyUnimplementedCollectionHolder
 * @see AbstractPartiallyUnimplementedCollectionHolderOf2
 */
export abstract class AbstractPartiallyUnimplementedCollectionHolderOf1<const T = unknown, >
    extends AbstractUnimplementedCollectionHolderOf1<T> {

    //#region -------------------- Constructor --------------------

    protected constructor() { super() }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Validation methods --------------------

    //#region -------------------- Any --------------------

    public override any(): this["isNotEmpty"]
    public override any<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolderOf1<S>
    public override any(predicate: NullOrUndefined,): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) {
        if (predicate == null)
            return this.isNotEmpty
        return this._any(predicate,)
    }

    public override some(): this["isNotEmpty"]
    public override some<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolderOf1<S>
    public override some(predicate: NullOrUndefined,): this["isNotEmpty"]
    public override some(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override some(predicate?: Nullable<BooleanCallback<T>>,) {
        if (predicate == null)
            return this.isNotEmpty
        return this._any(predicate,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolderOf1.any CollectionHolderOf1.any(predicate)} */
    protected abstract _any(predicate: BooleanCallback<T>,): boolean

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    public override none(): this["isEmpty"]
    public override none<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolderOf1<Exclude<T, S>>
    public override none(predicate: NullOrUndefined,): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) {
        if (predicate == null)
            return this.isEmpty
        return this._none(predicate,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolderOf1.none CollectionHolderOf1.none(predicate)} */
    protected abstract _none(predicate: BooleanCallback<T>,): boolean

    //#endregion -------------------- None --------------------

    //#region -------------------- Has one --------------------

    public override hasOne(values: Nullable<Array<T>>,): boolean
    public override hasOne(values: Nullable<Set<T>>,): boolean
    public override hasOne(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasOne(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
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

        if (isArrayByStructure<T>(values))
            return this._hasOneByArray(values,)
        if (isSetByStructure<T>(values))
            return this._hasOneBySet(values,)
        if (isCollectionHolderByStructure<T>(values))
            return this._hasOneByCollectionHolder(values,)
        if (isMinimalistCollectionHolderByStructure<T>(values,))
            return this._hasOneByMinimalistCollectionHolder(values,)
        if (isCollectionIteratorByStructure<T>(values,))
            return this._hasOneByCollectionIterator(values,)
        if (isIteratorByStructure<T>(values,))
            return this._hasOneByIterator(values,)
        return this._hasOneByIterable(values,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasOne CollectionHolderOf1.hasOne(values: NullOrUndefined)} */
    protected _hasOneByNull(_values: NullOrUndefined,): this["isNotEmpty"] {
        return this.isNotEmpty
    }

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasOne CollectionHolderOf1.hasOne(values: Array<T>)} */
    protected abstract _hasOneByArray(values: Array<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasOne CollectionHolderOf1.hasOne(values: Set<T>)} */
    protected abstract _hasOneBySet(values: Set<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasOne CollectionHolderOf1.hasOne(values: MinimalistCollectionHolder<T>)} */
    protected abstract _hasOneByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasOne CollectionHolderOf1.hasOne(values: CollectionHolder<T>)} */
    protected abstract _hasOneByCollectionHolder(values: CollectionHolder<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasOne CollectionHolderOf1.hasOne(values: CollectionIterator<T>)} */
    protected abstract _hasOneByCollectionIterator(values: CollectionIterator<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasOne CollectionHolderOf1.hasOne(values: Iterator<T>)} */
    protected abstract _hasOneByIterator(values: Iterator<T, unknown, unknown>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasOne CollectionHolderOf1.hasOne(values: Iterable<T>)} */
    protected abstract _hasOneByIterable(values: Iterable<T, unknown, unknown>,): boolean

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

    public override hasNotOne(values: Nullable<Array<T>>,): boolean
    public override hasNotOne(values: Nullable<Set<T>>,): boolean
    public override hasNotOne(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasNotOne(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
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

        if (isArrayByStructure<T>(values))
            return this._hasNotOneByArray(values,)
        if (isSetByStructure<T>(values))
            return this._hasNotOneBySet(values,)
        if (isCollectionHolderByStructure<T>(values))
            return this._hasNotOneByCollectionHolder(values,)
        if (isMinimalistCollectionHolderByStructure<T>(values,))
            return this._hasNotOneByMinimalistCollectionHolder(values,)
        if (isCollectionIteratorByStructure<T>(values,))
            return this._hasNotOneByCollectionIterator(values,)
        if (isIteratorByStructure<T>(values,))
            return this._hasNotOneByIterator(values,)
        return this._hasNotOneByIterable(values,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasNotOne CollectionHolderOf1.hasNotOne(values: NullOrUndefined)} */
    protected _hasNotOneByNull(_values: NullOrUndefined,): this["isEmpty"] {
        return this.isEmpty
    }

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasNotOne CollectionHolderOf1.hasNotOne(values: Array<T>)} */
    protected abstract _hasNotOneByArray(values: Array<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasNotOne CollectionHolderOf1.hasNotOne(values: Set<T>)} */
    protected abstract _hasNotOneBySet(values: Set<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasNotOne CollectionHolderOf1.hasNotOne(values: MinimalistCollectionHolder<T>)} */
    protected abstract _hasNotOneByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasNotOne CollectionHolderOf1.hasNotOne(values: CollectionHolder<T>)} */
    protected abstract _hasNotOneByCollectionHolder(values: CollectionHolder<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasNotOne CollectionHolderOf1.hasNotOne(values: CollectionIterator<T>)} */
    protected abstract _hasNotOneByCollectionIterator(values: CollectionIterator<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasNotOne CollectionHolderOf1.hasNotOne(values: Iterator<T>)} */
    protected abstract _hasNotOneByIterator(values: Iterator<T, unknown, unknown>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasNotOne CollectionHolderOf1.hasNotOne(values: Iterable<T>)} */
    protected abstract _hasNotOneByIterable(values: Iterable<T, unknown, unknown>,): boolean

    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

    public override hasAll(values: Nullable<Array<T>>,): boolean
    public override hasAll(values: Nullable<Set<T>>,): boolean
    public override hasAll(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasAll(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
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

        if (isArrayByStructure<T>(values))
            return this._hasAllByArray(values,)
        if (isSetByStructure<T>(values))
            return this._hasAllBySet(values,)
        if (isCollectionHolderByStructure<T>(values))
            return this._hasAllByCollectionHolder(values,)
        if (isMinimalistCollectionHolderByStructure<T>(values,))
            return this._hasAllByMinimalistCollectionHolder(values,)
        if (isCollectionIteratorByStructure<T>(values,))
            return this._hasAllByCollectionIterator(values,)
        if (isIteratorByStructure<T>(values,))
            return this._hasAllByIterator(values,)
        return this._hasAllByIterable(values,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasAll CollectionHolderOf1.hasAll(values: NullOrUndefined)} */
    protected _hasAllByNull(_values: NullOrUndefined,): true {
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasAll CollectionHolderOf1.hasAll(values: Array<T>)} */
    protected abstract _hasAllByArray(values: Array<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasAll CollectionHolderOf1.hasAll(values: Set<T>)} */
    protected abstract _hasAllBySet(values: Set<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasAll CollectionHolderOf1.hasAll(values: MinimalistCollectionHolder<T>)} */
    protected abstract _hasAllByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasAll CollectionHolderOf1.hasAll(values: CollectionHolder<T>)} */
    protected abstract _hasAllByCollectionHolder(values: CollectionHolder<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasAll CollectionHolderOf1.hasAll(values: CollectionIterator<T>)} */
    protected abstract _hasAllByCollectionIterator(values: CollectionIterator<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasAll CollectionHolderOf1.hasAll(values: Iterator<T>)} */
    protected abstract _hasAllByIterator(values: Iterator<T, unknown, unknown>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasAll CollectionHolderOf1.hasAll(values: Iterable<T>)} */
    protected abstract _hasAllByIterable(values: Iterable<T, unknown, unknown>,): boolean

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

    public override hasNotAll(values: Nullable<Array<T>>,): boolean
    public override hasNotAll(values: Nullable<Set<T>>,): boolean
    public override hasNotAll(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasNotAll(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
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

        if (isArrayByStructure<T>(values,))
            return this._hasNotAllByArray(values,)
        if (isSetByStructure<T>(values,))
            return this._hasNotAllBySet(values,)
        if (isCollectionHolderByStructure<T>(values,))
            return this._hasNotAllByCollectionHolder(values,)
        if (isMinimalistCollectionHolderByStructure<T>(values,))
            return this._hasNotAllByMinimalistCollectionHolder(values,)
        if (isCollectionIteratorByStructure<T>(values,))
            return this._hasNotAllByCollectionIterator(values,)
        if (isIteratorByStructure<T>(values,))
            return this._hasNotAllByIterator(values,)
        return this._hasNotAllByIterable(values,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasNotAll CollectionHolderOf1.hasNotAll(values: NullOrUndefined)} */
    protected _hasNotAllByNull(_values: NullOrUndefined,): false {
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasNotAll CollectionHolderOf1.hasNotAll(values: Array<T>)} */
    protected abstract _hasNotAllByArray(values: Array<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasNotAll CollectionHolderOf1.hasNotAll(values: Set<T>)} */
    protected abstract _hasNotAllBySet(values: Set<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasNotAll CollectionHolderOf1.hasNotAll(values: MinimalistCollectionHolder<T>)} */
    protected abstract _hasNotAllByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasNotAll CollectionHolderOf1.hasNotAll(values: CollectionHolder<T>)} */
    protected abstract _hasNotAllByCollectionHolder(values: CollectionHolder<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasNotAll CollectionHolderOf1.hasNotAll(values: CollectionIterator<T>)} */
    protected abstract _hasNotAllByCollectionIterator(values: CollectionIterator<T>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasNotAll CollectionHolderOf1.hasNotAll(values: Iterator<T>)} */
    protected abstract _hasNotAllByIterator(values: Iterator<T, unknown, unknown>,): boolean

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.hasNotAll CollectionHolderOf1.hasNotAll(values: Iterable<T>)} */
    protected abstract _hasNotAllByIterable(values: Iterable<T, unknown, unknown>,): boolean

    //#endregion -------------------- Has not all --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Slice --------------------

    public override slice(from?: NullableNumber, to?: NullableNumber,): CollectionHolderOf1<T>
    public override slice(indices: NumberArray,): CollectionHolder<T>
    public override slice(indices: NumberSet,): CollectionHolder<T>
    public override slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public override slice(indices: IteratorObject<number, unknown, unknown>,): CollectionHolder<T>
    public override slice(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T>
    public override slice(indices: Iterable<number, unknown, unknown>,): CollectionHolder<T>
    public override slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,): CollectionHolder<T>
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


    /** An additional method to be the equivalent of {@link CollectionHolderOf1.slice CollectionHolderOf1.slice()} */
    protected abstract _sliceWith0Argument(): CollectionHolderOf1<T>

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.slice CollectionHolderOf1.slice(from)} */
    protected abstract _sliceWith1Argument(from: number,): CollectionHolderOf1<T>

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.slice CollectionHolderOf1.slice(from, to)} */
    protected abstract _sliceWith2Argument(from: number, to: number,): CollectionHolderOf1<T>

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.slice CollectionHolderOf1.slice(null, to)} */
    protected abstract _sliceWith2ArgumentWhere1stIsNull(from: NullOrUndefined, to: number,): CollectionHolderOf1<T>

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.slice CollectionHolderOf1.slice(indices: NumberArray)} */
    protected abstract _sliceByArray(indices: NumberArray,): CollectionHolder<T>

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.slice CollectionHolderOf1.slice(indices: NumberSet)} */
    protected abstract _sliceBySet(indices: NumberSet,): CollectionHolder<T>

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.slice CollectionHolderOf1.slice(indices: MinimalistCollectionHolder<number>)} */
    protected abstract _sliceByMinimalistCollectionHolder(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.slice CollectionHolderOf1.slice(indices: CollectionHolder<number>)} */
    protected abstract _sliceByCollectionHolder(indices: CollectionHolder<number>,): CollectionHolder<T>

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.slice CollectionHolderOf1.slice(indices: CollectionIterator<number>)} */
    protected abstract _sliceByCollectionIterator(indices: CollectionIterator<number>,): CollectionHolder<T>

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.slice CollectionHolderOf1.slice(indices: Iterator<number>)} */
    protected abstract _sliceByIterator(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T>

    /** An additional method to be the equivalent of {@link CollectionHolderOf1.slice CollectionHolderOf1.slice(indices: Iterable<number>)} */
    protected abstract _sliceByIterable(indices: Iterable<number, unknown, unknown>,): CollectionHolder<T>

    //#endregion -------------------- Slice --------------------

    //#endregion -------------------- Transformation methods --------------------

    //#region -------------------- Methods --------------------

}
