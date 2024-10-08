/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {LazyGenericCollectionHolder} from "../../src/LazyGenericCollectionHolder"

/** A {@link CollectionHolder} that have no end and always have a next value to <b>a</b> */
export class InfiniteCollectionHolder
    extends LazyGenericCollectionHolder<'a'> {

    public constructor() {
        super({ *[Symbol.iterator]() { while (true) yield 'a' },} satisfies Iterable<'a'>,)
    }

}
