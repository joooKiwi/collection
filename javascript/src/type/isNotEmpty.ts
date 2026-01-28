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
 * {@link ReadonlyArray Array}, {@link TypedArray}, {@link ReadonlySet Set} or {@link ReadonlyMap Map}) is not empty
 *
 * @see IsNotEmptyOnMinimalistCollectionHolder
 * @see IsNotEmptyOnCollectionHolder
 * @see IsNotEmptyOnArray
 * @see IsNotEmptyOnInt8Array
 * @see IsNotEmptyOnUint8Array
 * @see IsNotEmptyOnUint8ClampedArray
 * @see IsNotEmptyOnInt16Array
 * @see IsNotEmptyOnUint16Array
 * @see IsNotEmptyOnInt32Array
 * @see IsNotEmptyOnUint32Array
 * @see IsNotEmptyOnBigInt64Array
 * @see IsNotEmptyOnBigUint64Array
 * @see IsNotEmptyOnFloat32Array
 * @see IsNotEmptyOnFloat64Array
 * @see IsNotEmptyOnSet
 * @see IsNotEmptyOnMap
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOn<T extends | MinimalistCollectionHolder | readonly unknown[] | TypedArray | ReadonlySet<unknown> | ReadonlyMap<unknown, unknown>, >
    = T extends MinimalistCollectionHolder    ? IsNotEmptyOnMinimalistCollectionHolder<T>
    : T extends CollectionHolder              ? IsNotEmptyOnCollectionHolder<T>
    : T extends readonly unknown[]            ? IsNotEmptyOnArray<T>
    : T extends Int8Array                     ? IsNotEmptyOnInt8Array<T>
    : T extends Uint8Array                    ? IsNotEmptyOnUint8Array<T>
    : T extends Uint8ClampedArray             ? IsNotEmptyOnUint8ClampedArray<T>
    : T extends Int16Array                    ? IsNotEmptyOnInt16Array<T>
    : T extends Uint16Array                   ? IsNotEmptyOnUint16Array<T>
    : T extends Int32Array                    ? IsNotEmptyOnInt32Array<T>
    : T extends Uint32Array                   ? IsNotEmptyOnUint32Array<T>
    : T extends BigInt64Array                 ? IsNotEmptyOnBigInt64Array<T>
    : T extends BigUint64Array                ? IsNotEmptyOnBigUint64Array<T>
    : T extends Float32Array                  ? IsNotEmptyOnFloat32Array<T>
    : T extends Float64Array                  ? IsNotEmptyOnFloat64Array<T>
    : T extends ReadonlySet<unknown>          ? IsNotEmptyOnSet<T>
    : T extends ReadonlyMap<unknown, unknown> ? IsNotEmptyOnMap<T> : never

/**
 * Tell that the {@link Nullable nullable} collection
 * ({@link MinimalistCollectionHolder}, {@link CollectionHolder},
 * {@link ReadonlyArray Array}, {@link TypedArray}, {@link ReadonlySet Set} or {@link ReadonlyMap Map}) is not empty
 *
 * @see IsNotEmptyOnNullableMinimalistCollectionHolder
 * @see IsNotEmptyOnNullableCollectionHolder
 * @see IsNotEmptyOnNullableArray
 * @see IsNotEmptyOnInt8Array
 * @see IsNotEmptyOnUint8Array
 * @see IsNotEmptyOnUint8ClampedArray
 * @see IsNotEmptyOnInt16Array
 * @see IsNotEmptyOnUint16Array
 * @see IsNotEmptyOnInt32Array
 * @see IsNotEmptyOnUint32Array
 * @see IsNotEmptyOnBigInt64Array
 * @see IsNotEmptyOnBigUint64Array
 * @see IsNotEmptyOnFloat32Array
 * @see IsNotEmptyOnFloat64Array
 * @see IsNotEmptyOnNullableSet
 * @see IsNotEmptyOnNullableMap
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnNullable<T extends Nullable<| MinimalistCollectionHolder | readonly unknown[] | TypedArray | ReadonlySet<unknown> | ReadonlyMap<unknown, unknown>>, >
    = T extends NullOrUndefined               ? false
    : T extends MinimalistCollectionHolder    ? IsNotEmptyOnMinimalistCollectionHolder<T>
    : T extends CollectionHolder              ? IsNotEmptyOnCollectionHolder<T>
    : T extends readonly unknown[]            ? IsNotEmptyOnArray<T>
    : T extends Int8Array                     ? IsNotEmptyOnInt8Array<T>
    : T extends Uint8Array                    ? IsNotEmptyOnUint8Array<T>
    : T extends Uint8ClampedArray             ? IsNotEmptyOnUint8ClampedArray<T>
    : T extends Int16Array                    ? IsNotEmptyOnInt16Array<T>
    : T extends Uint16Array                   ? IsNotEmptyOnUint16Array<T>
    : T extends Int32Array                    ? IsNotEmptyOnInt32Array<T>
    : T extends Uint32Array                   ? IsNotEmptyOnUint32Array<T>
    : T extends BigInt64Array                 ? IsNotEmptyOnBigInt64Array<T>
    : T extends BigUint64Array                ? IsNotEmptyOnBigUint64Array<T>
    : T extends Float32Array                  ? IsNotEmptyOnFloat32Array<T>
    : T extends Float64Array                  ? IsNotEmptyOnFloat64Array<T>
    : T extends ReadonlySet<unknown>          ? IsNotEmptyOnSet<T>
    : T extends ReadonlyMap<unknown, unknown> ? IsNotEmptyOnMap<T> : never

//#region -------------------- Minimalist collection holder --------------------

/**
 * Tell that the {@link MinimalistCollectionHolder collection} is not empty
 *
 * @see IsNotEmptyOnNullableMinimalistCollectionHolder
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnMinimalistCollectionHolder<T extends MinimalistCollectionHolder, >
    = T["size"] extends 0 ? false : T["size"] extends number ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link MinimalistCollectionHolder collection} is not empty
 *
 * @see IsNotEmptyOnMinimalistCollectionHolder
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOnNullableMinimalistCollectionHolder<T extends Nullable<MinimalistCollectionHolder>, >
    = T extends NullOrUndefined            ? false
    : T extends MinimalistCollectionHolder ? IsNotEmptyOnMinimalistCollectionHolder<T> : boolean

//#endregion -------------------- Minimalist collection holder --------------------
//#region -------------------- Collection holder --------------------

/**
 * Tell that the {@link CollectionHolder collection} is not empty
 *
 * @see IsNotEmptyOnNullableCollectionHolder
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnCollectionHolder<T extends CollectionHolder, >
    = T["isEmpty"] extends true ? false : T["isEmpty"] extends boolean ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link CollectionHolder collection} is not empty
 *
 * @see IsNotEmptyOnCollectionHolder
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOnNullableCollectionHolder<T extends Nullable<CollectionHolder>, >
    = T extends NullOrUndefined  ? false
    : T extends CollectionHolder ? (IsNotEmptyOnCollectionHolder<T>) : never

//#endregion -------------------- Collection holder --------------------
//#region -------------------- Collection iterator --------------------

/**
 * Tell that the {@link CollectionIterator iterator} is not empty
 *
 * @see IsNotEmptyOnNullableCollectionIterator
 */
export type IsNotEmptyOnCollectionIterator<T extends CollectionIterator, >
    = T["isEmpty"] extends true ? false : T["isEmpty"] extends boolean ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link CollectionIterator iterator} is not empty
 *
 * @see IsNotEmptyOnCollectionIterator
 */
export type IsNotEmptyOnNullableCollectionIterator<T extends Nullable<CollectionIterator>, >
    = T extends NullOrUndefined  ? false
    : T extends CollectionIterator ? IsNotEmptyOnCollectionIterator<T> : never

//#endregion -------------------- Collection iterator --------------------
//#region -------------------- Array --------------------

/**
 * Tell that the {@link ReadonlyArray collection} is not empty
 *
 * @see IsNotEmptyOnNullableArray
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnArray<T extends readonly unknown[], >
    = T["length"] extends 0 ? false : T["length"] extends number ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlyArray collection} is not empty
 *
 * @see IsNotEmptyOnArray
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOnNullableArray<T extends Nullable<readonly unknown[]>, >
    = T extends NullOrUndefined    ? false
    : T extends readonly unknown[] ? IsNotEmptyOnArray<T> : never

//#endregion -------------------- Array --------------------
//#region -------------------- Int8 array --------------------

/**
 * Tell that the {@link Int8Array collection} is not empty
 *
 * @see IsNotEmptyOnNullableInt8Array
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnInt8Array<T extends Int8Array, >
    = T["length"] extends 0 ? false : T["length"] extends number ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link Int8Array collection} is not empty
 *
 * @see IsNotEmptyOnInt8Array
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOnNullableInt8Array<T extends Nullable<Int8Array>, >
    = T extends NullOrUndefined ? false
    : T extends Int8Array       ? IsNotEmptyOnInt8Array<T> : never

//#endregion -------------------- Int8 array --------------------
//#region -------------------- Uint8 array --------------------

/**
 * Tell that the {@link Uint8Array collection} is not empty
 *
 * @see IsNotEmptyOnNullableUint8Array
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnUint8Array<T extends Uint8Array, >
    = T["length"] extends 0 ? false : T["length"] extends number ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link Uint8Array collection} is not empty
 *
 * @see IsNotEmptyOnUint8Array
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOnNullableUint8Array<T extends Nullable<Uint8Array>, >
    = T extends NullOrUndefined ? false
    : T extends Uint8Array      ? IsNotEmptyOnUint8Array<T> : never

//#endregion -------------------- Uint8 array --------------------
//#region -------------------- Uint8 clamped array --------------------

/**
 * Tell that the {@link Uint8Array collection} is not empty
 *
 * @see IsNotEmptyOnNullableUint8ClampedArray
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnUint8ClampedArray<T extends Uint8ClampedArray, >
    = T["length"] extends 0 ? false : T["length"] extends number ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link Uint8Array collection} is not empty
 *
 * @see IsNotEmptyOnUint8ClampedArray
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOnNullableUint8ClampedArray<T extends Nullable<Uint8ClampedArray>, >
    = T extends NullOrUndefined   ? false
    : T extends Uint8ClampedArray ? IsNotEmptyOnUint8ClampedArray<T> : never

//#endregion -------------------- Uint8 clamped array --------------------
//#region -------------------- Int16 array --------------------

/**
 * Tell that the {@link Int16Array collection} is not empty
 *
 * @see IsNotEmptyOnNullableInt16Array
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnInt16Array<T extends Int16Array, >
    = T["length"] extends 0 ? false : T["length"] extends number ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link Int16Array collection} is not empty
 *
 * @see IsNotEmptyOnInt16Array
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOnNullableInt16Array<T extends Nullable<Int16Array>, >
    = T extends NullOrUndefined ? false
    : T extends Int16Array      ? IsNotEmptyOnInt16Array<T> : never

//#endregion -------------------- Int16 array --------------------
//#region -------------------- Uint16 array --------------------

/**
 * Tell that the {@link Uint16Array collection} is not empty
 *
 * @see IsNotEmptyOnNullableUint16Array
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnUint16Array<T extends Uint16Array, >
    = T["length"] extends 0 ? false : T["length"] extends number ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link Uint16Array collection} is not empty
 *
 * @see IsNotEmptyOnUint16Array
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOnNullableUint16Array<T extends Nullable<Uint16Array>, >
    = T extends NullOrUndefined ? false
    : T extends Uint16Array     ? IsNotEmptyOnUint16Array<T> : never

//#endregion -------------------- Uint16 array --------------------
//#region -------------------- Int32 array --------------------

/**
 * Tell that the {@link Int32Array collection} is not empty
 *
 * @see IsNotEmptyOnNullableInt32Array
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnInt32Array<T extends Int32Array, >
    = T["length"] extends 0 ? false : T["length"] extends number ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link Int32Array collection} is not empty
 *
 * @see IsNotEmptyOnInt32Array
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOnNullableInt32Array<T extends Nullable<Int32Array>, >
    = T extends NullOrUndefined ? false
    : T extends Int32Array      ? IsNotEmptyOnInt32Array<T> : never

//#endregion -------------------- Int32 array --------------------
//#region -------------------- Uint32 array --------------------

/**
 * Tell that the {@link Uint32Array collection} is not empty
 *
 * @see IsNotEmptyOnNullableUint32Array
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnUint32Array<T extends Uint32Array, >
    = T["length"] extends 0 ? false : T["length"] extends number ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link Uint32Array collection} is not empty
 *
 * @see IsNotEmptyOnUint32Array
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOnNullableUint32Array<T extends Nullable<Uint32Array>, >
    = T extends NullOrUndefined ? false
    : T extends Uint32Array     ? IsNotEmptyOnUint32Array<T> : never

//#endregion -------------------- Uint32 array --------------------
//#region -------------------- BigInt64 array --------------------

/**
 * Tell that the {@link BigInt64Array collection} is not empty
 *
 * @see IsNotEmptyOnNullableBigInt64Array
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnBigInt64Array<T extends BigInt64Array, >
    = T["length"] extends 0 ? false : T["length"] extends number ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link BigInt64Array collection} is not empty
 *
 * @see IsNotEmptyOnBigInt64Array
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOnNullableBigInt64Array<T extends Nullable<BigInt64Array>, >
    = T extends NullOrUndefined ? false
    : T extends BigInt64Array   ? IsNotEmptyOnBigInt64Array<T> : never

//#endregion -------------------- BigInt64 array --------------------
//#region -------------------- BigUint64 array --------------------

/**
 * Tell that the {@link BigUint64Array collection} is not empty
 *
 * @see IsNotEmptyOnNullableBigUint64Array
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnBigUint64Array<T extends BigUint64Array, >
    = T["length"] extends 0 ? false : T["length"] extends number ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link BigUint64Array collection} is not empty
 *
 * @see IsNotEmptyOnBigUint64Array
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOnNullableBigUint64Array<T extends Nullable<BigUint64Array>, >
    = T extends NullOrUndefined ? false
    : T extends BigUint64Array  ? IsNotEmptyOnBigUint64Array<T> : never

//#endregion -------------------- BigUint64 array --------------------
//#region -------------------- Float32 array --------------------

/**
 * Tell that the {@link Float32Array collection} is not empty
 *
 * @see IsNotEmptyOnNullableFloat32Array
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnFloat32Array<T extends Float32Array, >
    = T["length"] extends 0 ? false : T["length"] extends number ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link Float32Array collection} is not empty
 *
 * @see IsNotEmptyOnFloat32Array
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOnNullableFloat32Array<T extends Nullable<Float32Array>, >
    = T extends NullOrUndefined ? false
    : T extends Float32Array    ? IsNotEmptyOnFloat32Array<T> : never

//#endregion -------------------- Float32 array --------------------
//#region -------------------- Float64 array --------------------

/**
 * Tell that the {@link Float64Array collection} is not empty
 *
 * @see IsNotEmptyOnNullableFloat64Array
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnFloat64Array<T extends Float64Array, >
    = T["length"] extends 0 ? false : T["length"] extends number ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link Float64Array collection} is not empty
 *
 * @see IsNotEmptyOnFloat64Array
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOnNullableFloat64Array<T extends Nullable<Float64Array>, >
    = T extends NullOrUndefined ? false
    : T extends Float64Array    ? IsNotEmptyOnFloat64Array<T> : never

//#endregion -------------------- Float64 array --------------------
//#region -------------------- Set --------------------

/**
 * Tell that the {@link ReadonlySet collection} is not empty
 *
 * @see IsNotEmptyOnNullableSet
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnSet<T extends ReadonlySet<unknown>, >
    = T["size"] extends 0 ? false : T["size"] extends number ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlySet collection} is not empty
 *
 * @see IsNotEmptyOnSet
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOnNullableSet<T extends Nullable<ReadonlySet<unknown>>, >
    = T extends NullOrUndefined      ? false
    : T extends ReadonlySet<unknown> ? IsNotEmptyOnSet<T> : never

//#endregion -------------------- Set --------------------
//#region -------------------- Map --------------------

/**
 * Tell that the {@link ReadonlyMap collection} is not empty
 *
 * @see IsNotEmptyOnNullableMap
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnMap<T extends ReadonlyMap<unknown, unknown>, >
    = T["size"] extends 0 ? false : T["size"] extends number ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlyMap collection} is not empty
 *
 * @see IsNotEmptyOnMap
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOnNullableMap<T extends Nullable<ReadonlyMap<unknown, unknown>>, >
    = T extends NullOrUndefined               ? false
    : T extends ReadonlyMap<unknown, unknown> ? IsNotEmptyOnMap<T> : never

//#endregion -------------------- Set --------------------
