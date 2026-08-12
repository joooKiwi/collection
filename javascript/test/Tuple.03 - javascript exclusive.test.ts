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

import {CollectionConstants} from "../src/CollectionConstants"
import {Couple}              from "../src/tuple/Couple"
import {Empty}               from "../src/tuple/Empty"
import {Monuple}             from "../src/tuple/Monuple"

describe("Tuple (javascript exclusive)", () => {

    describe("Empty", () => {
        const instance = Empty.get

        test("Symbol.toStringTag", () => expect(instance[Symbol.toStringTag],).toBe(CollectionConstants.TUPLE_TO_STRING_TAG,),)
    },)
    describe("Monuple", () => {
        const newInstance = () => new Monuple('a',)

        test("Symbol.toStringTag", () => expect(newInstance()[Symbol.toStringTag],).toBe(CollectionConstants.TUPLE_TO_STRING_TAG,),)
    },)
    describe("Couple", () => {
        const newInstance = () => new Couple('a', 'b',)

        test("Symbol.toStringTag", () => expect(newInstance()[Symbol.toStringTag],).toBe(CollectionConstants.TUPLE_TO_STRING_TAG,),)
    },)

},)
