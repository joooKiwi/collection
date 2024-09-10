/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

export {all}                                    from "./all"
export {all as allByCollectionHolder}           from "./collectionHolder/all"
export {all as allByMinimalistCollectionHolder} from "./minimalistCollectionHolder/all"

export {any}                                    from "./any"
export {any as anyByCollectionHolder}           from "./collectionHolder/any"
export {any as anyByMinimalistCollectionHolder} from "./minimalistCollectionHolder/any"

export {asLocaleLowerCaseString, asLocaleString, asLocaleUpperCaseString, asLowerCaseString, asString, asUpperCaseString} from "./asString"

export {filter}                                       from "./filter"
export {filter as filterByCollectionHolder}           from "./collectionHolder/filter"
export {filter as filterByMinimalistCollectionHolder} from "./minimalistCollectionHolder/filter"

export {filterIndexed}                                              from "./filterIndexed"
export {filterIndexed as filterIndexedByCollectionHolder}           from "./collectionHolder/filterIndexed"
export {filterIndexed as filterIndexedByMinimalistCollectionHolder} from "./minimalistCollectionHolder/filterIndexed"

export {filterNot}                                          from "./filterNot"
export {filterNot as filterNotByCollectionHolder}           from "./collectionHolder/filterNot"
export {filterNot as filterNotByMinimalistCollectionHolder} from "./minimalistCollectionHolder/filterNot"

export {filterNotIndexed}                                                 from "./filterNotIndexed"
export {filterNotIndexed as filterNotIndexedByCollectionHolder}           from "./collectionHolder/filterNotIndexed"
export {filterNotIndexed as filterNotIndexedByMinimalistCollectionHolder} from "./minimalistCollectionHolder/filterNotIndexed"

export {filterNotNull,                        filterNotNullByCollectionHolder}                                            from "./filterNotNull"
export {find,                                 findByCollectionHolder}                                                     from "./find"
export {findIndexed,                          findIndexedByCollectionHolder}                                              from "./findIndexed"
export {findLast,                             findLastByCollectionHolder}                                                 from "./findLast"
export {findLastIndexed,                      findLastIndexedByCollectionHolder}                                          from "./findLastIndexed"
export {first,                                firstByCollectionHolder}                                                    from "./first"
export {firstOrNull,                          firstOrNullByCollectionHolder}                                              from "./firstOrNull"

export {forEach}                                        from "./forEach"
export {forEach as forEachByCollectionHolder}           from "./collectionHolder/forEach"
export {forEach as forEachByMinimalistCollectionHolder} from "./minimalistCollectionHolder/forEach"

export {forEachIndexed}                                               from "./forEachIndexed"
export {forEachIndexed as forEachIndexedByCollectionHolder}           from "./collectionHolder/forEachIndexed"
export {forEachIndexed as forEachIndexedByMinimalistCollectionHolder} from "./minimalistCollectionHolder/forEachIndexed"

export {getOrElse}                                          from "./getOrElse"
export {getOrElse as getOrElseByCollectionHolder}           from "./collectionHolder/getOrElse"
export {getOrElse as getOrElseByMinimalistCollectionHolder} from "./minimalistCollectionHolder/getOrElse"

export {getOrNull}                                          from "./getOrNull"
export {getOrNull as getOrNullByCollectionHolder}           from "./collectionHolder/getOrNull"
export {getOrNull as getOrNullByMinimalistCollectionHolder} from "./minimalistCollectionHolder/getOrNull"

export {has,                                  hasByCollectionHolder}                                                      from "./has"
export {hasAll,                               hasAllByCollectionHolder}                                                   from "./hasAll"
export {hasAllWithArray,                      hasAllWithArrayByCollectionHolder}                                          from "./hasAll.withArray"
export {hasAllWithCollectionHolder,           hasAllWithCollectionHolderByCollectionHolder}                               from "./hasAll.withCollectionHolder"
export {hasAllWithCollectionIterator,         hasAllWithCollectionIteratorByCollectionHolder}                             from "./hasAll.withCollectionIterator"
export {hasAllWithIterable,                   hasAllWithIterableByCollectionHolder}                                       from "./hasAll.withIterable"
export {hasAllWithMinimalistCollectionHolder, hasAllWithMinimalistCollectionHolderByCollectionHolder}                     from "./hasAll.withMinimalistCollectionHolder"
export {hasAllWithSet,                        hasAllWithSetByCollectionHolder}                                            from "./hasAll.withSet"
export {hasDuplicate,                         hasDuplicateByCollectionHolder}                                             from "./hasDuplicate"
export {hasNull,                              hasNullByCollectionHolder}                                                  from "./hasNull"
export {hasOne,                               hasOneByCollectionHolder}                                                   from "./hasOne"
export {hasOneWithArray,                      hasOneWithArrayByCollectionHolder}                                          from "./hasOne.withArray"
export {hasOneWithCollectionHolder,           hasOneWithCollectionHolderByCollectionHolder}                               from "./hasOne.withCollectionHolder"
export {hasOneWithCollectionIterator,         hasOneWithCollectionIteratorByCollectionHolder}                             from "./hasOne.withCollectionIterator"
export {hasOneWithIterable,                   hasOneWithIterableByCollectionHolder}                                       from "./hasOne.withIterable"
export {hasOneWithMinimalistCollectionHolder, hasOneWithMinimalistCollectionHolderByCollectionHolder}                     from "./hasOne.withMinimalistCollectionHolder"
export {hasOneWithSet,                        hasOneWithSetByCollectionHolder}                                            from "./hasOne.withSet"
export {indexOf,                              indexOfByCollectionHolder}                                                  from "./indexOf"
export {indexOfFirst,                         indexOfFirstByCollectionHolder}                                             from "./indexOfFirst"
export {indexOfFirstIndexed,                  indexOfFirstIndexedByCollectionHolder}                                      from "./indexOfFirstIndexed"
export {indexOfLast,                          indexOfLastByCollectionHolder}                                              from "./indexOfLast"
export {indexOfLastIndexed,                   indexOfLastIndexedByCollectionHolder}                                       from "./indexOfLastIndexed"

export {isArray}                                 from "./isArray"
export {isArrayByStructure}                      from "./isArrayByStructure"
export {isCollectionHolder}                      from "./isCollectionHolder"
export {isCollectionHolderByStructure}           from "./isCollectionHolderByStructure"
export {isCollectionIterator}                    from "./isCollectionIterator"
export {isCollectionIteratorByStructure}         from "./isCollectionIteratorByStructure"
export {isMinimalistCollectionHolder}            from "./isMinimalistCollectionHolder"
export {isMinimalistCollectionHolderByStructure} from "./isMinimalistCollectionHolderByStructure"
export {isSet}                                   from "./isSet"
export {isSetByStructure}                        from "./isSetByStructure"

export {joinToString,                         joinToStringByCollectionHolder, prefixAndPostfixOnly}                       from "./joinToString"
export {last,                                 lastByCollectionHolder}                                                     from "./last"
export {lastIndexOf,                          lastIndexOfByCollectionHolder}                                              from "./lastIndexOf"
export {lastOrNull,                           lastOrNullByCollectionHolder}                                               from "./lastOrNull"
export {map,                                  mapByCollectionHolder}                                                      from "./map"
export {mapIndexed,                           mapIndexedByCollectionHolder}                                               from "./mapIndexed"
export {mapNotNull,                           mapNotNullByCollectionHolder}                                               from "./mapNotNull"
export {mapNotNullIndexed,                    mapNotNullIndexedByCollectionHolder}                                        from "./mapNotNullIndexed"

export {none}                                     from "./none"
export {none as noneByCollectionHolder}           from "./collectionHolder/none"
export {none as noneByMinimalistCollectionHolder} from "./minimalistCollectionHolder/none"

export {objectValuesMap, objectValuesMapByCollectionHolder} from "./objectValuesMap"

export {onEach}                                       from "./onEach"
export {onEach as onEachByCollectionHolder}           from "./collectionHolder/onEach"
export {onEach as onEachByMinimalistCollectionHolder} from "./minimalistCollectionHolder/onEach"

export {onEachIndexed}                                              from "./onEachIndexed"
export {onEachIndexed as onEachIndexedByCollectionHolder}           from "./collectionHolder/onEachIndexed"
export {onEachIndexed as onEachIndexedByMinimalistCollectionHolder} from "./minimalistCollectionHolder/onEachIndexed"

export {requireNoNulls,                       requireNoNullsByCollectionHolder}                                           from "./requireNoNulls"
export {slice,                                sliceByCollectionHolder}                                                    from "./slice"
export {sliceWithARange,                      sliceWithARangeByCollectionHolder}                                          from "./slice.withARange"
export {sliceWithArray,                       sliceWithArrayByCollectionHolder}                                           from "./slice.withArray"
export {sliceWithCollectionHolder,            sliceWithCollectionHolderByCollectionHolder}                                from "./slice.withCollectionHolder"
export {sliceWithCollectionIterator,          sliceWithCollectionIteratorByCollectionHolder}                              from "./slice.withCollectionIterator"
export {sliceWithIterable,                    sliceWithIterableByCollectionHolder}                                        from "./slice.withIterable"
export {sliceWithMinimalistCollectionHolder,  sliceWithMinimalistCollectionHolderByCollectionHolder}                      from "./slice.withMinimalistCollectionHolder"
export {sliceWithSet,                         sliceByCollectionHolderWithSet}                                             from "./slice.withSet"
export {toArray,                              toArrayByCollectionHolder}                                                  from "./toArray"
export {toIterator,                           toIteratorByCollectionHolder}                                               from "./toIterator"
export {toLocaleLowerCaseString,              toLocaleLowerCaseStringByCollectionHolder}                                  from "./toLocaleLowerCaseString"
export {toLocaleString,                       toLocaleStringByCollectionHolder}                                           from "./toLocaleString"
export {toLocaleUpperCaseString,              toLocaleUpperCaseStringByCollectionHolder}                                  from "./toLocaleUpperCaseString"
export {toLowerCaseString,                    toLowerCaseStringByCollectionHolder}                                        from "./toLowerCaseString"
export {toMap,                                toMapByCollectionHolder}                                                    from "./toMap"
export {toMutableArray,                       toMutableArrayByCollectionHolder}                                           from "./toMutableArray"
export {toMutableMap,                         toMutableMapByCollectionHolder}                                             from "./toMutableMap"
export {toMutableSet,                         toMutableSetByCollectionHolder}                                             from "./toMutableSet"

export {toMutableWeakSet}                                                 from "./toMutableWeakSet"
export {toMutableWeakSet as toMutableWeakSetByCollectionHolder}           from "./collectionHolder/toMutableWeakSet"
export {toMutableWeakSet as toMutableWeakSetByMinimalistCollectionHolder} from "./minimalistCollectionHolder/toMutableWeakSet"

export {toReverse,                            toReverseByCollectionHolder}                                                from "./toReverse"
export {toSet,                                toSetByCollectionHolder}                                                    from "./toSet"
export {toString,                             toStringByCollectionHolder}                                                 from "./toString"
export {toUpperCaseString,                    toUpperCaseStringByCollectionHolder}                                        from "./toUpperCaseString"

export {toWeakSet}                                          from "./toWeakSet"
export {toWeakSet as toWeakSetByCollectionHolder}           from "./collectionHolder/toWeakSet"
export {toWeakSet as toWeakSetByMinimalistCollectionHolder} from "./minimalistCollectionHolder/toWeakSet"
