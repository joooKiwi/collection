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

export const callbackAsNull0 = () => null
export const callbackAsUndefined0 = () => undefined

export const callbackOnlyIfEven = <const T, >(it: T, i: number,) => i % 2 === 0 ? it : null
export const callbackOnlyIfEvenAlt = <const T, >(i: number, it: T,) => i % 2 === 0 ? it : null

export const callbackOnlyIfOdd = <const T, >(it: T, i: number,) => i % 2 === 0 ? null : it
export const callbackOnlyIfOddAlt = <const T, >(i: number, it: T,) => i % 2 === 0 ? null : it
