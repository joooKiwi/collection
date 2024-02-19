/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                                                                                                                                                                                                                                                                  from "../../src/CollectionHolder"
import type {BooleanCallback, CollectionHolderName, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, ObjectOf, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../../src/CollectionHolder.types"
import type {Nullable, NullOr, NumberOrNumberInString}                                                                                                                                                                                                                                          from "../../src/general type"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                        from "../../src/MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                                from "../../src/iterator/CollectionIterator"

import {AbstractCollectionHolder}                                           from "../../src/AbstractCollectionHolder"
import {all, allByCollectionHolder}                                         from "../../src/method/all"
import {any, anyByCollectionHolder}                                         from "../../src/method/any"
import {filter, filterByCollectionHolder}                                   from "../../src/method/filter"
import {filterIndexed, filterIndexedByCollectionHolder}                     from "../../src/method/filterIndexed"
import {filterIndexedNot, filterIndexedNotByCollectionHolder}               from "../../src/method/filterIndexedNot"
import {filterNot, filterNotByCollectionHolder}                             from "../../src/method/filterNot"
import {filterNotNull, filterNotNullByCollectionHolder}                     from "../../src/method/filterNotNull"
import {find, findByCollectionHolder}                                       from "../../src/method/find"
import {findIndexed, findIndexedByCollectionHolder}                         from "../../src/method/findIndexed"
import {findLast, findLastByCollectionHolder}                               from "../../src/method/findLast"
import {findLastIndexed, findLastIndexedByCollectionHolder}                 from "../../src/method/findLastIndexed"
import {first, firstByCollectionHolder}                                     from "../../src/method/first"
import {firstOrNull, firstOrNullByCollectionHolder}                         from "../../src/method/firstOrNull"
import {forEach}                                                            from "../../src/method/forEach"
import {forEachIndexed}                                                     from "../../src/method/forEachIndexed"
import {hasAll, hasAllByCollectionHolder}                                   from "../../src/method/hasAll"
import {hasNull, hasNullByCollectionHolder}                                 from "../../src/method/hasNull"
import {hasOne, hasOneByCollectionHolder}                                   from "../../src/method/hasOne"
import {indexOf, indexOfByCollectionHolder}                                 from "../../src/method/indexOf"
import {indexOfFirst, indexOfFirstByCollectionHolder}                       from "../../src/method/indexOfFirst"
import {indexOfFirstIndexed, indexOfFirstIndexedByCollectionHolder}         from "../../src/method/indexOfFirstIndexed"
import {indexOfLast, indexOfLastByCollectionHolder}                         from "../../src/method/indexOfLast"
import {indexOfLastIndexed, indexOfLastIndexedByCollectionHolder}           from "../../src/method/indexOfLastIndexed"
import {join, joinByCollectionHolder}                                       from "../../src/method/join"
import {last, lastByCollectionHolder}                                       from "../../src/method/last"
import {lastIndexOf, lastIndexOfByCollectionHolder}                         from "../../src/method/lastIndexOf"
import {lastOrNull, lastOrNullByCollectionHolder}                           from "../../src/method/lastOrNull"
import {none, noneByCollectionHolder}                                       from "../../src/method/none"
import {map, mapByCollectionHolder}                                         from "../../src/method/map"
import {mapIndexed, mapIndexedByCollectionHolder}                           from "../../src/method/mapIndexed"
import {mapNotNull, mapNotNullByCollectionHolder}                           from "../../src/method/mapNotNull"
import {mapNotNullIndexed, mapNotNullIndexedByCollectionHolder}             from "../../src/method/mapNotNullIndexed"
import {objectValuesMap, objectValuesMapByCollectionHolder}                 from "../../src/method/objectValuesMap"
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
import {toMutableWeakSet}                                                   from "../../src/method/toMutableWeakSet"
import {toReverse, toReverseByCollectionHolder}                             from "../../src/method/toReverse"
import {toSet, toSetByCollectionHolder}                                     from "../../src/method/toSet"
import {toString, toStringByCollectionHolder}                               from "../../src/method/toString"
import {toUpperCaseString, toUpperCaseStringByCollectionHolder}             from "../../src/method/toUpperCaseString"
import {toWeakSet}                                                          from "../../src/method/toWeakSet"

/** A {@link CollectionHolder} that count the amount of time the {@link get} is being called */
export class CollectionHolderThatCountGetBeingCalled<const out T, >
    implements CollectionHolder<T> {

    [index: NumberOrNumberInString]: undefined
    readonly #instance
    /** The instance is specifically a child of {@link AbstractCollectionHolder} */
    readonly #isCollectionHolder
    /** The amount of time the method {@link get} has been called on the {@link execute} */
    public amountOfCall = 0

    public constructor(instance: CollectionHolder<T>,) {
        this.#instance = instance
        this.#isCollectionHolder = instance instanceof AbstractCollectionHolder
    }

    public execute(action: (instance: CollectionHolder<T>,) => void,): this {
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

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Value methods --------------------

    //#region -------------------- Get methods --------------------

    public get(index: number,): T {
        this.amountOfCall++
        return this.#instance.get(index,)
    }

    public at(index: number,): T
    public at(): never {
        throw new Error("The method \"at\" was not expected to be called in a test.",)
    }

    public elementAt(index: number,): T
    public elementAt(): never {
        throw new Error("The method \"elementAt\" was not expected to be called in a test.",)
    }


    public getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public getOrElse(): never {
        throw new Error("The method \"getOrElse\" was not expected to be called in a test.",)
    }

    public atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public atOrElse(): never {
        throw new Error("The method \"atOrElse\" was not expected to be called in a test.",)
    }

    public elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public elementAtOrElse(): never {
        throw new Error("The method \"elementAtOrElse\" was not expected to be called in a test.",)
    }


    public getOrNull(index: number,): NullOr<T>
    public getOrNull(): never {
        throw new Error("The method \"getOrNull\" was not expected to be called in a test.",)
    }

    public atOrNull(index: number,): NullOr<T>
    public atOrNull(): never {
        throw new Error("The method \"atOrNull\" was not expected to be called in a test.",)
    }

    public elementAtOrNull(index: number,): NullOr<T>
    public elementAtOrNull(): never {
        throw new Error("The method \"elementAtOrNull\" was not expected to be called in a test.",)
    }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Index methods --------------------

    public indexOf(element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
    public indexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
    public indexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return this.#isCollectionHolder
            ? indexOfByCollectionHolder(this, element, fromIndex, toIndex, limit,)
            : indexOf(this, element, fromIndex, toIndex, limit,)
    }


    public lastIndexOf(element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
    public lastIndexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
    public lastIndexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return this.#isCollectionHolder
            ? lastIndexOfByCollectionHolder(this, element, fromIndex, toIndex, limit,)
            : lastIndexOf(this, element, fromIndex, toIndex, limit,)
    }


    public indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return this.#isCollectionHolder
            ? indexOfFirstByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
            : indexOfFirst(this, predicate, fromIndex, toIndex, limit,)
    }

    public indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return this.#isCollectionHolder
            ? indexOfFirstIndexedByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
            : indexOfFirstIndexed(this, predicate, fromIndex, toIndex, limit,)
    }


    public indexOfLast(predicate: BooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return this.#isCollectionHolder
            ? indexOfLastByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
            : indexOfLast(this, predicate, fromIndex, toIndex, limit,)
    }

    public indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return this.#isCollectionHolder
            ? indexOfLastIndexedByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
            : indexOfLastIndexed(this, predicate, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- First methods --------------------

    public first(): NonNullable<T>
    public first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public first(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public first<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return this.#isCollectionHolder
            ? firstByCollectionHolder(this, predicate,)
            : first(this, predicate,)
    }

    public firstOrNull(): NullOr<T>
    public firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public firstOrNull<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return this.#isCollectionHolder
            ? firstOrNullByCollectionHolder(this, predicate,)
            : firstOrNull(this, predicate,)
    }

    //#endregion -------------------- First methods --------------------
    //#region -------------------- Last methods --------------------

    public last(): NonNullable<T>
    public last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public last(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public last<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return this.#isCollectionHolder
            ? lastByCollectionHolder(this, predicate,)
            : last(this, predicate,)
    }

    public lastOrNull(): NullOr<T>
    public lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public lastOrNull<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return this.#isCollectionHolder
            ? lastOrNullByCollectionHolder(this, predicate,)
            : lastOrNull(this, predicate,)
    }

    //#endregion -------------------- Last methods --------------------

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- All methods --------------------

    public all(predicate: BooleanCallback<T>,): boolean {
        return this.#isCollectionHolder
            ? allByCollectionHolder(this, predicate,)
            : all(this, predicate,)
    }

    //#endregion -------------------- All methods --------------------
    //#region -------------------- Any methods --------------------

    public any(): this["isNotEmpty"]
    public any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public any(predicate?: Nullable<BooleanCallback<T>>,): boolean {
        return this.#isCollectionHolder
            ? anyByCollectionHolder(this, predicate,)
            : any(this, predicate,)
    }

    //#endregion -------------------- Any methods --------------------
    //#region -------------------- None methods --------------------

    public none(): this["isEmpty"]
    public none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public none(predicate?: Nullable<BooleanCallback<T>>,): boolean {
        return this.#isCollectionHolder
            ? noneByCollectionHolder(this, predicate,)
            : none(this, predicate,)
    }

    //#endregion -------------------- None methods --------------------
    //#region -------------------- Has methods --------------------

    public hasOne(...values: readonly T[]): boolean
    public hasOne(...values: readonly unknown[]): boolean
    public hasOne(...values: readonly unknown[]): boolean {
        return this.#isCollectionHolder
            ? hasOneByCollectionHolder(this, ...values,)
            : hasOne(this, ...values,)
    }

    public has(...values: readonly T[]): boolean
    public has(...values: readonly unknown[]): boolean
    public has(): never {
        throw new Error("The getter method \"has\" was not expected to be called.",)
    }

    public includesOne(...values: readonly T[]): boolean
    public includesOne(...values: readonly unknown[]): boolean
    public includesOne(): never {
        throw new Error("The getter method \"includesOne\" was not expected to be called.",)
    }

    public includes(...values: readonly T[]): boolean
    public includes(...values: readonly unknown[]): boolean
    public includes(): never {
        throw new Error("The getter method \"includes\" was not expected to be called.",)
    }

    public containsOne(...values: readonly T[]): boolean
    public containsOne(...values: readonly unknown[]): boolean
    public containsOne(): never {
        throw new Error("The getter method \"containsOne\" was not expected to be called.",)
    }

    public contains(...values: readonly T[]): boolean
    public contains(...values: readonly unknown[]): boolean
    public contains(): never {
        throw new Error("The getter method \"contains\" was not expected to be called.",)
    }


    public hasAll(...values: readonly T[]): boolean
    public hasAll(...values: readonly unknown[]): boolean
    public hasAll(...values: readonly unknown[]): boolean {
        return this.#isCollectionHolder
            ? hasAllByCollectionHolder(this, ...values,)
            : hasAll(this, ...values,)
    }

    public includesAll(...values: readonly T[]): boolean
    public includesAll(...values: readonly unknown[]): boolean
    public includesAll(): never {
        throw new Error("The getter method \"includesAll\" was not expected to be called.",)
    }

    public containsAll(...values: readonly T[]): boolean
    public containsAll(...values: readonly unknown[]): boolean
    public containsAll(): never {
        throw new Error("The getter method \"containsAll\" was not expected to be called.",)
    }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- Join methods --------------------

    public join(separator?: Nullable<string>, prefix?: Nullable<string>, postfix?: Nullable<string>, limit?: Nullable<number>, truncated?: Nullable<string>, transform?: Nullable<StringCallback<T>>,): string {
        return this.#isCollectionHolder
            ? joinByCollectionHolder(this, separator, prefix, postfix, limit, truncated, transform,)
            : join(this, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Join methods --------------------
    //#region -------------------- Filter methods --------------------

    public filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filter<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return this.#isCollectionHolder
            ? filterByCollectionHolder(this, predicate,)
            : filter(this, predicate,)
    }

    public filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexed<const S extends T, >(predicate: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return this.#isCollectionHolder
            ? filterIndexedByCollectionHolder(this, predicate,)
            : filterIndexed(this, predicate,)
    }

    public filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filterNot<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return this.#isCollectionHolder
            ? filterNotByCollectionHolder(this, predicate,)
            : filterNot(this, predicate,)
    }

    public filterIndexedNot<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexedNot(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexedNot<const S extends T, >(predicate: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return this.#isCollectionHolder
            ? filterIndexedNotByCollectionHolder(this, predicate,)
            : filterIndexedNot(this, predicate,)
    }

    public filterNotNull(): CollectionHolder<NonNullable<T>> {
        return this.#isCollectionHolder
            ? filterNotNullByCollectionHolder(this,)
            : filterNotNull(this,)
    }

    public requireNoNulls(): CollectionHolder<NonNullable<T>> {
        return this.#isCollectionHolder
            ? requireNoNullsByCollectionHolder(this,)
            : requireNoNulls(this,)
    }

    //#endregion -------------------- Filter methods --------------------
    //#region -------------------- Find methods --------------------

    public find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public find(predicate: BooleanCallback<T>,): NullOr<T>
    public find<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return this.#isCollectionHolder
            ? findByCollectionHolder(this, predicate,)
            : find(this, predicate,)
    }

    public findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findIndexed<const S extends T, >(predicate: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return this.#isCollectionHolder
            ? findIndexedByCollectionHolder(this, predicate,)
            : findIndexed(this, predicate,)
    }

    public findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLast(predicate: BooleanCallback<T>,): NullOr<T>
    public findLast<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return this.#isCollectionHolder
            ? findLastByCollectionHolder(this, predicate,)
            : findLast(this, predicate,)
    }

    public findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T> {
        return this.#isCollectionHolder
            ? findLastIndexedByCollectionHolder(this, predicate,)
            : findLastIndexed(this, predicate,)
    }

    //#endregion -------------------- Find methods --------------------
    //#region -------------------- Slice methods --------------------

    public slice(indices: readonly number[],): CollectionHolder<T>
    public slice(indices: ReadonlySet<number>,): CollectionHolder<T>
    public slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public slice(indices: Iterable<number>,): CollectionHolder<T>
    public slice(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| readonly number[] | ReadonlySet<number> | MinimalistCollectionHolder<number> | CollectionIterator<number> | Iterable<number> | number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| readonly number[] | ReadonlySet<number> | MinimalistCollectionHolder<number> | CollectionIterator<number> | Iterable<number> | number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T> {
        return this.#isCollectionHolder
            ? sliceByCollectionHolder(this, indicesOrFromIndex, toIndex, limit,)
            : slice(this, indicesOrFromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Slice methods --------------------
    //#region -------------------- Map methods --------------------

    public map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return this.#isCollectionHolder
            ? mapByCollectionHolder(this, transform,)
            : map(this, transform,)
    }

    public mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return this.#isCollectionHolder
            ? mapIndexedByCollectionHolder(this, transform,)
            : mapIndexed(this, transform,)
    }

    public mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return this.#isCollectionHolder
            ? mapNotNullByCollectionHolder(this, transform,)
            : mapNotNull(this, transform,)
    }

    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return this.#isCollectionHolder
            ? mapNotNullIndexedByCollectionHolder(this, transform,)
            : mapNotNullIndexed(this, transform,)
    }

    //#endregion -------------------- Map methods --------------------
    //#region -------------------- For each methods --------------------

    public forEach(action: ValueIndexCallback<T>,): this {
        forEach(this, action,)
        return this
    }

    public forEachIndexed(action: IndexValueCallback<T>,): this {
        forEachIndexed(this, action,)
        return this
    }

    //#endregion -------------------- For each methods --------------------

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

    public get objectValuesMap(): ReadonlyMap<T, ObjectOf<T>> {
        return this.#isCollectionHolder
            ? objectValuesMapByCollectionHolder(this,)
            : objectValuesMap(this,)
    }


    public toIterator(): CollectionIterator<T> {
        return this.#isCollectionHolder
            ? toIteratorByCollectionHolder(this,)
            : toIterator(this,)
    }


    public toArray(): readonly T[] {
        return this.#isCollectionHolder
            ? toArrayByCollectionHolder(this,)
            : toArray(this,)
    }

    public toMutableArray(): T[] {
        return this.#isCollectionHolder
            ? toMutableArrayByCollectionHolder(this,)
            : toMutableArray(this,)
    }


    public toSet(): ReadonlySet<T> {
        return this.#isCollectionHolder
            ? toSetByCollectionHolder(this,)
            : toSet(this,)
    }

    public toMutableSet(): Set<T> {
        return this.#isCollectionHolder
            ? toMutableSetByCollectionHolder(this,)
            : toMutableSet(this,)
    }


    public toWeakSet(): Readonly<WeakSet<ObjectOf<T>>> {
        return toWeakSet(this,)
    }

    public toMutableWeakSet(): WeakSet<ObjectOf<T>> {
        return toMutableWeakSet(this,)
    }


    public toMap(): ReadonlyMap<number, T> {
        return this.#isCollectionHolder
            ? toMapByCollectionHolder(this,)
            : toMap(this,)
    }

    public toMutableMap(): Map<number, T> {
        return this.#isCollectionHolder
            ? toMutableMapByCollectionHolder(this,)
            : toMutableMap(this,)
    }


    public toReverse(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T> {
        return this.#isCollectionHolder
            ? toReverseByCollectionHolder(this, fromIndex, toIndex, limit,)
            : toReverse(this, fromIndex, toIndex, limit,)
    }

    public toReversed(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>
    public toReversed(): never {
        throw new Error("The method \"toReversed\" was not expected to be called.",)
    }

    public reversed(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>
    public reversed(): never {
        throw new Error("The method \"reversed\" was not expected to be called.",)
    }

    //#region -------------------- Conversion methods (toString) --------------------

    public toString(): string {
        return this.#isCollectionHolder
            ? toStringByCollectionHolder(this,)
            : toString(this,)
    }

    public toLocaleString(locale?: Nullable<string>,): string {
        return this.#isCollectionHolder
            ? toLocaleStringByCollectionHolder(this,)
            : toLocaleString(this, locale,)
    }

    public toLowerCaseString(): string {
        return this.#isCollectionHolder
            ? toLowerCaseStringByCollectionHolder(this,)
            : toLowerCaseString(this,)
    }

    public toLocaleLowerCaseString(locale?: Nullable<string>,): string {
        return this.#isCollectionHolder
            ? toLocaleLowerCaseStringByCollectionHolder(this,)
            : toLocaleLowerCaseString(this, locale,)
    }

    public toUpperCaseString(): string {
        return this.#isCollectionHolder
            ? toUpperCaseStringByCollectionHolder(this,)
            : toUpperCaseString(this,)
    }

    public toLocaleUpperCaseString(locale?: Nullable<string>,): string {
        return this.#isCollectionHolder
            ? toLocaleUpperCaseStringByCollectionHolder(this,)
            : toLocaleUpperCaseString(this, locale,)
    }

    //#endregion -------------------- Conversion methods (toString) --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}
