/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {ValueHolder} from "./ValueHolder"

import {CollectionHolderIndexOutOfBoundsException} from "../../exception/CollectionHolderIndexOutOfBoundsException"

/**
 * A {@link ValueHolder} meant to throw a {@link CollectionHolderIndexOutOfBoundsException}
 * because the <b>index</b> was over the {@link CollectionHolder collection} {@link CollectionHolder.size size}
 *
 * @beta
 * @see UnderZeroIndexAfterCalculationValueHolder
 * @see OverSizeIndexAfterCalculationValueHolder
 */
export class OverSizeIndexValueHolder
    implements ValueHolder<never> {

    readonly #index
    readonly #size

    public constructor(index: number, size: number,) {
        this.#index = index
        this.#size = size
    }

    public get value(): null { return null }
    public get isForbidden(): false { return false }

    public get cause(): CollectionHolderIndexOutOfBoundsException<number> {
        const index = this.#index
        return new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index ${index} is over the size of the collection (${this.#size}).`, index,)
    }

}
