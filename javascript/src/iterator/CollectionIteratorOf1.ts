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

import {AbstractCollectionIteratorOf1} from "./AbstractCollectionIteratorOf1"
import {IteratorValueOf1}              from "./value/IteratorValueOf1"

export class CollectionIteratorOf1<const T = unknown, >
    extends AbstractCollectionIteratorOf1<T> {

    readonly #value: T

    public constructor(value: T,) {
        super()
        this.#value = value
    }

    public override get value(): T { return this.#value }

    protected override get _valueResult(): IteratorValueOf1<T> { return new IteratorValueOf1(this.value,) }

    public override [Symbol.iterator](): CollectionIteratorOf1<T> {
        return new CollectionIteratorOf1(this.value,)
    }

}
