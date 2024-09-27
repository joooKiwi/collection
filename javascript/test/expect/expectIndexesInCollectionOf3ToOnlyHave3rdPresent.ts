/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../../src/CollectionHolder"

import {ABC} from "../value/arrays"

export function expectIndexesInCollectionOf3ToOnlyHave3rdPresent(collection: CollectionHolder, array: readonly [unknown, ...readonly unknown[],] = ABC,) {
    expect(collection,).toContainKeys(["2",],)
    expect(collection,).not.toContainKeys(["0", "1",],)
    expect(collection[2],).toBe(array[2],)
}
