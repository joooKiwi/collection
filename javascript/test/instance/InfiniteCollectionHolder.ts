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

import {LazyGenericCollectionHolder} from "../../src/LazyGenericCollectionHolder"

/** A {@link CollectionHolder} that have no end and always have a next value to <b>a</b> */
export class InfiniteCollectionHolder
    extends LazyGenericCollectionHolder<'a'> {

    public constructor() {
        super({ *[Symbol.iterator]() { while (true) yield 'a' },} satisfies Iterable<'a'>,)
    }

}
