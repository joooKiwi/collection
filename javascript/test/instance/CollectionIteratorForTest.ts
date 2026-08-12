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

import type {CollectionIterator} from "../../src/iterator/CollectionIterator"

/**
 * A {@link CollectionIterator} that is specialized for the tests.
 *
 * It does so by providing common methods to be used in the tests
 */
export interface CollectionIteratorForTest<out T, >
    extends CollectionIterator<T> {

    /**
     * Do an action on the curent {@link CollectionIteratorForTest instance}
     * and return itself afterward
     *
     * @param action The action to do
     */
    execute(action: (instance: this,) => void,): this


    /** Call {@link CollectionIterator#next} 1 time and then return the current {@link CollectionHolderForTest instance} */
    do1Next(): this

    /** Call {@link CollectionIterator#next} 2 times and then return the current {@link CollectionHolderForTest instance} */
    do2Next(): this

    /** Call {@link CollectionIterator#previous} 1 time and then return the current {@link CollectionHolderForTest instance} */
    do1Previous(): this

    /** Call {@link CollectionIterator#previous} 2 times and then return the current {@link CollectionHolderForTest instance} */
    do2Previous(): this


    /** Call {@link CollectionIterator#previous} 1 time, then {@link CollectionIterator#next} 1 time and then return the current {@link CollectionHolderForTest instance} */
    do1PreviousAnd1Next(): this

    /** Call {@link CollectionIterator#previous} 1 time, then {@link CollectionIterator#next} 2 times and then return the current {@link CollectionHolderForTest instance} */
    do1PreviousAnd2Next(): this

    /** Call {@link CollectionIterator#previous} 2 times, then {@link CollectionIterator#next} 1 time and then return the current {@link CollectionHolderForTest instance} */
    do2PreviousAnd1Next(): this

    /** Call {@link CollectionIterator#previous} 2 times, then {@link CollectionIterator#next} 2 times and then return the current {@link CollectionHolderForTest instance} */
    do2PreviousAnd2Next(): this


    /** Call {@link CollectionIterator#next} 1 time, then {@link CollectionIterator#previous} 1 time and then return the current {@link CollectionHolderForTest instance} */
    do1NextAnd1Previous(): this

    /** Call {@link CollectionIterator#next} 1 time, then {@link CollectionIterator#previous} 2 times and then return the current {@link CollectionHolderForTest instance} */
    do1NextAnd2Previous(): this

    /** Call {@link CollectionIterator#next} 2 times, then {@link CollectionIterator#previous} 1 time and then return the current {@link CollectionHolderForTest instance} */
    do2NextAnd1Previous(): this

    /** Call {@link CollectionIterator#next} 2 times, then {@link CollectionIterator#previous} 2 times and then return the current {@link CollectionHolderForTest instance} */
    do2NextAnd2Previous(): this

    readonly length: never
    readonly count: never

    readonly hasAtLeast1Element: never
    readonly containsAtLeast1Element: never
    readonly includesAtLeast1Element: never

    readonly containsExactly1Element: never
    readonly includesExactly1Element: never

    readonly containsAtMost1Element: never
    readonly includesAtMost1Element: never

    readonly containsAtLeast2Elements: never
    readonly includesAtLeast2Elements: never

    readonly containsExactly2Elements: never
    readonly includesExactly2Elements: never

    readonly containsAtMost2Elements: never
    readonly includesAtMost2Elements: never

    readonly index: never

}
