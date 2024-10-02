/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrNumber} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                                              from "../../src/CollectionHolder"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, PossibleIterableArraySetOrCollectionHolder, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../../src/CollectionHolder.types"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                                    from "../../src/MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                                            from "../../src/iterator/CollectionIterator"

import {CollectionConstants}             from "../../src/CollectionConstants"
import {allByArray}                      from "../../src/method/all"
import {anyByArray}                      from "../../src/method/any"
import {filterByArray}                   from "../../src/method/filter"
import {filterIndexedByArray}            from "../../src/method/filterIndexed"
import {filterNotByArray}                from "../../src/method/filterNot"
import {filterNotIndexedByArray}         from "../../src/method/filterNotIndexed"
import {filterNotNullByArray}            from "../../src/method/filterNotNull"
import {findByArray}                     from "../../src/method/find"
import {findIndexedByArray}              from "../../src/method/findIndexed"
import {findLastByArray}                 from "../../src/method/findLast"
import {findLastIndexedByArray}          from "../../src/method/findLastIndexed"
import {firstByArray}                    from "../../src/method/first"
import {firstOrNullByArray}              from "../../src/method/firstOrNull"
import {forEachByArray}                  from "../../src/method/forEach"
import {forEachIndexedByArray}           from "../../src/method/forEachIndexed"
import {getOrElseByArray}                from "../../src/method/getOrElse"
import {getOrNullByArray}                from "../../src/method/getOrNull"
import {hasByArray}                      from "../../src/method/has"
import {hasAllByArray}                   from "../../src/method/hasAll"
import {hasDuplicateByArray}             from "../../src/method/hasDuplicate"
import {hasNullByArray}                  from "../../src/method/hasNull"
import {hasOneByArray}                   from "../../src/method/hasOne"
import {indexOfByArray}                  from "../../src/method/indexOf"
import {indexOfFirstByArray}             from "../../src/method/indexOfFirst"
import {indexOfFirstIndexedByArray}      from "../../src/method/indexOfFirstIndexed"
import {indexOfLastByArray}              from "../../src/method/indexOfLast"
import {indexOfLastIndexedByArray}       from "../../src/method/indexOfLastIndexed"
import {isEmptyByArray}                  from "../../src/method/isEmpty"
import {isNotEmptyByArray}               from "../../src/method/isNotEmpty"
import {joinToStringByArray}             from "../../src/method/joinToString"
import {lastByArray}                     from "../../src/method/last"
import {lastIndexOfByArray}              from "../../src/method/lastIndexOf"
import {lastOrNullByArray}               from "../../src/method/lastOrNull"
import {noneByArray}                     from "../../src/method/none"
import {mapByArray}                      from "../../src/method/map"
import {mapIndexedByArray}               from "../../src/method/mapIndexed"
import {mapNotNullByArray}               from "../../src/method/mapNotNull"
import {mapNotNullIndexedByArray}        from "../../src/method/mapNotNullIndexed"
import {onEachByArray}                   from "../../src/method/onEach"
import {onEachIndexedByArray}            from "../../src/method/onEachIndexed"
import {requireNoNullsByArray}           from "../../src/method/requireNoNulls"
import {sliceByArray}                    from "../../src/method/slice"
import {toArrayByArray}                  from "../../src/method/toArray"
import {toIteratorByArray}               from "../../src/method/toIterator"
import {toLocaleLowerCaseStringByArray}  from "../../src/method/toLocaleLowerCaseString"
import {toLocaleStringByArray}           from "../../src/method/toLocaleString"
import {toLocaleUpperCaseStringByArray}  from "../../src/method/toLocaleUpperCaseString"
import {toLowerCaseStringByArray}        from "../../src/method/toLowerCaseString"
import {toMapByArray}                    from "../../src/method/toMap"
import {toMutableArrayByArray}           from "../../src/method/toMutableArray"
import {toMutableMapByArray}             from "../../src/method/toMutableMap"
import {toMutableSetByArray}             from "../../src/method/toMutableSet"
import {toReverseByArray}                from "../../src/method/toReverse"
import {toSetByArray}                    from "../../src/method/toSet"
import {toStringByArray}                 from "../../src/method/toString"
import {toUpperCaseStringByArray}        from "../../src/method/toUpperCaseString"
import {AbstractCollectionHolderForTest} from "./AbstractCollectionHolderForTest"

/** A test instance to test exclusively the extension methods for an {@link ReadonlyArray Array} */
export class CollectionHolder_FromArrayFunction<const T, >
    extends AbstractCollectionHolderForTest<T> {

    public constructor(array: readonly T[],) {
        super(array,)
    }

    //#region -------------------- Test utility methods --------------------

    public override get amountOfCall(): never {
        throw new Error("The getter method “amountOfCall” was not expected to be called on an extension function only test instance.",)
    }

    public override set amountOfCall(_: unknown,) {
        throw new Error("The setter method “amountOfCall” was not expected to be called on an extension function only test instance.",)
    }

    //#endregion -------------------- Test utility methods --------------------
    //#region -------------------- Size methods --------------------

    public override get size(): number {
        return this.array.length
    }

    public override get isEmpty(): boolean {
        return isEmptyByArray(this.array,)
    }

    public override get isNotEmpty(): boolean {
        return isNotEmptyByArray(this.array,)
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get(index?: number,): never
    public override get() {
        throw new Error("The method “get” was not expected to be called directly",)
    }

    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return getOrElseByArray(this.array, index, defaultValue,)
    }

    public override getOrNull(index: number,): NullOr<T> {
        return getOrNullByArray(this.array, index,)
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- First --------------------

    public override first(): NonNullable<T>
    public override first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public override first(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public override first(predicate?: Nullable<BooleanCallback<T>>,) {
        return firstByArray(this.array, predicate,)
    }


    public override firstOrNull(): NullOr<T>
    public override firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public override firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public override firstOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        return firstOrNullByArray(this.array, predicate,)
    }

    //#endregion -------------------- First --------------------
    //#region -------------------- Last --------------------

    public override last(): NonNullable<T>
    public override last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public override last(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public override last(predicate?: Nullable<BooleanCallback<T>>,) {
        return lastByArray(this.array, predicate,)
    }


    public override lastOrNull(): NullOr<T>
    public override lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public override lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public override lastOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        return lastOrNullByArray(this.array, predicate,)
    }

    //#endregion -------------------- Last --------------------
    //#region -------------------- Find --------------------

    public override find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override find(predicate: BooleanCallback<T>,): NullOr<T>
    public override find(predicate: BooleanCallback<T>,) {
        return findByArray(this.array, predicate,)
    }

    public override findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findIndexedByArray(this.array, predicate,)
    }


    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLast(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLast(predicate: BooleanCallback<T>,) {
        return findLastByArray(this.array, predicate,)
    }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedByArray(this.array, predicate,)
    }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    public override indexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    public override indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,) {
        return indexOfByArray(this.array, element, fromIndex, toIndex,)
    }


    public override lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    public override lastIndexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    public override lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,) {
        return lastIndexOfByArray(this.array, element, fromIndex, toIndex,)
    }


    public override indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return indexOfFirstByArray(this.array, predicate, fromIndex, toIndex,)
    }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return indexOfFirstIndexedByArray(this.array, predicate, fromIndex, toIndex,)
    }


    public override indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return indexOfLastByArray(this.array, predicate, fromIndex, toIndex,)
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return indexOfLastIndexedByArray(this.array, predicate, fromIndex, toIndex,)
    }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    public override all<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) {
        return allByArray(this.array, predicate,)
    }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) {
        return anyByArray(this.array, predicate,)
    }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) {
        return noneByArray(this.array, predicate,)
    }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    public override get hasNull(): boolean {
        return hasNullByArray(this.array,)
    }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has duplicate --------------------

    public override get hasDuplicate(): boolean {
        return hasDuplicateByArray(this.array,)
    }

    //#endregion -------------------- Has duplicate --------------------

    //#region -------------------- Has --------------------

    public override has(value: T,): boolean {
        return hasByArray(this.array, value,)
    }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has one --------------------

    public override hasOne(values: readonly T[],): boolean
    public override hasOne(values: ReadonlySet<T>,): boolean
    public override hasOne(values: CollectionHolder<T>,): boolean
    public override hasOne(values: MinimalistCollectionHolder<T>,): boolean
    public override hasOne(values: CollectionIterator<T>,): boolean
    public override hasOne(values: Iterable<T>,): boolean
    public override hasOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public override hasOne(values: PossibleIterableArraySetOrCollectionHolder<T>,) {
        return hasOneByArray(this.array, values,)
    }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has all --------------------

    public override hasAll(values: readonly T[],): boolean
    public override hasAll(values: ReadonlySet<T>,): boolean
    public override hasAll(values: CollectionHolder<T>,): boolean
    public override hasAll(values: MinimalistCollectionHolder<T>,): boolean
    public override hasAll(values: CollectionIterator<T>,): boolean
    public override hasAll(values: Iterable<T>,): boolean
    public override hasAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public override hasAll(values: PossibleIterableArraySetOrCollectionHolder<T>,) {
        return hasAllByArray(this.array, values,)
    }

    //#endregion -------------------- Has all --------------------

    //#region -------------------- Require no nulls --------------------

    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        const array = requireNoNullsByArray(this.array,)
        if (array.length == 0)
            return CollectionConstants.EMPTY_COLLECTION_HOLDER
        return new CollectionHolder_FromArrayFunction(array,)
    }

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) {
        return filterByArray(this.array, predicate,)
    }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterIndexedByArray(this.array, predicate,)
    }


    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,) {
        return filterNotByArray(this.array, predicate,)
    }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterNotIndexedByArray(this.array, predicate,)
    }


    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNullByArray(this.array,)
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    public override slice(indices: readonly number[],): CollectionHolder<T>
    public override slice(indices: ReadonlySet<number>,): CollectionHolder<T>
    public override slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public override slice(indices: Iterable<number>,): CollectionHolder<T>
    public override slice(indices: PossibleIterableArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public override slice(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>
    public override slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber,): CollectionHolder<T>
    public override slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber,) {
        return sliceByArray(this.array, indicesOrFromIndex, toIndex,)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapByArray(this.array, transform,)
    }

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexedByArray(this.array, transform,)
    }


    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullByArray(this.array, transform,)
    }

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexedByArray(this.array, transform,)
    }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    public override forEach(action: ValueIndexCallback<T>,): void {
        forEachByArray(this.array, action,)
    }

    public override forEachIndexed(action: IndexValueCallback<T>,): void {
        forEachIndexedByArray(this.array, action,)
    }

    //#endregion -------------------- For each --------------------
    //#region -------------------- On each --------------------

    public override onEach(action: ValueIndexCallback<T>,): this {
        onEachByArray(this.array, action,)
        return this
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        onEachIndexedByArray(this.array, action,)
        return this
    }

    //#endregion -------------------- On each --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    public override toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T> {
        return toReverseByArray(this.array, fromIndex, toIndex,)
    }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Javascript methods --------------------

    public override [Symbol.iterator](): CollectionIterator<T> {
        return toIteratorByArray(this.array,)
    }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To other structure --------------------

    public override toArray(): readonly T[] {
        return toArrayByArray(this.array,)
    }

    public override toMutableArray(): T[] {
        return toMutableArrayByArray(this.array,)
    }


    public override toSet(): ReadonlySet<T> {
        return toSetByArray(this.array,)
    }

    public override toMutableSet(): Set<T> {
        return toMutableSetByArray(this.array,)
    }


    public override toMap(): ReadonlyMap<number, T> {
        return toMapByArray(this.array,)
    }

    public override toMutableMap(): Map<number, T> {
        return toMutableMapByArray(this.array,)
    }

    //#endregion -------------------- To other structure --------------------
    //#region -------------------- To string --------------------

    public override toString(): string {
        return toStringByArray(this.array,)
    }

    public override toLocaleString(locale?: NullableString,): string {
        return toLocaleStringByArray(this.array, locale,)
    }

    public override toLowerCaseString(): string {
        return toLowerCaseStringByArray(this.array,)
    }

    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        return toLocaleLowerCaseStringByArray(this.array, locale,)
    }

    public override toUpperCaseString(): string {
        return toUpperCaseStringByArray(this.array,)
    }

    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        return toLocaleUpperCaseStringByArray(this.array, locale,)
    }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToStringByArray(this.array, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

}
