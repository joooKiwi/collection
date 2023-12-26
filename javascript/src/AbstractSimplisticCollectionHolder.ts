/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {SimplisticCollectionHolder} from "./SimplisticCollectionHolder"

/**
 * A definition of a {@link SimplisticCollectionHolder} to have a common ancestor.
 *
 * @note This class should be inherited if new classes are being made to be more usable by the tools
 * @see EmptyCollectionHolder
 * @see GenericSimplisticCollectionHolder
 */
export abstract class AbstractSimplisticCollectionHolder<const out T = unknown, >
    implements SimplisticCollectionHolder<T> {

    //#region -------------------- Fields & constructor --------------------

    #isEmpty?: boolean

    protected constructor() {}

    //#endregion -------------------- Fields & constructor --------------------
    //#region -------------------- Methods & getter methods --------------------

    public abstract get size(): number

    public get isEmpty(): boolean {
        return this.#isEmpty ??= this.size !== 0
    }

    public abstract get(index: number,): T

    //#endregion -------------------- Methods & getter methods --------------------

}
