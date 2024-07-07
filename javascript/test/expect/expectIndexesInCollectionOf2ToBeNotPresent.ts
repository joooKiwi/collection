/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../../src/CollectionHolder"

export function expectIndexesInCollectionOf2ToBeNotPresent(collection: CollectionHolder,) {
    expect(collection,).not.toContainKeys(["0", "1",],)
}
