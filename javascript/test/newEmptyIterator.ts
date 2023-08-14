/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {EmptyCollectionIterator} from "../src/iterator/EmptyCollectionIterator"

/** Create a new {@link EmptyCollectionIterator} simply */
export function newEmptyIterator(): EmptyCollectionIterator {
    return new class EmptyCollectionIteratorForTest extends EmptyCollectionIterator {
        public constructor() { super() }
    }()
}
