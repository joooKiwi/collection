/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableString, NumericOrObject, TemplateOrNumber} from "@joookiwi/type"

import type {CollectionHolder}                              from "./CollectionHolder"
import type {CollectionHolderName, IndexWithReturnCallback} from "./CollectionHolder.types"
import type {EmptyCollectionIterator}                       from "./iterator/EmptyCollectionIterator"

import {EmptyCollectionHolderException} from "./exception/EmptyCollectionHolderException"
import {CollectionConstants}            from "./CollectionConstants"
import {prefixAndPostfixOnly}           from "./method/join"

/**
 * A {@link CollectionHolder} with no values (as a singleton instance)
 *
 * @see GenericCollectionHolder
 * @see LazyGenericCollectionHolder
 * @singleton
 */
export class EmptyCollectionHolder
    implements CollectionHolder<never> {

    //#region -------------------- Singleton usage --------------------

    static #instance?: EmptyCollectionHolder

    protected constructor() {}

    public static get get(): EmptyCollectionHolder {
        return EmptyCollectionHolder.#instance ??= new EmptyCollectionHolder()
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Getter methods --------------------

    [index: TemplateOrNumber]: undefined

    //#region -------------------- Size methods --------------------

    public get size(): 0 { return 0 }

    public get length(): 0 { return 0 }

    public get count(): 0 { return 0 }


    public get isEmpty(): true { return true }

    public get isNotEmpty(): false { return false }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has null methods --------------------

    public get hasNull(): false { return false }

    public get includesNull(): false { return false }

    public get containsNull(): false { return false }

    //#endregion -------------------- Has null methods --------------------
    //#region -------------------- Has duplicate methods --------------------

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Value methods --------------------

    //#region -------------------- Get methods --------------------

    public get(index?: Nullable<NumericOrObject>, ..._: readonly unknown[]): never
    public get(index?: Nullable<NumericOrObject>,): never {
        throw new EmptyCollectionHolderException(null, index,)
    }

    public at(index?: Nullable<NumericOrObject>, ..._: readonly unknown[]): never
    public at(index?: Nullable<NumericOrObject>,): never {
        throw new EmptyCollectionHolderException(null, index,)
    }

    public elementAt(index?: Nullable<NumericOrObject>, ..._: readonly unknown[]): never
    public elementAt(index?: Nullable<NumericOrObject>,): never {
        throw new EmptyCollectionHolderException(null, index,)
    }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Get or else methods --------------------

    public getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>, ..._: readonly unknown[]): U
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<never>, ..._: readonly unknown[]): never
    public getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,) {
        return defaultValue(index,)
    }

    public atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>, ..._: readonly unknown[]): U
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<never>, ..._: readonly unknown[]): never
    public atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<| U | never>,) {
        return defaultValue(index,)
    }

    public elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>, ..._: readonly unknown[]): U
    public elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<never>, ..._: readonly unknown[]): never
    public elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<| U | never>,) {
        return defaultValue(index,)
    }

    //#endregion -------------------- Get or else methods --------------------
    //#region -------------------- Get or null methods --------------------

    public getOrNull(..._: readonly unknown[]): null
    public getOrNull() { return null }

    public atOrNull(..._: readonly unknown[]): null
    public atOrNull() { return null }

    public elementAtOrNull(..._: readonly unknown[]): null
    public elementAtOrNull() { return null }

    //#endregion -------------------- Get or null methods --------------------

    //#region -------------------- Index of methods --------------------

    public indexOf(..._: readonly unknown[]): null
    public indexOf() { return null }

    //#endregion -------------------- Index of methods --------------------
    //#region -------------------- Last index of methods --------------------

    public lastIndexOf(..._: readonly unknown[]): null
    public lastIndexOf() { return null }

    //#endregion -------------------- Last index of methods --------------------
    //#region -------------------- Index of first methods --------------------

    public indexOfFirst(..._: readonly unknown[]): null
    public indexOfFirst() { return null }

    //#endregion -------------------- Index of first methods --------------------
    //#region -------------------- Index of first indexed methods --------------------

    public indexOfFirstIndexed(..._: readonly unknown[]): null
    public indexOfFirstIndexed() { return null }

    //#endregion -------------------- Index of first indexed methods --------------------
    //#region -------------------- Index of last methods --------------------

    public indexOfLast(..._: readonly unknown[]): null
    public indexOfLast() { return null }

    //#endregion -------------------- Index of last methods --------------------
    //#region -------------------- Index of last indexed methods --------------------

    public indexOfLastIndexed(..._: readonly unknown[]): null
    public indexOfLastIndexed() { return null }

    //#endregion -------------------- Index of last indexed methods --------------------

    //#region -------------------- First methods --------------------

    public first(..._: readonly unknown[]): never
    public first() { throw new EmptyCollectionHolderException() }

    //#endregion -------------------- First methods --------------------
    //#region -------------------- First or null methods --------------------

    public firstOrNull<const S, >(..._: readonly unknown[]): null
    public firstOrNull() { return null }

    //#endregion -------------------- First or null methods --------------------

    //#region -------------------- Last methods --------------------

    public last<const S, >(..._: readonly unknown[]): never
    public last() { throw new EmptyCollectionHolderException() }

    //#endregion -------------------- Last methods --------------------
    //#region -------------------- Last or null methods --------------------

    public lastOrNull<const S, >(..._: readonly unknown[]): null
    public lastOrNull() { return null }

    //#endregion -------------------- Last or null methods --------------------

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- All methods --------------------

    public all(..._: readonly unknown[]): false
    public all() { return false }

    //#endregion -------------------- All methods --------------------
    //#region -------------------- Any methods --------------------

    public any(..._: readonly unknown[]): this["isNotEmpty"]
    public any() { return false }

    //#endregion -------------------- Any methods --------------------
    //#region -------------------- None methods --------------------

    public none(..._: readonly unknown[]): this["isEmpty"]
    public none() { return true }

    //#endregion -------------------- None methods --------------------

    //#region -------------------- Has methods --------------------

    public hasOne(...values: readonly never[]): false
    public hasOne(...values: readonly unknown[]): false
    public hasOne() { return false }

    public has(...values: readonly never[]): false
    public has(...values: readonly unknown[]): false
    public has() { return false }

    public includesOne(...values: readonly never[]): false
    public includesOne(...values: readonly unknown[]): false
    public includesOne() { return false }

    public includes(...values: readonly never[]): false
    public includes(...values: readonly unknown[]): false
    public includes() { return false }

    public containsOne(...values: readonly never[]): false
    public containsOne(...values: readonly unknown[]): false
    public containsOne() { return false }

    public contains(...values: readonly never[]): false
    public contains(...values: readonly unknown[]): false
    public contains() { return false }


    public hasAll(...values: readonly never[]): false
    public hasAll(...values: readonly unknown[]): false
    public hasAll() { return false }

    public includesAll(...values: readonly never[]): false
    public includesAll(...values: readonly unknown[]): false
    public includesAll() { return false }

    public containsAll(...values: readonly never[]): false
    public containsAll(...values: readonly unknown[]): false
    public containsAll() { return false }

    //#endregion -------------------- Has / includes / contains methods --------------------
    //#region -------------------- Join methods --------------------

    public join(separator?: unknown, prefix?: NullableString, postfix?: NullableString, ..._: readonly unknown[]): string
    public join(_separator?: unknown, prefix?: NullableString, postfix?: NullableString,) {
        return prefixAndPostfixOnly(prefix, postfix,)
    }

    //#endregion -------------------- Join methods --------------------

    //#region -------------------- Filter methods --------------------

    public filter<const S, >(..._: readonly unknown[]): this
    public filter() { return this }

    //#endregion -------------------- Filter methods --------------------
    //#region -------------------- Filter indexed methods --------------------

    public filterIndexed<const S, >(..._: readonly unknown[]): this
    public filterIndexed() { return this }

    //#endregion -------------------- Filter indexed methods --------------------
    //#region -------------------- Filter not methods --------------------

    public filterNot<const S, >(..._: readonly unknown[]): this
    public filterNot() { return this }

    //#endregion -------------------- Filter not methods --------------------
    //#region -------------------- Filter not indexed methods --------------------

    public filterIndexedNot<const S, >(..._: readonly unknown[]): this
    public filterIndexedNot() { return this }


    //#endregion -------------------- Filter not indexed methods --------------------
    //#region -------------------- Filter not null methods --------------------

    public filterNotNull(..._: readonly unknown[]): this
    public filterNotNull(): this { return this }

    //#endregion -------------------- Filter not null methods --------------------
    //#region -------------------- Require no nulls methods --------------------

    public requireNoNulls(..._: readonly unknown[]): this
    public requireNoNulls(): this { return this }

    //#endregion -------------------- Require no nulls methods --------------------

    //#region -------------------- Find methods --------------------

    public find<const S, >(..._: readonly unknown[]): never
    public find() { return null }

    //#endregion -------------------- Find methods --------------------
    //#region -------------------- Find indexed methods --------------------

    public findIndexed<const S, >(..._: readonly unknown[]): null
    public findIndexed() { return null }

    //#endregion -------------------- Find indexed methods --------------------
    //#region -------------------- Find last methods --------------------

    public findLast<const S, >(..._: readonly unknown[]): null
    public findLast() { return null }

    //#endregion -------------------- Find last methods --------------------
    //#region -------------------- Find last indexed methods --------------------

    public findLastIndexed<const S, >(..._: readonly unknown[]): null
    public findLastIndexed() { return null }

    //#endregion -------------------- Find last indexed methods --------------------

    //#region -------------------- Slice methods --------------------

    public slice(..._: readonly unknown[]): this
    public slice() { return this }

    //#endregion -------------------- Slice methods --------------------

    //#region -------------------- Map methods --------------------

    public map<const U, >(..._: readonly unknown[]): CollectionHolder<U>
    public map() { return this }

    //#endregion -------------------- Map methods --------------------
    //#region -------------------- Map indexed methods --------------------

    public mapIndexed<const U, >(..._: readonly unknown[]): CollectionHolder<U>
    public mapIndexed() { return this }

    //#endregion -------------------- Map indexed methods --------------------
    //#region -------------------- Map not null methods --------------------

    public mapNotNull<const U extends NonNullable<unknown>, >(..._: readonly unknown[]): CollectionHolder<U>
    public mapNotNull() { return this }

    //#endregion -------------------- Map not null methods --------------------
    //#region -------------------- Map not null indexed methods --------------------

    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(..._: readonly unknown[]): CollectionHolder<U>
    public mapNotNullIndexed() { return this }

    //#endregion -------------------- Map not null indexed methods --------------------

    //#region -------------------- For each methods --------------------

    public forEach(..._: readonly unknown[]): this
    public forEach() { return this }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- For each indexed methods --------------------

    public forEachIndexed(..._: readonly unknown[]): this
    public forEachIndexed() { return this }

    //#endregion -------------------- For each indexed methods --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](..._: readonly unknown[]): EmptyCollectionIterator
    public [Symbol.iterator](): EmptyCollectionIterator { return CollectionConstants.EMPTY_COLLECTION_ITERATOR }

    public get [Symbol.toStringTag](): CollectionHolderName { return "CollectionHolder" }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public get objectValuesMap(): ReadonlyMap<never, never> { return CollectionConstants.EMPTY_MAP as ReadonlyMap<never, never> }


    public toIterator(..._: readonly unknown[]): EmptyCollectionIterator
    public toIterator(): EmptyCollectionIterator { return CollectionConstants.EMPTY_COLLECTION_ITERATOR }


    public toArray(..._: readonly unknown[]): readonly never[]
    public toArray(): readonly never[] { return CollectionConstants.EMPTY_ARRAY }

    public toMutableArray(..._: readonly unknown[]): never[]
    public toMutableArray(): never[] { return [] }


    public toSet(..._: readonly unknown[]): ReadonlySet<never>
    public toSet(): ReadonlySet<never> { return CollectionConstants.EMPTY_SET }

    public toMutableSet(..._: readonly unknown[]): Set<never>
    public toMutableSet(): Set<never> { return new Set() }


    public toWeakSet(..._: readonly unknown[]): Readonly<WeakSet<never>>
    public toWeakSet(): Readonly<WeakSet<never>> { return CollectionConstants.EMPTY_WEAK_SET }

    public toMutableWeakSet(..._: readonly unknown[]): WeakSet<never>
    public toMutableWeakSet(): WeakSet<never> { return new WeakSet() }


    public toMap(..._: readonly unknown[]): ReadonlyMap<never, never>
    public toMap(): ReadonlyMap<never, never> { return CollectionConstants.EMPTY_MAP as ReadonlyMap<never, never> }

    public toMutableMap(..._: readonly unknown[]): Map<never, never>
    public toMutableMap(): Map<never, never> { return new Map<never, never>() }


    public toReverse(..._: readonly unknown[]): this
    public toReverse() { return this }

    public toReversed(..._: readonly unknown[]): this
    public toReversed() { return this }

    public reversed(..._: readonly unknown[]): this
    public reversed() { return this }

    //#region -------------------- Conversion methods (string) --------------------

    public toString(..._: readonly unknown[]): "[]"
    public toString(): "[]" { return "[]" }


    public toLocaleString(..._: readonly unknown[]): "[]"
    public toLocaleString() { return "[]" }

    public toLowerCaseString(..._: readonly unknown[]): "[]"
    public toLowerCaseString(): "[]" { return "[]" }

    public toLocaleLowerCaseString(..._: readonly unknown[]): "[]"
    public toLocaleLowerCaseString() { return "[]" }

    public toUpperCaseString(..._: readonly unknown[]): "[]"
    public toUpperCaseString(): "[]" { return "[]" }

    public toLocaleUpperCaseString(..._: readonly unknown[]): "[]"
    public toLocaleUpperCaseString() { return "[]" }

    //#endregion -------------------- Conversion methods (string) --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}
