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

import {AbstractMinimalistCollectionHolder} from "./AbstractMinimalistCollectionHolder"

/**
 * A {@link MinimalistCollectionHolder} that hold another {@link MinimalistCollectionHolder}
 * (which could be mutable)
 * to only view it
 *
 * @apiNote It does not change any behaviour from its {@link reference}
 * @typeParam T         The element type
 * @typeParam REFERENCE The reference passed in the constructor
 */
export class MinimalistCollectionViewer<const T = unknown,
    const REFERENCE extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >
    extends AbstractMinimalistCollectionHolder<T> {

    readonly #reference: REFERENCE

    public constructor(reference: REFERENCE,) {
        super()
        this.#reference = reference
    }

    /** The reference to view */
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
