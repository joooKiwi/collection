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

import type {Nullable, NullOrUndefined} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

/**
 * Tell that the collection
 * ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array}) is not empty
 *
 * @see IsNotEmptyOnMinimalistCollectionHolder
 * @see IsNotEmptyOnCollectionHolder
 * @see IsNotEmptyOnArray
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOn<T extends | MinimalistCollectionHolder | readonly unknown[], >
    = T extends MinimalistCollectionHolder ? IsNotEmptyOnMinimalistCollectionHolder<T>
    : T extends CollectionHolder           ? IsNotEmptyOnCollectionHolder<T>
    : T extends readonly unknown[]         ? IsNotEmptyOnArray<T> : never

/**
 * Tell that the {@link Nullable nullable} collection
 * ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array}) is not empty
 *
 * @see IsNotEmptyOnNullableMinimalistCollectionHolder
 * @see IsNotEmptyOnNullableCollectionHolder
 * @see IsNotEmptyOnNullableArray
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnNullable<T extends Nullable<| MinimalistCollectionHolder | readonly unknown[]>, >
    = T extends NullOrUndefined            ? false
    : T extends MinimalistCollectionHolder ? IsNotEmptyOnMinimalistCollectionHolder<T>
    : T extends CollectionHolder           ? IsNotEmptyOnCollectionHolder<T>
    : T extends readonly unknown[]         ? IsNotEmptyOnArray<T> : never


/**
 * Tell that the {@link MinimalistCollectionHolder collection} is not empty
 *
 * @see IsNotEmptyOnNullableMinimalistCollectionHolder
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnMinimalistCollectionHolder<T extends MinimalistCollectionHolder, >
    = T["size"] extends 0 ? false : T["size"] extends number ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link MinimalistCollectionHolder collection} is not empty
 *
 * @see IsNotEmptyOnMinimalistCollectionHolder
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOnNullableMinimalistCollectionHolder<T extends Nullable<MinimalistCollectionHolder>, >
    = T extends NullOrUndefined            ? false
    : T extends MinimalistCollectionHolder ? IsNotEmptyOnMinimalistCollectionHolder<T> : boolean


/**
 * Tell that the {@link CollectionHolder collection} is not empty
 *
 * @see IsNotEmptyOnNullableCollectionHolder
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnCollectionHolder<T extends CollectionHolder, >
    = T["isEmpty"] extends true ? false : T["isEmpty"] extends boolean ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link CollectionHolder collection} is not empty
 *
 * @see IsNotEmptyOnCollectionHolder
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOnNullableCollectionHolder<T extends Nullable<CollectionHolder>, >
    = T extends NullOrUndefined  ? false
    : T extends CollectionHolder ? (IsNotEmptyOnCollectionHolder<T>) : never


/**
 * Tell that the {@link ReadonlyArray collection} is not empty
 *
 * @see IsNotEmptyOnNullableArray
 * @see IsNotEmptyOn
 */
export type IsNotEmptyOnArray<T extends readonly unknown[], >
    = T["length"] extends 0 ? false : T["length"] extends number ? boolean : true

/**
 * Tell that the {@link Nullable nullable} {@link ReadonlyArray collection} is not empty
 *
 * @see IsNotEmptyOnArray
 * @see IsNotEmptyOnNullable
 */
export type IsNotEmptyOnNullableArray<T extends Nullable<readonly unknown[]>, >
    = T extends NullOrUndefined    ? false
    : T extends readonly unknown[] ? IsNotEmptyOnArray<T> : never
