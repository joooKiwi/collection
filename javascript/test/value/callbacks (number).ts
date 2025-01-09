//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {BooleanCallback, ReverseBooleanCallback} from "../../src/type/callback"

export const callbackIsEven: ReverseBooleanCallback<unknown> = it => it % 2 === 0
export const callbackIsOdd: ReverseBooleanCallback<unknown> = i => i % 2 !== 0

export const callbackIsEvenAlt: BooleanCallback<unknown> = (_, i,) => i % 2 === 0
export const callbackIsOddAlt: BooleanCallback<unknown> = (_, i,) => i % 2 !== 0


export const callbackIs0: ReverseBooleanCallback<unknown> = i => i === 0
export const callbackIs1: ReverseBooleanCallback<unknown> = i => i === 1
export const callbackIs2: ReverseBooleanCallback<unknown> = i => i === 2
export const callbackIs3: ReverseBooleanCallback<unknown> = i => i === 3
export const callbackIs4: ReverseBooleanCallback<unknown> = i => i === 4

export const callbackIs0Alt: BooleanCallback<unknown> = (_, i,) => i === 0
export const callbackIs1Alt: BooleanCallback<unknown> = (_, i,) => i === 1
export const callbackIs2Alt: BooleanCallback<unknown> = (_, i,) => i === 2
export const callbackIs3Alt: BooleanCallback<unknown> = (_, i,) => i === 3
export const callbackIs4Alt: BooleanCallback<unknown> = (_, i,) => i === 4


export const callbackIsUnder0: ReverseBooleanCallback<unknown> = i => i < 0
export const callbackIsUnder1: ReverseBooleanCallback<unknown> = i => i < 1
export const callbackIsUnder2: ReverseBooleanCallback<unknown> = i => i < 2
export const callbackIsUnder3: ReverseBooleanCallback<unknown> = i => i < 3
export const callbackIsUnder4: ReverseBooleanCallback<unknown> = i => i < 4

export const callbackIsUnder0Alt: BooleanCallback<unknown> = (_, i,) => i < 0
export const callbackIsUnder1Alt: BooleanCallback<unknown> = (_, i,) => i < 1
export const callbackIsUnder2Alt: BooleanCallback<unknown> = (_, i,) => i < 2
export const callbackIsUnder3Alt: BooleanCallback<unknown> = (_, i,) => i < 3
export const callbackIsUnder4Alt: BooleanCallback<unknown> = (_, i,) => i < 4


export const callbackIsOver0: ReverseBooleanCallback<unknown> = i => i > 0
export const callbackIsOver1: ReverseBooleanCallback<unknown> = i => i > 1
export const callbackIsOver2: ReverseBooleanCallback<unknown> = i => i > 2
export const callbackIsOver3: ReverseBooleanCallback<unknown> = i => i > 3
export const callbackIsOver4: ReverseBooleanCallback<unknown> = i => i > 4

export const callbackIsOver0Alt: BooleanCallback<unknown> = (_, i,) => i > 0
export const callbackIsOver1Alt: BooleanCallback<unknown> = (_, i,) => i > 1
export const callbackIsOver2Alt: BooleanCallback<unknown> = (_, i,) => i > 2
export const callbackIsOver3Alt: BooleanCallback<unknown> = (_, i,) => i > 3
export const callbackIsOver4Alt: BooleanCallback<unknown> = (_, i,) => i > 4
