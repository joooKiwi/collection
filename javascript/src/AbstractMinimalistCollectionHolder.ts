/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {MinimalistCollectionHolder} from "./MinimalistCollectionHolder"

/**
 * A definition of a {@link MinimalistCollectionHolder} to have a common ancestor.
 *
 * @note This class should be inherited if new classes are being made to be more usable by the tools
 * @see EmptyCollectionHolder
 * @see GenericMinimalistCollectionHolder
 */
export abstract class AbstractMinimalistCollectionHolder<const out T = unknown, >
    implements MinimalistCollectionHolder<T> {

    protected constructor() {}

    public abstract get size(): number

    public abstract get(index: number,): T

}
