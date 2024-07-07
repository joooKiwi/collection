/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../../src/CollectionHolder"

import {AB} from "../constantCollections"

export function expectIndexesInCollectionOf2ToOnlyHave2ndPresent(collection: CollectionHolder, array: readonly[unknown, ...readonly unknown[],] = AB,) {
    expect(collection,).toContainKeys(["1",],)
    expect(collection,).not.toContainKeys(["0",],)
    expect(collection[1],).toBe(array[1],)
}
