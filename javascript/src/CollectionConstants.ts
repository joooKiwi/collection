/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {CollectionHolder} from "./CollectionHolder"

import {EmptyCollectionHolder} from "./EmptyCollectionHolder"

/**
 * A simple utility class containing every field used by any {@link CollectionHolder} instances.
 *
 * Note that attempting to create it will result in a {@link EvalError}
 * due to being a utility class and not a namespace.
 */
export class CollectionConstants {

    /** @throws {EvalError} The class cannot be created */
    private constructor() {
        throw new EvalError("The CollectionConstants cannot be created.",)
    }

    static #EMPTY_COLLECTION_HOLDER?: EmptyCollectionHolder

    /** A simple empty {@link ReadonlyArray array} */
    public static readonly EMPTY_ARRAY = Object.freeze([],)
    /** A simple empty {@link ReadonlySet set} */
    public static readonly EMPTY_SET = Object.freeze(new Set<never>(),)
    /** A simple empty {@link WeakSet weak set} */
    public static readonly EMPTY_WEAK_SET = Object.freeze(new WeakSet<never>(),)
    /** A simple empty {@link ReadonlyMap map} */
    public static readonly EMPTY_MAP = Object.freeze(new Map<never, never>(),)
    /** A simple {@link EmptyCollectionHolder} instance */
    public static get EMPTY_COLLECTION_HOLDER(): EmptyCollectionHolder {
        return CollectionConstants.#EMPTY_COLLECTION_HOLDER ??= Object.freeze(EmptyCollectionHolder.get,)
    }
    /** A simple empty {@link String} */
    public static readonly EMPTY_STRING = Object.freeze('',) as ''

    /** The default value for the separator {@link String string} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    public static readonly DEFAULT_JOIN_SEPARATOR = ", "
    /** The default value for the prefix {@link String character} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    public static readonly DEFAULT_JOIN_PREFIX = '['
    /** The default value for the truncated {@link String character} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    public static readonly DEFAULT_JOIN_TRUNCATED = '…'
    /** The default value for the postfix {@link String character} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    public static readonly DEFAULT_JOIN_POSTFIX = ']'

    /**
     * The simple {@link Symbol.toStringTag} of an {@link CollectionHolder}
     *
     * @uniqueJavascriptVariable
     */
    public static readonly COLLECTION_HOLDER_TO_STRING_TAG = "CollectionHolder"
    /** Every method applicable to a {@link CollectionHolder} */
    public static readonly EVERY_COLLECTION_METHODS = Object.freeze([
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
    ] as const satisfies readonly (keyof CollectionHolder | symbol)[],)

}
