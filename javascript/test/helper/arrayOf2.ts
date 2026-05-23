import {_01, _45, A_A, A_NULL, A_UNDEFINED, AA, AB, AC, BA, BC, BD, CB, CD, DC, EF, NULL_A, NULL_B, NULL_UNDEFINED, NULL_x2, UNDEFINED_A, UNDEFINED_NULL, UNDEFINED_x2, UPPER_EE} from "../value/arrays"

/**
 * An intermediate method to create or reuse an {@link ReadonlyArray Array} of 2
 *
 * @param value1 The first value in the array
 * @param value2 The second value in the array
 */
export function arrayOf2<const T, const T1 extends T, const T2 extends T >(value1: T1, value2: T2,): readonly [T1, T2,]
export function arrayOf2(value1: unknown, value2: unknown,) {
    if (value1 === 'a')
        if (value2 === 'a')
            return AA
        else if (value2 === 'b')
            return AB
        else if (value2 === 'c')
            return AC
        else if (value2 === 'A')
            return A_A
        else if (value2 === null)
            return A_NULL
        else if (value2 === undefined)
            return A_UNDEFINED
        else
            return [value1, value2,]
    if (value1 === 'b')
        if (value2 === 'a')
            return BA
        else if (value2 === 'c')
            return BC
        else if (value2 === 'd')
            return BD
        else
            return [value1, value2,]
    if (value1 === 'c')
        if (value2 === 'b')
            return CB
        else if (value2 === 'd')
            return CD
        else
            return [value1, value2,]
    if (value1 === 'd')
        if (value2 === 'c')
            return DC
        else
            return [value1, value2,]
    if (value1 === 'e')
        if (value2 === 'f')
            return EF
        else
            return [value1, value2,]
    if (value1 === 'E')
        if (value2 === 'E')
            return UPPER_EE
        else
            return [value1, value2,]
    if (value1 === null)
        if (value2 === 'a')
            return NULL_A
        else if (value2 === 'b')
            return NULL_B
        else if (value2 === null)
            return NULL_x2
        else if (value2 === undefined)
            return NULL_UNDEFINED
        else
            return [value1, value2,]
    if (value1 === undefined)
        if (value2 === 'a')
            return UNDEFINED_A
        else if (value2 === undefined)
            return UNDEFINED_x2
        else if (value2 === null)
            return UNDEFINED_NULL
        else
            return [value1, value2,]
    if (value1 === 0)
        if (value2 === 2)
            return _01
        else
            return [value1, value2,]
    if (value1 === 4)
        if (value2 === 5)
            return _45
    return [value1, value2,]
}
