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

import type {MutableNumberKeyMap, MutableSet, Nullable, NullableNumber, NullOr, NullOrUndefined, NullOrZeroNumber, NumberArray, NumberKeyMap, NumberSet, Set} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                          from "./CollectionHolder"
import type {CollectionHolderOf1}                                                                                                                                                                                       from "./CollectionHolderOf1"
import type {MinimalistCollectionHolder}                                                                                                                                                                                from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                        from "./iterator/CollectionIterator"
import type {CollectionIteratorOf1}                                                                                                                                                                                     from "./iterator/CollectionIteratorOf1"
import type {BooleanCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, ValueIndexWithReturnCallback} from "./type/callback"
import type {CollectionHolderOf0Or1}                                                                                                                                                                                    from "./type/collection"
import type {IndexOf1}                                                                                                                                                                                                  from "./type/indexOf"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                        from "./type/possibleInstance"
import type {SingleValueFromIndex, SingleValueFromIndexOrElse, SingleValueFromIndexOrNull}                                                                                                                              from "./type/value"

import {AbstractUnimplementedCollectionHolder} from "./AbstractUnimplementedCollectionHolder"

/**
 * A definition of a {@link CollectionHolderOf1} to have a common ancestor.
 * Only the aliases methods have implementation.
 * Plus some override to change the type returned.
 * The rest of the methods should be implemented by the inheritor(s).
 *
 * @apiNote This class is used when not specifically requiring an optimization on the methods, just the non-aliased methods calls
 * @note This class should be inherited if new classes are being made to be more usable by the tools
 * @typeParam T The type (**mandatory**)
 * @see AbstractUnimplementedCollectionHolder
 * @see AbstractUnimplementedCollectionHolderOf2
 */
export abstract class AbstractUnimplementedCollectionHolderOf1<const T, >
    extends AbstractUnimplementedCollectionHolder<T>
    implements CollectionHolderOf1<T> {

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
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public abstract override get<const I extends number, >(index: I,): SingleValueFromIndex<I, T>
    public abstract override get(index: number,): T

    public override getFirst(): T { return this.value }

    public override getLast(): T { return this.getFirst() }


    public abstract override getOrElse<const U, const I extends number, >(index: I, defaultValue: IndexWithReturnCallback<U>,): SingleValueFromIndexOrElse<I, T, U>
    public abstract override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public abstract override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T

    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): T
    public override getFirstOrElse(defaultValue: ReturnCallback<T>,): T
    public override getFirstOrElse() { return this.value }

    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): T
    public override getLastOrElse(defaultValue: ReturnCallback<T>,): T
    public override getLastOrElse(defaultValue: ReturnCallback<unknown>,) { return this.getFirstOrElse(defaultValue,) }


    public abstract override getOrNull<const I extends number, >(index: I,): SingleValueFromIndexOrNull<I, T>
    public abstract override getOrNull(index: number,): NullOr<T>

    public override getFirstOrNull(): T { return this.getFirst() }

    public override getLastOrNull(): T { return this.getFirst() }

    //#endregion -------------------- Get --------------------
    //#region -------------------- First / last --------------------

    public override last(): T
    public override last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
    public override last(predicate: Nullable<BooleanCallback<T>>,): T
    public override last(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.first()
        return this.first(predicate,)
    }


    public override firstOrNull(): T
    public override firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public override firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public override firstOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        if (predicate == null)
            return this.getFirst()
        return this.findFirstOrNull(predicate,)
    }

    public override lastOrNull(): T
    public override lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public override lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public override lastOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.firstOrNull()
        return this.firstOrNull(predicate,)
    }


    public override lastIndexed(): T
    public override lastIndexed<const S extends T, >(predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S
    public override lastIndexed(predicate: Nullable<ReverseBooleanCallback<T>>,): T
    public override lastIndexed(predicate?: Nullable<ReverseBooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.firstIndexed()
        return this.firstIndexed(predicate,)
    }


    public override firstIndexedOrNull(): T
    public override firstIndexedOrNull<const S extends T, >(predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): NullOr<S>
    public override firstIndexedOrNull(predicate: Nullable<ReverseBooleanCallback<T>>,): NullOr<T>
    public override firstIndexedOrNull(predicate?: Nullable<ReverseBooleanCallback<T>>,) {
        if (predicate == null)
            return this.getFirst()
        return this.findFirstIndexedOrNull(predicate,)
    }

    public override lastIndexedOrNull(): T
    public override lastIndexedOrNull<const S extends T, >(predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): NullOr<S>
    public override lastIndexedOrNull(predicate: Nullable<ReverseBooleanCallback<T>>,): NullOr<T>
    public override lastIndexedOrNull(predicate?: Nullable<ReverseBooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.firstIndexedOrNull()
        return this.firstIndexedOrNull(predicate,)
    }

    //#endregion -------------------- First / last --------------------
    //#region -------------------- Find --------------------

    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findLast(predicate: BooleanCallback<T>,): T
    public override findLast(predicate: BooleanCallback<T>,) {
        return this.findFirst(predicate,)
    }

    public override findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLastOrNull(predicate: BooleanCallback<T>,) {
        return this.findFirstOrNull(predicate,)
    }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.findFirstIndexed(predicate,)
    }

    public override findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return this.findFirstIndexedOrNull(predicate,)
    }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- First/last index of --------------------

    public abstract override firstIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T, from?: I1, to?: I2,): IndexOf1<I1, I2>
    public abstract override firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): 0

    public override indexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T, from?: I1, to?: I2,): IndexOf1<I1, I2>
    public override indexOf(element: T, from?: NullableNumber, to?: NullableNumber,): 0
    public override indexOf(element: T, from?: NullableNumber, to?: NullableNumber,) {
        return this.firstIndexOf(element, from, to,)
    }

    public abstract override firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber

    public override indexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        return this.firstIndexOfOrNull(element, from, to,)
    }


    public override lastIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T, from?: I1, to?: I2,): IndexOf1<I1, I2>
    public override lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): 0
    public override lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,) {
        return this.firstIndexOf(element, from, to,)
    }

    public override lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        return this.firstIndexOfOrNull(element, from, to,)
    }

    //#endregion -------------------- First/last index of --------------------
    //#region -------------------- Index of first/last --------------------

    public abstract override indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0

    public override findFirstIndex(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 {
        return this.indexOfFirst(predicate, from, to,)
    }

    public override findIndex(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 {
        return this.indexOfFirst(predicate, from, to,)
    }

    public override indexOfLast(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 {
        return this.indexOfFirst(predicate, from, to,)
    }

    public override findLastIndex(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 {
        return this.indexOfFirst(predicate, from, to,)
    }


    public abstract override indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber

    public override findFirstIndexOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        return this.indexOfFirstOrNull(predicate, from, to,)
    }

    public override findIndexOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        return this.indexOfFirstOrNull(predicate, from, to,)
    }

    public override indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        return this.indexOfFirstOrNull(predicate, from, to,)
    }

    public override findLastIndexOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        return this.indexOfFirstOrNull(predicate, from, to,)
    }


    public abstract override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0

    public override findFirstIndexIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 {
        return this.indexOfFirstIndexed(predicate, from, to,)
    }

    public override findIndexIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 {
        return this.indexOfFirstIndexed(predicate, from, to,)
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 {
        return this.indexOfFirstIndexed(predicate, from, to,)
    }

    public override findLastIndexIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 {
        return this.indexOfFirstIndexed(predicate, from, to,)
    }


    public abstract override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber

    public override findFirstIndexIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        return this.indexOfFirstIndexedOrNull(predicate, from, to,)
    }

    public override findIndexIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        return this.indexOfFirstIndexedOrNull(predicate, from, to,)
    }

    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        return this.indexOfFirstIndexedOrNull(predicate, from, to,)
    }

    public override findLastIndexIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        return this.indexOfFirstIndexedOrNull(predicate, from, to,)
    }

    //#endregion -------------------- Index of first/last --------------------

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    public abstract override all<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolderOf1<S>
    public abstract override all(predicate: BooleanCallback<T>,): boolean

    public override every<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolderOf1<S>
    public override every(predicate: BooleanCallback<T>,): boolean
    public override every(predicate: BooleanCallback<T>,) {
        return this.all(predicate,)
    }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    public abstract override any(): this["isNotEmpty"]
    public abstract override any<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolderOf1<S>
    public abstract override any(predicate: NullOrUndefined,): this["isNotEmpty"]
    public abstract override any(predicate: Nullable<BooleanCallback<T>>,): boolean

    public override some(): this["isNotEmpty"]
    public override some<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolderOf1<S>
    public override some(predicate: NullOrUndefined,): this["isNotEmpty"]
    public override some(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override some(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.any()
        return this.any(predicate,)
    }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    public abstract override none(): this["isEmpty"]
    public abstract override none<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolderOf1<Exclude<T, S>>
    public abstract override none(predicate: NullOrUndefined,): this["isEmpty"]
    public abstract override none(predicate: Nullable<BooleanCallback<T>>,): boolean

    //#endregion -------------------- None --------------------

    //#region -------------------- Has ‥ --------------------

    public abstract override readonly hasDuplicate: false
    public override get includesDuplicate(): false { return this.hasDuplicate }
    public override get containsDuplicate(): false { return this.hasDuplicate }

    public abstract override readonly hasNoDuplicates: true
    public override get includesNoDuplicates(): true { return this.hasNoDuplicates }
    public override get containsNoDuplicates(): true { return this.hasNoDuplicates }

    //#endregion -------------------- Has ‥ --------------------

    //#region -------------------- Require no nulls --------------------

    public abstract override requireNoNulls(): CollectionHolderOf1<NonNullable<T>>

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public abstract override filterNotNull(): CollectionHolderOf0Or1<NonNullable<T>>

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    public abstract override slice(from?: NullableNumber, to?: NullableNumber,): CollectionHolderOf1<T>
    public abstract override slice(indices: NumberArray,): CollectionHolder<T>
    public abstract override slice(indices: NumberSet,): CollectionHolder<T>
    public abstract override slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public abstract override slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public abstract override slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public abstract override slice(indices: IteratorObject<number, unknown, unknown>,): CollectionHolder<T>
    public abstract override slice(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T>
    public abstract override slice(indices: Iterable<number, unknown, unknown>,): CollectionHolder<T>
    public abstract override slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public abstract override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,): CollectionHolder<T>

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public abstract override take(n: number,): CollectionHolderOf0Or1<T>

    public override limit(n: number,): CollectionHolderOf0Or1<T> {
        return this.take(n,)
    }

    public override takeLast(n: number,): CollectionHolderOf0Or1<T> {
        return this.take(n,)
    }

    public override limitLast(n: number,): CollectionHolderOf0Or1<T> {
        return this.take(n,)
    }


    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) {
        return this.takeWhile(predicate,)
    }

    public override limitWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override limitWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override limitWhile(predicate: BooleanCallback<T>,) {
        return this.takeWhile(predicate,)
    }

    public override limitLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override limitLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override limitLastWhile(predicate: BooleanCallback<T>,) {
        return this.takeWhile(predicate,)
    }


    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.takeWhileIndexed(predicate,)
    }

    public override limitWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override limitWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override limitWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.takeWhileIndexed(predicate,)
    }

    public override limitLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override limitLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override limitLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.takeWhileIndexed(predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public abstract override drop(n: number,): CollectionHolderOf0Or1<T>

    public override dropLast(n: number,): CollectionHolderOf0Or1<T> {
        return this.drop(n,)
    }

    public override skip(n: number,): CollectionHolderOf0Or1<T> {
        return this.drop(n,)
    }

    public override skipLast(n: number,): CollectionHolderOf0Or1<T> {
        return this.drop(n,)
    }


    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) {
        return this.dropWhile(predicate,)
    }

    public override skipWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override skipWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override skipWhile(predicate: BooleanCallback<T>,) {
        return this.dropWhile(predicate,)
    }

    public override skipLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override skipLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override skipLastWhile(predicate: BooleanCallback<T>,) {
        return this.dropWhile(predicate,)
    }


    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.dropWhileIndexed(predicate,)
    }

    public override skipWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override skipWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override skipWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.dropWhileIndexed(predicate,)
    }

    public override skipLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override skipLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override skipLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.dropWhileIndexed(predicate,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public abstract override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolderOf1<U>

    public abstract override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolderOf1<U>

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    public abstract override toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolderOf1<T>

    public override toReversed(from?: NullableNumber, to?: NullableNumber,): CollectionHolderOf1<T> {
        return this.toReverse(from, to,)
    }

    public override reversed(from?: NullableNumber, to?: NullableNumber,): CollectionHolderOf1<T> {
        return this.toReverse(from, to,)
    }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public override [Symbol.iterator](): CollectionIteratorOf1<T> {
        return this.toIterator()
    }

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public abstract override toIterator(): CollectionIteratorOf1<T>

    public abstract override toArray(): readonly [T,]

    public abstract override toMutableArray(): [T,]

    public abstract override toSet(): Set<T>

    public abstract override toMutableSet(): MutableSet<T>

    public abstract override toMap(): NumberKeyMap<T, 0>

    public abstract override toMutableMap(): MutableNumberKeyMap<T, 0>

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}
