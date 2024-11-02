/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}           from "./CollectionHolder"
import type {TypedArray}                 from "./CollectionHolder.types"
import type {MinimalistCollectionHolder} from "./MinimalistCollectionHolder"
import type {CollectionIterator}         from "./iterator/CollectionIterator"

//#region -------------------- Array key --------------------

/** The keys applicable to an {@link ReadonlyArray Array} */
export type KeyOfArray = keyof ReadonlyArray<unknown>
/** The keys applicable to a {@link Array MutableArray} */
export type KeyOfMutableArray = keyof Array<unknown>

//#endregion -------------------- Array key --------------------
//#region -------------------- Typed array key --------------------

/** The keys applicable to a {@link TypedArray} */
export type KeyOfTypedArray = keyof TypedArray
/** The keys applicable to a {@link TypedArray Mutable TypedArray} */
export type KeyOfMutableTypedArray = keyof TypedArray

//#endregion -------------------- Typed array key --------------------
//#region -------------------- Set key --------------------

/** The keys applicable to a {@link ReadonlySet Set} */
export type KeyOfSet = keyof ReadonlySet<unknown>
/** The keys applicable to a {@link Set MutableSet} */
export type KeyOfMutableSet = keyof Set<unknown>

//#endregion -------------------- Set key --------------------
//#region -------------------- Weak set key --------------------

type WeakSetSymbolNames = "toStringTag"
/** The keys applicable to a {@link WeakSet} */
export type KeyOfWeakSet = | "has" | typeof Symbol[WeakSetSymbolNames]
/** The keys applicable to a {@link WeakSet MutableWeakSet} */
export type KeyOfMutableWeakSet = keyof WeakSet<WeakKey>

//#endregion -------------------- Weak set key --------------------
//#region -------------------- Minimalist collection holder key --------------------

/** The keys applicable to a {@link MinimalistCollectionHolder} */
export type KeyOfMinimalistCollectionHolder = keyof MinimalistCollectionHolder

//#endregion -------------------- Minimalist collection holder key --------------------
//#region -------------------- Collection holder key --------------------

/** The keys applicable to a {@link CollectionHolder} */
export type KeyOfCollectionHolder = keyof CollectionHolder

//#endregion -------------------- Collection holder key --------------------
//#region -------------------- Iterator key --------------------

/** The keys applicable to an {@link IteratorObject Iterator} */
export type KeyOfIterator = IteratorObject<unknown>

//#endregion -------------------- Iterator key --------------------
//#region -------------------- Collection iterator key --------------------

/** The keys applicable to a {@link CollectionIterator} */
export type KeyOfCollectionIterator = keyof CollectionIterator

//#endregion -------------------- Collection iterator key --------------------
