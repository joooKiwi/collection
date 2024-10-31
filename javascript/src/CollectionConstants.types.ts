/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}           from "./CollectionHolder"
import type {TypedArray}                 from "./CollectionHolder.types"
import type {MinimalistCollectionHolder} from "./MinimalistCollectionHolder"
import type {CollectionIterator}         from "./iterator/CollectionIterator"

type ArraySymbolNames = | "iterator" | "unscopables"
/** The keys applicable to an {@link ReadonlyArray Array} */
export type KeyOfArray = Exclude<keyof ReadonlyArray<unknown>, `[Symbol.${ArraySymbolNames}]`> | typeof Symbol[ArraySymbolNames]
/** The keys applicable to a {@link Array MutableArray} */
export type KeyOfMutableArray = Exclude<keyof Array<unknown>, `[Symbol.${ArraySymbolNames}]`> | typeof Symbol[ArraySymbolNames]

type TypedArraySymbolNames = | "iterator" | "species"
/** The keys applicable to a {@link TypedArray} */
export type KeyOfTypedArray = Exclude<keyof TypedArray, `[Symbol.${TypedArraySymbolNames}]`> | typeof Symbol[TypedArraySymbolNames]
/** The keys applicable to a {@link TypedArray Mutable TypedArray} */
export type KeyOfMutableTypedArray = Exclude<keyof TypedArray, `[Symbol.${TypedArraySymbolNames}]`> | typeof Symbol[TypedArraySymbolNames]

type SetSymbolNames = | "iterator" | "toStringTag"
/** The keys applicable to a {@link ReadonlySet Set} */
export type KeyOfSet = Exclude<keyof ReadonlySet<unknown>, `[Symbol.${SetSymbolNames}]`> | typeof Symbol[SetSymbolNames]
/** The keys applicable to a {@link Set MutableSet} */
export type KeyOfMutableSet = Exclude<keyof Set<unknown>, `[Symbol.iterator]`> | typeof Symbol["iterator"]
// export type KeyOfMutableSet = Exclude<keyof Set<unknown>, `[Symbol.${SetSymbolNames}]`> | typeof Symbol[SetSymbolNames]

type WeakSetSymbolNames = "toStringTag"
/** The keys applicable to a {@link WeakSet} */
export type KeyOfWeakSet = | "has" | typeof Symbol[WeakSetSymbolNames]
/** The keys applicable to a {@link WeakSet MutableWeakSet} */
export type KeyOfMutableWeakSet = Exclude<keyof WeakSet<WeakKey>, `[Symbol.${WeakSetSymbolNames}]`> | typeof Symbol[WeakSetSymbolNames]

/** The keys applicable to a {@link MinimalistCollectionHolder} */
export type KeyOfMinimalistCollectionHolder = keyof MinimalistCollectionHolder

/** The keys applicable to a {@link CollectionHolder} */
export type KeyOfCollectionHolder = keyof CollectionHolder

type IteratorSymbolNames = "iterator" | "toStringTag"
/** The keys applicable to an {@link IteratorObject Iterator} */
export type KeyOfIterator = Exclude<keyof IteratorObject<unknown>, `[Symbol.${IteratorSymbolNames}]`> | typeof Symbol[IteratorSymbolNames]

/** The keys applicable to a {@link CollectionIterator} */
export type KeyOfCollectionIterator = keyof CollectionIterator
