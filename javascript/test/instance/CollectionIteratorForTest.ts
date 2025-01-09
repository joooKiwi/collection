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

import type {CollectionIterator} from "../../src/iterator/CollectionIterator"

/**
 * A {@link CollectionIterator} that is specialized for the tests.
 *
 * It does so by providing common methods to be used in the tests
 */
export interface CollectionIteratorForTest<out T, >
    extends CollectionIterator<T> {

    /** The amount of time a specific method (non-aliased method) has been called */
    readonly amountOfCall: number

    /**
     * Do an action on the curent {@link CollectionIteratorForTest instance}
     * and return itself afterward
     *
     * @param action The action to do
     */
    execute(action: (instance: this,) => void,): this

}
