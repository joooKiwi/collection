/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {BooleanCallback, ReverseBooleanCallback} from "../../src/CollectionHolder.types"

export const callbackAsFail0 = (): never => {
    throw new Error("The test was not expected to have the callback being called",)
}
export const callbackAsFail1 = (_: unknown,): never => {
    throw new Error("The test was not expected to have the callback being called",)
}
export const callbackAsFail2 = (_1: unknown, _2: unknown,): never => {
    throw new Error("The test was not expected to have the callback being called",)
}

export function callbackAsFalseToFailAfter(value: number,): BooleanCallback<unknown> {
    return (_, i,) => {
        if (i > value)
            throw new Error(`The test was not expected to exceed the index “${value}” on the callback`,)
        return false
    }
}

export function callbackAsFalseToFailAfterAlt(value: number,): ReverseBooleanCallback<unknown> {
    return i => {
        if (i > value)
            throw new Error(`The test was not expected to exceed the index “${value}” on the callback`,)
        return false
    }
}
