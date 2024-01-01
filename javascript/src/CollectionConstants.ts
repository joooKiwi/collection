/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Lazy} from "@joookiwi/lazy"
import {lazyOf}    from "@joookiwi/lazy"

import type {CollectionHolder}           from "./CollectionHolder"
import type {MinimalistCollectionHolder} from "./MinimalistCollectionHolder"
import type {CollectionIterator}         from "./iterator/CollectionIterator"

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
        throw new EvalError("The CollectionConstants cannot be created.",)
    }

    //#endregion -------------------- Thrown constructor --------------------
    //#region -------------------- Fields held --------------------

    static #EMPTY_COLLECTION_HOLDER?: EmptyCollectionHolder
    static #LAZY_EMPTY_COLLECTION_HOLDER?: Lazy<EmptyCollectionHolder>
    static #EMPTY_COLLECTION_HANDLER?: EmptyCollectionHandler
    static #LAZY_EMPTY_COLLECTION_HANDLER?: Lazy<EmptyCollectionHandler>
    static #EMPTY_COLLECTION_ITERATOR?: EmptyCollectionIterator
    static #LAZY_EMPTY_COLLECTION_ITERATOR?: Lazy<EmptyCollectionIterator>

    static #EVERY_MINIMALIST_COLLECTION_METHODS?: CollectionHolder<keyof MinimalistCollectionHolder>
    static #EVERY_COLLECTION_METHODS?: CollectionHolder<keyof CollectionHolder>
    static #EVERY_ITERATOR_METHODS?: CollectionHolder<keyof CollectionIterator>

    static #EmptyCollectionHolder?: typeof EmptyCollectionHolder
    static #GenericCollectionHolder?: typeof GenericCollectionHolder
    static #GenericMinimalistCollectionHolder?: typeof GenericMinimalistCollectionHolder
    static #LazyGenericCollectionHolder?: typeof LazyGenericCollectionHolder

    //#endregion -------------------- Fields held --------------------

    //#region -------------------- Empty references --------------------

    /** An empty {@link ReadonlyArray array} */
    public static readonly EMPTY_ARRAY = Object.freeze([] as const,)
    /** An empty {@link ReadonlySet set} */
    public static readonly EMPTY_SET = Object.freeze(new Set<never>(),)
    /** An empty {@link WeakSet weak set} */
    public static readonly EMPTY_WEAK_SET = Object.freeze(new WeakSet<never>(),)
    /** An empty {@link ReadonlyMap map} */
    public static readonly EMPTY_MAP = Object.freeze(new Map<never, never>(),)


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

    /** An empty {@link String} */
    public static readonly EMPTY_STRING = Object.freeze('',) as ''

    //#endregion -------------------- Empty references --------------------
    //#region -------------------- Default references --------------------

    /** The default value for the separator {@link String string} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    public static readonly DEFAULT_JOIN_SEPARATOR = ", "
    /** The default value for the prefix {@link String character} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    public static readonly DEFAULT_JOIN_PREFIX = '['
    /** The default value for the truncated {@link String character} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    public static readonly DEFAULT_JOIN_TRUNCATED = '…'
    /** The default value for the postfix {@link String character} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    public static readonly DEFAULT_JOIN_POSTFIX = ']'
    /** The default {@link String} value for an empty {@link CollectionHolder} */
    public static readonly DEFAULT_EMPTY_COLLECTION = "[]"

    //#endregion -------------------- Default references --------------------
    //#region -------------------- Symbol.toString references --------------------

    /**
     * The {@link Symbol.toStringTag} of an {@link CollectionHolder}
     *
     * @uniqueJavascriptVariable
     */
    public static readonly COLLECTION_HOLDER_TO_STRING_TAG = "CollectionHolder"
    /**
     * The {@link Symbol.toStringTag} of an {@link CollectionIterator}
     *
     * @uniqueJavascriptVariable
     */
    public static readonly COLLECTION_ITERATOR_TO_STRING_TAG = "CollectionIterator"

    //#endregion -------------------- Symbol.toString references --------------------
    //#region -------------------- "Every methods" references --------------------

    /** Every method applicable to a {@link MinimalistCollectionHolder} */
    public static get EVERY_MINIMALIST_COLLECTION_METHODS(): CollectionHolder<keyof MinimalistCollectionHolder> {
        return CollectionConstants.#EVERY_MINIMALIST_COLLECTION_METHODS ??= Object.freeze(new CollectionConstants.GenericCollectionHolder(["size", "isEmpty", "get",] as const,),)
    }
    /** Every method applicable to a {@link CollectionHolder} */
    public static get EVERY_COLLECTION_METHODS(): CollectionHolder<keyof CollectionHolder> {
        return CollectionConstants.#EVERY_COLLECTION_METHODS ??= Object.freeze(new CollectionConstants.GenericCollectionHolder([
            "size", "length", "count",
            "isEmpty", "isNotEmpty",
            "hasNull", "includesNull", "containsNull",
            "get", "getOrElse", "getOrNull", "at", "atOrElse", "atOrNull",
            "indexOf", "lastIndexOf", "indexOfFirst", "indexOfFirstIndexed", "indexOfLast", "indexOfLastIndexed",
            "first", "firstOrNull",
            "last", "lastOrNull",
            "all", "any", "none",
            "hasOne", "includesOne", "containsOne", "hasAll", "includesAll", "containsAll",
            "join",
            "filter", "filterIndexed", "filterNot", "filterIndexedNot", "filterNotNull", "requireNoNulls",
            "find", "findIndexed", "findLast", "findLastIndexed",
            "map", "mapIndexed",
            "forEach", "forEachIndexed",
            Symbol.iterator, Symbol.toStringTag,
            "objectValuesMap",
            "toIterator",
            "toArray", "toMutableArray",
            "toSet", "toMutableSet",
            "toWeakSet", "toMutableWeakSet",
            "toMap", "toMutableMap",
            "toReversed",
            "toString", "toLocaleString",
        ] as const,),)
    }
    /** Every method applicable to a {@link CollectionIterator} */
    public static get EVERY_ITERATOR_METHODS(): CollectionHolder<keyof CollectionIterator> {
        return CollectionConstants.#EVERY_ITERATOR_METHODS ??= Object.freeze(new CollectionConstants.GenericCollectionHolder([
            "size", "length", "count",
            "index", "nextIndex", "previousIndex",
            "hasNext", "hasPrevious",
            "next", "previous",
            "nextValue", "previousValue",
            "forEach", "forEachIndexed",
            Symbol.iterator, Symbol.toStringTag,
        ] as const,),)
    }

    //#endregion -------------------- "Every methods" references --------------------
    //#region -------------------- Constructor references --------------------

    /** The {@link Object.constructor constructor} reference of an {@link EmptyCollectionHolder} */
    public static get EmptyCollectionHolder(): typeof EmptyCollectionHolder {
        return CollectionConstants.#EmptyCollectionHolder ??= EmptyCollectionHolder
    }

    /** The {@link Object.constructor constructor} reference of a {@link GenericCollectionHolder} */
    public static get GenericCollectionHolder(): typeof GenericCollectionHolder {
        return CollectionConstants.#GenericCollectionHolder ??= require("./GenericCollectionHolder").GenericCollectionHolder
    }


    /** The {@link Object.constructor constructor} reference of a {@link GenericMinimalistCollectionHolder} */
    public static get GenericMinimalistCollectionHolder(): typeof GenericMinimalistCollectionHolder {
        return CollectionConstants.#GenericMinimalistCollectionHolder ??= require("./GenericMinimalistCollectionHolder").GenericMinimalistCollectionHolder
    }

    /** The {@link Object.constructor constructor} reference of a {@link LazyGenericCollectionHolder} */
    public static get LazyGenericCollectionHolder(): typeof LazyGenericCollectionHolder {
        return CollectionConstants.#LazyGenericCollectionHolder ??= require("./LazyGenericCollectionHolder").LazyGenericCollectionHolder
    }

    //#endregion -------------------- Constructor references --------------------
    //#region -------------------- Symbol references --------------------

    /** The value before the first value in a {@link CollectionIterator} */
    public static readonly BEFORE_FIRST_VALUE_IN_ITERATOR_SYMBOL = Symbol("Before first CollectionIterator value",)
    /** The value after the last value in a {@link CollectionIterator} */
    public static readonly AFTER_LAST_VALUE_IN_ITERATOR_SYMBOL = Symbol("After last CollectionIterator value",)

    //#endregion -------------------- Symbol references --------------------

}
