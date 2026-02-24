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

import type {CollectionHolder} from "../../src/CollectionHolder"

import {ABCD} from "../value/arrays"

export function expectIndexesInCollectionOf4ToOnlyHave1stPresent(collection: CollectionHolder, array: readonly [unknown, unknown, unknown, unknown,] = ABCD,) {
    expect(collection,).toContainKeys(['0',],)
    expect(collection,).not.toContainKeys(['1', '2', '3',],)
    expect(collection[0],).toBe(array[0],)
}
