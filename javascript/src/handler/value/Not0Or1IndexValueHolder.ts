/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {ValueHolder} from "./ValueHolder"

import {CollectionHolderIndexOutOfBoundsException} from "../../exception/CollectionHolderIndexOutOfBoundsException"

/**
 * A {@link ValueHolder} meant to give a {@link CollectionHolderIndexOutOfBoundsException} {@link cause}
 * because of an index that was not 1, 0, -1 or -2
 *
 * @beta
 * @see Not0Or1IndexAfterCalculationValueHolder
 */
export class Not0Or1IndexValueHolder
    implements ValueHolder<never> {

    readonly #index

    public constructor(index: number,) { this.#index = index }

    public get value(): null { return null }
    public get isForbidden(): false { return false }

    public get cause(): CollectionHolderIndexOutOfBoundsException {
        const index = this.#index
        return new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index ${index} was not 0, 1, -1 or -2.`, index,)
    }

}
