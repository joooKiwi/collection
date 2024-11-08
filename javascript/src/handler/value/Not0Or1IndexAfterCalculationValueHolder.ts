/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {ValueHolder} from "./ValueHolder"

import {IndexOutOfBoundsException} from "../../exception/IndexOutOfBoundsException"

/**
 * A {@link ValueHolder} meant to give a {@link IndexOutOfBoundsException} {@link cause}
 * because of an index that was not 1, 0, -1 or -2
 * after it was calculated
 *
 * @beta
 * @see Not0Or1IndexValueHolder
 */
export class Not0Or1IndexAfterCalculationValueHolder
    implements ValueHolder<never> {

    readonly #index

    public constructor(index: number,) { this.#index = index }

    public get value(): null { return null }
    public get isForbidden(): false { return false }

    public get cause(): IndexOutOfBoundsException {
        const index = this.#index
        return new IndexOutOfBoundsException(`Index out of bound. The index ${index} (${index + 2} after calculation) was not 0, 1, -1 or -2.`, index,)
    }

}
