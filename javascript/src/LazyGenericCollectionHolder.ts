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

import {LazyCollectionHolder} from "./LazyCollectionHolder"

/**
 * A {@link CollectionHolder} having the values associated to it, but lazily retrieved.
 *
 * Meaning that the value in the instance are not retrieved until it is necessary.
 *
 * @typeParam T The type (by default `unknown`)
 * @note The index in the instance may not be initialized if retrieved directly
 * @see GenericMinimalistCollectionHolder
 * @see GenericCollectionHolder
 * @see EmptyCollectionHolder
 * @deprecated Replace with {@link LazyCollectionHolder}. This will be removed in version 2.1
 */
export class LazyGenericCollectionHolder<const T = unknown, >
    extends LazyCollectionHolder<T> {}
