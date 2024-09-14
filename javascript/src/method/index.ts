/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

export {all,                                  allByCollectionHolder,                                  allByMinimalistCollectionHolder                                 } from "./all"
export {any,                                  anyByCollectionHolder,                                  anyByMinimalistCollectionHolder                                 } from "./any"
export {asLocaleLowerCaseString, asLocaleString, asLocaleUpperCaseString, asLowerCaseString, asString, asUpperCaseString                                              } from "./asString"
export {filter,                               filterByCollectionHolder,                               filterByMinimalistCollectionHolder                              } from "./filter"
export {filterIndexed,                        filterIndexedByCollectionHolder,                        filterIndexedByMinimalistCollectionHolder                       } from "./filterIndexed"
export {filterNot,                            filterNotByCollectionHolder,                            filterNotByMinimalistCollectionHolder                           } from "./filterNot"
export {filterNotIndexed,                     filterNotIndexedByCollectionHolder,                     filterNotIndexedByMinimalistCollectionHolder                    } from "./filterNotIndexed"
export {filterNotNull,                        filterNotNullByCollectionHolder,                        filterNotNullByMinimalistCollectionHolder                       } from "./filterNotNull"
export {find,                                 findByCollectionHolder,                                 findByMinimalistCollectionHolder                                } from "./find"
export {findIndexed,                          findIndexedByCollectionHolder,                          findIndexedByMinimalistCollectionHolder                         } from "./findIndexed"
export {findLast,                             findLastByCollectionHolder,                             findLastByMinimalistCollectionHolder                            } from "./findLast"
export {findLastIndexed,                      findLastIndexedByCollectionHolder,                      findLastIndexedByMinimalistCollectionHolder                     } from "./findLastIndexed"
export {first,                                firstByCollectionHolder,                                firstByMinimalistCollectionHolder                               } from "./first"
export {firstOrNull,                          firstOrNullByCollectionHolder,                          firstOrNullByMinimalistCollectionHolder                         } from "./firstOrNull"
export {forEach,                              forEachByCollectionHolder,                              forEachByMinimalistCollectionHolder                             } from "./forEach"
export {forEachIndexed,                       forEachIndexedByCollectionHolder,                       forEachIndexedByMinimalistCollectionHolder                      } from "./forEachIndexed"
export {getOrElse,                            getOrElseByCollectionHolder,                            getOrElseByMinimalistCollectionHolder                           } from "./getOrElse"
export {getOrNull,                            getOrNullByCollectionHolder,                            getOrNullByMinimalistCollectionHolder                           } from "./getOrNull"
export {has,                                  hasByCollectionHolder,                                  hasByMinimalistCollectionHolder                                 } from "./has"
export {hasAll,                               hasAllByCollectionHolder,                               hasAllByMinimalistCollectionHolder                              } from "./hasAll"
export {hasAllWithArray,                      hasAllWithArrayByCollectionHolder,                      hasAllWithArrayByMinimalistCollectionHolder                     } from "./hasAll.withArray"
export {hasAllWithCollectionHolder,           hasAllWithCollectionHolderByCollectionHolder,           hasAllWithCollectionHolderByMinimalistCollectionHolder          } from "./hasAll.withCollectionHolder"
export {hasAllWithCollectionIterator,         hasAllWithCollectionIteratorByCollectionHolder,         hasAllWithCollectionIteratorByMinimalistCollectionHolder        } from "./hasAll.withCollectionIterator"
export {hasAllWithIterable,                   hasAllWithIterableByCollectionHolder,                   hasAllWithIterableByMinimalistCollectionHolder                  } from "./hasAll.withIterable"
export {hasAllWithMinimalistCollectionHolder, hasAllWithMinimalistCollectionHolderByCollectionHolder, hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "./hasAll.withMinimalistCollectionHolder"
export {hasAllWithSet,                        hasAllWithSetByCollectionHolder,                        hasAllWithSetByMinimalistCollectionHolder                       } from "./hasAll.withSet"
export {hasDuplicate,                         hasDuplicateByCollectionHolder,                         hasDuplicateByMinimalistCollectionHolder                        } from "./hasDuplicate"
export {hasNull,                              hasNullByCollectionHolder,                              hasNullByMinimalistCollectionHolder                             } from "./hasNull"
export {hasOne,                               hasOneByCollectionHolder,                               hasOneByMinimalistCollectionHolder                              } from "./hasOne"
export {hasOneWithArray,                      hasOneWithArrayByCollectionHolder,                      hasOneWithArrayByMinimalistCollectionHolder                     } from "./hasOne.withArray"
export {hasOneWithCollectionHolder,           hasOneWithCollectionHolderByCollectionHolder,           hasOneWithCollectionHolderByMinimalistCollectionHolder          } from "./hasOne.withCollectionHolder"
export {hasOneWithCollectionIterator,         hasOneWithCollectionIteratorByCollectionHolder,         hasOneWithCollectionIteratorByMinimalistCollectionHolder        } from "./hasOne.withCollectionIterator"
export {hasOneWithIterable,                   hasOneWithIterableByCollectionHolder,                   hasOneWithIterableByMinimalistCollectionHolder                  } from "./hasOne.withIterable"
export {hasOneWithMinimalistCollectionHolder, hasOneWithMinimalistCollectionHolderByCollectionHolder, hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "./hasOne.withMinimalistCollectionHolder"
export {hasOneWithSet,                        hasOneWithSetByCollectionHolder,                        hasOneWithSetByMinimalistCollectionHolder                       } from "./hasOne.withSet"
export {indexOf,                              indexOfByCollectionHolder,                              indexOfByMinimalistCollectionHolder                             } from "./indexOf"
export {indexOfFirst,                         indexOfFirstByCollectionHolder,                         indexOfFirstByMinimalistCollectionHolder                        } from "./indexOfFirst"
export {indexOfFirstIndexed,                  indexOfFirstIndexedByCollectionHolder,                  indexOfFirstIndexedByMinimalistCollectionHolder                 } from "./indexOfFirstIndexed"
export {indexOfLast,                          indexOfLastByCollectionHolder,                          indexOfLastByMinimalistCollectionHolder                         } from "./indexOfLast"
export {indexOfLastIndexed,                   indexOfLastIndexedByCollectionHolder,                   indexOfLastIndexedByMinimalistCollectionHolder                  } from "./indexOfLastIndexed"
export {isArray                                                                                                                                                       } from "./isArray"
export {isArrayByStructure                                                                                                                                            } from "./isArrayByStructure"
export {isCollectionHolder                                                                                                                                            } from "./isCollectionHolder"
export {isCollectionHolderByStructure                                                                                                                                 } from "./isCollectionHolderByStructure"
export {isCollectionIterator                                                                                                                                          } from "./isCollectionIterator"
export {isCollectionIteratorByStructure                                                                                                                               } from "./isCollectionIteratorByStructure"
export {isMinimalistCollectionHolder                                                                                                                                  } from "./isMinimalistCollectionHolder"
export {isMinimalistCollectionHolderByStructure                                                                                                                       } from "./isMinimalistCollectionHolderByStructure"
export {isSet                                                                                                                                                         } from "./isSet"
export {isSetByStructure                                                                                                                                              } from "./isSetByStructure"
export {joinToString,                         joinToStringByCollectionHolder,                         joinToStringByMinimalistCollectionHolder, prefixAndPostfixOnly  } from "./joinToString"
export {last,                                 lastByCollectionHolder,                                 lastByMinimalistCollectionHolder                                } from "./last"
export {lastIndexOf,                          lastIndexOfByCollectionHolder,                          lastIndexOfByMinimalistCollectionHolder                         } from "./lastIndexOf"
export {lastOrNull,                           lastOrNullByCollectionHolder,                           lastOrNullByMinimalistCollectionHolder                          } from "./lastOrNull"
export {map,                                  mapByCollectionHolder,                                  mapByMinimalistCollectionHolder                                 } from "./map"
export {mapIndexed,                           mapIndexedByCollectionHolder,                           mapIndexedByMinimalistCollectionHolder                          } from "./mapIndexed"
export {mapNotNull,                           mapNotNullByCollectionHolder,                           mapNotNullByMinimalistCollectionHolder                          } from "./mapNotNull"
export {mapNotNullIndexed,                    mapNotNullIndexedByCollectionHolder,                    mapNotNullIndexedByMinimalistCollectionHolder                   } from "./mapNotNullIndexed"

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

export {requireNoNulls,                       requireNoNullsByCollectionHolder,                       requireNoNullsByMinimalistCollectionHolder                      } from "./requireNoNulls"
export {slice,                                sliceByCollectionHolder,                                sliceByMinimalistCollectionHolder                               } from "./slice"
export {sliceWithARange,                      sliceWithARangeByCollectionHolder,                      sliceWithARangeByMinimalistCollectionHolder                     } from "./slice.withARange"
export {sliceWithArray,                       sliceWithArrayByCollectionHolder,                       sliceWithArrayByMinimalistCollectionHolder                      } from "./slice.withArray"
export {sliceWithCollectionHolder,            sliceWithCollectionHolderByCollectionHolder,            sliceWithCollectionHolderByMinimalistCollectionHolder           } from "./slice.withCollectionHolder"
export {sliceWithCollectionIterator,          sliceWithCollectionIteratorByCollectionHolder,          sliceWithCollectionIteratorByMinimalistCollectionHolder         } from "./slice.withCollectionIterator"
export {sliceWithIterable,                    sliceWithIterableByCollectionHolder,                    sliceWithIterableByMinimalistCollectionHolder                   } from "./slice.withIterable"
export {sliceWithMinimalistCollectionHolder,  sliceWithMinimalistCollectionHolderByCollectionHolder,  sliceWithMinimalistCollectionHolderByMinimalistCollectionHolder } from "./slice.withMinimalistCollectionHolder"
export {sliceWithSet,                         sliceWithSetByCollectionHolder,                         sliceWithSetByMinimalistCollectionHolder                        } from "./slice.withSet"
export {sliceByCollectionHolderWithSet}                                             from "./slice.withSet"

export {toArray}                                        from "./toArray"
export {toArray as toArrayByCollectionHolder}           from "./collectionHolder/toArray"
export {toArray as toArrayByMinimalistCollectionHolder} from "./minimalistCollectionHolder/toArray"

export {toIterator,                           toIteratorByCollectionHolder,                           toIteratorByMinimalistCollectionHolder                          } from "./toIterator"
export {toLocaleLowerCaseString,              toLocaleLowerCaseStringByCollectionHolder,              toLocaleLowerCaseStringByMinimalistCollectionHolder             } from "./toLocaleLowerCaseString"
export {toLocaleString,                       toLocaleStringByCollectionHolder,                       toLocaleStringByMinimalistCollectionHolder                      } from "./toLocaleString"
export {toLocaleUpperCaseString,              toLocaleUpperCaseStringByCollectionHolder,              toLocaleUpperCaseStringByMinimalistCollectionHolder             } from "./toLocaleUpperCaseString"
export {toLowerCaseString,                    toLowerCaseStringByCollectionHolder,                    toLowerCaseStringByMinimalistCollectionHolder                   } from "./toLowerCaseString"

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
