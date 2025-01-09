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

import type {CollectionConstants} from "../CollectionConstants"

/** A {@link Symbol} telling that it is the value before the first element in a {@link CollectionIterator} */
export type BeforeFirstValueInCollectionIteratorSymbol = typeof CollectionConstants["BEFORE_FIRST_VALUE_IN_ITERATOR_SYMBOL"]
/** A {@link Symbol} telling that it is the value after the last element in a {@link CollectionIterator} */
export type AfterLastValueInCollectionIteratorSymbol = typeof CollectionConstants["AFTER_LAST_VALUE_IN_ITERATOR_SYMBOL"]
