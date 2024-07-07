/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {EmptyCollectionHandler} from "../../src/handler/EmptyCollectionHandler"

/** Create a new {@link EmptyCollectionHandler} */
export function newEmptyHandler(): EmptyCollectionHandler {
    return new class EmptyCollectionHandlerForTest extends EmptyCollectionHandler {
        public constructor() { super() }
    }()
}
