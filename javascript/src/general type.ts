/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

/**
 * A simple encapsulation type toward a specified type to be the value, <b>null</b>
 *
 * @see Nullable
 */
export type NullOr<T, > = | T | null
/**
 * A simple encapsulation type toward a specified type to be the value, <b>undefined</b>
 *
 * @see Nullable
 */
export type UndefinedOr<T, > = | T | undefined
/**
 * A simple encapsulation type toward a specified type to be the value, <b>null</b> or <b>undefined</b>
 *
 * @see NullOr
 */
export type Nullable<T, > = | T | null | undefined

/** A simple type for the {@link Number} as itself or included in a {@link String} directly */
export type NumberOrNumberInString = | number | `${number}`
/** A simple type for either a {@link String primitive string} or a {@link Number primitive number} */
export type StringOrNumber = | string | number
/** A simple type for either a {@link String primitive string} or a {@link Symbol primitive symbol} */
export type StringOrSymbol = | string | symbol
