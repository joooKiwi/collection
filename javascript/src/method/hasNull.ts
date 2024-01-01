/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable}                   from "../general type"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

/**
 * The {@link collection} has at least one <b>null</b> or <b>undefined</b>
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @return {boolean} <b>true</b> only if one element is <b>null</b> or <b>undefined</b>
 * @extensionFunction
 */
export function hasNull(collection: Nullable<MinimalistCollectionHolder>,): boolean {
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false

    const size = collection.size
    let index = -1
    while (++index < size)
        if (collection.get(index) == null)
            return true
    return false
}
