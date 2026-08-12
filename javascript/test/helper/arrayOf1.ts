import {_0, _1, _2, _3, _4, A, B, C, D, E, NULL, UNDEFINED, UPPER_E} from "../value/arrays"

/**
 * An intermediate method to create or reuse an {@link ReadonlyArray Array} of 1
 *
 * @param value The lone value in the array
 */
export function arrayOf1<const T, >(value: T,): readonly [T,]
export function arrayOf1(value: unknown,) {
    if (value === 'a')
        return A
    if (value === 'b')
        return B
    if (value === 'c')
        return C
    if (value === 'd')
        return D
    if (value === 'e')
        return E
    if (value === 'E')
        return UPPER_E
    if (value === null)
        return NULL
    if (value === undefined)
        return UNDEFINED
    if (value === 0)
        return _0
    if (value === 1)
        return _1
    if (value === 2)
        return _2
    if (value === 3)
        return _3
    if (value === 4)
        return _4
    return [value,]
}
