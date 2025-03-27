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

import {Holder}                                 from "./Holder"
import {CollectionHolderFromArray}              from "./instance/CollectionHolderFromArray"
import {CollectionHolder_ByStructure}           from "./instance/CollectionHolder_ByStructure"
import {CollectionIterator_ByStructure}         from "./instance/CollectionIterator_ByStructure"
import {MinimalistCollectionHolder_ByStructure} from "./instance/MinimalistCollectionHolder_ByStructure"

import {GenericCollectionHolder}                 from "../src/GenericCollectionHolder"
import {GenericMinimalistCollectionHolder}       from "../src/GenericMinimalistCollectionHolder"
import {LazyGenericCollectionHolder}             from "../src/LazyGenericCollectionHolder"
import {GenericCollectionIterator}               from "../src/iterator/GenericCollectionIterator"
import {isArray}                                 from "../src/method/isArray"
import {isArrayByStructure}                      from "../src/method/isArrayByStructure"
import {isBigInt64Array}                         from "../src/method/isBigInt64Array"
import {isBigUint64Array}                        from "../src/method/isBigUint64Array"
import {isCollectionHolder}                      from "../src/method/isCollectionHolder"
import {isCollectionHolderByStructure}           from "../src/method/isCollectionHolderByStructure"
import {isCollectionIterator}                    from "../src/method/isCollectionIterator"
import {isCollectionIteratorByStructure}         from "../src/method/isCollectionIteratorByStructure"
import {isFloat32Array}                          from "../src/method/isFloat32Array"
import {isFloat64Array}                          from "../src/method/isFloat64Array"
import {isInt8Array}                             from "../src/method/isInt8Array"
import {isInt16Array}                            from "../src/method/isInt16Array"
import {isInt32Array}                            from "../src/method/isInt32Array"
import {isIterator}                              from "../src/method/isIterator"
import {isMap}                                   from "../src/method/isMap"
import {isMapByStructure}                        from "../src/method/isMapByStructure"
import {isMinimalistCollectionHolder}            from "../src/method/isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure} from "../src/method/isMinimalistCollectionHolderByStructure"
import {isSet}                                   from "../src/method/isSet"
import {isSetByStructure}                        from "../src/method/isSetByStructure"
import {isTypedArray}                            from "../src/method/isTypedArray"
import {isTypedArrayByStructure}                 from "../src/method/isTypedArrayByStructure"
import {isUint8Array}                            from "../src/method/isUint8Array"
import {isUint8ClampedArray}                     from "../src/method/isUint8ClampedArray"
import {isUint16Array}                           from "../src/method/isUint16Array"
import {isUint32Array}                           from "../src/method/isUint32Array"
import {isWeakMap}                               from "../src/method/isWeakMap"
import {isWeakMapByStructure}                    from "../src/method/isWeakMapByStructure"
import {isWeakSet}                               from "../src/method/isWeakSet"
import {isWeakSetByStructure}                    from "../src/method/isWeakSetByStructure"

describe("is", () => {
    const everyInstances = [
        new Holder([],                                                                 "array",),
        //TODO add array by structure
        new Holder(new Int8Array(),                                                    "typed array (byte)",),
        new Holder(new Uint8Array(),                                                   "typed array (ubyte)",),
        new Holder(new Uint8ClampedArray(),                                            "typed array (ubyte-clamped)",),
        new Holder(new Int16Array(),                                                   "typed array (short)",),
        new Holder(new Uint16Array(),                                                  "typed array (ushort)",),
        new Holder(new Int32Array(),                                                   "typed array (long)",),
        new Holder(new Uint32Array(),                                                  "typed array (ulong)",),
        new Holder(new BigInt64Array(),                                                "typed array (bigint)",),
        new Holder(new BigUint64Array(),                                               "typed array (ubigint)",),
        new Holder(new Float32Array(),                                                 "typed array (float)",),
        new Holder(new Float64Array(),                                                 "typed array (double)",),
        //TODO add typedArray by structure
        new Holder(new Set(),                                                          "set",),
        //TODO add set by structure
        new Holder(new WeakSet(),                                                      "weak set",),
        //TODO add weakSet by structure
        new Holder(new Map(),                                                          "map",),
        //TODO add map by structure
        new Holder(new WeakMap(),                                                      "weak map",),
        //TODO add weakMap by structure
        new Holder(new GenericMinimalistCollectionHolder([],),                         "minimalist collection holder (normal)",),
        new Holder(new GenericCollectionHolder([],),                                   "collection holder (normal)",),
        new Holder(new LazyGenericCollectionHolder([],),                               "collection holder (lazy)",),
        new Holder(new MinimalistCollectionHolder_ByStructure([],),                    "minimalist collection holder (by structure)",),
        new Holder(new CollectionHolder_ByStructure([],),                              "collection holder (by structure)",),
        new Holder([][Symbol.iterator](),                                              "iterator (array)",),
        new Holder(new Int8Array()[Symbol.iterator](),                                 "iterator (byte array)",),
        new Holder(new Uint8Array()[Symbol.iterator](),                                "iterator (ubyte array)",),
        new Holder(new Uint8ClampedArray()[Symbol.iterator](),                         "iterator (ubyte-clamped array)",),
        new Holder(new Int16Array()[Symbol.iterator](),                                "iterator (short array)",),
        new Holder(new Uint16Array()[Symbol.iterator](),                               "iterator (ushort array)",),
        new Holder(new Int32Array()[Symbol.iterator](),                                "iterator (long array)",),
        new Holder(new Uint32Array()[Symbol.iterator](),                               "iterator (ulong array)",),
        new Holder(new BigInt64Array()[Symbol.iterator](),                             "iterator (bigint array)",),
        new Holder(new BigUint64Array()[Symbol.iterator](),                            "iterator (ubigint array)",),
        new Holder(new Float32Array()[Symbol.iterator](),                              "iterator (float array)",),
        new Holder(new Float64Array()[Symbol.iterator](),                              "iterator (double array)",),
        new Holder(new Set()[Symbol.iterator](),                                       "iterator (set)",),
        new Holder(new Map()[Symbol.iterator](),                                       "iterator (map)",),
        new Holder(new GenericCollectionIterator(new CollectionHolderFromArray([],),), "collection iterator (normal)",),
        new Holder(new CollectionIterator_ByStructure([],),                            "collection iterator (by structure)",),
    ] as const

    describe.each(everyInstances,)("%s", ({value: instance, message: type,},) => {
        /** Tell that the instance is structurally a {@link MinimalistCollectionHolder} */
        const isMinimalistCollectionHolderStructurally = type.includes("collection holder",)
        /** Tell that it instance is a {@link MinimalistCollectionHolder} or is a child an instance of {@link AbstractMinimalistCollectionHolder} from its type */
        const isMinimalistCollectionHolderInstance =     type.includes("collection holder",) && !type.endsWith("(by structure)",)
        /** Tell that the instance is structurally a {@link CollectionHolder} */
        const isCollectionHolderStructurally =           type === "collection holder (by structure)"
        /** Tell that the instance is a {@link CollectionHolder}  or is a child instance of {@link AbstractCollectionHolder} from its type */
        const isCollectionHolderInstance =               type.startsWith("collection holder",) && !type.endsWith("(by structure)",)
        /** Tell that the instance is a {@link CollectionIterator} or is a child instance of {@link AbstractCollectionIterator} from its type */
        const isCollectionIteratorInstance =             type.startsWith("collection iterator",) && !type.endsWith("(by structure)",)
        /** Tell that the instance is structurally a {@link CollectionIterator} */
        const isCollectionIteratorStructurally =         type.startsWith("collection iterator",)
        /** Tell that the instance is a {@link ReadonlySet Set} or {@link WeakSet} */
        const isSetOrWeakSet = type === "set" || type === "weak set"
        /** Tell that the instance is a {@link ReadonlyMap Map} or {@link WeakMap} */
        const isMapOrWeakMap = type === "map" || type === "weak map"

        test("array",                                     () => expect(isArray(instance,),)[type === "array" ? "toBeTrue" : "toBeFalse"](),)
        test("array by structure",                        () => expect(isArrayByStructure(instance,),)[type === "array" ? "toBeTrue" : "toBeFalse"](),)
        test("byte array",                                () => expect(isInt8Array(instance,),)[type === "typed array (byte)" ? "toBeTrue" : "toBeFalse"](),)
        test("ubyte array",                               () => expect(isUint8Array(instance,),)[type === "typed array (ubyte)" ? "toBeTrue" : "toBeFalse"](),)
        test("ubyte-clamped array",                       () => expect(isUint8ClampedArray(instance,),)[type === "typed array (ubyte-clamped)" ? "toBeTrue" : "toBeFalse"](),)
        test("short array",                               () => expect(isInt16Array(instance,),)[type === "typed array (short)" ? "toBeTrue" : "toBeFalse"](),)
        test("ushort array",                              () => expect(isUint16Array(instance,),)[type === "typed array (ushort)" ? "toBeTrue" : "toBeFalse"](),)
        test("long array",                                () => expect(isInt32Array(instance,),)[type === "typed array (long)" ? "toBeTrue" : "toBeFalse"](),)
        test("ulong array",                               () => expect(isUint32Array(instance,),)[type === "typed array (ulong)" ? "toBeTrue" : "toBeFalse"](),)
        test("bigint array",                              () => expect(isBigInt64Array(instance,),)[type === "typed array (bigint)" ? "toBeTrue" : "toBeFalse"](),)
        test("ubigint array",                             () => expect(isBigUint64Array(instance,),)[type === "typed array (ubigint)" ? "toBeTrue" : "toBeFalse"](),)
        test("float array",                               () => expect(isFloat32Array(instance,),)[type === "typed array (float)" ? "toBeTrue" : "toBeFalse"](),)
        test("double array",                              () => expect(isFloat64Array(instance,),)[type === "typed array (double)" ? "toBeTrue" : "toBeFalse"](),)
        test("typed array",                               () => expect(isTypedArray(instance,),)[type.startsWith("typed array") ? "toBeTrue" : "toBeFalse"](),)
        test("typed array by structure",                  () => expect(isTypedArrayByStructure(instance,),)[type.includes("typed array") ? "toBeTrue" : "toBeFalse"](),)
        test("set",                                       () => expect(isSet(instance,),)[type === "set" ? "toBeTrue" : "toBeFalse"](),)
        test("set by structure",                          () => expect(isSetByStructure(instance,),)[type === "set" ? "toBeTrue" : "toBeFalse"](),)
        test("weak set",                                  () => expect(isWeakSet(instance,),)[type === "weak set" ? "toBeTrue" : "toBeFalse"](),)
        test("weak set by structure",                     () => expect(isWeakSetByStructure(instance,),)[isSetOrWeakSet || isMapOrWeakMap || isCollectionHolderInstance || isCollectionHolderStructurally ? "toBeTrue" : "toBeFalse"](),)
        test("map",                                       () => expect(isMap(instance,),)[type === "map" ? "toBeTrue" : "toBeFalse"](),)
        test("map by structure",                          () => expect(isMapByStructure(instance,),)[type === "map" ? "toBeTrue" : "toBeFalse"](),)
        test("weak map",                                  () => expect(isWeakMap(instance,),)[type === "weak map" ? "toBeTrue" : "toBeFalse"](),)
        test("weak map by structure",                     () => expect(isWeakMapByStructure(instance,),)[isMapOrWeakMap || isCollectionHolderInstance || isCollectionHolderStructurally ? "toBeTrue" : "toBeFalse"](),)
        test("minimalist collection holder",              () => expect(isMinimalistCollectionHolder(instance,),)[isMinimalistCollectionHolderInstance ? "toBeTrue" : "toBeFalse"](),)
        test("minimalist collection holder by structure", () => expect(isMinimalistCollectionHolderByStructure(instance,),)[isMinimalistCollectionHolderInstance || isMinimalistCollectionHolderStructurally || type === "map" ? "toBeTrue" : "toBeFalse"](),)
        test("collection holder",                         () => expect(isCollectionHolder(instance,),)[isCollectionHolderInstance ? "toBeTrue" : "toBeFalse"](),)
        test("collection holder by structure",            () => expect(isCollectionHolderByStructure(instance,),)[isCollectionHolderInstance || isCollectionHolderStructurally ? "toBeTrue" : "toBeFalse"](),)
        test("iterator",                                  () => expect(isIterator(instance,),)[type.startsWith("iterator",) ? "toBeTrue" : "toBeFalse"](),)
        test("collection iterator",                       () => expect(isCollectionIterator(instance,),)[isCollectionIteratorInstance ? "toBeTrue" : "toBeFalse"](),)
        test("collection iterator by structure",          () => expect(isCollectionIteratorByStructure(instance,),)[isCollectionIteratorInstance || isCollectionIteratorStructurally ? "toBeTrue" : "toBeFalse"](),)
    },)
},)
