/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

//TODO move in a separate project

import type {IterableWithCount}        from "./IterableWithCount"
import type {IterableWithLength}       from "./IterableWithLength"
import type {IterableWithPossibleSize} from "./IterableWithPossibleSize"
import type {IterableWithSize}         from "./IterableWithSize"

/** Every possible simple type of {@link Iterable} in combination with the size field (as size, length or count) */
export type PossibleIterable<T, > = | Iterable<T>
                                    | IterableWithPossibleSize<T>
                                    | IterableWithSize<T>
                                    | IterableWithLength<T>
                                    | IterableWithCount<T>
