/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {LazyGenericCollectionHolder} from "../../src/LazyGenericCollectionHolder"

/** A {@link LazyGenericCollectionHolder} made for the test to do task from its internal state */
export class LazyCollectionHolderThatCanRetrieveHandler<const out T, >
    extends LazyGenericCollectionHolder<T> {

    public retrieveHandler(): this {
        this._handler
        return this
    }

}
