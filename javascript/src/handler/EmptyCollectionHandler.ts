/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHandler} from "./CollectionHandler"
import type {ValueHolder}       from "./value/ValueHolder"

import {EmptyCollectionValueHolder} from "./value/EmptyCollectionValueHolder"

/**
 * An implementation of an empty {@link CollectionHandler}
 *
 * @beta
 */
export class EmptyCollectionHandler
    implements CollectionHandler<never> {

    //#region -------------------- Singleton usage --------------------

    static #instance?: EmptyCollectionHandler

    protected constructor() {}

    public static get get(): EmptyCollectionHandler { return EmptyCollectionHandler.#instance ??= new EmptyCollectionHandler() }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Getter methods --------------------

    public get size(): 0 { return 0 }

    public get isEmpty(): true { return true }

    public get hasNull(): false { return false }

    public get hasDuplicate(): false { return false }

    public get hasFinished(): true { return true }

    //#endregion -------------------- Getter methods --------------------

    public get(index: number,): ValueHolder<never> { return new EmptyCollectionValueHolder(index,) }

}
