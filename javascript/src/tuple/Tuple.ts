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

import type {Array, Set} from "@joookiwi/type"

import type {CollectionHolder} from "../CollectionHolder"

/**
 * @see Couple
 */
export interface Tuple<out T, > {

    toArray(): Array<T>

    toSet(): Set<T>

    toCollection(): CollectionHolder<T>

    readonly size: number

    readonly isEmpty: boolean
    readonly isNotEmpty: boolean

    readonly hasNull: boolean
    readonly hasNoNulls: boolean

    readonly hasDuplicate: boolean
    readonly hasNoDuplicates: boolean

    toString(): string

}
