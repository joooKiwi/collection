/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

export const EMPTY = [] as const,
    A = ['a',] as const,
    AB = ['a', 'b',] as const,
    SINGULAR_A_OBJECT = new String('a',),
    SINGULAR_B_OBJECT = new String('a',),
    AB_OBJECT = [SINGULAR_A_OBJECT, SINGULAR_B_OBJECT,] as const,
    A_NULL_B_UNDEFINED = ['a', null, 'b', undefined,] as const,
    AB12 = ['a', 'b', 1, 2,] as const,
    ABCD = ['a', 'b', 'c', 'd',] as const,
    ABCDEFGHIJ = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',] as const,
    AB_AB = ['a', 'b', 'A', 'B',] as const,
    ABCD_ABCD = ['a', 'b', 'c', 'd', 'A', 'B', 'C', 'D',] as const,
    NULL_ABCD = [null, 'a', 'b', 'c', 'd',] as const,
    ABCD_NULL = ['a', 'b', 'c', 'd', null,] as const,
    UNDEFINED_ABCD = [undefined, 'a', 'b', 'c', 'd',] as const,
    ABCD_UNDEFINED = ['a', 'b', 'c', 'd', undefined,] as const
