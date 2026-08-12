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
 * {@link ReadonlyArray Array}, {@link TypedArray}, {@link ReadonlySet Set} or {@link ReadonlyMap Map}) has at most 1 element
 *
 * @see HasAtMost1ElementOnMinimalistCollectionHolder
 * @see HasAtMost1ElementOnCollectionHolder
 * @see HasAtMost1ElementOnArray
 * @see HasAtMost1ElementOnInt8Array
 * @see HasAtMost1ElementOnUint8Array
 * @see HasAtMost1ElementOnUint8ClampedArray
 * @see HasAtMost1ElementOnInt16Array
 * @see HasAtMost1ElementOnUint16Array
 * @see HasAtMost1ElementOnInt32Array
 * @see HasAtMost1ElementOnUint32Array
 * @see HasAtMost1ElementOnBigInt64Array
 * @see HasAtMost1ElementOnBigUint64Array
 * @see HasAtMost1ElementOnFloat32Array
 * @see HasAtMost1ElementOnFloat64Array
 * @see HasAtMost1ElementOnSet
 * @see HasAtMost1ElementOnMap
 * @see HasAtMost1ElementOnNullable
 */
export type HasAtMost1ElementOn<T extends MinimalistCollectionHolder | Array<unknown> | TypedArray | Set<unknown> | Map<unknown, unknown>, >
    = T extends MinimalistCollectionHolder ? HasAtMost1ElementOnMinimalistCollectionHolder<T>
    : T extends CollectionHolder           ? HasAtMost1ElementOnCollectionHolder<T>
    : T extends Array<unknown>             ? HasAtMost1ElementOnArray<T>
    : T extends Int8Array                  ? HasAtMost1ElementOnInt8Array<T>
    : T extends Uint8Array                 ? HasAtMost1ElementOnUint8Array<T>
    : T extends Uint8ClampedArray          ? HasAtMost1ElementOnUint8ClampedArray<T>
    : T extends Int16Array                 ? HasAtMost1ElementOnInt16Array<T>
    : T extends Uint16Array                ? HasAtMost1ElementOnUint16Array<T>
    : T extends Int32Array                 ? HasAtMost1ElementOnInt32Array<T>
    : T extends Uint32Array                ? HasAtMost1ElementOnUint32Array<T>
    : T extends BigInt64Array              ? HasAtMost1ElementOnBigInt64Array<T>
    : T extends BigUint64Array             ? HasAtMost1ElementOnBigUint64Array<T>
    : T extends Float32Array               ? HasAtMost1ElementOnFloat32Array<T>
    : T extends Float64Array               ? HasAtMost1ElementOnFloat64Array<T>
    : T extends Set<unknown>               ? HasAtMost1ElementOnSet<T>
    : T extends Map<unknown, unknown>      ? HasAtMost1ElementOnMap<T> : never

/**
 * Tell that the {@link Nullable nullable} collection
 * ({@link MinimalistCollectionHolder}, {@link CollectionHolder},
 * {@link ReadonlyArray Array}, {@link TypedArray}, {@link ReadonlySet Set} or {@link ReadonlyMap Map}) has at most 1 element
 *
 * @see HasAtMost1ElementOnNullableMinimalistCollectionHolder
 * @see HasAtMost1ElementOnNullableCollectionHolder
 * @see HasAtMost1ElementOnNullableArray
 * @see HasAtMost1ElementOnInt8Array
 * @see HasAtMost1ElementOnUint8Array
 * @see HasAtMost1ElementOnUint8ClampedArray
 * @see HasAtMost1ElementOnInt16Array
 * @see HasAtMost1ElementOnUint16Array
 * @see HasAtMost1ElementOnInt32Array
 * @see HasAtMost1ElementOnUint32Array
 * @see HasAtMost1ElementOnBigInt64Array
 * @see HasAtMost1ElementOnBigUint64Array
 * @see HasAtMost1ElementOnFloat32Array
 * @see HasAtMost1ElementOnFloat64Array
 * @see HasAtMost1ElementOnNullableSet
 * @see HasAtMost1ElementOnNullableMap
 * @see HasAtMost1ElementOn
 */
export type HasAtMost1ElementOnNullable<T extends Nullable<| MinimalistCollectionHolder | Array<unknown> | TypedArray | Set<unknown> | Map<unknown, unknown>>, >
    = T extends NullOrUndefined            ? true
    : T extends MinimalistCollectionHolder ? HasAtMost1ElementOnMinimalistCollectionHolder<T>
    : T extends CollectionHolder           ? HasAtMost1ElementOnCollectionHolder<T>
    : T extends Array<unknown>             ? HasAtMost1ElementOnArray<T>
    : T extends Int8Array                  ? HasAtMost1ElementOnInt8Array<T>
    : T extends Uint8Array                 ? HasAtMost1ElementOnUint8Array<T>
    : T extends Uint8ClampedArray          ? HasAtMost1ElementOnUint8ClampedArray<T>
    : T extends Int16Array                 ? HasAtMost1ElementOnInt16Array<T>
    : T extends Uint16Array                ? HasAtMost1ElementOnUint16Array<T>
    : T extends Int32Array                 ? HasAtMost1ElementOnInt32Array<T>
    : T extends Uint32Array                ? HasAtMost1ElementOnUint32Array<T>
    : T extends BigInt64Array              ? HasAtMost1ElementOnBigInt64Array<T>
    : T extends BigUint64Array             ? HasAtMost1ElementOnBigUint64Array<T>
    : T extends Float32Array               ? HasAtMost1ElementOnFloat32Array<T>
    : T extends Float64Array               ? HasAtMost1ElementOnFloat64Array<T>
    : T extends Set<unknown>               ? HasAtMost1ElementOnSet<T>
    : T extends Map<unknown, unknown>      ? HasAtMost1ElementOnMap<T> : never

//#region -------------------- Minimalist collection holder --------------------

/**
 * Tell that the {@link MinimalistCollectionHolder collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnNullableMinimalistCollectionHolder
 * @see HasAtMost1ElementOn
 */
export type HasAtMost1ElementOnMinimalistCollectionHolder<T extends MinimalistCollectionHolder, >
    = T["size"] extends | 0 | 1 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link MinimalistCollectionHolder collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnMinimalistCollectionHolder
 * @see HasAtMost1ElementOnNullable
 */
export type HasAtMost1ElementOnNullableMinimalistCollectionHolder<T extends Nullable<MinimalistCollectionHolder>, >
    = T extends NullOrUndefined            ? true
    : T extends MinimalistCollectionHolder ? HasAtMost1ElementOnMinimalistCollectionHolder<T> : never

//#endregion -------------------- Minimalist collection holder --------------------
//#region -------------------- Collection holder --------------------

/**
 * Tell that the {@link CollectionHolder collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnNullableCollectionHolder
 * @see HasAtMost1ElementOn
 */
export type HasAtMost1ElementOnCollectionHolder<T extends CollectionHolder, >
    = T["size"] extends | 0 | 1 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link CollectionHolder collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnCollectionHolder
 * @see HasAtMost1ElementOnNullable
 */
export type HasAtMost1ElementOnNullableCollectionHolder<T extends Nullable<CollectionHolder>, >
    = T extends NullOrUndefined  ? true
    : T extends CollectionHolder ? HasAtMost1ElementOnCollectionHolder<T> : never

//#endregion -------------------- Collection holder --------------------
//#region -------------------- Collection iterator --------------------

/**
 * Tell that the {@link CollectionIterator iterator} has at most 1 element
 *
 * @see HasAtMost1ElementOnNullableCollectionIterator
 */
export type HasAtMost1ElementOnCollectionIterator<T extends CollectionIterator, >
    = T["size"] extends | 0 | 1 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link CollectionIterator iterator} has at most 1 element
 *
 * @see HasAtMost1ElementOnCollectionIterator
 */
export type HasAtMost1ElementOnNullableCollectionIterator<T extends Nullable<CollectionIterator>, >
    = T extends NullOrUndefined    ? true
    : T extends CollectionIterator ? HasAtMost1ElementOnCollectionIterator<T> : never

//#endregion -------------------- Collection iterator --------------------
//#region -------------------- Array --------------------

/**
 * Tell that the {@link ReadonlyArray collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnNullableArray
 * @see HasAtMost1ElementOn
 */
export type HasAtMost1ElementOnArray<T extends Array<unknown>, >
    = T["length"] extends | 0 | 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlyArray collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnArray
 * @see HasAtMost1ElementOnNullable
 */
export type HasAtMost1ElementOnNullableArray<T extends Nullable<Array<unknown>>, >
    = T extends NullOrUndefined ? true
    : T extends Array<unknown>  ? HasAtMost1ElementOnArray<T> : never

//#endregion -------------------- Array --------------------
//#region -------------------- Int8 array --------------------

/**
 * Tell that the {@link Int8Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnNullableInt8Array
 * @see HasAtMost1ElementOn
 */
export type HasAtMost1ElementOnInt8Array<T extends Int8Array, >
    = T["length"] extends | 0 | 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Int8Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnInt8Array
 * @see HasAtMost1ElementOnNullable
 */
export type HasAtMost1ElementOnNullableInt8Array<T extends Nullable<Int8Array>, >
    = T extends NullOrUndefined ? true
    : T extends Int8Array       ? HasAtMost1ElementOnInt8Array<T> : never

//#endregion -------------------- Int8 array --------------------
//#region -------------------- Uint8 array --------------------

/**
 * Tell that the {@link Uint8Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnNullableUint8Array
 * @see HasAtMost1ElementOn
 */
export type HasAtMost1ElementOnUint8Array<T extends Uint8Array, >
    = T["length"] extends | 0 | 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint8Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnUint8Array
 * @see HasAtMost1ElementOnNullable
 */
export type HasAtMost1ElementOnNullableUint8Array<T extends Nullable<Uint8Array>, >
    = T extends NullOrUndefined ? true
    : T extends Uint8Array      ? HasAtMost1ElementOnUint8Array<T> : never

//#endregion -------------------- Uint8 array --------------------
//#region -------------------- Uint8 clamped array --------------------

/**
 * Tell that the {@link Uint8Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnNullableUint8ClampedArray
 * @see HasAtMost1ElementOn
 */
export type HasAtMost1ElementOnUint8ClampedArray<T extends Uint8ClampedArray, >
    = T["length"] extends | 0 | 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint8Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnUint8ClampedArray
 * @see HasAtMost1ElementOnNullable
 */
export type HasAtMost1ElementOnNullableUint8ClampedArray<T extends Nullable<Uint8ClampedArray>, >
    = T extends NullOrUndefined   ? true
    : T extends Uint8ClampedArray ? HasAtMost1ElementOnUint8ClampedArray<T> : never

//#endregion -------------------- Uint8 clamped array --------------------
//#region -------------------- Int16 array --------------------

/**
 * Tell that the {@link Int16Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnNullableInt16Array
 * @see HasAtMost1ElementOn
 */
export type HasAtMost1ElementOnInt16Array<T extends Int16Array, >
    = T["length"] extends | 0 | 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Int16Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnInt16Array
 * @see HasAtMost1ElementOnNullable
 */
export type HasAtMost1ElementOnNullableInt16Array<T extends Nullable<Int16Array>, >
    = T extends NullOrUndefined ? true
    : T extends Int16Array      ? HasAtMost1ElementOnInt16Array<T> : never

//#endregion -------------------- Int16 array --------------------
//#region -------------------- Uint16 array --------------------

/**
 * Tell that the {@link Uint16Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnNullableUint16Array
 * @see HasAtMost1ElementOn
 */
export type HasAtMost1ElementOnUint16Array<T extends Uint16Array, >
    = T["length"] extends | 0 | 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint16Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnUint16Array
 * @see HasAtMost1ElementOnNullable
 */
export type HasAtMost1ElementOnNullableUint16Array<T extends Nullable<Uint16Array>, >
    = T extends NullOrUndefined ? true
    : T extends Uint16Array     ? HasAtMost1ElementOnUint16Array<T> : never

//#endregion -------------------- Uint16 array --------------------
//#region -------------------- Int32 array --------------------

/**
 * Tell that the {@link Int32Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnNullableInt32Array
 * @see HasAtMost1ElementOn
 */
export type HasAtMost1ElementOnInt32Array<T extends Int32Array, >
    = T["length"] extends | 0 | 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Int32Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnInt32Array
 * @see HasAtMost1ElementOnNullable
 */
export type HasAtMost1ElementOnNullableInt32Array<T extends Nullable<Int32Array>, >
    = T extends NullOrUndefined ? true
    : T extends Int32Array      ? HasAtMost1ElementOnInt32Array<T> : never

//#endregion -------------------- Int32 array --------------------
//#region -------------------- Uint32 array --------------------

/**
 * Tell that the {@link Uint32Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnNullableUint32Array
 * @see HasAtMost1ElementOn
 */
export type HasAtMost1ElementOnUint32Array<T extends Uint32Array, >
    = T["length"] extends | 0 | 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint32Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnUint32Array
 * @see HasAtMost1ElementOnNullable
 */
export type HasAtMost1ElementOnNullableUint32Array<T extends Nullable<Uint32Array>, >
    = T extends NullOrUndefined ? true
    : T extends Uint32Array     ? HasAtMost1ElementOnUint32Array<T> : never

//#endregion -------------------- Uint32 array --------------------
//#region -------------------- BigInt64 array --------------------

/**
 * Tell that the {@link BigInt64Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnNullableBigInt64Array
 * @see HasAtMost1ElementOn
 */
export type HasAtMost1ElementOnBigInt64Array<T extends BigInt64Array, >
    = T["length"] extends | 0 | 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link BigInt64Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnBigInt64Array
 * @see HasAtMost1ElementOnNullable
 */
export type HasAtMost1ElementOnNullableBigInt64Array<T extends Nullable<BigInt64Array>, >
    = T extends NullOrUndefined ? true
    : T extends BigInt64Array   ? HasAtMost1ElementOnBigInt64Array<T> : never

//#endregion -------------------- BigInt64 array --------------------
//#region -------------------- BigUint64 array --------------------

/**
 * Tell that the {@link BigUint64Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnNullableBigUint64Array
 * @see HasAtMost1ElementOn
 */
export type HasAtMost1ElementOnBigUint64Array<T extends BigUint64Array, >
    = T["length"] extends | 0 | 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link BigUint64Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnBigUint64Array
 * @see HasAtMost1ElementOnNullable
 */
export type HasAtMost1ElementOnNullableBigUint64Array<T extends Nullable<BigUint64Array>, >
    = T extends NullOrUndefined ? true
    : T extends BigUint64Array  ? HasAtMost1ElementOnBigUint64Array<T> : never

//#endregion -------------------- BigUint64 array --------------------
//#region -------------------- Float32 array --------------------

/**
 * Tell that the {@link Float32Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnNullableFloat32Array
 * @see HasAtMost1ElementOn
 */
export type HasAtMost1ElementOnFloat32Array<T extends Float32Array, >
    = T["length"] extends | 0 | 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Float32Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnFloat32Array
 * @see HasAtMost1ElementOnNullable
 */
export type HasAtMost1ElementOnNullableFloat32Array<T extends Nullable<Float32Array>, >
    = T extends NullOrUndefined ? true
    : T extends Float32Array    ? HasAtMost1ElementOnFloat32Array<T> : never

//#endregion -------------------- Float32 array --------------------
//#region -------------------- Float64 array --------------------

/**
 * Tell that the {@link Float64Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnNullableFloat64Array
 * @see HasAtMost1ElementOn
 */
export type HasAtMost1ElementOnFloat64Array<T extends Float64Array, >
    = T["length"] extends | 0 | 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Float64Array collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnFloat64Array
 * @see HasAtMost1ElementOnNullable
 */
export type HasAtMost1ElementOnNullableFloat64Array<T extends Nullable<Float64Array>, >
    = T extends NullOrUndefined ? true
    : T extends Float64Array    ? HasAtMost1ElementOnFloat64Array<T> : never

//#endregion -------------------- Float64 array --------------------
//#region -------------------- Set --------------------

/**
 * Tell that the {@link ReadonlySet collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnNullableSet
 * @see HasAtMost1ElementOn
 */
export type HasAtMost1ElementOnSet<T extends Set<unknown>, >
    = T["size"] extends | 0 | 1 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlySet collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnSet
 * @see HasAtMost1ElementOnNullable
 */
export type HasAtMost1ElementOnNullableSet<T extends Nullable<Set<unknown>>, >
    = T extends NullOrUndefined ? true
    : T extends Set<unknown>    ? HasAtMost1ElementOnSet<T> : never

//#endregion -------------------- Set --------------------
//#region -------------------- Map --------------------

/**
 * Tell that the {@link ReadonlyMap collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnNullableMap
 * @see HasAtMost1ElementOn
 */
export type HasAtMost1ElementOnMap<T extends Map<unknown, unknown>, >
    = T["size"] extends | 0 | 1 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlyMap collection} has at most 1 element
 *
 * @see HasAtMost1ElementOnMap
 * @see HasAtMost1ElementOnNullable
 */
export type HasAtMost1ElementOnNullableMap<T extends Nullable<Map<unknown, unknown>>, >
    = T extends NullOrUndefined       ? true
    : T extends Map<unknown, unknown> ? HasAtMost1ElementOnMap<T> : never

//#endregion -------------------- Map --------------------
