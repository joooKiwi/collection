/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/**
 * All the possible typed-{@link ReadonlyArray array} defined in JavaScript
 *
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Guide/Typed_arrays
 */
export type TypedArray = | Int8Array | Uint8Array | Uint8ClampedArray
                         | Int16Array | Uint16Array
                         | Int32Array | Uint32Array
                         | BigInt64Array | BigUint64Array
                         | Float32Array
                         | Float64Array
