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

import type {CollectionIteratorOf2}      from "../iterator"
import type {KeyOfCollectionIteratorOf2} from "../type/keyOf"

/**
 * Tell that the value has the structure of a {@link CollectionIteratorOf2}
 *
 * @param value The value to identity
 * @see isCollectionIteratorOf2
 * @see MembersConstants.COLLECTION_ITERATOR_OF_2_MEMBERS
 * @doesNotValidateTheTypes
 */
export function isCollectionIteratorOf2ByStructure(value: unknown,): value is (& object & Record<KeyOfCollectionIteratorOf2, unknown>)
/**
 * Tell that the value has the structure of a {@link CollectionIteratorOf2}
 *
 * @param value The value to identity
 * @see isCollectionIteratorOf2
 * @see MembersConstants.COLLECTION_ITERATOR_OF_2_MEMBERS
 * @doesNotValidateTheTypes
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isCollectionIteratorOf2ByStructure<const T1, const T2, const INSTANCE extends CollectionIteratorOf2<T1, T2> = CollectionIteratorOf2<T1, T2>, >(value: unknown,): value is INSTANCE
export function isCollectionIteratorOf2ByStructure(value: unknown,): boolean {
    if (value == null)
        return false
    if (typeof value != "object")
        return false
    if (0 in value)
    if (1 in value)
    if ("value1" in value)
    if ("value2" in value)
    if ("size" in value)
    if ("length" in value)
    if ("count" in value)
    if ("isEmpty" in value)
    if ("hasAtLeast1Element" in value)
    if ("includesAtLeast1Element" in value)
    if ("containsAtLeast1Element" in value)
    if ("hasExactly1Element" in value)
    if ("includesExactly1Element" in value)
    if ("containsExactly1Element" in value)
    if ("hasAtMost1Element" in value)
    if ("includesAtMost1Element" in value)
    if ("containsAtMost1Element" in value)
    if ("hasAtLeast2Elements" in value)
    if ("includesAtLeast2Elements" in value)
    if ("containsAtLeast2Elements" in value)
    if ("hasExactly2Elements" in value)
    if ("includesExactly2Elements" in value)
    if ("containsExactly2Elements" in value)
    if ("hasAtMost2Elements" in value)
    if ("includesAtMost2Elements" in value)
    if ("containsAtMost2Elements" in value)
    if ("currentIndex" in value)
    if ("index" in value)
    if ("hasNext" in value)
    if ("nextIndex" in value)
    if ("nextValue" in value)
    if ("next" in value)
    if ("hasPrevious" in value)
    if ("previousIndex" in value)
    if ("previousValue" in value)
    if ("previous" in value)
    if ("reset" in value)
    if ("forEach" in value)
    if ("forEachIndexed" in value)
    if (Symbol.iterator in value)
    if (Symbol.toStringTag in value)
        return true
    return false
}
