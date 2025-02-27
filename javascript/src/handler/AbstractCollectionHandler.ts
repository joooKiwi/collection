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

import type {CollectionHolder}                                   from "../CollectionHolder"
import type {CollectionHandler}                                  from "./CollectionHandler"
import type {ValueHolder}                                        from "./value/ValueHolder"
import type {PossibleIterableIteratorArraySetOrCollectionHolder} from "../type/possibleInstance"

export abstract class AbstractCollectionHandler<const T = unknown,
    const REFERENCE extends PossibleIterableIteratorArraySetOrCollectionHolder<T> = PossibleIterableIteratorArraySetOrCollectionHolder<T>,
    const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    implements CollectionHandler<T> {

    //#region -------------------- Fields --------------------

    readonly #collection: COLLECTION
    readonly #reference: REFERENCE

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

    public get isEmpty(): boolean { return this.size == 0 }

    public abstract get hasNull(): boolean

    public abstract get hasDuplicate(): boolean

    public abstract get hasFinished(): boolean

    //#endregion -------------------- Getter & setter methods --------------------
    //#region -------------------- Methods --------------------

    public abstract get(index: number,): ValueHolder<T>

    //#endregion -------------------- Methods --------------------

}
