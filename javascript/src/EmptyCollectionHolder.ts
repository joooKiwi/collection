/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                                                                                                                                                                                                                                                                       from "./CollectionHolder"
import type {BooleanCallback, CollectionHolderName, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, ValueIndexCallback, ValueIndexWithReturnCallback, ValueWithStringReturnCallback} from "./CollectionHolder.types"
import type {Nullable, NumberOrNumberInString}                                                                                                                                                                                                                                                       from "./general type"
import type {EmptyCollectionIterator}                                                                                                                                                                                                                                                                from "./iterator/EmptyCollectionIterator"
import type {CollectionIterator}                                                                                                                                                                                                                                                                     from "./iterator/CollectionIterator"

import {CollectionHolderIndexOutOfBoundsException} from "./exception/CollectionHolderIndexOutOfBoundsException"
import {CollectionConstants}                       from "./CollectionConstants"

/**
 * A simple {@link CollectionHolder} with no values (as a singleton instance)
 *
 * @see GenericCollectionHolder
 * @see LazyGenericCollectionHolder
 * @singleton
 */
export class EmptyCollectionHolder
    implements CollectionHolder<never> {

    //#region -------------------- Singleton usage --------------------

    static #instance?: EmptyCollectionHolder

    protected constructor() {
    }

    public static get get(): EmptyCollectionHolder {
        return EmptyCollectionHolder.#instance ??= new EmptyCollectionHolder()
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Getter methods --------------------

    [index: NumberOrNumberInString]: undefined

    //#region -------------------- Size methods --------------------

    public get size(): 0 {
        return 0
    }

    public get length(): 0 {
        return 0
    }

    public get count(): 0 {
        return 0
    }


    public get isEmpty(): true {
        return true
    }

    public get isNotEmpty(): false {
        return false
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has X methods --------------------

    public get hasNull(): false {
        return false
    }

    public get includesNull(): false {
        return false
    }

    public get containsNull(): false {
        return false
    }

    //#endregion -------------------- Has X methods --------------------

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Value methods --------------------

    //#region -------------------- Get / at methods --------------------

    public get(index: number = NaN,): never {
        throw new CollectionHolderIndexOutOfBoundsException("No element at any index could be found since it it empty.", index,)
    }

    public at(index?: number,): never {
        this.get(index,)
    }

    public elementAt(index?: number,): never {
        this.get(index,)
    }


    public getOrElse(index: number,): never
    public getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): U
    public getOrElse<const U, >(index: number, defaultValue?: IndexWithReturnCallback<U>,): U {
        if (defaultValue == null)
            this.get(index,)
        return defaultValue(index,)
    }

    public atOrElse(index: number,): never
    public atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): U
    public atOrElse<const U, >(index: number, defaultValue?: IndexWithReturnCallback<U>,): U {
        return defaultValue == null ? this.getOrElse(index,) : this.getOrElse(index, defaultValue,)
    }


    public elementAtOrElse(index: number,): never
    public elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): U
    public elementAtOrElse<const U, >(index: number, defaultValue?: IndexWithReturnCallback<U>,): U {
        return defaultValue == null ? this.getOrElse(index,) : this.getOrElse(index, defaultValue,)
    }


    public getOrNull(index?: number,): null
    public getOrNull(): null {
        return null
    }

    public atOrNull(index?: number,): null
    public atOrNull(): null {
        return this.getOrNull()
    }

    public elementAtOrNull(index?: number,): null
    public elementAtOrNull(): null {
        return this.getOrNull()
    }

    //#endregion -------------------- Get / at methods --------------------
    //#region -------------------- Index of methods --------------------

    public indexOf(element?: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): null
    public indexOf(): null {
        return null
    }


    public lastIndexOf(element?: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): null
    public lastIndexOf(): null {
        return null
    }


    public indexOfFirst(predicate?: BooleanCallback<never>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): null
    public indexOfFirst(): null {
        return null
    }

    public indexOfFirstIndexed(predicate?: ReverseBooleanCallback<never>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): null
    public indexOfFirstIndexed(): null {
        return null
    }


    public indexOfLast(predicate?: BooleanCallback<never>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): null
    public indexOfLast(): null {
        return null
    }

    public indexOfLastIndexed(predicate?: ReverseBooleanCallback<never>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): null
    public indexOfLastIndexed(): null {
        return null
    }

    //#endregion -------------------- Index of methods --------------------
    //#region -------------------- First methods --------------------

    public first(): never
    public first<const S extends never, >(predicate?: Nullable<RestrainedBooleanCallback<never, S>>,): never
    public first(predicate?: Nullable<BooleanCallback<never>>,): never
    public first() {
        this.get()
    }

    public firstOrNull(): null
    public firstOrNull<const S extends never, >(predicate?: Nullable<RestrainedBooleanCallback<never, S>>,): null
    public firstOrNull(predicate?: Nullable<BooleanCallback<never>>,): null
    public firstOrNull() {
        return null
    }

    //#endregion -------------------- First methods --------------------
    //#region -------------------- Last methods --------------------

    public last(): never
    public last<const S extends never, >(predicate?: Nullable<RestrainedBooleanCallback<never, S>>,): never
    public last(predicate?: Nullable<BooleanCallback<never>>,): never
    public last() {
        this.get()
    }

    public lastOrNull(): null
    public lastOrNull<const S extends never, >(predicate?: Nullable<RestrainedBooleanCallback<never, S>>,): null
    public lastOrNull(predicate?: Nullable<BooleanCallback<never>>,): null
    public lastOrNull() {
        return null
    }

    //#endregion -------------------- Last methods --------------------

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- All / any / none methods --------------------

    public all(predicate?: BooleanCallback<never>,): false
    public all(): false {
        return false
    }

    public any(): this["isNotEmpty"]
    public any(predicate?: Nullable<BooleanCallback<never>>,): this["isNotEmpty"]
    public any(): this["isNotEmpty"] {
        return false
    }

    public none(): this["isEmpty"]
    public none(predicate?: Nullable<BooleanCallback<never>>,): this["isEmpty"]
    public none(): this["isEmpty"] {
        return true
    }

    //#endregion -------------------- All / any / none methods --------------------
    //#region -------------------- Has / includes / contains methods --------------------

    public hasOne(...values: readonly never[]): false
    public hasOne(...values: readonly unknown[]): false
    public hasOne(): false {
        return false
    }

    public includesOne(...values: readonly never[]): false
    public includesOne(...values: readonly unknown[]): false
    public includesOne(): false {
        return this.hasOne()
    }

    public containsOne(...values: readonly never[]): false
    public containsOne(...values: readonly unknown[]): false
    public containsOne(): false {
        return this.hasOne()
    }


    public hasAll(...values: readonly never[]): false
    public hasAll(...values: readonly unknown[]): false
    public hasAll(): false {
        return false
    }

    public includesAll(...values: readonly never[]): false
    public includesAll(...values: readonly unknown[]): false
    public includesAll(): false {
        return this.hasAll()
    }

    public containsAll(...values: readonly never[]): false
    public containsAll(...values: readonly unknown[]): false
    public containsAll(): false {
        return this.hasAll()
    }

    //#endregion -------------------- Has / includes / contains methods --------------------
    //#region -------------------- Join methods --------------------

    public join(separator?: Nullable<string>, prefix?: Nullable<string>, postfix?: Nullable<string>, limit?: Nullable<number>, truncated?: Nullable<string>, transform?: Nullable<ValueWithStringReturnCallback<never>>,): string
    public join(_separator?: Nullable<string>, prefix?: Nullable<string>, postfix?: Nullable<string>,): string {
        return `${prefix ?? CollectionConstants.DEFAULT_JOIN_PREFIX}${postfix ?? CollectionConstants.DEFAULT_JOIN_POSTFIX}`
    }

    //#endregion -------------------- Join methods --------------------
    //#region -------------------- Filter methods --------------------

    public filter<const S extends never>(predicate?: RestrainedBooleanCallback<never, S>): CollectionHolder<S>
    public filter(predicate?: BooleanCallback<never>): CollectionHolder<never>
    public filter(): CollectionHolder<never> {
        return this as unknown as CollectionHolder<never>
    }

    public filterIndexed<const S extends never, >(predicate?: ReverseRestrainedBooleanCallback<never, S>,): CollectionHolder<S>
    public filterIndexed(predicate?: ReverseBooleanCallback<never>,): CollectionHolder<never>
    public filterIndexed(): CollectionHolder<never> {
        return this as unknown as CollectionHolder<never>
    }


    public filterNot<const S extends never, >(predicate?: RestrainedBooleanCallback<never, S>,): CollectionHolder<Exclude<never, S>>
    public filterNot(predicate?: BooleanCallback<never>,): CollectionHolder<never>
    public filterNot(): CollectionHolder<never> {
        return this as unknown as CollectionHolder<never>
    }

    public filterIndexedNot<const S extends never, >(predicate?: ReverseRestrainedBooleanCallback<never, S>,): CollectionHolder<S>
    public filterIndexedNot(predicate?: ReverseBooleanCallback<never>,): CollectionHolder<never>
    public filterIndexedNot(): CollectionHolder<never> {
        return this as unknown as CollectionHolder<never>
    }


    public filterNotNull(): CollectionHolder<never> {
        return this as unknown as CollectionHolder<never>
    }

    public requireNoNulls(): CollectionHolder<never> {
        return this as unknown as CollectionHolder<never>
    }

    //#endregion -------------------- Filter methods --------------------
    //#region -------------------- Find methods --------------------

    public find<const S extends never, >(predicate?: RestrainedBooleanCallback<never, S>,): null
    public find(predicate?: BooleanCallback<never>,): never
    public find(): null {
        return null
    }

    public findIndexed<const S extends never, >(callback?: ReverseRestrainedBooleanCallback<never, S>,): null
    public findIndexed(predicate?: ReverseBooleanCallback<never>,): null
    public findIndexed(): null {
        return null
    }


    public findLast<const S extends never, >(predicate?: RestrainedBooleanCallback<never, S>,): null
    public findLast(predicate?: BooleanCallback<never>,): null
    public findLast(): null {
        return null
    }

    public findLastIndexed(predicate?: ReverseBooleanCallback<never>,): null
    public findLastIndexed(): null {
        return null
    }

    //#endregion -------------------- Find methods --------------------
    //#region -------------------- Slice methods --------------------

    public slice(indices?: readonly number[],): this
    public slice(indices?: ReadonlySet<number>,): this
    public slice(indices?: CollectionHolder<number>,): this
    public slice(indices?: CollectionIterator<number>,): this
    public slice(indices?: Iterable<number>,): this
    public slice(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): this
    public slice(indicesOrFromIndex?: Nullable<| readonly number[] | ReadonlySet<number> | CollectionHolder<number> | CollectionIterator<number> | Iterable<number> | number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): this
    public slice(): this {
        return this
    }

    //#endregion -------------------- Slice methods --------------------
    //#region -------------------- Map methods --------------------

    public map<const U, >(transform?: ValueIndexWithReturnCallback<never, U>,): CollectionHolder<U>
    public map(): CollectionHolder<never> {
        return this as unknown as CollectionHolder<never>
    }

    public mapIndexed<const U, >(transform?: IndexValueWithReturnCallback<never, U>,): CollectionHolder<U>
    public mapIndexed(): CollectionHolder<never> {
        return this as unknown as CollectionHolder<never>
    }

    public mapNotNull<const U extends NonNullable<unknown>, >(transform?: ValueIndexWithReturnCallback<never, Nullable<U>>,): CollectionHolder<U>
    public mapNotNull<const U extends NonNullable<unknown>, >(): CollectionHolder<U> {
        return this as unknown as CollectionHolder<U>
    }

    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform?: IndexValueWithReturnCallback<never, Nullable<U>>,): CollectionHolder<U>
    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(): CollectionHolder<U> {
        return this as unknown as CollectionHolder<U>
    }

    //#endregion -------------------- Map methods --------------------
    //#region -------------------- ForEach methods --------------------

    public forEach(action?: ValueIndexCallback<never>,): this
    public forEach(): this {
        return this
    }

    public forEachIndexed(action?: IndexValueCallback<never>,): this
    public forEachIndexed(): this {
        return this
    }

    //#endregion -------------------- ForEach methods --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): EmptyCollectionIterator {
        return CollectionConstants.EMPTY_COLLECTION_ITERATOR
    }

    public get [Symbol.toStringTag](): CollectionHolderName {
        return CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG
    }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public get objectValuesMap(): ReadonlyMap<never, never> {
        return CollectionConstants.EMPTY_MAP
    }


    public toIterator(): EmptyCollectionIterator {
        return this[Symbol.iterator]()
    }


    public toArray(): readonly never[] {
        return CollectionConstants.EMPTY_ARRAY
    }

    public toMutableArray(): never[] {
        return []
    }


    public toSet(): ReadonlySet<never> {
        return CollectionConstants.EMPTY_SET
    }

    public toMutableSet(): Set<never> {
        return new Set()
    }


    public toWeakSet(): Readonly<WeakSet<never>> {
        return CollectionConstants.EMPTY_WEAK_SET
    }

    public toMutableWeakSet(): WeakSet<never> {
        return new WeakSet()
    }


    public toMap(): ReadonlyMap<never, never> {
        return CollectionConstants.EMPTY_MAP
    }

    public toMutableMap(): Map<never, never> {
        return new Map<never, never>()
    }


    public toReversed(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<never>
    public toReversed(): CollectionHolder<never> {
        return this as unknown as CollectionHolder<never>
    }


    public toString(): "[]" {
        return "[]"
    }

    public toLocaleString(): "[]" {
        return "[]"
    }

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}
