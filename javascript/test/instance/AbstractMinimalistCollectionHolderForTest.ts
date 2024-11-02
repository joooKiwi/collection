/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrNumber} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                  from "../../src/CollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                        from "../../src/MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                from "../../src/iterator/CollectionIterator"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../../src/type/callback"
import type {PossibleIterableArraySetOrCollectionHolder}                                                                                                                                                                                                        from "../../src/type/possibleInstance"

import {allByMinimalistCollectionHolder}                       from "../../src/method/all"
import {anyByMinimalistCollectionHolder}                       from "../../src/method/any"
import {dropByMinimalistCollectionHolder}                      from "../../src/method/drop"
import {dropLastByMinimalistCollectionHolder}                  from "../../src/method/dropLast"
import {dropLastWhileByMinimalistCollectionHolder}             from "../../src/method/dropLastWhile"
import {dropLastWhileIndexedByMinimalistCollectionHolder}      from "../../src/method/dropLastWhileIndexed"
import {dropWhileByMinimalistCollectionHolder}                 from "../../src/method/dropWhile"
import {dropWhileIndexedByMinimalistCollectionHolder}          from "../../src/method/dropWhileIndexed"
import {filterByMinimalistCollectionHolder}                    from "../../src/method/filter"
import {filterIndexedByMinimalistCollectionHolder}             from "../../src/method/filterIndexed"
import {filterNotByMinimalistCollectionHolder}                 from "../../src/method/filterNot"
import {filterNotIndexedByMinimalistCollectionHolder}          from "../../src/method/filterNotIndexed"
import {filterNotNullByMinimalistCollectionHolder}             from "../../src/method/filterNotNull"
import {findFirstByMinimalistCollectionHolder}                 from "../../src/method/findFirst"
import {findFirstIndexedByMinimalistCollectionHolder}          from "../../src/method/findFirstIndexed"
import {findFirstIndexedOrNullByMinimalistCollectionHolder}    from "../../src/method/findFirstIndexedOrNull"
import {findFirstOrNullByMinimalistCollectionHolder}           from "../../src/method/findFirstOrNull"
import {findLastByMinimalistCollectionHolder}                  from "../../src/method/findLast"
import {findLastIndexedByMinimalistCollectionHolder}           from "../../src/method/findLastIndexed"
import {findLastIndexedOrNullByMinimalistCollectionHolder}     from "../../src/method/findLastIndexedOrNull"
import {findLastOrNullByMinimalistCollectionHolder}            from "../../src/method/findLastOrNull"
import {firstIndexOfByMinimalistCollectionHolder}              from "../../src/method/firstIndexOf"
import {firstIndexOfOrNullByMinimalistCollectionHolder}        from "../../src/method/firstIndexOfOrNull"
import {forEachByMinimalistCollectionHolder}                   from "../../src/method/forEach"
import {forEachIndexedByMinimalistCollectionHolder}            from "../../src/method/forEachIndexed"
import {getFirstByMinimalistCollectionHolder}                  from "../../src/method/getFirst"
import {getFirstOrNullByMinimalistCollectionHolder}            from "../../src/method/getFirstOrNull"
import {getLastByMinimalistCollectionHolder}                   from "../../src/method/getLast"
import {getLastOrNullByMinimalistCollectionHolder}             from "../../src/method/getLastOrNull"
import {getOrElseByMinimalistCollectionHolder}                 from "../../src/method/getOrElse"
import {getOrNullByMinimalistCollectionHolder}                 from "../../src/method/getOrNull"
import {hasByMinimalistCollectionHolder}                       from "../../src/method/has"
import {hasAllByMinimalistCollectionHolder}                    from "../../src/method/hasAll"
import {hasDuplicateByMinimalistCollectionHolder}              from "../../src/method/hasDuplicate"
import {hasNullByMinimalistCollectionHolder}                   from "../../src/method/hasNull"
import {hasOneByMinimalistCollectionHolder}                    from "../../src/method/hasOne"
import {indexOfFirstByMinimalistCollectionHolder}              from "../../src/method/indexOfFirst"
import {indexOfFirstIndexedByMinimalistCollectionHolder}       from "../../src/method/indexOfFirstIndexed"
import {indexOfFirstIndexedOrNullByMinimalistCollectionHolder} from "../../src/method/indexOfFirstIndexedOrNull"
import {indexOfFirstOrNullByMinimalistCollectionHolder}        from "../../src/method/indexOfFirstOrNull"
import {indexOfLastByMinimalistCollectionHolder}               from "../../src/method/indexOfLast"
import {indexOfLastIndexedByMinimalistCollectionHolder}        from "../../src/method/indexOfLastIndexed"
import {indexOfLastIndexedOrNullByMinimalistCollectionHolder}  from "../../src/method/indexOfLastIndexedOrNull"
import {indexOfLastOrNullByMinimalistCollectionHolder}         from "../../src/method/indexOfLastOrNull"
import {isEmptyByMinimalistCollectionHolder}                   from "../../src/method/isEmpty"
import {isNotEmptyByMinimalistCollectionHolder}                from "../../src/method/isNotEmpty"
import {joinToStringByMinimalistCollectionHolder}              from "../../src/method/joinToString"
import {lastIndexOfByMinimalistCollectionHolder}               from "../../src/method/lastIndexOf"
import {lastIndexOfOrNullByMinimalistCollectionHolder}         from "../../src/method/lastIndexOfOrNull"
import {noneByMinimalistCollectionHolder}                      from "../../src/method/none"
import {mapByMinimalistCollectionHolder}                       from "../../src/method/map"
import {mapIndexedByMinimalistCollectionHolder}                from "../../src/method/mapIndexed"
import {mapNotNullByMinimalistCollectionHolder}                from "../../src/method/mapNotNull"
import {mapNotNullIndexedByMinimalistCollectionHolder}         from "../../src/method/mapNotNullIndexed"
import {onEachByMinimalistCollectionHolder}                    from "../../src/method/onEach"
import {onEachIndexedByMinimalistCollectionHolder}             from "../../src/method/onEachIndexed"
import {requireNoNullsByMinimalistCollectionHolder}            from "../../src/method/requireNoNulls"
import {sliceByMinimalistCollectionHolder}                     from "../../src/method/slice"
import {takeByMinimalistCollectionHolder}                      from "../../src/method/take"
import {takeLastByMinimalistCollectionHolder}                  from "../../src/method/takeLast"
import {takeLastWhileByMinimalistCollectionHolder}             from "../../src/method/takeLastWhile"
import {takeLastWhileIndexedByMinimalistCollectionHolder}      from "../../src/method/takeLastWhileIndexed"
import {takeWhileByMinimalistCollectionHolder}                 from "../../src/method/takeWhile"
import {takeWhileIndexedByMinimalistCollectionHolder}          from "../../src/method/takeWhileIndexed"
import {toArrayByMinimalistCollectionHolder}                   from "../../src/method/toArray"
import {toIteratorByMinimalistCollectionHolder}                from "../../src/method/toIterator"
import {toLocaleLowerCaseStringByMinimalistCollectionHolder}   from "../../src/method/toLocaleLowerCaseString"
import {toLocaleStringByMinimalistCollectionHolder}            from "../../src/method/toLocaleString"
import {toLocaleUpperCaseStringByMinimalistCollectionHolder}   from "../../src/method/toLocaleUpperCaseString"
import {toLowerCaseStringByMinimalistCollectionHolder}         from "../../src/method/toLowerCaseString"
import {toMapByMinimalistCollectionHolder}                     from "../../src/method/toMap"
import {toMutableArrayByMinimalistCollectionHolder}            from "../../src/method/toMutableArray"
import {toMutableMapByMinimalistCollectionHolder}              from "../../src/method/toMutableMap"
import {toMutableSetByMinimalistCollectionHolder}              from "../../src/method/toMutableSet"
import {toReverseByMinimalistCollectionHolder}                 from "../../src/method/toReverse"
import {toSetByMinimalistCollectionHolder}                     from "../../src/method/toSet"
import {toStringByMinimalistCollectionHolder}                  from "../../src/method/toString"
import {toUpperCaseStringByMinimalistCollectionHolder}         from "../../src/method/toUpperCaseString"
import {AbstractCollectionHolderForTest}                       from "./AbstractCollectionHolderForTest"

/** A common ancestor that have the methods reference to the {@link MinimalistCollectionHolder} extension methuods */
export abstract class AbstractMinimalistCollectionHolderForTest<const T, const REFERENCE extends readonly T[], >
    extends AbstractCollectionHolderForTest<T, REFERENCE> {

    //#region -------------------- Size methods --------------------

    public override get isEmpty(): boolean {
        return isEmptyByMinimalistCollectionHolder(this,)
    }

    public override get isNotEmpty(): boolean {
        return isNotEmptyByMinimalistCollectionHolder(this,)
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override getFirst(): T {
        return getFirstByMinimalistCollectionHolder(this,)
    }

    public override getLast(): T {
        return getLastByMinimalistCollectionHolder(this,)
    }

    public override getFirstOrNull(): NullOr<T> {
        return getFirstOrNullByMinimalistCollectionHolder(this,)
    }

    public override getLastOrNull(): NullOr<T> {
        return getLastOrNullByMinimalistCollectionHolder(this,)
    }

    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return getOrElseByMinimalistCollectionHolder(this, index, defaultValue,)
    }

    public override getOrNull(index: number,): NullOr<T> {
        return getOrNullByMinimalistCollectionHolder(this, index,)
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find --------------------

    public override findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findFirst(predicate: BooleanCallback<T>,): T
    public override findFirst(predicate: BooleanCallback<T>,) {
        return findFirstByMinimalistCollectionHolder(this, predicate,)
    }

    public override findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findFirstOrNull(predicate: BooleanCallback<T>,) {
        return findFirstOrNullByMinimalistCollectionHolder(this, predicate,)
    }

    public override findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedByMinimalistCollectionHolder(this, predicate,)
    }

    public override findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedOrNullByMinimalistCollectionHolder(this, predicate,)
    }


    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findLast(predicate: BooleanCallback<T>,): T
    public override findLast(predicate: BooleanCallback<T>,) {
        return findLastByMinimalistCollectionHolder(this, predicate,)
    }

    public override findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLastOrNull(predicate: BooleanCallback<T>,) {
        return findLastOrNullByMinimalistCollectionHolder(this, predicate,)
    }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedByMinimalistCollectionHolder(this, predicate,)
    }

    public override findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedOrNullByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number {
        return firstIndexOfByMinimalistCollectionHolder(this, element, fromIndex, toIndex,)
    }

    public override firstIndexOfOrNull(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return firstIndexOfOrNullByMinimalistCollectionHolder(this, element, fromIndex, toIndex,)
    }


    public override lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number {
        return lastIndexOfByMinimalistCollectionHolder(this, element, fromIndex, toIndex,)
    }

    public override lastIndexOfOrNull(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return lastIndexOfOrNullByMinimalistCollectionHolder(this, element, fromIndex, toIndex,)
    }


    public override indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number {
        return indexOfFirstByMinimalistCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    public override indexOfFirstOrNull(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return indexOfFirstOrNullByMinimalistCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number {
        return indexOfFirstIndexedByMinimalistCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return indexOfFirstIndexedOrNullByMinimalistCollectionHolder(this, predicate, fromIndex, toIndex,)
    }


    public override indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number {
        return indexOfLastByMinimalistCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    public override indexOfLastOrNull(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return indexOfLastOrNullByMinimalistCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number {
        return indexOfLastIndexedByMinimalistCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return indexOfLastIndexedOrNullByMinimalistCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    public override all<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) {
        return allByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) {
        return anyByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) {
        return noneByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    public override get hasNull(): boolean {
        return hasNullByMinimalistCollectionHolder(this,)
    }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has duplicate --------------------

    public override get hasDuplicate(): boolean {
        return hasDuplicateByMinimalistCollectionHolder(this,)
    }

    //#endregion -------------------- Has duplicate --------------------

    //#region -------------------- Has --------------------

    public override has(value: T,): boolean {
        return hasByMinimalistCollectionHolder(this, value,)
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
        return hasOneByMinimalistCollectionHolder(this, values,)
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
        return hasAllByMinimalistCollectionHolder(this, values,)
    }

    //#endregion -------------------- Has all --------------------

    //#region -------------------- Require no nulls --------------------

    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        return requireNoNullsByMinimalistCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) {
        return filterByMinimalistCollectionHolder(this, predicate,)
    }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterIndexedByMinimalistCollectionHolder(this, predicate,)
    }


    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,) {
        return filterNotByMinimalistCollectionHolder(this, predicate,)
    }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterNotIndexedByMinimalistCollectionHolder(this, predicate,)
    }


    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNullByMinimalistCollectionHolder(this,)
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
        return sliceByMinimalistCollectionHolder(this, indicesOrFromIndex, toIndex,)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<T> {
        return takeByMinimalistCollectionHolder(this, n,)
    }

    public override takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeWhile(predicate: BooleanCallback<T>,) {
        return takeWhileByMinimalistCollectionHolder(this, predicate,)
    }

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeWhileIndexedByMinimalistCollectionHolder(this, predicate,)
    }


    public override takeLast(n: number,): CollectionHolder<T> {
        return takeLastByMinimalistCollectionHolder(this, n,)
    }

    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) {
        return takeLastWhileByMinimalistCollectionHolder(this, predicate,)
    }

    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeLastWhileIndexedByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<T> {
        return dropByMinimalistCollectionHolder(this, n,)
    }

    public override dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropWhile(predicate: BooleanCallback<T>,) {
        return dropWhileByMinimalistCollectionHolder(this, predicate,)
    }

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropWhileIndexedByMinimalistCollectionHolder(this, predicate,)
    }


    public override dropLast(n: number,): CollectionHolder<T> {
        return dropLastByMinimalistCollectionHolder(this, n,)
    }

    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) {
        return dropLastWhileByMinimalistCollectionHolder(this, predicate,)
    }

    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropLastWhileIndexedByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapByMinimalistCollectionHolder(this, transform,)
    }

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexedByMinimalistCollectionHolder(this, transform,)
    }


    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullByMinimalistCollectionHolder(this, transform,)
    }

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexedByMinimalistCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    public override forEach(action: ValueIndexCallback<T>,): void {
        forEachByMinimalistCollectionHolder(this, action,)
    }

    public override forEachIndexed(action: IndexValueCallback<T>,): void {
        forEachIndexedByMinimalistCollectionHolder(this, action,)
    }

    //#endregion -------------------- For each --------------------
    //#region -------------------- On each --------------------

    public override onEach(action: ValueIndexCallback<T>,): this {
        return onEachByMinimalistCollectionHolder(this, action,)
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        return onEachIndexedByMinimalistCollectionHolder(this, action,)
    }

    //#endregion -------------------- On each --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    public override toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T> {
        return toReverseByMinimalistCollectionHolder(this, fromIndex, toIndex,)
    }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public override [Symbol.iterator](): CollectionIterator<T> {
        return toIteratorByMinimalistCollectionHolder(this,)
    }

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To other structure --------------------

    public override toArray(): readonly T[] {
        return toArrayByMinimalistCollectionHolder(this,)
    }

    public override toMutableArray(): T[] {
        return toMutableArrayByMinimalistCollectionHolder(this,)
    }


    public override toSet(): ReadonlySet<T> {
        return toSetByMinimalistCollectionHolder(this,)
    }

    public override toMutableSet(): Set<T> {
        return toMutableSetByMinimalistCollectionHolder(this,)
    }


    public override toMap(): ReadonlyMap<number, T> {
        return toMapByMinimalistCollectionHolder(this,)
    }

    public override toMutableMap(): Map<number, T> {
        return toMutableMapByMinimalistCollectionHolder(this,)
    }

    //#endregion -------------------- To other structure --------------------
    //#region -------------------- To string --------------------

    public override toString(): string {
        return toStringByMinimalistCollectionHolder(this,)
    }

    public override toLocaleString(locale?: NullableString,): string {
        return toLocaleStringByMinimalistCollectionHolder(this, locale,)
    }

    public override toLowerCaseString(): string {
        return toLowerCaseStringByMinimalistCollectionHolder(this,)
    }

    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        return toLocaleLowerCaseStringByMinimalistCollectionHolder(this, locale,)
    }

    public override toUpperCaseString(): string {
        return toUpperCaseStringByMinimalistCollectionHolder(this,)
    }

    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        return toLocaleUpperCaseStringByMinimalistCollectionHolder(this, locale,)
    }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToStringByMinimalistCollectionHolder(this, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

}
