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

import type {SymbolConstants} from "../SymbolConstants"

/** A type-alias of {@link CollectionHolder}[{@link Symbol.toStringTag}] */
export type CollectionHolderName = typeof SymbolConstants["COLLECTION_HOLDER_TO_STRING_TAG"]

/** A type-alias of {@link CollectionIterator}[{@link Symbol.toStringTag}] */
export type CollectionIteratorName = typeof SymbolConstants["COLLECTION_ITERATOR_TO_STRING_TAG"]

/** A type-alias of {@link Tuple}[{@link Symbol.toStringTag}] */
export type TupleName = typeof SymbolConstants["TUPLE_TO_STRING_TAG"]

/** A type-alias of {@link Optional}[{@link Symbol.toStringTag}] */
export type OptionalName = typeof SymbolConstants["OPTIONAL_TO_STRING_TAG"]
