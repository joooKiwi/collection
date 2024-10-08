/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../../src/CollectionHolder"

import {AB} from "../value/arrays"

export function expectIndexesInCollectionOf2ToOnlyHave1stPresent(collection: CollectionHolder, array: readonly [unknown, unknown,] = AB,) {
    expect(collection,).toContainKeys(['0',],)
    expect(collection,).not.toContainKeys(['1',],)
    expect(collection[0],).toBe(array[0],)
}
