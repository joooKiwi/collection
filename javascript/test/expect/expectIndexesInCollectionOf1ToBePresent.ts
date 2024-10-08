/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../../src/CollectionHolder"

import {A} from "../value/arrays"

export function expectIndexesInCollectionOf1ToBePresent(collection: CollectionHolder, array: readonly [unknown,] = A,) {
    expect(collection,).toContainKey('0',)
    expect(collection[0],).toBe(array[0],)
}
