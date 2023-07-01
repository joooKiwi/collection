/*
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi
 *
 * This project is free to use.
 * All the right is reserved to the author of this project.
 */

import type {CollectionHolder} from "../CollectionHolder"
import type {Nullable}         from "../general type"

/**
 * Convert the {@link collection} to a new {@link IterableIterator}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 *
 * @extensionFunction
 */
export function* toIterator<const T, >(collection: Nullable<CollectionHolder<T>>,): IterableIterator<T> {
    if (collection == null)
        return

    const size = collection.size
    let index = -1
    while (++index < size)
        yield collection.get(index,)
}
