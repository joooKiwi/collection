/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {ABCD_ABCD}             from "./constantCollections"
import {everyInstances}        from "./constantValues"
import {newCollectionInstance} from "./newCollectionInstance"

describe("CollectionHolderTest (find)", () =>
describe.each(everyInstances,)("%s", ({value: instance,},) => {
    const INSTANCE = () => newCollectionInstance(instance, ABCD_ABCD,)


    test("[a,b,c,d,A,B,C,D].find(anyCase b) == b",    () => expect(INSTANCE().find(it => it.toLowerCase() === 'b',),).toBe('b',),)
    test("[a,b,c,d,A,B,C,D].find(a) == a",            () => expect(INSTANCE().find(it => it === 'a',),).toBe('a',),)
    test("[a,b,c,d,A,B,C,D].find(D) == D",            () => expect(INSTANCE().find(it => it === 'D',),).toBe('D',),)
    test("[a,b,c,d,A,B,C,D].find(anyCase e) == null", () => expect(INSTANCE().find(it => it.toLowerCase() === 'e',),).toBeNull(),)

    test("[a,b,c,d,A,B,C,D].findIndexed(odd) == b",   () => expect(INSTANCE().findIndexed(it => it % 2 === 1,),).toBe('b',),)
    test("[a,b,c,d,A,B,C,D].findIndexed(0) == a",     () => expect(INSTANCE().findIndexed(it => it === 0,),).toBe('a',),)
    test("[a,b,c,d,A,B,C,D].findIndexed(7) == D",     () => expect(INSTANCE().findIndexed(it => it === 7,),).toBe('D',),)
    test("[a,b,c,d,A,B,C,D].findIndexed(26) == null", () => expect(INSTANCE().findIndexed(it => it === 26,),).toBeNull(),)


    test("[a,b,c,d,A,B,C,D].findLast(anyCase B) == B",    () => expect(INSTANCE().findLast(it => it.toUpperCase() === 'B',),).toBe('B',),)
    test("[a,b,c,d,A,B,C,D].findLast(a) == a",            () => expect(INSTANCE().findLast(it => it === 'a',),).toBe('a',),)
    test("[a,b,c,d,A,B,C,D].findLast(D) == D",            () => expect(INSTANCE().findLast(it => it === 'D',),).toBe('D',),)
    test("[a,b,c,d,A,B,C,D].findLast(anyCase E) == null", () => expect(INSTANCE().findLast(it => it.toUpperCase() === 'E',),).toBeNull(),)

    test("[a,b,c,d,A,B,C,D].findLastIndexed(odd) == D",   () => expect(INSTANCE().findLastIndexed(it => it % 2 === 1,),).toBe('D',),)
    test("[a,b,c,d,A,B,C,D].findLastIndexed(0) == a",     () => expect(INSTANCE().findLastIndexed(it => it === 0,),).toBe('a',),)
    test("[a,b,c,d,A,B,C,D].findLastIndexed(7) == D",     () => expect(INSTANCE().findLastIndexed(it => it === 7,),).toBe('D',),)
    test("[a,b,c,d,A,B,C,D].findLastIndexed(26) == null", () => expect(INSTANCE().findLastIndexed(it => it === 26,),).toBeNull(),)
},),)
