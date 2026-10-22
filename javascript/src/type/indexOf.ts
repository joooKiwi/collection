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

/**
 * A helper type to tell it is `0` when `I1` is `null`|`undefined`|`0`|`-1` and `I2` is `null`|`undefined`|`0`|`-1`.
 *
 * Or not possible for a {@link CollectionHolderOf1}
 *
 * @see IndexOf2
 * @see IndexOf2Of1
 * @see IndexOf2Of2
 */
export type IndexOf1<I1 extends NullableNumber, I2 extends NullableNumber, > =
    I1 extends NullableNumber<| 0 | -1>
    ? I2 extends NullableNumber<| 0 | -1>
        ? 0 : never : never


/**
 * A helper type to tell it is `0` when `I1` is `null`|`undefined`|`0`|`-2` and `I2` is `null`|`undefined`|`0`|`1`|`-1`|`-2`.
 *
 * Or `1` when `I1` is `1`|`-1` and `I2` is `null`|`undefined`|`1`|`-1`.
 *
 * Or not possible for a {@link CollectionHolderOf2}
 *
 * @see IndexOf1
 * @see IndexOf2Of1
 * @see IndexOf2Of2
 */
export type IndexOf2<I1 extends NullableNumber, I2 extends NullableNumber, > =
    I1 extends NullableNumber<| 0 | -2>
    ? I2 extends NullableNumber<| 0 | 1 | -1 | -2>
            ? 0 : never :
    I1 extends | 1 | -1
    ? I2 extends NullableNumber<| 1 | -1>
        ? 1 : never : never

/**
 * A helper type to tell it is `0` when `I1` is `null`|`undefined`|`0`|`-2` and `I2` is `null`|`undefined`|`0`|`1`|`-1`|`-2`.
 *
 * Or not possible for a {@link CollectionHolderOf2}
 *
 * @see IndexOf1
 * @see IndexOf2
 * @see IndexOf2Of2
 */
export type IndexOf2Of1<I1 extends NullableNumber, I2 extends NullableNumber, > =
    I1 extends NullableNumber<| 0 | -2>
    ? I2 extends NullableNumber<| 0 | 1 | -1 | -2>
        ? 0 : never : never

/**
 * A helper type to tell it is `1` when `I1` is `1`|`-1` and `I2` is `null`|`undefined`|`1`|`-1`.
 *
 * Or not possible for a {@link CollectionHolderOf2}
 *
 * @see IndexOf1
 * @see IndexOf2
 * @see IndexOf2Of1
 */
export type IndexOf2Of2<I1 extends NullableNumber, I2 extends NullableNumber, > =
    I1 extends | 1 | -1
    ? I2 extends NullableNumber<| 1 | -1>
        ? 1 : never : never
