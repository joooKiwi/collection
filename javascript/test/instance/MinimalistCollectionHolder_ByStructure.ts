/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {MinimalistCollectionHolder} from "../../src/MinimalistCollectionHolder"

import {MinimalistCollectionHolderFromArray} from "./MinimalistCollectionHolderFromArray"

/**
 * A {@link MinimalistCollectionHolder} having the structure of it,
 * but without inheriting the {@link AbstractMinimalistCollectionHolder}.
 *
 * Internally, it is using a {@link MinimalistCollectionHolderFromArray} for every method
 */
export class MinimalistCollectionHolder_ByStructure<const out T, >
    implements MinimalistCollectionHolder<T> {

    public readonly reference

    public constructor(array: readonly T[],) { this.reference = new MinimalistCollectionHolderFromArray(array,) }

    public get size(): number { return this.reference.size }

    public get(index: number,): T { return this.reference.get(index,) }

}
