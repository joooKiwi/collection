/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {BooleanCallback, ReverseBooleanCallback} from "../../src/CollectionHolder.types"

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
