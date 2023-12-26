/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {BooleanCallback}                    from "../CollectionHolder.types"
import type {Nullable}                           from "../general type"
import type {NonEmptySimplisticCollectionHolder} from "../NonEmptySimplisticCollectionHolder"
import type {SimplisticCollectionHolder}         from "../SimplisticCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Tell if the {@link collection} {@link SimplisticCollectionHolder.isNotEmpty is not empty}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @return {boolean} <b>false</b> if null is received or !{@link SimplisticCollectionHolder.isEmpty isEmpty} otherwise
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html Kotlin any()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any()
 * @extensionFunction
 */
export function any<const T, const COLLECTION extends SimplisticCollectionHolder<T> = SimplisticCollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["isEmpty"] extends true ? false : COLLECTION["isEmpty"] extends false ? true : boolean
/**
 * Check if <b>one</b> of the elements in the {@link collection}
 * match the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link SimplisticCollectionHolder collection}
 * @param predicate  The matching predicate
 * @return {boolean} <b>true</b> if at least one {@link predicate} is true on a value of the {@link collection}
 * @see ReadonlyArray.some
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html Kotlin any(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any(predicate)
 * @extensionFunction
 */
export function any<const T, >(collection: Nullable<SimplisticCollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): boolean
export function any<const T, >(collection: Nullable<SimplisticCollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,): boolean {
    if (collection == null)
        return false
    if (predicate == null)
        return !collection.isEmpty
    if (collection.isEmpty)
        return false

    if (predicate.length == 1)
        return __with1Argument(collection as NonEmptySimplisticCollectionHolder<T>, predicate as (value: T,) => boolean,)
    if (predicate.length >= 2)
        return __with2Argument(collection as NonEmptySimplisticCollectionHolder<T>, predicate,)
    return __with0Argument(collection as NonEmptySimplisticCollectionHolder<T>, predicate as () => boolean,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const T, >(collection: NonEmptySimplisticCollectionHolder<T>, predicate: () => boolean,) {
    let index = collection.size
    while (index-- > 0)
        if (predicate())
            return true
    return false
}

function __with1Argument<const T, >(collection: NonEmptySimplisticCollectionHolder<T>, predicate: (value: T,) => boolean,) {
    const size = collection.size
    let index = -1
    while (++index < size)
        if (predicate(collection.get(index,),))
            return true
    return false
}

function __with2Argument<const T, >(collection: NonEmptySimplisticCollectionHolder<T>, predicate: (value: T, index: number,) => boolean,) {
    const size = collection.size
    let index = -1
    while (++index < size)
        if (predicate(collection.get(index,), index,))
            return true
    return false
}

//#endregion -------------------- Loop methods --------------------
