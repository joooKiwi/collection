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

import type {BooleanCallback, ReverseBooleanCallback} from "../../src/type/callback"

export const callbackAsString0 = () => ''
export const callbackAsString1 = (_: unknown,) => ''
export const callbackAsString2 = (_1: unknown, _2: unknown,) => ''


export const callbackToString0 = () => 'E'
export const callbackToUpperString1 = <const T extends string, >(it: T,) => it.toUpperCase() as Uppercase<T>
export const callbackToUpperString1Alt = <const T extends string, >(_: unknown, it: T,) => it.toUpperCase() as Uppercase<T>
export const callbackToUpperString2 = <const T extends string, >(it: T, i: number,) => `${i}:${it.toUpperCase() as Uppercase<T>}` as const
export const callbackToUpperString2Alt = <const T extends string, >(i: number, it: T,) => `${i}:${it.toUpperCase() as Uppercase<T>}` as const


export const callbackIsA: BooleanCallback<string> = it => it === 'a'
export const callbackIsB: BooleanCallback<string> = it => it === 'b'
export const callbackIsC: BooleanCallback<string> = it => it === 'c'
export const callbackIsD: BooleanCallback<string> = it => it === 'd'
export const callbackIsE: BooleanCallback<string> = it => it === 'e'

export const callbackIsAAlt: ReverseBooleanCallback<string> = (_, it,) => it === 'a'
export const callbackIsBAlt: ReverseBooleanCallback<string> = (_, it,) => it === 'b'
export const callbackIsCAlt: ReverseBooleanCallback<string> = (_, it,) => it === 'c'
export const callbackIsDAlt: ReverseBooleanCallback<string> = (_, it,) => it === 'd'
export const callbackIsEAlt: ReverseBooleanCallback<string> = (_, it,) => it === 'e'


export const callbackIsUnderA: BooleanCallback<string> = it => it < 'a'
export const callbackIsUnderB: BooleanCallback<string> = it => it < 'b'
export const callbackIsUnderC: BooleanCallback<string> = it => it < 'c'
export const callbackIsUnderD: BooleanCallback<string> = it => it < 'd'
export const callbackIsUnderE: BooleanCallback<string> = it => it < 'e'

export const callbackIsUnderAAlt: ReverseBooleanCallback<string> = (_, it,) => it < 'a'
export const callbackIsUnderBAlt: ReverseBooleanCallback<string> = (_, it,) => it < 'b'
export const callbackIsUnderCAlt: ReverseBooleanCallback<string> = (_, it,) => it < 'c'
export const callbackIsUnderDAlt: ReverseBooleanCallback<string> = (_, it,) => it < 'd'
export const callbackIsUnderEAlt: ReverseBooleanCallback<string> = (_, it,) => it < 'e'


export const callbackIsOverA: BooleanCallback<string> = it => it > 'a'
export const callbackIsOverB: BooleanCallback<string> = it => it > 'b'
export const callbackIsOverC: BooleanCallback<string> = it => it > 'c'
export const callbackIsOverD: BooleanCallback<string> = it => it > 'd'
export const callbackIsOverE: BooleanCallback<string> = it => it > 'e'

export const callbackIsOverAAlt: ReverseBooleanCallback<string> = (_, it,) => it > 'a'
export const callbackIsOverBAlt: ReverseBooleanCallback<string> = (_, it,) => it > 'b'
export const callbackIsOverCAlt: ReverseBooleanCallback<string> = (_, it,) => it > 'c'
export const callbackIsOverDAlt: ReverseBooleanCallback<string> = (_, it,) => it > 'd'
export const callbackIsOverEAlt: ReverseBooleanCallback<string> = (_, it,) => it > 'e'
