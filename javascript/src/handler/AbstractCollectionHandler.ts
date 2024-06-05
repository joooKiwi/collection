/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                  from "../CollectionHolder"
import type {PossibleIterableOrCollection} from "../CollectionHolder.types"
import type {CollectionHandler}            from "./CollectionHandler"
import type {ValueHolder}                  from "./value/ValueHolder"

/** @beta */
export abstract class AbstractCollectionHandler<const out T = unknown,
    const out REFERENCE extends PossibleIterableOrCollection<T> = PossibleIterableOrCollection<T>,
    const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    implements CollectionHandler<T> {

    //#region -------------------- Fields --------------------

    readonly #collection: COLLECTION
    readonly #reference: REFERENCE
    #hasFinished?: boolean

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected constructor(collection: COLLECTION, reference: REFERENCE,) {
        this.#collection = collection
        this.#reference = reference
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter & setter methods --------------------

    /** The reference to retrieve the values */
    protected get _reference(): REFERENCE { return this.#reference }

    /** The {@link CollectionHolder} reference to set the indices */
    protected get _collection(): COLLECTION { return this.#collection }


    public abstract get size(): number

    public abstract get isEmpty(): boolean

    public abstract get hasDuplicate(): boolean

    public get hasFinished(): boolean { return this.#hasFinished ??= false }

    /** Set the {@link hasFinished} to the value received */
    protected set _hasFinished(value: boolean,) { this.#hasFinished = value }

    //#endregion -------------------- Getter & setter methods --------------------
    //#region -------------------- Methods --------------------

    public abstract get(index: number,): ValueHolder<T>

    //#endregion -------------------- Methods --------------------

}
