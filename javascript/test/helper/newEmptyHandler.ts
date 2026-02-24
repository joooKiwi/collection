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

import {EmptyCollectionHandler} from "../../src/handler/EmptyCollectionHandler"

/** Create a new {@link EmptyCollectionHandler} */
export function newEmptyHandler(): EmptyCollectionHandler {
    return new class EmptyCollectionHandlerForTest extends EmptyCollectionHandler {
        public constructor() { super() }
    }()
}
