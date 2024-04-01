/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullableString, TemplateOrNumber} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                        from "./CollectionHolder"
import type {BooleanCallback, CollectionHolderName, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./CollectionHolder.types"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                              from "./MinimalistCollectionHolder"
import type {EmptyCollectionIterator}                                                                                                                                                                                                                                                 from "./iterator/EmptyCollectionIterator"
import type {CollectionIterator}                                                                                                                                                                                                                                                      from "./iterator/CollectionIterator"

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
    //#region -------------------- Has X methods --------------------

    public get hasNull(): false { return false }

    public get includesNull(): false { return false }

    public get containsNull(): false { return false }

    //#endregion -------------------- Has X methods --------------------

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Value methods --------------------

    //#region -------------------- Get / at methods --------------------

    public get(index?: NullableNumber,): never { throw new EmptyCollectionHolderException(null, index,) }

    public at(index?: NullableNumber,): never { throw new EmptyCollectionHolderException(null, index,) }

    public elementAt(index?: NullableNumber,): never { throw new EmptyCollectionHolderException(null, index,) }


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


    public getOrNull(index?: number,): null
    public getOrNull() { return null }

    public atOrNull(index?: number,): null
    public atOrNull() { return null }

    public elementAtOrNull(index?: number,): null
    public elementAtOrNull() { return null }

    //#endregion -------------------- Get / at methods --------------------
    //#region -------------------- Index of methods --------------------

    public indexOf(element?: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): null
    public indexOf() { return null }


    public lastIndexOf(element?: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): null
    public lastIndexOf() { return null }


    public indexOfFirst(predicate?: BooleanCallback<never>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): null
    public indexOfFirst() { return null }

    public indexOfFirstIndexed(predicate?: ReverseBooleanCallback<never>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): null
    public indexOfFirstIndexed() { return null }


    public indexOfLast(predicate?: BooleanCallback<never>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): null
    public indexOfLast() { return null }

    public indexOfLastIndexed(predicate?: ReverseBooleanCallback<never>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): null
    public indexOfLastIndexed() { return null }

    //#endregion -------------------- Index of methods --------------------
    //#region -------------------- First methods --------------------

    public first(): never
    public first<const S extends never, >(predicate?: Nullable<RestrainedBooleanCallback<never, S>>,): never
    public first(predicate?: Nullable<BooleanCallback<never>>,): never
    public first() { throw new EmptyCollectionHolderException() }

    public firstOrNull(): null
    public firstOrNull<const S extends never, >(predicate?: Nullable<RestrainedBooleanCallback<never, S>>,): null
    public firstOrNull(predicate?: Nullable<BooleanCallback<never>>,): null
    public firstOrNull() { return null }

    //#endregion -------------------- First methods --------------------
    //#region -------------------- Last methods --------------------

    public last(): never
    public last<const S extends never, >(predicate?: Nullable<RestrainedBooleanCallback<never, S>>,): never
    public last(predicate?: Nullable<BooleanCallback<never>>,): never
    public last() { throw new EmptyCollectionHolderException() }

    public lastOrNull(): null
    public lastOrNull<const S extends never, >(predicate?: Nullable<RestrainedBooleanCallback<never, S>>,): null
    public lastOrNull(predicate?: Nullable<BooleanCallback<never>>,): null
    public lastOrNull() { return null }

    //#endregion -------------------- Last methods --------------------

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- All / any / none methods --------------------

    public all(predicate?: BooleanCallback<never>,): false
    public all() { return false }

    public any(): this["isNotEmpty"]
    public any(predicate?: Nullable<BooleanCallback<never>>,): this["isNotEmpty"]
    public any() { return false }

    public none(): this["isEmpty"]
    public none(predicate?: Nullable<BooleanCallback<never>>,): this["isEmpty"]
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

    public join(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<never>>,): string
    public join(_separator?: NullableString, prefix?: NullableString, postfix?: NullableString,) {
        return prefixAndPostfixOnly(prefix, postfix,)
    }

    //#endregion -------------------- Join methods --------------------
    //#region -------------------- Filter methods --------------------

    public filter<const S extends never, >(predicate?: RestrainedBooleanCallback<never, S>): this
    public filter(predicate?: BooleanCallback<never>): this
    public filter() { return this }

    public filterIndexed<const S extends never, >(predicate?: ReverseRestrainedBooleanCallback<never, S>,): this
    public filterIndexed(predicate?: ReverseBooleanCallback<never>,): this
    public filterIndexed() { return this }


    public filterNot<const S extends never, >(predicate?: RestrainedBooleanCallback<never, S>,): this
    public filterNot(predicate?: BooleanCallback<never>,): this
    public filterNot() { return this }

    public filterIndexedNot<const S extends never, >(predicate?: ReverseRestrainedBooleanCallback<never, S>,): this
    public filterIndexedNot(predicate?: ReverseBooleanCallback<never>,): this
    public filterIndexedNot() { return this }


    public filterNotNull(): this { return this }

    public requireNoNulls(): this { return this }

    //#endregion -------------------- Filter methods --------------------
    //#region -------------------- Find methods --------------------

    public find<const S extends never, >(predicate?: RestrainedBooleanCallback<never, S>,): null
    public find(predicate?: BooleanCallback<never>,): never
    public find() { return null }

    public findIndexed<const S extends never, >(callback?: ReverseRestrainedBooleanCallback<never, S>,): null
    public findIndexed(predicate?: ReverseBooleanCallback<never>,): null
    public findIndexed() { return null }


    public findLast<const S extends never, >(predicate?: RestrainedBooleanCallback<never, S>,): null
    public findLast(predicate?: BooleanCallback<never>,): null
    public findLast() { return null }

    public findLastIndexed<const S extends never, >(callback?: ReverseRestrainedBooleanCallback<never, S>,): null
    public findLastIndexed(predicate?: ReverseBooleanCallback<never>,): null
    public findLastIndexed() { return null }

    //#endregion -------------------- Find methods --------------------
    //#region -------------------- Slice methods --------------------

    public slice(indices?: readonly number[],): this
    public slice(indices?: ReadonlySet<number>,): this
    public slice(indices?: MinimalistCollectionHolder<number>,): this
    public slice(indices?: CollectionIterator<number>,): this
    public slice(indices?: Iterable<number>,): this
    public slice(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): this
    public slice(indicesOrFromIndex?: Nullable<| readonly number[] | ReadonlySet<number> | MinimalistCollectionHolder<number> | CollectionIterator<number> | Iterable<number> | number>, toIndex?: NullableNumber, limit?: NullableNumber,): this
    public slice() { return this }

    //#endregion -------------------- Slice methods --------------------
    //#region -------------------- Map methods --------------------

    public map<const U, >(transform?: ValueIndexWithReturnCallback<never, U>,): CollectionHolder<U>
    public map() { return this }

    public mapIndexed<const U, >(transform?: IndexValueWithReturnCallback<never, U>,): CollectionHolder<U>
    public mapIndexed() { return this }

    public mapNotNull<const U extends NonNullable<unknown>, >(transform?: ValueIndexWithReturnCallback<never, Nullable<U>>,): CollectionHolder<U>
    public mapNotNull() { return this }

    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform?: IndexValueWithReturnCallback<never, Nullable<U>>,): CollectionHolder<U>
    public mapNotNullIndexed() { return this }

    //#endregion -------------------- Map methods --------------------
    //#region -------------------- ForEach methods --------------------

    public forEach(action?: ValueIndexCallback<never>,): this
    public forEach() { return this }

    public forEachIndexed(action?: IndexValueCallback<never>,): this
    public forEachIndexed() { return this }

    //#endregion -------------------- ForEach methods --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): EmptyCollectionIterator { return CollectionConstants.EMPTY_COLLECTION_ITERATOR }

    public get [Symbol.toStringTag](): CollectionHolderName { return "CollectionHolder" }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public get objectValuesMap(): ReadonlyMap<never, never> { return CollectionConstants.EMPTY_MAP }


    public toIterator(): EmptyCollectionIterator { return CollectionConstants.EMPTY_COLLECTION_ITERATOR }


    public toArray(): readonly never[] { return CollectionConstants.EMPTY_ARRAY }

    public toMutableArray(): never[] { return [] }


    public toSet(): ReadonlySet<never> { return CollectionConstants.EMPTY_SET }

    public toMutableSet(): Set<never> { return new Set() }


    public toWeakSet(): Readonly<WeakSet<never>> { return CollectionConstants.EMPTY_WEAK_SET }

    public toMutableWeakSet(): WeakSet<never> { return new WeakSet() }


    public toMap(): ReadonlyMap<never, never> { return CollectionConstants.EMPTY_MAP }

    public toMutableMap(): Map<never, never> { return new Map<never, never>() }


    public toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): this
    public toReverse() { return this as unknown as CollectionHolder<never> }

    public toReversed(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): this
    public toReversed() { return this as unknown as CollectionHolder<never> }

    public reversed(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): this
    public reversed() { return this as unknown as CollectionHolder<never> }

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
