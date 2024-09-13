/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

export {all,              allByCollectionHolder,              allByMinimalistCollectionHolder                           } from "./all"
export {any,              anyByCollectionHolder,              anyByMinimalistCollectionHolder                           } from "./any"
export {asLocaleLowerCaseString, asLocaleString, asLocaleUpperCaseString, asLowerCaseString, asString, asUpperCaseString} from "./asString"
export {filter,           filterByCollectionHolder,           filterByMinimalistCollectionHolder                        } from "./filter"
export {filterIndexed,    filterIndexedByCollectionHolder,    filterIndexedByMinimalistCollectionHolder                 } from "./filterIndexed"
export {filterNot,        filterNotByCollectionHolder,        filterNotByMinimalistCollectionHolder                     } from "./filterNot"
export {filterNotIndexed, filterNotIndexedByCollectionHolder, filterNotIndexedByMinimalistCollectionHolder              } from "./filterNotIndexed"
export {filterNotNull,    filterNotNullByCollectionHolder,    filterNotNullByMinimalistCollectionHolder                 } from "./filterNotNull"
export {find,             findByCollectionHolder,             findByMinimalistCollectionHolder                          } from "./find"
export {findIndexed,      findIndexedByCollectionHolder,      findIndexedByMinimalistCollectionHolder                   } from "./findIndexed"
export {findLast,         findLastByCollectionHolder,         findLastByMinimalistCollectionHolder                      } from "./findLast"
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

export {toArray}                                        from "./toArray"
export {toArray as toArrayByCollectionHolder}           from "./collectionHolder/toArray"
export {toArray as toArrayByMinimalistCollectionHolder} from "./minimalistCollectionHolder/toArray"

export {toIterator,                           toIteratorByCollectionHolder}                                               from "./toIterator"
export {toLocaleLowerCaseString,              toLocaleLowerCaseStringByCollectionHolder}                                  from "./toLocaleLowerCaseString"
export {toLocaleString,                       toLocaleStringByCollectionHolder}                                           from "./toLocaleString"
export {toLocaleUpperCaseString,              toLocaleUpperCaseStringByCollectionHolder}                                  from "./toLocaleUpperCaseString"
export {toLowerCaseString,                    toLowerCaseStringByCollectionHolder}                                        from "./toLowerCaseString"

export {toMap}                                      from "./toMap"
export {toMap as toMapByCollectionHolder}           from "./collectionHolder/toMap"
export {toMap as toMapByMinimalistCollectionHolder} from "./minimalistCollectionHolder/toMap"

export {toMutableArray}                                             from "./toMutableArray"
export {toMutableArray as toMutableArrayByCollectionHolder}           from "./collectionHolder/toMutableArray"
export {toMutableArray as toMutableArrayByMinimalistCollectionHolder} from "./minimalistCollectionHolder/toMutableArray"

export {toMutableMap}                                             from "./toMutableMap"
export {toMutableMap as toMutableMapByCollectionHolder}           from "./collectionHolder/toMutableMap"
export {toMutableMap as toMutableMapByMinimalistCollectionHolder} from "./minimalistCollectionHolder/toMutableMap"

export {toMutableSet}                                             from "./toMutableSet"
export {toMutableSet as toMutableSetByCollectionHolder}           from "./collectionHolder/toMutableSet"
export {toMutableSet as toMutableSetByMinimalistCollectionHolder} from "./minimalistCollectionHolder/toMutableSet"

export {toMutableWeakSet}                                                 from "./toMutableWeakSet"
export {toMutableWeakSet as toMutableWeakSetByCollectionHolder}           from "./collectionHolder/toMutableWeakSet"
export {toMutableWeakSet as toMutableWeakSetByMinimalistCollectionHolder} from "./minimalistCollectionHolder/toMutableWeakSet"

export {toReverse}                                          from "./toReverse"
export {toReverse as toReverseByCollectionHolder}           from "./collectionHolder/toReverse"
export {toReverse as toReverseByMinimalistCollectionHolder} from "./minimalistCollectionHolder/toReverse"

export {toSet}                                      from "./toSet"
export {toSet as toSetByCollectionHolder}           from "./collectionHolder/toSet"
export {toSet as toSetByMinimalistCollectionHolder} from "./minimalistCollectionHolder/toSet"

export {toString}                                         from "./toString"
export {toString as toStringByCollectionHolder}           from "./collectionHolder/toString"
export {toString as toStringByMinimalistCollectionHolder} from "./minimalistCollectionHolder/toString"

export {toUpperCaseString}                                                  from "./toUpperCaseString"
export {toUpperCaseString as toUpperCaseStringByCollectionHolder}           from "./collectionHolder/toUpperCaseString"
export {toUpperCaseString as toUpperCaseStringByMinimalistCollectionHolder} from "./minimalistCollectionHolder/toUpperCaseString"

export {toWeakSet}                                          from "./toWeakSet"
export {toWeakSet as toWeakSetByCollectionHolder}           from "./collectionHolder/toWeakSet"
export {toWeakSet as toWeakSetByMinimalistCollectionHolder} from "./minimalistCollectionHolder/toWeakSet"
