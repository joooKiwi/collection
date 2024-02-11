/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"

import {CollectionHandlerByMinimalistCollectionHolder} from "./CollectionHandlerByMinimalistCollectionHolder"

/** An implementation of a {@link CollectionHandler} for a {@link CollectionHolder} */
export class CollectionHandlerByCollectionHolder<const out T = unknown, const out REFERENCE extends CollectionHolder<T> = CollectionHolder<T>, const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends CollectionHandlerByMinimalistCollectionHolder<T, REFERENCE, COLLECTION> {

    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION, reference: REFERENCE,) {
        super(collection, reference,)
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    public override get isEmpty(): REFERENCE["isEmpty"] {
        return this._reference.isEmpty
    }

    //#endregion -------------------- Getter methods --------------------

}
