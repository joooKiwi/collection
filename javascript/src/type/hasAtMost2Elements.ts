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
 * {@link ReadonlyArray Array}, {@link TypedArray}, {@link ReadonlySet Set} or {@link ReadonlyMap Map}) has at most 2 elements
 *
 * @see HasAtMost2ElementsOnMinimalistCollectionHolder
 * @see HasAtMost2ElementsOnCollectionHolder
 * @see HasAtMost2ElementsOnArray
 * @see HasAtMost2ElementsOnInt8Array
 * @see HasAtMost2ElementsOnUint8Array
 * @see HasAtMost2ElementsOnUint8ClampedArray
 * @see HasAtMost2ElementsOnInt16Array
 * @see HasAtMost2ElementsOnUint16Array
 * @see HasAtMost2ElementsOnInt32Array
 * @see HasAtMost2ElementsOnUint32Array
 * @see HasAtMost2ElementsOnBigInt64Array
 * @see HasAtMost2ElementsOnBigUint64Array
 * @see HasAtMost2ElementsOnFloat32Array
 * @see HasAtMost2ElementsOnFloat64Array
 * @see HasAtMost2ElementsOnSet
 * @see HasAtMost2ElementsOnMap
 * @see HasAtMost2ElementsOnNullable
 */
export type HasAtMost2ElementsOn<T extends MinimalistCollectionHolder | Array<unknown> | TypedArray | Set<unknown> | Map<unknown, unknown>, >
    = T extends MinimalistCollectionHolder ? HasAtMost2ElementsOnMinimalistCollectionHolder<T>
    : T extends CollectionHolder           ? HasAtMost2ElementsOnCollectionHolder<T>
    : T extends Array<unknown>             ? HasAtMost2ElementsOnArray<T>
    : T extends Int8Array                  ? HasAtMost2ElementsOnInt8Array<T>
    : T extends Uint8Array                 ? HasAtMost2ElementsOnUint8Array<T>
    : T extends Uint8ClampedArray          ? HasAtMost2ElementsOnUint8ClampedArray<T>
    : T extends Int16Array                 ? HasAtMost2ElementsOnInt16Array<T>
    : T extends Uint16Array                ? HasAtMost2ElementsOnUint16Array<T>
    : T extends Int32Array                 ? HasAtMost2ElementsOnInt32Array<T>
    : T extends Uint32Array                ? HasAtMost2ElementsOnUint32Array<T>
    : T extends BigInt64Array              ? HasAtMost2ElementsOnBigInt64Array<T>
    : T extends BigUint64Array             ? HasAtMost2ElementsOnBigUint64Array<T>
    : T extends Float32Array               ? HasAtMost2ElementsOnFloat32Array<T>
    : T extends Float64Array               ? HasAtMost2ElementsOnFloat64Array<T>
    : T extends Set<unknown>               ? HasAtMost2ElementsOnSet<T>
    : T extends Map<unknown, unknown>      ? HasAtMost2ElementsOnMap<T> : never

/**
 * Tell that the {@link Nullable nullable} collection
 * ({@link MinimalistCollectionHolder}, {@link CollectionHolder},
 * {@link ReadonlyArray Array}, {@link TypedArray}, {@link ReadonlySet Set} or {@link ReadonlyMap Map}) has at most 2 elements
 *
 * @see HasAtMost2ElementsOnNullableMinimalistCollectionHolder
 * @see HasAtMost2ElementsOnNullableCollectionHolder
 * @see HasAtMost2ElementsOnNullableArray
 * @see HasAtMost2ElementsOnInt8Array
 * @see HasAtMost2ElementsOnUint8Array
 * @see HasAtMost2ElementsOnUint8ClampedArray
 * @see HasAtMost2ElementsOnInt16Array
 * @see HasAtMost2ElementsOnUint16Array
 * @see HasAtMost2ElementsOnInt32Array
 * @see HasAtMost2ElementsOnUint32Array
 * @see HasAtMost2ElementsOnBigInt64Array
 * @see HasAtMost2ElementsOnBigUint64Array
 * @see HasAtMost2ElementsOnFloat32Array
 * @see HasAtMost2ElementsOnFloat64Array
 * @see HasAtMost2ElementsOnNullableSet
 * @see HasAtMost2ElementsOnNullableMap
 * @see HasAtMost2ElementsOn
 */
export type HasAtMost2ElementsOnNullable<T extends Nullable<| MinimalistCollectionHolder | Array<unknown> | TypedArray | Set<unknown> | Map<unknown, unknown>>, >
    = T extends NullOrUndefined            ? true
    : T extends MinimalistCollectionHolder ? HasAtMost2ElementsOnMinimalistCollectionHolder<T>
    : T extends CollectionHolder           ? HasAtMost2ElementsOnCollectionHolder<T>
    : T extends Array<unknown>             ? HasAtMost2ElementsOnArray<T>
    : T extends Int8Array                  ? HasAtMost2ElementsOnInt8Array<T>
    : T extends Uint8Array                 ? HasAtMost2ElementsOnUint8Array<T>
    : T extends Uint8ClampedArray          ? HasAtMost2ElementsOnUint8ClampedArray<T>
    : T extends Int16Array                 ? HasAtMost2ElementsOnInt16Array<T>
    : T extends Uint16Array                ? HasAtMost2ElementsOnUint16Array<T>
    : T extends Int32Array                 ? HasAtMost2ElementsOnInt32Array<T>
    : T extends Uint32Array                ? HasAtMost2ElementsOnUint32Array<T>
    : T extends BigInt64Array              ? HasAtMost2ElementsOnBigInt64Array<T>
    : T extends BigUint64Array             ? HasAtMost2ElementsOnBigUint64Array<T>
    : T extends Float32Array               ? HasAtMost2ElementsOnFloat32Array<T>
    : T extends Float64Array               ? HasAtMost2ElementsOnFloat64Array<T>
    : T extends Set<unknown>               ? HasAtMost2ElementsOnSet<T>
    : T extends Map<unknown, unknown>      ? HasAtMost2ElementsOnMap<T> : never

//#region -------------------- Minimalist collection holder --------------------

/**
 * Tell that the {@link MinimalistCollectionHolder collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnNullableMinimalistCollectionHolder
 * @see HasAtMost2ElementsOn
 */
export type HasAtMost2ElementsOnMinimalistCollectionHolder<T extends MinimalistCollectionHolder, >
    = T["size"] extends | 0 | 1 | 2 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link MinimalistCollectionHolder collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnMinimalistCollectionHolder
 * @see HasAtMost2ElementsOnNullable
 */
export type HasAtMost2ElementsOnNullableMinimalistCollectionHolder<T extends Nullable<MinimalistCollectionHolder>, >
    = T extends NullOrUndefined            ? true
    : T extends MinimalistCollectionHolder ? HasAtMost2ElementsOnMinimalistCollectionHolder<T> : never

//#endregion -------------------- Minimalist collection holder --------------------
//#region -------------------- Collection holder --------------------

/**
 * Tell that the {@link CollectionHolder collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnNullableCollectionHolder
 * @see HasAtMost2ElementsOn
 */
export type HasAtMost2ElementsOnCollectionHolder<T extends CollectionHolder, >
    = T["size"] extends | 0 | 1 | 2 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link CollectionHolder collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnCollectionHolder
 * @see HasAtMost2ElementsOnNullable
 */
export type HasAtMost2ElementsOnNullableCollectionHolder<T extends Nullable<CollectionHolder>, >
    = T extends NullOrUndefined  ? true
    : T extends CollectionHolder ? HasAtMost2ElementsOnCollectionHolder<T> : never

//#endregion -------------------- Collection holder --------------------
//#region -------------------- Collection iterator --------------------

/**
 * Tell that the {@link CollectionIterator iterator} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnNullableCollectionIterator
 */
export type HasAtMost2ElementsOnCollectionIterator<T extends CollectionIterator, >
    = T["size"] extends | 0 | 1 | 2 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link CollectionIterator iterator} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnCollectionIterator
 */
export type HasAtMost2ElementsOnNullableCollectionIterator<T extends Nullable<CollectionIterator>, >
    = T extends NullOrUndefined    ? true
    : T extends CollectionIterator ? HasAtMost2ElementsOnCollectionIterator<T> : never

//#endregion -------------------- Collection iterator --------------------
//#region -------------------- Array --------------------

/**
 * Tell that the {@link ReadonlyArray collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnNullableArray
 * @see HasAtMost2ElementsOn
 */
export type HasAtMost2ElementsOnArray<T extends Array<unknown>, >
    = T["length"] extends | 0 | 1 | 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlyArray collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnArray
 * @see HasAtMost2ElementsOnNullable
 */
export type HasAtMost2ElementsOnNullableArray<T extends Nullable<Array<unknown>>, >
    = T extends NullOrUndefined ? true
    : T extends Array<unknown>  ? HasAtMost2ElementsOnArray<T> : never

//#endregion -------------------- Array --------------------
//#region -------------------- Int8 array --------------------

/**
 * Tell that the {@link Int8Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnNullableInt8Array
 * @see HasAtMost2ElementsOn
 */
export type HasAtMost2ElementsOnInt8Array<T extends Int8Array, >
    = T["length"] extends | 0 | 1 | 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Int8Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnInt8Array
 * @see HasAtMost2ElementsOnNullable
 */
export type HasAtMost2ElementsOnNullableInt8Array<T extends Nullable<Int8Array>, >
    = T extends NullOrUndefined ? true
    : T extends Int8Array       ? HasAtMost2ElementsOnInt8Array<T> : never

//#endregion -------------------- Int8 array --------------------
//#region -------------------- Uint8 array --------------------

/**
 * Tell that the {@link Uint8Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnNullableUint8Array
 * @see HasAtMost2ElementsOn
 */
export type HasAtMost2ElementsOnUint8Array<T extends Uint8Array, >
    = T["length"] extends | 0 | 1 | 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint8Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnUint8Array
 * @see HasAtMost2ElementsOnNullable
 */
export type HasAtMost2ElementsOnNullableUint8Array<T extends Nullable<Uint8Array>, >
    = T extends NullOrUndefined ? true
    : T extends Uint8Array      ? HasAtMost2ElementsOnUint8Array<T> : never

//#endregion -------------------- Uint8 array --------------------
//#region -------------------- Uint8 clamped array --------------------

/**
 * Tell that the {@link Uint8Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnNullableUint8ClampedArray
 * @see HasAtMost2ElementsOn
 */
export type HasAtMost2ElementsOnUint8ClampedArray<T extends Uint8ClampedArray, >
    = T["length"] extends | 0 | 1 | 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint8Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnUint8ClampedArray
 * @see HasAtMost2ElementsOnNullable
 */
export type HasAtMost2ElementsOnNullableUint8ClampedArray<T extends Nullable<Uint8ClampedArray>, >
    = T extends NullOrUndefined   ? true
    : T extends Uint8ClampedArray ? HasAtMost2ElementsOnUint8ClampedArray<T> : never

//#endregion -------------------- Uint8 clamped array --------------------
//#region -------------------- Int16 array --------------------

/**
 * Tell that the {@link Int16Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnNullableInt16Array
 * @see HasAtMost2ElementsOn
 */
export type HasAtMost2ElementsOnInt16Array<T extends Int16Array, >
    = T["length"] extends | 0 | 1 | 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Int16Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnInt16Array
 * @see HasAtMost2ElementsOnNullable
 */
export type HasAtMost2ElementsOnNullableInt16Array<T extends Nullable<Int16Array>, >
    = T extends NullOrUndefined ? true
    : T extends Int16Array      ? HasAtMost2ElementsOnInt16Array<T> : never

//#endregion -------------------- Int16 array --------------------
//#region -------------------- Uint16 array --------------------

/**
 * Tell that the {@link Uint16Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnNullableUint16Array
 * @see HasAtMost2ElementsOn
 */
export type HasAtMost2ElementsOnUint16Array<T extends Uint16Array, >
    = T["length"] extends | 0 | 1 | 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint16Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnUint16Array
 * @see HasAtMost2ElementsOnNullable
 */
export type HasAtMost2ElementsOnNullableUint16Array<T extends Nullable<Uint16Array>, >
    = T extends NullOrUndefined ? true
    : T extends Uint16Array     ? HasAtMost2ElementsOnUint16Array<T> : never

//#endregion -------------------- Uint16 array --------------------
//#region -------------------- Int32 array --------------------

/**
 * Tell that the {@link Int32Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnNullableInt32Array
 * @see HasAtMost2ElementsOn
 */
export type HasAtMost2ElementsOnInt32Array<T extends Int32Array, >
    = T["length"] extends | 0 | 1 | 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Int32Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnInt32Array
 * @see HasAtMost2ElementsOnNullable
 */
export type HasAtMost2ElementsOnNullableInt32Array<T extends Nullable<Int32Array>, >
    = T extends NullOrUndefined ? true
    : T extends Int32Array      ? HasAtMost2ElementsOnInt32Array<T> : never

//#endregion -------------------- Int32 array --------------------
//#region -------------------- Uint32 array --------------------

/**
 * Tell that the {@link Uint32Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnNullableUint32Array
 * @see HasAtMost2ElementsOn
 */
export type HasAtMost2ElementsOnUint32Array<T extends Uint32Array, >
    = T["length"] extends | 0 | 1 | 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint32Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnUint32Array
 * @see HasAtMost2ElementsOnNullable
 */
export type HasAtMost2ElementsOnNullableUint32Array<T extends Nullable<Uint32Array>, >
    = T extends NullOrUndefined ? true
    : T extends Uint32Array     ? HasAtMost2ElementsOnUint32Array<T> : never

//#endregion -------------------- Uint32 array --------------------
//#region -------------------- BigInt64 array --------------------

/**
 * Tell that the {@link BigInt64Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnNullableBigInt64Array
 * @see HasAtMost2ElementsOn
 */
export type HasAtMost2ElementsOnBigInt64Array<T extends BigInt64Array, >
    = T["length"] extends | 0 | 1 | 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link BigInt64Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnBigInt64Array
 * @see HasAtMost2ElementsOnNullable
 */
export type HasAtMost2ElementsOnNullableBigInt64Array<T extends Nullable<BigInt64Array>, >
    = T extends NullOrUndefined ? true
    : T extends BigInt64Array   ? HasAtMost2ElementsOnBigInt64Array<T> : never

//#endregion -------------------- BigInt64 array --------------------
//#region -------------------- BigUint64 array --------------------

/**
 * Tell that the {@link BigUint64Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnNullableBigUint64Array
 * @see HasAtMost2ElementsOn
 */
export type HasAtMost2ElementsOnBigUint64Array<T extends BigUint64Array, >
    = T["length"] extends | 0 | 1 | 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link BigUint64Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnBigUint64Array
 * @see HasAtMost2ElementsOnNullable
 */
export type HasAtMost2ElementsOnNullableBigUint64Array<T extends Nullable<BigUint64Array>, >
    = T extends NullOrUndefined ? true
    : T extends BigUint64Array  ? HasAtMost2ElementsOnBigUint64Array<T> : never

//#endregion -------------------- BigUint64 array --------------------
//#region -------------------- Float32 array --------------------

/**
 * Tell that the {@link Float32Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnNullableFloat32Array
 * @see HasAtMost2ElementsOn
 */
export type HasAtMost2ElementsOnFloat32Array<T extends Float32Array, >
    = T["length"] extends | 0 | 1 | 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Float32Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnFloat32Array
 * @see HasAtMost2ElementsOnNullable
 */
export type HasAtMost2ElementsOnNullableFloat32Array<T extends Nullable<Float32Array>, >
    = T extends NullOrUndefined ? true
    : T extends Float32Array    ? HasAtMost2ElementsOnFloat32Array<T> : never

//#endregion -------------------- Float32 array --------------------
//#region -------------------- Float64 array --------------------

/**
 * Tell that the {@link Float64Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnNullableFloat64Array
 * @see HasAtMost2ElementsOn
 */
export type HasAtMost2ElementsOnFloat64Array<T extends Float64Array, >
    = T["length"] extends | 0 | 1 | 2 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Float64Array collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnFloat64Array
 * @see HasAtMost2ElementsOnNullable
 */
export type HasAtMost2ElementsOnNullableFloat64Array<T extends Nullable<Float64Array>, >
    = T extends NullOrUndefined ? true
    : T extends Float64Array    ? HasAtMost2ElementsOnFloat64Array<T> : never

//#endregion -------------------- Float64 array --------------------
//#region -------------------- Set --------------------

/**
 * Tell that the {@link ReadonlySet collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnNullableSet
 * @see HasAtMost2ElementsOn
 */
export type HasAtMost2ElementsOnSet<T extends Set<unknown>, >
    = T["size"] extends | 0 | 1 | 2 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlySet collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnSet
 * @see HasAtMost2ElementsOnNullable
 */
export type HasAtMost2ElementsOnNullableSet<T extends Nullable<Set<unknown>>, >
    = T extends NullOrUndefined ? true
    : T extends Set<unknown>    ? HasAtMost2ElementsOnSet<T> : never

//#endregion -------------------- Set --------------------
//#region -------------------- Map --------------------

/**
 * Tell that the {@link ReadonlyMap collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnNullableMap
 * @see HasAtMost2ElementsOn
 */
export type HasAtMost2ElementsOnMap<T extends Map<unknown, unknown>, >
    = T["size"] extends | 0 | 1 | 2 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlyMap collection} has at most 2 elements
 *
 * @see HasAtMost2ElementsOnMap
 * @see HasAtMost2ElementsOnNullable
 */
export type HasAtMost2ElementsOnNullableMap<T extends Nullable<Map<unknown, unknown>>, >
    = T extends NullOrUndefined       ? true
    : T extends Map<unknown, unknown> ? HasAtMost2ElementsOnMap<T> : never

//#endregion -------------------- Map --------------------
