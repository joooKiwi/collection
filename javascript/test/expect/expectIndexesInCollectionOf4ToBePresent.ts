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

import type {CollectionHolder} from "../../src/CollectionHolder"

import {ABCD} from "../value/arrays"

export function expectIndexesInCollectionOf4ToBePresent(collection: CollectionHolder, array: readonly[unknown, unknown, unknown, unknown,] = ABCD,) {
    expect(collection,).toContainKeys(['0', '1', '2', '3',],)
    expect(collection[0],).toBe(array[0],)
    expect(collection[1],).toBe(array[1],)
    expect(collection[2],).toBe(array[2],)
    expect(collection[3],).toBe(array[3],)
}
