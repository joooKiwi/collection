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

import type {Lazy}                                                       from "@joookiwi/lazy"
import type {EmptyArray, EmptyMap, EmptySet, EmptyWeakMap, EmptyWeakSet} from "@joookiwi/type"
import {lazyOf}                                                          from "@joookiwi/lazy"

import type {CollectionHolder}                                                                                                                                                                              from "./CollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                                                                                    from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                         from "./iterator/CollectionIterator"
import type {KeyOfArray, KeyOfCollectionHolder, KeyOfCollectionIterator, KeyOfIterator, KeyOfMap, KeyOfMinimalistCollectionHolder, KeyOfMutableArray, KeyOfMutableMap, KeyOfMutableSet, KeyOfMutableWeakMap, KeyOfMutableWeakSet, KeyOfSet, KeyOfTypedArray, KeyOfWeakMap, KeyOfWeakSet} from "./type/keyOf"

import {EmptyCollectionHolder}                  from "./EmptyCollectionHolder"
import type {GenericCollectionHolder}           from "./GenericCollectionHolder"
import type {GenericMinimalistCollectionHolder} from "./GenericMinimalistCollectionHolder"
import type {LazyGenericCollectionHolder}       from "./LazyGenericCollectionHolder"
import {EmptyCollectionIterator}                from "./iterator/EmptyCollectionIterator"
import {EmptyCollectionHandler}                 from "./handler/EmptyCollectionHandler"

/**
 * A utility class containing every field used by any {@link CollectionHolder} instances.
 *
 * Note that attempting to create it will result in a {@link EvalError}
 * due to being a utility class and not a namespace.
 */
export class CollectionConstants {

    //#region -------------------- Thrown constructor --------------------

    /** @throws {EvalError} The class cannot be created */
    private constructor() {
        throw new EvalError("The utility class “CollectionConstants” cannot be created.",)
    }

    //#endregion -------------------- Thrown constructor --------------------
    //#region -------------------- Fields held --------------------

    static #EMPTY_COLLECTION_HOLDER?: EmptyCollectionHolder
    static #LAZY_EMPTY_COLLECTION_HOLDER?: Lazy<EmptyCollectionHolder>
    static #EMPTY_COLLECTION_HANDLER?: EmptyCollectionHandler
    static #LAZY_EMPTY_COLLECTION_HANDLER?: Lazy<EmptyCollectionHandler>
    static #EMPTY_COLLECTION_ITERATOR?: EmptyCollectionIterator
    static #LAZY_EMPTY_COLLECTION_ITERATOR?: Lazy<EmptyCollectionIterator>

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

    static #EmptyCollectionHolder?: typeof EmptyCollectionHolder
    static #GenericCollectionHolder?: typeof GenericCollectionHolder
    static #GenericMinimalistCollectionHolder?: typeof GenericMinimalistCollectionHolder
    static #LazyGenericCollectionHolder?: typeof LazyGenericCollectionHolder

    //#endregion -------------------- Fields held --------------------

    //#region -------------------- Empty references --------------------

    /** An {@link EmptyCollectionHolder} instance */
    public static get EMPTY_COLLECTION_HOLDER(): EmptyCollectionHolder {
        return CollectionConstants.#EMPTY_COLLECTION_HOLDER ??= Object.freeze(EmptyCollectionHolder.get,)
    }

    /** An {@link EmptyCollectionHolder} instance in a {@link Lazy} */
    public static get LAZY_EMPTY_COLLECTION_HOLDER(): Lazy<EmptyCollectionHolder> {
        return this.#LAZY_EMPTY_COLLECTION_HOLDER ??= lazyOf(CollectionConstants.EMPTY_COLLECTION_HOLDER,)
    }


    /** An {@link EmptyCollectionHandler} instance */
    public static get EMPTY_COLLECTION_HANDLER(): EmptyCollectionHandler {
        return CollectionConstants.#EMPTY_COLLECTION_HANDLER ??= Object.freeze(EmptyCollectionHandler.get,)
    }

    /** An {@link EmptyCollectionHandler} instance in a {@link Lazy} */
    public static get LAZY_EMPTY_COLLECTION_HANDLER(): Lazy<EmptyCollectionHandler> {
        return this.#LAZY_EMPTY_COLLECTION_HANDLER ??= lazyOf(CollectionConstants.EMPTY_COLLECTION_HANDLER,)
    }


    /** An {@link EmptyCollectionIterator} instance */
    public static get EMPTY_COLLECTION_ITERATOR(): EmptyCollectionIterator {
        return CollectionConstants.#EMPTY_COLLECTION_ITERATOR ??= Object.freeze(EmptyCollectionIterator.get,)
    }

    /** An {@link EmptyCollectionIterator} instance in a {@link Lazy} */
    public static get LAZY_EMPTY_COLLECTION_ITERATOR(): Lazy<EmptyCollectionIterator> {
        return this.#LAZY_EMPTY_COLLECTION_ITERATOR ??= lazyOf(CollectionConstants.EMPTY_COLLECTION_ITERATOR,)
    }

    //#endregion -------------------- Empty references --------------------
    //#region -------------------- Members references --------------------

    //#region -------------------- Members references (minimalist collection holder) --------------------

    /** Every method applicable to a {@link MinimalistCollectionHolder} */
    public static get MINIMALIST_COLLECTION_MEMBERS(): CollectionHolder<KeyOfMinimalistCollectionHolder> {
        return CollectionConstants.#MINIMALIST_COLLECTION_MEMBERS ??= Object.freeze(new CollectionConstants.GenericCollectionHolder(["size", "get",],),)
    }

    //#endregion -------------------- Members references (minimalist collection holder) --------------------
    //#region -------------------- Members references (collection holder) --------------------

    /** Every method applicable to a {@link CollectionHolder} */
    public static get COLLECTION_MEMBERS(): CollectionHolder<KeyOfCollectionHolder> {
        return CollectionConstants.#COLLECTION_MEMBERS ??= Object.freeze(new CollectionConstants.GenericCollectionHolder([
            "size", "length", "count",
            "isEmpty", "isNotEmpty",
            "get", "getFirst", "getLast", "at", "elementAt",
            "getOrElse", "atOrElse", "elementAtOrElse",
            "getOrNull", "getFirstOrNull", "getLastOrNull", "atOrNull", "elementAtOrNull",
            "first", "firstIndexed", "firstOrNull", "firstIndexedOrNull",
            "last", "lastIndexed", "lastOrNull", "lastIndexedOrNull",
            "find", "findOrNull", "findIndexed", "findIndexedOrNull",
            "findFirst", "findFirstOrNull", "findFirstIndexed", "findFirstIndexedOrNull",
            "findLast", "findLastOrNull", "findLastIndexed", "findLastIndexedOrNull",
            "indexOf", "indexOfOrNull",
            "firstIndexOf", "firstIndexOfOrNull",
            "lastIndexOf", "lastIndexOfOrNull",
            "indexOfFirst", "indexOfFirstOrNull", "indexOfFirstIndexed", "indexOfFirstIndexedOrNull",
            "findIndex", "findIndexOrNull", "findIndexIndexed", "findIndexIndexedOrNull",
            "findFirstIndex", "findFirstIndexOrNull", "findFirstIndexIndexed", "findFirstIndexIndexedOrNull",
            "findFirstIndex", "findFirstIndexIndexed",
            "indexOfLast", "indexOfLastOrNull", "indexOfLastIndexed", "indexOfLastIndexedOrNull",
            "findLastIndex", "findLastIndexOrNull", "findLastIndexIndexed", "findLastIndexIndexedOrNull",
            "all", "every",
            "any", "some",
            "none",
            "hasNull", "includesNull", "containsNull",
            "hasDuplicate", "includesDuplicate", "containsDuplicate",
            "has", "includes", "contains",
            "hasNot", "includesNot", "containsNot",
            "hasOne", "includesOne", "containsOne",
            "hasNotOne", "includesNotOne", "containsNotOne",
            "hasAll", "includesAll", "containsAll",
            "hasNotAll", "includesNotAll", "containsNotAll",
            "requireNoNulls",
            "filter", "filterIndexed", "filterNot", "filterNotIndexed", "filterNotNull",
            "slice",
            "take", "takeWhile", "takeWhileIndexed",
            "limit", "limitWhile", "limitWhileIndexed",
            "takeLast", "takeLastWhile", "takeLastWhileIndexed",
            "limitLast", "limitLastWhile", "limitLastWhileIndexed",
            "drop", "dropWhile", "dropWhileIndexed",
            "skip", "skipWhile", "skipWhileIndexed",
            "dropLast", "dropLastWhile", "dropLastWhileIndexed",
            "skipLast", "skipLastWhile", "skipLastWhileIndexed",
            "map", "mapIndexed",
            "mapNotNull", "mapNotNullIndexed",
            "forEach", "forEachIndexed",
            "onEach", "onEachIndexed",
            "toReverse", "toReversed", "reversed",
            Symbol.iterator, Symbol.toStringTag,
            "toIterator",
            "toArray", "toMutableArray",
            "toSet", "toMutableSet",
            "toMap", "toMutableMap",
            "toString", "toLocaleString",
            "toLowerCaseString", "toLocaleLowerCaseString",
            "toUpperCaseString", "toLocaleUpperCaseString",
            "joinToString", 'join',
        ] as const,),)
    }

    //#endregion -------------------- Members references (collection holder) --------------------
    //#region -------------------- Members references (array) --------------------

    /** Every method applicable to an {@link ReadonlyArray Array} */
    public static get ARRAY_MEMBERS(): CollectionHolder<KeyOfArray> {
        return CollectionConstants.#ARRAY_MEMBERS ??= Object.freeze(new CollectionConstants.GenericCollectionHolder([
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


    /** Every method applicable to an {@link Array MutableArray} */
    public static get MUTABLE_ARRAY_MEMBERS(): CollectionHolder<KeyOfMutableArray> {
        return CollectionConstants.#MUTABLE_ARRAY_MEMBERS ??= Object.freeze(new CollectionConstants.GenericCollectionHolder([
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
            "toSorted",
            "slice", "splice", "toSpliced",
            "toString", "toLocaleString",
        ] as const,),)
    }

    //#endregion -------------------- Members references (array) --------------------
    //#region -------------------- Members references (typed array) --------------------

    /** Every method applicable to a {@link TypedArray} */
    public static get TYPED_ARRAY_MEMBERS(): CollectionHolder<KeyOfTypedArray> {
        return CollectionConstants.#TYPED_ARRAY_MEMBERS ??= Object.freeze(new CollectionConstants.GenericCollectionHolder([
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

    //#endregion -------------------- Members references (typed array) --------------------
    //#region -------------------- Members references (set) --------------------

    /** Every method applicable to an {@link ReadonlySet Set} */
    public static get SET_MEMBERS(): CollectionHolder<KeyOfSet> {
        return CollectionConstants.#SET_MEMBERS ??= Object.freeze(new CollectionConstants.GenericCollectionHolder([
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

    /** Every method applicable to an {@link Set MutableSet} */
    public static get MUTABLE_SET_MEMBERS(): CollectionHolder<KeyOfMutableSet> {
        return CollectionConstants.#MUTABLE_SET_MEMBERS ??= Object.freeze(new CollectionConstants.GenericCollectionHolder([
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

    //#endregion -------------------- Members references (set) --------------------
    //#region -------------------- Members references (weak set) --------------------

    /** Every method applicable to an immutable {@link WeakSet} */
    public static get WEAK_SET_MEMBERS(): CollectionHolder<KeyOfWeakSet> {
        return CollectionConstants.#WEAK_SET_MEMBERS ??= Object.freeze(new CollectionConstants.GenericCollectionHolder([
            "has",
            Symbol.toStringTag,
        ] as const,),)
    }

    /** Every method applicable to a mutable {@link WeakSet} */
    public static get MUTABLE_WEAK_SET_MEMBERS(): CollectionHolder<KeyOfMutableWeakSet> {
        return CollectionConstants.#MUTABLE_WEAK_SET_MEMBERS ??= Object.freeze(new CollectionConstants.GenericCollectionHolder([
            "add", "delete",
            "has",
            Symbol.toStringTag,
        ] as const,),)
    }

    //#endregion -------------------- Members references (weak set) --------------------
    //#region -------------------- Members references (map) --------------------

    /** Every method applicable to an {@link ReadonlyMap Map} */
    public static get MAP_MEMBERS(): CollectionHolder<KeyOfMap> {
        return CollectionConstants.#MAP_MEMBERS ??= Object.freeze(new CollectionConstants.GenericCollectionHolder([
            "size",
            "get",
            "has",
            "forEach",
            "keys", "values", "entries",
            Symbol.iterator,
            // Symbol.toStringTag,
        ] as const,),)
    }

    /** Every method applicable to an {@link Map MutableMap} */
    public static get MUTABLE_MAP_MEMBERS(): CollectionHolder<KeyOfMutableMap> {
        return CollectionConstants.#MUTABLE_MAP_MEMBERS ??= Object.freeze(new CollectionConstants.GenericCollectionHolder([
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

    //#endregion -------------------- Members references (map) --------------------
    //#region -------------------- Members references (weak map) --------------------

    /** Every method applicable to an immutable {@link WeakMap} */
    public static get WEAK_MAP_MEMBERS(): CollectionHolder<KeyOfWeakMap> {
        return CollectionConstants.#WEAK_MAP_MEMBERS ??= Object.freeze(new CollectionConstants.GenericCollectionHolder([
            "get",
            "has",
            Symbol.toStringTag,
        ] as const,),)
    }

    /** Every method applicable to a mutable {@link WeakMap} */
    public static get MUTABLE_WEAK_MAP_MEMBERS(): CollectionHolder<KeyOfMutableWeakMap> {
        return CollectionConstants.#MUTABLE_WEAK_MAP_MEMBERS ??= Object.freeze(new CollectionConstants.GenericCollectionHolder([
            "get",
            "set", "delete",
            "has",
            Symbol.toStringTag,
        ] as const,),)
    }

    //#endregion -------------------- Members references (weak map) --------------------
    //#region -------------------- Members references (iterator) --------------------

    /**
     * Every method applicable to an {@link Iterator}
     *
     * @note Currently, it only have "next", but it will eventually add the upcoming supported methods
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator#browser_compatibility
     */
    public static get ITERATOR_MEMBERS(): CollectionHolder<KeyOfIterator> {
        return CollectionConstants.#ITERATOR_MEMBERS ??= Object.freeze(new CollectionConstants.GenericCollectionHolder([
            "next",
        ] as const,),)
    }

    // /**
    //  * Every method applicable to an {@link IteratorObject}
    //  *
    //  * @note This currently have unsupported methods on iOS, WebView, Deno and Node according to Mdn
    //  * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator#browser_compatibility
    //  */
    // public static get ITERATOR_MEMBERS(): CollectionHolder<KeyOfIterator> {
    //     return CollectionConstants.#ITERATOR_MEMBERS ??= Object.freeze(new CollectionConstants.GenericCollectionHolder([
    //         "next",
    //         "every", "some",
    //         "find", "filter", "reduce",
    //         "take", "drop",
    //         "forEach",
    //         "map", "flatMap",
    //         "toArray",
    //         Symbol.iterator, Symbol.toStringTag,
    //     ] as const,),)
    // }

    //#endregion -------------------- Members references (iterator) --------------------
    //#region -------------------- Members references (collection iterator) --------------------

    /** Every method applicable to a {@link CollectionIterator} */
    public static get COLLECTION_ITERATOR_MEMBERS(): CollectionHolder<KeyOfCollectionIterator> {
        return CollectionConstants.#COLLECTION_ITERATOR_MEMBERS ??= Object.freeze(new CollectionConstants.GenericCollectionHolder([
            "size", "length", "count",
            "isEmpty", "isNotEmpty",
            "currentIndex", "index",
            "nextIndex", "previousIndex",
            "hasNext", "hasPrevious",
            "next", "previous",
            "nextValue", "previousValue",
            "reset",
            "forEach", "forEachIndexed",
            Symbol.iterator, Symbol.toStringTag,
        ] as const,),)
    }

    //#endregion -------------------- Members references (collection iterator) --------------------

    //#endregion -------------------- Members references --------------------
    //#region -------------------- Constructor references --------------------

    /** The {@link Object.constructor constructor} reference of an {@link EmptyCollectionHolder} */
    public static get EmptyCollectionHolder(): typeof EmptyCollectionHolder {
        return CollectionConstants.#EmptyCollectionHolder ??= EmptyCollectionHolder
    }

    /** The {@link Object.constructor constructor} reference of a {@link GenericCollectionHolder} */
    public static get GenericCollectionHolder(): typeof GenericCollectionHolder {
        return CollectionConstants.#GenericCollectionHolder ??= require("./GenericCollectionHolder",).GenericCollectionHolder
    }

    /** The {@link Object.constructor constructor} reference of a {@link GenericMinimalistCollectionHolder} */
    public static get GenericMinimalistCollectionHolder(): typeof GenericMinimalistCollectionHolder {
        return CollectionConstants.#GenericMinimalistCollectionHolder ??= require("./GenericMinimalistCollectionHolder",).GenericMinimalistCollectionHolder
    }

    /** The {@link Object.constructor constructor} reference of a {@link LazyGenericCollectionHolder} */
    public static get LazyGenericCollectionHolder(): typeof LazyGenericCollectionHolder {
        return CollectionConstants.#LazyGenericCollectionHolder ??= require("./LazyGenericCollectionHolder",).LazyGenericCollectionHolder
    }

    //#endregion -------------------- Constructor references --------------------

}

export namespace CollectionConstants {

    //#region -------------------- Empty references --------------------

    /** An empty {@link ReadonlyArray array} */
    export const EMPTY_ARRAY = Object.freeze([],) as EmptyArray
    /** An empty {@link ReadonlySet set} */
    export const EMPTY_SET = Object.freeze(new Set<never>(),) as EmptySet
    /** An empty {@link WeakSet weak set} */
    export const EMPTY_WEAK_SET = Object.freeze(new WeakSet(),) as EmptyWeakSet<never>
    /** An empty {@link ReadonlyMap map} */
    export const EMPTY_MAP = Object.freeze(new Map<never, never>(),) as EmptyMap<never>
    /** An empty {@link WeakSet weak set} */
    export const EMPTY_WEAK_MAP = Object.freeze(new WeakMap(),) as EmptyWeakMap<never>

    //#endregion -------------------- Empty references --------------------
    //#region -------------------- Default references --------------------

    /** The default value for the separator {@link String string} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    export const DEFAULT_JOIN_SEPARATOR = ", "
    /** The default value for the prefix {@link String character} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    export const DEFAULT_JOIN_PREFIX = '['
    /** The default value for the truncated {@link String character} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    export const DEFAULT_JOIN_TRUNCATED = '…'
    /** The default value for the postfix {@link String character} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    export const DEFAULT_JOIN_POSTFIX = ']'
    /** The default {@link String} value for an empty {@link CollectionHolder} */
    export const DEFAULT_EMPTY_COLLECTION = "[]"

    //#endregion -------------------- Default references --------------------
    //#region -------------------- Messages --------------------

    /**
     * The default message of a {@link NullCollectionException} when its message received is <code>null</code>
     *
     * @see NullCollectionException.DEFAULT_MESSAGE
     */
    export const NULL_COLLECTION_MESSAGE = "Null collection. No element at any index could be found since it is null."
    /**
     * The default message of an {@link EmptyCollectionException} when its message received is <code>null</code>
     *
     * @see EmptyCollectionException.DEFAULT_MESSAGE
     */
    export const EMPTY_COLLECTION_MESSAGE = "Empty collection. No element at any index could be found since it it empty."

    /**
     * The message when {@link CollectionIterator.previousValue} is not present
     *
     * @see NoElementFoundInCollectionException.AT_THE_START_MESSAGE
     */
    export const ITERATOR_IS_AT_THE_START_MESSAGE = "No element found. The collection iterator is at or before the start of the line."
    /**
     * The message when {@link CollectionIterator.nextValue} is not present
     *
     * @see NoElementFoundInCollectionException.AT_THE_END_MESSAGE
     */
    export const ITERATOR_IS_AT_THE_END_MESSAGE = "No element found. The collection iterator is at or after the end of the line."

    //#endregion -------------------- Messages --------------------
    //#region -------------------- Symbol.toString references --------------------

    /**
     * The {@link Symbol.toStringTag} of an {@link CollectionHolder}
     *
     * @uniqueJavascriptVariable
     */
    export const COLLECTION_HOLDER_TO_STRING_TAG = "CollectionHolder"
    /**
     * The {@link Symbol.toStringTag} of an {@link CollectionIterator}
     *
     * @uniqueJavascriptVariable
     */
    export const COLLECTION_ITERATOR_TO_STRING_TAG = "CollectionIterator"

    //#endregion -------------------- Symbol.toString references --------------------
    //#region -------------------- Symbol references --------------------

    /** The value before the first value in a {@link CollectionIterator} */
    export const BEFORE_FIRST_VALUE_IN_ITERATOR_SYMBOL = Symbol("Before first CollectionIterator value",)
    /** The value after the last value in a {@link CollectionIterator} */
    export const AFTER_LAST_VALUE_IN_ITERATOR_SYMBOL = Symbol("After last CollectionIterator value",)

    //#endregion -------------------- Symbol references --------------------

}

export interface CollectionConstants {

    /**
     * @param args Any possible arguments sent
     * @throws {EvalError} The class cannot be created
     */
    new(...args: readonly unknown[]): never

}
