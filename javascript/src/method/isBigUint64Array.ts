/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/**
 * Tell that the value is an {@link BigUint64Array}
 *
 * @param value The value to identify
 * @see isTypedArray
 * @see isBigInt64Array
 */
export function isBigUint64Array(value: unknown,): value is BigUint64Array {
    if (value == null)
        return false
    if (value instanceof BigUint64Array)
        return true
    return false
}
