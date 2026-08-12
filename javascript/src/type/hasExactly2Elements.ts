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

import type {Array, Map, Nullable, NullOrUndefined, Set} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {CollectionIterator}         from "../iterator/CollectionIterator"
import type {TypedArray}                 from "./TypedArray"

/**
 * Tell that the collection
 * ({@link MinimalistCollectionHolder}, {@link CollectionHolder},
 * {@link ReadonlyArray Array}, {@link TypedArray}, {@link ReadonlySet Set} or {@link ReadonlyMap Map}) has exactly 1 element
 *
 * @see HasExactly2ElementsOnMinimalistCollectionHolder
 * @see HasExactly2ElementsOnCollectionHolder
 * @see HasExactly2ElementsOnArray
 * @see HasExactly2ElementsOnInt8Array
 * @see HasExactly2ElementsOnUint8Array
 * @see HasExactly2ElementsOnUint8ClampedArray
 * @see HasExactly2ElementsOnInt16Array
 * @see HasExactly2ElementsOnUint16Array
 * @see HasExactly2ElementsOnInt32Array
 * @see HasExactly2ElementsOnUint32Array
 * @see HasExactly2ElementsOnBigInt64Array
 * @see HasExactly2ElementsOnBigUint64Array
 * @see HasExactly2ElementsOnFloat32Array
 * @see HasExactly2ElementsOnFloat64Array
 * @see HasExactly2ElementsOnSet
 * @see HasExactly2ElementsOnMap
 * @see HasExactly2ElementsOnNullable
 */
export type HasExactly2ElementsOn<T extends MinimalistCollectionHolder | Array<unknown> | TypedArray | Set<unknown> | Map<unknown, unknown>, >
    = T extends MinimalistCollectionHolder ? HasExactly2ElementsOnMinimalistCollectionHolder<T>
    : T extends CollectionHolder           ? HasExactly2ElementsOnCollectionHolder<T>
    : T extends Array<unknown>             ? HasExactly2ElementsOnArray<T>
    : T extends Int8Array                  ? HasExactly2ElementsOnInt8Array<T>
    : T extends Uint8Array                 ? HasExactly2ElementsOnUint8Array<T>
    : T extends Uint8ClampedArray          ? HasExactly2ElementsOnUint8ClampedArray<T>
    : T extends Int16Array                 ? HasExactly2ElementsOnInt16Array<T>
    : T extends Uint16Array                ? HasExactly2ElementsOnUint16Array<T>
    : T extends Int32Array                 ? HasExactly2ElementsOnInt32Array<T>
    : T extends Uint32Array                ? HasExactly2ElementsOnUint32Array<T>
    : T extends BigInt64Array              ? HasExactly2ElementsOnBigInt64Array<T>
    : T extends BigUint64Array             ? HasExactly2ElementsOnBigUint64Array<T>
    : T extends Float32Array               ? HasExactly2ElementsOnFloat32Array<T>
    : T extends Float64Array               ? HasExactly2ElementsOnFloat64Array<T>
    : T extends Set<unknown>               ? HasExactly2ElementsOnSet<T>
    : T extends Map<unknown, unknown>      ? HasExactly2ElementsOnMap<T> : never

/**
 * Tell that the {@link Nullable nullable} collection
 * ({@link MinimalistCollectionHolder}, {@link CollectionHolder},
 * {@link ReadonlyArray Array}, {@link TypedArray}, {@link ReadonlySet Set} or {@link ReadonlyMap Map}) has exactly 2 elements
 *
 * @see HasExactly2ElementsOnNullableMinimalistCollectionHolder
 * @see HasExactly2ElementsOnNullableCollectionHolder
 * @see HasExactly2ElementsOnNullableArray
 * @see HasExactly2ElementsOnInt8Array
 * @see HasExactly2ElementsOnUint8Array
 * @see HasExactly2ElementsOnUint8ClampedArray
 * @see HasExactly2ElementsOnInt16Array
 * @see HasExactly2ElementsOnUint16Array
 * @see HasExactly2ElementsOnInt32Array
 * @see HasExactly2ElementsOnUint32Array
 * @see HasExactly2ElementsOnBigInt64Array
 * @see HasExactly2ElementsOnBigUint64Array
 * @see HasExactly2ElementsOnFloat32Array
 * @see HasExactly2ElementsOnFloat64Array
 * @see HasExactly2ElementsOnNullableSet
 * @see HasExactly2ElementsOnNullableMap
 * @see HasExactly2ElementsOn
 */
export type HasExactly2ElementsOnNullable<T extends Nullable<| MinimalistCollectionHolder | Array<unknown> | TypedArray | Set<unknown> | Map<unknown, unknown>>, >
    = T extends NullOrUndefined            ? false
    : T extends MinimalistCollectionHolder ? HasExactly2ElementsOnMinimalistCollectionHolder<T>
    : T extends CollectionHolder           ? HasExactly2ElementsOnCollectionHolder<T>
    : T extends Array<unknown>             ? HasExactly2ElementsOnArray<T>
    : T extends Int8Array                  ? HasExactly2ElementsOnInt8Array<T>
    : T extends Uint8Array                 ? HasExactly2ElementsOnUint8Array<T>
    : T extends Uint8ClampedArray          ? HasExactly2ElementsOnUint8ClampedArray<T>
    : T extends Int16Array                 ? HasExactly2ElementsOnInt16Array<T>
    : T extends Uint16Array                ? HasExactly2ElementsOnUint16Array<T>
    : T extends Int32Array                 ? HasExactly2ElementsOnInt32Array<T>
    : T extends Uint32Array                ? HasExactly2ElementsOnUint32Array<T>
    : T extends BigInt64Array              ? HasExactly2ElementsOnBigInt64Array<T>
    : T extends BigUint64Array             ? HasExactly2ElementsOnBigUint64Array<T>
    : T extends Float32Array               ? HasExactly2ElementsOnFloat32Array<T>
    : T extends Float64Array               ? HasExactly2ElementsOnFloat64Array<T>
    : T extends Set<unknown>               ? HasExactly2ElementsOnSet<T>
    : T extends Map<unknown, unknown>      ? HasExactly2ElementsOnMap<T> : never

//#region -------------------- Minimalist collection holder --------------------

/**
 * Tell that the {@link MinimalistCollectionHolder collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnNullableMinimalistCollectionHolder
 * @see HasExactly2ElementsOn
 */
export type HasExactly2ElementsOnMinimalistCollectionHolder<T extends MinimalistCollectionHolder, >
    = T["size"] extends 2 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link MinimalistCollectionHolder collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnMinimalistCollectionHolder
 * @see HasExactly2ElementsOnNullable
 */
export type HasExactly2ElementsOnNullableMinimalistCollectionHolder<T extends Nullable<MinimalistCollectionHolder>, >
    = T extends NullOrUndefined            ? false
    : T extends MinimalistCollectionHolder ? HasExactly2ElementsOnMinimalistCollectionHolder<T> : never

//#endregion -------------------- Minimalist collection holder --------------------
//#region -------------------- Collection holder --------------------

/**
 * Tell that the {@link CollectionHolder collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnNullableCollectionHolder
 * @see HasExactly2ElementsOn
 */
export type HasExactly2ElementsOnCollectionHolder<T extends CollectionHolder, >
    = T["size"] extends 2 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link CollectionHolder collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnCollectionHolder
 * @see HasExactly2ElementsOnNullable
 */
export type HasExactly2ElementsOnNullableCollectionHolder<T extends Nullable<CollectionHolder>, >
    = T extends NullOrUndefined  ? false
    : T extends CollectionHolder ? HasExactly2ElementsOnCollectionHolder<T> : never

//#endregion -------------------- Collection holder --------------------
//#region -------------------- Collection iterator --------------------

/**
 * Tell that the {@link CollectionIterator iterator} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnNullableCollectionIterator
 */
export type HasExactly2ElementsOnCollectionIterator<T extends CollectionIterator, >
    = T["size"] extends 2 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link CollectionIterator iterator} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnCollectionIterator
 */
export type HasExactly2ElementsOnNullableCollectionIterator<T extends Nullable<CollectionIterator>, >
    = T extends NullOrUndefined    ? false
    : T extends CollectionIterator ? HasExactly2ElementsOnCollectionIterator<T> : never

//#endregion -------------------- Collection iterator --------------------
//#region -------------------- Array --------------------

/**
 * Tell that the {@link ReadonlyArray collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnNullableArray
 * @see HasExactly2ElementsOn
 */
export type HasExactly2ElementsOnArray<T extends Array<unknown>, >
    = T["length"] extends 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlyArray collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnArray
 * @see HasExactly2ElementsOnNullable
 */
export type HasExactly2ElementsOnNullableArray<T extends Nullable<Array<unknown>>, >
    = T extends NullOrUndefined ? false
    : T extends Array<unknown>  ? HasExactly2ElementsOnArray<T> : never

//#endregion -------------------- Array --------------------
//#region -------------------- Int8 array --------------------

/**
 * Tell that the {@link Int8Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnNullableInt8Array
 * @see HasExactly2ElementsOn
 */
export type HasExactly2ElementsOnInt8Array<T extends Int8Array, >
    = T["length"] extends 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Int8Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnInt8Array
 * @see HasExactly2ElementsOnNullable
 */
export type HasExactly2ElementsOnNullableInt8Array<T extends Nullable<Int8Array>, >
    = T extends NullOrUndefined ? false
    : T extends Int8Array       ? HasExactly2ElementsOnInt8Array<T> : never

//#endregion -------------------- Int8 array --------------------
//#region -------------------- Uint8 array --------------------

/**
 * Tell that the {@link Uint8Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnNullableUint8Array
 * @see HasExactly2ElementsOn
 */
export type HasExactly2ElementsOnUint8Array<T extends Uint8Array, >
    = T["length"] extends 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint8Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnUint8Array
 * @see HasExactly2ElementsOnNullable
 */
export type HasExactly2ElementsOnNullableUint8Array<T extends Nullable<Uint8Array>, >
    = T extends NullOrUndefined ? false
    : T extends Uint8Array      ? HasExactly2ElementsOnUint8Array<T> : never

//#endregion -------------------- Uint8 array --------------------
//#region -------------------- Uint8 clamped array --------------------

/**
 * Tell that the {@link Uint8Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnNullableUint8ClampedArray
 * @see HasExactly2ElementsOn
 */
export type HasExactly2ElementsOnUint8ClampedArray<T extends Uint8ClampedArray, >
    = T["length"] extends 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint8Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnUint8ClampedArray
 * @see HasExactly2ElementsOnNullable
 */
export type HasExactly2ElementsOnNullableUint8ClampedArray<T extends Nullable<Uint8ClampedArray>, >
    = T extends NullOrUndefined   ? false
    : T extends Uint8ClampedArray ? HasExactly2ElementsOnUint8ClampedArray<T> : never

//#endregion -------------------- Uint8 clamped array --------------------
//#region -------------------- Int16 array --------------------

/**
 * Tell that the {@link Int16Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnNullableInt16Array
 * @see HasExactly2ElementsOn
 */
export type HasExactly2ElementsOnInt16Array<T extends Int16Array, >
    = T["length"] extends 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Int16Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnInt16Array
 * @see HasExactly2ElementsOnNullable
 */
export type HasExactly2ElementsOnNullableInt16Array<T extends Nullable<Int16Array>, >
    = T extends NullOrUndefined ? false
    : T extends Int16Array      ? HasExactly2ElementsOnInt16Array<T> : never

//#endregion -------------------- Int16 array --------------------
//#region -------------------- Uint16 array --------------------

/**
 * Tell that the {@link Uint16Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnNullableUint16Array
 * @see HasExactly2ElementsOn
 */
export type HasExactly2ElementsOnUint16Array<T extends Uint16Array, >
    = T["length"] extends 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint16Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnUint16Array
 * @see HasExactly2ElementsOnNullable
 */
export type HasExactly2ElementsOnNullableUint16Array<T extends Nullable<Uint16Array>, >
    = T extends NullOrUndefined ? false
    : T extends Uint16Array     ? HasExactly2ElementsOnUint16Array<T> : never

//#endregion -------------------- Uint16 array --------------------
//#region -------------------- Int32 array --------------------

/**
 * Tell that the {@link Int32Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnNullableInt32Array
 * @see HasExactly2ElementsOn
 */
export type HasExactly2ElementsOnInt32Array<T extends Int32Array, >
    = T["length"] extends 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Int32Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnInt32Array
 * @see HasExactly2ElementsOnNullable
 */
export type HasExactly2ElementsOnNullableInt32Array<T extends Nullable<Int32Array>, >
    = T extends NullOrUndefined ? false
    : T extends Int32Array      ? HasExactly2ElementsOnInt32Array<T> : never

//#endregion -------------------- Int32 array --------------------
//#region -------------------- Uint32 array --------------------

/**
 * Tell that the {@link Uint32Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnNullableUint32Array
 * @see HasExactly2ElementsOn
 */
export type HasExactly2ElementsOnUint32Array<T extends Uint32Array, >
    = T["length"] extends 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint32Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnUint32Array
 * @see HasExactly2ElementsOnNullable
 */
export type HasExactly2ElementsOnNullableUint32Array<T extends Nullable<Uint32Array>, >
    = T extends NullOrUndefined ? false
    : T extends Uint32Array     ? HasExactly2ElementsOnUint32Array<T> : never

//#endregion -------------------- Uint32 array --------------------
//#region -------------------- BigInt64 array --------------------

/**
 * Tell that the {@link BigInt64Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnNullableBigInt64Array
 * @see HasExactly2ElementsOn
 */
export type HasExactly2ElementsOnBigInt64Array<T extends BigInt64Array, >
    = T["length"] extends 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link BigInt64Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnBigInt64Array
 * @see HasExactly2ElementsOnNullable
 */
export type HasExactly2ElementsOnNullableBigInt64Array<T extends Nullable<BigInt64Array>, >
    = T extends NullOrUndefined ? false
    : T extends BigInt64Array   ? HasExactly2ElementsOnBigInt64Array<T> : never

//#endregion -------------------- BigInt64 array --------------------
//#region -------------------- BigUint64 array --------------------

/**
 * Tell that the {@link BigUint64Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnNullableBigUint64Array
 * @see HasExactly2ElementsOn
 */
export type HasExactly2ElementsOnBigUint64Array<T extends BigUint64Array, >
    = T["length"] extends 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link BigUint64Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnBigUint64Array
 * @see HasExactly2ElementsOnNullable
 */
export type HasExactly2ElementsOnNullableBigUint64Array<T extends Nullable<BigUint64Array>, >
    = T extends NullOrUndefined ? false
    : T extends BigUint64Array  ? HasExactly2ElementsOnBigUint64Array<T> : never

//#endregion -------------------- BigUint64 array --------------------
//#region -------------------- Float32 array --------------------

/**
 * Tell that the {@link Float32Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnNullableFloat32Array
 * @see HasExactly2ElementsOn
 */
export type HasExactly2ElementsOnFloat32Array<T extends Float32Array, >
    = T["length"] extends 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Float32Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnFloat32Array
 * @see HasExactly2ElementsOnNullable
 */
export type HasExactly2ElementsOnNullableFloat32Array<T extends Nullable<Float32Array>, >
    = T extends NullOrUndefined ? false
    : T extends Float32Array    ? HasExactly2ElementsOnFloat32Array<T> : never

//#endregion -------------------- Float32 array --------------------
//#region -------------------- Float64 array --------------------

/**
 * Tell that the {@link Float64Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnNullableFloat64Array
 * @see HasExactly2ElementsOn
 */
export type HasExactly2ElementsOnFloat64Array<T extends Float64Array, >
    = T["length"] extends 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Float64Array collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnFloat64Array
 * @see HasExactly2ElementsOnNullable
 */
export type HasExactly2ElementsOnNullableFloat64Array<T extends Nullable<Float64Array>, >
    = T extends NullOrUndefined ? false
    : T extends Float64Array    ? HasExactly2ElementsOnFloat64Array<T> : never

//#endregion -------------------- Float64 array --------------------
//#region -------------------- Set --------------------

/**
 * Tell that the {@link ReadonlySet collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnNullableSet
 * @see HasExactly2ElementsOn
 */
export type HasExactly2ElementsOnSet<T extends Set<unknown>, >
    = T["size"] extends 2 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlySet collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnSet
 * @see HasExactly2ElementsOnNullable
 */
export type HasExactly2ElementsOnNullableSet<T extends Nullable<Set<unknown>>, >
    = T extends NullOrUndefined ? false
    : T extends Set<unknown>    ? HasExactly2ElementsOnSet<T> : never

//#endregion -------------------- Set --------------------
//#region -------------------- Map --------------------

/**
 * Tell that the {@link ReadonlyMap collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnNullableMap
 * @see HasExactly2ElementsOn
 */
export type HasExactly2ElementsOnMap<T extends Map<unknown, unknown>, >
    = T["size"] extends 2 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlyMap collection} has exactly 2 elements
 *
 * @see HasExactly2ElementsOnMap
 * @see HasExactly2ElementsOnNullable
 */
export type HasExactly2ElementsOnNullableMap<T extends Nullable<Map<unknown, unknown>>, >
    = T extends NullOrUndefined       ? false
    : T extends Map<unknown, unknown> ? HasExactly2ElementsOnMap<T> : never

//#endregion -------------------- Map --------------------
