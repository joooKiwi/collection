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

import {Holder} from "../Holder"

export const callbackAsTrue0 = () => true
export const callbackAsTrue1 = (_: unknown,) => true
export const callbackAsTrue2 = (_1: unknown, _2: unknown,) => true
export const callbackAsFalse0 = () => false
export const callbackAsFalse1 = (_: unknown,) => false
export const callbackAsFalse2 = (_1: unknown, _2: unknown,) => false
export const trueCallbacks = [
    new Holder(callbackAsTrue0, "0 arguments",),
    new Holder(callbackAsTrue1, "1 argument",),
    new Holder(callbackAsTrue2, "2 arguments",),
] as const
export const falseCallbacks = [
    new Holder(callbackAsFalse0, "0 arguments",),
    new Holder(callbackAsFalse1, "1 argument",),
    new Holder(callbackAsFalse2, "2 arguments",),
] as const
