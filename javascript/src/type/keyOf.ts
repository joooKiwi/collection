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

import type {Array, Map, MutableArray, MutableMap, MutableSet, MutableWeakMap, MutableWeakSet, Set, WeakMap, WeakSet} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {CollectionHolderOf1}        from "../CollectionHolderOf1"
import type {CollectionHolderOf2}        from "../CollectionHolderOf2"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {CollectionIterator}         from "../iterator/CollectionIterator"
import type {CollectionIteratorOf1}      from "../iterator/CollectionIteratorOf1"
import type {CollectionIteratorOf2}      from "../iterator/CollectionIteratorOf2"
import type {TypedArray}                 from "./TypedArray"

//#region -------------------- Array key --------------------

/**
 * The keys applicable to an {@link ReadonlyArray Array}
 *
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array
 */
export type KeyOfArray = keyof Array<unknown>
/**
 * The keys applicable to a {@link Array MutableArray}
 *
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array
 */
export type KeyOfMutableArray = keyof MutableArray<unknown>

//#endregion -------------------- Array key --------------------
//#region -------------------- Typed array key --------------------

/**
 * The keys applicable to a {@link TypedArray}
 *
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/TypedArray
 */
export type KeyOfTypedArray = keyof TypedArray
/**
 * The keys applicable to a {@link TypedArray Mutable TypedArray}
 *
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/TypedArray
 */
export type KeyOfMutableTypedArray = keyof TypedArray

//#endregion -------------------- Typed array key --------------------
//#region -------------------- Set key --------------------

/**
 * The keys applicable to a {@link ReadonlySet Set}
 *
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set
 */
export type KeyOfSet = keyof Set<unknown>
/**
 * The keys applicable to a {@link Set MutableSet}
 *
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set
 */
export type KeyOfMutableSet = keyof MutableSet<unknown>

//#endregion -------------------- Set key --------------------
//#region -------------------- Weak set key --------------------

/**
 * The keys applicable to a {@link WeakSet}
 *
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakSet
 */
export type KeyOfWeakSet = keyof WeakSet<WeakKey>
/**
 * The keys applicable to a {@link WeakSet MutableWeakSet}
 *
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakSet
 */
export type KeyOfMutableWeakSet = keyof MutableWeakSet<WeakKey>

//#endregion -------------------- Weak set key --------------------
//#region -------------------- Map key --------------------

/**
 * The keys applicable to a {@link ReadonlyMap Map}
 *
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map
 */
export type KeyOfMap = keyof Map<unknown, unknown>
/**
 * The keys applicable to a {@link Map MutableMap}
 *
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map
 */
export type KeyOfMutableMap = keyof MutableMap<unknown, unknown>

//#endregion -------------------- Map key --------------------
//#region -------------------- Weak map key --------------------

/**
 * The keys applicable to a {@link WeakMap}
 *
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap
 */
export type KeyOfWeakMap = keyof WeakMap<WeakKey, unknown>
/**
 * The keys applicable to a {@link WeakMap MutableWeakMap}
 *
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap
 */
export type KeyOfMutableWeakMap = keyof MutableWeakMap<WeakKey, unknown>

//#endregion -------------------- Weak map key --------------------
//#region -------------------- Minimalist collection holder key --------------------

/** The keys applicable to a {@link MinimalistCollectionHolder} */
export type KeyOfMinimalistCollectionHolder = keyof MinimalistCollectionHolder

//#endregion -------------------- Minimalist collection holder key --------------------
//#region -------------------- Collection holder key --------------------

/** The keys applicable to a {@link CollectionHolder} */
export type KeyOfCollectionHolder = keyof CollectionHolder

/** The keys applicable to a {@link CollectionHolderOf1} */
export type KeyOfCollectionHolderOf1 = keyof CollectionHolderOf1

/** The keys applicable to a {@link CollectionHolderOf2} */
export type KeyOfCollectionHolderOf2 = keyof CollectionHolderOf2

//#endregion -------------------- Collection holder key --------------------
//#region -------------------- Iterator key --------------------

/**
 * The keys applicable to an {@link Iterator} that are mandatory
 *
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator
 */
export type KeyOfIterator = Exclude<keyof IteratorObject<unknown, unknown, unknown>, | "return" | "throw">

//#endregion -------------------- Iterator key --------------------
//#region -------------------- Collection iterator key --------------------

/** The keys applicable to a {@link CollectionIterator} */
export type KeyOfCollectionIterator = keyof CollectionIterator

/** The keys applicable to a {@link CollectionIteratorOf1} */
export type KeyOfCollectionIteratorOf1 = keyof CollectionIteratorOf1

/** The keys applicable to a {@link CollectionIteratorOf2} */
export type KeyOfCollectionIteratorOf2 = keyof CollectionIteratorOf2

//#endregion -------------------- Collection iterator key --------------------
