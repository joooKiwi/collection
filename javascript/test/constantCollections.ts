/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

export const EMPTY = [] as const
export const A = ['a',] as const
export const NULL = [null,] as const
export const UNDEFINED = [undefined,] as const
export const AA = ['a', 'a',] as const
export const A_NULL = ['a', null,] as const
export const NULL_A = [null, 'a',] as const
export const A_UNDEFINED = ['a', undefined,] as const
export const UNDEFINED_A = [undefined, 'a',] as const
export const AB = ['a', 'b',] as const
export const ABC = ['a', 'b', 'c',] as const
export const AAB = ['a', 'a', 'b',] as const
export const ABB = ['a', 'b', 'b',] as const
export const AB_NULL = ['a', 'b', null,] as const
export const A_NULL_B = ['a', null, 'b',] as const
export const NULL_AB = [null, 'a', 'b',] as const
export const AB_UNDEFINED = ['a', 'b', undefined,] as const
export const A_UNDEFINED_B = ['a', undefined, 'b',] as const
export const UNDEFINED_AB = [undefined, 'a', 'b',] as const
export const SINGULAR_A_OBJECT = new String('a',)
export const SINGULAR_B_OBJECT = new String('b',)
export const AB_OBJECT = [SINGULAR_A_OBJECT, SINGULAR_B_OBJECT,] as const
export const AAB_OBJECT = [SINGULAR_A_OBJECT, SINGULAR_A_OBJECT, SINGULAR_B_OBJECT,] as const
export const A_NULL_B_UNDEFINED = ['a', null, 'b', undefined,] as const
export const A_NULL_NULL_B_UNDEFINED = ['a', null, null, 'b', undefined,] as const
export const NULL_NULL_B_UNDEFINED = [null, null, 'b', undefined,] as const
export const A_NULL_B_UNDEFINED_UNDEFINED = ['a', null, 'b', undefined, undefined,] as const
export const AB12 = ['a', 'b', 1, 2,] as const
export const ABCD = ['a', 'b', 'c', 'd',] as const
export const ABCDEFGHIJ = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',] as const
export const AB_AB = ['a', 'b', 'A', 'B',] as const
export const AAB_AAB = ['a', 'a', 'b', 'A', 'A', 'B',] as const
export const ABCD_ABCD = ['a', 'b', 'c', 'd', 'A', 'B', 'C', 'D',] as const
export const NULL_ABCD = [null, 'a', 'b', 'c', 'd',] as const
export const ABCD_NULL = ['a', 'b', 'c', 'd', null,] as const
export const UNDEFINED_ABCD = [undefined, 'a', 'b', 'c', 'd',] as const
export const ABCD_UNDEFINED = ['a', 'b', 'c', 'd', undefined,] as const
