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
 * @see HasExactly1ElementOnMinimalistCollectionHolder
 * @see HasExactly1ElementOnCollectionHolder
 * @see HasExactly1ElementOnArray
 * @see HasExactly1ElementOnInt8Array
 * @see HasExactly1ElementOnUint8Array
 * @see HasExactly1ElementOnUint8ClampedArray
 * @see HasExactly1ElementOnInt16Array
 * @see HasExactly1ElementOnUint16Array
 * @see HasExactly1ElementOnInt32Array
 * @see HasExactly1ElementOnUint32Array
 * @see HasExactly1ElementOnBigInt64Array
 * @see HasExactly1ElementOnBigUint64Array
 * @see HasExactly1ElementOnFloat32Array
 * @see HasExactly1ElementOnFloat64Array
 * @see HasExactly1ElementOnSet
 * @see HasExactly1ElementOnMap
 * @see HasExactly1ElementOnNullable
 */
export type HasExactly1ElementOn<T extends MinimalistCollectionHolder | Array<unknown> | TypedArray | Set<unknown> | Map<unknown, unknown>, >
    = T extends MinimalistCollectionHolder ? HasExactly1ElementOnMinimalistCollectionHolder<T>
    : T extends CollectionHolder           ? HasExactly1ElementOnCollectionHolder<T>
    : T extends Array<unknown>             ? HasExactly1ElementOnArray<T>
    : T extends Int8Array                  ? HasExactly1ElementOnInt8Array<T>
    : T extends Uint8Array                 ? HasExactly1ElementOnUint8Array<T>
    : T extends Uint8ClampedArray          ? HasExactly1ElementOnUint8ClampedArray<T>
    : T extends Int16Array                 ? HasExactly1ElementOnInt16Array<T>
    : T extends Uint16Array                ? HasExactly1ElementOnUint16Array<T>
    : T extends Int32Array                 ? HasExactly1ElementOnInt32Array<T>
    : T extends Uint32Array                ? HasExactly1ElementOnUint32Array<T>
    : T extends BigInt64Array              ? HasExactly1ElementOnBigInt64Array<T>
    : T extends BigUint64Array             ? HasExactly1ElementOnBigUint64Array<T>
    : T extends Float32Array               ? HasExactly1ElementOnFloat32Array<T>
    : T extends Float64Array               ? HasExactly1ElementOnFloat64Array<T>
    : T extends Set<unknown>               ? HasExactly1ElementOnSet<T>
    : T extends Map<unknown, unknown>      ? HasExactly1ElementOnMap<T> : never

/**
 * Tell that the {@link Nullable nullable} collection
 * ({@link MinimalistCollectionHolder}, {@link CollectionHolder},
 * {@link ReadonlyArray Array}, {@link TypedArray}, {@link ReadonlySet Set} or {@link ReadonlyMap Map}) has exactly 1 element
 *
 * @see HasExactly1ElementOnNullableMinimalistCollectionHolder
 * @see HasExactly1ElementOnNullableCollectionHolder
 * @see HasExactly1ElementOnNullableArray
 * @see HasExactly1ElementOnInt8Array
 * @see HasExactly1ElementOnUint8Array
 * @see HasExactly1ElementOnUint8ClampedArray
 * @see HasExactly1ElementOnInt16Array
 * @see HasExactly1ElementOnUint16Array
 * @see HasExactly1ElementOnInt32Array
 * @see HasExactly1ElementOnUint32Array
 * @see HasExactly1ElementOnBigInt64Array
 * @see HasExactly1ElementOnBigUint64Array
 * @see HasExactly1ElementOnFloat32Array
 * @see HasExactly1ElementOnFloat64Array
 * @see HasExactly1ElementOnNullableSet
 * @see HasExactly1ElementOnNullableMap
 * @see HasExactly1ElementOn
 */
export type HasExactly1ElementOnNullable<T extends Nullable<| MinimalistCollectionHolder | Array<unknown> | TypedArray | Set<unknown> | Map<unknown, unknown>>, >
    = T extends NullOrUndefined            ? false
    : T extends MinimalistCollectionHolder ? HasExactly1ElementOnMinimalistCollectionHolder<T>
    : T extends CollectionHolder           ? HasExactly1ElementOnCollectionHolder<T>
    : T extends Array<unknown>             ? HasExactly1ElementOnArray<T>
    : T extends Int8Array                  ? HasExactly1ElementOnInt8Array<T>
    : T extends Uint8Array                 ? HasExactly1ElementOnUint8Array<T>
    : T extends Uint8ClampedArray          ? HasExactly1ElementOnUint8ClampedArray<T>
    : T extends Int16Array                 ? HasExactly1ElementOnInt16Array<T>
    : T extends Uint16Array                ? HasExactly1ElementOnUint16Array<T>
    : T extends Int32Array                 ? HasExactly1ElementOnInt32Array<T>
    : T extends Uint32Array                ? HasExactly1ElementOnUint32Array<T>
    : T extends BigInt64Array              ? HasExactly1ElementOnBigInt64Array<T>
    : T extends BigUint64Array             ? HasExactly1ElementOnBigUint64Array<T>
    : T extends Float32Array               ? HasExactly1ElementOnFloat32Array<T>
    : T extends Float64Array               ? HasExactly1ElementOnFloat64Array<T>
    : T extends Set<unknown>               ? HasExactly1ElementOnSet<T>
    : T extends Map<unknown, unknown>      ? HasExactly1ElementOnMap<T> : never

//#region -------------------- Minimalist collection holder --------------------

/**
 * Tell that the {@link MinimalistCollectionHolder collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnNullableMinimalistCollectionHolder
 * @see HasExactly1ElementOn
 */
export type HasExactly1ElementOnMinimalistCollectionHolder<T extends MinimalistCollectionHolder, >
    = T["size"] extends 1 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link MinimalistCollectionHolder collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnMinimalistCollectionHolder
 * @see HasExactly1ElementOnNullable
 */
export type HasExactly1ElementOnNullableMinimalistCollectionHolder<T extends Nullable<MinimalistCollectionHolder>, >
    = T extends NullOrUndefined            ? false
    : T extends MinimalistCollectionHolder ? HasExactly1ElementOnMinimalistCollectionHolder<T> : never

//#endregion -------------------- Minimalist collection holder --------------------
//#region -------------------- Collection holder --------------------

/**
 * Tell that the {@link CollectionHolder collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnNullableCollectionHolder
 * @see HasExactly1ElementOn
 */
export type HasExactly1ElementOnCollectionHolder<T extends CollectionHolder, >
    = T["size"] extends 1 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link CollectionHolder collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnCollectionHolder
 * @see HasExactly1ElementOnNullable
 */
export type HasExactly1ElementOnNullableCollectionHolder<T extends Nullable<CollectionHolder>, >
    = T extends NullOrUndefined  ? false
    : T extends CollectionHolder ? HasExactly1ElementOnCollectionHolder<T> : never

//#endregion -------------------- Collection holder --------------------
//#region -------------------- Collection iterator --------------------

/**
 * Tell that the {@link CollectionIterator iterator} has exactly 1 element
 *
 * @see HasExactly1ElementOnNullableCollectionIterator
 */
export type HasExactly1ElementOnCollectionIterator<T extends CollectionIterator, >
    = T["size"] extends 1 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link CollectionIterator iterator} has exactly 1 element
 *
 * @see HasExactly1ElementOnCollectionIterator
 */
export type HasExactly1ElementOnNullableCollectionIterator<T extends Nullable<CollectionIterator>, >
    = T extends NullOrUndefined    ? false
    : T extends CollectionIterator ? HasExactly1ElementOnCollectionIterator<T> : never

//#endregion -------------------- Collection iterator --------------------
//#region -------------------- Array --------------------

/**
 * Tell that the {@link ReadonlyArray collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnNullableArray
 * @see HasExactly1ElementOn
 */
export type HasExactly1ElementOnArray<T extends Array<unknown>, >
    = T["length"] extends 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlyArray collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnArray
 * @see HasExactly1ElementOnNullable
 */
export type HasExactly1ElementOnNullableArray<T extends Nullable<Array<unknown>>, >
    = T extends NullOrUndefined ? false
    : T extends Array<unknown>  ? HasExactly1ElementOnArray<T> : never

//#endregion -------------------- Array --------------------
//#region -------------------- Int8 array --------------------

/**
 * Tell that the {@link Int8Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnNullableInt8Array
 * @see HasExactly1ElementOn
 */
export type HasExactly1ElementOnInt8Array<T extends Int8Array, >
    = T["length"] extends 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Int8Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnInt8Array
 * @see HasExactly1ElementOnNullable
 */
export type HasExactly1ElementOnNullableInt8Array<T extends Nullable<Int8Array>, >
    = T extends NullOrUndefined ? false
    : T extends Int8Array       ? HasExactly1ElementOnInt8Array<T> : never

//#endregion -------------------- Int8 array --------------------
//#region -------------------- Uint8 array --------------------

/**
 * Tell that the {@link Uint8Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnNullableUint8Array
 * @see HasExactly1ElementOn
 */
export type HasExactly1ElementOnUint8Array<T extends Uint8Array, >
    = T["length"] extends 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint8Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnUint8Array
 * @see HasExactly1ElementOnNullable
 */
export type HasExactly1ElementOnNullableUint8Array<T extends Nullable<Uint8Array>, >
    = T extends NullOrUndefined ? false
    : T extends Uint8Array      ? HasExactly1ElementOnUint8Array<T> : never

//#endregion -------------------- Uint8 array --------------------
//#region -------------------- Uint8 clamped array --------------------

/**
 * Tell that the {@link Uint8Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnNullableUint8ClampedArray
 * @see HasExactly1ElementOn
 */
export type HasExactly1ElementOnUint8ClampedArray<T extends Uint8ClampedArray, >
    = T["length"] extends 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint8Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnUint8ClampedArray
 * @see HasExactly1ElementOnNullable
 */
export type HasExactly1ElementOnNullableUint8ClampedArray<T extends Nullable<Uint8ClampedArray>, >
    = T extends NullOrUndefined   ? false
    : T extends Uint8ClampedArray ? HasExactly1ElementOnUint8ClampedArray<T> : never

//#endregion -------------------- Uint8 clamped array --------------------
//#region -------------------- Int16 array --------------------

/**
 * Tell that the {@link Int16Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnNullableInt16Array
 * @see HasExactly1ElementOn
 */
export type HasExactly1ElementOnInt16Array<T extends Int16Array, >
    = T["length"] extends 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Int16Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnInt16Array
 * @see HasExactly1ElementOnNullable
 */
export type HasExactly1ElementOnNullableInt16Array<T extends Nullable<Int16Array>, >
    = T extends NullOrUndefined ? false
    : T extends Int16Array      ? HasExactly1ElementOnInt16Array<T> : never

//#endregion -------------------- Int16 array --------------------
//#region -------------------- Uint16 array --------------------

/**
 * Tell that the {@link Uint16Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnNullableUint16Array
 * @see HasExactly1ElementOn
 */
export type HasExactly1ElementOnUint16Array<T extends Uint16Array, >
    = T["length"] extends 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint16Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnUint16Array
 * @see HasExactly1ElementOnNullable
 */
export type HasExactly1ElementOnNullableUint16Array<T extends Nullable<Uint16Array>, >
    = T extends NullOrUndefined ? false
    : T extends Uint16Array     ? HasExactly1ElementOnUint16Array<T> : never

//#endregion -------------------- Uint16 array --------------------
//#region -------------------- Int32 array --------------------

/**
 * Tell that the {@link Int32Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnNullableInt32Array
 * @see HasExactly1ElementOn
 */
export type HasExactly1ElementOnInt32Array<T extends Int32Array, >
    = T["length"] extends 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Int32Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnInt32Array
 * @see HasExactly1ElementOnNullable
 */
export type HasExactly1ElementOnNullableInt32Array<T extends Nullable<Int32Array>, >
    = T extends NullOrUndefined ? false
    : T extends Int32Array      ? HasExactly1ElementOnInt32Array<T> : never

//#endregion -------------------- Int32 array --------------------
//#region -------------------- Uint32 array --------------------

/**
 * Tell that the {@link Uint32Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnNullableUint32Array
 * @see HasExactly1ElementOn
 */
export type HasExactly1ElementOnUint32Array<T extends Uint32Array, >
    = T["length"] extends 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint32Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnUint32Array
 * @see HasExactly1ElementOnNullable
 */
export type HasExactly1ElementOnNullableUint32Array<T extends Nullable<Uint32Array>, >
    = T extends NullOrUndefined ? false
    : T extends Uint32Array     ? HasExactly1ElementOnUint32Array<T> : never

//#endregion -------------------- Uint32 array --------------------
//#region -------------------- BigInt64 array --------------------

/**
 * Tell that the {@link BigInt64Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnNullableBigInt64Array
 * @see HasExactly1ElementOn
 */
export type HasExactly1ElementOnBigInt64Array<T extends BigInt64Array, >
    = T["length"] extends 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link BigInt64Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnBigInt64Array
 * @see HasExactly1ElementOnNullable
 */
export type HasExactly1ElementOnNullableBigInt64Array<T extends Nullable<BigInt64Array>, >
    = T extends NullOrUndefined ? false
    : T extends BigInt64Array   ? HasExactly1ElementOnBigInt64Array<T> : never

//#endregion -------------------- BigInt64 array --------------------
//#region -------------------- BigUint64 array --------------------

/**
 * Tell that the {@link BigUint64Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnNullableBigUint64Array
 * @see HasExactly1ElementOn
 */
export type HasExactly1ElementOnBigUint64Array<T extends BigUint64Array, >
    = T["length"] extends 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link BigUint64Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnBigUint64Array
 * @see HasExactly1ElementOnNullable
 */
export type HasExactly1ElementOnNullableBigUint64Array<T extends Nullable<BigUint64Array>, >
    = T extends NullOrUndefined ? false
    : T extends BigUint64Array  ? HasExactly1ElementOnBigUint64Array<T> : never

//#endregion -------------------- BigUint64 array --------------------
//#region -------------------- Float32 array --------------------

/**
 * Tell that the {@link Float32Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnNullableFloat32Array
 * @see HasExactly1ElementOn
 */
export type HasExactly1ElementOnFloat32Array<T extends Float32Array, >
    = T["length"] extends 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Float32Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnFloat32Array
 * @see HasExactly1ElementOnNullable
 */
export type HasExactly1ElementOnNullableFloat32Array<T extends Nullable<Float32Array>, >
    = T extends NullOrUndefined ? false
    : T extends Float32Array    ? HasExactly1ElementOnFloat32Array<T> : never

//#endregion -------------------- Float32 array --------------------
//#region -------------------- Float64 array --------------------

/**
 * Tell that the {@link Float64Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnNullableFloat64Array
 * @see HasExactly1ElementOn
 */
export type HasExactly1ElementOnFloat64Array<T extends Float64Array, >
    = T["length"] extends 1 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Float64Array collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnFloat64Array
 * @see HasExactly1ElementOnNullable
 */
export type HasExactly1ElementOnNullableFloat64Array<T extends Nullable<Float64Array>, >
    = T extends NullOrUndefined ? false
    : T extends Float64Array    ? HasExactly1ElementOnFloat64Array<T> : never

//#endregion -------------------- Float64 array --------------------
//#region -------------------- Set --------------------

/**
 * Tell that the {@link ReadonlySet collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnNullableSet
 * @see HasExactly1ElementOn
 */
export type HasExactly1ElementOnSet<T extends Set<unknown>, >
    = T["size"] extends 1 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlySet collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnSet
 * @see HasExactly1ElementOnNullable
 */
export type HasExactly1ElementOnNullableSet<T extends Nullable<Set<unknown>>, >
    = T extends NullOrUndefined ? false
    : T extends Set<unknown>    ? HasExactly1ElementOnSet<T> : never

//#endregion -------------------- Set --------------------
//#region -------------------- Map --------------------

/**
 * Tell that the {@link ReadonlyMap collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnNullableMap
 * @see HasExactly1ElementOn
 */
export type HasExactly1ElementOnMap<T extends Map<unknown, unknown>, >
    = T["size"] extends 1 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlyMap collection} has exactly 1 element
 *
 * @see HasExactly1ElementOnMap
 * @see HasExactly1ElementOnNullable
 */
export type HasExactly1ElementOnNullableMap<T extends Nullable<Map<unknown, unknown>>, >
    = T extends NullOrUndefined       ? false
    : T extends Map<unknown, unknown> ? HasExactly1ElementOnMap<T> : never

//#endregion -------------------- Map --------------------
