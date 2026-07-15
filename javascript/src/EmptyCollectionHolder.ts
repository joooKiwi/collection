//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Array, EmptyArray, EmptyMap, EmptyMutableArray, EmptyMutableMap, EmptyMutableSet, EmptyMutableWeakMap, EmptyMutableWeakSet, EmptySet, EmptyWeakMap, EmptyWeakSet, Nullable, NullableString, NumericOrObject, Set, TemplateOrNumber} from "@joookiwi/type"

import type {CollectionHolder}                                   from "./CollectionHolder"
import type {CollectionIterator}                                 from "./iterator/CollectionIterator"
import type {MinimalistCollectionHolder}                         from "./MinimalistCollectionHolder"
import type {IndexWithReturnCallback, ReturnCallback}            from "./type/callback"
import type {PossibleIterableIteratorArraySetOrCollectionHolder} from "./type/possibleInstance"
import type {CollectionHolderName}                               from "./type/toStringTag"

import {CollectionConstants}                     from "./CollectionConstants"
import {EmptyCollectionException}                from "./exception/EmptyCollectionException"
import {EmptyCollectionIterator}                 from "./iterator/EmptyCollectionIterator"
import {isArray}                                 from "./method/isArray"
import {isArrayByStructure}                      from "./method/isArrayByStructure"
import {isCollectionIterator}                    from "./method/isCollectionIterator"
import {isCollectionIteratorByStructure}         from "./method/isCollectionIteratorByStructure"
import {isCollectionHolder}                      from "./method/isCollectionHolder"
import {isCollectionHolderByStructure}           from "./method/isCollectionHolderByStructure"
import {isIterator}                              from "./method/isIterator"
import {isIteratorByStructure}                   from "./method/isIteratorByStructure"
import {isMinimalistCollectionHolder}            from "./method/isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure} from "./method/isMinimalistCollectionHolderByStructure"
import {isSet}                                   from "./method/isSet"
import {isSetByStructure}                        from "./method/isSetByStructure"
import {prefixAndPostfixOnly}                    from "./method/joinToString"

/**
 * A {@link CollectionHolder} with no values (as a singleton instance)
 *
 * @see CollectionConstants.EMPTY_COLLECTION_HOLDER
 * @see GenericMinimalistCollectionHolder
 * @see MinimalistAsCollectionHolder
 * @see GenericCollectionHolder
 * @see ArrayAsCollectionHolder
 * @see ArrayOf1AsCollectionHolder
 * @see ArrayOf2AsCollectionHolder
 * @see SetAsCollectionHolder
 * @see SetOf1AsCollectionHolder
 * @see SetOf2AsCollectionHolder
 * @see IteratorAsCollectionHolder
 * @see JsIterableAsCollectionHolder
 * @see JsIteratorAsCollectionHolder
 * @see LazyCollectionHolder
 * @see LazyCollectionHolderOf0Or1
 * @see LazyCollectionHolderOf0Or1Or2
 * @see LazyCollectionHolderOf1
 * @see LazyCollectionHolderOf1Or2
 * @see LazyCollectionHolderOf2
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
    public get length(): this["size"] { return this.size }
    public get count(): this["size"] { return this.size }

    public get isEmpty(): true { return true }
    public get isNotEmpty(): false { return false }

    public get hasAtLeast1Element(): this["isNotEmpty"] { return this.isNotEmpty }
    public get includesAtLeast1Element(): this["isNotEmpty"] { return this.isNotEmpty }
    public get containsAtLeast1Element(): this["isNotEmpty"] { return this.isNotEmpty }

    public get hasExactly1Element(): false { return false }
    public get includesExactly1Element(): this["hasExactly1Element"] { return this.hasExactly1Element }
    public get containsExactly1Element(): this["hasExactly1Element"] { return this.hasExactly1Element }

    public get hasAtMost1Element(): true { return true }
    public get includesAtMost1Element(): this["hasAtMost1Element"] { return this.hasAtMost1Element }
    public get containsAtMost1Element(): this["hasAtMost1Element"] { return this.hasAtMost1Element }

    public get hasAtLeast2Elements(): false { return false }
    public get includesAtLeast2Elements(): this["hasAtLeast2Elements"] { return this.hasAtLeast2Elements }
    public get containsAtLeast2Elements(): this["hasAtLeast2Elements"] { return this.hasAtLeast2Elements }

    public get hasExactly2Elements(): false { return false }
    public get includesExactly2Elements(): this["hasExactly2Elements"] { return this.hasExactly2Elements }
    public get containsExactly2Elements(): this["hasExactly2Elements"] { return this.hasExactly2Elements }

    public get hasAtMost2Elements(): true { return true }
    public get includesAtMost2Elements(): this["hasAtMost2Elements"] { return this.hasAtMost2Elements }
    public get containsAtMost2Elements(): this["hasAtMost2Elements"] { return this.hasAtMost2Elements }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public get(index?: Nullable<NumericOrObject>, ..._: Array<unknown>): never
    public get(index?: Nullable<NumericOrObject>,) {
        throw new EmptyCollectionException(null, index,)
    }

    public at(index?: Nullable<NumericOrObject>, ..._: Array<unknown>): never
    public at(index?: Nullable<NumericOrObject>,) { return this.get(index,) }

    public elementAt(index?: Nullable<NumericOrObject>, ..._: Array<unknown>): never
    public elementAt(index?: Nullable<NumericOrObject>,) { return this.get(index,) }

    public getFirst(..._: Array<unknown>): never
    public getFirst() { throw new EmptyCollectionException() }

    public getLast(..._: Array<unknown>): never
    public getLast() { throw new EmptyCollectionException() }


    public getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>, ..._: Array<unknown>): U
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<never>, ..._: Array<unknown>): never
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return defaultValue(index,)
    }

    public atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>, ..._: Array<unknown>): U
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<never>, ..._: Array<unknown>): never
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) { return this.getOrElse(index, defaultValue,) }

    public elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>, ..._: Array<unknown>): U
    public elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<never>, ..._: Array<unknown>): never
    public elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,)  { return this.getOrElse(index, defaultValue,) }


    public getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>, ..._: Array<unknown>): U
    public getFirstOrElse(defaultValue: ReturnCallback<never>, ..._: Array<unknown>): never
    public getFirstOrElse(defaultValue: ReturnCallback<unknown>,) {
        return defaultValue()
    }


    public getLastOrElse<const U, >(defaultValue: ReturnCallback<U>, ..._: Array<unknown>): U
    public getLastOrElse(defaultValue: ReturnCallback<never>, ..._: Array<unknown>): never
    public getLastOrElse(defaultValue: ReturnCallback<unknown>,) {
        return defaultValue()
    }


    public getOrNull(..._: Array<unknown>): null
    public getOrNull() { return null }

    public atOrNull(..._: Array<unknown>): null
    public atOrNull() { return this.getOrNull() }

    public elementAtOrNull(..._: Array<unknown>): null
    public elementAtOrNull() { return this.getOrNull() }

    public getFirstOrNull(..._: Array<unknown>): null
    public getFirstOrNull() { return null }

    public getLastOrNull(..._: Array<unknown>): null
    public getLastOrNull() { return null }

    //#endregion -------------------- Get --------------------
    //#region -------------------- First --------------------

    public first<const S, >(..._: Array<unknown>): never
    public first() {
        if (arguments.length === 0)
            this.getFirst()
        this.findFirst()
    }

    public firstOrNull<const S, >(..._: Array<unknown>): null
    public firstOrNull() {
        if (arguments.length === 0)
            return this.getFirstOrNull()
        return this.findFirstOrNull()
    }

    public firstIndexed<const S, >(..._: Array<unknown>): never
    public firstIndexed() {
        if (arguments.length === 0)
            this.getFirst()
        this.findFirstIndexed()
    }

    public firstIndexedOrNull<const S, >(..._: Array<unknown>): null
    public firstIndexedOrNull() {
        if (arguments.length === 0)
            return this.getFirstOrNull()
        return this.findFirstIndexedOrNull()
    }

    //#endregion -------------------- First --------------------
    //#region -------------------- Last --------------------

    public last<const S, >(..._: Array<unknown>): never
    public last() {
        if (arguments.length === 0)
            this.getLast()
        this.findLast()
    }

    public lastOrNull<const S, >(..._: Array<unknown>): null
    public lastOrNull() {
        if (arguments.length === 0)
            return this.getLastOrNull()
        return this.findLastOrNull()
    }

    public lastIndexed<const S, >(..._: Array<unknown>): never
    public lastIndexed() {
        if (arguments.length === 0)
            this.getLast()
        this.findLastIndexed()
    }

    public lastIndexedOrNull<const S, >(..._: Array<unknown>): null
    public lastIndexedOrNull() {
        if (arguments.length === 0)
            return this.getLastOrNull()
        return this.findLastIndexedOrNull()
    }

    //#endregion -------------------- Last --------------------
    //#region -------------------- Find first --------------------

    public findFirst(..._: Array<unknown>): never
    public findFirst<const S, >(..._: Array<unknown>): never
    public findFirst() { throw new EmptyCollectionException() }

    public find(..._: Array<unknown>): never
    public find<const S, >(..._: Array<unknown>): never
    public find() { this.findFirst() }


    public findFirstOrNull(..._: Array<unknown>): null
    public findFirstOrNull<const S, >(..._: Array<unknown>): null
    public findFirstOrNull() { return null }

    public findOrNull(..._: Array<unknown>): null
    public findOrNull<const S, >(..._: Array<unknown>): null
    public findOrNull() { return this.findFirstOrNull() }


    public findFirstIndexed(..._: Array<unknown>): never
    public findFirstIndexed<const S, >(..._: Array<unknown>): never
    public findFirstIndexed() { throw new EmptyCollectionException() }

    public findIndexed(..._: Array<unknown>): never
    public findIndexed<const S, >(..._: Array<unknown>): never
    public findIndexed() { this.findFirstIndexed() }


    public findFirstIndexedOrNull(..._: Array<unknown>): null
    public findFirstIndexedOrNull<const S, >(..._: Array<unknown>): null
    public findFirstIndexedOrNull() { return null }

    public findIndexedOrNull(..._: Array<unknown>): null
    public findIndexedOrNull<const S, >(..._: Array<unknown>): null
    public findIndexedOrNull() { return this.findFirstIndexedOrNull() }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find last --------------------

    public findLast(..._: Array<unknown>): never
    public findLast<const S, >(..._: Array<unknown>): never
    public findLast() { throw new EmptyCollectionException() }

    public findLastOrNull(..._: Array<unknown>): null
    public findLastOrNull<const S, >(..._: Array<unknown>): null
    public findLastOrNull() { return null }

    public findLastIndexed(..._: Array<unknown>): never
    public findLastIndexed<const S, >(..._: Array<unknown>): never
    public findLastIndexed() { throw new EmptyCollectionException() }

    public findLastIndexedOrNull(..._: Array<unknown>): null
    public findLastIndexedOrNull<const S, >(..._: Array<unknown>): null
    public findLastIndexedOrNull() { return null }

    //#endregion -------------------- Find last --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- First index of --------------------

    public firstIndexOf(..._: Array<unknown>): never
    public firstIndexOf() { throw new EmptyCollectionException() }

    public indexOf(..._: Array<unknown>): never
    public indexOf() { return this.firstIndexOf() }


    public firstIndexOfOrNull(..._: Array<unknown>): null
    public firstIndexOfOrNull() { return null }

    public indexOfOrNull(..._: Array<unknown>): null
    public indexOfOrNull() { return this.firstIndexOfOrNull() }

    //#endregion -------------------- First index of --------------------
    //#region -------------------- Last index of --------------------

    public lastIndexOf(..._: Array<unknown>): never
    public lastIndexOf() { throw new EmptyCollectionException() }


    public lastIndexOfOrNull(..._: Array<unknown>): null
    public lastIndexOfOrNull() { return null }

    //#endregion -------------------- Last index of --------------------
    //#region -------------------- Index of first --------------------

    public indexOfFirst(..._: Array<unknown>): never
    public indexOfFirst() { throw new EmptyCollectionException() }

    public findFirstIndex(..._: Array<unknown>): never
    public findFirstIndex() { return this.indexOfFirst() }

    public findIndex(..._: Array<unknown>): never
    public findIndex() { return this.indexOfFirst() }


    public indexOfFirstOrNull(..._: Array<unknown>): null
    public indexOfFirstOrNull() { return null }

    public findFirstIndexOrNull(..._: Array<unknown>): null
    public findFirstIndexOrNull() { return this.indexOfFirstOrNull() }

    public findIndexOrNull(..._: Array<unknown>): null
    public findIndexOrNull() { return this.indexOfFirstOrNull() }


    public indexOfFirstIndexed(..._: Array<unknown>): never
    public indexOfFirstIndexed() { throw new EmptyCollectionException() }

    public findFirstIndexIndexed(..._: Array<unknown>): never
    public findFirstIndexIndexed() { return this.indexOfFirstIndexed() }

    public findIndexIndexed(..._: Array<unknown>): never
    public findIndexIndexed() { return this.indexOfFirstIndexed() }


    public indexOfFirstIndexedOrNull(..._: Array<unknown>): null
    public indexOfFirstIndexedOrNull() { return null }

    public findFirstIndexIndexedOrNull(..._: Array<unknown>): null
    public findFirstIndexIndexedOrNull() { return this.indexOfFirstIndexedOrNull() }

    public findIndexIndexedOrNull(..._: Array<unknown>): null
    public findIndexIndexedOrNull() { return this.indexOfFirstIndexedOrNull() }

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of last --------------------

    public indexOfLast(..._: Array<unknown>): never
    public indexOfLast() { throw new EmptyCollectionException() }

    public findLastIndex(..._: Array<unknown>): never
    public findLastIndex() { return this.indexOfLast() }


    public indexOfLastOrNull(..._: Array<unknown>): null
    public indexOfLastOrNull() { return null }

    public findLastIndexOrNull(..._: Array<unknown>): null
    public findLastIndexOrNull() { return this.indexOfLastOrNull() }


    public indexOfLastIndexed(..._: Array<unknown>): never
    public indexOfLastIndexed() { throw new EmptyCollectionException() }

    public findLastIndexIndexed(..._: Array<unknown>): never
    public findLastIndexIndexed() { return this.indexOfLastIndexed() }


    public indexOfLastIndexedOrNull(..._: Array<unknown>): null
    public indexOfLastIndexedOrNull() { return null }

    public findLastIndexIndexedOrNull(..._: Array<unknown>): null
    public findLastIndexIndexedOrNull() { return this.indexOfLastIndexedOrNull() }

    //#endregion -------------------- Index of last --------------------

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    /** @return {true} */
    public all<const S extends never, >(..._: Array<unknown>): this is EmptyCollectionHolder
    public all(..._: Array<unknown>): true
    public all() {
        return true
    }

    /** @return {true} */
    public every<const S extends never, >(..._: Array<unknown>): this is EmptyCollectionHolder
    public every(..._: Array<unknown>): true
    public every() {
        return this.all()
    }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    public any(..._: Array<unknown>): false
    public any() { return false }

    public some(..._: Array<unknown>): false
    public some() { return this.any() }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    public none(..._: Array<unknown>): true
    public none() { return true }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    public get hasNull(): false { return false }

    public get includesNull(): this["hasNull"] { return this.hasNull }

    public get containsNull(): this["hasNull"] { return this.hasNull }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has no nulls --------------------

    public get hasNoNulls(): true { return true }

    public get includesNoNulls(): this["hasNoNulls"] { return this.hasNoNulls }

    public get containsNoNulls(): this["hasNoNulls"] { return this.hasNoNulls }

    //#endregion -------------------- Has no nulls --------------------
    //#region -------------------- Has duplicate --------------------

    public get hasDuplicate(): false { return false }

    public get includesDuplicate(): this["hasDuplicate"] { return this.hasDuplicate }

    public get containsDuplicate(): this["hasDuplicate"] { return this.hasDuplicate }

    //#endregion -------------------- Has duplicate --------------------
    //#region -------------------- Has no duplicates --------------------

    public get hasNoDuplicates(): true { return true }

    public get includesNoDuplicates(): this["hasNoDuplicates"] { return this.hasNoDuplicates }

    public get containsNoDuplicates(): this["hasNoDuplicates"] { return this.hasNoDuplicates }

    //#endregion -------------------- Has no duplicates --------------------

    //#region -------------------- Has --------------------

    public has(..._: Array<unknown>): false
    public has() { return false }

    public includes(..._: Array<unknown>): false
    public includes() { return this.has() }

    public contains(..._: Array<unknown>): false
    public contains() { return this.has() }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has not --------------------

    public hasNot(..._: Array<unknown>): true
    public hasNot() { return true }

    public includesNot(..._: Array<unknown>): true
    public includesNot() { return this.hasNot() }

    public containsNot(..._: Array<unknown>): true
    public containsNot() { return this.hasNot() }

    //#endregion -------------------- Has not --------------------
    //#region -------------------- Has one --------------------

    public hasOne(..._: Array<unknown>): false
    public hasOne() { return false }

    public includesOne(..._: Array<unknown>): false
    public includesOne() { return this.hasOne() }

    public containsOne(..._: Array<unknown>): false
    public containsOne() { return this.hasOne() }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

    public hasNotOne(..._: Array<unknown>): true
    public hasNotOne() { return true }

    public includesNotOne(..._: Array<unknown>): true
    public includesNotOne() { return this.hasNotOne() }

    public containsNotOne(..._: Array<unknown>): true
    public containsNotOne() { return this.hasNotOne() }

    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

    public hasAll(values: Nullable<Array<unknown>>, ..._: Array<unknown>): boolean
    public hasAll(values: Nullable<Set<unknown>>, ..._: Array<unknown>): boolean
    public hasAll(values: Nullable<CollectionHolder>, ..._: Array<unknown>): boolean
    public hasAll(values: Nullable<MinimalistCollectionHolder>, ..._: Array<unknown>): boolean
    public hasAll(values: Nullable<CollectionIterator>, ..._: Array<unknown>): boolean
    public hasAll(values: Nullable<Iterator<unknown, unknown, unknown>>, ..._: Array<unknown>): boolean
    public hasAll(values: Nullable<Iterable<unknown, unknown, unknown>>, ..._: Array<unknown>): boolean
    public hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<unknown>>, ..._: Array<unknown>): boolean
    public hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<unknown>>,) {
        if (values == null)
            return true
        if (isArray(values,))
            return values.length === 0
        if (isSet(values,))
            return values.size === 0
        if (isCollectionHolder(values,))
            return values.isEmpty
        if (isMinimalistCollectionHolder(values,))
            return values.size === 0
        if (isCollectionIterator(values,))
            return values.size === 0
        if (isIterator(values,))
            return values.next().done === true

        if (isArrayByStructure(values,))
            return values.length === 0
        if (isSetByStructure(values,))
            return values.size === 0
        if (isCollectionHolderByStructure<unknown>(values,))
            return values.isEmpty
        if (isMinimalistCollectionHolderByStructure<unknown>(values,))
            return values.size === 0
        if (isCollectionIteratorByStructure<unknown>(values,))
            return values.size === 0
        if (isIteratorByStructure<unknown>(values,))
            return values.next().done === true

        return values[Symbol.iterator]().next().done
    }

    public includesAll(values: Nullable<Array<unknown>>, ..._: Array<unknown>): boolean
    public includesAll(values: Nullable<Set<unknown>>, ..._: Array<unknown>): boolean
    public includesAll(values: Nullable<CollectionHolder>, ..._: Array<unknown>): boolean
    public includesAll(values: Nullable<MinimalistCollectionHolder>, ..._: Array<unknown>): boolean
    public includesAll(values: Nullable<CollectionIterator>, ..._: Array<unknown>): boolean
    public includesAll(values: Nullable<Iterator<unknown, unknown, unknown>>, ..._: Array<unknown>): boolean
    public includesAll(values: Nullable<Iterable<unknown, unknown, unknown>>, ..._: Array<unknown>): boolean
    public includesAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<unknown>>, ..._: Array<unknown>): boolean
    public includesAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<unknown>>,) { return this.hasAll(values,) }

    public containsAll(values: Nullable<Array<unknown>>, ..._: Array<unknown>): boolean
    public containsAll(values: Nullable<Set<unknown>>, ..._: Array<unknown>): boolean
    public containsAll(values: Nullable<CollectionHolder>, ..._: Array<unknown>): boolean
    public containsAll(values: Nullable<MinimalistCollectionHolder>, ..._: Array<unknown>): boolean
    public containsAll(values: Nullable<CollectionIterator>, ..._: Array<unknown>): boolean
    public containsAll(values: Nullable<Iterator<unknown, unknown, unknown>>, ..._: Array<unknown>): boolean
    public containsAll(values: Nullable<Iterable<unknown, unknown, unknown>>, ..._: Array<unknown>): boolean
    public containsAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<unknown>>, ..._: Array<unknown>): boolean
    public containsAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<unknown>>,) { return this.hasAll(values,) }

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

    public hasNotAll(values?: Nullable<Array<unknown>>, ..._: Array<unknown>): boolean
    public hasNotAll(values?: Nullable<Set<unknown>>, ..._: Array<unknown>): boolean
    public hasNotAll(values?: Nullable<CollectionHolder>, ..._: Array<unknown>): boolean
    public hasNotAll(values?: Nullable<MinimalistCollectionHolder>, ..._: Array<unknown>): boolean
    public hasNotAll(values?: Nullable<CollectionIterator>, ..._: Array<unknown>): boolean
    public hasNotAll(values?: Nullable<Iterator<unknown, unknown, unknown>>, ..._: Array<unknown>): boolean
    public hasNotAll(values?: Nullable<Iterable<unknown, unknown, unknown>>, ..._: Array<unknown>): boolean
    public hasNotAll(values?: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<unknown>>, ..._: Array<unknown>): boolean
    public hasNotAll(values?: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<unknown>>,) {
        if (values == null)
            return false
        if (isArray(values,))
            return values.length != 0
        if (isSet(values,))
            return values.size != 0
        if (isCollectionHolder(values,))
            return values.isNotEmpty
        if (isMinimalistCollectionHolder(values,))
            return values.size != 0
        if (isCollectionIterator(values,))
            return values.size != 0
        if (isIterator(values,))
            return values.next().done === false

        if (isArrayByStructure(values,))
            return values.length != 0
        if (isSetByStructure(values,))
            return values.size != 0
        if (isCollectionHolderByStructure<unknown>(values,))
            return values.isNotEmpty
        if (isMinimalistCollectionHolderByStructure<unknown>(values,))
            return values.size != 0
        if (isCollectionIteratorByStructure<unknown>(values,))
            return values.size != 0
        if (isIteratorByStructure<unknown>(values,))
            return values.next().done === false

        return !values[Symbol.iterator]().next().done
    }

    public includesNotAll(values?: Nullable<Array<unknown>>, ..._: Array<unknown>): boolean
    public includesNotAll(values?: Nullable<Set<unknown>>, ..._: Array<unknown>): boolean
    public includesNotAll(values?: Nullable<CollectionHolder>, ..._: Array<unknown>): boolean
    public includesNotAll(values?: Nullable<MinimalistCollectionHolder>, ..._: Array<unknown>): boolean
    public includesNotAll(values?: Nullable<CollectionIterator>, ..._: Array<unknown>): boolean
    public includesNotAll(values?: Nullable<Iterator<unknown, unknown, unknown>>, ..._: Array<unknown>): boolean
    public includesNotAll(values?: Nullable<Iterable<unknown, unknown, unknown>>, ..._: Array<unknown>): boolean
    public includesNotAll(values?: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<unknown>>, ..._: Array<unknown>): boolean
    public includesNotAll(values?: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<unknown>>,) { return this.hasNotAll(values,) }

    public containsNotAll(values?: Nullable<Array<unknown>>, ..._: Array<unknown>): boolean
    public containsNotAll(values?: Nullable<Set<unknown>>, ..._: Array<unknown>): boolean
    public containsNotAll(values?: Nullable<CollectionHolder>, ..._: Array<unknown>): boolean
    public containsNotAll(values?: Nullable<MinimalistCollectionHolder>, ..._: Array<unknown>): boolean
    public containsNotAll(values?: Nullable<CollectionIterator>, ..._: Array<unknown>): boolean
    public containsNotAll(values?: Nullable<Iterator<unknown, unknown, unknown>>, ..._: Array<unknown>): boolean
    public containsNotAll(values?: Nullable<Iterable<unknown, unknown, unknown>>, ..._: Array<unknown>): boolean
    public containsNotAll(values?: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<unknown>>, ..._: Array<unknown>): boolean
    public containsNotAll(values?: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<unknown>>,) { return this.hasNotAll(values,) }

    //#endregion -------------------- Has not all --------------------

    //#region -------------------- Require no nulls --------------------

    public requireNoNulls(..._: Array<unknown>): this
    public requireNoNulls() { return this }

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public filter(..._: Array<unknown>): this
    public filter<const S, >(..._: Array<unknown>): this
    public filter() { return this }

    public filterIndexed(..._: Array<unknown>): this
    public filterIndexed<const S, >(..._: Array<unknown>): this
    public filterIndexed() { return this }


    public filterNot(..._: Array<unknown>): this
    public filterNot<const S, >(..._: Array<unknown>): this
    public filterNot() { return this }

    public filterNotIndexed(..._: Array<unknown>): this
    public filterNotIndexed<const S, >(..._: Array<unknown>): this
    public filterNotIndexed() { return this }


    public filterNotNull(..._: Array<unknown>): this
    public filterNotNull() { return this }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    public slice(..._: Array<unknown>): this
    public slice() { return this }

    //#endregion -------------------- Slice --------------------

    //#region -------------------- Take --------------------

    public take(..._: Array<unknown>): this
    public take() { return this }

    public limit(..._: Array<unknown>): this
    public limit() { return this.take() }


    public takeWhile(..._: Array<unknown>): this
    public takeWhile() { return this }

    public limitWhile(..._: Array<unknown>): this
    public limitWhile() { return this.takeWhile() }


    public takeWhileIndexed(..._: Array<unknown>): this
    public takeWhileIndexed() { return this }

    public limitWhileIndexed(..._: Array<unknown>): this
    public limitWhileIndexed() { return this.takeWhileIndexed() }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Take last --------------------

    public takeLast(..._: Array<unknown>): this
    public takeLast() { return this }

    public limitLast(..._: Array<unknown>): this
    public limitLast() { return this.takeLast() }


    public takeLastWhile(..._: Array<unknown>): this
    public takeLastWhile() { return this }

    public limitLastWhile(..._: Array<unknown>): this
    public limitLastWhile() { return this.takeLastWhile() }


    public takeLastWhileIndexed(..._: Array<unknown>): this
    public takeLastWhileIndexed() { return this }

    public limitLastWhileIndexed(..._: Array<unknown>): this
    public limitLastWhileIndexed() { return this.takeLastWhileIndexed() }

    //#endregion -------------------- Take last --------------------
    //#region -------------------- Drop --------------------

    public drop(..._: Array<unknown>): this
    public drop() { return this }

    public skip(..._: Array<unknown>): this
    public skip() { return this.drop() }


    public dropWhile(..._: Array<unknown>): this
    public dropWhile() { return this }

    public skipWhile(..._: Array<unknown>): this
    public skipWhile() { return this.dropWhile() }


    public dropWhileIndexed(..._: Array<unknown>): this
    public dropWhileIndexed() { return this }

    public skipWhileIndexed(..._: Array<unknown>): this
    public skipWhileIndexed() { return this.dropWhileIndexed() }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Drop last --------------------

    public dropLast(..._: Array<unknown>): this
    public dropLast() { return this }

    public skipLast(..._: Array<unknown>): this
    public skipLast() { return this.dropLast() }


    public dropLastWhile(..._: Array<unknown>): this
    public dropLastWhile() { return this }

    public skipLastWhile(..._: Array<unknown>): this
    public skipLastWhile() { return this.dropLastWhile() }


    public dropLastWhileIndexed(..._: Array<unknown>): this
    public dropLastWhileIndexed() { return this }

    public skipLastWhileIndexed(..._: Array<unknown>): this
    public skipLastWhileIndexed() { return this.dropLastWhileIndexed() }

    //#endregion -------------------- Drop last --------------------

    //#region -------------------- Map --------------------

    public map<const U, >(..._: Array<unknown>): CollectionHolder<U>
    public map() { return this }

    public mapIndexed<const U, >(..._: Array<unknown>): CollectionHolder<U>
    public mapIndexed() { return this }


    public mapNotNull<const U extends NonNullable<unknown>, >(..._: Array<unknown>): CollectionHolder<U>
    public mapNotNull() { return this }

    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(..._: Array<unknown>): CollectionHolder<U>
    public mapNotNullIndexed() { return this }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    public forEach(..._: Array<unknown>): void
    public forEach() {}

    public forEachIndexed(..._: Array<unknown>): void
    public forEachIndexed() {}

    //#endregion -------------------- For each --------------------
    //#region -------------------- On each --------------------

    public onEach(..._: Array<unknown>): this
    public onEach() { return this }

    public onEachIndexed(..._: Array<unknown>): this
    public onEachIndexed() { return this }

    //#endregion -------------------- On each --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- to reverse --------------------

    public toReverse(..._: Array<unknown>): this
    public toReverse() { return this }

    public toReversed(..._: Array<unknown>): this
    public toReversed() { return this.toReverse() }

    public reversed(..._: Array<unknown>): this
    public reversed() { return this.toReverse() }

    //#endregion -------------------- to reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public [Symbol.iterator](..._: Array<unknown>): EmptyCollectionIterator
    public [Symbol.iterator]() { return this.toIterator() }

    public get [Symbol.toStringTag](): CollectionHolderName { return "CollectionHolder" }

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To iterator --------------------

    public toIterator(..._: Array<unknown>): EmptyCollectionIterator
    public toIterator() { return EmptyCollectionIterator.get }

    //#endregion -------------------- To iterator --------------------
    //#region -------------------- To array --------------------

    public toArray(..._: Array<unknown>): EmptyArray
    public toArray() { return CollectionConstants.EMPTY_ARRAY }

    public toMutableArray(..._: Array<unknown>): EmptyMutableArray
    public toMutableArray() { return [] }

    //#endregion -------------------- To array --------------------
    //#region -------------------- To set --------------------

    public toSet(..._: Array<unknown>): EmptySet
    public toSet() { return CollectionConstants.EMPTY_SET }

    public toMutableSet(..._: Array<unknown>): EmptyMutableSet
    public toMutableSet() { return new Set() }

    //#endregion -------------------- To set --------------------
    //#region -------------------- To weak set --------------------

    public toWeakSet(..._: Array<unknown>): EmptyWeakSet
    public toWeakSet() { return CollectionConstants.EMPTY_WEAK_SET }

    public toMutableWeakSet(..._: Array<unknown>): EmptyMutableWeakSet
    public toMutableWeakSet() { return new WeakSet() }

    //#endregion -------------------- To weak set --------------------
    //#region -------------------- To map --------------------

    public toMap(..._: Array<unknown>): EmptyMap
    public toMap() { return CollectionConstants.EMPTY_MAP }

    public toMutableMap(..._: Array<unknown>): EmptyMutableMap
    public toMutableMap() { return new Map() }

    //#endregion -------------------- To map --------------------
    //#region -------------------- To weak map --------------------

    public toWeakMap(..._: Array<unknown>): EmptyWeakMap
    public toWeakMap() { return CollectionConstants.EMPTY_WEAK_MAP }

    public toMutableWeakMap(..._: Array<unknown>): EmptyMutableWeakMap
    public toMutableWeakMap() { return new WeakMap() }

    //#endregion -------------------- To weak map --------------------

    //#region -------------------- To string --------------------

    public toString(..._: Array<unknown>): "[]"
    public toString() { return "[]" }

    public toLocaleString(..._: Array<unknown>): "[]"
    public toLocaleString() { return "[]" }

    public toLowerCaseString(..._: Array<unknown>): "[]"
    public toLowerCaseString() { return "[]" }

    public toLocaleLowerCaseString(..._: Array<unknown>): "[]"
    public toLocaleLowerCaseString() { return "[]" }

    public toUpperCaseString(..._: Array<unknown>): "[]"
    public toUpperCaseString() { return "[]" }

    public toLocaleUpperCaseString(..._: Array<unknown>): "[]"
    public toLocaleUpperCaseString() { return "[]" }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    public joinToString(separator?: unknown, prefix?: NullableString, postfix?: NullableString, ..._: Array<unknown>): string
    public joinToString(_separator?: unknown, prefix?: NullableString, postfix?: NullableString,) {
        return prefixAndPostfixOnly(prefix, postfix,)
    }

    public join(separator?: unknown, prefix?: NullableString, postfix?: NullableString, ..._: Array<unknown>): string
    public join(separator?: unknown, prefix?: NullableString, postfix?: NullableString,) {
        return this.joinToString(separator, prefix, postfix,)
    }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}
