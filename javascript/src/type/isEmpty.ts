/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullOrUndefined} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

/**
 * Tell that the collection
 * ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array}) is empty
 *
 * @see IsEmptyOnMinimalistCollectionHolder
 * @see IsEmptyOnCollectionHolder
 * @see IsEmptyOnArray
 * @see IsEmptyOnNullable
 */
export type IsEmptyOn<T extends MinimalistCollectionHolder | readonly unknown[], >
    = T extends MinimalistCollectionHolder ? IsEmptyOnMinimalistCollectionHolder<T>
    : T extends CollectionHolder           ? IsEmptyOnCollectionHolder<T>
    : T extends readonly unknown[]         ? IsEmptyOnArray<T> : never

/**
 * Tell that the {@link Nullable nullable} collection
 * ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array}) is empty
 *
 * @see IsEmptyOnNullableMinimalistCollectionHolder
 * @see IsEmptyOnNullableCollectionHolder
 * @see IsEmptyOnNullableArray
 * @see IsEmptyOn
 */
export type IsEmptyOnNullable<T extends Nullable<| MinimalistCollectionHolder | readonly unknown[]>, >
    = T extends NullOrUndefined            ? true
    : T extends MinimalistCollectionHolder ? IsEmptyOnMinimalistCollectionHolder<T>
    : T extends CollectionHolder           ? IsEmptyOnCollectionHolder<T>
    : T extends readonly unknown[]         ? IsEmptyOnArray<T> : never


/**
 * Tell that the {@link MinimalistCollectionHolder collection} is empty
 *
 * @see IsEmptyOnNullableMinimalistCollectionHolder
 * @see IsEmptyOn
 */
export type IsEmptyOnMinimalistCollectionHolder<T extends MinimalistCollectionHolder, >
    = T["size"] extends 0 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link MinimalistCollectionHolder collection} is empty
 *
 * @see IsEmptyOnMinimalistCollectionHolder
 * @see IsEmptyOnNullable
 */
export type IsEmptyOnNullableMinimalistCollectionHolder<T extends Nullable<MinimalistCollectionHolder>, >
    = T extends NullOrUndefined            ? true
    : T extends MinimalistCollectionHolder ? IsEmptyOnMinimalistCollectionHolder<T> : never


/**
 * Tell that the {@link CollectionHolder collection} is empty
 *
 * @see IsEmptyOnNullableCollectionHolder
 * @see IsEmptyOn
 */
export type IsEmptyOnCollectionHolder<T extends CollectionHolder, >
    = T["size"] extends 0 ? true : T["size"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link CollectionHolder collection} is empty
 *
 * @see IsEmptyOnCollectionHolder
 * @see IsEmptyOnNullable
 */
export type IsEmptyOnNullableCollectionHolder<T extends Nullable<CollectionHolder>, >
    = T extends NullOrUndefined  ? true
    : T extends CollectionHolder ? IsEmptyOnCollectionHolder<T> : never


/**
 * Tell that the {@link ReadonlyArray collection} is empty
 *
 * @see IsEmptyOnNullableArray
 * @see IsEmptyOn
 */
export type IsEmptyOnArray<T extends readonly unknown[], >
    = T["length"] extends 0 ? true : T["length"] extends number ? boolean : false

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlyArray collection} is empty
 *
 * @see IsEmptyOnArray
 * @see IsEmptyOnNullable
 */
export type IsEmptyOnNullableArray<T extends Nullable<readonly unknown[]>, >
    = T extends NullOrUndefined    ? true
    : T extends readonly unknown[] ? IsEmptyOnArray<T> : never
