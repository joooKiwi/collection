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

import {BooleanCallback, ReverseBooleanCallback} from "../../src/type/callback"

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
