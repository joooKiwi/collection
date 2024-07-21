/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../../src/CollectionHolder"

import {ABC} from "../constantCollections"

export function expectIndexesInCollectionOf3ToNotHave1stPresent(collection: CollectionHolder, array: readonly [unknown, ...readonly unknown[],] = ABC,) {
    expect(collection,).toContainKeys(["1", "2",],)
    expect(collection,).not.toContainKeys(["0",],)
    expect(collection[1],).toBe(array[1],)
    expect(collection[2],).toBe(array[2],)
}
