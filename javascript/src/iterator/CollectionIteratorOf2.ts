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

import {AbstractCollectionIteratorOf2} from "./AbstractCollectionIteratorOf2"
import {IteratorValueOf1On2}           from "./value/IteratorValueOf1On2"
import {IteratorValueOf2On2}           from "./value/IteratorValueOf2On2"

export class CollectionIteratorOf2<const T = unknown,
    const T1 extends T = T,
    const T2 extends T = T, >
    extends AbstractCollectionIteratorOf2<T, T1, T2> {

    readonly #value1: T1
    readonly #value2: T2

    public constructor(value1: T1, value2: T2,) {
        super()
        this.#value1 = value1
        this.#value2 = value2
    }

    public override get value1(): T1 { return this.#value1 }

    public override get value2(): T2 { return this.#value2 }

    protected override get _valueResult1(): IteratorValueOf1On2<T1> { return new IteratorValueOf1On2(this.value1,) }

    protected override get _valueResult2(): IteratorValueOf2On2<T2> { return new IteratorValueOf2On2(this.value2,) }

    public override [Symbol.iterator](): CollectionIteratorOf2<T, T1, T2> {
        return new CollectionIteratorOf2(this.value1, this.value2,)
    }

}
