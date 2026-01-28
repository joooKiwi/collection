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

import type {Nullable, NullOrUndefined} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {CollectionIterator}         from "../iterator/CollectionIterator"
import type {TypedArray}                 from "./TypedArray"

/**
 * Tell that the collection
 * ({@link MinimalistCollectionHolder}, {@link CollectionHolder},
 * {@link ReadonlyArray Array}, {@link TypedArray}, {@link ReadonlySet Set} or {@link ReadonlyMap Map}) is empty
 *
 * @see IsEmptyOnMinimalistCollectionHolder
 * @see IsEmptyOnCollectionHolder
 * @see IsEmptyOnArray
 * @see IsEmptyOnInt8Array
 * @see IsEmptyOnUint8Array
 * @see IsEmptyOnUint8ClampedArray
 * @see IsEmptyOnInt16Array
 * @see IsEmptyOnUint16Array
 * @see IsEmptyOnInt32Array
 * @see IsEmptyOnUint32Array
 * @see IsEmptyOnBigInt64Array
 * @see IsEmptyOnBigUint64Array
 * @see IsEmptyOnFloat32Array
 * @see IsEmptyOnFloat64Array
 * @see IsEmptyOnSet
 * @see IsEmptyOnMap
 * @see IsEmptyOnNullable
 */
export type IsEmptyOn<T extends MinimalistCollectionHolder | readonly unknown[] | TypedArray | ReadonlySet<unknown> | ReadonlyMap<unknown, unknown>, >
    = T extends MinimalistCollectionHolder    ? IsEmptyOnMinimalistCollectionHolder<T>
    : T extends CollectionHolder              ? IsEmptyOnCollectionHolder<T>
    : T extends readonly unknown[]            ? IsEmptyOnArray<T>
    : T extends Int8Array                     ? IsEmptyOnInt8Array<T>
    : T extends Uint8Array                    ? IsEmptyOnUint8Array<T>
    : T extends Uint8ClampedArray             ? IsEmptyOnUint8ClampedArray<T>
    : T extends Int16Array                    ? IsEmptyOnInt16Array<T>
    : T extends Uint16Array                   ? IsEmptyOnUint16Array<T>
    : T extends Int32Array                    ? IsEmptyOnInt32Array<T>
    : T extends Uint32Array                   ? IsEmptyOnUint32Array<T>
    : T extends BigInt64Array                 ? IsEmptyOnBigInt64Array<T>
    : T extends BigUint64Array                ? IsEmptyOnBigUint64Array<T>
    : T extends Float32Array                  ? IsEmptyOnFloat32Array<T>
    : T extends Float64Array                  ? IsEmptyOnFloat64Array<T>
    : T extends ReadonlySet<unknown>          ? IsEmptyOnSet<T>
    : T extends ReadonlyMap<unknown, unknown> ? IsEmptyOnMap<T> : never

/**
 * Tell that the {@link Nullable nullable} collection
 * ({@link MinimalistCollectionHolder}, {@link CollectionHolder},
 * {@link ReadonlyArray Array}, {@link TypedArray}, {@link ReadonlySet Set} or {@link ReadonlyMap Map}) is empty
 *
 * @see IsEmptyOnNullableMinimalistCollectionHolder
 * @see IsEmptyOnNullableCollectionHolder
 * @see IsEmptyOnNullableArray
 * @see IsEmptyOnInt8Array
 * @see IsEmptyOnUint8Array
 * @see IsEmptyOnUint8ClampedArray
 * @see IsEmptyOnInt16Array
 * @see IsEmptyOnUint16Array
 * @see IsEmptyOnInt32Array
 * @see IsEmptyOnUint32Array
 * @see IsEmptyOnBigInt64Array
 * @see IsEmptyOnBigUint64Array
 * @see IsEmptyOnFloat32Array
 * @see IsEmptyOnFloat64Array
 * @see IsEmptyOnNullableSet
 * @see IsEmptyOnNullableMap
 * @see IsEmptyOn
 */
export type IsEmptyOnNullable<T extends Nullable<| MinimalistCollectionHolder | readonly unknown[] | TypedArray | ReadonlySet<unknown> | ReadonlyMap<unknown, unknown>>, >
    = T extends NullOrUndefined               ? true
    : T extends MinimalistCollectionHolder    ? IsEmptyOnMinimalistCollectionHolder<T>
    : T extends CollectionHolder              ? IsEmptyOnCollectionHolder<T>
    : T extends readonly unknown[]            ? IsEmptyOnArray<T>
    : T extends Int8Array                     ? IsEmptyOnInt8Array<T>
    : T extends Uint8Array                    ? IsEmptyOnUint8Array<T>
    : T extends Uint8ClampedArray             ? IsEmptyOnUint8ClampedArray<T>
    : T extends Int16Array                    ? IsEmptyOnInt16Array<T>
    : T extends Uint16Array                   ? IsEmptyOnUint16Array<T>
    : T extends Int32Array                    ? IsEmptyOnInt32Array<T>
    : T extends Uint32Array                   ? IsEmptyOnUint32Array<T>
    : T extends BigInt64Array                 ? IsEmptyOnBigInt64Array<T>
    : T extends BigUint64Array                ? IsEmptyOnBigUint64Array<T>
    : T extends Float32Array                  ? IsEmptyOnFloat32Array<T>
    : T extends Float64Array                  ? IsEmptyOnFloat64Array<T>
    : T extends ReadonlySet<unknown>          ? IsEmptyOnSet<T>
    : T extends ReadonlyMap<unknown, unknown> ? IsEmptyOnMap<T> : never

//#region -------------------- Minimalist collection holder --------------------

/**
 * Tell that the {@link MinimalistCollectionHolder collection} is empty
 *
 * @see IsEmptyOnNullableMinimalistCollectionHolder
 * @see IsEmptyOn
 */
export type IsEmptyOnMinimalistCollectionHolder<T extends MinimalistCollectionHolder, >
    = T["size"] extends 0 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link MinimalistCollectionHolder collection} is empty
 *
 * @see IsEmptyOnMinimalistCollectionHolder
 * @see IsEmptyOnNullable
 */
export type IsEmptyOnNullableMinimalistCollectionHolder<T extends Nullable<MinimalistCollectionHolder>, >
    = T extends NullOrUndefined            ? true
    : T extends MinimalistCollectionHolder ? IsEmptyOnMinimalistCollectionHolder<T> : never

//#endregion -------------------- Minimalist collection holder --------------------
//#region -------------------- Collection holder --------------------

/**
 * Tell that the {@link CollectionHolder collection} is empty
 *
 * @see IsEmptyOnNullableCollectionHolder
 * @see IsEmptyOn
 */
export type IsEmptyOnCollectionHolder<T extends CollectionHolder, >
    = T["size"] extends 0 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link CollectionHolder collection} is empty
 *
 * @see IsEmptyOnCollectionHolder
 * @see IsEmptyOnNullable
 */
export type IsEmptyOnNullableCollectionHolder<T extends Nullable<CollectionHolder>, >
    = T extends NullOrUndefined  ? true
    : T extends CollectionHolder ? IsEmptyOnCollectionHolder<T> : never

//#endregion -------------------- Collection holder --------------------
//#region -------------------- Collection iterator --------------------

/**
 * Tell that the {@link CollectionIterator iterator} is empty
 *
 * @see IsEmptyOnNullableCollectionIterator
 */
export type IsEmptyOnCollectionIterator<T extends CollectionIterator, >
    = T["size"] extends 0 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link CollectionIterator iterator} is empty
 *
 * @see IsEmptyOnCollectionIterator
 */
export type IsEmptyOnNullableCollectionIterator<T extends Nullable<CollectionIterator>, >
    = T extends NullOrUndefined  ? true
    : T extends CollectionIterator ? IsEmptyOnCollectionIterator<T> : never

//#endregion -------------------- Collection iterator --------------------
//#region -------------------- Array --------------------

/**
 * Tell that the {@link ReadonlyArray collection} is empty
 *
 * @see IsEmptyOnNullableArray
 * @see IsEmptyOn
 */
export type IsEmptyOnArray<T extends readonly unknown[], >
    = T["length"] extends 0 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlyArray collection} is empty
 *
 * @see IsEmptyOnArray
 * @see IsEmptyOnNullable
 */
export type IsEmptyOnNullableArray<T extends Nullable<readonly unknown[]>, >
    = T extends NullOrUndefined    ? true
    : T extends readonly unknown[] ? IsEmptyOnArray<T> : never

//#endregion -------------------- Array --------------------
//#region -------------------- Int8 array --------------------

/**
 * Tell that the {@link Int8Array collection} is empty
 *
 * @see IsEmptyOnNullableInt8Array
 * @see IsEmptyOn
 */
export type IsEmptyOnInt8Array<T extends Int8Array, >
    = T["length"] extends 0 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Int8Array collection} is empty
 *
 * @see IsEmptyOnInt8Array
 * @see IsEmptyOnNullable
 */
export type IsEmptyOnNullableInt8Array<T extends Nullable<Int8Array>, >
    = T extends NullOrUndefined ? true
    : T extends Int8Array       ? IsEmptyOnInt8Array<T> : never

//#endregion -------------------- Int8 array --------------------
//#region -------------------- Uint8 array --------------------

/**
 * Tell that the {@link Uint8Array collection} is empty
 *
 * @see IsEmptyOnNullableUint8Array
 * @see IsEmptyOn
 */
export type IsEmptyOnUint8Array<T extends Uint8Array, >
    = T["length"] extends 0 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint8Array collection} is empty
 *
 * @see IsEmptyOnUint8Array
 * @see IsEmptyOnNullable
 */
export type IsEmptyOnNullableUint8Array<T extends Nullable<Uint8Array>, >
    = T extends NullOrUndefined ? true
    : T extends Uint8Array      ? IsEmptyOnUint8Array<T> : never

//#endregion -------------------- Uint8 array --------------------
//#region -------------------- Uint8 clamped array --------------------

/**
 * Tell that the {@link Uint8Array collection} is empty
 *
 * @see IsEmptyOnNullableUint8ClampedArray
 * @see IsEmptyOn
 */
export type IsEmptyOnUint8ClampedArray<T extends Uint8ClampedArray, >
    = T["length"] extends 0 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint8Array collection} is empty
 *
 * @see IsEmptyOnUint8ClampedArray
 * @see IsEmptyOnNullable
 */
export type IsEmptyOnNullableUint8ClampedArray<T extends Nullable<Uint8ClampedArray>, >
    = T extends NullOrUndefined   ? true
    : T extends Uint8ClampedArray ? IsEmptyOnUint8ClampedArray<T> : never

//#endregion -------------------- Uint8 clamped array --------------------
//#region -------------------- Int16 array --------------------

/**
 * Tell that the {@link Int16Array collection} is empty
 *
 * @see IsEmptyOnNullableInt16Array
 * @see IsEmptyOn
 */
export type IsEmptyOnInt16Array<T extends Int16Array, >
    = T["length"] extends 0 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Int16Array collection} is empty
 *
 * @see IsEmptyOnInt16Array
 * @see IsEmptyOnNullable
 */
export type IsEmptyOnNullableInt16Array<T extends Nullable<Int16Array>, >
    = T extends NullOrUndefined ? true
    : T extends Int16Array      ? IsEmptyOnInt16Array<T> : never

//#endregion -------------------- Int16 array --------------------
//#region -------------------- Uint16 array --------------------

/**
 * Tell that the {@link Uint16Array collection} is empty
 *
 * @see IsEmptyOnNullableUint16Array
 * @see IsEmptyOn
 */
export type IsEmptyOnUint16Array<T extends Uint16Array, >
    = T["length"] extends 0 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint16Array collection} is empty
 *
 * @see IsEmptyOnUint16Array
 * @see IsEmptyOnNullable
 */
export type IsEmptyOnNullableUint16Array<T extends Nullable<Uint16Array>, >
    = T extends NullOrUndefined ? true
    : T extends Uint16Array     ? IsEmptyOnUint16Array<T> : never

//#endregion -------------------- Uint16 array --------------------
//#region -------------------- Int32 array --------------------

/**
 * Tell that the {@link Int32Array collection} is empty
 *
 * @see IsEmptyOnNullableInt32Array
 * @see IsEmptyOn
 */
export type IsEmptyOnInt32Array<T extends Int32Array, >
    = T["length"] extends 0 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Int32Array collection} is empty
 *
 * @see IsEmptyOnInt32Array
 * @see IsEmptyOnNullable
 */
export type IsEmptyOnNullableInt32Array<T extends Nullable<Int32Array>, >
    = T extends NullOrUndefined ? true
    : T extends Int32Array      ? IsEmptyOnInt32Array<T> : never

//#endregion -------------------- Int32 array --------------------
//#region -------------------- Uint32 array --------------------

/**
 * Tell that the {@link Uint32Array collection} is empty
 *
 * @see IsEmptyOnNullableUint32Array
 * @see IsEmptyOn
 */
export type IsEmptyOnUint32Array<T extends Uint32Array, >
    = T["length"] extends 0 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Uint32Array collection} is empty
 *
 * @see IsEmptyOnUint32Array
 * @see IsEmptyOnNullable
 */
export type IsEmptyOnNullableUint32Array<T extends Nullable<Uint32Array>, >
    = T extends NullOrUndefined ? true
    : T extends Uint32Array     ? IsEmptyOnUint32Array<T> : never

//#endregion -------------------- Uint32 array --------------------
//#region -------------------- BigInt64 array --------------------

/**
 * Tell that the {@link BigInt64Array collection} is empty
 *
 * @see IsEmptyOnNullableBigInt64Array
 * @see IsEmptyOn
 */
export type IsEmptyOnBigInt64Array<T extends BigInt64Array, >
    = T["length"] extends 0 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link BigInt64Array collection} is empty
 *
 * @see IsEmptyOnBigInt64Array
 * @see IsEmptyOnNullable
 */
export type IsEmptyOnNullableBigInt64Array<T extends Nullable<BigInt64Array>, >
    = T extends NullOrUndefined ? true
    : T extends BigInt64Array   ? IsEmptyOnBigInt64Array<T> : never

//#endregion -------------------- BigInt64 array --------------------
//#region -------------------- BigUint64 array --------------------

/**
 * Tell that the {@link BigUint64Array collection} is empty
 *
 * @see IsEmptyOnNullableBigUint64Array
 * @see IsEmptyOn
 */
export type IsEmptyOnBigUint64Array<T extends BigUint64Array, >
    = T["length"] extends 0 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link BigUint64Array collection} is empty
 *
 * @see IsEmptyOnBigUint64Array
 * @see IsEmptyOnNullable
 */
export type IsEmptyOnNullableBigUint64Array<T extends Nullable<BigUint64Array>, >
    = T extends NullOrUndefined ? true
    : T extends BigUint64Array  ? IsEmptyOnBigUint64Array<T> : never

//#endregion -------------------- BigUint64 array --------------------
//#region -------------------- Float32 array --------------------

/**
 * Tell that the {@link Float32Array collection} is empty
 *
 * @see IsEmptyOnNullableFloat32Array
 * @see IsEmptyOn
 */
export type IsEmptyOnFloat32Array<T extends Float32Array, >
    = T["length"] extends 0 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Float32Array collection} is empty
 *
 * @see IsEmptyOnFloat32Array
 * @see IsEmptyOnNullable
 */
export type IsEmptyOnNullableFloat32Array<T extends Nullable<Float32Array>, >
    = T extends NullOrUndefined ? true
    : T extends Float32Array    ? IsEmptyOnFloat32Array<T> : never

//#endregion -------------------- Float32 array --------------------
//#region -------------------- Float64 array --------------------

/**
 * Tell that the {@link Float64Array collection} is empty
 *
 * @see IsEmptyOnNullableFloat64Array
 * @see IsEmptyOn
 */
export type IsEmptyOnFloat64Array<T extends Float64Array, >
    = T["length"] extends 0 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link Float64Array collection} is empty
 *
 * @see IsEmptyOnFloat64Array
 * @see IsEmptyOnNullable
 */
export type IsEmptyOnNullableFloat64Array<T extends Nullable<Float64Array>, >
    = T extends NullOrUndefined ? true
    : T extends Float64Array    ? IsEmptyOnFloat64Array<T> : never

//#endregion -------------------- Float64 array --------------------
//#region -------------------- Set --------------------

/**
 * Tell that the {@link ReadonlySet collection} is empty
 *
 * @see IsEmptyOnNullableSet
 * @see IsEmptyOn
 */
export type IsEmptyOnSet<T extends ReadonlySet<unknown>, >
    = T["size"] extends 0 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlySet collection} is empty
 *
 * @see IsEmptyOnSet
 * @see IsEmptyOnNullable
 */
export type IsEmptyOnNullableSet<T extends Nullable<ReadonlySet<unknown>>, >
    = T extends NullOrUndefined      ? true
    : T extends ReadonlySet<unknown> ? IsEmptyOnSet<T> : never

//#endregion -------------------- Set --------------------
//#region -------------------- Map --------------------

/**
 * Tell that the {@link ReadonlyMap collection} is empty
 *
 * @see IsEmptyOnNullableMap
 * @see IsEmptyOn
 */
export type IsEmptyOnMap<T extends ReadonlyMap<unknown, unknown>, >
    = T["size"] extends 0 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlyMap collection} is empty
 *
 * @see IsEmptyOnMap
 * @see IsEmptyOnNullable
 */
export type IsEmptyOnNullableMap<T extends Nullable<ReadonlyMap<unknown, unknown>>, >
    = T extends NullOrUndefined               ? true
    : T extends ReadonlyMap<unknown, unknown> ? IsEmptyOnMap<T> : never

//#endregion -------------------- Map --------------------
