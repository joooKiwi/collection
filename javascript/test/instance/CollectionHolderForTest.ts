/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../../src/CollectionHolder"

/**
 * A {@link CollectionHolder} that is specialized for the tests.
 *
 * It does so by providing common methods to be used in the tests
 */
export interface CollectionHolderForTest<out T, >
    extends CollectionHolder<T> {

    /** The amount of time a specific method ({@link get} or a non-aliased method) has been called */
    readonly amountOfCall: number

    /**
     * Do an action on the curent {@link CollectionHolderForTest instance}
     * and return itself afterward
     *
     * @param action The action to do
     */
    execute(action: (instance: this,) => void,): this

}
