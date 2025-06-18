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

import type {IteratorValue} from "./IteratorValue"

export abstract class AbstractIteratorValue<const T,
    const IS_DONE extends boolean = boolean, >
    implements IteratorValue<T> {

    protected constructor() {}


    public abstract isDone(): IS_DONE

    public get done(): IS_DONE { return this.isDone() }

    public isNotDone(): boolean { return !this.isDone() }

    public abstract get value(): T

}
