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

/**
 * An {@link IteratorResult iterator value} declaration to have
 * the core functionalities on a collection and an outside {@link IteratorValue}
 *
 * @see CollectionIteratorValue
 * @see OutsideIteratorValue
 */
export interface IteratorValue<out T = unknown, > {

    /** Tell that the {@link IteratorValue iterator value} could be able to progress */
    isDone(): boolean

    /**
     * Tell that the {@link IteratorValue iterator value} could be able to progress
     *
     * @alias IteratorValue.isDone
     */
    get done(): boolean

    /** Tell that the {@link IteratorValue iterator value} could not be able to progress */
    isNotDone(): boolean


    /** The value to retrieve by the iterator */
    get value(): T

}
