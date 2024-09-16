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
export {none,                                 noneByCollectionHolder,                                 noneByMinimalistCollectionHolder                                } from "./none"
export {map,                                  mapByCollectionHolder,                                  mapByMinimalistCollectionHolder                                 } from "./map"
export {mapIndexed,                           mapIndexedByCollectionHolder,                           mapIndexedByMinimalistCollectionHolder                          } from "./mapIndexed"
export {mapNotNull,                           mapNotNullByCollectionHolder,                           mapNotNullByMinimalistCollectionHolder                          } from "./mapNotNull"
export {mapNotNullIndexed,                    mapNotNullIndexedByCollectionHolder,                    mapNotNullIndexedByMinimalistCollectionHolder                   } from "./mapNotNullIndexed"
export {objectValuesMap,                      objectValuesMapByCollectionHolder                                                                                       } from "./objectValuesMap"
export {onEach,                               onEachByCollectionHolder,                               onEachByMinimalistCollectionHolder                              } from "./onEach"
export {onEachIndexed,                        onEachIndexedByCollectionHolder,                        onEachIndexedByMinimalistCollectionHolder                       } from "./onEachIndexed"
export {requireNoNulls,                       requireNoNullsByCollectionHolder,                       requireNoNullsByMinimalistCollectionHolder                      } from "./requireNoNulls"
export {slice,                                sliceByCollectionHolder,                                sliceByMinimalistCollectionHolder                               } from "./slice"
export {sliceWithARange,                      sliceWithARangeByCollectionHolder,                      sliceWithARangeByMinimalistCollectionHolder                     } from "./slice.withARange"
export {sliceWithArray,                       sliceWithArrayByCollectionHolder,                       sliceWithArrayByMinimalistCollectionHolder                      } from "./slice.withArray"
export {sliceWithCollectionHolder,            sliceWithCollectionHolderByCollectionHolder,            sliceWithCollectionHolderByMinimalistCollectionHolder           } from "./slice.withCollectionHolder"
export {sliceWithCollectionIterator,          sliceWithCollectionIteratorByCollectionHolder,          sliceWithCollectionIteratorByMinimalistCollectionHolder         } from "./slice.withCollectionIterator"
export {sliceWithIterable,                    sliceWithIterableByCollectionHolder,                    sliceWithIterableByMinimalistCollectionHolder                   } from "./slice.withIterable"
export {sliceWithMinimalistCollectionHolder,  sliceWithMinimalistCollectionHolderByCollectionHolder,  sliceWithMinimalistCollectionHolderByMinimalistCollectionHolder } from "./slice.withMinimalistCollectionHolder"
export {sliceWithSet,                         sliceWithSetByCollectionHolder,                         sliceWithSetByMinimalistCollectionHolder                        } from "./slice.withSet"
export {sliceByCollectionHolderWithSet                                                                                                                                } from "./slice.withSet"
export {toArray,                              toArrayByCollectionHolder,                              toArrayByMinimalistCollectionHolder                             } from "./toArray"
export {toIterator,                           toIteratorByCollectionHolder,                           toIteratorByMinimalistCollectionHolder                          } from "./toIterator"
export {toLocaleLowerCaseString,              toLocaleLowerCaseStringByCollectionHolder,              toLocaleLowerCaseStringByMinimalistCollectionHolder             } from "./toLocaleLowerCaseString"
export {toLocaleString,                       toLocaleStringByCollectionHolder,                       toLocaleStringByMinimalistCollectionHolder                      } from "./toLocaleString"
export {toLocaleUpperCaseString,              toLocaleUpperCaseStringByCollectionHolder,              toLocaleUpperCaseStringByMinimalistCollectionHolder             } from "./toLocaleUpperCaseString"
export {toLowerCaseString,                    toLowerCaseStringByCollectionHolder,                    toLowerCaseStringByMinimalistCollectionHolder                   } from "./toLowerCaseString"
export {toMap,                                toMapByCollectionHolder,                                toMapByMinimalistCollectionHolder                               } from "./toMap"
export {toMutableArray,                       toMutableArrayByCollectionHolder,                       toMutableArrayByMinimalistCollectionHolder                      } from "./toMutableArray"
export {toMutableMap,                         toMutableMapByCollectionHolder,                         toMutableMapByMinimalistCollectionHolder                        } from "./toMutableMap"
export {toMutableSet,                         toMutableSetByCollectionHolder,                         toMutableSetByMinimalistCollectionHolder                        } from "./toMutableSet"
export {toMutableWeakSet,                     toMutableWeakSetByCollectionHolder,                     toMutableWeakSetByMinimalistCollectionHolder                    } from "./toMutableWeakSet"
export {toReverse,                            toReverseByCollectionHolder,                            toReverseByMinimalistCollectionHolder                           } from "./toReverse"
export {toSet,                                toSetByCollectionHolder,                                toSetByMinimalistCollectionHolder                               } from "./toSet"
export {toString,                             toStringByCollectionHolder,                             toStringByMinimalistCollectionHolder                            } from "./toString"
export {toUpperCaseString,                    toUpperCaseStringByCollectionHolder,                    toUpperCaseStringByMinimalistCollectionHolder                   } from "./toUpperCaseString"

export {toWeakSet}                                          from "./toWeakSet"
export {toWeakSet as toWeakSetByCollectionHolder}           from "./collectionHolder/toWeakSet"
export {toWeakSet as toWeakSetByMinimalistCollectionHolder} from "./minimalistCollectionHolder/toWeakSet"
