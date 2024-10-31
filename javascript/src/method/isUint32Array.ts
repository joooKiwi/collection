
/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/**
 * Tell that the value is an {@link Uint32Array}
 *
 * @param value The value to identify
 * @see isTypedArray
 * @see isInt32Array
 */
export function isUint32Array(value: unknown,): value is Uint32Array {
    if (value == null)
        return false
    if (value instanceof Uint32Array)
        return true
    return false
}
