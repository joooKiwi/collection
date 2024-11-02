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

import {allByCollectionHolder}                       from "../../src/method/all"
import {anyByCollectionHolder}                       from "../../src/method/any"
import {dropByCollectionHolder}                      from "../../src/method/drop"
import {dropLastByCollectionHolder}                  from "../../src/method/dropLast"
import {dropLastWhileByCollectionHolder}             from "../../src/method/dropLastWhile"
import {dropLastWhileIndexedByCollectionHolder}      from "../../src/method/dropLastWhileIndexed"
import {dropWhileByCollectionHolder}                 from "../../src/method/dropWhile"
import {dropWhileIndexedByCollectionHolder}          from "../../src/method/dropWhileIndexed"
import {filterByCollectionHolder}                    from "../../src/method/filter"
import {filterIndexedByCollectionHolder}             from "../../src/method/filterIndexed"
import {filterNotByCollectionHolder}                 from "../../src/method/filterNot"
import {filterNotIndexedByCollectionHolder}          from "../../src/method/filterNotIndexed"
import {filterNotNullByCollectionHolder}             from "../../src/method/filterNotNull"
import {findFirstByCollectionHolder}                 from "../../src/method/findFirst"
import {findFirstIndexedByCollectionHolder}          from "../../src/method/findFirstIndexed"
import {findFirstIndexedOrNullByCollectionHolder}    from "../../src/method/findFirstIndexedOrNull"
import {findFirstOrNullByCollectionHolder}           from "../../src/method/findFirstOrNull"
import {findLastByCollectionHolder}                  from "../../src/method/findLast"
import {findLastIndexedByCollectionHolder}           from "../../src/method/findLastIndexed"
import {findLastIndexedOrNullByCollectionHolder}     from "../../src/method/findLastIndexedOrNull"
import {findLastOrNullByCollectionHolder}            from "../../src/method/findLastOrNull"
import {forEachByCollectionHolder}                   from "../../src/method/forEach"
import {forEachIndexedByCollectionHolder}            from "../../src/method/forEachIndexed"
import {firstIndexOfByCollectionHolder}              from "../../src/method/firstIndexOf"
import {firstIndexOfOrNullByCollectionHolder}        from "../../src/method/firstIndexOfOrNull"
import {getFirstByCollectionHolder}                  from "../../src/method/getFirst"
import {getFirstOrNullByCollectionHolder}            from "../../src/method/getFirstOrNull"
import {getLastByCollectionHolder}                   from "../../src/method/getLast"
import {getLastOrNullByCollectionHolder}             from "../../src/method/getLastOrNull"
import {getOrElseByCollectionHolder}                 from "../../src/method/getOrElse"
import {getOrNullByCollectionHolder}                 from "../../src/method/getOrNull"
import {hasByCollectionHolder}                       from "../../src/method/has"
import {hasAllByCollectionHolder}                    from "../../src/method/hasAll"
import {hasDuplicateByCollectionHolder}              from "../../src/method/hasDuplicate"
import {hasNullByCollectionHolder}                   from "../../src/method/hasNull"
import {hasOneByCollectionHolder}                    from "../../src/method/hasOne"
import {indexOfFirstByCollectionHolder}              from "../../src/method/indexOfFirst"
import {indexOfFirstIndexedByCollectionHolder}       from "../../src/method/indexOfFirstIndexed"
import {indexOfFirstIndexedOrNullByCollectionHolder} from "../../src/method/indexOfFirstIndexedOrNull"
import {indexOfFirstOrNullByCollectionHolder}        from "../../src/method/indexOfFirstOrNull"
import {indexOfLastByCollectionHolder}               from "../../src/method/indexOfLast"
import {indexOfLastIndexedByCollectionHolder}        from "../../src/method/indexOfLastIndexed"
import {indexOfLastIndexedOrNullByCollectionHolder}  from "../../src/method/indexOfLastIndexedOrNull"
import {indexOfLastOrNullByCollectionHolder}         from "../../src/method/indexOfLastOrNull"
import {isEmptyByCollectionHolder}                   from "../../src/method/isEmpty"
import {isNotEmptyByCollectionHolder}                from "../../src/method/isNotEmpty"
import {joinToStringByCollectionHolder}              from "../../src/method/joinToString"
import {lastIndexOfByCollectionHolder}               from "../../src/method/lastIndexOf"
import {lastIndexOfOrNullByCollectionHolder}         from "../../src/method/lastIndexOfOrNull"
import {noneByCollectionHolder}                      from "../../src/method/none"
import {mapByCollectionHolder}                       from "../../src/method/map"
import {mapIndexedByCollectionHolder}                from "../../src/method/mapIndexed"
import {mapNotNullByCollectionHolder}                from "../../src/method/mapNotNull"
import {mapNotNullIndexedByCollectionHolder}         from "../../src/method/mapNotNullIndexed"
import {onEachByCollectionHolder}                    from "../../src/method/onEach"
import {onEachIndexedByCollectionHolder}             from "../../src/method/onEachIndexed"
import {requireNoNullsByCollectionHolder}            from "../../src/method/requireNoNulls"
import {sliceByCollectionHolder}                     from "../../src/method/slice"
import {takeByCollectionHolder}                      from "../../src/method/take"
import {takeLastByCollectionHolder}                  from "../../src/method/takeLast"
import {takeLastWhileByCollectionHolder}             from "../../src/method/takeLastWhile"
import {takeLastWhileIndexedByCollectionHolder}      from "../../src/method/takeLastWhileIndexed"
import {takeWhileByCollectionHolder}                 from "../../src/method/takeWhile"
import {takeWhileIndexedByCollectionHolder}          from "../../src/method/takeWhileIndexed"
import {toArrayByCollectionHolder}                   from "../../src/method/toArray"
import {toIteratorByCollectionHolder}                from "../../src/method/toIterator"
import {toLocaleLowerCaseStringByCollectionHolder}   from "../../src/method/toLocaleLowerCaseString"
import {toLocaleStringByCollectionHolder}            from "../../src/method/toLocaleString"
import {toLocaleUpperCaseStringByCollectionHolder}   from "../../src/method/toLocaleUpperCaseString"
import {toLowerCaseStringByCollectionHolder}         from "../../src/method/toLowerCaseString"
import {toMapByCollectionHolder}                     from "../../src/method/toMap"
import {toMutableArrayByCollectionHolder}            from "../../src/method/toMutableArray"
import {toMutableMapByCollectionHolder}              from "../../src/method/toMutableMap"
import {toMutableSetByCollectionHolder}              from "../../src/method/toMutableSet"
import {toReverseByCollectionHolder}                 from "../../src/method/toReverse"
import {toSetByCollectionHolder}                     from "../../src/method/toSet"
import {toStringByCollectionHolder}                  from "../../src/method/toString"
import {toUpperCaseStringByCollectionHolder}         from "../../src/method/toUpperCaseString"
import {AbstractCollectionHolderForTest}             from "./AbstractCollectionHolderForTest"

/** A test instance to test exclusively the extension methods for a {@link CollectionHolder} */
export class CollectionHolder_FromExtensionFunction<const T, >
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

    public get size(): number {
        return this.array.length
    }

    public get isEmpty(): boolean {
        return isEmptyByCollectionHolder<T>(this,)
    }

    public get isNotEmpty(): boolean {
        return isNotEmptyByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get(index: number,): T {
        if (index < 0)
            throw new Error("The method “get” was not expected to be called with a negative index",)
        if (index >= this.array.length)
            throw new Error("The method “get” was not expected to be called with an index equal or over the size",)
        return this.array[index] as T
    }

    public override getFirst(): T {
        return getFirstByCollectionHolder<T>(this,)
    }

    public override getLast(): T {
        return getLastByCollectionHolder<T>(this,)
    }

    public override getFirstOrNull(): NullOr<T> {
        return getFirstOrNullByCollectionHolder<T>(this,)
    }

    public override getLastOrNull(): NullOr<T> {
        return getLastOrNullByCollectionHolder<T>(this,)
    }

    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return getOrElseByCollectionHolder(this as CollectionHolder, index, defaultValue,)
    }

    public override getOrNull(index: number,): NullOr<T> {
        return getOrNullByCollectionHolder<T>(this, index,)
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find --------------------

    public override findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findFirst(predicate: BooleanCallback<T>,): T
    public override findFirst(predicate: BooleanCallback<T>,) {
        return findFirstByCollectionHolder(this, predicate,)
    }

    public override findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findFirstOrNull(predicate: BooleanCallback<T>,) {
        return findFirstOrNullByCollectionHolder(this, predicate,)
    }

    public override findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedByCollectionHolder(this, predicate,)
    }

    public override findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedOrNullByCollectionHolder(this, predicate,)
    }


    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findLast(predicate: BooleanCallback<T>,): T
    public override findLast(predicate: BooleanCallback<T>,) {
        return findLastByCollectionHolder(this, predicate,)
    }

    public override findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLastOrNull(predicate: BooleanCallback<T>,) {
        return findLastOrNullByCollectionHolder(this, predicate,)
    }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedByCollectionHolder(this, predicate,)
    }

    public override findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedOrNullByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number {
        return firstIndexOfByCollectionHolder<T>(this, element, fromIndex, toIndex,)
    }

    public override firstIndexOfOrNull(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return firstIndexOfOrNullByCollectionHolder<T>(this, element, fromIndex, toIndex,)
    }



    public override lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number {
        return lastIndexOfByCollectionHolder<T>(this, element, fromIndex, toIndex,)
    }

    public override lastIndexOfOrNull(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return lastIndexOfOrNullByCollectionHolder<T>(this, element, fromIndex, toIndex,)
    }


    public override indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number {
        return indexOfFirstByCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    public override indexOfFirstOrNull(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return indexOfFirstOrNullByCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number {
        return indexOfFirstIndexedByCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return indexOfFirstIndexedOrNullByCollectionHolder(this, predicate, fromIndex, toIndex,)
    }


    public override indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number {
        return indexOfLastByCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    public override indexOfLastOrNull(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return indexOfLastOrNullByCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number {
        return indexOfLastIndexedByCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return indexOfLastIndexedOrNullByCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    public override all<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) {
        return allByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) {
        return anyByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) {
        return noneByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    public override get hasNull(): boolean {
        return hasNullByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has duplicate --------------------

    public override get hasDuplicate(): boolean {
        return hasDuplicateByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Has duplicate --------------------

    //#region -------------------- Has --------------------

    public override has(value: T,): boolean {
        return hasByCollectionHolder<T>(this, value,)
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
        return hasOneByCollectionHolder<T>(this, values,)
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
        return hasAllByCollectionHolder<T>(this, values,)
    }

    //#endregion -------------------- Has all --------------------

    //#region -------------------- Require no nulls --------------------

    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        return requireNoNullsByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) {
        return filterByCollectionHolder(this, predicate,)
    }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterIndexedByCollectionHolder(this, predicate,)
    }


    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,) {
        return filterNotByCollectionHolder(this, predicate,)
    }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterNotIndexedByCollectionHolder(this, predicate,)
    }


    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNullByCollectionHolder<T>(this,)
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
        return sliceByCollectionHolder<T>(this, indicesOrFromIndex, toIndex,)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<T> {
        return takeByCollectionHolder<T>(this, n,)
    }

    public override takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeWhile(predicate: BooleanCallback<T>,) {
        return takeWhileByCollectionHolder(this, predicate,)
    }

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeWhileIndexedByCollectionHolder(this, predicate,)
    }


    public override takeLast(n: number,): CollectionHolder<T> {
        return takeLastByCollectionHolder<T>(this, n,)
    }

    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) {
        return takeLastWhileByCollectionHolder(this, predicate,)
    }

    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeLastWhileIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<T> {
        return dropByCollectionHolder<T>(this, n,)
    }

    public override dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropWhile(predicate: BooleanCallback<T>,) {
        return dropWhileByCollectionHolder(this, predicate,)
    }

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropWhileIndexedByCollectionHolder(this, predicate,)
    }


    public override dropLast(n: number,): CollectionHolder<T> {
        return dropLastByCollectionHolder<T>(this, n,)
    }

    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) {
        return dropLastWhileByCollectionHolder(this, predicate,)
    }

    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropLastWhileIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapByCollectionHolder(this, transform,)
    }

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexedByCollectionHolder(this, transform,)
    }


    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullByCollectionHolder(this, transform,)
    }

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexedByCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    public override forEach(action: ValueIndexCallback<T>,): void {
        forEachByCollectionHolder(this, action,)
    }

    public override forEachIndexed(action: IndexValueCallback<T>,): void {
        forEachIndexedByCollectionHolder(this, action,)
    }

    //#endregion -------------------- For each --------------------
    //#region -------------------- On each --------------------

    public override onEach(action: ValueIndexCallback<T>,): this {
        return onEachByCollectionHolder(this, action,)
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        return onEachIndexedByCollectionHolder(this, action,)
    }

    //#endregion -------------------- On each --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    public override toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T> {
        return toReverseByCollectionHolder<T>(this, fromIndex, toIndex,)
    }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public override [Symbol.iterator](): CollectionIterator<T> {
        return toIteratorByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To other structure --------------------

    public override toArray(): readonly T[] {
        return toArrayByCollectionHolder<T>(this,)
    }

    public override toMutableArray(): T[] {
        return toMutableArrayByCollectionHolder<T>(this,)
    }


    public override toSet(): ReadonlySet<T> {
        return toSetByCollectionHolder<T>(this,)
    }

    public override toMutableSet(): Set<T> {
        return toMutableSetByCollectionHolder<T>(this,)
    }


    public override toMap(): ReadonlyMap<number, T> {
        return toMapByCollectionHolder<T>(this,)
    }

    public override toMutableMap(): Map<number, T> {
        return toMutableMapByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- To other structure --------------------
    //#region -------------------- To string --------------------

    public override toString(): string {
        return toStringByCollectionHolder<T>(this,)
    }

    public override toLocaleString(locale?: NullableString,): string {
        return toLocaleStringByCollectionHolder<T>(this, locale,)
    }

    public override toLowerCaseString(): string {
        return toLowerCaseStringByCollectionHolder<T>(this,)
    }

    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        return toLocaleLowerCaseStringByCollectionHolder<T>(this, locale,)
    }

    public override toUpperCaseString(): string {
        return toUpperCaseStringByCollectionHolder<T>(this,)
    }

    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        return toLocaleUpperCaseStringByCollectionHolder<T>(this, locale,)
    }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToStringByCollectionHolder(this, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

}
