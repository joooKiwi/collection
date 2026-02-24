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

import type {CollectionConstants} from "../CollectionConstants"

/** A type-alias of {@link CollectionHolder}[{@link Symbol.toStringTag}] */
export type CollectionHolderName = typeof CollectionConstants["COLLECTION_HOLDER_TO_STRING_TAG"]

/** A type-alias of {@link CollectionIterator}[{@link Symbol.toStringTag}] */
export type CollectionIteratorName = typeof CollectionConstants["COLLECTION_ITERATOR_TO_STRING_TAG"]
