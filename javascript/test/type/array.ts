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

import type {Array, MutableArray} from "@joookiwi/type"

export type ValueIndexCallback<in T, > = (value: T, index: number, instance: Array<T>,) => void
export type ValueIndexWithReturnCallback<in T, out R, > = (value: T, index: number, instance: Array<T>,) => R

export type MutableValueIndexCallback<in T, > = (value: T, index: number, instance: MutableArray<T>,) => void
export type MutableValueIndexWithReturnCallback<in T, out R, > = (value: T, index: number, instance: MutableArray<T>,) => R


export type FlatMapCallback<in T, out U, > = (value: T, index: number, instance: MutableArray<T>,) => | Array<U> | U
export type SortedCallback<in T, > = (first: T, second: T,) => number


export type RestrainedReduceCallback<in T, out U, > = (previous: T, current: T, index: number, instance: Array<T>,) => U
export type ReduceCallback<T , > = (previous: T, current: T, index: number, instance: Array<T>,) => T

export type MutableRestrainedReduceCallback<in T, out U, > = (previous: T, current: T, index: number, instance: MutableArray<T>,) => U
export type MutableReduceCallback<T , > = (previous: T, current: T, index: number, instance: MutableArray<T>,) => T
