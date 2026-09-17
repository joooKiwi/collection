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

import type {Array, MutableArray, MutableNumberKeyMap, MutableSet, Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, NumberKeyMap, Set} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                  from "../../src/CollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                        from "../../src/MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                from "../../src/iterator/CollectionIterator"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../../src/type/callback"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                                                                                from "../../src/type/possibleInstance"

import {SetOf2AsCollectionHolder}                     from "../../src/SetOf2AsCollectionHolder"
import {AbstractUnimplementedCollectionHolderForTest} from "./AbstractUnimplementedCollectionHolderForTest"

/**
 * A class to test the functionality of a {@link SetOf2AsCollectionHolder}
 *
 * @typeParam T1 The 1st type
 * @typeParam T2 The 2nd type
 */
export class CollectionHolder_SetOf2<const T1,
    const T2, >
    extends AbstractUnimplementedCollectionHolderForTest<| T1 | T2> {

    /** The internal instance that is tested */
    public readonly instance: SetOf2AsCollectionHolder<T1, T2>

    /** The set that is sent to the {@link instance} */
    public readonly set: Set<| T1 | T2>

    public constructor(public readonly value1: T1, public readonly value2: T2,) {
        super()
        this.instance = new SetOf2AsCollectionHolder<T1, T2>(this.set = new Set([value1, value2,],),)
    }

    //#region -------------------- Size methods --------------------

    public override get size(): number { return this.instance.size }

    public override get isEmpty(): boolean { return this.instance.isEmpty }
    public override get isNotEmpty(): boolean { return this.instance.isNotEmpty }

    public override get hasExactly1Element(): boolean { return this.instance.hasExactly1Element }
    public override get hasAtMost1Element(): boolean { return this.instance.hasAtMost1Element }

    public override get hasAtLeast2Elements(): boolean { return this.instance.hasAtLeast2Elements }
    public override get hasExactly2Elements(): boolean { return this.instance.hasExactly2Elements }
    public override get hasAtMost2Elements(): boolean { return this.instance.hasAtMost2Elements }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get(index: number,): | T1 | T2 { return this.instance.get(index,) }

    public override getFirst(): | T1 | T2 { return this.instance.getFirst() }

    public override getLast(): | T1 | T2 { return this.instance.getLast() }


    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T1 | T2 | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<| T1 | T2>,): | T1 | T2
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) { return this.instance.getOrElse(index, defaultValue,) }

    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T1 | T2 | U
    public override getFirstOrElse(defaultValue: ReturnCallback<| T1 | T2>,): | T1 | T2
    public override getFirstOrElse(defaultValue: ReturnCallback<unknown>,) { return this.instance.getFirstOrElse(defaultValue,) }

    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T1 | T2 | U
    public override getLastOrElse(defaultValue: ReturnCallback<| T1 | T2>,): | T1 | T2
    public override getLastOrElse(defaultValue: ReturnCallback<unknown>,) { return this.instance.getLastOrElse(defaultValue,) }


    public override getOrNull(index: number,): NullOr<| T1 | T2>
    public override getOrNull(index: number,) { return this.instance.getOrNull(index,) }

    public override getFirstOrNull(): NullOr<| T1 | T2> { return this.instance.getFirstOrNull() }

    public override getLastOrNull(): NullOr<| T1 | T2> { return this.instance.getLastOrNull() }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find --------------------

    public override findFirst<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): S
    public override findFirst(predicate: BooleanCallback<| T1 | T2>,): | T1 | T2
    public override findFirst(predicate: BooleanCallback<| T1 | T2>,) { return this.instance.findFirst(predicate,) }

    public override findFirstOrNull<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<| T1 | T2>,): NullOr<| T1 | T2>
    public override findFirstOrNull(predicate: BooleanCallback<| T1 | T2>,) { return this.instance.findFirstOrNull(predicate,) }

    public override findFirstIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): | T1 | T2
    public override findFirstIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,) { return this.instance.findFirstIndexed(predicate,) }

    public override findFirstIndexedOrNull<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>,): NullOr<| T1 | T2>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>,) { return this.instance.findFirstIndexedOrNull(predicate,) }


    public override findLast<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): S
    public override findLast(predicate: BooleanCallback<| T1 | T2>,): | T1 | T2
    public override findLast(predicate: BooleanCallback<| T1 | T2>,) { return this.instance.findLast(predicate,) }

    public override findLastOrNull<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<| T1 | T2>,): NullOr<| T1 | T2>
    public override findLastOrNull(predicate: BooleanCallback<| T1 | T2>,) { return this.instance.findLastOrNull(predicate,) }

    public override findLastIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): | T1 | T2
    public override findLastIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,) { return this.instance.findLastIndexed(predicate,) }

    public override findLastIndexedOrNull<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>,): NullOr<| T1 | T2>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>,) { return this.instance.findLastIndexedOrNull(predicate,) }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): | 0 | 1 { return this.instance.firstIndexOf(element, from, to,) }
    public override firstIndexOfOrNull(element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> { return this.instance.firstIndexOfOrNull(element, from, to,) }
    public override lastIndexOf(element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): | 0 | 1 { return this.instance.lastIndexOf(element, from, to,) }
    public override lastIndexOfOrNull(element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> { return this.instance.lastIndexOfOrNull(element, from, to,) }


    public override indexOfFirst(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1 { return this.instance.indexOfFirst(predicate, from, to,) }
    public override indexOfFirstOrNull(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> { return this.instance.indexOfFirstOrNull(predicate, from, to,) }
    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1 { return this.instance.indexOfFirstIndexed(predicate, from, to,) }
    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> { return this.instance.indexOfFirstIndexedOrNull(predicate, from, to,) }

    public override indexOfLast(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1 { return this.instance.indexOfLast(predicate, from, to,) }
    public override indexOfLastOrNull(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> { return this.instance.indexOfLastOrNull(predicate, from, to,) }
    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1 { return this.instance.indexOfLastIndexed(predicate, from, to,) }
    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> { return this.instance.indexOfLastIndexedOrNull(predicate, from, to,) }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    public override all<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<| T1 | T2>,): boolean
    public override all(predicate: BooleanCallback<| T1 | T2>,) { return this.instance.all(predicate,) }

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<| T1 | T2>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<| T1 | T2>>,) {
        if (arguments.length === 0)
            return this.instance.any()
        return this.instance.any(predicate,)
    }

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<| T1 | T2>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<| T1 | T2>>,) {
        if (arguments.length === 0)
            return this.instance.none()
        return this.instance.none(predicate,)
    }


    public override get hasNull(): boolean { return this.instance.hasNull }

    public override get hasNoNulls(): boolean { return this.instance.hasNoNulls }


    public override get hasDuplicate(): boolean { return this.instance.hasDuplicate }

    public override get hasNoDuplicates(): boolean { return this.instance.hasNoDuplicates }


    public override has(value: | T1 | T2,): boolean { return this.instance.has(value,) }

    public override hasNot(value: | T1 | T2,): boolean { return this.instance.hasNot(value,) }

    public override hasOne(values: Nullable<Array<| T1 | T2>>,): boolean
    public override hasOne(values: Nullable<Set<| T1 | T2>>,): boolean
    public override hasOne(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean
    public override hasOne(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean
    public override hasOne(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean
    public override hasOne(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,) { return this.instance.hasOne(values,) }

    public override hasNotOne(values: Nullable<Array<| T1 | T2>>,): boolean
    public override hasNotOne(values: Nullable<Set<| T1 | T2>>,): boolean
    public override hasNotOne(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean
    public override hasNotOne(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean
    public override hasNotOne(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean
    public override hasNotOne(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,) { return this.instance.hasNotOne(values,) }

    public override hasAll(values: Nullable<Array<| T1 | T2>>,): boolean
    public override hasAll(values: Nullable<Set<| T1 | T2>>,): boolean
    public override hasAll(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean
    public override hasAll(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean
    public override hasAll(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean
    public override hasAll(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,) { return this.instance.hasAll(values,) }

    public override hasNotAll(values: Nullable<Array<| T1 | T2>>,): boolean
    public override hasNotAll(values: Nullable<Set<| T1 | T2>>,): boolean
    public override hasNotAll(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean
    public override hasNotAll(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean
    public override hasNotAll(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean
    public override hasNotAll(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,) { return this.instance.hasNotAll(values,) }


    public override requireNoNulls(): CollectionHolder<NonNullable<| T1 | T2>> {
        if (this.instance.requireNoNulls() !== this.instance)
            throw new Error("The expected return type for the method “requireNoNulls” was supposed to be the same instance",)
        return this as CollectionHolder<NonNullable<| T1 | T2>>
    }

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override filter(predicate: BooleanCallback<| T1 | T2>,) { return this.instance.filter(predicate,) }

    public override filterIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override filterIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,) { return this.instance.filterIndexed(predicate,) }

    public override filterNot<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<Exclude<| T1 | T2, S>>
    public override filterNot(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override filterNot(predicate: BooleanCallback<| T1 | T2>,) { return this.instance.filterNot(predicate,) }

    public override filterNotIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<Exclude<| T1 | T2, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,) { return this.instance.filterNotIndexed(predicate,) }

    public override filterNotNull(): CollectionHolder<NonNullable<| T1 | T2>> {
        const instance = this.instance
        const newInstance = instance.filterNotNull()
        if (newInstance === instance)
            return this as CollectionHolder<NonNullable<| T1 | T2>>
        return newInstance
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    public override slice(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<| T1 | T2>
    public override slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<| T1 | T2>
    public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,) {
        if (arguments.length === 0)
            return this.instance.slice()
        if (arguments.length === 1)
            return this.instance.slice(indicesOrFrom,)
        return this.instance.slice(indicesOrFrom, to,)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<| T1 | T2> { return this.instance.take(n,) }

    public override takeWhile<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override takeWhile(predicate: BooleanCallback<| T1 | T2>,) { return this.instance.takeWhile(predicate,) }

    public override takeWhileIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,) { return this.instance.takeWhileIndexed(predicate,) }


    public override takeLast(n: number,): CollectionHolder<| T1 | T2> { return this.instance.takeLast(n,) }

    public override takeLastWhile<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override takeLastWhile(predicate: BooleanCallback<| T1 | T2>,) { return this.instance.takeLastWhile(predicate,) }

    public override takeLastWhileIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,) { return this.instance.takeLastWhileIndexed(predicate,) }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<| T1 | T2> { return this.instance.drop(n,) }

    public override dropWhile<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override dropWhile(predicate: BooleanCallback<| T1 | T2>,) {return this.instance.dropWhile(predicate,) }

    public override dropWhileIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,) { return this.instance.dropWhileIndexed(predicate,) }


    public override dropLast(n: number,): CollectionHolder<| T1 | T2> { return this.instance.dropLast(n,) }

    public override dropLastWhile<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override dropLastWhile(predicate: BooleanCallback<| T1 | T2>,) { return this.instance.dropLastWhile(predicate,) }

    public override dropLastWhileIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,) { return this.instance.dropLastWhileIndexed(predicate,) }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<| T1 | T2, U>,): CollectionHolder<U> { return this.instance.map(transform,) }
    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<| T1 | T2, U>,): CollectionHolder<U> { return this.instance.mapIndexed(transform,) }

    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<| T1 | T2, Nullable<U>>,): CollectionHolder<U> { return this.instance.mapNotNull(transform,) }
    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<| T1 | T2, Nullable<U>>,): CollectionHolder<U> { return this.instance.mapNotNullIndexed(transform,) }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    public override forEach(action: ValueIndexCallback<| T1 | T2>,): void { this.instance.forEach(action,) }
    public override forEachIndexed(action: IndexValueCallback<| T1 | T2>,): void { this.instance.forEachIndexed(action,) }


    public override onEach(action: ValueIndexCallback<| T1 | T2>,): this {
        const instance = this.instance
        if (instance.onEach(action,) !== instance)
            throw new Error("The expected return type for the method “onEach” was supposed to be the same instance",)
        return this
    }

    public override onEachIndexed(action: IndexValueCallback<| T1 | T2>,): this {
        const instance = this.instance
        if (instance.onEachIndexed(action,) !== instance)
            throw new Error("The expected return type for the method “onEachIndexed” was supposed to be the same instance",)
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<| T1 | T2> { return this.instance.toReverse(from, to,) }

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override toIterator(): CollectionIterator<| T1 | T2> { return this.instance.toIterator() }

    public override toArray(): Array<| T1 | T2> { return this.instance.toArray() }
    public override toMutableArray(): MutableArray<| T1 | T2> { return this.instance.toMutableArray() }
    public override toSet(): Set<| T1 | T2> { return this.instance.toSet() }
    public override toMutableSet(): MutableSet<| T1 | T2> { return this.instance.toMutableSet() }
    public override toMap(): NumberKeyMap<| T1 | T2> { return this.instance.toMap() }
    public override toMutableMap(): MutableNumberKeyMap<| T1 | T2> { return this.instance.toMutableMap() }


    public override toString(): string { return this.instance.toString() }
    public override toLocaleString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return this.instance.toLocaleString()
        return this.instance.toLocaleString(locale,)
    }

    public override toLowerCaseString(): string { return this.instance.toLowerCaseString() }
    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return this.instance.toLocaleLowerCaseString()
        return this.instance.toLocaleLowerCaseString(locale,)
    }

    public override toUpperCaseString(): string { return this.instance.toUpperCaseString() }
    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return this.instance.toLocaleUpperCaseString()
        return this.instance.toLocaleUpperCaseString(locale,)
    }


    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<| T1 | T2>>,): string { return this.instance.joinToString(separator, prefix, postfix, limit, truncated, transform,) }

    //#endregion -------------------- Conversion methods --------------------

}
