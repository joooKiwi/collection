/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableString, NumericOrObject, TemplateOrNumber} from "@joookiwi/type"

import type {CollectionHolder}                                                                          from "./CollectionHolder"
import type {CollectionHolderName, IndexWithReturnCallback, PossibleIterableArraySetOrCollectionHolder} from "./CollectionHolder.types"
import type {CollectionIterator}                                                                        from "./iterator/CollectionIterator"
import type {EmptyCollectionIterator}                                                                   from "./iterator/EmptyCollectionIterator"
import type {MinimalistCollectionHolder}                                                                from "./MinimalistCollectionHolder"

import {EmptyCollectionHolderException}          from "./exception/EmptyCollectionHolderException"
import {CollectionConstants}                     from "./CollectionConstants"
import {isArray}                                 from "./method/isArray"
import {isArrayByStructure}                      from "./method/isArrayByStructure"
import {isCollectionIterator}                    from "./method/isCollectionIterator"
import {isCollectionIteratorByStructure}         from "./method/isCollectionIteratorByStructure"
import {isCollectionHolder}                      from "./method/isCollectionHolder"
import {isCollectionHolderByStructure}           from "./method/isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}            from "./method/isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure} from "./method/isMinimalistCollectionHolderByStructure"
import {isSet}                                   from "./method/isSet"
import {isSetByStructure}                        from "./method/isSetByStructure"
import {prefixAndPostfixOnly}                    from "./method/joinToString"

/**
 * A {@link CollectionHolder} with no values (as a singleton instance)
 *
 * @see GenericMinimalistCollectionHolder
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
    //#region -------------------- Fields --------------------

    [index: TemplateOrNumber]: undefined

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    public get size(): 0 { return 0 }

    public get length(): 0 { return this.size }

    public get count(): 0 { return this.size }


    public get isEmpty(): true { return true }

    public get isNotEmpty(): false { return false }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public get(index?: Nullable<NumericOrObject>, ..._: readonly unknown[]): never
    public get(index?: Nullable<NumericOrObject>,) {
        throw new EmptyCollectionHolderException(null, index,)
    }

    public at(index?: Nullable<NumericOrObject>, ..._: readonly unknown[]): never
    public at(index?: Nullable<NumericOrObject>,) { return this.get(index,) }

    public elementAt(index?: Nullable<NumericOrObject>, ..._: readonly unknown[]): never
    public elementAt(index?: Nullable<NumericOrObject>,) { return this.get(index,) }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Get or else --------------------

    public getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>, ..._: readonly unknown[]): U
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<never>, ..._: readonly unknown[]): never
    public getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,) {
        return defaultValue(index,)
    }

    public atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>, ..._: readonly unknown[]): U
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<never>, ..._: readonly unknown[]): never
    public atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U >,) { return this.getOrElse(index, defaultValue,) }

    public elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>, ..._: readonly unknown[]): U
    public elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<never>, ..._: readonly unknown[]): never
    public elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,)  { return this.getOrElse(index, defaultValue,) }

    //#endregion -------------------- Get or else --------------------
    //#region -------------------- Get or null --------------------

    public getOrNull(..._: readonly unknown[]): null
    public getOrNull() { return null }

    public atOrNull(..._: readonly unknown[]): null
    public atOrNull() { return this.getOrNull() }

    public elementAtOrNull(..._: readonly unknown[]): null
    public elementAtOrNull() { return this.getOrNull() }

    //#endregion -------------------- Get or null --------------------

    //#region -------------------- First --------------------

    public first<const S, >(..._: readonly unknown[]): never
    public first() { throw new EmptyCollectionHolderException() }

    //#endregion -------------------- First --------------------
    //#region -------------------- First or null --------------------

    public firstOrNull<const S, >(..._: readonly unknown[]): null
    public firstOrNull() { return null }

    //#endregion -------------------- First or null --------------------

    //#region -------------------- Last --------------------

    public last<const S, >(..._: readonly unknown[]): never
    public last() { throw new EmptyCollectionHolderException() }

    //#endregion -------------------- Last --------------------
    //#region -------------------- Last or null --------------------

    public lastOrNull<const S, >(..._: readonly unknown[]): null
    public lastOrNull() { return null }

    //#endregion -------------------- Last or null --------------------

    //#region -------------------- Find --------------------

    public find<const S, >(..._: readonly unknown[]): null
    public find() { return null }

    //#endregion -------------------- Find --------------------
    //#region -------------------- Find indexed --------------------

    public findIndexed<const S, >(..._: readonly unknown[]): null
    public findIndexed() { return null }

    //#endregion -------------------- Find indexed --------------------

    //#region -------------------- Find last --------------------

    public findLast<const S, >(..._: readonly unknown[]): null
    public findLast() { return null }

    //#endregion -------------------- Find last --------------------
    //#region -------------------- Find last indexed --------------------

    public findLastIndexed<const S, >(..._: readonly unknown[]): null
    public findLastIndexed() { return null }

    //#endregion -------------------- Find last indexed --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- Index of --------------------

    public indexOf(..._: readonly unknown[]): null
    public indexOf() { return null }

    //#endregion -------------------- Index of --------------------

    //#region -------------------- Last index of --------------------

    public lastIndexOf(..._: readonly unknown[]): null
    public lastIndexOf() { return null }

    //#endregion -------------------- Last index of --------------------

    //#region -------------------- Index of first --------------------

    public indexOfFirst(..._: readonly unknown[]): null
    public indexOfFirst() { return null }

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of first indexed --------------------

    public indexOfFirstIndexed(..._: readonly unknown[]): null
    public indexOfFirstIndexed() { return null }

    //#endregion -------------------- Index of first indexed --------------------

    //#region -------------------- Index of last --------------------

    public indexOfLast(..._: readonly unknown[]): null
    public indexOfLast() { return null }

    //#endregion -------------------- Index of last --------------------
    //#region -------------------- Index of last indexed --------------------

    public indexOfLastIndexed(..._: readonly unknown[]): null
    public indexOfLastIndexed() { return null }

    //#endregion -------------------- Index of last indexed --------------------

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    /** @return {true} */
    public all<const S extends never, >(..._: readonly unknown[]): this is CollectionHolder<S>
    public all() {
        return true
    }

    /** @return {true} */
    public every<const S extends never, >(..._: readonly unknown[]): this is CollectionHolder<S>
    public every() {
        return true
    }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    public any(..._: readonly unknown[]): false
    public any() { return false }

    public some(..._: readonly unknown[]): false
    public some() { return false }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    public none(..._: readonly unknown[]): true
    public none() { return true }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    public get hasNull(): false { return false }

    public get includesNull(): false { return this.hasNull }

    public get containsNull(): false { return this.hasNull }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has duplicate --------------------

    public get hasDuplicate(): false { return false }

    public get includesDuplicate(): false { return this.hasDuplicate }

    public get containsDuplicate(): false { return this.hasDuplicate }

    //#endregion -------------------- Has duplicate --------------------

    //#region -------------------- Has --------------------

    public has(..._: readonly unknown[]): false
    public has() { return false }

    public includes(..._: readonly unknown[]): false
    public includes() { return this.has() }

    public contains(..._: readonly unknown[]): false
    public contains() { return this.has() }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has one --------------------

    public hasOne(..._: readonly unknown[]): false
    public hasOne() { return false }

    public includesOne(..._: readonly unknown[]): false
    public includesOne() { return this.hasOne() }

    public containsOne(..._: readonly unknown[]): false
    public containsOne() { return this.hasOne() }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has all --------------------

    public hasAll(values: readonly never[], ..._: readonly unknown[]): boolean
    public hasAll(values: ReadonlySet<never>, ..._: readonly unknown[]): boolean
    public hasAll(values: CollectionHolder<never>, ..._: readonly unknown[]): boolean
    public hasAll(values: MinimalistCollectionHolder<never>, ..._: readonly unknown[]): boolean
    public hasAll(values: CollectionIterator<never>, ..._: readonly unknown[]): boolean
    public hasAll(values: Iterable<never>, ..._: readonly unknown[]): boolean
    public hasAll(values: PossibleIterableArraySetOrCollectionHolder<never>, ..._: readonly unknown[]): boolean
    public hasAll(values: readonly unknown[], ..._: readonly unknown[]): boolean
    public hasAll(values: ReadonlySet<unknown>, ..._: readonly unknown[]): boolean
    public hasAll(values: CollectionHolder, ..._: readonly unknown[]): boolean
    public hasAll(values: MinimalistCollectionHolder, ..._: readonly unknown[]): boolean
    public hasAll(values: CollectionIterator, ..._: readonly unknown[]): boolean
    public hasAll(values: Iterable<unknown>, ..._: readonly unknown[]): boolean
    public hasAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>, ..._: readonly unknown[]): boolean
    public hasAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) {
        if (isArray(values,))
            return values.length == 0
        if (isSet(values,))
            return values.size == 0
        if (isCollectionHolder(values,))
            return values.isEmpty
        if (isMinimalistCollectionHolder(values,))
            return values.size == 0
        if (isCollectionIterator(values,))
            return values.size == 0

        if (isArrayByStructure(values,))
            return values.length == 0
        if (isSetByStructure(values,))
            return values.size == 0
        if (isCollectionHolderByStructure<never>(values,))
            return values.isEmpty
        if (isMinimalistCollectionHolderByStructure<never>(values,))
            return values.size == 0
        if (isCollectionIteratorByStructure<never>(values,))
            return values.size == 0

        return values[Symbol.iterator]().next().done
    }

    public includesAll(values: readonly never[], ..._: readonly unknown[]): boolean
    public includesAll(values: ReadonlySet<never>, ..._: readonly unknown[]): boolean
    public includesAll(values: CollectionHolder<never>, ..._: readonly unknown[]): boolean
    public includesAll(values: MinimalistCollectionHolder<never>, ..._: readonly unknown[]): boolean
    public includesAll(values: CollectionIterator<never>, ..._: readonly unknown[]): boolean
    public includesAll(values: Iterable<never>, ..._: readonly unknown[]): boolean
    public includesAll(values: PossibleIterableArraySetOrCollectionHolder<never>, ..._: readonly unknown[]): boolean
    public includesAll(values: readonly unknown[], ..._: readonly unknown[]): boolean
    public includesAll(values: ReadonlySet<unknown>, ..._: readonly unknown[]): boolean
    public includesAll(values: CollectionHolder, ..._: readonly unknown[]): boolean
    public includesAll(values: MinimalistCollectionHolder, ..._: readonly unknown[]): boolean
    public includesAll(values: CollectionIterator, ..._: readonly unknown[]): boolean
    public includesAll(values: Iterable<unknown>, ..._: readonly unknown[]): boolean
    public includesAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>, ..._: readonly unknown[]): boolean
    public includesAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) { return this.hasAll(values,) }

    public containsAll(values: readonly never[], ..._: readonly unknown[]): boolean
    public containsAll(values: ReadonlySet<never>, ..._: readonly unknown[]): boolean
    public containsAll(values: CollectionHolder<never>, ..._: readonly unknown[]): boolean
    public containsAll(values: MinimalistCollectionHolder<never>, ..._: readonly unknown[]): boolean
    public containsAll(values: CollectionIterator<never>, ..._: readonly unknown[]): boolean
    public containsAll(values: Iterable<never>, ..._: readonly unknown[]): boolean
    public containsAll(values: PossibleIterableArraySetOrCollectionHolder<never>, ..._: readonly unknown[]): boolean
    public containsAll(values: readonly unknown[], ..._: readonly unknown[]): boolean
    public containsAll(values: ReadonlySet<unknown>, ..._: readonly unknown[]): boolean
    public containsAll(values: CollectionHolder, ..._: readonly unknown[]): boolean
    public containsAll(values: MinimalistCollectionHolder, ..._: readonly unknown[]): boolean
    public containsAll(values: CollectionIterator, ..._: readonly unknown[]): boolean
    public containsAll(values: Iterable<unknown>, ..._: readonly unknown[]): boolean
    public containsAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>, ..._: readonly unknown[]): boolean
    public containsAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) { return this.hasAll(values,) }

    //#endregion -------------------- Has all --------------------

    //#region -------------------- Require no nulls --------------------

    public requireNoNulls(..._: readonly unknown[]): this
    public requireNoNulls() { return this }

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public filter<const S, >(..._: readonly unknown[]): this
    public filter() { return this }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Filter indexed --------------------

    public filterIndexed<const S, >(..._: readonly unknown[]): this
    public filterIndexed() { return this }

    //#endregion -------------------- Filter indexed --------------------

    //#region -------------------- Filter not --------------------

    public filterNot<const S, >(..._: readonly unknown[]): this
    public filterNot() { return this }

    //#endregion -------------------- Filter not --------------------
    //#region -------------------- Filter not indexed --------------------

    public filterNotIndexed<const S, >(..._: readonly unknown[]): this
    public filterNotIndexed() { return this }

    //#endregion -------------------- Filter not indexed --------------------

    //#region -------------------- Filter not null --------------------

    public filterNotNull(..._: readonly unknown[]): this
    public filterNotNull() { return this }

    //#endregion -------------------- Filter not null --------------------

    //#region -------------------- Slice --------------------

    public slice(..._: readonly unknown[]): this
    public slice() { return this }

    //#endregion -------------------- Slice --------------------

    //#region -------------------- Map --------------------

    public map<const U, >(..._: readonly unknown[]): CollectionHolder<U>
    public map() { return this }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Map indexed --------------------

    public mapIndexed<const U, >(..._: readonly unknown[]): CollectionHolder<U>
    public mapIndexed() { return this }

    //#endregion -------------------- Map indexed --------------------

    //#region -------------------- Map not null --------------------

    public mapNotNull<const U extends NonNullable<unknown>, >(..._: readonly unknown[]): CollectionHolder<U>
    public mapNotNull() { return this }

    //#endregion -------------------- Map not null --------------------
    //#region -------------------- Map not null indexed --------------------

    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(..._: readonly unknown[]): CollectionHolder<U>
    public mapNotNullIndexed() { return this }

    //#endregion -------------------- Map not null indexed --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    public forEach(..._: readonly unknown[]): void
    public forEach() {}

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each indexed --------------------

    public forEachIndexed(..._: readonly unknown[]): void
    public forEachIndexed() {}

    //#endregion -------------------- For each indexed --------------------

    //#region -------------------- On each --------------------

    public onEach(..._: readonly unknown[]): this
    public onEach() { return this }

    //#endregion -------------------- On each --------------------
    //#region -------------------- On each indexed --------------------

    public onEachIndexed(..._: readonly unknown[]): this
    public onEachIndexed() { return this }

    //#endregion -------------------- On each indexed --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- to reverse --------------------

    public toReverse(..._: readonly unknown[]): this
    public toReverse() { return this }

    public toReversed(..._: readonly unknown[]): this
    public toReversed() { return this }

    public reversed(..._: readonly unknown[]): this
    public reversed() { return this }

    //#endregion -------------------- to reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](..._: readonly unknown[]): EmptyCollectionIterator
    public [Symbol.iterator]() { return CollectionConstants.EMPTY_COLLECTION_ITERATOR }

    public get [Symbol.toStringTag](): CollectionHolderName { return "CollectionHolder" }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To iterator --------------------

    public toIterator(..._: readonly unknown[]): EmptyCollectionIterator
    public toIterator() { return this[Symbol.iterator]() }

    //#endregion -------------------- To iterator --------------------
    //#region -------------------- To array --------------------

    public toArray(..._: readonly unknown[]): readonly never[]
    public toArray() { return CollectionConstants.EMPTY_ARRAY }

    public toMutableArray(..._: readonly unknown[]): never[]
    public toMutableArray() { return [] }

    //#endregion -------------------- To array --------------------
    //#region -------------------- To set --------------------

    public toSet(..._: readonly unknown[]): ReadonlySet<never>
    public toSet() { return CollectionConstants.EMPTY_SET }

    public toMutableSet(..._: readonly unknown[]): Set<never>
    public toMutableSet() { return new Set() }

    //#endregion -------------------- To set --------------------
    //#region -------------------- To weak set --------------------

    public toWeakSet(..._: readonly unknown[]): Readonly<WeakSet<never>>
    public toWeakSet() { return CollectionConstants.EMPTY_WEAK_SET }

    public toMutableWeakSet(..._: readonly unknown[]): WeakSet<never>
    public toMutableWeakSet() { return new WeakSet() }

    //#endregion -------------------- To weak set --------------------
    //#region -------------------- To map --------------------

    public toMap(..._: readonly unknown[]): ReadonlyMap<never, never>
    public toMap() { return CollectionConstants.EMPTY_MAP }

    public toMutableMap(..._: readonly unknown[]): Map<never, never>
    public toMutableMap() { return new Map() }

    //#endregion -------------------- To map --------------------
    //#region -------------------- To weak map --------------------

    public toWeakMap(..._: readonly unknown[]): Readonly<WeakMap<never, never>>
    public toWeakMap() { return CollectionConstants.EMPTY_WEAK_MAP }

    public toMutableWeakMap(..._: readonly unknown[]): WeakMap<never, never>
    public toMutableWeakMap() { return new WeakMap() }

    //#endregion -------------------- To weak map --------------------

    //#region -------------------- To string --------------------

    public toString(..._: readonly unknown[]): "[]"
    public toString() { return "[]" }


    public toLocaleString(..._: readonly unknown[]): "[]"
    public toLocaleString() { return "[]" }

    public toLowerCaseString(..._: readonly unknown[]): "[]"
    public toLowerCaseString() { return "[]" }

    public toLocaleLowerCaseString(..._: readonly unknown[]): "[]"
    public toLocaleLowerCaseString() { return "[]" }

    public toUpperCaseString(..._: readonly unknown[]): "[]"
    public toUpperCaseString() { return "[]" }

    public toLocaleUpperCaseString(..._: readonly unknown[]): "[]"
    public toLocaleUpperCaseString() { return "[]" }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    public join(separator?: unknown, prefix?: NullableString, postfix?: NullableString, ..._: readonly unknown[]): string
    public join(separator?: unknown, prefix?: NullableString, postfix?: NullableString,) {
        return this.joinToString(separator, prefix, postfix,)
    }

    public joinToString(separator?: unknown, prefix?: NullableString, postfix?: NullableString, ..._: readonly unknown[]): string
    public joinToString(_separator?: unknown, prefix?: NullableString, postfix?: NullableString,) {
        return prefixAndPostfixOnly(prefix, postfix,)
    }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}
