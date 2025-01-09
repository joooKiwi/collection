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

import {Holder} from "../Holder"

export const sizeValues = () => [
    new Holder({array: [],                                        size: 0,}, '0',),
    new Holder({array: [Symbol(),],                               size: 1,}, '1',),
    new Holder({array: [Symbol(), Symbol(),],                     size: 2,}, '2',),
    new Holder({array: [Symbol(), Symbol(), Symbol(), Symbol(),], size: 4,}, '4',),
] as const
