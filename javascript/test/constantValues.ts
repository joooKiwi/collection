/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import {Holder} from "./Holder"

export const sizeValues = () => [
        new Holder({array: [], size: 0,}, '0',),
        new Holder({array: [1,], size: 1,}, '1',),
    ] as const,
    TEMPLATE_ITEMS = [
        1, 2, 3, 4, 5, 6, 7, 8, 9, 0,
        1n, 2n, 3n, 4n, 5n, 6n, 7n, 8n, 9n, 0n,
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j',
        true, false,
    ] as const,
    nonPresentItem = Symbol()
