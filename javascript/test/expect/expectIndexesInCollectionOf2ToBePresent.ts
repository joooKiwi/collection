/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../../src/CollectionHolder"

import {AB} from "../value/arrays"

export function expectIndexesInCollectionOf2ToBePresent(collection: CollectionHolder, array: readonly[unknown, unknown,] = AB,) {
    expect(collection,).toContainKeys(['0', '1',],)
    expect(collection[0],).toBe(array[0],)
    expect(collection[1],).toBe(array[1],)
}
