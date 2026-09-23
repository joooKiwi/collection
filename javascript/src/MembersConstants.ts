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

import type {Array} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                           from "./CollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                 from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                         from "./iterator/CollectionIterator"
import type {KeyOfArray, KeyOfCollectionHolder, KeyOfCollectionIterator, KeyOfIterator, KeyOfMap, KeyOfMinimalistCollectionHolder, KeyOfMutableArray, KeyOfMutableMap, KeyOfMutableSet, KeyOfMutableWeakMap, KeyOfMutableWeakSet, KeyOfSet, KeyOfTypedArray, KeyOfWeakMap, KeyOfWeakSet} from "./type/keyOf"

import {ArrayAsCollectionHolder}   from "./ArrayAsCollectionHolder"
import {DualValueCollectionHolder} from "./DualValueCollectionHolder"

/**
 * A utility class containing the members of the collections by either the framework or the JavaScript instances
 *
 * Note that attempting to create it will result in a {@link EvalError}
 * due to being a utility class and not a namespace.
 *
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array Array
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/TypedArray TypedArray
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set Set
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakSet WeakSet
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map Map
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap WeakMap
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator Iterator
 */
export class MembersConstants {

    //#region -------------------- Fields held --------------------

    static #MINIMALIST_COLLECTION_MEMBERS?: CollectionHolder<KeyOfMinimalistCollectionHolder>
    static #COLLECTION_MEMBERS?: CollectionHolder<KeyOfCollectionHolder>
    static #ARRAY_MEMBERS?: CollectionHolder<KeyOfArray>
    static #MUTABLE_ARRAY_MEMBERS?: CollectionHolder<KeyOfMutableArray>
    static #TYPED_ARRAY_MEMBERS?: CollectionHolder<KeyOfTypedArray>
    static #SET_MEMBERS?: CollectionHolder<KeyOfSet>
    static #MUTABLE_SET_MEMBERS?: CollectionHolder<KeyOfMutableSet>
    static #WEAK_SET_MEMBERS?: CollectionHolder<KeyOfWeakSet>
    static #MUTABLE_WEAK_SET_MEMBERS?: CollectionHolder<KeyOfMutableWeakSet>
    static #MAP_MEMBERS?: CollectionHolder<KeyOfMap>
    static #MUTABLE_MAP_MEMBERS?: CollectionHolder<KeyOfMutableMap>
    static #WEAK_MAP_MEMBERS?: CollectionHolder<KeyOfWeakMap>
    static #MUTABLE_WEAK_MAP_MEMBERS?: CollectionHolder<KeyOfMutableWeakMap>
    static #ITERATOR_MEMBERS?: CollectionHolder<KeyOfIterator>
    static #COLLECTION_ITERATOR_MEMBERS?: CollectionHolder<KeyOfCollectionIterator>

    //#endregion -------------------- Fields held --------------------

    /** @throws {EvalError} The class cannot be created */
    private constructor() {
        throw new EvalError("The utility class “MembersConstants” cannot be created.",)
    }


    //#region -------------------- Minimalist collection holder --------------------

    /** Every method applicable to a {@link MinimalistCollectionHolder} */
    public static get MINIMALIST_COLLECTION_MEMBERS(): CollectionHolder<KeyOfMinimalistCollectionHolder> {
        return MembersConstants.#MINIMALIST_COLLECTION_MEMBERS ??= Object.freeze(new DualValueCollectionHolder("size", "get",),)
    }

    //#endregion -------------------- Minimalist collection holder --------------------
    //#region -------------------- Collection holder --------------------

    /** Every method applicable to a {@link CollectionHolder} */
    public static get COLLECTION_MEMBERS(): CollectionHolder<KeyOfCollectionHolder> {
        return MembersConstants.#COLLECTION_MEMBERS ??= Object.freeze(new ArrayAsCollectionHolder<KeyOfCollectionHolder>([
            "size", "length", "count",
            "isEmpty", "isNotEmpty",
            "hasAtLeast1Element", "includesAtLeast1Element", "containsAtLeast1Element",
            "hasExactly1Element", "includesExactly1Element", "containsExactly1Element",
            "hasAtMost1Element", "includesAtMost1Element", "containsAtMost1Element",
            "hasAtLeast2Elements", "includesAtLeast2Elements", "containsAtLeast2Elements",
            "hasExactly2Elements", "includesExactly2Elements", "containsExactly2Elements",
            "hasAtMost2Elements", "includesAtMost2Elements", "containsAtMost2Elements",
            "get", "at", "elementAt",
            "getFirst",
            "getLast",
            "getOrElse", "atOrElse", "elementAtOrElse",
            "getFirstOrElse",
            "getLastOrElse",
            "getOrNull", "atOrNull", "elementAtOrNull",
            "getFirstOrNull",
            "getLastOrNull",
            "first", "firstOrNull", "firstIndexed", "firstIndexedOrNull",
            "last", "lastOrNull", "lastIndexed", "lastIndexedOrNull",
            "findFirst", "find",
            "findFirstOrNull","findOrNull",
            "findFirstIndexed", "findIndexed",
            "findFirstIndexedOrNull", "findIndexedOrNull",
            "findLast",
            "findLastOrNull",
            "findLastIndexed",
            "findLastIndexedOrNull",
            "firstIndexOf", "indexOf",
            "firstIndexOfOrNull", "indexOfOrNull",
            "lastIndexOf",
            "lastIndexOfOrNull",
            "indexOfFirst", "findIndex", "findFirstIndex",
            "indexOfFirstOrNull", "findIndexOrNull", "findFirstIndexOrNull",
            "indexOfFirstIndexed", "findIndexIndexed", "findFirstIndexIndexed",
            "indexOfFirstIndexedOrNull", "findIndexIndexedOrNull", "findFirstIndexIndexedOrNull",
            "indexOfLast", "findLastIndex",
            "indexOfLastOrNull", "findLastIndexOrNull",
            "indexOfLastIndexed", "findLastIndexIndexed",
            "indexOfLastIndexedOrNull", "findLastIndexIndexedOrNull",
            "all", "every",
            "any", "some",
            "none",
            "hasNull", "includesNull", "containsNull",
            "hasNoNulls", "includesNoNulls", "containsNoNulls",
            "hasDuplicate", "includesDuplicate", "containsDuplicate",
            "hasNoDuplicates", "includesNoDuplicates", "containsNoDuplicates",
            "has", "includes", "contains",
            "hasNot", "includesNot", "containsNot",
            "hasOne", "includesOne", "containsOne",
            "hasNotOne", "includesNotOne", "containsNotOne",
            "hasAll", "includesAll", "containsAll",
            "hasNotAll", "includesNotAll", "containsNotAll",
            "requireNoNulls",
            "filter",
            "filterIndexed",
            "filterNot",
            "filterNotIndexed",
            "filterNotNull",
            "slice",
            "take", "limit",
            "takeWhile", "limitWhile",
            "takeWhileIndexed", "limitWhileIndexed",
            "takeLast", "limitLast",
            "takeLastWhile", "limitLastWhile",
            "takeLastWhileIndexed", "limitLastWhileIndexed",
            "drop", "skip",
            "dropWhile", "skipWhile",
            "dropWhileIndexed", "skipWhileIndexed",
            "dropLast", "skipLast",
            "dropLastWhile", "skipLastWhile",
            "dropLastWhileIndexed", "skipLastWhileIndexed",
            "map",
            "mapIndexed",
            "mapNotNull",
            "mapNotNullIndexed",
            "forEach",
            "forEachIndexed",
            "onEach",
            "onEachIndexed",
            "toReverse", "toReversed", "reversed",
            Symbol.iterator,
            Symbol.toStringTag,
            "toIterator",
            "toArray",
            "toMutableArray",
            "toSet",
            "toMutableSet",
            "toMap",
            "toMutableMap",
            "toString",
            "toLocaleString",
            "toLowerCaseString",
            "toLocaleLowerCaseString",
            "toUpperCaseString",
            "toLocaleUpperCaseString",
            "joinToString", 'join',
        ] as const,),)
    }

    //#endregion -------------------- Collection holder --------------------
    //#region -------------------- Array --------------------

    /**
     * Every method applicable to an {@link ReadonlyArray Array}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array
     */
    public static get ARRAY_MEMBERS(): CollectionHolder<KeyOfArray> {
        return MembersConstants.#ARRAY_MEMBERS ??= Object.freeze(new ArrayAsCollectionHolder<KeyOfArray>([
            "length",
            "at",
            "indexOf", "lastIndexOf",
            "includes",
            "every", "some", "with",
            "join",
            "filter",
            "find", "findLast",
            "findIndex", "findLastIndex",
            "concat",
            "reduce", "reduceRight",
            "flat", "flatMap",
            "map",
            "forEach",
            "keys", "values", "entries",
            Symbol.iterator,
            Symbol.unscopables,
            "toReversed",
            "toSorted",
            "slice", "toSpliced",
            "toString", "toLocaleString",
        ] as const,),)
    }

    /**
     * Every method applicable to an {@link Array MutableArray}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array
     */
    public static get MUTABLE_ARRAY_MEMBERS(): CollectionHolder<KeyOfMutableArray> {
        return MembersConstants.#MUTABLE_ARRAY_MEMBERS ??= Object.freeze(new ArrayAsCollectionHolder<KeyOfMutableArray>([
            "length",
            "at", "push", "pop",
            "shift", "unshift",
            "indexOf", "lastIndexOf",
            "includes",
            "every", "some", "with",
            "join",
            "filter",
            "find", "findLast",
            "findIndex", "findLastIndex",
            "concat",
            "reduce", "reduceRight",
            "fill",
            "flat", "flatMap",
            "map",
            "forEach",
            "keys", "values", "entries",
            Symbol.iterator,
            Symbol.unscopables,
            "copyWithin", "with",
            "reverse", "toReversed",
            "sort", "toSorted",
            "slice", "splice", "toSpliced",
            "toString", "toLocaleString",
        ] as const,),)
    }

    //#endregion -------------------- Array --------------------
    //#region -------------------- Typed array --------------------

    /**
     * Every method applicable to a {@link TypedArray}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/TypedArray
     */
    public static get TYPED_ARRAY_MEMBERS(): CollectionHolder<KeyOfTypedArray> {
        return MembersConstants.#TYPED_ARRAY_MEMBERS ??= Object.freeze(new ArrayAsCollectionHolder<KeyOfTypedArray>([
            "length",
            "at", "set",
            "buffer",
            "BYTES_PER_ELEMENT", "byteLength", "byteOffset",
            "indexOf", "lastIndexOf",
            "includes",
            "every", "some", "with",
            "join",
            "filter",
            "find", "findLast",
            "findIndex", "findLastIndex",
            "reduce", "reduceRight",
            "map",
            "forEach",
            "keys", "values", "entries",
            Symbol.iterator,
            "copyWithin",
            "fill",
            "reverse", "toReversed",
            "sort", "toSorted",
            "slice",
            "subarray",
            "valueOf",
            "toString", "toLocaleString",
        ] as const,),)
    }

    //#endregion -------------------- Typed array --------------------
    //#region -------------------- Set --------------------

    /**
     * Every method applicable to an {@link ReadonlySet Set}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set
     */
    public static get SET_MEMBERS(): CollectionHolder<KeyOfSet> {
        return MembersConstants.#SET_MEMBERS ??= Object.freeze(new ArrayAsCollectionHolder<KeyOfSet>([
            "size",
            "has",
            "forEach",
            "keys", "values", "entries",
            "union", "intersection",
            "difference", "symmetricDifference",
            "isSubsetOf", "isSupersetOf",
            "isDisjointFrom",
            Symbol.iterator,
            // Symbol.toStringTag,
        ] as const,),)
    }

    /**
     * Every method applicable to an {@link Set MutableSet}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set
     */
    public static get MUTABLE_SET_MEMBERS(): CollectionHolder<KeyOfMutableSet> {
        return MembersConstants.#MUTABLE_SET_MEMBERS ??= Object.freeze(new ArrayAsCollectionHolder<KeyOfMutableSet>([
            "size",
            "clear",
            "add", "delete",
            "has",
            "forEach",
            "keys", "values", "entries",
            "union", "intersection",
            "difference", "symmetricDifference",
            "isSubsetOf", "isSupersetOf",
            "isDisjointFrom",
            Symbol.iterator,
            Symbol.toStringTag,
        ] as const,),)
    }

    //#endregion -------------------- Set --------------------
    //#region -------------------- Weak set --------------------

    /**
     * Every method applicable to an immutable {@link WeakSet}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakSet
     */
    public static get WEAK_SET_MEMBERS(): CollectionHolder<KeyOfWeakSet> {
        return MembersConstants.#WEAK_SET_MEMBERS ??= Object.freeze(new DualValueCollectionHolder(
            "has",
            Symbol.toStringTag,
        ),)
    }

    /**
     * Every method applicable to a mutable {@link WeakSet}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakSet
     */
    public static get MUTABLE_WEAK_SET_MEMBERS(): CollectionHolder<KeyOfMutableWeakSet> {
        return MembersConstants.#MUTABLE_WEAK_SET_MEMBERS ??= Object.freeze(new ArrayAsCollectionHolder<KeyOfMutableWeakSet>([
            "add", "delete",
            "has",
            Symbol.toStringTag,
        ] as const,),)
    }

    //#endregion -------------------- Weak set --------------------
    //#region -------------------- Map --------------------

    /**
     * Every method applicable to an {@link ReadonlyMap Map}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map
     */
    public static get MAP_MEMBERS(): CollectionHolder<KeyOfMap> {
        return MembersConstants.#MAP_MEMBERS ??= Object.freeze(new ArrayAsCollectionHolder<KeyOfMap>([
            "size",
            "get",
            "has",
            "forEach",
            "keys", "values", "entries",
            Symbol.iterator,
            // Symbol.toStringTag,
        ] as const,),)
    }

    /**
     * Every method applicable to an {@link Map MutableMap}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map
     */
    public static get MUTABLE_MAP_MEMBERS(): CollectionHolder<KeyOfMutableMap> {
        return MembersConstants.#MUTABLE_MAP_MEMBERS ??= Object.freeze(new ArrayAsCollectionHolder<KeyOfMutableMap>([
            "size",
            "get",
            "set", "delete",
            "clear",
            "has",
            "forEach",
            "keys", "values", "entries",
            Symbol.iterator,
            Symbol.toStringTag,
        ] as const,),)
    }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Weak map --------------------

    /**
     * Every method applicable to an immutable {@link WeakMap}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap
     */
    public static get WEAK_MAP_MEMBERS(): CollectionHolder<KeyOfWeakMap> {
        return MembersConstants.#WEAK_MAP_MEMBERS ??= Object.freeze(new ArrayAsCollectionHolder<KeyOfWeakMap>([
            "get",
            "has",
            Symbol.toStringTag,
        ] as const,),)
    }

    /**
     * Every method applicable to a mutable {@link WeakMap}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap
     */
    public static get MUTABLE_WEAK_MAP_MEMBERS(): CollectionHolder<KeyOfMutableWeakMap> {
        return MembersConstants.#MUTABLE_WEAK_MAP_MEMBERS ??= Object.freeze(new ArrayAsCollectionHolder<KeyOfMutableWeakMap>([
            "get",
            "set", "delete",
            "has",
            Symbol.toStringTag,
        ] as const,),)
    }

    //#endregion -------------------- Weak map --------------------
    //#region -------------------- Iterator --------------------

    /**
     * Every method applicable to an {@link Iterator}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator
     */
    public static get ITERATOR_MEMBERS(): CollectionHolder<KeyOfIterator> {
        return MembersConstants.#ITERATOR_MEMBERS ??= Object.freeze(new ArrayAsCollectionHolder<KeyOfIterator>([
            "next",
            "every", "some",
            "find", "filter", "reduce",
            "take", "drop",
            "forEach",
            "map", "flatMap",
            "toArray",
            Symbol.iterator, Symbol.toStringTag,
        ],),)
    }

    //#endregion -------------------- Iterator --------------------
    //#region -------------------- Collection iterator --------------------

    /** Every method applicable to a {@link CollectionIterator} */
    public static get COLLECTION_ITERATOR_MEMBERS(): CollectionHolder<KeyOfCollectionIterator> {
        return MembersConstants.#COLLECTION_ITERATOR_MEMBERS ??= Object.freeze(new ArrayAsCollectionHolder<KeyOfCollectionIterator>([
            "size", "length", "count",
            "isEmpty",
            "isNotEmpty", "hasAtLeast1Element", "includesAtLeast1Element", "containsAtLeast1Element",
            "hasExactly1Element", "includesExactly1Element", "containsExactly1Element",
            "hasAtMost1Element", "includesAtMost1Element", "containsAtMost1Element",
            "hasAtLeast2Elements", "includesAtLeast2Elements", "containsAtLeast2Elements",
            "hasExactly2Elements", "includesExactly2Elements", "containsExactly2Elements",
            "hasAtMost2Elements", "includesAtMost2Elements", "containsAtMost2Elements",
            "currentIndex", "index",
            "hasNext",
            "nextIndex",
            "nextValue",
            "next",
            "hasPrevious",
            "previousIndex",
            "previousValue",
            "previous",
            "reset",
            "forEach",
            "forEachIndexed",
            Symbol.iterator,
            Symbol.toStringTag,
        ],),)
    }

    //#endregion -------------------- Collection iterator --------------------

}

export interface MembersConstants {

    /**
     * @param args Any possible arguments sent
     * @throws {EvalError} The class cannot be created
     */
    new(...args: Array<unknown>): never

}
