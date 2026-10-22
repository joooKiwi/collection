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

import type {NullableNumber} from "@joookiwi/type"

import type {CollectionHolderOf1} from "../CollectionHolderOf1"
import type {CollectionHolderOf2} from "../CollectionHolderOf2"

/**
 * A helper type to tell it is a {@link CollectionHolderOf2}<T2, T1> when `I1` is `null`|`undefined`|`0`|`-2`.
 *
 * Or {@link CollectionHolderOf1}<T2> when `I1` is `1`|`-1`
 *
 * Or not possible for a {@link CollectionHolderOf2}
 *
 * @see ToReverse_from
 * @see ToReverse_fromTo
 * @see ToReverse_to
 */
export type ToReverse_from<T1, T2, I1 extends NullableNumber, > =
    I1 extends NullableNumber<| 0 | -2>
        ?  CollectionHolderOf2<T2, T1>
    : I1 extends | 1 | -1
        ? CollectionHolderOf1<T2>
        : never

/**
 * A helper type to tell it is a {@link CollectionHolderOf2}<T2, T1> when `I1` is `null`|`undefined`|`0`|`-2` and `I2` is `null`|`undefined`|`1`|`-1`.
 *
 * Or {@link CollectionHolderOf1}<T1> when `I1` is `null`|`undefined`|`0`|`-2` and `I2` is `0`|`-2`.
 *
 * Or {@link CollectionHolderOf1}<T2> when `I1` is `1`|`-1` and `I2` is `null`|`undefined`|`1`|`-1`.
 *
 * Or not possible for a {@link CollectionHolderOf2}
 *
 * @see ToReverse_from
 * @see ToReverse_to
 */
export type ToReverse_fromTo<T1, T2, I1 extends NullableNumber, I2 extends NullableNumber, > =
    I1 extends NullableNumber<| 0 | -2>
    ? I2 extends NullableNumber<1 | -1>
        ? CollectionHolderOf2<T2, T1>
        : I2 extends | 0 | -2
            ? CollectionHolderOf1<T1>
            : never
    : I1 extends | 1 | -1
    ? I2 extends NullableNumber<| 1 | -1>
        ? CollectionHolderOf1<T1>
        : never
    : never

/**
 * A helper type to tell it is a {@link CollectionHolderOf2}<T2, T1> when `I2` is `null`|`undefined`|`1`|`-1`.
 *
 * Or {@link CollectionHolderOf1}<T1> when `I2` is `0`|`-2`.
 *
 * Or not possible for a {@link CollectionHolderOf2}
 *
 * @see ToReverse_fromTo
 * @see ToReverse_to
 */
export type ToReverse_to<T1, T2, I2 extends NullableNumber, > =
    I2 extends NullableNumber<1 | -1>
        ? CollectionHolderOf2<T2, T1>
    : I2 extends | 0 | -2
        ? CollectionHolderOf1<T1>
        : never
