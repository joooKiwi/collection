/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {Nullable} from "../general type"

/**
 * Convert the primitive value to a {@link String} while keeping its content intact
 *
 * @param value The value to convert
 * @typescriptDefinition
 */
export function asString<T extends Nullable<| number | bigint | string | boolean>, >(value: T,): T extends string ? T : `${T}`
/**
 * Convert the primitive value to a {@link String}
 *
 * @param value The value to convert
 */
export function asString(value: unknown,): string
export function asString(value: unknown,): string {
    if (value === null)
        return "null"
    if (value === undefined)
        return "undefined"

    if (typeof value === "string")
        return value
    return value.toString()
}


/**
 * Convert the primitive value to a {@link String} while handling the {@link locale}
 *
 * @param value The value to convert
 * @param locale The locale to possibly apply
 */
export function asLocaleString(value: unknown, locale?: Nullable<string>,): string {
    if (value === null)
        return "null" // TODO: Validate that the string definitely has no way to be converted from a locale
    if (value === undefined)
        return "undefined" // TODO: Validate that the string definitely has no way to be converted from a locale

    if (typeof value == "string")
        return value // TODO: Validate that the string definitely has no way to be converted from a locale
    if (value instanceof String)
        return value.valueOf() // TODO: Validate that the string definitely has no way to be converted from a locale

    if (locale == null)
        return value.toLocaleString()
    // @ts-ignore: It's ok, it may be possible to have the implementation if it can have it
    return value.toLocaleString(locale,)
}


/**
 * Convert the primitive value to a {@link Lowercase} {@link String} while keeping its content intact
 *
 * @param value The value to convert
 * @typescriptDefinition
 */
export function asLowerCaseString<T extends Nullable<| number | bigint | string | boolean>, >(value: T,): Lowercase<T extends string ? T : `${T}`>
/**
 * Convert the primitive value to a {@link Lowercase} {@link String}
 *
 * @param value The value to convert
 */
export function asLowerCaseString(value: unknown,): string
export function asLowerCaseString(value: unknown,): string {
    if (value === null)
        return "null"
    if (value === undefined)
        return "undefined"

    if (typeof value == "string")
        return value.toLowerCase()
    if (value instanceof String)
        return value.toLowerCase()
    return value.toString().toLowerCase()
}


/**
 * Convert the primitive value to a {@link Lowercase} {@link String} while handling the {@link locale}
 *
 * @param value The value to convert
 * @param locale The locale to possibly apply
 */
export function asLocaleLowerCaseString(value: unknown, locale?: Nullable<string>,): string {
    if (value === null) {
        if (locale == null)
            return "null".toLocaleLowerCase()
        return "null".toLocaleLowerCase(locale,)
    }
    if (value === undefined) {
        if (locale == null)
            return "undefined".toLocaleLowerCase()
        return "undefined".toLocaleLowerCase(locale,)
    }

    switch (typeof value) {
        case "string":
            if (locale == null)
                return value.toLocaleLowerCase()
            return value.toLocaleLowerCase(locale,)
        case "number":
            if (locale == null)
                return value.toLocaleString().toLowerCase()
            return value.toLocaleString(locale,).toLowerCase()
        case "bigint":
            if (locale == null)
                return value.toLocaleString().toLowerCase()
            return value.toLocaleString(locale,).toLowerCase()
        case "boolean":
            return value.toLocaleString()
        case "symbol":
            return value.toLocaleString().toLowerCase()
    }
    if (value instanceof String) {
        if (locale == null)
            return value.toLocaleLowerCase()
        return value.toLocaleLowerCase(locale,)
    }
    if (value instanceof Boolean)
        return value.toLocaleString()
    if (value instanceof Symbol)
        return value.toLocaleString().toLowerCase()
    if (value instanceof Date) {
        if (locale == null)
            return value.toLocaleString().toLowerCase()
        return value.toLocaleString(locale,).toLowerCase()
    }

    if (typeof value == "object" && "toLocaleLowerCase" in value && (typeof value.toLocaleLowerCase == "function" || value.toLocaleLowerCase instanceof Function)) {
        if (locale == null)
            return value.toLocaleLowerCase()
        return value.toLocaleLowerCase(locale,)
    }
    return value.toLocaleString().toLowerCase() // TODO: Validate that the string definitely has no way to be converted from a locale
}


/**
 * Convert the primitive value to a {@link Uppercase} {@link String} while keeping its content intact
 *
 * @param value The value to convert
 * @typescriptDefinition
 */
export function asUpperCaseString<T extends Nullable<| number | bigint | string | boolean>, >(value: T,): Uppercase<T extends string ? T : `${T}`>
/**
 * Convert the primitive value to a {@link Uppercase} {@link String}
 *
 * @param value The value to convert
 */
export function asUpperCaseString(value: unknown,): string
export function asUpperCaseString(value: unknown,): string {
    if (value === null)
        return "NULL"
    if (value === undefined)
        return "UNDEFINED"

    if (typeof value === "string")
        return value.toUpperCase()
    if (value instanceof String)
        return value.toUpperCase()
    return value.toString().toUpperCase()
}

/**
 * Convert the primitive value to a {@link Uppercase} {@link String} while handling the {@link locale}
 *
 * @param value The value to convert
 * @param locale The locale to possibly apply
 */
export function asLocaleUpperCaseString(value: unknown, locale?: Nullable<string>,): string {
    if (value === null) {
        if (locale == null)
            return "null".toLocaleUpperCase()
        return "null".toLocaleUpperCase(locale,)
    }
    if (value === undefined) {
        if (locale == null)
            return "undefined".toLocaleUpperCase()
        return "undefined".toLocaleUpperCase(locale,)
    }

    switch (typeof value) {
        case "string":
            if (locale == null)
                return value.toLocaleUpperCase()
            return value.toLocaleUpperCase(locale,)
        case "number":
            if (locale == null)
                return value.toLocaleString().toUpperCase()
            return value.toLocaleString(locale,).toUpperCase()
        case "bigint":
            if (locale == null)
                return value.toLocaleString().toUpperCase()
            return value.toLocaleString(locale,).toUpperCase()
        case "boolean":
            return value.toLocaleString().toUpperCase()
        case "symbol":
            return value.toLocaleString().toUpperCase()
    }
    if (value instanceof String) {
        if (locale == null)
            return value.toLocaleUpperCase()
        return value.toLocaleUpperCase(locale,)
    }
    if (value instanceof Boolean)
        return value.toLocaleString().toUpperCase()
    if (value instanceof Symbol)
        return value.toLocaleString().toUpperCase()
    if (value instanceof Date) {
        if (locale == null)
            return value.toLocaleString().toUpperCase()
        return value.toLocaleString(locale,).toUpperCase()
    }

    if (typeof value == "object" && "toLocaleUpperCase" in value && (typeof value.toLocaleUpperCase == "function" || value.toLocaleUpperCase instanceof Function)) {
        if (locale == null)
            return value.toLocaleUpperCase()
        return value.toLocaleUpperCase(locale,)
    }
    return value.toLocaleString().toUpperCase() // TODO: Validate that the string definitely has no way to be converted from a locale
}
