/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {ValueHolder} from "./ValueHolder"

import {CollectionHolderIndexOutOfBoundsException} from "../../exception/CollectionHolderIndexOutOfBoundsException"

/**
 * A {@link ValueHolder} meant to throw a {@link CollectionHolderIndexOutOfBoundsException}
 * because the <b>index</b> was under 0
 * after it was calculated
 *
 * @beta
 * @see OverSizeIndexValueHolder
 * @see OverSizeIndexAfterCalculationValueHolder
 */
export class UnderZeroIndexAfterCalculationValueHolder
    implements ValueHolder<never> {

    readonly #index
    readonly #indexToRetrieve

    public constructor(index: number, indexToRetrieve: number,) {
        this.#index = index
        this.#indexToRetrieve = indexToRetrieve
    }

    public get value(): null { return null }
    public get isForbidden(): false { return false }

    public get cause(): CollectionHolderIndexOutOfBoundsException<number> {
        const index = this.#index
        return new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index ${index} (${this.#indexToRetrieve} after calculation) is under 0.`, index,)
    }

}
