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

export const callbackAsFail0 = (): never => {
    throw new Error("The test was not expected to have the callback being called",)
}
export const callbackAsFail1 = (_: unknown,): never => {
    throw new Error("The test was not expected to have the callback being called",)
}
export const callbackAsFail2 = (_1: unknown, _2: unknown,): never => {
    throw new Error("The test was not expected to have the callback being called",)
}

export const callbackAsFailAfter1Call0 = (() => {
    let amountOfTime = 0
    if (amountOfTime === 1)
        return callbackAsFail0
    amountOfTime++
    return () => {}
})()
export const callbackAsFailAfter1Call1 = (() => {
    let amountOfTime = 0
    if (amountOfTime === 1)
        return callbackAsFail1
    amountOfTime++
    return (_: unknown,) => {}
})()
export const callbackAsFailAfter1Call2 = (() => {
    let amountOfTime = 0
    if (amountOfTime === 1)
        return callbackAsFail2
    amountOfTime++
    return (_1: unknown, _2: unknown,) => {}
})()

export const callbackAsFailAfter2Calls0 = (() => {
    let amountOfTime = 0
    if (amountOfTime === 2)
        return callbackAsFail0
    amountOfTime++
    return () => {}
})()
export const callbackAsFailAfter2Calls1 = (() => {
    let amountOfTime = 0
    if (amountOfTime === 2)
        return callbackAsFail1
    amountOfTime++
    return (_: unknown,) => {}
})()
export const callbackAsFailAfter2Calls2 = (() => {
    let amountOfTime = 0
    if (amountOfTime === 2)
        return callbackAsFail2
    amountOfTime++
    return (_1: unknown, _2: unknown,) => {}
})()

export const callbackAsFailAfter4Calls0 = (() => {
    let amountOfTime = 0
    if (amountOfTime === 4)
        return callbackAsFail0
    amountOfTime++
    return () => {}
})()
export const callbackAsFailAfter4Calls1 = (() => {
    let amountOfTime = 0
    if (amountOfTime === 4)
        return callbackAsFail1
    amountOfTime++
    return (_: unknown,) => {}
})()
export const callbackAsFailAfter4Calls2 = (() => {
    let amountOfTime = 0
    if (amountOfTime === 4)
        return callbackAsFail2
    amountOfTime++
    return (_1: unknown, _2: unknown,) => {}
})()
