/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {CollectionHandler} from "./Collection.handler"
import type {ValueHolder}       from "./ValueHolder"

/** A simple implementation of an empty {@link CollectionHandler} */
export class EmptyCollectionHandler
    implements CollectionHandler<never> {

    //#region -------------------- Singleton usage --------------------

    static #instance?: EmptyCollectionHandler

    protected constructor() {
    }

    public static get get(): EmptyCollectionHandler {
        return EmptyCollectionHandler.#instance ??= new EmptyCollectionHandler()
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Getter methods --------------------

    public get reference(): never {
        throw new ReferenceError("No reference can exist on an empty collection handler",)
    }

    public readonly size = 0
    public readonly isEmpty = true
    public readonly hasFinished = true

    //#endregion -------------------- Getter methods --------------------

    public get(_index: number,): ValueHolder<never> {
        return { value: null, get cause() { return new ReferenceError("No value can exist in an empty collection",) }, }
    }

}
