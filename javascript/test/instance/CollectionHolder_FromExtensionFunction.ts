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

import {AbstractCollectionHolder}                  from "../../src/AbstractCollectionHolder"
import {allByCollectionHolder}                     from "../../src/method/all"
import {anyByCollectionHolder}                     from "../../src/method/any"
import {filterByCollectionHolder}                  from "../../src/method/filter"
import {filterIndexedByCollectionHolder}           from "../../src/method/filterIndexed"
import {filterIndexedNotByCollectionHolder}        from "../../src/method/filterIndexedNot"
import {filterNotByCollectionHolder}               from "../../src/method/filterNot"
import {filterNotNullByCollectionHolder}           from "../../src/method/filterNotNull"
import {findByCollectionHolder}                    from "../../src/method/find"
import {findIndexedByCollectionHolder}             from "../../src/method/findIndexed"
import {findLastByCollectionHolder}                from "../../src/method/findLast"
import {findLastIndexedByCollectionHolder}         from "../../src/method/findLastIndexed"
import {firstByCollectionHolder}                   from "../../src/method/first"
import {firstOrNullByCollectionHolder}             from "../../src/method/firstOrNull"
import {forEach}                                   from "../../src/method/forEach"
import {forEachIndexed}                            from "../../src/method/forEachIndexed"
import {hasAllByCollectionHolder}                  from "../../src/method/hasAll"
import {hasNullByCollectionHolder}                 from "../../src/method/hasNull"
import {hasOneByCollectionHolder}                  from "../../src/method/hasOne"
import {indexOfByCollectionHolder}                 from "../../src/method/indexOf"
import {indexOfFirstByCollectionHolder}            from "../../src/method/indexOfFirst"
import {indexOfFirstIndexedByCollectionHolder}     from "../../src/method/indexOfFirstIndexed"
import {indexOfLastByCollectionHolder}             from "../../src/method/indexOfLast"
import {indexOfLastIndexedByCollectionHolder}      from "../../src/method/indexOfLastIndexed"
import {joinByCollectionHolder}                    from "../../src/method/join"
import {lastByCollectionHolder}                    from "../../src/method/last"
import {lastIndexOfByCollectionHolder}             from "../../src/method/lastIndexOf"
import {lastOrNullByCollectionHolder}              from "../../src/method/lastOrNull"
import {noneByCollectionHolder}                    from "../../src/method/none"
import {mapByCollectionHolder}                     from "../../src/method/map"
import {mapIndexedByCollectionHolder}              from "../../src/method/mapIndexed"
import {mapNotNullByCollectionHolder}              from "../../src/method/mapNotNull"
import {mapNotNullIndexedByCollectionHolder}       from "../../src/method/mapNotNullIndexed"
import {objectValuesMapByCollectionHolder}         from "../../src/method/objectValuesMap"
import {requireNoNullsByCollectionHolder}          from "../../src/method/requireNoNulls"
import {sliceByCollectionHolder}                   from "../../src/method/slice"
import {toArrayByCollectionHolder}                 from "../../src/method/toArray"
import {toIteratorByCollectionHolder}              from "../../src/method/toIterator"
import {toLocaleLowerCaseStringByCollectionHolder} from "../../src/method/toLocaleLowerCaseString"
import {toLocaleStringByCollectionHolder}          from "../../src/method/toLocaleString"
import {toLocaleUpperCaseStringByCollectionHolder} from "../../src/method/toLocaleUpperCaseString"
import {toLowerCaseStringByCollectionHolder}       from "../../src/method/toLowerCaseString"
import {toMapByCollectionHolder}                   from "../../src/method/toMap"
import {toMutableArrayByCollectionHolder}          from "../../src/method/toMutableArray"
import {toMutableSetByCollectionHolder}            from "../../src/method/toMutableSet"
import {toMutableMapByCollectionHolder}            from "../../src/method/toMutableMap"
import {toMutableWeakSet}                          from "../../src/method/toMutableWeakSet"
import {toReverseByCollectionHolder}               from "../../src/method/toReverse"
import {toSetByCollectionHolder}                   from "../../src/method/toSet"
import {toStringByCollectionHolder}                from "../../src/method/toString"
import {toUpperCaseStringByCollectionHolder}       from "../../src/method/toUpperCaseString"
import {toWeakSet}                                 from "../../src/method/toWeakSet"

export class CollectionHolder_FromExtensionFunction<const out T, >
    extends AbstractCollectionHolder<T>
    implements CollectionHolder<T> {

    [index: NumberOrNumberInString]: undefined
    readonly #array

    public constructor(array: readonly T[],) {
        super()
        this.#array = array
    }

    //#region -------------------- Getter methods --------------------

    public override get length(): never {
        throw new Error("The getter method \"length\" was not expected to be called.",)
    }

    public override get count(): never {
        throw new Error("The getter method \"count\" was not expected to be called.",)
    }

    public override get size(): number {
        return this.#array.length
    }


    public override get isNotEmpty(): never {
        throw new Error("The getter method \"isNotEmpty\" was not expected to be called.",)
    }


    public override get hasNull(): boolean {
        return hasNullByCollectionHolder(this,)
    }

    public override get includesNull(): never {
        throw new Error("The getter method \"includesNull\" was not expected to be called.",)
    }

    public override get containsNull(): never {
        throw new Error("The getter method \"containsNull\" was not expected to be called.",)
    }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Value methods --------------------

    //#region -------------------- Get methods --------------------

    public override get(index: number,): T {
        return this.#array[index] as T
    }

    public override at(index: number,): T
    public override at(): never {
        throw new Error("The method \"at\" was not expected to be called in a test.",)
    }

    public override elementAt(index: number,): T
    public override elementAt(): never {
        throw new Error("The method \"elementAt\" was not expected to be called in a test.",)
    }


    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(): never {
        throw new Error("The method \"getOrElse\" was not expected to be called in a test.",)
    }

    public override atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override atOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override atOrElse(): never {
        throw new Error("The method \"atOrElse\" was not expected to be called in a test.",)
    }

    public override elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override elementAtOrElse(): never {
        throw new Error("The method \"elementAtOrElse\" was not expected to be called in a test.",)
    }


    public override getOrNull(index: number,): NullOr<T>
    public override getOrNull(): never {
        throw new Error("The method \"getOrNull\" was not expected to be called in a test.",)
    }

    public override atOrNull(index: number,): NullOr<T>
    public override atOrNull(): never {
        throw new Error("The method \"atOrNull\" was not expected to be called in a test.",)
    }

    public override elementAtOrNull(index: number,): NullOr<T>
    public override elementAtOrNull(): never {
        throw new Error("The method \"elementAtOrNull\" was not expected to be called in a test.",)
    }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Index methods --------------------

    public override indexOf(element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
    public override indexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
    public override indexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return indexOfByCollectionHolder(this, element, fromIndex, toIndex, limit,)
    }


    public override lastIndexOf(element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
    public override lastIndexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
    public override lastIndexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return lastIndexOfByCollectionHolder(this, element, fromIndex, toIndex, limit,)
    }


    public override indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return indexOfFirstByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
    }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return indexOfFirstIndexedByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
    }


    public override indexOfLast(predicate: BooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return indexOfLastByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return indexOfLastIndexedByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- First methods --------------------

    public override first(): NonNullable<T>
    public override first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public override first(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public override first<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return firstByCollectionHolder(this, predicate,)
    }

    public override firstOrNull(): NullOr<T>
    public override firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public override firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public override firstOrNull<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return firstOrNullByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- First methods --------------------
    //#region -------------------- Last methods --------------------

    public override last(): NonNullable<T>
    public override last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public override last(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public override last<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return lastByCollectionHolder(this, predicate,)
    }

    public override lastOrNull(): NullOr<T>
    public override lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public override lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public override lastOrNull<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return lastOrNullByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Last methods --------------------

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- All methods --------------------

    public override all(predicate: BooleanCallback<T>,): boolean {
        return allByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- All methods --------------------
    //#region -------------------- Any methods --------------------

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,): boolean {
        return anyByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Any methods --------------------
    //#region -------------------- None methods --------------------

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,): boolean {
        return noneByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- None methods --------------------
    //#region -------------------- Has methods --------------------

    public override hasOne(...values: readonly T[]): boolean
    public override hasOne(...values: readonly unknown[]): boolean
    public override hasOne(...values: readonly unknown[]): boolean {
        return hasOneByCollectionHolder(this, ...values,)
    }

    public override has(...values: readonly T[]): boolean
    public override has(...values: readonly unknown[]): boolean
    public override has(): never {
        throw new Error("The getter method \"has\" was not expected to be called.",)
    }

    public override includesOne(...values: readonly T[]): boolean
    public override includesOne(...values: readonly unknown[]): boolean
    public override includesOne(): never {
        throw new Error("The getter method \"includesOne\" was not expected to be called.",)
    }

    public override includes(...values: readonly T[]): boolean
    public override includes(...values: readonly unknown[]): boolean
    public override includes(): never {
        throw new Error("The getter method \"includes\" was not expected to be called.",)
    }

    public override containsOne(...values: readonly T[]): boolean
    public override containsOne(...values: readonly unknown[]): boolean
    public override containsOne(): never {
        throw new Error("The getter method \"containsOne\" was not expected to be called.",)
    }

    public override contains(...values: readonly T[]): boolean
    public override contains(...values: readonly unknown[]): boolean
    public override contains(): never {
        throw new Error("The getter method \"contains\" was not expected to be called.",)
    }


    public override hasAll(...values: readonly T[]): boolean
    public override hasAll(...values: readonly unknown[]): boolean
    public override hasAll(...values: readonly unknown[]): boolean {
        return hasAllByCollectionHolder(this, ...values,)
    }

    public override includesAll(...values: readonly T[]): boolean
    public override includesAll(...values: readonly unknown[]): boolean
    public override includesAll(): never {
        throw new Error("The getter method \"includesAll\" was not expected to be called.",)
    }

    public override containsAll(...values: readonly T[]): boolean
    public override containsAll(...values: readonly unknown[]): boolean
    public override containsAll(): never {
        throw new Error("The getter method \"containsAll\" was not expected to be called.",)
    }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- Join methods --------------------

    public override join(separator?: Nullable<string>, prefix?: Nullable<string>, postfix?: Nullable<string>, limit?: Nullable<number>, truncated?: Nullable<string>, transform?: Nullable<StringCallback<T>>,): string {
        return joinByCollectionHolder(this, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Join methods --------------------
    //#region -------------------- Filter methods --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return filterByCollectionHolder(this, predicate,)
    }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed<const S extends T, >(predicate: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return filterIndexedByCollectionHolder(this, predicate,)
    }

    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return filterNotByCollectionHolder(this, predicate,)
    }

    public override filterIndexedNot<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexedNot(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexedNot<const S extends T, >(predicate: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return filterIndexedNotByCollectionHolder(this, predicate,)
    }

    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNullByCollectionHolder(this,)
    }

    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        return requireNoNullsByCollectionHolder(this,)
    }

    //#endregion -------------------- Filter methods --------------------
    //#region -------------------- Find methods --------------------

    public override find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override find(predicate: BooleanCallback<T>,): NullOr<T>
    public override find<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return findByCollectionHolder(this, predicate,)
    }

    public override findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findIndexed<const S extends T, >(predicate: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return findIndexedByCollectionHolder(this, predicate,)
    }

    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLast(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLast<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return findLastByCollectionHolder(this, predicate,)
    }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T> {
        return findLastIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find methods --------------------
    //#region -------------------- Slice methods --------------------

    public override slice(indices: readonly number[],): CollectionHolder<T>
    public override slice(indices: ReadonlySet<number>,): CollectionHolder<T>
    public override slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public override slice(indices: Iterable<number>,): CollectionHolder<T>
    public override slice(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>
    public override slice(indicesOrFromIndex?: Nullable<| readonly number[] | ReadonlySet<number> | MinimalistCollectionHolder<number> | CollectionIterator<number> | Iterable<number> | number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>
    public override slice(indicesOrFromIndex?: Nullable<| readonly number[] | ReadonlySet<number> | MinimalistCollectionHolder<number> | CollectionIterator<number> | Iterable<number> | number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T> {
        return sliceByCollectionHolder(this, indicesOrFromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Slice methods --------------------
    //#region -------------------- Map methods --------------------

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

    //#endregion -------------------- Map methods --------------------
    //#region -------------------- For each methods --------------------

    public override forEach(action: ValueIndexCallback<T>,): this {
        return forEach(this, action,)
    }

    public override forEachIndexed(action: IndexValueCallback<T>,): this {
        return forEachIndexed(this, action,)
    }

    //#endregion -------------------- For each methods --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Javascript methods --------------------

    public override [Symbol.iterator](): CollectionIterator<T> {
        return toIteratorByCollectionHolder(this,)
    }

    public override get [Symbol.toStringTag](): CollectionHolderName {
        return "CollectionHolder"
    }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override get objectValuesMap(): ReadonlyMap<T, ObjectOf<T>> {
        return objectValuesMapByCollectionHolder(this,)
    }


    public override toIterator(): CollectionIterator<T> {
        return this[Symbol.iterator]()
    }


    public override toArray(): readonly T[] {
        return toArrayByCollectionHolder(this,)
    }

    public override toMutableArray(): T[] {
        return toMutableArrayByCollectionHolder(this,)
    }


    public override toSet(): ReadonlySet<T> {
        return toSetByCollectionHolder(this,)
    }

    public override toMutableSet(): Set<T> {
        return toMutableSetByCollectionHolder(this,)
    }


    public override toWeakSet(): Readonly<WeakSet<ObjectOf<T>>> {
        return toWeakSet(this,)
    }

    public override toMutableWeakSet(): WeakSet<ObjectOf<T>> {
        return toMutableWeakSet(this,)
    }


    public override toMap(): ReadonlyMap<number, T> {
        return toMapByCollectionHolder(this,)
    }

    public override toMutableMap(): Map<number, T> {
        return toMutableMapByCollectionHolder(this,)
    }


    public override toReverse(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T> {
        return toReverseByCollectionHolder(this, fromIndex, toIndex, limit,)
    }

    public override toReversed(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>
    public override toReversed(): never {
        throw new Error("The method \"toReversed\" was not expected to be called.",)
    }

    public override reversed(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>
    public override reversed(): never {
        throw new Error("The method \"reversed\" was not expected to be called.",)
    }

    //#region -------------------- Conversion methods (toString) --------------------

    public override toString(): string {
        return toStringByCollectionHolder(this,)
    }

    public override toLocaleString(locale?: Nullable<string>,): string {
        return toLocaleStringByCollectionHolder(this, locale,)
    }

    public override toLowerCaseString(): string {
        return toLowerCaseStringByCollectionHolder(this,)
    }

    public override toLocaleLowerCaseString(locale?: Nullable<string>,): string {
        return toLocaleLowerCaseStringByCollectionHolder(this, locale,)
    }

    public override toUpperCaseString(): string {
        return toUpperCaseStringByCollectionHolder(this,)
    }

    public override toLocaleUpperCaseString(locale?: Nullable<string>,): string {
        return toLocaleUpperCaseStringByCollectionHolder(this, locale,)
    }

    //#endregion -------------------- Conversion methods (toString) --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}
