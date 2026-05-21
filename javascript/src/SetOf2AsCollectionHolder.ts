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

import type {Set, UndefinedOr} from "@joookiwi/type"

import {AbstractCollectionHolderOf2} from "./AbstractCollectionHolderOf2"

export class SetOf2AsCollectionHolder<const T = unknown,
    const T1 extends T = T,
    const T2 extends T = T,
    const REFERENCE extends Set<| T1 | T2> = Set<| T1 | T2>, >
    extends AbstractCollectionHolderOf2<T, T1, T2> {

    /** The internal value passed through the {@link constructor} in the {@link _reference} first field */
    public override readonly 0: T1
    /** The internal value passed through the {@link constructor} in the {@link _reference} second field */
    public override readonly 1: T2
    readonly #reference: WeakRef<REFERENCE>
    readonly #firstValue: T1
    readonly #secondValue: T2
    readonly #hasNull: boolean
    readonly #hasNoNulls: boolean
    readonly #hasDuplicate: boolean
    readonly #hasNoDuplicates: boolean

    public constructor(reference: REFERENCE,) {
        super()
        if (reference.size !== 2)
            throw new TypeError(`The set received in the “${this.constructor.name}” cannot have a different size than 1.`,)
        this.#reference = new WeakRef(reference,)
        const iterator = reference[Symbol.iterator]()
        const firstValue = this[0] = this.#firstValue = iterator.next().value as T1
        const secondValue = this[1] = this.#secondValue = iterator.next().value as T2
        this.#hasNoNulls = !(this.#hasNull = (firstValue == null || secondValue == null))
        this.#hasNoDuplicates = !(this.#hasDuplicate = firstValue as T === secondValue as T)
    }

    /** The internal value passed through the {@link constructor} in the {@link _reference} first field */
    public override get value1(): T1 { return this.#firstValue }

    /** The internal value passed through the {@link constructor} in the {@link _reference} second field */
    public override get value2(): T2 { return this.#secondValue }

    /**
     * The internal referenced passed through the {@link constructor}.
     *
     * It returns `undefined` if the reference has been garbed-collected.
     */
    protected get _reference(): UndefinedOr<REFERENCE> { return this.#reference.deref() }

    public override get hasNull(): boolean { return this.#hasNull }

    public override get hasNoNulls(): boolean { return this.#hasNoNulls }

    public override get hasDuplicate(): boolean { return this.#hasDuplicate }

    public override get hasNoDuplicates(): boolean { return this.#hasNoDuplicates }

}
