/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/**
 * Tell that the value is an {@link Int16Array}
 *
 * @param value The value to identify
 * @see isTypedArray
 * @see isUint16Array
 */
export function isInt16Array(value: unknown,): value is Int16Array {
    if (value == null)
        return false
    if (value instanceof Int16Array)
        return true
    return false
}
