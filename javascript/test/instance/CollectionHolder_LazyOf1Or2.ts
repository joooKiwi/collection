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

import type {Array, MutableNumberKeyMap, MutableSet, Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, NumberArray, NumberKeyMap, NumberSet, Set} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                  from "../../src/CollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                        from "../../src/MinimalistCollectionHolder"
import type {CollectionHolderOf1}                                                                                                                                                                                                                                               from "../../src/CollectionHolderOf1"
import type {CollectionHolderOf2}                                                                                                                                                                                                                                               from "../../src/CollectionHolderOf2"
import type {CollectionIterator}                                                                                                                                                                                                                                                from "../../src/iterator/CollectionIterator"
import type {CollectionIteratorOf1}                                                                                                                                                                                                                                             from "../../src/iterator/CollectionIteratorOf1"
import type {CollectionIteratorOf2}                                                                                                                                                                                                                                             from "../../src/iterator/CollectionIteratorOf2"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../../src/type/callback"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                                                                                from "../../src/type/possibleInstance"

import {AbstractCollectionHolderForTest} from "./AbstractCollectionHolderForTest"
import {LazyCollectionHolderOf1Or2}      from "../../src/LazyCollectionHolderOf1Or2"
import {EmptyOptional}                   from "../../src/optional/EmptyOptional"
import {Optional}                        from "../../src/optional/Optional"
import {Couple}                          from "../../src/tuple/Couple"

/**
 * A class to test the functionality of a {@link LazyCollectionHolderOf1Or2}
 *
 * @typeParam T  The type
 * @typeParam T1 The 1st type (by default `T`)
 * @typeParam T2 The 2nd type (by default `T`)
 */
export class CollectionHolder_LazyOf1Or2<const T,
    const T1 extends T = T,
    const T2 extends T = T, >
    extends AbstractCollectionHolderForTest<T> {

    /** The internal instance that is tested */
    public readonly instance: LazyCollectionHolderOf1Or2ForTest<T>

    public readonly value1: T1
    public readonly value2: Optional<T2>
    public readonly values: Couple<| Optional<T2> | T1, T1, Optional<T2>>

    public constructor(value1: T1,)
    public constructor(value1: T1, value2: T2,)
    public constructor(value1: T1, value2?: T2,) {
        super()

        const values = this.values = arguments.length === 1
            ? new Couple(this.value1 = value1, this.value2 = EmptyOptional.get,)
            : new Couple(this.value1 = value1, this.value2 = new Optional(value2 as T2,),)
        const $this = this
        this.instance = new class CollectionHolder_CountingGetOnLazyOf1Or2
            extends LazyCollectionHolderOf1Or2<T>
            implements LazyCollectionHolderOf1Or2ForTest<T> {

            public override get(index: number,): T {
                $this.amountOfCall++
                return super.get(index,)
            }

            public get innerCollection(): | CollectionHolderOf2<T> | CollectionHolderOf1<T> { return this._innerCollection }

        }(() => values,)
    }

    //#region -------------------- Size methods --------------------

    public override get size(): | 1 | 2 { return this.instance.size }
    public override get isEmpty(): false { return this.instance.isEmpty }
    public override get isNotEmpty(): true { return this.instance.isNotEmpty }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get(index: number,): T { return this.instance.get(index,) }

    public override getFirst(): T { return this.instance.getFirst() }

    public override getLast(): T { return this.instance.getLast() }


    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) { return this.instance.getOrElse(index, defaultValue,) }

    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getFirstOrElse(defaultValue: ReturnCallback<T>,): T
    public override getFirstOrElse(defaultValue: ReturnCallback<unknown>,) { return this.instance.getFirstOrElse(defaultValue,) }

    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getLastOrElse(defaultValue: ReturnCallback<T>,): T
    public override getLastOrElse(defaultValue: ReturnCallback<unknown>,) { return this.instance.getLastOrElse(defaultValue,) }


    public override getOrNull(index: number,): NullOr<T> { return this.instance.getOrNull(index,) }

    public override getFirstOrNull(): T { return this.instance.getFirstOrNull() }

    public override getLastOrNull(): T { return this.instance.getLastOrNull() }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find --------------------

    public override findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findFirst(predicate: BooleanCallback<T>,): T
    public override findFirst(predicate: BooleanCallback<T>,) { return this.instance.findFirst(predicate,) }

    public override findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findFirstOrNull(predicate: BooleanCallback<T>,) { return this.instance.findFirstOrNull(predicate,) }

    public override findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,) { return this.instance.findFirstIndexed(predicate,) }

    public override findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) { return this.instance.findFirstIndexedOrNull(predicate,) }


    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findLast(predicate: BooleanCallback<T>,): T
    public override findLast(predicate: BooleanCallback<T>,) { return this.instance.findLast(predicate,) }

    public override findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLastOrNull(predicate: BooleanCallback<T>,) { return this.instance.findLastOrNull(predicate,) }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) { return this.instance.findLastIndexed(predicate,) }

    public override findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) { return this.instance.findLastIndexedOrNull(predicate,) }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): | 0 | 1 { return this.instance.firstIndexOf(element, from, to,) }
    public override firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> { return this.instance.firstIndexOfOrNull(element, from, to,) }

    public override lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): | 0 | 1 { return this.instance.lastIndexOf(element, from, to,) }
    public override lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> { return this.instance.lastIndexOfOrNull(element, from, to,) }

    public override indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1 { return this.instance.indexOfFirst(predicate, from, to,) }
    public override indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> { return this.instance.indexOfFirstOrNull(predicate, from, to,) }
    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1 { return this.instance.indexOfFirstIndexed(predicate, from, to,) }
    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> { return this.instance.indexOfFirstIndexedOrNull(predicate, from, to,) }

    public override indexOfLast(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1 { return this.instance.indexOfLast(predicate, from, to,) }
    public override indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> { return this.instance.indexOfLastOrNull(predicate, from, to,) }
    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1 { return this.instance.indexOfLastIndexed(predicate, from, to,) }
    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> { return this.instance.indexOfLastIndexedOrNull(predicate, from, to,) }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    public override all<S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) { return this.instance.all(predicate,) }

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.instance.any()
        return this.instance.any(predicate,)
    }

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.instance.none()
        return this.instance.none(predicate,)
    }


    public override get hasNull(): boolean { return this.instance.hasNull }

    public override get hasNoNulls(): boolean { return this.instance.hasNoNulls }


    public override get hasDuplicate(): boolean { return this.instance.hasDuplicate }

    public override get hasNoDuplicates(): boolean { return this.instance.hasNoDuplicates }


    public override has(value: T,): boolean { return this.instance.has(value,) }

    public override hasNot(value: T,): boolean { return this.instance.hasNot(value,) }

    public override hasOne(values: Nullable<Array<T>>,): boolean
    public override hasOne(values: Nullable<Set<T>>,): boolean
    public override hasOne(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) { return this.instance.hasOne(values,) }

    public override hasNotOne(values: Nullable<Array<T>>,): boolean
    public override hasNotOne(values: Nullable<Set<T>>,): boolean
    public override hasNotOne(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasNotOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) { return this.instance.hasNotOne(values,) }

    public override hasAll(values: Nullable<Array<T>>,): boolean
    public override hasAll(values: Nullable<Set<T>>,): boolean
    public override hasAll(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) { return this.instance.hasAll(values,) }

    public override hasNotAll(values: Nullable<Array<T>>,): boolean
    public override hasNotAll(values: Nullable<Set<T>>,): boolean
    public override hasNotAll(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasNotAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) { return this.instance.hasNotAll(values,) }


    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        if (this.instance.requireNoNulls() !== this.instance)
            throw new Error("The expected return type for the method “requireNoNulls” was supposed to be the same instance",)
        return this as CollectionHolder<NonNullable<T>>
    }

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) { return this.instance.filter(predicate,) }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) { return this.instance.filterIndexed(predicate,) }

    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,) { return this.instance.filterNot(predicate,) }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,) { return this.instance.filterNotIndexed(predicate,) }

    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        const instance = this.instance
        const newInstance = instance.filterNotNull()
        if (newInstance === instance)
            return this as CollectionHolder<NonNullable<T>>
        return newInstance
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    public override slice(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T>
    public override slice(indices: NumberArray,): CollectionHolder<T>
    public override slice(indices: NumberSet,): CollectionHolder<T>
    public override slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public override slice(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T>
    public override slice(indices: Iterable<number, unknown, unknown>,): CollectionHolder<T>
    public override slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,): CollectionHolder<T>
    public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,) {
        if (arguments.length === 0)
            return this.instance.slice()
        if (arguments.length === 1)
            return this.instance.slice(indicesOrFrom,)
        return this.instance.slice(indicesOrFrom, to,)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<T> {
        return this.instance.take(n,)
    }

    public override takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeWhile(predicate: BooleanCallback<T>,) {
        return this.instance.takeWhile(predicate,)
    }

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.instance.takeWhileIndexed(predicate,)
    }


    public override takeLast(n: number,): CollectionHolder<T> {
        return this.instance.takeLast(n,)
    }

    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) {
        return this.instance.takeLastWhile(predicate,)
    }

    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.instance.takeLastWhileIndexed(predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<T> {
        return this.instance.drop(n,)
    }

    public override dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropWhile(predicate: BooleanCallback<T>,) {
        return this.instance.dropWhile(predicate,)
    }

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.instance.dropWhileIndexed(predicate,)
    }


    public override dropLast(n: number,): CollectionHolder<T> {
        return this.instance.dropLast(n,)
    }

    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) {
        return this.instance.dropLastWhile(predicate,)
    }

    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.instance.dropLastWhileIndexed(predicate,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> { return this.instance.map(transform,) }
    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> { return this.instance.mapIndexed(transform,) }

    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> { return this.instance.mapNotNull(transform,) }
    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> { return this.instance.mapNotNullIndexed(transform,) }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    public override forEach(action: ValueIndexCallback<T>,): void { this.instance.forEach(action,) }
    public override forEachIndexed(action: IndexValueCallback<T>,): void { this.instance.forEachIndexed(action,) }


    public override onEach(action: ValueIndexCallback<T>,): this {
        if (this.instance.onEach(action,) !== this.instance)
            throw new Error("The expected return type for the method “onEach” was supposed to be the same instance",)
        return this
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        if (this.instance.onEachIndexed(action,) !== this.instance)
            throw new Error("The expected return type for the method “onEach” was supposed to be the same instance",)
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): | CollectionHolderOf2<T> | CollectionHolderOf1<T> { return this.instance.toReverse(from, to,) }

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override toIterator(): | CollectionIteratorOf2<T> | CollectionIteratorOf1<T> { return this.instance.toIterator() }

    public override toArray(): | readonly [T, T,] | readonly [T,] { return this.instance.toArray() }
    public override toMutableArray(): | [T, T,] | [T,] { return this.instance.toMutableArray() }
    public override toSet(): Set<T> { return this.instance.toSet() }
    public override toMutableSet(): MutableSet<T> { return this.instance.toMutableSet() }
    public override toMap(): NumberKeyMap<T, | 0 | 1> { return this.instance.toMap() }
    public override toMutableMap(): MutableNumberKeyMap<T, | 0 | 1> { return this.instance.toMutableMap() }


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


    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string { return this.instance.joinToString(separator, prefix, postfix, limit, truncated, transform,) }

    //#endregion -------------------- Conversion methods --------------------

}

interface LazyCollectionHolderOf1Or2ForTest<out T, >
    extends LazyCollectionHolderOf1Or2<T> {

    readonly innerCollection: | CollectionHolderOf2<T> | CollectionHolderOf1<T>

}
