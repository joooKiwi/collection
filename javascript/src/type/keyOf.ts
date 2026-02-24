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
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {CollectionIterator}         from "../iterator/CollectionIterator"
import type {TypedArray}                 from "./TypedArray"

//#region -------------------- Array key --------------------

/** The keys applicable to an {@link ReadonlyArray Array} */
export type KeyOfArray = keyof Array<unknown>
/** The keys applicable to a {@link Array MutableArray} */
export type KeyOfMutableArray = keyof MutableArray<unknown>

//#endregion -------------------- Array key --------------------
//#region -------------------- Typed array key --------------------

/** The keys applicable to a {@link TypedArray} */
export type KeyOfTypedArray = keyof TypedArray
/** The keys applicable to a {@link TypedArray Mutable TypedArray} */
export type KeyOfMutableTypedArray = keyof TypedArray

//#endregion -------------------- Typed array key --------------------
//#region -------------------- Set key --------------------

/** The keys applicable to a {@link ReadonlySet Set} */
export type KeyOfSet = keyof Set<unknown>
/** The keys applicable to a {@link Set MutableSet} */
export type KeyOfMutableSet = keyof MutableSet<unknown>

//#endregion -------------------- Set key --------------------
//#region -------------------- Weak set key --------------------

/** The keys applicable to a {@link WeakSet} */
export type KeyOfWeakSet = keyof WeakSet<WeakKey>
/** The keys applicable to a {@link WeakSet MutableWeakSet} */
export type KeyOfMutableWeakSet = keyof MutableWeakSet<WeakKey>

//#endregion -------------------- Weak set key --------------------
//#region -------------------- Map key --------------------

/** The keys applicable to a {@link ReadonlyMap Map} */
export type KeyOfMap = keyof Map<unknown, unknown>
/** The keys applicable to a {@link Map MutableMap} */
export type KeyOfMutableMap = keyof MutableMap<unknown, unknown>

//#endregion -------------------- Map key --------------------
//#region -------------------- Weak map key --------------------

/** The keys applicable to a {@link WeakMap} */
export type KeyOfWeakMap = keyof WeakMap<WeakKey, unknown>
/** The keys applicable to a {@link WeakMap MutableWeakMap} */
export type KeyOfMutableWeakMap = keyof MutableWeakMap<WeakKey, unknown>

//#endregion -------------------- Weak map key --------------------
//#region -------------------- Minimalist collection holder key --------------------

/** The keys applicable to a {@link MinimalistCollectionHolder} */
export type KeyOfMinimalistCollectionHolder = keyof MinimalistCollectionHolder

//#endregion -------------------- Minimalist collection holder key --------------------
//#region -------------------- Collection holder key --------------------

/** The keys applicable to a {@link CollectionHolder} */
export type KeyOfCollectionHolder = keyof CollectionHolder

//#endregion -------------------- Collection holder key --------------------
//#region -------------------- Iterator key --------------------

/** The keys applicable to an {@link Iterator} that are mandatory */
export type KeyOfIterator = Exclude<keyof Iterator<unknown, unknown, unknown>, | "return" | "throw">
// export type KeyOfIterator = "next"
//                             | "every" | "some"
//                             | "find" | "filter" | "reduce"
//                             | "take" | "drop"
//                             | "forEach"
//                             | "map" | "flatMap"
//                             | "toArray"
//                             | typeof Symbol["iterator"] | typeof Symbol["toStringTag"]
//export type KeyOfIterator = Exclude<keyof IteratorObject<unknown, unknown, unknown>, Symbol["dispose"]>

//#endregion -------------------- Iterator key --------------------
//#region -------------------- Collection iterator key --------------------

/** The keys applicable to a {@link CollectionIterator} */
export type KeyOfCollectionIterator = keyof CollectionIterator

//#endregion -------------------- Collection iterator key --------------------
