/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"
import type {ValueHolder}      from "./ValueHolder"

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "../exception/EmptyCollectionHolderException"
import {SetCollectionHandler}                      from "./SetCollection.handler"

/** An implementation of a {@link CollectionHolder} for an {@link ReadonlySet set} or 1 element */
export class SetCollectionOf1Handler<const out T = unknown, const REFERENCE extends ReadonlySet<T> = ReadonlySet<T>, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends SetCollectionHandler<T, REFERENCE, COLLECTION> {

    //#region -------------------- Constructor --------------------
    public constructor(collection: COLLECTION, reference: REFERENCE,) {
        super(collection, reference,)
        if (reference.size !== 1)
            throw new TypeError(`The set received in the "${this.constructor.name}" cannot have a different size than 1.`,)
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    public override get size(): 1 {
        return 1
    }

    public override get isEmpty(): false {
        return false
    }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    public override get(index: number,): ValueHolder<T> {
        if (this.isEmpty)
            return { value: null, get cause() { return new EmptyCollectionHolderException("No element at any index could be found since it it empty.", index,) }, }
        if (index > 0)
            return { value: null, get cause() { return new CollectionHolderIndexOutOfBoundsException(`The index ${index} was not 0 or -1.`, index,) }, }
        if (index < -1)
            return { value: null, get cause() { return new CollectionHolderIndexOutOfBoundsException(`The index ${index} (${index + 1} after calculation) was not 0 or -1.`, index,) }, }

        const collection = this._collection
        if (0 in collection)
            return { value: collection[0] as T, cause: null, }

        const value = collection[0] = this._reference[Symbol.iterator]().next().value
        this._hasFinished = true
        return { value: value, cause: null, }
    }

    //#endregion -------------------- Methods --------------------

}
