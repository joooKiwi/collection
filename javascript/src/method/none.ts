/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {BooleanCallback}                    from "../CollectionHolder.types"
import type {Nullable}                           from "../general type"
import type {MinimalistCollectionHolder}         from "../MinimalistCollectionHolder"
import type {NonEmptyMinimalistCollectionHolder} from "../NonEmptyMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Tell if the {@link collection} {@link MinimalistCollectionHolder.isEmpty is empty}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @return {boolean} <b>true</b> if null is received or {@link MinimalistCollectionHolder.isEmpty} otherwise
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/none.html Kotlin none()
 * @extensionFunction
 */
export function none<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["isEmpty"]
/**
 * Check if <b>no</b> element in the {@link collection}
 * match the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate The given predicate
 * @return {boolean} <b>false</b> if at least one {@link predicate} is <b>true</b> on a value of the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/none.html Kotlin none(predicate)
 * @extensionFunction
 */
export function none<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): boolean
export function none<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,): boolean {
    if (collection == null)
        return true
    if (predicate == null)
        return collection.isEmpty
    if (collection.isEmpty)
        return true

    if (predicate.length == 1)
        return __with1Argument(collection as NonEmptyMinimalistCollectionHolder<T>, predicate as (value: T,) => boolean,)
    if (predicate.length >= 2)
        return __with2Argument(collection as NonEmptyMinimalistCollectionHolder<T>, predicate,)
    return __with0Argument(collection as NonEmptyMinimalistCollectionHolder<T>, predicate as () => boolean,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const T, >(collection: NonEmptyMinimalistCollectionHolder<T>, predicate: () => boolean,) {
    let index = collection.size - 1
    while (index-- > 0)
        if (predicate())
            return false
    return true
}

function __with1Argument<const T, >(collection: NonEmptyMinimalistCollectionHolder<T>, predicate: (value: T,) => boolean,) {
    const size = collection.size
    let index = -1
    while (++index < size)
        if (predicate(collection.get(index,),))
            return false
    return true
}

function __with2Argument<const T, >(collection: NonEmptyMinimalistCollectionHolder<T>, predicate: (value: T, index: number,) => boolean,) {
    const size = collection.size
    let index = -1
    while (++index < size)
        if (predicate(collection.get(index,), index,))
            return false
    return true
}

//#endregion -------------------- Loop methods --------------------
