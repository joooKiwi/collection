/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

/** @internal */
export function __values<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    const array = new Array<T>(size,)
    let index = size
    while (index-- > 0)
        array[index] = collection.get(index,)
    return array
}

/** @internal */
export function __uniqueValues<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    //#region -------------------- Possibly remove duplicates --------------------

    const array1 = new Array<T>(size,)
    array1[0] = collection.get(0,)
    let amountOfItemAdded = 1
    let index1 = -1
    loopToRemoveDuplicate: while (++index1 < size) {
        const value = collection.get(index1,)
        let index2 = -1
        while (++index2 < amountOfItemAdded) {
            if (array1[index2] === value)
                continue loopToRemoveDuplicate // It is equal, so we don't add it to the duplicates
            array1[amountOfItemAdded++] = value
        }
    }

    if (amountOfItemAdded == size)
        return array1

    //#endregion -------------------- Possibly remove duplicates --------------------
    //#region -------------------- Return the non-duplicated values --------------------

    const array2 = new Array<T>(amountOfItemAdded,)
    let index3 = amountOfItemAdded
    while (index3-- > 0)
        array2[index3] = array1[index3] as T
    return array2

    //#endregion -------------------- Return the non-duplicated values --------------------
}

/** @internal */
export function __associativeValues<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    const array = new Array<readonly [number, T,]>(size,)
    let index = size
    while (index-- > 0)
        array[index] = [index, collection.get(index,),]
    return array
}
