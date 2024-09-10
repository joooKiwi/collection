/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, TemplateOrNumber} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                                                                    from "../../src/CollectionHolder"
import type {BooleanCallback, CollectionHolderName, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, PossibleIterableArraySetOrCollectionHolder, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../../src/CollectionHolder.types"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                                                          from "../../src/MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                                                                  from "../../src/iterator/CollectionIterator"

import {AbstractCollectionHolder}                                           from "../../src/AbstractCollectionHolder"
import {all as allByCollectionHolder}                                       from "../../src/method/collectionHolder/all"
import {all as allByMinimalistCollectionHolder}                             from "../../src/method/minimalistCollectionHolder/all"
import {any as anyByCollectionHolder}                                       from "../../src/method/collectionHolder/any"
import {any as anyByMinimalistCollectionHolder}                             from "../../src/method/minimalistCollectionHolder/any"
import {filter as filterByCollectionHolder}                                 from "../../src/method/collectionHolder/filter"
import {filter as filterByMinimalistCollectionHolder}                       from "../../src/method/minimalistCollectionHolder/filter"
import {filterIndexed as filterIndexedByCollectionHolder}                   from "../../src/method/collectionHolder/filterIndexed"
import {filterIndexed as filterIndexedByMinimalistCollectionHolder}         from "../../src/method/minimalistCollectionHolder/filterIndexed"
import {filterNot as filterNotByCollectionHolder}                           from "../../src/method/collectionHolder/filterNot"
import {filterNot as filterNotByMinimalistCollectionHolder}                 from "../../src/method/minimalistCollectionHolder/filterNot"
import {filterNotIndexed as filterNotIndexedByCollectionHolder}             from "../../src/method/collectionHolder/filterNotIndexed"
import {filterNotIndexed as filterNotIndexedByMinimalistCollectionHolder}   from "../../src/method/minimalistCollectionHolder/filterNotIndexed"
import {forEach as forEachByCollectionHolder}                               from "../../src/method/collectionHolder/forEach"
import {forEach as forEachByMinimalistCollectionHolder}                     from "../../src/method/minimalistCollectionHolder/forEach"
import {forEachIndexed as forEachIndexedByCollectionHolder}                 from "../../src/method/collectionHolder/forEachIndexed"
import {forEachIndexed as forEachIndexedByMinimalistCollectionHolder}       from "../../src/method/minimalistCollectionHolder/forEachIndexed"
import {none as noneByCollectionHolder}                                     from "../../src/method/collectionHolder/none"
import {none as noneByMinimalistCollectionHolder}                           from "../../src/method/minimalistCollectionHolder/none"
import {onEach as onEachByCollectionHolder}                                 from "../../src/method/collectionHolder/onEach"
import {onEach as onEachByMinimalistCollectionHolder}                       from "../../src/method/minimalistCollectionHolder/onEach"
import {onEachIndexed as onEachIndexedByCollectionHolder}                   from "../../src/method/collectionHolder/onEachIndexed"
import {onEachIndexed as onEachIndexedByMinimalistCollectionHolder}         from "../../src/method/minimalistCollectionHolder/onEachIndexed"
import {toSet as toSetByCollectionHolder}                                   from "../../src/method/collectionHolder/toSet"
import {toSet as toSetByMinimalistCollectionHolder}                         from "../../src/method/minimalistCollectionHolder/toSet"
import {toString as toStringByCollectionHolder}                             from "../../src/method/collectionHolder/toString"
import {toString as toStringByMinimalistCollectionHolder}                   from "../../src/method/minimalistCollectionHolder/toString"
import {toUpperCaseString as toUpperCaseStringByCollectionHolder}           from "../../src/method/collectionHolder/toUpperCaseString"
import {toUpperCaseString as toUpperCaseStringByMinimalistCollectionHolder} from "../../src/method/minimalistCollectionHolder/toUpperCaseString"

import {filterNotNull, filterNotNullByCollectionHolder}                     from "../../src/method/filterNotNull"
import {find, findByCollectionHolder}                                       from "../../src/method/find"
import {findIndexed, findIndexedByCollectionHolder}                         from "../../src/method/findIndexed"
import {findLast, findLastByCollectionHolder}                               from "../../src/method/findLast"
import {findLastIndexed, findLastIndexedByCollectionHolder}                 from "../../src/method/findLastIndexed"
import {first, firstByCollectionHolder}                                     from "../../src/method/first"
import {firstOrNull, firstOrNullByCollectionHolder}                         from "../../src/method/firstOrNull"
import {has, hasByCollectionHolder}                                         from "../../src/method/has"
import {hasAll, hasAllByCollectionHolder}                                   from "../../src/method/hasAll"
import {hasDuplicate, hasDuplicateByCollectionHolder}                       from "../../src/method/hasDuplicate"
import {hasNull, hasNullByCollectionHolder}                                 from "../../src/method/hasNull"
import {hasOne, hasOneByCollectionHolder}                                   from "../../src/method/hasOne"
import {indexOf, indexOfByCollectionHolder}                                 from "../../src/method/indexOf"
import {indexOfFirst, indexOfFirstByCollectionHolder}                       from "../../src/method/indexOfFirst"
import {indexOfFirstIndexed, indexOfFirstIndexedByCollectionHolder}         from "../../src/method/indexOfFirstIndexed"
import {indexOfLast, indexOfLastByCollectionHolder}                         from "../../src/method/indexOfLast"
import {indexOfLastIndexed, indexOfLastIndexedByCollectionHolder}           from "../../src/method/indexOfLastIndexed"
import {joinToString, joinToStringByCollectionHolder}                       from "../../src/method/joinToString"
import {last, lastByCollectionHolder}                                       from "../../src/method/last"
import {lastIndexOf, lastIndexOfByCollectionHolder}                         from "../../src/method/lastIndexOf"
import {lastOrNull, lastOrNullByCollectionHolder}                           from "../../src/method/lastOrNull"
import {map, mapByCollectionHolder}                                         from "../../src/method/map"
import {mapIndexed, mapIndexedByCollectionHolder}                           from "../../src/method/mapIndexed"
import {mapNotNull, mapNotNullByCollectionHolder}                           from "../../src/method/mapNotNull"
import {mapNotNullIndexed, mapNotNullIndexedByCollectionHolder}             from "../../src/method/mapNotNullIndexed"
import {requireNoNulls, requireNoNullsByCollectionHolder}                   from "../../src/method/requireNoNulls"
import {slice, sliceByCollectionHolder}                                     from "../../src/method/slice"
import {toArray, toArrayByCollectionHolder}                                 from "../../src/method/toArray"
import {toIterator, toIteratorByCollectionHolder}                           from "../../src/method/toIterator"
import {toLocaleLowerCaseString, toLocaleLowerCaseStringByCollectionHolder} from "../../src/method/toLocaleLowerCaseString"
import {toLocaleString, toLocaleStringByCollectionHolder}                   from "../../src/method/toLocaleString"
import {toLocaleUpperCaseString, toLocaleUpperCaseStringByCollectionHolder} from "../../src/method/toLocaleUpperCaseString"
import {toLowerCaseString, toLowerCaseStringByCollectionHolder}             from "../../src/method/toLowerCaseString"
import {toMap, toMapByCollectionHolder}                                     from "../../src/method/toMap"
import {toMutableArray, toMutableArrayByCollectionHolder}                   from "../../src/method/toMutableArray"
import {toMutableSet, toMutableSetByCollectionHolder}                       from "../../src/method/toMutableSet"
import {toMutableMap, toMutableMapByCollectionHolder}                       from "../../src/method/toMutableMap"
import {toReverse, toReverseByCollectionHolder}                             from "../../src/method/toReverse"

/** A {@link CollectionHolder} that count the amount of time the {@link get} is being called */
export class CollectionHolderThatCountGetBeingCalled<const out T, >
    implements CollectionHolder<T> {

    [index: TemplateOrNumber]: undefined

    readonly #instance
    /** The instance is specifically a child of {@link AbstractCollectionHolder} */
    readonly #isCollectionHolder
    /** The amount of time the method {@link get} has been called on the {@link execute} */
    public amountOfCall = 0

    public constructor(instance: CollectionHolder<T>,) {
        this.#instance = instance
        this.#isCollectionHolder = instance instanceof AbstractCollectionHolder
    }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    //#region -------------------- Getter methods --------------------

    public get length(): never {
        throw new Error("The getter method \"length\" was not expected to be called.",)
    }

    public get count(): never {
        throw new Error("The getter method \"count\" was not expected to be called.",)
    }

    public get size(): number {
        return this.#instance.size
    }


    public get isEmpty(): boolean {
        return this.#instance.isEmpty
    }

    public get isNotEmpty(): never {
        throw new Error("The getter method \"isNotEmpty\" was not expected to be called.",)
    }


    public get hasNull(): boolean {
        return this.#isCollectionHolder
            ? hasNullByCollectionHolder(this,)
            : hasNull(this,)
    }

    public get includesNull(): never {
        throw new Error("The getter method \"includesNull\" was not expected to be called.",)
    }

    public get containsNull(): never {
        throw new Error("The getter method \"containsNull\" was not expected to be called.",)
    }


    public get hasDuplicate(): boolean {
        return this.#isCollectionHolder
            ? hasDuplicateByCollectionHolder(this,)
            : hasDuplicate(this,)
    }

    public get includesDuplicate(): never {
        throw new Error("The getter method \"includesDuplicate\" was not expected to be called.",)
    }

    public get containsDuplicate(): never {
        throw new Error("The getter method \"containsDuplicate\" was not expected to be called.",)
    }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Value methods --------------------

    //#region -------------------- Get methods --------------------

    public get(index: number,): T {
        this.amountOfCall++
        return this.#instance.get(index,)
    }

    public at(index?: number,): never
    public at() {
        throw new Error("The method \"at\" was not expected to be called in a test.",)
    }

    public elementAt(index?: number,): never
    public elementAt() {
        throw new Error("The method \"elementAt\" was not expected to be called in a test.",)
    }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Get or else methods --------------------

    public getOrElse<const U, >(index?: number, defaultValue?: IndexWithReturnCallback<U>,): never
    public getOrElse(index?: number, defaultValue?: IndexWithReturnCallback<T>,): never
    public getOrElse() {
        throw new Error("The method \"getOrElse\" was not expected to be called in a test.",)
    }

    public atOrElse<const U, >(index?: number, defaultValue?: IndexWithReturnCallback<U>,): never
    public atOrElse(index?: number, defaultValue?: IndexWithReturnCallback<T>,): never
    public atOrElse() {
        throw new Error("The method \"atOrElse\" was not expected to be called in a test.",)
    }

    public elementAtOrElse<const U, >(index?: number, defaultValue?: IndexWithReturnCallback<U>,): never
    public elementAtOrElse(index?: number, defaultValue?: IndexWithReturnCallback<T>,): never
    public elementAtOrElse() {
        throw new Error("The method \"elementAtOrElse\" was not expected to be called in a test.",)
    }

    //#endregion -------------------- Get or else methods --------------------
    //#region -------------------- Get or null methods --------------------

    public getOrNull(index?: number,): never
    public getOrNull() {
        throw new Error("The method \"getOrNull\" was not expected to be called in a test.",)
    }

    public atOrNull(index?: number,): never
    public atOrNull() {
        throw new Error("The method \"atOrNull\" was not expected to be called in a test.",)
    }

    public elementAtOrNull(index?: number,): never
    public elementAtOrNull() {
        throw new Error("The method \"elementAtOrNull\" was not expected to be called in a test.",)
    }

    //#endregion -------------------- Get or null methods --------------------

    //#region -------------------- Index of methods --------------------

    public indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public indexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public indexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,) {
        return this.#isCollectionHolder
            ? indexOfByCollectionHolder(this, element, fromIndex, toIndex, limit,)
            : indexOf(this, element, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index of methods --------------------
    //#region -------------------- Last index of methods --------------------

    public lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public lastIndexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public lastIndexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,) {
        return this.#isCollectionHolder
            ? lastIndexOfByCollectionHolder(this, element, fromIndex, toIndex, limit,)
            : lastIndexOf(this, element, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Last index of methods --------------------
    //#region -------------------- Index of first methods --------------------

    public indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber {
        return this.#isCollectionHolder
            ? indexOfFirstByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
            : indexOfFirst(this, predicate, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index of first methods --------------------
    //#region -------------------- Index of first indexed methods --------------------

    public indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber {
        return this.#isCollectionHolder
            ? indexOfFirstIndexedByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
            : indexOfFirstIndexed(this, predicate, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index of first indexed methods --------------------
    //#region -------------------- Index of last methods --------------------

    public indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber {
        return this.#isCollectionHolder
            ? indexOfLastByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
            : indexOfLast(this, predicate, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index of last methods --------------------
    //#region -------------------- Index of last indexed methods --------------------

    public indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber {
        return this.#isCollectionHolder
            ? indexOfLastIndexedByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
            : indexOfLastIndexed(this, predicate, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index of last indexed methods --------------------

    //#region -------------------- First methods --------------------

    public first(): T
    public first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
    public first(predicate: Nullable<BooleanCallback<T>>,): T
    public first(predicate?: Nullable<BooleanCallback<T>>,) {
        return this.#isCollectionHolder
            ? firstByCollectionHolder(this, predicate,)
            : first(this, predicate,)
    }

    //#endregion -------------------- First methods --------------------
    //#region -------------------- First or null methods --------------------

    public firstOrNull(): NullOr<T>
    public firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public firstOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        return this.#isCollectionHolder
            ? firstOrNullByCollectionHolder(this, predicate,)
            : firstOrNull(this, predicate,)
    }

    //#endregion -------------------- First or null methods --------------------

    //#region -------------------- Last methods --------------------

    public last(): T
    public last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
    public last(predicate: Nullable<BooleanCallback<T>>,): T
    public last(predicate?: Nullable<BooleanCallback<T>>,) {
        return this.#isCollectionHolder
            ? lastByCollectionHolder(this, predicate,)
            : last(this, predicate,)
    }

    //#endregion -------------------- Last methods --------------------
    //#region -------------------- Last or null methods --------------------

    public lastOrNull(): NullOr<T>
    public lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public lastOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        return this.#isCollectionHolder
            ? lastOrNullByCollectionHolder(this, predicate,)
            : lastOrNull(this, predicate,)
    }

    //#endregion -------------------- Last or null methods --------------------

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- All methods --------------------

    public all(predicate: BooleanCallback<T>,): boolean {
        return this.#isCollectionHolder
            ? allByCollectionHolder(this, predicate,)
            : allByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- All methods --------------------
    //#region -------------------- Any methods --------------------

    public any(): this["isNotEmpty"]
    public any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public any(predicate?: Nullable<BooleanCallback<T>>,) {
        return this.#isCollectionHolder
            ? anyByCollectionHolder(this, predicate,)
            : anyByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Any methods --------------------
    //#region -------------------- None methods --------------------

    public none(): this["isEmpty"]
    public none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public none(predicate?: Nullable<BooleanCallback<T>>,) {
        return this.#isCollectionHolder
            ? noneByCollectionHolder(this, predicate,)
            : noneByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- None methods --------------------

    //#region -------------------- Has methods --------------------

    public has(value: T,): boolean
    public has(value: unknown,): boolean
    public has(value: unknown,) {
        return this.#isCollectionHolder
            ? hasByCollectionHolder(this, value,)
            : has(this, value,)
    }

    public includes(value?: T,): never
    public includes(value?: unknown,): never
    public includes() {
        throw new Error("The method \"includes\" was not expected to be called.",)
    }

    public contains(value?: T,): never
    public contains(value?: unknown,): never
    public contains() {
        throw new Error("The method \"contains\" was not expected to be called.",)
    }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- Has one methods --------------------

    public hasOne(values: readonly T[],): boolean
    public hasOne(values: ReadonlySet<T>,): boolean
    public hasOne(values: CollectionHolder<T>,): boolean
    public hasOne(values: MinimalistCollectionHolder<T>,): boolean
    public hasOne(values: CollectionIterator<T>,): boolean
    public hasOne(values: Iterable<T>,): boolean
    public hasOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public hasOne(values: readonly unknown[],): boolean
    public hasOne(values: ReadonlySet<unknown>,): boolean
    public hasOne(values: CollectionHolder,): boolean
    public hasOne(values: MinimalistCollectionHolder,): boolean
    public hasOne(values: CollectionIterator,): boolean
    public hasOne(values: Iterable<unknown>,): boolean
    public hasOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public hasOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean {
        return this.#isCollectionHolder
            ? hasOneByCollectionHolder(this, values,)
            : hasOne(this, values,)
    }

    public includesOne(values?: readonly T[],): never
    public includesOne(values?: ReadonlySet<T>,): never
    public includesOne(values?: CollectionHolder<T>,): never
    public includesOne(values?: MinimalistCollectionHolder<T>,): never
    public includesOne(values?: CollectionIterator<T>,): never
    public includesOne(values?: Iterable<T>,): never
    public includesOne(values?: PossibleIterableArraySetOrCollectionHolder<T>,): never
    public includesOne(values?: readonly unknown[],): never
    public includesOne(values?: ReadonlySet<unknown>,): never
    public includesOne(values?: CollectionHolder,): never
    public includesOne(values?: MinimalistCollectionHolder,): never
    public includesOne(values?: CollectionIterator,): never
    public includesOne(values?: Iterable<unknown>,): never
    public includesOne(values?: PossibleIterableArraySetOrCollectionHolder<unknown>,): never
    public includesOne() {
        throw new Error("The method \"includesOne\" was not expected to be called.",)
    }

    public containsOne(values?: readonly T[],): never
    public containsOne(values?: ReadonlySet<T>,): never
    public containsOne(values?: CollectionHolder<T>,): never
    public containsOne(values?: MinimalistCollectionHolder<T>,): never
    public containsOne(values?: CollectionIterator<T>,): never
    public containsOne(values?: Iterable<T>,): never
    public containsOne(values?: PossibleIterableArraySetOrCollectionHolder<T>,): never
    public containsOne(values?: readonly unknown[],): never
    public containsOne(values?: ReadonlySet<unknown>,): never
    public containsOne(values?: CollectionHolder,): never
    public containsOne(values?: MinimalistCollectionHolder,): never
    public containsOne(values?: CollectionIterator,): never
    public containsOne(values?: Iterable<unknown>,): never
    public containsOne(values?: PossibleIterableArraySetOrCollectionHolder<unknown>,): never
    public containsOne() {
        throw new Error("The method \"containsOne\" was not expected to be called.",)
    }

    //#endregion -------------------- Has one methods --------------------
    //#region -------------------- Has all methods --------------------

    public hasAll(values: readonly T[],): boolean
    public hasAll(values: ReadonlySet<T>,): boolean
    public hasAll(values: CollectionHolder<T>,): boolean
    public hasAll(values: MinimalistCollectionHolder<T>,): boolean
    public hasAll(values: CollectionIterator<T>,): boolean
    public hasAll(values: Iterable<T>,): boolean
    public hasAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public hasAll(values: readonly unknown[],): boolean
    public hasAll(values: ReadonlySet<unknown>,): boolean
    public hasAll(values: CollectionHolder,): boolean
    public hasAll(values: MinimalistCollectionHolder,): boolean
    public hasAll(values: CollectionIterator,): boolean
    public hasAll(values: Iterable<unknown>,): boolean
    public hasAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public hasAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) {
        return this.#isCollectionHolder
            ? hasAllByCollectionHolder(this, values,)
            : hasAll(this, values,)
    }

    public includesAll(values?: readonly T[],): never
    public includesAll(values?: ReadonlySet<T>,): never
    public includesAll(values?: CollectionHolder<T>,): never
    public includesAll(values?: MinimalistCollectionHolder<T>,): never
    public includesAll(values?: CollectionIterator<T>,): never
    public includesAll(values?: Iterable<T>,): never
    public includesAll(values?: PossibleIterableArraySetOrCollectionHolder<T>,): never
    public includesAll(values?: readonly unknown[],): never
    public includesAll(values?: ReadonlySet<unknown>,): never
    public includesAll(values?: CollectionHolder,): never
    public includesAll(values?: MinimalistCollectionHolder,): never
    public includesAll(values?: CollectionIterator,): never
    public includesAll(values?: Iterable<unknown>,): never
    public includesAll(values?: PossibleIterableArraySetOrCollectionHolder<unknown>,): never
    public includesAll() {
        throw new Error("The method \"includesAll\" was not expected to be called.",)
    }

    public containsAll(values?: readonly T[],): never
    public containsAll(values?: ReadonlySet<T>,): never
    public containsAll(values?: CollectionHolder<T>,): never
    public containsAll(values?: MinimalistCollectionHolder<T>,): never
    public containsAll(values?: CollectionIterator<T>,): never
    public containsAll(values?: Iterable<T>,): never
    public containsAll(values?: PossibleIterableArraySetOrCollectionHolder<T>,): never
    public containsAll(values?: readonly unknown[],): never
    public containsAll(values?: ReadonlySet<unknown>,): never
    public containsAll(values?: CollectionHolder,): never
    public containsAll(values?: MinimalistCollectionHolder,): never
    public containsAll(values?: CollectionIterator,): never
    public containsAll(values?: Iterable<unknown>,): never
    public containsAll(values?: PossibleIterableArraySetOrCollectionHolder<unknown>,): never
    public containsAll() {
        throw new Error("The method \"containsAll\" was not expected to be called.",)
    }

    //#endregion -------------------- Has all methods --------------------

    //#region -------------------- Join to string methods --------------------

    public join(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): never
    public join() {
        throw new Error("The method \"join\" was not expected to be called.",)
    }

    public joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return this.#isCollectionHolder
            ? joinToStringByCollectionHolder(this, separator, prefix, postfix, limit, truncated, transform,)
            : joinToString(this, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Join to string methods --------------------

    //#region -------------------- Filter methods --------------------

    public filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filter(predicate: BooleanCallback<T>,) {
        return this.#isCollectionHolder
            ? filterByCollectionHolder(this, predicate,)
            : filterByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter methods --------------------
    //#region -------------------- Filter indexed methods --------------------

    public filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.#isCollectionHolder
            ? filterIndexedByCollectionHolder(this, predicate,)
            : filterIndexedByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter indexed methods --------------------
    //#region -------------------- Filter not methods --------------------

    public filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filterNot(predicate: BooleanCallback<T>,) {
        return this.#isCollectionHolder
            ? filterNotByCollectionHolder(this, predicate,)
            : filterNotByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter not methods --------------------
    //#region -------------------- Filter not indexed methods --------------------

    public filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.#isCollectionHolder
            ? filterNotIndexedByCollectionHolder(this, predicate,)
            : filterNotIndexedByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter not indexed methods --------------------
    //#region -------------------- Filter not null methods --------------------

    public filterNotNull(): CollectionHolder<NonNullable<T>> {
        return this.#isCollectionHolder
            ? filterNotNullByCollectionHolder<T>(this,)
            : filterNotNull(this,)
    }

    //#endregion -------------------- Filter not null methods --------------------
    //#region -------------------- Require no nulls methods --------------------

    public requireNoNulls(): CollectionHolder<NonNullable<T>> {
        return this.#isCollectionHolder
            ? requireNoNullsByCollectionHolder<T>(this,)
            : requireNoNulls<T>(this,)
    }

    //#endregion -------------------- Require no nulls methods --------------------

    //#region -------------------- Find methods --------------------

    public find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public find(predicate: BooleanCallback<T>,): NullOr<T>
    public find(predicate: BooleanCallback<T>,) {
        return this.#isCollectionHolder
            ? findByCollectionHolder(this, predicate,)
            : find(this, predicate,)
    }

    //#endregion -------------------- Find methods --------------------
    //#region -------------------- Find indexed methods --------------------

    public findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.#isCollectionHolder
            ? findIndexedByCollectionHolder(this, predicate,)
            : findIndexed(this, predicate,)
    }

    //#endregion -------------------- Find indexed methods --------------------
    //#region -------------------- Find last methods --------------------

    public findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLast(predicate: BooleanCallback<T>,): NullOr<T>
    public findLast(predicate: BooleanCallback<T>,) {
        return this.#isCollectionHolder
            ? findLastByCollectionHolder(this, predicate,)
            : findLast(this, predicate,)
    }

    //#endregion -------------------- Find last methods --------------------
    //#region -------------------- Find last indexed methods --------------------

    public findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.#isCollectionHolder
            ? findLastIndexedByCollectionHolder(this, predicate,)
            : findLastIndexed(this, predicate,)
    }

    //#endregion -------------------- Find last indexed methods --------------------

    //#region -------------------- Slice methods --------------------

    public slice(indices: readonly number[],): CollectionHolder<T>
    public slice(indices: ReadonlySet<number>,): CollectionHolder<T>
    public slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public slice(indices: Iterable<number>,): CollectionHolder<T>
    public slice(indices: PossibleIterableArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public slice(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber, limit?: NullableNumber,) {
        return this.#isCollectionHolder
            ? sliceByCollectionHolder<T>(this, indicesOrFromIndex, toIndex, limit,)
            : slice(this, indicesOrFromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Slice methods --------------------

    //#region -------------------- Map methods --------------------

    public map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return this.#isCollectionHolder
            ? mapByCollectionHolder(this, transform,)
            : map(this, transform,)
    }

    //#endregion -------------------- Map methods --------------------
    //#region -------------------- Map indexed methods --------------------

    public mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return this.#isCollectionHolder
            ? mapIndexedByCollectionHolder(this, transform,)
            : mapIndexed(this, transform,)
    }

    //#endregion -------------------- Map indexed methods --------------------
    //#region -------------------- Map not null methods --------------------

    public mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return this.#isCollectionHolder
            ? mapNotNullByCollectionHolder(this, transform,)
            : mapNotNull(this, transform,)
    }

    //#endregion -------------------- Map not null methods --------------------
    //#region -------------------- Map not null indexed methods --------------------

    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return this.#isCollectionHolder
            ? mapNotNullIndexedByCollectionHolder(this, transform,)
            : mapNotNullIndexed(this, transform,)
    }

    //#endregion -------------------- Map not null indexed methods --------------------

    //#region -------------------- For each methods --------------------

    public forEach(action: ValueIndexCallback<T>,): void {
        this.#isCollectionHolder
            ? forEachByCollectionHolder(this, action,)
            : forEachByMinimalistCollectionHolder(this, action,)
    }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- For each indexed methods --------------------

    public forEachIndexed(action: IndexValueCallback<T>,): void {
        this.#isCollectionHolder
            ? forEachIndexedByCollectionHolder(this, action,)
            : forEachIndexedByMinimalistCollectionHolder(this, action,)
    }

    //#endregion -------------------- For each indexed methods --------------------

    //#region -------------------- On each methods --------------------

    public onEach(action: ValueIndexCallback<T>,): this {
        return this.#isCollectionHolder
            ? onEachByCollectionHolder(this, action,)
            : onEachByMinimalistCollectionHolder(this, action,)
    }

    //#endregion -------------------- On each methods --------------------
    //#region -------------------- On each indexed methods --------------------

    public onEachIndexed(action: IndexValueCallback<T>,): this {
        return this.#isCollectionHolder
            ? onEachIndexedByCollectionHolder(this, action,)
            : onEachIndexedByMinimalistCollectionHolder(this, action,)
    }

    //#endregion -------------------- On each indexed methods --------------------

    //#endregion -------------------- Loop methods --------------------

    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): CollectionIterator<T> {
        return this.#instance[Symbol.iterator]()
    }

    public get [Symbol.toStringTag](): CollectionHolderName {
        return "CollectionHolder"
    }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public toIterator(): CollectionIterator<T> {
        return this.#isCollectionHolder
            ? toIteratorByCollectionHolder<T>(this,)
            : toIterator(this,)
    }


    public toArray(): readonly T[] {
        return this.#isCollectionHolder
            ? toArrayByCollectionHolder<T>(this,)
            : toArray(this,)
    }

    public toMutableArray(): T[] {
        return this.#isCollectionHolder
            ? toMutableArrayByCollectionHolder<T>(this,)
            : toMutableArray(this,)
    }


    public toSet(): ReadonlySet<T> {
        return this.#isCollectionHolder
            ? toSetByCollectionHolder<T>(this,)
            : toSetByMinimalistCollectionHolder(this,)
    }

    public toMutableSet(): Set<T> {
        return this.#isCollectionHolder
            ? toMutableSetByCollectionHolder<T>(this,)
            : toMutableSet(this,)
    }


    public toMap(): ReadonlyMap<number, T> {
        return this.#isCollectionHolder
            ? toMapByCollectionHolder<T>(this,)
            : toMap(this,)
    }

    public toMutableMap(): Map<number, T> {
        return this.#isCollectionHolder
            ? toMutableMapByCollectionHolder<T>(this,)
            : toMutableMap(this,)
    }


    public toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T> {
        return this.#isCollectionHolder
            ? toReverseByCollectionHolder<T>(this, fromIndex, toIndex, limit,)
            : toReverse(this, fromIndex, toIndex, limit,)
    }

    public toReversed(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): never
    public toReversed() {
        throw new Error("The method \"toReversed\" was not expected to be called.",)
    }

    public reversed(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): never
    public reversed() {
        throw new Error("The method \"reversed\" was not expected to be called.",)
    }

    //#region -------------------- Conversion methods (toString) --------------------

    public toString(): string {
        return this.#isCollectionHolder
            ? toStringByCollectionHolder(this,)
            : toStringByMinimalistCollectionHolder(this,)
    }

    public toLocaleString(locale?: NullableString,): string {
        return this.#isCollectionHolder
            ? toLocaleStringByCollectionHolder(this,)
            : toLocaleString(this, locale,)
    }

    public toLowerCaseString(): string {
        return this.#isCollectionHolder
            ? toLowerCaseStringByCollectionHolder(this,)
            : toLowerCaseString(this,)
    }

    public toLocaleLowerCaseString(locale?: NullableString,): string {
        return this.#isCollectionHolder
            ? toLocaleLowerCaseStringByCollectionHolder(this,)
            : toLocaleLowerCaseString(this, locale,)
    }

    public toUpperCaseString(): string {
        return this.#isCollectionHolder
            ? toUpperCaseStringByCollectionHolder(this,)
            : toUpperCaseStringByMinimalistCollectionHolder(this,)
    }

    public toLocaleUpperCaseString(locale?: NullableString,): string {
        return this.#isCollectionHolder
            ? toLocaleUpperCaseStringByCollectionHolder(this,)
            : toLocaleUpperCaseString(this, locale,)
    }

    //#endregion -------------------- Conversion methods (toString) --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}
