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

import type {Array, EmptyArray, EmptyMap, EmptySet, EmptyWeakMap, EmptyWeakSet} from "@joookiwi/type"

import {EmptyCollectionHolder}   from "./EmptyCollectionHolder"
import {EmptyCollectionIterator} from "./iterator/EmptyCollectionIterator"

/**
 * A utility class containing every empty fields used by any {@link CollectionHolder} instances.
 *
 * Note that attempting to create it will result in a {@link EvalError}
 * due to being a utility class and not a namespace.
 */
export class EmptyConstants {

    /** @throws {EvalError} The class cannot be created */
    private constructor() {
        throw new EvalError("The utility class “EmptyConstants” cannot be created.",)
    }

    /** An {@link EmptyCollectionHolder} instance */
    public static get EMPTY_COLLECTION_HOLDER(): EmptyCollectionHolder {
        return EmptyCollectionHolder.get
    }

    /** An {@link EmptyCollectionIterator} instance */
    public static get EMPTY_COLLECTION_ITERATOR(): EmptyCollectionIterator {
        return EmptyCollectionIterator.get
    }

}

export namespace EmptyConstants {

    /** An empty {@link ReadonlyArray array} */
    export const EMPTY_ARRAY = Object.freeze([],) as EmptyArray
    /** An empty {@link ReadonlySet set} */
    export const EMPTY_SET = Object.freeze(new Set<never>(),) as EmptySet
    /** An empty {@link WeakSet weak set} */
    export const EMPTY_WEAK_SET = Object.freeze(new WeakSet(),) as EmptyWeakSet
    /** An empty {@link ReadonlyMap map} */
    export const EMPTY_MAP = Object.freeze(new Map<never, never>(),) as EmptyMap
    /** An empty {@link WeakSet weak set} */
    export const EMPTY_WEAK_MAP = Object.freeze(new WeakMap(),) as EmptyWeakMap

}

export interface EmptyConstants {

    /**
     * @param args Any possible arguments sent
     * @throws {EvalError} The class cannot be created
     */
    new(...args: Array<unknown>): never

}
