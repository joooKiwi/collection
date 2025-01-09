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

import type {Nullable, NullableString, Template} from "@joookiwi/type"

/**
 * Convert the {@link value primitive value} to a {@link String} while keeping its type content intact
 *
 * @param value The value to convert
 * @typescriptDefinition
 */
export function asString<T extends Nullable<| number | bigint | string | boolean>, >(value: T,): Template<T>
/**
 * Convert the {@link value} to a {@link String}
 *
 * @param value The value to convert
 */
export function asString(value: unknown,): string
export function asString(value: unknown,) {
    if (value === null)
        return "null"
    if (value === undefined)
        return "undefined"

    if (typeof value == "string")
        return value
    return value.toString()
}


/**
 * Convert the {@link value} to a {@link String} while handling the {@link locale}
 *
 * @param value The value to convert
 * @param locale The locale to possibly apply
 */
export function asLocaleString(value: unknown, locale?: NullableString,): string {
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
 * Convert the {@link value primitive value} to a {@link Lowercase} {@link String} while keeping its type content intact
 *
 * @param value The value to convert
 * @typescriptDefinition
 */
export function asLowerCaseString<T extends Nullable<| number | bigint | string | boolean>, >(value: T,): Lowercase<Template<T>>
/**
 * Convert the {@link value} to a {@link Lowercase} {@link String}
 *
 * @param value The value to convert
 */
export function asLowerCaseString(value: unknown,): string
export function asLowerCaseString(value: unknown,) {
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
 * Convert the {@link value} to a {@link Lowercase} {@link String} while handling the {@link locale}
 *
 * @param value  The value to convert
 * @param locale The locale to possibly apply
 */
export function asLocaleLowerCaseString(value: unknown, locale?: NullableString,): string {
    if (locale == null) {
        if (value === null)
            return "null".toLocaleLowerCase()
        if (value === undefined)
            return "undefined".toLocaleLowerCase()
        switch (typeof value) {
            case "string":
                return value.toLocaleLowerCase()
            case "number":
                return value.toLocaleString().toLowerCase()
            case "bigint":
                return value.toLocaleString().toLowerCase()
            case "boolean":
                return value.toLocaleString()
            case "symbol":
                return value.toLocaleString().toLowerCase()
        }
        if (value instanceof String)
            return value.toLocaleLowerCase()
        if (value instanceof Boolean)
            return value.toLocaleString()
        if (value instanceof Symbol)
            return value.toLocaleString().toLowerCase()
        if (value instanceof Date)
            return value.toLocaleString().toLowerCase()

        if (typeof value == "object")
            if ("toLocaleLowerCase" in value)
                if (typeof value.toLocaleLowerCase == "function" || value.toLocaleLowerCase instanceof Function)
                return value.toLocaleLowerCase()
        return value.toLocaleString().toLowerCase() // TODO: Validate that the string definitely has no way to be converted from a locale
    }

    if (value === null)
        return "null".toLocaleLowerCase(locale,)
    if (value === undefined)
        return "undefined".toLocaleLowerCase(locale,)


    switch (typeof value) {
        case "string":
            return value.toLocaleLowerCase(locale,)
        case "number":
            return value.toLocaleString(locale,).toLowerCase()
        case "bigint":
            return value.toLocaleString(locale,).toLowerCase()
        case "boolean":
            return value.toLocaleString()
        case "symbol":
            return value.toLocaleString().toLowerCase()
    }
    if (value instanceof String)
        return value.toLocaleLowerCase(locale,)
    if (value instanceof Boolean)
        return value.toLocaleString()
    if (value instanceof Symbol)
        return value.toLocaleString().toLowerCase()
    if (value instanceof Date)
        return value.toLocaleString(locale,).toLowerCase()

    if (typeof value == "object")
        if ("toLocaleLowerCase" in value)
            if (typeof value.toLocaleLowerCase == "function" || value.toLocaleLowerCase instanceof Function)
                return value.toLocaleLowerCase(locale,)
    return value.toLocaleString().toLowerCase() // TODO: Validate that the string definitely has no way to be converted from a locale
}


/**
 * Convert the {@link value primitive value} to an {@link Uppercase} {@link String} while keeping its type content intact
 *
 * @param value The value to convert
 * @typescriptDefinition
 */
export function asUpperCaseString<T extends Nullable<| number | bigint | string | boolean>, >(value: T,): Uppercase<Template<T>>
/**
 * Convert the {@link value} to an {@link Uppercase} {@link String}
 *
 * @param value The value to convert
 */
export function asUpperCaseString(value: unknown,): string
export function asUpperCaseString(value: unknown,) {
    if (value === null)
        return "NULL"
    if (value === undefined)
        return "UNDEFINED"

    if (typeof value == "string")
        return value.toUpperCase()
    if (value instanceof String)
        return value.toUpperCase()
    return value.toString().toUpperCase()
}

/**
 * Convert the {@link value} to an {@link Uppercase} {@link String} while handling the {@link locale}
 *
 * @param value  The value to convert
 * @param locale The locale to possibly apply
 */
export function asLocaleUpperCaseString(value: unknown, locale?: NullableString,): string {
    if (locale == null) {
        if (value === null)
            return "null".toLocaleUpperCase()
        if (value === undefined)
            return "undefined".toLocaleUpperCase()

        switch (typeof value) {
            case "string":
                return value.toLocaleUpperCase()
            case "number":
                return value.toLocaleString().toUpperCase()
            case "bigint":
                return value.toLocaleString().toUpperCase()
            case "boolean":
                return value.toLocaleString().toUpperCase()
            case "symbol":
                return value.toLocaleString().toUpperCase()
        }
        if (value instanceof String)
            return value.toLocaleUpperCase()
        if (value instanceof Boolean)
            return value.toLocaleString().toUpperCase()
        if (value instanceof Symbol)
            return value.toLocaleString().toUpperCase()
        if (value instanceof Date)
            return value.toLocaleString().toUpperCase()

        if (typeof value == "object")
            if ("toLocaleUpperCase" in value)
                if (typeof value.toLocaleUpperCase == "function" || value.toLocaleUpperCase instanceof Function)
                    return value.toLocaleUpperCase()
        return value.toLocaleString().toUpperCase() // TODO: Validate that the string definitely has no way to be converted from a locale
    }

    if (value === null)
        return "null".toLocaleUpperCase(locale,)
    if (value === undefined)
        return "undefined".toLocaleUpperCase(locale,)

    switch (typeof value) {
        case "string":
            return value.toLocaleUpperCase(locale,)
        case "number":
            return value.toLocaleString(locale,).toUpperCase()
        case "bigint":
            return value.toLocaleString(locale,).toUpperCase()
        case "boolean":
            return value.toLocaleString().toUpperCase()
        case "symbol":
            return value.toLocaleString().toUpperCase()
    }
    if (value instanceof String)
        return value.toLocaleUpperCase(locale,)
    if (value instanceof Boolean)
        return value.toLocaleString().toUpperCase()
    if (value instanceof Symbol)
        return value.toLocaleString().toUpperCase()
    if (value instanceof Date)
        return value.toLocaleString(locale,).toUpperCase()

    if (typeof value == "object")
        if ("toLocaleUpperCase" in value)
            if (typeof value.toLocaleUpperCase == "function" || value.toLocaleUpperCase instanceof Function)
                return value.toLocaleUpperCase(locale,)
    return value.toLocaleString().toUpperCase() // TODO: Validate that the string definitely has no way to be converted from a locale
}
