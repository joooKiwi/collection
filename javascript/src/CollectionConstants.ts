/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {CollectionHolder} from "./CollectionHolder"

import {EmptyCollectionHolder} from "./EmptyCollectionHolder"

/** A simple class containing every field used by any {@link CollectionHolder} instances */
export namespace CollectionConstants {

    /** A simple empty {@link ReadonlyArray array} */
    export const EMPTY_ARRAY = Object.freeze([],)
    /** A simple empty {@link ReadonlySet set} */
    export const EMPTY_SET = Object.freeze(new Set<never>(),)
    /** A simple empty {@link WeakSet weak set} */
    export const EMPTY_WEAK_SET = Object.freeze(new WeakSet<never>(),)
    /** A simple empty {@link ReadonlyMap map} */
    export const EMPTY_MAP = Object.freeze(new Map<never, never>(),)
    export const EMPTY_COLLECTION_HOLDER = Object.freeze(EmptyCollectionHolder.get,) as EmptyCollectionHolder
    /** A simple empty {@link String} */
    export const EMPTY_STRING = Object.freeze('',) as ''

    /** The default value for the separator {@link String string} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    export const DEFAULT_JOIN_SEPARATOR = ", "
    /** The default value for the prefix {@link String character} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    export const DEFAULT_JOIN_PREFIX = '['
    /** The default value for the truncated {@link String character} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    export const DEFAULT_JOIN_TRUNCATED = '…'
    /** The default value for the postfix {@link String character} in the {@link CollectionHolder}{@link CollectionHolder.join join} method */
    export const DEFAULT_JOIN_POSTFIX = ']'

    /**
     * The simple {@link Symbol.toStringTag} of an {@link CollectionHolder}
     *
     * @uniqueJavascriptVariable
     */
    export const COLLECTION_HOLDER_TO_STRING_TAG = "CollectionHolder"
    /** Every method applicable to a {@link CollectionHolder} */
    export const EVERY_COLLECTION_METHODS = Object.freeze([
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
