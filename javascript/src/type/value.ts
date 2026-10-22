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

/**
 * Tell if `I1` is `0`|`-1`, then it is `T`,
 * otherwise, it can never happen
 *
 * @see DoubleValueFromIndex
 * @see SingleValueFromIndexOrElse
 * @see SingleValueFromIndexOrNull
 */
export type SingleValueFromIndex<I extends number, T, > = I extends | 0 | -1 ? T :
                                                          never

/**
 * Tell if `I1` is `0`|`-1`, then it is `T`,
 * otherwise, it is `U`
 *
 * @see DoubleValueFromIndexOrElse
 * @see SingleValueFromIndex
 * @see SingleValueFromIndexOrNull
 */
export type SingleValueFromIndexOrElse<I extends number, T, U, > = I extends | 0 | -1 ? T :
                                                                   U

/**
 * Tell if `I1` is `0`|`-1`, then it is `T`,
 * otherwise, it is `null`
 *
 * @see DoubleValueFromIndexOrNull
 * @see SingleValueFromIndex
 * @see SingleValueFromIndexOrElse
 */
export type SingleValueFromIndexOrNull<I extends number, T, > = I extends | 0 | -1 ? T :
                                                                null


/**
 * Tell if `I1` is `0`|`-2`, then it is `T1`,
 * or if `I1` is `1`|`-1`, then it is `T2`
 * otherwise, it can never happen
 *
 * @see SingleValueFromIndex
 * @see DoubleValueFromIndexOrElse
 * @see DoubleValueFromIndexOrNull
 */
export type DoubleValueFromIndex<I extends number, T1, T2, > = I extends | 0 | -2 ? T1 :
                                                               I extends | 1 | -1 ? T2 :
                                                               never

/**
 * Tell if `I1` is `0`|`-2`, then it is `T1`,
 * or if `I1` is `1`|`-1`, then it is `T2`
 * otherwise, it is `U`
 *
 * @see SingleValueFromIndexOrElse
 * @see DoubleValueFromIndex
 * @see DoubleValueFromIndexOrNull
 */
export type DoubleValueFromIndexOrElse<I extends number, T1, T2, U, > = I extends | 0 | -2 ? T1 :
                                                                        I extends | 1 | -1 ? T2 :
                                                                        U

/**
 * Tell if `I1` is `0`|`-2`, then it is `T1`,
 * or if `I1` is `1`|`-1`, then it is `T2`
 * otherwise, it is `null`
 *
 * @see SingleValueFromIndexOrNull
 * @see DoubleValueFromIndex
 * @see DoubleValueFromIndexOrElse
 */
export type DoubleValueFromIndexOrNull<I extends number, T1, T2, > = I extends | 0 | -2 ? T1 :
                                                                     I extends | 1 | -1 ? T2 :
                                                                     null
