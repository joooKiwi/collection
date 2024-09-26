/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}        from "../../src/CollectionHolder"
import type {CollectionHolderForTest} from "./CollectionHolderForTest"

/**
 * A {@link CollectionHolderForTest} that has an {@link instance}
 * and is watching the amount of time {@link get} is being called for the tests
 */
export interface CollectionHolderForTestHavingAnInstance<out T, >
    extends CollectionHolderForTest<T> {

    /**
     * Do an action on the curent {@link CollectionHolderForTest instance}
     * while ignoring any {@link CollectionHolderIndexOutOfBoundsException} being thrown
     * and return itself afterward
     *
     * @param action The action to do
     */
    executeWhileIgnoringIndexOutOfBound(action: (instance: this,) => void,): this

    /**
     * Do an action on the curent {@link CollectionHolderForTest instance}
     * while ignoring any {@link EmptyCollectionHolderException} being thrown
     * and return itself afterward
     *
     * @param action The action to do
     */
    executeWhileIgnoringEmptyException(action: (instance: this,) => void,): this

    /**
     * Do an action on the current {@link CollectionHolderForTest instance}
     * and have the index being present on the returned {@link CollectionHolder collection} on the action
     * and return itself afterward
     *
     * @param action The action to do
     */
    executeWhileHavingIndexesOnField<const U, >(action: (instance: this,) => CollectionHolder<U>,): this

    /**
     * Do an action on the current {@link CollectionHolderForTest instance}
     * and have the index being present on the returned {@link CollectionHolder collection}
     * after the action
     *
     * @param action The action to do
     */
    executeToHaveIndexesOnField<const U, >(action: (instance: this,) => CollectionHolder<U>,): CollectionHolder<U>

}
