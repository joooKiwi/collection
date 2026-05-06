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
import type {Tuple}            from "./Tuple"

export abstract class AbstractTuple<const T, >
    implements Tuple<T> {

    protected constructor() {}

    public abstract toArray(): Array<T>

    public abstract toSet(): Set<T>

    public abstract toCollection(): CollectionHolder<T>

    public abstract get size(): number

    public abstract get isEmpty(): boolean
    public abstract get isNotEmpty(): boolean

    public abstract get hasNull(): boolean
    public abstract get hasNoNulls(): boolean

    public abstract get hasDuplicate(): boolean
    public abstract get hasNoDuplicates(): boolean


    public abstract toString(): string

}
