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
import type {EmptyCollectionHolder}                                                                                                                                                                                                                                                      from "./EmptyCollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                 from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                         from "./iterator/CollectionIterator"
import type {EmptyCollectionIterator}                                                                                                                                                                                                                                                    from "./iterator/EmptyCollectionIterator"
import type {KeyOfArray, KeyOfCollectionHolder, KeyOfCollectionIterator, KeyOfIterator, KeyOfMap, KeyOfMinimalistCollectionHolder, KeyOfMutableArray, KeyOfMutableMap, KeyOfMutableSet, KeyOfMutableWeakMap, KeyOfMutableWeakSet, KeyOfSet, KeyOfTypedArray, KeyOfWeakMap, KeyOfWeakSet} from "./type/keyOf"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol}                                                                                                                                                                                       from "./type/symbol"

import {EmptyConstants}   from "./EmptyConstants"
import {MembersConstants} from "./MembersConstants"
import {SymbolConstants}  from "./SymbolConstants"

/**
 * A utility class containing every field used by any {@link CollectionHolder} instances.
 *
 * Note that attempting to create it will result in a {@link EvalError}
 * due to being a utility class and not a namespace.
 *
 * @see DefaultConstants
 * @see EmptyConstants
 * @see MembersConstants
 * @see MessageConstants
 * @see SymbolConstants
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array Array
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/TypedArray TypedArray
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set Set
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakSet WeakSet
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map Map
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap WeakMap
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator Iterator
 */
export class CollectionConstants {

    //#region -------------------- Thrown constructor --------------------

    /** @throws {EvalError} The class cannot be created */
    private constructor() {
        throw new EvalError("The utility class “CollectionConstants” cannot be created.",)
    }

    //#endregion -------------------- Thrown constructor --------------------

    //#region -------------------- Empty references --------------------

    /** An {@link EmptyCollectionHolder} instance */
    public static get EMPTY_COLLECTION_HOLDER(): EmptyCollectionHolder {
        return EmptyConstants.EMPTY_COLLECTION_HOLDER
    }

    /** An {@link EmptyCollectionIterator} instance */
    public static get EMPTY_COLLECTION_ITERATOR(): EmptyCollectionIterator {
        return EmptyConstants.EMPTY_COLLECTION_ITERATOR
    }

    //#endregion -------------------- Empty references --------------------
    //#region -------------------- Members references --------------------

    /** Every method applicable to a {@link MinimalistCollectionHolder} */
    public static get MINIMALIST_COLLECTION_MEMBERS(): CollectionHolder<KeyOfMinimalistCollectionHolder> {
        return MembersConstants.MINIMALIST_COLLECTION_MEMBERS
    }

    /** Every method applicable to a {@link CollectionHolder} */
    public static get COLLECTION_MEMBERS(): CollectionHolder<KeyOfCollectionHolder> {
        return MembersConstants.COLLECTION_MEMBERS
    }


    /**
     * Every method applicable to an {@link ReadonlyArray Array}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array
     */
    public static get ARRAY_MEMBERS(): CollectionHolder<KeyOfArray> {
        return MembersConstants.ARRAY_MEMBERS
    }

    /**
     * Every method applicable to an {@link Array MutableArray}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array
     */
    public static get MUTABLE_ARRAY_MEMBERS(): CollectionHolder<KeyOfMutableArray> {
        return MembersConstants.MUTABLE_ARRAY_MEMBERS
    }


    /**
     * Every method applicable to a {@link TypedArray}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/TypedArray
     */
    public static get TYPED_ARRAY_MEMBERS(): CollectionHolder<KeyOfTypedArray> {
        return MembersConstants.TYPED_ARRAY_MEMBERS
    }


    /**
     * Every method applicable to an {@link ReadonlySet Set}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set
     */
    public static get SET_MEMBERS(): CollectionHolder<KeyOfSet> {
        return MembersConstants.SET_MEMBERS
    }

    /**
     * Every method applicable to an {@link Set MutableSet}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set
     */
    public static get MUTABLE_SET_MEMBERS(): CollectionHolder<KeyOfMutableSet> {
        return MembersConstants.MUTABLE_SET_MEMBERS
    }


    /**
     * Every method applicable to an immutable {@link WeakSet}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakSet
     */
    public static get WEAK_SET_MEMBERS(): CollectionHolder<KeyOfWeakSet> {
        return MembersConstants.WEAK_SET_MEMBERS
    }

    /**
     * Every method applicable to a mutable {@link WeakSet}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakSet
     */
    public static get MUTABLE_WEAK_SET_MEMBERS(): CollectionHolder<KeyOfMutableWeakSet> {
        return MembersConstants.MUTABLE_WEAK_SET_MEMBERS
    }


    /**
     * Every method applicable to an {@link ReadonlyMap Map}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map
     */
    public static get MAP_MEMBERS(): CollectionHolder<KeyOfMap> {
        return MembersConstants.MAP_MEMBERS
    }

    /**
     * Every method applicable to an {@link Map MutableMap}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map
     */
    public static get MUTABLE_MAP_MEMBERS(): CollectionHolder<KeyOfMutableMap> {
        return MembersConstants.MUTABLE_MAP_MEMBERS
    }


    /**
     * Every method applicable to an immutable {@link WeakMap}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap
     */
    public static get WEAK_MAP_MEMBERS(): CollectionHolder<KeyOfWeakMap> {
        return MembersConstants.WEAK_MAP_MEMBERS
    }

    /**
     * Every method applicable to a mutable {@link WeakMap}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap
     */
    public static get MUTABLE_WEAK_MAP_MEMBERS(): CollectionHolder<KeyOfMutableWeakMap> {
        return MembersConstants.MUTABLE_WEAK_MAP_MEMBERS
    }


    /**
     * Every method applicable to an {@link Iterator}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator
     */
    public static get ITERATOR_MEMBERS(): CollectionHolder<KeyOfIterator> {
        return MembersConstants.ITERATOR_MEMBERS
    }


    /** Every method applicable to a {@link CollectionIterator} */
    public static get COLLECTION_ITERATOR_MEMBERS(): CollectionHolder<KeyOfCollectionIterator> {
        return MembersConstants.COLLECTION_ITERATOR_MEMBERS
    }

    //#endregion -------------------- Members references --------------------

}

export namespace CollectionConstants {

    //#region -------------------- Empty references --------------------

    /** An empty {@link ReadonlyArray array} */
    export const EMPTY_ARRAY = EmptyConstants.EMPTY_ARRAY
    /** An empty {@link ReadonlySet set} */
    export const EMPTY_SET = EmptyConstants.EMPTY_SET
    /** An empty {@link WeakSet weak set} */
    export const EMPTY_WEAK_SET = EmptyConstants.EMPTY_WEAK_SET
    /** An empty {@link ReadonlyMap map} */
    export const EMPTY_MAP = EmptyConstants.EMPTY_MAP
    /** An empty {@link WeakSet weak set} */
    export const EMPTY_WEAK_MAP = EmptyConstants.EMPTY_WEAK_MAP

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
    /** The default {@link String} value for a filled {@link CollectionHolder}, but as nothing being shown */
    export const DEFAULT_ZERO_FILLED_COLLECTION = "[…]"

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
    export const ITERATOR_IS_AT_THE_START_MESSAGE = "No element found. The collection iterator is at the start of the line."
    /**
     * The message when {@link CollectionIterator.previousValue} is not present
     *
     * @see NoElementFoundInCollectionException.AT_OR_BEFORE_THE_START_MESSAGE
     */
    export const ITERATOR_IS_AT_OR_BEFORE_THE_START_MESSAGE = "No element found. The collection iterator is at or before the start of the line."
    /**
     * The message when {@link CollectionIterator.nextValue} is not present
     *
     * @see NoElementFoundInCollectionException.AT_THE_END_MESSAGE
     */
    export const ITERATOR_IS_AT_THE_END_MESSAGE = "No element found. The collection iterator is at the end of the line."
    /**
     * The message when {@link CollectionIterator.nextValue} is not present
     *
     * @see NoElementFoundInCollectionException.AT_OR_AFTER_THE_END_MESSAGE
     */
    export const ITERATOR_IS_AT_OR_AFTER_THE_END_MESSAGE = "No element found. The collection iterator is at or after the end of the line."

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

    /**
     * The {@link Symbol.toStringTag} of a {@link Tuple}
     *
     * @uniqueJavascriptVariable
     */
    export const TUPLE_TO_STRING_TAG = "Tuple"
    /**
     * The {@link Symbol.toStringTag} of a {@link Optional}
     *
     * @uniqueJavascriptVariable
     */
    export const OPTIONAL_TO_STRING_TAG = "Optional"

    //#endregion -------------------- Symbol.toString references --------------------
    //#region -------------------- Symbol references --------------------

    /** The value before the first value in a {@link CollectionIterator} */
    export const BEFORE_FIRST_VALUE_IN_ITERATOR_SYMBOL: BeforeFirstValueInCollectionIteratorSymbol = SymbolConstants.BEFORE_FIRST_VALUE_IN_ITERATOR_SYMBOL
    /** The value after the last value in a {@link CollectionIterator} */
    export const AFTER_LAST_VALUE_IN_ITERATOR_SYMBOL: AfterLastValueInCollectionIteratorSymbol = SymbolConstants.AFTER_LAST_VALUE_IN_ITERATOR_SYMBOL

    //#endregion -------------------- Symbol references --------------------

}

export interface CollectionConstants {

    /**
     * @param args Any possible arguments sent
     * @throws {EvalError} The class cannot be created
     */
    new(...args: Array<unknown>): never

}
