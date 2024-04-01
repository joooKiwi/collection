/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/**
 * An encapsulation type toward a specified type to be the value, <b>null</b>
 *
 * @see Nullable
 * @deprecated Use NullOr from "@joookiwi/type" instead. It will be removed in version 1.9.
 */
export type NullOr<T, > = | T | null
/**
 * An encapsulation type toward a specified type to be the value, <b>undefined</b>
 *
 * @see Nullable
 * @deprecated Use UndefinedOr from "@joookiwi/type" instead. It will be removed in version 1.9.
 */
export type UndefinedOr<T, > = | T | undefined
/**
 * An encapsulation type toward a specified type to be the value, <b>null</b> or <b>undefined</b>
 *
 * @see NullOr
 * @see UndefinedOr
 * @deprecated Use Nullable from "@joookiwi/type" instead. It will be removed in version 1.9.
 */
export type Nullable<T, > = | T | null | undefined

/**
 * A type for the {@link Number} as itself or included in a {@link String} directly
 * @deprecated Use The TemplateOrNumber from "@joookiwi/type" instead. It will be removed in version 1.9.
 */
export type NumberOrNumberInString<T extends number = number, > = | T | `${T}`

/**
 * A type for the possible numeric data ({@link Number} or {@link BigInt}
 * @deprecated Use The NumericOrObject from "@joookiwi/type" instead. It will be removed in version 1.9.
 */
export type PossibleNumeric<T extends | number | bigint = | number | bigint, > = | T | Number | BigInt
