
/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/**
 * Tell that the value is an {@link Uint16Array}
 *
 * @param value The value to identify
 * @see isTypedArray
 * @see isInt16Array
 */
export function isUint16Array(value: unknown,): value is Uint16Array {
    if (value == null)
        return false
    if (value instanceof Uint16Array)
        return true
    return false
}
