/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

//TODO move in a separate project

/**
 * An encapsulation type toward a specified type to be the value, <b>null</b>
 *
 * @see Nullable
 */
export type NullOr<T, > = | T | null
/**
 * An encapsulation type toward a specified type to be the value, <b>undefined</b>
 *
 * @see Nullable
 */
export type UndefinedOr<T, > = | T | undefined
/**
 * An encapsulation type toward a specified type to be the value, <b>null</b> or <b>undefined</b>
 *
 * @see NullOr
 */
export type Nullable<T, > = | T | null | undefined

/** A type for the {@link Number} as itself or included in a {@link String} directly */
export type NumberOrNumberInString = | number | `${number}`

/** A type for the possible numeric data ({@link Number} or {@link BigInt} */
export type PossibleNumeric = | number | Number | bigint | BigInt
