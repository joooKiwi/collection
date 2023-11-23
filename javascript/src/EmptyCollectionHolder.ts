/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                                                                                                                                                                                                                                                        from "./CollectionHolder"
import type {BooleanCallback, CollectionHolderName, IndexWithReturnCallback, IndexValueCallback, IndexValueWithReturnCallback, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./CollectionHolder.types"
import type {Nullable, NumberOrNumberInString}                                                                                                                                                                                                                                        from "./general type"
import type {EmptyCollectionIterator}                                                                                                                                                                                                                                                 from "./iterator/EmptyCollectionIterator"
import type {CollectionIterator}                                                                                                                                                                                                                                                      from "./iterator/CollectionIterator"

import {EmptyCollectionHolderException}            from "./exception/EmptyCollectionHolderException"
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

    public get(index?: Nullable<number>,): never { throw new EmptyCollectionHolderException("No element at any index could be found since it it empty.", index,) }

    public at(index?: Nullable<number>,): never { throw new EmptyCollectionHolderException("No element at any index could be found since it it empty.", index,) }

    public elementAt(index?: Nullable<number>,): never { throw new EmptyCollectionHolderException("No element at any index could be found since it it empty.", index,) }


    public getOrElse(index?: Nullable<number>,): never
    public getOrElse<const U, >(index?: Nullable<number>, defaultValue?: Nullable<IndexWithReturnCallback<U>>,): U
    public getOrElse(index?: Nullable<number>, defaultValue?: Nullable<IndexWithReturnCallback<never>>,): never
    public getOrElse<const U, >(index?: Nullable<number>, defaultValue?: Nullable<IndexWithReturnCallback<U>>,): U {
        if (defaultValue == null)
            throw new EmptyCollectionHolderException("No element at any index could be found since it it empty.", index,)
        if (index == null)
            throw new EmptyCollectionHolderException("No element at any index could be found since it it empty.", index,)
        return defaultValue(index,)
    }

    public atOrElse(index?: Nullable<number>,): never
    public atOrElse<const U, >(index?: Nullable<number>, defaultValue?: Nullable<IndexWithReturnCallback<U>>,): U
    public atOrElse(index?: Nullable<number>, defaultValue?: Nullable<IndexWithReturnCallback<never>>,): never
    public atOrElse<const U, >(index?: Nullable<number>, defaultValue?: Nullable<IndexWithReturnCallback<| U | never>>,): U {
        if (defaultValue == null)
            throw new EmptyCollectionHolderException("No element at any index could be found since it it empty.", index,)
        if (index == null)
            throw new EmptyCollectionHolderException("No element at any index could be found since it it empty.", index,)
        return defaultValue(index,)
    }


    public elementAtOrElse(index?: Nullable<number>,): never
    public elementAtOrElse<const U, >(index?: Nullable<number>, defaultValue?: Nullable<IndexWithReturnCallback<U>>,): U
    public elementAtOrElse(index?: Nullable<number>, defaultValue?: Nullable<IndexWithReturnCallback<never>>,): never
    public elementAtOrElse<const U, >(index?: Nullable<number>, defaultValue?: Nullable<IndexWithReturnCallback<| U | never>>,): U {
        if (defaultValue == null)
            throw new EmptyCollectionHolderException("No element at any index could be found since it it empty.", index,)
        if (index == null)
            throw new EmptyCollectionHolderException("No element at any index could be found since it it empty.", index,)
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

    public indexOf(element?: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): null
    public indexOf() { return null }


    public lastIndexOf(element?: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): null
    public lastIndexOf() { return null }


    public indexOfFirst(predicate?: BooleanCallback<never>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): null
    public indexOfFirst() { return null }

    public indexOfFirstIndexed(predicate?: ReverseBooleanCallback<never>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): null
    public indexOfFirstIndexed() { return null }


    public indexOfLast(predicate?: BooleanCallback<never>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): null
    public indexOfLast() { return null }

    public indexOfLastIndexed(predicate?: ReverseBooleanCallback<never>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): null
    public indexOfLastIndexed() { return null }

    //#endregion -------------------- Index of methods --------------------
    //#region -------------------- First methods --------------------

    public first(): never
    public first<const S extends never, >(predicate?: Nullable<RestrainedBooleanCallback<never, S>>,): never
    public first(predicate?: Nullable<BooleanCallback<never>>,): never
    public first() { throw new EmptyCollectionHolderException("No element at any index could be found since it it empty.",) }

    public firstOrNull(): null
    public firstOrNull<const S extends never, >(predicate?: Nullable<RestrainedBooleanCallback<never, S>>,): null
    public firstOrNull(predicate?: Nullable<BooleanCallback<never>>,): null
    public firstOrNull() { return null }

    //#endregion -------------------- First methods --------------------
    //#region -------------------- Last methods --------------------

    public last(): never
    public last<const S extends never, >(predicate?: Nullable<RestrainedBooleanCallback<never, S>>,): never
    public last(predicate?: Nullable<BooleanCallback<never>>,): never
    public last() { throw new EmptyCollectionHolderException("No element at any index could be found since it it empty.",) }

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

    public includesOne(...values: readonly never[]): false
    public includesOne(...values: readonly unknown[]): false
    public includesOne() { return false }

    public containsOne(...values: readonly never[]): false
    public containsOne(...values: readonly unknown[]): false
    public containsOne() { return false }


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

    public join(separator?: Nullable<string>, prefix?: Nullable<string>, postfix?: Nullable<string>, limit?: Nullable<number>, truncated?: Nullable<string>, transform?: Nullable<StringCallback<never>>,): string
    public join(_separator?: Nullable<string>, prefix?: Nullable<string>, postfix?: Nullable<string>,): string {
        return `${prefix ?? CollectionConstants.DEFAULT_JOIN_PREFIX}${postfix ?? CollectionConstants.DEFAULT_JOIN_POSTFIX}`
    }

    //#endregion -------------------- Join methods --------------------
    //#region -------------------- Filter methods --------------------

    public filter<const S extends never, >(predicate?: RestrainedBooleanCallback<never, S>): this
    public filter(predicate?: BooleanCallback<never>): this
    public filter() { return this }

    public filterIndexed<const S extends never, >(predicate?: ReverseRestrainedBooleanCallback<never, S>,): CollectionHolder<S>
    public filterIndexed(predicate?: ReverseBooleanCallback<never>,): CollectionHolder<never>
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
    public slice(indices?: CollectionHolder<number>,): this
    public slice(indices?: CollectionIterator<number>,): this
    public slice(indices?: Iterable<number>,): this
    public slice(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): this
    public slice(indicesOrFromIndex?: Nullable<| readonly number[] | ReadonlySet<number> | CollectionHolder<number> | CollectionIterator<number> | Iterable<number> | number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): this
    public slice(): this { return this }

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
    public forEach(): this { return this }

    public forEachIndexed(action?: IndexValueCallback<never>,): this
    public forEachIndexed(): this { return this }

    //#endregion -------------------- ForEach methods --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): EmptyCollectionIterator { return CollectionConstants.EMPTY_COLLECTION_ITERATOR }

    public get [Symbol.toStringTag](): CollectionHolderName { return CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG }

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


    public toReversed(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<never>
    public toReversed(): CollectionHolder<never> {
        return this as unknown as CollectionHolder<never>
    }


    public toString(): "[]" { return "[]" }


    public toLocaleString(locale?: Nullable<string>,): "[]"
    public toLocaleString(): "[]" { return "[]" }

    public toLowerCaseString(): "[]" { return "[]" }

    public toLocaleLowerCaseString(locale?: Nullable<string>,): "[]"
    public toLocaleLowerCaseString(): "[]" { return "[]" }
    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}
