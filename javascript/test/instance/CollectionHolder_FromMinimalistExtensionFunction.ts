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

import {AbstractMinimalistCollectionHolder} from "../../src/AbstractMinimalistCollectionHolder"
import {all}                                from "../../src/method/all"
import {any}                                from "../../src/method/any"
import {filter}                             from "../../src/method/filter"
import {filterIndexed}                      from "../../src/method/filterIndexed"
import {filterIndexedNot}                   from "../../src/method/filterIndexedNot"
import {filterNot}                          from "../../src/method/filterNot"
import {filterNotNull}                      from "../../src/method/filterNotNull"
import {find}                               from "../../src/method/find"
import {findIndexed}                        from "../../src/method/findIndexed"
import {findLast}                           from "../../src/method/findLast"
import {findLastIndexed}                    from "../../src/method/findLastIndexed"
import {first}                              from "../../src/method/first"
import {firstOrNull}                        from "../../src/method/firstOrNull"
import {forEach}                            from "../../src/method/forEach"
import {forEachIndexed}                     from "../../src/method/forEachIndexed"
import {hasAll}                             from "../../src/method/hasAll"
import {hasNull}                            from "../../src/method/hasNull"
import {hasOne}                             from "../../src/method/hasOne"
import {indexOf}                            from "../../src/method/indexOf"
import {indexOfFirst}                       from "../../src/method/indexOfFirst"
import {indexOfFirstIndexed}                from "../../src/method/indexOfFirstIndexed"
import {indexOfLast}                        from "../../src/method/indexOfLast"
import {indexOfLastIndexed}                 from "../../src/method/indexOfLastIndexed"
import {join}                               from "../../src/method/join"
import {last}                               from "../../src/method/last"
import {lastIndexOf}                        from "../../src/method/lastIndexOf"
import {lastOrNull}                         from "../../src/method/lastOrNull"
import {none}                               from "../../src/method/none"
import {map}                                from "../../src/method/map"
import {mapIndexed}                         from "../../src/method/mapIndexed"
import {mapNotNull}                         from "../../src/method/mapNotNull"
import {mapNotNullIndexed}                  from "../../src/method/mapNotNullIndexed"
import {objectValuesMap}                    from "../../src/method/objectValuesMap"
import {requireNoNulls}                     from "../../src/method/requireNoNulls"
import {slice}                              from "../../src/method/slice"
import {toArray}                            from "../../src/method/toArray"
import {toIterator}                         from "../../src/method/toIterator"
import {toLocaleLowerCaseString}            from "../../src/method/toLocaleLowerCaseString"
import {toLocaleString}                     from "../../src/method/toLocaleString"
import {toLocaleUpperCaseString}            from "../../src/method/toLocaleUpperCaseString"
import {toLowerCaseString}                  from "../../src/method/toLowerCaseString"
import {toMap}                              from "../../src/method/toMap"
import {toMutableArray}                     from "../../src/method/toMutableArray"
import {toMutableSet}                       from "../../src/method/toMutableSet"
import {toMutableMap}                       from "../../src/method/toMutableMap"
import {toMutableWeakSet}                   from "../../src/method/toMutableWeakSet"
import {toReverse}                          from "../../src/method/toReverse"
import {toSet}                              from "../../src/method/toSet"
import {toString}                           from "../../src/method/toString"
import {toUpperCaseString}                  from "../../src/method/toUpperCaseString"
import {toWeakSet}                          from "../../src/method/toWeakSet"

export class CollectionHolder_FromMinimalistExtensionFunction<const T, >
    extends AbstractMinimalistCollectionHolder<T>
    implements CollectionHolder<T> {

    [index: NumberOrNumberInString]: undefined

    readonly #array

    public constructor(array: readonly unknown[],) {
        super()
        this.#array = array
    }

    //#region -------------------- Getter methods --------------------

    public get length(): never {
        throw new Error("The getter method \"length\" was not expected to be called.",)
    }

    public get count(): never {
        throw new Error("The getter method \"count\" was not expected to be called.",)
    }

    public override get size(): number {
        return this.#array.length
    }


    public get isEmpty(): never {
        throw new Error("The method \"isEmpty\" was not expected to be called in a test.",)
    }

    public get isNotEmpty(): never {
        throw new Error("The method \"isNotEmpty\" was not expected to be called in a test.",)
    }


    public get hasNull(): boolean {
        return hasNull(this,)
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
        return this.#array[index] as T
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

    //#endregion -------------------- Get / at methods --------------------
    //#region -------------------- Index of methods --------------------

    public indexOf(element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
    public indexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
    public indexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return indexOf(this, element, fromIndex, toIndex, limit,)
    }


    public lastIndexOf(element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
    public lastIndexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
    public lastIndexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return lastIndexOf(this, element, fromIndex, toIndex, limit,)
    }


    public indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return indexOfFirst(this, predicate, fromIndex, toIndex, limit,)
    }

    public indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return indexOfFirstIndexed(this, predicate, fromIndex, toIndex, limit,)
    }


    public indexOfLast(predicate: BooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return indexOfLast(this, predicate, fromIndex, toIndex, limit,)
    }

    public indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return indexOfLastIndexed(this, predicate, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index of methods --------------------
    //#region -------------------- First methods --------------------

    public first(): NonNullable<T>
    public first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public first(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public first<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return first(this, predicate,)
    }

    public firstOrNull(): NullOr<T>
    public firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public firstOrNull<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return firstOrNull(this, predicate,)
    }

    //#endregion -------------------- First methods --------------------
    //#region -------------------- Last methods --------------------

    public last(): NonNullable<T>
    public last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public last(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public last<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return last(this, predicate,)
    }

    public lastOrNull(): NullOr<T>
    public lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public lastOrNull<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return lastOrNull(this, predicate,)
    }

    //#endregion -------------------- Last methods --------------------

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- All methods --------------------

    public all(predicate: BooleanCallback<T>,): boolean {
        return all(this, predicate,)
    }

    //#endregion -------------------- All methods --------------------
    //#region -------------------- Any methods --------------------

    public any(): this["isNotEmpty"]
    public any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public any(predicate?: Nullable<BooleanCallback<T>>,): boolean {
        return any(this, predicate,)
    }

    //#endregion -------------------- Any methods --------------------
    //#region -------------------- None methods --------------------

    public none(): this["isEmpty"]
    public none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public none(predicate?: Nullable<BooleanCallback<T>>,): boolean {
        return none(this, predicate,)
    }

    //#endregion -------------------- None methods --------------------
    //#region -------------------- Has methods --------------------

    public hasOne(...values: readonly T[]): boolean
    public hasOne(...values: readonly unknown[]): boolean
    public hasOne(...values: readonly unknown[]): boolean {
        return hasOne(this, ...values,)
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
        return hasAll(this, ...values,)
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
        return join(this, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Join methods --------------------
    //#region -------------------- Filter methods --------------------

    //#region -------------------- Filter methods --------------------

    public filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filter<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return filter(this, predicate,)
    }

    //#endregion -------------------- Filter methods --------------------
    //#region -------------------- Filter indexed methods --------------------

    public filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexed<const S extends T, >(predicate: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return filterIndexed(this, predicate,)
    }

    //#endregion -------------------- Filter indexed methods --------------------
    //#region -------------------- Filter not methods --------------------

    public filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filterNot<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return filterNot(this, predicate,)
    }

    //#endregion -------------------- Filter not methods --------------------
    //#region -------------------- Filter indexed not methods --------------------

    public filterIndexedNot<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexedNot(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexedNot<const S extends T, >(predicate: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return filterIndexedNot(this, predicate,)
    }

    //#endregion -------------------- Filter indexed not methods --------------------
    //#region -------------------- Filter not null methods --------------------

    public filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNull(this,)
    }

    //#endregion -------------------- Filter not null methods --------------------
    //#region -------------------- Require not nulls methods --------------------

    public requireNoNulls(): CollectionHolder<NonNullable<T>> {
        return requireNoNulls(this,)
    }

    //#endregion -------------------- Require not nulls methods --------------------

    //#endregion -------------------- Filter methods --------------------
    //#region -------------------- Find methods --------------------

    //#region -------------------- Find methods --------------------

    public find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public find(predicate: BooleanCallback<T>,): NullOr<T>
    public find<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return find(this, predicate,)
    }

    //#endregion -------------------- Find methods --------------------
    //#region -------------------- Find indexed methods --------------------

    public findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findIndexed<const S extends T, >(predicate: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return findIndexed(this, predicate,)
    }

    //#endregion -------------------- Find indexed methods --------------------
    //#region -------------------- Find last methods --------------------

    public findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLast(predicate: BooleanCallback<T>,): NullOr<T>
    public findLast<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return findLast(this, predicate,)
    }

    //#endregion -------------------- Find last methods --------------------
    //#region -------------------- Find last indexed methods --------------------

    public findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T> {
        return findLastIndexed(this, predicate,)
    }

    //#endregion -------------------- Find last indexed methods --------------------

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
        return slice(this, indicesOrFromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Slice methods --------------------
    //#region -------------------- Map methods --------------------

    //#region -------------------- Map methods --------------------

    public map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return map(this, transform,)
    }

    //#endregion -------------------- Map methods --------------------
    //#region -------------------- Map indexed methods --------------------

    public mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexed(this, transform,)
    }

    //#endregion -------------------- Map indexed methods --------------------
    //#region -------------------- Map not null methods --------------------

    public mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNull(this, transform,)
    }

    //#endregion -------------------- Map not null methods --------------------
    //#region -------------------- Map not null indexed methods --------------------

    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexed(this, transform,)
    }

    //#endregion -------------------- Map not null indexed methods --------------------

    //#endregion -------------------- Map methods --------------------
    //#region -------------------- For each methods --------------------

    //#region -------------------- For each methods --------------------

    public forEach(action: ValueIndexCallback<T>,): this {
        return forEach(this, action,)
    }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- For each indexed methods --------------------

    public forEachIndexed(action: IndexValueCallback<T>,): this {
        return forEachIndexed(this, action,)
    }

    //#endregion -------------------- For each indexed methods --------------------

    //#endregion -------------------- For each methods --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): CollectionIterator<T> {
        return toIterator(this,)
    }

    public get [Symbol.toStringTag](): CollectionHolderName {
        return "CollectionHolder"
    }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public get objectValuesMap(): ReadonlyMap<T, ObjectOf<T>> {
        return objectValuesMap(this,)
    }


    public toIterator(): CollectionIterator<T> {
        return this[Symbol.iterator]()
    }


    public toArray(): readonly T[] {
        return toArray(this,)
    }

    public toMutableArray(): T[] {
        return toMutableArray(this,)
    }


    public toSet(): ReadonlySet<T> {
        return toSet(this,)
    }

    public toMutableSet(): Set<T> {
        return toMutableSet(this,)
    }


    public toWeakSet(): Readonly<WeakSet<ObjectOf<T>>> {
        return toWeakSet(this,)
    }

    public toMutableWeakSet(): WeakSet<ObjectOf<T>> {
        return toMutableWeakSet(this,)
    }


    public toMap(): ReadonlyMap<number, T> {
        return toMap(this,)
    }

    public toMutableMap(): Map<number, T> {
        return toMutableMap(this,)
    }


    public toReverse(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T> {
        return toReverse(this, fromIndex, toIndex, limit,)
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

    public override toString(): string {
        return toString(this,)
    }

    public override toLocaleString(locale?: Nullable<string>,): string {
        return toLocaleString(this, locale,)
    }

    public toLowerCaseString(): string {
        return toLowerCaseString(this,)
    }

    public toLocaleLowerCaseString(locale?: Nullable<string>,): string {
        return toLocaleLowerCaseString(this, locale,)
    }

    public toUpperCaseString(): string {
        return toUpperCaseString(this,)
    }

    public toLocaleUpperCaseString(locale?: Nullable<string>,): string {
        return toLocaleUpperCaseString(this, locale,)
    }

    //#endregion -------------------- Conversion methods (toString) --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------


}
