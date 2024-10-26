/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

export {all,                                  allByCollectionHolder,                                  allByMinimalistCollectionHolder,                                  allByArray                                 } from "./all"
export {any,                                  anyByCollectionHolder,                                  anyByMinimalistCollectionHolder,                                  anyByArray                                 } from "./any"
export {asLocaleLowerCaseString, asLocaleString, asLocaleUpperCaseString, asLowerCaseString, asString, asUpperCaseString                                                                                           } from "./asString"
export {drop,                                 dropByCollectionHolder,                                 dropByMinimalistCollectionHolder,                                 dropByArray                                } from "./drop"
export {dropLast,                             dropLastByCollectionHolder,                             dropLastByMinimalistCollectionHolder,                             dropLastByArray                            } from "./dropLast"
export {dropLastWhile,                        dropLastWhileByCollectionHolder,                        dropLastWhileByMinimalistCollectionHolder,                        dropLastWhileByArray                       } from "./dropLastWhile"
export {dropLastWhileIndexed,                 dropLastWhileIndexedByCollectionHolder,                 dropLastWhileIndexedByMinimalistCollectionHolder,                 dropLastWhileIndexedByArray                } from "./dropLastWhileIndexed"
export {dropWhile,                            dropWhileByCollectionHolder,                            dropWhileByMinimalistCollectionHolder,                            dropWhileByArray                           } from "./dropWhile"
export {dropWhileIndexed,                     dropWhileIndexedByCollectionHolder,                     dropWhileIndexedByMinimalistCollectionHolder,                     dropWhileIndexedByArray                    } from "./dropWhileIndexed"
export {filter,                               filterByCollectionHolder,                               filterByMinimalistCollectionHolder,                               filterByArray                              } from "./filter"
export {filterIndexed,                        filterIndexedByCollectionHolder,                        filterIndexedByMinimalistCollectionHolder,                        filterIndexedByArray                       } from "./filterIndexed"
export {filterNot,                            filterNotByCollectionHolder,                            filterNotByMinimalistCollectionHolder,                            filterNotByArray                           } from "./filterNot"
export {filterNotIndexed,                     filterNotIndexedByCollectionHolder,                     filterNotIndexedByMinimalistCollectionHolder,                     filterNotIndexedByArray                    } from "./filterNotIndexed"
export {filterNotNull,                        filterNotNullByCollectionHolder,                        filterNotNullByMinimalistCollectionHolder,                        filterNotNullByArray                       } from "./filterNotNull"
export {find,                                 findByCollectionHolder,                                 findByMinimalistCollectionHolder,                                 findByArray                                } from "./find"
export {findFirst,                            findFirstByCollectionHolder,                            findFirstByMinimalistCollectionHolder,                            findFirstByArray                           } from "./findFirst"
export {findFirstIndexed,                     findFirstIndexedByCollectionHolder,                     findFirstIndexedByMinimalistCollectionHolder,                     findFirstIndexedByArray                    } from "./findFirstIndexed"
export {findFirstIndexedOrNull,               findFirstIndexedOrNullByCollectionHolder,               findFirstIndexedOrNullByMinimalistCollectionHolder,               findFirstIndexedOrNullByArray              } from "./findFirstIndexedOrNull"
export {findFirstOrNull,                      findFirstOrNullByCollectionHolder,                      findFirstOrNullByMinimalistCollectionHolder,                      findFirstOrNullByArray                     } from "./findFirstOrNull"
export {findIndexed,                          findIndexedByCollectionHolder,                          findIndexedByMinimalistCollectionHolder,                          findIndexedByArray                         } from "./findIndexed"
export {findIndexedOrNull,                    findIndexedOrNullByCollectionHolder,                    findIndexedOrNullByMinimalistCollectionHolder,                    findIndexedOrNullByArray                   } from "./findIndexedOrNull"
export {findLast,                             findLastByCollectionHolder,                             findLastByMinimalistCollectionHolder,                             findLastByArray                            } from "./findLast"
export {findLastIndexed,                      findLastIndexedByCollectionHolder,                      findLastIndexedByMinimalistCollectionHolder,                      findLastIndexedByArray                     } from "./findLastIndexed"
export {findLastIndexedOrNull,                findLastIndexedOrNullByCollectionHolder,                findLastIndexedOrNullByMinimalistCollectionHolder,                findLastIndexedOrNullByArray               } from "./findLastIndexedOrNull"
export {findLastOrNull,                       findLastOrNullByCollectionHolder,                       findLastOrNullByMinimalistCollectionHolder,                       findLastOrNullByArray                      } from "./findLastOrNull"
export {findOrNull,                           findOrNullByCollectionHolder,                           findOrNullByMinimalistCollectionHolder,                           findOrNullByArray                          } from "./findOrNull"
export {first,                                firstByCollectionHolder,                                firstByMinimalistCollectionHolder,                                firstByArray                               } from "./first"
export {firstIndexed,                         firstIndexedByCollectionHolder,                         firstIndexedByMinimalistCollectionHolder,                         firstIndexedByArray                        } from "./firstIndexed"
export {firstIndexedOrNull,                   firstIndexedOrNullByCollectionHolder,                   firstIndexedOrNullByMinimalistCollectionHolder,                   firstIndexedOrNullByArray                  } from "./firstIndexedOrNull"
export {firstOrNull,                          firstOrNullByCollectionHolder,                          firstOrNullByMinimalistCollectionHolder,                          firstOrNullByArray                         } from "./firstOrNull"
export {forEach,                              forEachByCollectionHolder,                              forEachByMinimalistCollectionHolder,                              forEachByArray                             } from "./forEach"
export {forEachIndexed,                       forEachIndexedByCollectionHolder,                       forEachIndexedByMinimalistCollectionHolder,                       forEachIndexedByArray                      } from "./forEachIndexed"
export {getFirst,                             getFirstByCollectionHolder,                             getFirstByMinimalistCollectionHolder,                             getFirstByArray                            } from "./getFirst"
export {getFirstOrNull,                       getFirstOrNullByCollectionHolder,                       getFirstOrNullByMinimalistCollectionHolder,                       getFirstOrNullByArray                      } from "./getFirstOrNull"
export {getLast,                              getLastByCollectionHolder,                              getLastByMinimalistCollectionHolder,                              getLastByArray                             } from "./getLast"
export {getLastOrNull,                        getLastOrNullByCollectionHolder,                        getLastOrNullByMinimalistCollectionHolder,                        getLastOrNullByArray                       } from "./getLastOrNull"
export {getOrElse,                            getOrElseByCollectionHolder,                            getOrElseByMinimalistCollectionHolder,                            getOrElseByArray                           } from "./getOrElse"
export {getOrNull,                            getOrNullByCollectionHolder,                            getOrNullByMinimalistCollectionHolder,                            getOrNullByArray                           } from "./getOrNull"
export {has,                                  hasByCollectionHolder,                                  hasByMinimalistCollectionHolder,                                  hasByArray                                 } from "./has"
export {hasAll,                               hasAllByCollectionHolder,                               hasAllByMinimalistCollectionHolder,                               hasAllByArray                              } from "./hasAll"
export {hasAllWithArray,                      hasAllWithArrayByCollectionHolder,                      hasAllWithArrayByMinimalistCollectionHolder,                      hasAllWithArrayByArray                     } from "./hasAll.withArray"
export {hasAllWithCollectionHolder,           hasAllWithCollectionHolderByCollectionHolder,           hasAllWithCollectionHolderByMinimalistCollectionHolder,           hasAllWithCollectionHolderByArray          } from "./hasAll.withCollectionHolder"
export {hasAllWithCollectionIterator,         hasAllWithCollectionIteratorByCollectionHolder,         hasAllWithCollectionIteratorByMinimalistCollectionHolder,         hasAllWithCollectionIteratorByArray        } from "./hasAll.withCollectionIterator"
export {hasAllWithIterable,                   hasAllWithIterableByCollectionHolder,                   hasAllWithIterableByMinimalistCollectionHolder,                   hasAllWithIterableByArray                  } from "./hasAll.withIterable"
export {hasAllWithMinimalistCollectionHolder, hasAllWithMinimalistCollectionHolderByCollectionHolder, hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder, hasAllWithMinimalistCollectionHolderByArray} from "./hasAll.withMinimalistCollectionHolder"
export {hasAllWithSet,                        hasAllWithSetByCollectionHolder,                        hasAllWithSetByMinimalistCollectionHolder,                        hasAllWithSetByArray                       } from "./hasAll.withSet"
export {hasDuplicate,                         hasDuplicateByCollectionHolder,                         hasDuplicateByMinimalistCollectionHolder,                         hasDuplicateByArray                        } from "./hasDuplicate"
export {hasNull,                              hasNullByCollectionHolder,                              hasNullByMinimalistCollectionHolder,                              hasNullByArray                             } from "./hasNull"
export {hasOne,                               hasOneByCollectionHolder,                               hasOneByMinimalistCollectionHolder,                               hasOneByArray                              } from "./hasOne"
export {hasOneWithArray,                      hasOneWithArrayByCollectionHolder,                      hasOneWithArrayByMinimalistCollectionHolder,                      hasOneWithArrayByArray                     } from "./hasOne.withArray"
export {hasOneWithCollectionHolder,           hasOneWithCollectionHolderByCollectionHolder,           hasOneWithCollectionHolderByMinimalistCollectionHolder,           hasOneWithCollectionHolderByArray          } from "./hasOne.withCollectionHolder"
export {hasOneWithCollectionIterator,         hasOneWithCollectionIteratorByCollectionHolder,         hasOneWithCollectionIteratorByMinimalistCollectionHolder,         hasOneWithCollectionIteratorByArray        } from "./hasOne.withCollectionIterator"
export {hasOneWithIterable,                   hasOneWithIterableByCollectionHolder,                   hasOneWithIterableByMinimalistCollectionHolder,                   hasOneWithIterableByArray                  } from "./hasOne.withIterable"
export {hasOneWithMinimalistCollectionHolder, hasOneWithMinimalistCollectionHolderByCollectionHolder, hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder, hasOneWithMinimalistCollectionHolderByArray} from "./hasOne.withMinimalistCollectionHolder"
export {hasOneWithSet,                        hasOneWithSetByCollectionHolder,                        hasOneWithSetByMinimalistCollectionHolder,                        hasOneWithSetByArray                       } from "./hasOne.withSet"
export {indexOf,                              indexOfByCollectionHolder,                              indexOfByMinimalistCollectionHolder,                              indexOfByArray                             } from "./indexOf"
export {indexOfFirst,                         indexOfFirstByCollectionHolder,                         indexOfFirstByMinimalistCollectionHolder,                         indexOfFirstByArray                        } from "./indexOfFirst"
export {indexOfFirstIndexed,                  indexOfFirstIndexedByCollectionHolder,                  indexOfFirstIndexedByMinimalistCollectionHolder,                  indexOfFirstIndexedByArray                 } from "./indexOfFirstIndexed"
export {indexOfLast,                          indexOfLastByCollectionHolder,                          indexOfLastByMinimalistCollectionHolder,                          indexOfLastByArray                         } from "./indexOfLast"
export {indexOfLastIndexed,                   indexOfLastIndexedByCollectionHolder,                   indexOfLastIndexedByMinimalistCollectionHolder,                   indexOfLastIndexedByArray                  } from "./indexOfLastIndexed"
export {isArray                                                                                                                                                                                                    } from "./isArray"
export {isArrayByStructure                                                                                                                                                                                         } from "./isArrayByStructure"
export {isCollectionHolder                                                                                                                                                                                         } from "./isCollectionHolder"
export {isCollectionHolderByStructure                                                                                                                                                                              } from "./isCollectionHolderByStructure"
export {isCollectionIterator                                                                                                                                                                                       } from "./isCollectionIterator"
export {isCollectionIteratorByStructure                                                                                                                                                                            } from "./isCollectionIteratorByStructure"
export {isEmpty,                              isEmptyByCollectionHolder,                              isEmptyByMinimalistCollectionHolder,                              isEmptyByArray                             } from "./isEmpty"
export {isIterator                                                                                                                                                                                                 } from "./isIterator"
export {isMinimalistCollectionHolder                                                                                                                                                                               } from "./isMinimalistCollectionHolder"
export {isMinimalistCollectionHolderByStructure                                                                                                                                                                    } from "./isMinimalistCollectionHolderByStructure"
export {isSet                                                                                                                                                                                                      } from "./isSet"
export {isSetByStructure                                                                                                                                                                                           } from "./isSetByStructure"
export {isNotEmpty,                           isNotEmptyByCollectionHolder,                           isNotEmptyByMinimalistCollectionHolder,                           isNotEmptyByArray                          } from "./isNotEmpty"
export {joinToString,                         joinToStringByCollectionHolder,                         joinToStringByMinimalistCollectionHolder,                         joinToStringByArray, prefixAndPostfixOnly  } from "./joinToString"
export {last,                                 lastByCollectionHolder,                                 lastByMinimalistCollectionHolder,                                 lastByArray                                } from "./last"
export {lastIndexed,                          lastIndexedByCollectionHolder,                          lastIndexedByMinimalistCollectionHolder,                          lastIndexedByArray                         } from "./lastIndexed"
export {lastIndexedOrNull,                    lastIndexedOrNullByCollectionHolder,                    lastIndexedOrNullByMinimalistCollectionHolder,                    lastIndexedOrNullByArray                   } from "./lastIndexedOrNull"
export {lastIndexOf,                          lastIndexOfByCollectionHolder,                          lastIndexOfByMinimalistCollectionHolder,                          lastIndexOfByArray                         } from "./lastIndexOf"
export {lastOrNull,                           lastOrNullByCollectionHolder,                           lastOrNullByMinimalistCollectionHolder,                           lastOrNullByArray                          } from "./lastOrNull"
export {none,                                 noneByCollectionHolder,                                 noneByMinimalistCollectionHolder,                                 noneByArray                                } from "./none"
export {map,                                  mapByCollectionHolder,                                  mapByMinimalistCollectionHolder,                                  mapByArray                                 } from "./map"
export {mapIndexed,                           mapIndexedByCollectionHolder,                           mapIndexedByMinimalistCollectionHolder,                           mapIndexedByArray                          } from "./mapIndexed"
export {mapNotNull,                           mapNotNullByCollectionHolder,                           mapNotNullByMinimalistCollectionHolder,                           mapNotNullByArray                          } from "./mapNotNull"
export {mapNotNullIndexed,                    mapNotNullIndexedByCollectionHolder,                    mapNotNullIndexedByMinimalistCollectionHolder,                    mapNotNullIndexedByArray                   } from "./mapNotNullIndexed"
export {onEach,                               onEachByCollectionHolder,                               onEachByMinimalistCollectionHolder,                               onEachByArray                              } from "./onEach"
export {onEachIndexed,                        onEachIndexedByCollectionHolder,                        onEachIndexedByMinimalistCollectionHolder,                        onEachIndexedByArray                       } from "./onEachIndexed"
export {requireNoNulls,                       requireNoNullsByCollectionHolder,                       requireNoNullsByMinimalistCollectionHolder,                       requireNoNullsByArray                      } from "./requireNoNulls"
export {slice,                                sliceByCollectionHolder,                                sliceByMinimalistCollectionHolder,                                sliceByArray                               } from "./slice"
export {sliceWithARange,                      sliceWithARangeByCollectionHolder,                      sliceWithARangeByMinimalistCollectionHolder,                      sliceWithARangeByArray                     } from "./slice.withARange"
export {sliceWithArray,                       sliceWithArrayByCollectionHolder,                       sliceWithArrayByMinimalistCollectionHolder,                       sliceWithArrayByArray                      } from "./slice.withArray"
export {sliceWithCollectionHolder,            sliceWithCollectionHolderByCollectionHolder,            sliceWithCollectionHolderByMinimalistCollectionHolder,            sliceWithCollectionHolderByArray           } from "./slice.withCollectionHolder"
export {sliceWithCollectionIterator,          sliceWithCollectionIteratorByCollectionHolder,          sliceWithCollectionIteratorByMinimalistCollectionHolder,          sliceWithCollectionIteratorByArray         } from "./slice.withCollectionIterator"
export {sliceWithIterable,                    sliceWithIterableByCollectionHolder,                    sliceWithIterableByMinimalistCollectionHolder,                    sliceWithIterableByArray                   } from "./slice.withIterable"
export {sliceWithMinimalistCollectionHolder,  sliceWithMinimalistCollectionHolderByCollectionHolder,  sliceWithMinimalistCollectionHolderByMinimalistCollectionHolder , sliceWithMinimalistCollectionHolderByArray } from "./slice.withMinimalistCollectionHolder"
export {sliceWithSet,                         sliceWithSetByCollectionHolder,                         sliceWithSetByMinimalistCollectionHolder,                         sliceWithSetByArray                        } from "./slice.withSet"
export {take,                                 takeByCollectionHolder,                                 takeByMinimalistCollectionHolder,                                 takeByArray                                } from "./take"
export {takeLast,                             takeLastByCollectionHolder,                             takeLastByMinimalistCollectionHolder,                             takeLastByArray                            } from "./takeLast"
export {takeLastWhile,                        takeLastWhileByCollectionHolder,                        takeLastWhileByMinimalistCollectionHolder,                        takeLastWhileByArray                       } from "./takeLastWhile"
export {takeLastWhileIndexed,                 takeLastWhileIndexedByCollectionHolder,                 takeLastWhileIndexedByMinimalistCollectionHolder,                 takeLastWhileIndexedByArray                } from "./takeLastWhileIndexed"
export {takeWhile,                            takeWhileByCollectionHolder,                            takeWhileByMinimalistCollectionHolder,                            takeWhileByArray                           } from "./takeWhile"
export {takeWhileIndexed,                     takeWhileIndexedByCollectionHolder,                     takeWhileIndexedByMinimalistCollectionHolder,                     takeWhileIndexedByArray                    } from "./takeWhileIndexed"
export {toArray,                              toArrayByCollectionHolder,                              toArrayByMinimalistCollectionHolder,                              toArrayByArray                             } from "./toArray"
export {toIterator,                           toIteratorByCollectionHolder,                           toIteratorByMinimalistCollectionHolder,                           toIteratorByArray                          } from "./toIterator"
export {toLocaleLowerCaseString,              toLocaleLowerCaseStringByCollectionHolder,              toLocaleLowerCaseStringByMinimalistCollectionHolder,              toLocaleLowerCaseStringByArray             } from "./toLocaleLowerCaseString"
export {toLocaleString,                       toLocaleStringByCollectionHolder,                       toLocaleStringByMinimalistCollectionHolder,                       toLocaleStringByArray                      } from "./toLocaleString"
export {toLocaleUpperCaseString,              toLocaleUpperCaseStringByCollectionHolder,              toLocaleUpperCaseStringByMinimalistCollectionHolder,              toLocaleUpperCaseStringByArray             } from "./toLocaleUpperCaseString"
export {toLowerCaseString,                    toLowerCaseStringByCollectionHolder,                    toLowerCaseStringByMinimalistCollectionHolder,                    toLowerCaseStringByArray                   } from "./toLowerCaseString"
export {toMap,                                toMapByCollectionHolder,                                toMapByMinimalistCollectionHolder,                                toMapByArray                               } from "./toMap"
export {toMutableArray,                       toMutableArrayByCollectionHolder,                       toMutableArrayByMinimalistCollectionHolder,                       toMutableArrayByArray                      } from "./toMutableArray"
export {toMutableMap,                         toMutableMapByCollectionHolder,                         toMutableMapByMinimalistCollectionHolder,                         toMutableMapByArray                        } from "./toMutableMap"
export {toMutableSet,                         toMutableSetByCollectionHolder,                         toMutableSetByMinimalistCollectionHolder,                         toMutableSetByArray                        } from "./toMutableSet"
export {toMutableWeakSet,                     toMutableWeakSetByCollectionHolder,                     toMutableWeakSetByMinimalistCollectionHolder,                     toMutableWeakSetByArray                    } from "./toMutableWeakSet"
export {toReverse,                            toReverseByCollectionHolder,                            toReverseByMinimalistCollectionHolder,                            toReverseByArray                           } from "./toReverse"
export {toSet,                                toSetByCollectionHolder,                                toSetByMinimalistCollectionHolder,                                toSetByArray                               } from "./toSet"
export {toString,                             toStringByCollectionHolder,                             toStringByMinimalistCollectionHolder,                             toStringByArray                            } from "./toString"
export {toUpperCaseString,                    toUpperCaseStringByCollectionHolder,                    toUpperCaseStringByMinimalistCollectionHolder,                    toUpperCaseStringByArray                   } from "./toUpperCaseString"
export {toWeakSet,                            toWeakSetByCollectionHolder,                            toWeakSetByMinimalistCollectionHolder,                            toWeakSetByArray                           } from "./toWeakSet"
