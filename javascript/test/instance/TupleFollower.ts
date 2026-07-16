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

export interface TupleFollower<out T, >
    extends Tuple<T> {

    /**
     * Do an action on the curent {@link TupleFollower instance}
     * and return itself afterward
     *
     * @param action The action to do
     */
    execute(action: (instance: this,) => void,): this


    /** The amount of time {@link Tuple.size} has been called */
    readonly size_amountOfCall: number

    /** The amount of time {@link Tuple.isEmpty} has been called */
    readonly isEmpty_amountOfCall: number
    /** The amount of time {@link Tuple.isNotEmpty} has been called */
    readonly isNotEmpty_amountOfCall: number

    /** The amount of time {@link Tuple.hasExactly1Element} has been called */
    readonly hasExactly1Element_amountOfCall: number
    /** The amount of time {@link Tuple.hasAtMost1Element} has been called */
    readonly hasAtMost1Element_amountOfCall: number

    /** The amount of time {@link Tuple.hasAtLeast2Elements} has been called */
    readonly hasAtLeast2Elements_amountOfCall: number
    /** The amount of time {@link Tuple.hasExactly2Elements} has been called */
    readonly hasExactly2Elements_amountOfCall: number
    /** The amount of time {@link Tuple.hasAtMost2Elements} has been called */
    readonly hasAtMost2Elements_amountOfCall: number

    /** The amount of time {@link Tuple.hasNull} has been called */
    readonly hasNull_amountOfCall: number
    /** The amount of time {@link Tuple.hasNoNulls} has been called */
    readonly hasNoNulls_amountOfCall: number

    /** The amount of time {@link Tuple.hasDuplicate} has been called */
    readonly hasDuplicate_amountOfCall: number
    /** The amount of time {@link Tuple.hasNoDuplicates} has been called */
    readonly hasNoDuplicates_amountOfCall: number

}
