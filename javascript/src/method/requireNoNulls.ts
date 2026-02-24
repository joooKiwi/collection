//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Nullable, NullOr, NullOrUndefined, UndefinedOr} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The `null` {@link collection} itself
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNulls<const INSTANCE extends NullOrUndefined = NullOrUndefined, >(collection: INSTANCE,): INSTANCE
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNulls<const T, >(collection: CollectionHolder<Nullable<T>>,): CollectionHolder<T>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNulls<const T, >(collection: NullOr<CollectionHolder<T>>,): NullOr<CollectionHolder<NonNullable<T>>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNulls<const T, >(collection: UndefinedOr<CollectionHolder<T>>,): UndefinedOr<CollectionHolder<NonNullable<T>>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNulls<const T, >(collection: Nullable<CollectionHolder<T>>,): Nullable<CollectionHolder<NonNullable<T>>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNulls<const T, >(collection: MinimalistCollectionHolder<T>,): MinimalistCollectionHolder<NonNullable<T>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNulls<const T, >(collection: NullOr<MinimalistCollectionHolder<T>>,): NullOr<MinimalistCollectionHolder<NonNullable<T>>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNulls<const T, >(collection: UndefinedOr<MinimalistCollectionHolder<T>>,): UndefinedOr<MinimalistCollectionHolder<NonNullable<T>>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNulls<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): Nullable<MinimalistCollectionHolder<NonNullable<T>>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNulls<const T, >(collection: readonly T[],): readonly NonNullable<T>[]
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNulls<const T, >(collection: NullOr<readonly T[]>,): NullOr<readonly NonNullable<T>[]>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNulls<const T, >(collection: UndefinedOr<readonly T[]>,): UndefinedOr<readonly NonNullable<T>[]>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNulls<const T, >(collection: Nullable<readonly T[]>,): Nullable<readonly NonNullable<T>[]>
export function requireNoNulls<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>,) {
    if (collection == null)
        return collection

    if (isCollectionHolder(collection,))
        return requireNoNullsByCollectionHolder(collection,)
    if (isArray(collection,))
        return requireNoNullsByArray(collection,)
    if (isMinimalistCollectionHolder(collection,))
        return requireNoNullsByMinimalistCollectionHolder(collection,)

    if (isCollectionHolderByStructure<T>(collection,))
        return requireNoNullsByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return requireNoNullsByArray(collection,)
    return requireNoNullsByMinimalistCollectionHolder(collection,)
}


/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The `null` {@link collection} itself
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByMinimalistCollectionHolder<const INSTANCE extends NullOrUndefined = NullOrUndefined, >(collection: INSTANCE,): INSTANCE
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByMinimalistCollectionHolder<const T, >(collection: CollectionHolder<T>,): CollectionHolder<NonNullable<T>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByMinimalistCollectionHolder<const T, >(collection: NullOr<CollectionHolder<T>>,): NullOr<CollectionHolder<NonNullable<T>>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByMinimalistCollectionHolder<const T, >(collection: UndefinedOr<CollectionHolder<T>>,): UndefinedOr<CollectionHolder<NonNullable<T>>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByMinimalistCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): Nullable<CollectionHolder<NonNullable<T>>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>,): MinimalistCollectionHolder<NonNullable<T>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): Nullable<MinimalistCollectionHolder<NonNullable<T>>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByMinimalistCollectionHolder<const T, >(collection: NullOr<MinimalistCollectionHolder<T>>,): NullOr<MinimalistCollectionHolder<NonNullable<T>>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByMinimalistCollectionHolder<const T, >(collection: UndefinedOr<MinimalistCollectionHolder<T>>,): UndefinedOr<MinimalistCollectionHolder<NonNullable<T>>>
export function requireNoNullsByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,) {
    if (collection == null)
        return collection

    const size = collection.size
    if (size == 0)
        return collection

    let index = -1
    while (++index < size)
        if (collection.get(index,) == null)
            throw new TypeError("Forbidden null value. The current collection contains null values.",)
    return collection
}

/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The `null` {@link collection} itself
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByCollectionHolder<const INSTANCE extends NullOrUndefined = NullOrUndefined, >(collection: INSTANCE,): INSTANCE
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByCollectionHolder<const T, >(collection: CollectionHolder<T>,): CollectionHolder<NonNullable<T>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByCollectionHolder<const T, >(collection: NullOr<CollectionHolder<T>>,): NullOr<CollectionHolder<NonNullable<T>>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByCollectionHolder<const T, >(collection: UndefinedOr<CollectionHolder<T>>,): UndefinedOr<CollectionHolder<NonNullable<T>>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): Nullable<CollectionHolder<NonNullable<T>>>
export function requireNoNullsByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,) {
    if (collection == null)
        return collection
    if (collection.isEmpty)
        return collection
    if (collection.hasNull)
        throw new TypeError("Forbidden null value. The current collection contains null values.",)
    return collection
}

/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The `null` {@link collection} itself
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByArray<const INSTANCE extends NullOrUndefined = NullOrUndefined, >(collection: INSTANCE,): INSTANCE
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByArray<const T, >(collection: readonly Nullable<T>[],): readonly NonNullable<T>[]
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByArray<const T, >(collection: NullOr<readonly Nullable<T>[]>,): NullOr<readonly NonNullable<T>[]>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByArray<const T, >(collection: UndefinedOr<readonly Nullable<T>[]>,): UndefinedOr<readonly NonNullable<T>[]>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The nullable collection
 * @return {CollectionHolder} The {@link collection} itself
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByArray<const T, >(collection: Nullable<readonly Nullable<T>[]>,): Nullable<readonly NonNullable<T>[]>
export function requireNoNullsByArray<const T, >(collection: Nullable<readonly Nullable<T>[]>,) {
    if (collection == null)
        return collection

    const size = collection.length
    if (size == 0)
        return collection

    let index = -1
    while (++index < size)
        if (collection[index] == null)
            throw new TypeError("Forbidden null value. The current collection contains null values.",)
    return collection
}

//#endregion -------------------- Facade method --------------------
