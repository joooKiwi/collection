//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

export const EMPTY = [] as const

export const A =         ['a',      ] as const
export const B =         ['b',      ] as const
export const C =         ['c',      ] as const
export const D =         ['d',      ] as const
export const E =         ['e',      ] as const
export const UPPER_E =   ['E',      ] as const
export const NULL =      [null,     ] as const
export const UNDEFINED = [undefined,] as const
export const _0 =        [0,        ] as const
export const _1 =        [1,        ] as const
export const _2 =        [2,        ] as const
export const _3 =        [3,        ] as const
export const _4 =        [4,        ] as const

export const AA =             ['a',       'a',      ] as const
export const A_A =            ['a',       'A',      ] as const
export const AB =             ['a',       'b',      ] as const
export const AC =             ['a',       'c',      ] as const
export const BA =             ['b',       'a',      ] as const
export const BC =             ['b',       'c',      ] as const
export const BD =             ['b',       'd',      ] as const
export const CB =             ['c',       'b',      ] as const
export const CD =             ['c',       'd',      ] as const
export const DC =             ['d',       'c',      ] as const
export const UPPER_EE =       ['E',       'E',      ] as const
export const EF =             ['e',       'f',      ] as const
export const NULL_x2 =        [null,      null,     ] as const
export const NULL_UNDEFINED = [null,      undefined,] as const
export const UNDEFINED_x2 =   [undefined, undefined,] as const
export const _01 =            [0,         1,        ] as const
export const _45 =            [4,         5,        ] as const

export const A_NULL =                       ['a',       null,                                ] as const
export const AB_NULL =                      ['a',       'b',       null,                     ] as const
export const AB_NULL_NULL =                 ['a',       'b',       null,      null,          ] as const
export const AB_NULL_UNDEFINED =            ['a',       'b',       null,      undefined,     ] as const
export const AB_UNDEFINED_NULL =            ['a',       'b',       undefined, null,          ] as const
export const AB_UNDEFINED_UNDEFINED =       ['a',       'b',       undefined, undefined,     ] as const
export const A_NULL_B =                     ['a',       null,      'b',                      ] as const
export const NULL_A =                       [null,      'a',                                 ] as const
export const NULL_B =                       [null,      'b',                                 ] as const
export const NULL_AB =                      [null,      'a',       'b',                      ] as const
export const NULL_NULL_AB =                 [null,      null,      'a',       'b',           ] as const
export const NULL_UNDEFINED_AB =            [null,      undefined, 'a',       'b',           ] as const
export const UNDEFINED_NULL_AB =            [undefined, null,      'a',       'b',           ] as const
export const UNDEFINED_UNDEFINED_AB =       [undefined, undefined, 'a',       'b',           ] as const
export const A_UNDEFINED =                  ['a',       undefined,                           ] as const
export const AB_UNDEFINED =                 ['a',       'b',       undefined,                ] as const
export const A_UNDEFINED_B =                ['a',       undefined, 'b',                      ] as const
export const UNDEFINED_A =                  [undefined, 'a',                                 ] as const
export const UNDEFINED_AB =                 [undefined, 'a',       'b',                      ] as const
export const A_NULL_NULL_B =                ['a',       null,      null,      'b',           ] as const
export const A_NULL_UNDEFINED_B =           ['a',       null,      undefined, 'b',           ] as const
export const A_UNDEFINED_NULL_B =           ['a',       undefined, null,      'b',           ] as const
export const A_UNDEFINED_UNDEFINED_B =      ['a',       undefined, undefined,      'b',      ] as const
export const A_NULL_C_NULL =                ['a',       null,      'c',       null,          ] as const
export const A_UNDEFINED_C_UNDEFINED =      ['a',       undefined, 'c',       undefined,     ] as const
export const NULL_B_NULL_D =                [null,      'b',       null,      'd',           ] as const
export const A_NULL_NULL_UNDEFINED_B =      ['a',       null,      null,      undefined, 'b',] as const
export const A_NULL_UNDEFINED_UNDEFINED_B = ['a',       null,      undefined, undefined, 'b',] as const

export const ABC =  ['a', 'b', 'c',] as const
export const ABD =  ['a', 'b', 'd',] as const
export const ACD =  ['a', 'c', 'd',] as const
export const BCD =  ['b', 'c', 'd',] as const
export const CBA =  ['c', 'b', 'a',] as const
export const DCB =  ['d', 'c', 'b',] as const

export const ABAB =           ['a',       'b',       'a',       'b',      ] as const
export const AB_AB =          ['a',       'b',       'A',       'B',      ] as const
export const AABC =           ['a',       'a',       'b',       'c',      ] as const
export const ABCD =           ['a',       'b',       'c',       'd',      ] as const
export const ABBC =           ['a',       'b',       'b',       'c',      ] as const
export const ABCC =           ['a',       'b',       'c',       'c',      ] as const
export const DCBA =           ['d',       'c',       'b',       'a',      ] as const
export const UPPER_EEEE =     ['E',       'E',       'E',       'E',      ] as const
export const EFGH =           ['e',       'f',       'g',       'h',      ] as const
export const NULL_x4 =        [null,      null,      null,      null,     ] as const
export const UNDEFINED_x4 =   [undefined, undefined, undefined, undefined,] as const
export const _0123 =          [0,         1,         2,         3,        ] as const
export const _4567 =          [4,         5,         6,         7,        ] as const

export const SINGULAR_A_OBJECT = new String('a',)
export const SINGULAR_B_OBJECT = new String('b',)
export const AB_OBJECT = [SINGULAR_A_OBJECT, SINGULAR_B_OBJECT,] as const
export const AAB_OBJECT = [SINGULAR_A_OBJECT, SINGULAR_A_OBJECT, SINGULAR_B_OBJECT,] as const
