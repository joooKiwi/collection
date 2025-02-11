//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Nullable, NullableString, NumericOrObject, TemplateOrNumber} from "@joookiwi/type"

import type {CollectionHolder}                           from "./CollectionHolder"
import type {CollectionIterator}                         from "./iterator/CollectionIterator"
import type {EmptyCollectionIterator}                    from "./iterator/EmptyCollectionIterator"
import type {MinimalistCollectionHolder}                 from "./MinimalistCollectionHolder"
import type {IndexWithReturnCallback}                    from "./type/callback"
import type {PossibleIterableArraySetOrCollectionHolder} from "./type/possibleInstance"
import type {CollectionHolderName}                       from "./type/toStringTag"

import {CollectionConstants}                     from "./CollectionConstants"
import {EmptyCollectionException}                from "./exception/EmptyCollectionException"
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
        throw new EmptyCollectionException(null, index,)
    }

    public at(index?: Nullable<NumericOrObject>, ..._: readonly unknown[]): never
    public at(index?: Nullable<NumericOrObject>,) { return this.get(index,) }

    public elementAt(index?: Nullable<NumericOrObject>, ..._: readonly unknown[]): never
    public elementAt(index?: Nullable<NumericOrObject>,) { return this.get(index,) }

    public getFirst(..._: readonly unknown[]): never
    public getFirst() { throw new EmptyCollectionException() }

    public getLast(..._: readonly unknown[]): never
    public getLast() { throw new EmptyCollectionException() }


    public getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>, ..._: readonly unknown[]): U
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<never>, ..._: readonly unknown[]): never
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return defaultValue(index,)
    }

    public atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>, ..._: readonly unknown[]): U
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<never>, ..._: readonly unknown[]): never
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) { return this.getOrElse(index, defaultValue,) }

    public elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>, ..._: readonly unknown[]): U
    public elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<never>, ..._: readonly unknown[]): never
    public elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,)  { return this.getOrElse(index, defaultValue,) }


    public getOrNull(..._: readonly unknown[]): null
    public getOrNull() { return null }

    public atOrNull(..._: readonly unknown[]): null
    public atOrNull() { return this.getOrNull() }

    public elementAtOrNull(..._: readonly unknown[]): null
    public elementAtOrNull() { return this.getOrNull() }

    public getFirstOrNull(..._: readonly unknown[]): null
    public getFirstOrNull() { return null }

    public getLastOrNull(..._: readonly unknown[]): null
    public getLastOrNull() { return null }

    //#endregion -------------------- Get --------------------
    //#region -------------------- First --------------------

    public first<const S, >(..._: readonly unknown[]): never
    public first() {
        if (arguments.length == 0)
            this.getFirst()
        this.findFirst()
    }

    public firstOrNull<const S, >(..._: readonly unknown[]): null
    public firstOrNull() {
        if (arguments.length == 0)
            return this.getFirstOrNull()
        return this.findFirstOrNull()
    }

    public firstIndexed<const S, >(..._: readonly unknown[]): never
    public firstIndexed() {
        if (arguments.length == 0)
            this.getFirst()
        this.findFirstIndexed()
    }

    public firstIndexedOrNull<const S, >(..._: readonly unknown[]): null
    public firstIndexedOrNull() {
        if (arguments.length == 0)
            return this.getFirstOrNull()
        return this.findFirstIndexedOrNull()
    }

    //#endregion -------------------- First --------------------
    //#region -------------------- Last --------------------

    public last<const S, >(..._: readonly unknown[]): never
    public last() {
        if (arguments.length == 0)
            this.getLast()
        this.findLast()
    }

    public lastOrNull<const S, >(..._: readonly unknown[]): null
    public lastOrNull() {
        if (arguments.length == 0)
            return this.getLastOrNull()
        return this.findLastOrNull()
    }

    public lastIndexed<const S, >(..._: readonly unknown[]): never
    public lastIndexed() {
        if (arguments.length == 0)
            this.getLast()
        this.findLastIndexed()
    }

    public lastIndexedOrNull<const S, >(..._: readonly unknown[]): null
    public lastIndexedOrNull() {
        if (arguments.length == 0)
            return this.getLastOrNull()
        return this.findLastIndexedOrNull()
    }

    //#endregion -------------------- Last --------------------
    //#region -------------------- Find first --------------------

    public findFirst<const S, >(..._: readonly unknown[]): never
    public findFirst() { throw new EmptyCollectionException() }

    public find<const S, >(..._: readonly unknown[]): never
    public find() { this.findFirst() }


    public findFirstOrNull<const S, >(..._: readonly unknown[]): null
    public findFirstOrNull() { return null }

    public findOrNull<const S, >(..._: readonly unknown[]): null
    public findOrNull() { return this.findFirstOrNull() }


    public findFirstIndexed<const S, >(..._: readonly unknown[]): never
    public findFirstIndexed() { throw new EmptyCollectionException() }

    public findIndexed<const S, >(..._: readonly unknown[]): never
    public findIndexed() { this.findFirstIndexed() }


    public findFirstIndexedOrNull<const S, >(..._: readonly unknown[]): null
    public findFirstIndexedOrNull() { return null }

    public findIndexedOrNull<const S, >(..._: readonly unknown[]): null
    public findIndexedOrNull() { return this.findFirstIndexedOrNull() }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find last --------------------

    public findLast<const S, >(..._: readonly unknown[]): never
    public findLast() { throw new EmptyCollectionException() }

    public findLastOrNull<const S, >(..._: readonly unknown[]): null
    public findLastOrNull() { return null }

    public findLastIndexed<const S, >(..._: readonly unknown[]): never
    public findLastIndexed() { throw new EmptyCollectionException() }

    public findLastIndexedOrNull<const S, >(..._: readonly unknown[]): null
    public findLastIndexedOrNull() { return null }

    //#endregion -------------------- Find last --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- First index of --------------------

    public firstIndexOf(..._: readonly unknown[]): never
    public firstIndexOf() { throw new EmptyCollectionException() }

    public indexOf(..._: readonly unknown[]): never
    public indexOf() { return this.firstIndexOf() }


    public firstIndexOfOrNull(..._: readonly unknown[]): null
    public firstIndexOfOrNull() { return null }

    public indexOfOrNull(..._: readonly unknown[]): null
    public indexOfOrNull() { return this.firstIndexOfOrNull() }

    //#endregion -------------------- First index of --------------------
    //#region -------------------- Last index of --------------------

    public lastIndexOf(..._: readonly unknown[]): never
    public lastIndexOf() { throw new EmptyCollectionException() }


    public lastIndexOfOrNull(..._: readonly unknown[]): null
    public lastIndexOfOrNull() { return null }

    //#endregion -------------------- Last index of --------------------
    //#region -------------------- Index of first --------------------

    public indexOfFirst(..._: readonly unknown[]): never
    public indexOfFirst() { throw new EmptyCollectionException() }

    public findFirstIndex(..._: readonly unknown[]): never
    public findFirstIndex() { return this.indexOfFirst() }

    public findIndex(..._: readonly unknown[]): never
    public findIndex() { return this.indexOfFirst() }


    public indexOfFirstOrNull(..._: readonly unknown[]): null
    public indexOfFirstOrNull() { return null }

    public findFirstIndexOrNull(..._: readonly unknown[]): null
    public findFirstIndexOrNull() { return this.indexOfFirstOrNull() }

    public findIndexOrNull(..._: readonly unknown[]): null
    public findIndexOrNull() { return this.indexOfFirstOrNull() }


    public indexOfFirstIndexed(..._: readonly unknown[]): never
    public indexOfFirstIndexed() { throw new EmptyCollectionException() }

    public findFirstIndexIndexed(..._: readonly unknown[]): never
    public findFirstIndexIndexed() { return this.indexOfFirstIndexed() }

    public findIndexIndexed(..._: readonly unknown[]): never
    public findIndexIndexed() { return this.indexOfFirstIndexed() }


    public indexOfFirstIndexedOrNull(..._: readonly unknown[]): null
    public indexOfFirstIndexedOrNull() { return null }

    public findFirstIndexIndexedOrNull(..._: readonly unknown[]): null
    public findFirstIndexIndexedOrNull() { return this.indexOfFirstIndexedOrNull() }

    public findIndexIndexedOrNull(..._: readonly unknown[]): null
    public findIndexIndexedOrNull() { return this.indexOfFirstIndexedOrNull() }

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of last --------------------

    public indexOfLast(..._: readonly unknown[]): never
    public indexOfLast() { throw new EmptyCollectionException() }

    public findLastIndex(..._: readonly unknown[]): never
    public findLastIndex() { return this.indexOfLast() }


    public indexOfLastOrNull(..._: readonly unknown[]): null
    public indexOfLastOrNull() { return null }

    public findLastIndexOrNull(..._: readonly unknown[]): null
    public findLastIndexOrNull() { return this.indexOfLastOrNull() }


    public indexOfLastIndexed(..._: readonly unknown[]): never
    public indexOfLastIndexed() { throw new EmptyCollectionException() }

    public findLastIndexIndexed(..._: readonly unknown[]): never
    public findLastIndexIndexed() { return this.indexOfLastIndexed() }


    public indexOfLastIndexedOrNull(..._: readonly unknown[]): null
    public indexOfLastIndexedOrNull() { return null }

    public findLastIndexIndexedOrNull(..._: readonly unknown[]): null
    public findLastIndexIndexedOrNull() { return this.indexOfLastIndexedOrNull() }

    //#endregion -------------------- Index of last --------------------

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

    public filterIndexed<const S, >(..._: readonly unknown[]): this
    public filterIndexed() { return this }


    public filterNot<const S, >(..._: readonly unknown[]): this
    public filterNot() { return this }

    public filterNotIndexed<const S, >(..._: readonly unknown[]): this
    public filterNotIndexed() { return this }


    public filterNotNull(..._: readonly unknown[]): this
    public filterNotNull() { return this }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    public slice(..._: readonly unknown[]): this
    public slice() { return this }

    //#endregion -------------------- Slice --------------------

    //#region -------------------- Take --------------------

    public take(..._: readonly unknown[]): this
    public take() { return this }

    public limit(..._: readonly unknown[]): this
    public limit() { return this.take() }


    public takeWhile(..._: readonly unknown[]): this
    public takeWhile() { return this }

    public limitWhile(..._: readonly unknown[]): this
    public limitWhile() { return this.takeWhile() }


    public takeWhileIndexed(..._: readonly unknown[]): this
    public takeWhileIndexed() { return this }

    public limitWhileIndexed(..._: readonly unknown[]): this
    public limitWhileIndexed() { return this.takeWhileIndexed() }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Take last --------------------

    public takeLast(..._: readonly unknown[]): this
    public takeLast() { return this }

    public limitLast(..._: readonly unknown[]): this
    public limitLast() { return this.takeLast() }


    public takeLastWhile(..._: readonly unknown[]): this
    public takeLastWhile() { return this }

    public limitLastWhile(..._: readonly unknown[]): this
    public limitLastWhile() { return this.takeLastWhile() }


    public takeLastWhileIndexed(..._: readonly unknown[]): this
    public takeLastWhileIndexed() { return this }

    public limitLastWhileIndexed(..._: readonly unknown[]): this
    public limitLastWhileIndexed() { return this.takeLastWhileIndexed() }

    //#endregion -------------------- Take last --------------------
    //#region -------------------- Drop --------------------

    public drop(..._: readonly unknown[]): this
    public drop() { return this }

    public skip(..._: readonly unknown[]): this
    public skip() { return this.drop() }


    public dropWhile(..._: readonly unknown[]): this
    public dropWhile() { return this }

    public skipWhile(..._: readonly unknown[]): this
    public skipWhile() { return this.dropWhile() }


    public dropWhileIndexed(..._: readonly unknown[]): this
    public dropWhileIndexed() { return this }

    public skipWhileIndexed(..._: readonly unknown[]): this
    public skipWhileIndexed() { return this.dropWhileIndexed() }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Drop last --------------------

    public dropLast(..._: readonly unknown[]): this
    public dropLast() { return this }

    public skipLast(..._: readonly unknown[]): this
    public skipLast() { return this.dropLast() }


    public dropLastWhile(..._: readonly unknown[]): this
    public dropLastWhile() { return this }

    public skipLastWhile(..._: readonly unknown[]): this
    public skipLastWhile() { return this.dropLastWhile() }


    public dropLastWhileIndexed(..._: readonly unknown[]): this
    public dropLastWhileIndexed() { return this }

    public skipLastWhileIndexed(..._: readonly unknown[]): this
    public skipLastWhileIndexed() { return this.dropLastWhileIndexed() }

    //#endregion -------------------- Drop last --------------------

    //#region -------------------- Map --------------------

    public map<const U, >(..._: readonly unknown[]): CollectionHolder<U>
    public map() { return this }

    public mapIndexed<const U, >(..._: readonly unknown[]): CollectionHolder<U>
    public mapIndexed() { return this }


    public mapNotNull<const U extends NonNullable<unknown>, >(..._: readonly unknown[]): CollectionHolder<U>
    public mapNotNull() { return this }

    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(..._: readonly unknown[]): CollectionHolder<U>
    public mapNotNullIndexed() { return this }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    public forEach(..._: readonly unknown[]): void
    public forEach() {}

    public forEachIndexed(..._: readonly unknown[]): void
    public forEachIndexed() {}

    //#endregion -------------------- For each --------------------
    //#region -------------------- On each --------------------

    public onEach(..._: readonly unknown[]): this
    public onEach() { return this }

    public onEachIndexed(..._: readonly unknown[]): this
    public onEachIndexed() { return this }

    //#endregion -------------------- On each --------------------

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
    //#region -------------------- JavaScript methods --------------------

    public [Symbol.iterator](..._: readonly unknown[]): EmptyCollectionIterator
    public [Symbol.iterator]() { return CollectionConstants.EMPTY_COLLECTION_ITERATOR }

    public get [Symbol.toStringTag](): CollectionHolderName { return "CollectionHolder" }

    //#endregion -------------------- JavaScript methods --------------------
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
