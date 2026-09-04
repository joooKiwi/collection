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

import type {InsideIteratorValue}  from "../iterator/value/InsideIteratorValue"
import type {OutsideIteratorValue} from "../iterator/value/OutsideIteratorValue"

/**
 * Give either {@link InsideIteratorValue} with the type
 * or {@link OutsideIteratorValue} with the `symbol`
 */
export type PossibleIteratorValue<T = unknown, S extends symbol = symbol, > = | InsideIteratorValue<T>
                                                                              | OutsideIteratorValue<S>
