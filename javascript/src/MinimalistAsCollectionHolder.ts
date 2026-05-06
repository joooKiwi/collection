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

import type {MinimalistCollectionHolder} from "./MinimalistCollectionHolder"

import {AbstractCollectionHolder} from "./AbstractCollectionHolder"

/**
 *
 * @adaptor
 */
export class MinimalistAsCollectionHolder<const T,
    const REFERENCE extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >
    extends AbstractCollectionHolder<T> {

    readonly #reference: REFERENCE

    public constructor(reference: REFERENCE,) {
        super()
        this.#reference = reference
    }

    /** The reference passed through the {@link constructor} */
    public get reference(): REFERENCE {
        return this.#reference
    }

    public override get size(): REFERENCE["size"] {
        return this.reference.size
    }

    public override get(index: number,): T {
        return this.reference.get(index,)
    }

}
