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

import {JsIterableAsCollectionHolder} from "../../src/JsIterableAsCollectionHolder"

/**
 * A {@link CollectionHolder} extending {@link JsIterableAsCollectionHolder}
 * that have no end and always have a next value to <b>a</b>
 */
export class InfiniteCollectionHolder_FromJsIterable
    extends JsIterableAsCollectionHolder<'a'> {

    public constructor() {
        super({ *[Symbol.iterator]() { while (true) yield 'a' }, } satisfies Iterable<'a'>,)
    }

    /**
     * Do an action on the curent {@link InfiniteCollectionHolder_FromJsIterable instance}
     * and return itself afterward
     *
     * @param action The action to do
     */
    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

}
