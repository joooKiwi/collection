/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionConstants} from "../CollectionConstants"

/**
 * A {@link Symbol.toStringTag} of a {@link CollectionIterator}
 *
 * @deprecated Use the import("@joookiwi/collection/type") instead of import("@joookiwi/collection/CollectionIterator.types"). This will be removed in v1.12
 */
export type CollectionIteratorName = typeof CollectionConstants["COLLECTION_ITERATOR_TO_STRING_TAG"]
/**
 * A {@link Symbol} telling that it is the value before the first element in a {@link CollectionIterator}
 *
 * @deprecated Use the import("@joookiwi/collection/type") instead of import("@joookiwi/collection/CollectionIterator.types"). This will be removed in v1.12
 */
export type BeforeFirstValueInCollectionIteratorSymbol = typeof CollectionConstants["BEFORE_FIRST_VALUE_IN_ITERATOR_SYMBOL"]
/**
 * A {@link Symbol} telling that it is the value after the last element in a {@link CollectionIterator}
 *
 * @deprecated Use the import("@joookiwi/collection/type") instead of import("@joookiwi/collection/CollectionIterator.types"). This will be removed in v1.12
 */
export type AfterLastValueInCollectionIteratorSymbol = typeof CollectionConstants["AFTER_LAST_VALUE_IN_ITERATOR_SYMBOL"]
