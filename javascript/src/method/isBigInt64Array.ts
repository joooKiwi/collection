/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/**
 * Tell that the value is an {@link BigInt64Array}
 *
 * @param value The value to identify
 * @see isTypedArray
 * @see isBigUint64Array
 */
export function isBigInt64Array(value: unknown,): value is BigInt64Array {
    if (value == null)
        return false
    if (value instanceof BigInt64Array)
        return true
    return false
}
