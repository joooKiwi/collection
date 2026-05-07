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

import type {ArrayAsCollectionHolder}       from "./ArrayAsCollectionHolder"
import type {CollectionHolderOf1}           from "./CollectionHolderOf1"
import type {CollectionHolderOf2}           from "./CollectionHolderOf2"
import type {LazyCollectionHolderOf1}       from "./LazyCollectionHolderOf1"
import type {LazyCollectionHolderOf2}       from "./LazyCollectionHolderOf2"
import type {IteratorAsCollectionHolder}    from "./IteratorAsCollectionHolder"
import type {JsIterableAsCollectionHolder}  from "./JsIterableAsCollectionHolder"
import type {JsIteratorAsCollectionHolder}  from "./JsIteratorAsCollectionHolder"
import type {MinimalistAsCollectionHolder}  from "./MinimalistAsCollectionHolder"
import type {SetAsCollectionHolder}         from "./SetAsCollectionHolder"

/**
 * A general utility class to delay the usage of the references in order to compile.
 * It helps by resolving recursive dependencies in the framework.
 *
 * @apiNote This class should not be used externally
 *          since the problem does not reside outside, but within the framework
 * @internal
 */
export class LateRetriever {

    private constructor() {
        throw new EvalError("The utility class “LateRetriever” cannot be created.",)
    }

    static #ArrayAsCollectionHolder?: typeof ArrayAsCollectionHolder
    static #CollectionHolderOf1?: typeof CollectionHolderOf1
    static #CollectionHolderOf2?: typeof CollectionHolderOf2
    static #LazyCollectionHolderOf1?: typeof LazyCollectionHolderOf1
    static #LazyCollectionHolderOf2?: typeof LazyCollectionHolderOf2
    static #IteratorAsCollectionHolder?: typeof IteratorAsCollectionHolder
    static #JsIterableAsCollectionHolder?: typeof JsIterableAsCollectionHolder
    static #JsIteratorAsCollectionHolder?: typeof JsIteratorAsCollectionHolder
    static #MinimalistAsCollectionHolder: typeof MinimalistAsCollectionHolder
    static #SetAsCollectionHolder: typeof SetAsCollectionHolder

    /** The {@link Object.constructor constructor} reference of {@link ArrayAsCollectionHolder} */
    public static get ArrayAsCollectionHolder(): typeof ArrayAsCollectionHolder {
        return LateRetriever.#ArrayAsCollectionHolder ??= require("./ArrayAsCollectionHolder").ArrayAsCollectionHolder
    }

    /** The {@link Object.constructor constructor} reference of {@link #CollectionHolderOf2} */
    public static get CollectionHolderOf1(): typeof CollectionHolderOf1 {
        return LateRetriever.#CollectionHolderOf1 ??= require("./CollectionHolderOf1").CollectionHolderOf1
    }

    /** The {@link Object.constructor constructor} reference of {@link #CollectionHolderOf2} */
    public static get CollectionHolderOf2(): typeof CollectionHolderOf2 {
        return LateRetriever.#CollectionHolderOf2 ??= require("./CollectionHolderOf2").CollectionHolderOf2
    }

    /** The {@link Object.constructor constructor} reference of {@link LazyCollectionHolderOf1} */
    public static get LazyCollectionHolderOf1(): typeof LazyCollectionHolderOf1 {
        return LateRetriever.#LazyCollectionHolderOf1 ??= require("./LazyCollectionHolderOf1").LazyCollectionHolderOf1
    }

    /** The {@link Object.constructor constructor} reference of {@link LazyCollectionHolderOf2} */
    public static get LazyCollectionHolderOf2(): typeof LazyCollectionHolderOf2 {
        return LateRetriever.#LazyCollectionHolderOf2 ??= require("./LazyCollectionHolderOf2").LazyCollectionHolderOf2
    }

    /** The {@link Object.constructor constructor} reference of {@link IteratorAsCollectionHolder} */
    public static get IteratorAsCollectionHolder(): typeof IteratorAsCollectionHolder {
        return LateRetriever.#IteratorAsCollectionHolder ??= require("./IteratorAsCollectionHolder").IteratorAsCollectionHolder
    }

    /** The {@link Object.constructor constructor} reference of {@link JsIterableAsCollectionHolder} */
    public static get JsIterableAsCollectionHolder(): typeof JsIterableAsCollectionHolder {
        return LateRetriever.#JsIterableAsCollectionHolder ??= require("./JsIterableAsCollectionHolder").JsIterableAsCollectionHolder
    }

    /** The {@link Object.constructor constructor} reference of {@link JsIteratorAsCollectionHolder} */
    public static get JsIteratorAsCollectionHolder(): typeof JsIteratorAsCollectionHolder {
        return LateRetriever.#JsIteratorAsCollectionHolder ??= require("./JsIteratorAsCollectionHolder").JsIteratorAsCollectionHolder
    }

    /** The {@link Object.constructor constructor} reference of {@link MinimalistAsCollectionHolder} */
    public static get MinimalistAsCollectionHolder(): typeof MinimalistAsCollectionHolder {
        return LateRetriever.#MinimalistAsCollectionHolder ??= require("./MinimalistAsCollectionHolder").MinimalistAsCollectionHolder
    }

    /** The {@link Object.constructor constructor} reference of {@link SetAsCollectionHolder} */
    public static get SetAsCollectionHolder(): typeof SetAsCollectionHolder {
        return LateRetriever.#SetAsCollectionHolder ??= require("./SetAsCollectionHolder").SetAsCollectionHolder
    }

}

export interface LateRetriever {

    /**
     * @param _ Any possible arguments sent
     * @throws {EvalError} The class cannot be created
     */
    new(..._: Array<unknown>): never

}
