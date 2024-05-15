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

    //#region -------------------- Get / at methods --------------------

    public get(): never
    public get(index?: Nullable<NumericOrObject>,): never
    public get(index?: Nullable<NumericOrObject>,): never {
        throw new EmptyCollectionHolderException(null, index,)
    }

    public at(): never
    public at(index?: Nullable<NumericOrObject>,): never
    public at(index?: Nullable<NumericOrObject>,): never {
        throw new EmptyCollectionHolderException(null, index,)
    }

    public elementAt(): never
    public elementAt(index?: Nullable<NumericOrObject>,): never
    public elementAt(index?: Nullable<NumericOrObject>,): never {
        throw new EmptyCollectionHolderException(null, index,)
    }


    public getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): U
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<never>,): never
    public getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,) {
        return defaultValue(index,)
    }

    public atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): U
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<never>,): never
    public atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<| U | never>,) {
        return defaultValue(index,)
    }


    public elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): U
    public elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<never>,): never
    public elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<| U | never>,) {
        return defaultValue(index,)
    }


    public getOrNull(): null
    public getOrNull(index?: unknown,): null
    public getOrNull() { return null }

    public atOrNull(): null
    public atOrNull(index?: unknown,): null
    public atOrNull() { return null }

    public elementAtOrNull(): null
    public elementAtOrNull(index?: unknown,): null
    public elementAtOrNull() { return null }

    //#endregion -------------------- Get / at methods --------------------
    //#region -------------------- Index of methods --------------------

    public indexOf(): null
    public indexOf(element?: unknown, fromIndex?: unknown, toIndex?: unknown, limit?: unknown,): null
    public indexOf() { return null }


    public lastIndexOf(): null
    public lastIndexOf(element?: unknown, fromIndex?: unknown, toIndex?: unknown, limit?: unknown,): null
    public lastIndexOf() { return null }


    public indexOfFirst(): null
    public indexOfFirst(predicate?: unknown, fromIndex?: unknown, toIndex?: unknown, limit?: unknown,): null
    public indexOfFirst() { return null }

    public indexOfFirstIndexed(): null
    public indexOfFirstIndexed(predicate?: unknown, fromIndex?: unknown, toIndex?: unknown, limit?: unknown,): null
    public indexOfFirstIndexed() { return null }


    public indexOfLast(): null
    public indexOfLast(predicate?: unknown, fromIndex?: unknown, toIndex?: unknown, limit?: unknown,): null
    public indexOfLast() { return null }

    public indexOfLastIndexed(): null
    public indexOfLastIndexed(predicate?: unknown, fromIndex?: unknown, toIndex?: unknown, limit?: unknown,): null
    public indexOfLastIndexed() { return null }

    //#endregion -------------------- Index of methods --------------------
    //#region -------------------- First methods --------------------

    public first(): never
    public first<const S extends never, >(predicate?: unknown,): never
    public first(predicate?: unknown,): never
    public first() { throw new EmptyCollectionHolderException() }

    public firstOrNull(): null
    public firstOrNull<const S extends never, >(predicate?: unknown,): null
    public firstOrNull(predicate?: unknown,): null
    public firstOrNull() { return null }

    //#endregion -------------------- First methods --------------------
    //#region -------------------- Last methods --------------------

    public last(): never
    public last<const S extends never, >(predicate?: unknown,): never
    public last(predicate?: unknown,): never
    public last() { throw new EmptyCollectionHolderException() }

    public lastOrNull(): null
    public lastOrNull<const S extends never, >(predicate?: unknown,): null
    public lastOrNull(predicate?: unknown,): null
    public lastOrNull() { return null }

    //#endregion -------------------- Last methods --------------------

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- All / any / none methods --------------------

    public all(): false
    public all(predicate?: unknown,): false
    public all() { return false }

    public any(): this["isNotEmpty"]
    public any(predicate?: unknown,): this["isNotEmpty"]
    public any() { return false }

    public none(): this["isEmpty"]
    public none(predicate?: unknown,): this["isEmpty"]
    public none() { return true }

    //#endregion -------------------- All / any / none methods --------------------
    //#region -------------------- Has / includes / contains methods --------------------

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

    public join(): string
    public join(separator?: unknown, prefix?: NullableString, postfix?: NullableString, limit?: unknown, truncated?: unknown, transform?: unknown,): string
    public join(_separator?: unknown, prefix?: NullableString, postfix?: NullableString,) {
        return prefixAndPostfixOnly(prefix, postfix,)
    }

    //#endregion -------------------- Join methods --------------------
    //#region -------------------- Filter methods --------------------

    public filter(): this
    public filter<const S extends never, >(predicate?: unknown,): this
    public filter(predicate?: unknown,): this
    public filter() { return this }

    public filterIndexed(): this
    public filterIndexed<const S extends never, >(predicate?: unknown,): this
    public filterIndexed(predicate?: unknown,): this
    public filterIndexed() { return this }


    public filterNot(): this
    public filterNot<const S extends never, >(predicate?: unknown,): this
    public filterNot(predicate?: unknown,): this
    public filterNot() { return this }

    public filterIndexedNot(): this
    public filterIndexedNot<const S extends never, >(predicate?: unknown,): this
    public filterIndexedNot(predicate?: unknown,): this
    public filterIndexedNot() { return this }


    public filterNotNull(): this { return this }

    public requireNoNulls(): this { return this }

    //#endregion -------------------- Filter methods --------------------
    //#region -------------------- Find methods --------------------

    public find(): null
    public find<const S extends never, >(predicate?: unknown,): null
    public find(predicate?: unknown,): never
    public find() { return null }

    public findIndexed(): null
    public findIndexed<const S extends never, >(callback?: unknown,): null
    public findIndexed(predicate?: unknown,): null
    public findIndexed() { return null }


    public findLast(): null
    public findLast<const S extends never, >(predicate?: unknown,): null
    public findLast(predicate?: unknown,): null
    public findLast() { return null }

    public findLastIndexed(): null
    public findLastIndexed<const S extends never, >(predicate?: unknown,): null
    public findLastIndexed(predicate?: unknown,): null
    public findLastIndexed() { return null }

    //#endregion -------------------- Find methods --------------------
    //#region -------------------- Slice methods --------------------

    public slice(): this
    public slice(indices?: unknown,): this
    public slice(fromIndex?: unknown, toIndex?: unknown, limit?: unknown,): this
    public slice(indicesOrFromIndex?: unknown, toIndex?: unknown, limit?: unknown,): this
    public slice() { return this }

    //#endregion -------------------- Slice methods --------------------
    //#region -------------------- Map methods --------------------

    public map<const U, >(): CollectionHolder<U>
    public map<const U, >(transform?: unknown,): CollectionHolder<U>
    public map() { return this }

    public mapIndexed<const U, >(): CollectionHolder<U>
    public mapIndexed<const U, >(transform?: unknown,): CollectionHolder<U>
    public mapIndexed() { return this }

    public mapNotNull<const U extends NonNullable<unknown>, >(): CollectionHolder<U>
    public mapNotNull<const U extends NonNullable<unknown>, >(transform?: unknown,): CollectionHolder<U>
    public mapNotNull() { return this }

    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(): CollectionHolder<U>
    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform?: unknown,): CollectionHolder<U>
    public mapNotNullIndexed() { return this }

    //#endregion -------------------- Map methods --------------------
    //#region -------------------- ForEach methods --------------------

    public forEach(): this
    public forEach(action?: unknown,): this
    public forEach() { return this }

    public forEachIndexed(): this
    public forEachIndexed(action?: unknown,): this
    public forEachIndexed() { return this }

    //#endregion -------------------- ForEach methods --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): EmptyCollectionIterator { return CollectionConstants.EMPTY_COLLECTION_ITERATOR }

    public get [Symbol.toStringTag](): CollectionHolderName { return "CollectionHolder" }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public get objectValuesMap(): ReadonlyMap<never, never> { return CollectionConstants.EMPTY_MAP as ReadonlyMap<never, never> }


    public toIterator(): EmptyCollectionIterator { return CollectionConstants.EMPTY_COLLECTION_ITERATOR }


    public toArray(): readonly never[] { return CollectionConstants.EMPTY_ARRAY }

    public toMutableArray(): never[] { return [] }


    public toSet(): ReadonlySet<never> { return CollectionConstants.EMPTY_SET }

    public toMutableSet(): Set<never> { return new Set() }


    public toWeakSet(): Readonly<WeakSet<never>> { return CollectionConstants.EMPTY_WEAK_SET }

    public toMutableWeakSet(): WeakSet<never> { return new WeakSet() }


    public toMap(): ReadonlyMap<never, never> { return CollectionConstants.EMPTY_MAP as ReadonlyMap<never, never> }

    public toMutableMap(): Map<never, never> { return new Map<never, never>() }


    public toReverse(): this
    public toReverse(fromIndex?: unknown, toIndex?: unknown, limit?: unknown,): this
    public toReverse() { return this }

    public toReversed(): this
    public toReversed(fromIndex?: unknown, toIndex?: unknown, limit?: unknown,): this
    public toReversed() { return this }

    public reversed(): this
    public reversed(fromIndex?: unknown, toIndex?: unknown, limit?: unknown,): this
    public reversed() { return this }

    //#region -------------------- Conversion methods (toString) --------------------

    public toString(): "[]" { return "[]" }


    public toLocaleString(locale?: NullableString,): "[]"
    public toLocaleString() { return "[]" }

    public toLowerCaseString(): "[]" { return "[]" }

    public toLocaleLowerCaseString(locale?: NullableString,): "[]"
    public toLocaleLowerCaseString() { return "[]" }

    public toUpperCaseString(): "[]" { return "[]" }

    public toLocaleUpperCaseString(locale?: NullableString,): "[]"
    public toLocaleUpperCaseString() { return "[]" }

    //#endregion -------------------- Conversion methods (toString) --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}
