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

import type {InsideIteratorValue} from "./InsideIteratorValue"

import {AbstractIteratorValue} from "./AbstractIteratorValue"

/**
 * An implementation of an {@link InsideIteratorValue} with only the second value out of two
 * of a {@link CollectionIterator}
 *
 * @typeParam T The element type (`unknown` by default)
 */
export class IteratorValueOf2On2<const T = unknown, >
    extends AbstractIteratorValue<T, false>
    implements InsideIteratorValue<T> {

    readonly #value

    public constructor(value: T,) {
        super()
        this.#value = value
    }

    public get index(): 1 { return 1 }

    public override isDone(): false { return false }

    public override isNotDone(): true { return true }

    public override get value(): T { return this.#value }

}
