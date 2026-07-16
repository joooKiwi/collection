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

import type {Tuple} from "../../src/tuple/Tuple"

/**
 * A {@link Tuple} that is specialized for the tests.
 *
 * It does so by providing common methods to be used in the tests
 */
export interface TupleForTest<out T, >
    extends Tuple<T> {

    /**
     * Do an action on the curent {@link Tuple instance}
     * and return itself afterward
     *
     * @param action The action to do
     */
    execute(action: (instance: this,) => void,): this

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

    readonly includesNull: never
    readonly containsNull: never

    readonly includesNoNulls: never
    readonly containsNoNulls: never

    readonly includesDuplicate: never
    readonly containsDuplicate: never

    readonly includesNoDuplicates: never
    readonly containsNoDuplicates: never

}
