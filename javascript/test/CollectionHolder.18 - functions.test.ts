/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {Holder}                                 from "./Holder"
import {CollectionHolder_ByStructure}           from "./instance/CollectionHolder_ByStructure"
import {CollectionIterator_ByStructure}         from "./instance/CollectionIterator_ByStructure"
import {CollectionHolderFromArray}              from "./instance/CollectionHolderFromArray"
import {CollectionIteratorFromArray}            from "./instance/CollectionIteratorFromArray"
import {IterableForTest}                        from "./instance/IterableForTest"
import {MinimalistCollectionHolder_ByStructure} from "./instance/MinimalistCollectionHolder_ByStructure"
import {MinimalistCollectionHolderFromArray}    from "./instance/MinimalistCollectionHolderFromArray"
import {A, B, EMPTY, NULL_UNDEFINED}            from "./value/arrays"
import {callbackAsTrue0}                        from "./value/callbacks (boolean)"
import {callbackAsFail0}                        from "./value/callbacks (fail)"

import type {PossibleIterableArraySetOrCollectionHolder} from "../src/type/possibleInstance"

import {CollectionConstants}                                                                                                                                                                                                             from "../src/CollectionConstants"
import {GenericCollectionHolder}                                                                                                                                                                                                         from "../src/GenericCollectionHolder"
import {GenericMinimalistCollectionHolder}                                                                                                                                                                                               from "../src/GenericMinimalistCollectionHolder"
import {LazyGenericCollectionHolder}                                                                                                                                                                                                     from "../src/LazyGenericCollectionHolder"
import {NullCollectionException}                                                                                                                                                                                                         from "../src/exception/NullCollectionException"
import {GenericCollectionIterator}                                                                                                                                                                                                       from "../src/iterator/GenericCollectionIterator"
import * as allModule                                                                                                                                                                                                                    from "../src/method/all"
import {all, allByArray, allByCollectionHolder, allByMinimalistCollectionHolder}                                                                                                                                                         from "../src/method/all"
import * as anyModule                                                                                                                                                                                                                    from "../src/method/any"
import {any, anyByArray, anyByCollectionHolder, anyByMinimalistCollectionHolder}                                                                                                                                                         from "../src/method/any"
import {atOrElse, atOrElseByArray, atOrElseByCollectionHolder, atOrElseByMinimalistCollectionHolder}                                                                                                                                     from "../src/method/atOrElse"
import {atOrNull, atOrNullByArray, atOrNullByCollectionHolder, atOrNullByMinimalistCollectionHolder}                                                                                                                                     from "../src/method/atOrNull"
import {contains, containsByArray, containsByCollectionHolder, containsByMinimalistCollectionHolder}                                                                                                                                     from "../src/method/contains"
import {containsAll, containsAllByArray, containsAllByCollectionHolder, containsAllByMinimalistCollectionHolder}                                                                                                                         from "../src/method/containsAll"
import {containsAllWithArray, containsAllWithArrayByArray, containsAllWithArrayByCollectionHolder, containsAllWithArrayByMinimalistCollectionHolder}                                                                                     from "../src/method/containsAll.withArray"
import {containsAllWithCollectionHolder, containsAllWithCollectionHolderByArray, containsAllWithCollectionHolderByCollectionHolder, containsAllWithCollectionHolderByMinimalistCollectionHolder}                                         from "../src/method/containsAll.withCollectionHolder"
import {containsAllWithCollectionIterator, containsAllWithCollectionIteratorByArray, containsAllWithCollectionIteratorByCollectionHolder, containsAllWithCollectionIteratorByMinimalistCollectionHolder}                                 from "../src/method/containsAll.withCollectionIterator"
import {containsAllWithIterable, containsAllWithIterableByArray, containsAllWithIterableByCollectionHolder, containsAllWithIterableByMinimalistCollectionHolder}                                                                         from "../src/method/containsAll.withIterable"
import {containsAllWithMinimalistCollectionHolder, containsAllWithMinimalistCollectionHolderByArray, containsAllWithMinimalistCollectionHolderByCollectionHolder, containsAllWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "../src/method/containsAll.withMinimalistCollectionHolder"
import {containsAllWithSet, containsAllWithSetByArray, containsAllWithSetByCollectionHolder, containsAllWithSetByMinimalistCollectionHolder}                                                                                             from "../src/method/containsAll.withSet"
import {containsDuplicate, containsDuplicateByArray, containsDuplicateByCollectionHolder, containsDuplicateByMinimalistCollectionHolder}                                                                                                 from "../src/method/containsDuplicate"
import {containsNull, containsNullByArray, containsNullByCollectionHolder, containsNullByMinimalistCollectionHolder}                                                                                                                     from "../src/method/containsNull"
import {containsOne, containsOneByArray, containsOneByCollectionHolder, containsOneByMinimalistCollectionHolder}                                                                                                                         from "../src/method/containsOne"
import {containsOneWithArray, containsOneWithArrayByArray, containsOneWithArrayByCollectionHolder, containsOneWithArrayByMinimalistCollectionHolder}                                                                                     from "../src/method/containsOne.withArray"
import {containsOneWithCollectionHolder, containsOneWithCollectionHolderByArray, containsOneWithCollectionHolderByCollectionHolder, containsOneWithCollectionHolderByMinimalistCollectionHolder}                                         from "../src/method/containsOne.withCollectionHolder"
import {containsOneWithCollectionIterator, containsOneWithCollectionIteratorByArray, containsOneWithCollectionIteratorByCollectionHolder, containsOneWithCollectionIteratorByMinimalistCollectionHolder}                                 from "../src/method/containsOne.withCollectionIterator"
import {containsOneWithIterable, containsOneWithIterableByArray, containsOneWithIterableByCollectionHolder, containsOneWithIterableByMinimalistCollectionHolder}                                                                         from "../src/method/containsOne.withIterable"
import {containsOneWithMinimalistCollectionHolder, containsOneWithMinimalistCollectionHolderByArray, containsOneWithMinimalistCollectionHolderByCollectionHolder, containsOneWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "../src/method/containsOne.withMinimalistCollectionHolder"
import {containsOneWithSet, containsOneWithSetByArray, containsOneWithSetByCollectionHolder, containsOneWithSetByMinimalistCollectionHolder}                                                                                             from "../src/method/containsOne.withSet"
import * as dropModule                                                                                                                                                                                                                   from "../src/method/drop"
import {drop, dropByArray, dropByCollectionHolder, dropByMinimalistCollectionHolder}                                                                                                                                                     from "../src/method/drop"
import * as dropLastModule                                                                                                                                                                                                               from "../src/method/dropLast"
import {dropLast, dropLastByArray, dropLastByCollectionHolder, dropLastByMinimalistCollectionHolder}                                                                                                                                     from "../src/method/dropLast"
import * as dropLastWhileModule                                                                                                                                                                                                          from "../src/method/dropLastWhile"
import {dropLastWhile, dropLastWhileByArray, dropLastWhileByCollectionHolder, dropLastWhileByMinimalistCollectionHolder}                                                                                                                 from "../src/method/dropLastWhile"
import * as dropLastWhileIndexedModule                                                                                                                                                                                                   from "../src/method/dropLastWhileIndexed"
import {dropLastWhileIndexed, dropLastWhileIndexedByArray, dropLastWhileIndexedByCollectionHolder, dropLastWhileIndexedByMinimalistCollectionHolder}                                                                                     from "../src/method/dropLastWhileIndexed"
import * as dropWhileModule                                                                                                                                                                                                              from "../src/method/dropWhile"
import {dropWhile, dropWhileByArray, dropWhileByCollectionHolder, dropWhileByMinimalistCollectionHolder}                                                                                                                                 from "../src/method/dropWhile"
import * as dropWhileIndexedModule                                                                                                                                                                                                       from "../src/method/dropWhileIndexed"
import {dropWhileIndexed, dropWhileIndexedByArray, dropWhileIndexedByCollectionHolder, dropWhileIndexedByMinimalistCollectionHolder}                                                                                                     from "../src/method/dropWhileIndexed"
import {elementAtOrElse, elementAtOrElseByArray, elementAtOrElseByCollectionHolder, elementAtOrElseByMinimalistCollectionHolder}                                                                                                         from "../src/method/elementAtOrElse"
import {elementAtOrNull, elementAtOrNullByArray, elementAtOrNullByCollectionHolder, elementAtOrNullByMinimalistCollectionHolder}                                                                                                         from "../src/method/elementAtOrNull"
import {every, everyByArray, everyByCollectionHolder, everyByMinimalistCollectionHolder}                                                                                                                                                 from "../src/method/every"
import {filter, filterByArray, filterByCollectionHolder, filterByMinimalistCollectionHolder}                                                                                                                                             from "../src/method/filter"
import {filterIndexed, filterIndexedByArray, filterIndexedByCollectionHolder, filterIndexedByMinimalistCollectionHolder}                                                                                                                 from "../src/method/filterIndexed"
import {filterNot, filterNotByArray, filterNotByCollectionHolder, filterNotByMinimalistCollectionHolder}                                                                                                                                 from "../src/method/filterNot"
import {filterNotIndexed, filterNotIndexedByArray, filterNotIndexedByCollectionHolder, filterNotIndexedByMinimalistCollectionHolder}                                                                                                     from "../src/method/filterNotIndexed"
import {filterNotNull, filterNotNullByArray, filterNotNullByCollectionHolder, filterNotNullByMinimalistCollectionHolder}                                                                                                                 from "../src/method/filterNotNull"
import {find, findByArray, findByCollectionHolder, findByMinimalistCollectionHolder}                                                                                                                                                     from "../src/method/find"
import * as findFirstModule                                                                                                                                                                                                              from "../src/method/findFirst"
import {findFirst, findFirstByArray, findFirstByCollectionHolder, findFirstByMinimalistCollectionHolder}                                                                                                                                 from "../src/method/findFirst"
import {findFirstIndex, findFirstIndexByArray, findFirstIndexByCollectionHolder, findFirstIndexByMinimalistCollectionHolder}                                                                                                             from "../src/method/findFirstIndex"
import * as findFirstIndexedModule                                                                                                                                                                                                       from "../src/method/findFirstIndexed"
import {findFirstIndexed, findFirstIndexedByArray, findFirstIndexedByCollectionHolder, findFirstIndexedByMinimalistCollectionHolder}                                                                                                     from "../src/method/findFirstIndexed"
import * as findFirstIndexedOrNullModule                                                                                                                                                                                                 from "../src/method/findFirstIndexedOrNull"
import {findFirstIndexedOrNull, findFirstIndexedOrNullByArray, findFirstIndexedOrNullByCollectionHolder, findFirstIndexedOrNullByMinimalistCollectionHolder}                                                                             from "../src/method/findFirstIndexedOrNull"
import {findFirstIndexIndexed, findFirstIndexIndexedByArray, findFirstIndexIndexedByCollectionHolder, findFirstIndexIndexedByMinimalistCollectionHolder}                                                                                 from "../src/method/findFirstIndexIndexed"
import {findFirstIndexIndexedOrNull, findFirstIndexIndexedOrNullByArray, findFirstIndexIndexedOrNullByCollectionHolder, findFirstIndexIndexedOrNullByMinimalistCollectionHolder}                                                         from "../src/method/findFirstIndexIndexedOrNull"
import {findFirstIndexOrNull, findFirstIndexOrNullByArray, findFirstIndexOrNullByCollectionHolder, findFirstIndexOrNullByMinimalistCollectionHolder}                                                                                     from "../src/method/findFirstIndexOrNull"
import * as findFirstOrNullModule                                                                                                                                                                                                        from "../src/method/findFirstOrNull"
import {findFirstOrNull, findFirstOrNullByArray, findFirstOrNullByCollectionHolder, findFirstOrNullByMinimalistCollectionHolder}                                                                                                         from "../src/method/findFirstOrNull"
import {findIndex, findIndexByArray, findIndexByCollectionHolder, findIndexByMinimalistCollectionHolder}                                                                                                                                 from "../src/method/findIndex"
import {findIndexed, findIndexedByArray, findIndexedByCollectionHolder, findIndexedByMinimalistCollectionHolder}                                                                                                                         from "../src/method/findIndexed"
import {findIndexedOrNull, findIndexedOrNullByArray, findIndexedOrNullByCollectionHolder, findIndexedOrNullByMinimalistCollectionHolder}                                                                                                 from "../src/method/findIndexedOrNull"
import {findIndexIndexed, findIndexIndexedByArray, findIndexIndexedByCollectionHolder, findIndexIndexedByMinimalistCollectionHolder}                                                                                                     from "../src/method/findIndexIndexed"
import {findIndexIndexedOrNull, findIndexIndexedOrNullByArray, findIndexIndexedOrNullByCollectionHolder, findIndexIndexedOrNullByMinimalistCollectionHolder}                                                                             from "../src/method/findIndexIndexedOrNull"
import {findIndexOrNull, findIndexOrNullByArray, findIndexOrNullByCollectionHolder, findIndexOrNullByMinimalistCollectionHolder}                                                                                                         from "../src/method/findIndexOrNull"
import * as findLastModule                                                                                                                                                                                                               from "../src/method/findLast"
import {findLast, findLastByArray, findLastByCollectionHolder, findLastByMinimalistCollectionHolder}                                                                                                                                     from "../src/method/findLast"
import {findLastIndex, findLastIndexByArray, findLastIndexByCollectionHolder, findLastIndexByMinimalistCollectionHolder}                                                                                                                 from "../src/method/findLastIndex"
import * as findLastIndexedModule                                                                                                                                                                                                        from "../src/method/findLastIndexed"
import {findLastIndexed, findLastIndexedByArray, findLastIndexedByCollectionHolder, findLastIndexedByMinimalistCollectionHolder}                                                                                                         from "../src/method/findLastIndexed"
import * as findLastIndexedOrNullModule                                                                                                                                                                                                  from "../src/method/findLastIndexedOrNull"
import {findLastIndexedOrNull, findLastIndexedOrNullByArray, findLastIndexedOrNullByCollectionHolder, findLastIndexedOrNullByMinimalistCollectionHolder}                                                                                 from "../src/method/findLastIndexedOrNull"
import {findLastIndexIndexed, findLastIndexIndexedByArray, findLastIndexIndexedByCollectionHolder, findLastIndexIndexedByMinimalistCollectionHolder}                                                                                     from "../src/method/findLastIndexIndexed"
import {findLastIndexIndexedOrNull, findLastIndexIndexedOrNullByArray, findLastIndexIndexedOrNullByCollectionHolder, findLastIndexIndexedOrNullByMinimalistCollectionHolder}                                                             from "../src/method/findLastIndexIndexedOrNull"
import {findLastIndexOrNull, findLastIndexOrNullByArray, findLastIndexOrNullByCollectionHolder, findLastIndexOrNullByMinimalistCollectionHolder}                                                                                         from "../src/method/findLastIndexOrNull"
import * as findLastOrNullModule                                                                                                                                                                                                         from "../src/method/findLastOrNull"
import {findLastOrNull, findLastOrNullByArray, findLastOrNullByCollectionHolder, findLastOrNullByMinimalistCollectionHolder}                                                                                                             from "../src/method/findLastOrNull"
import {findOrNull, findOrNullByArray, findOrNullByCollectionHolder, findOrNullByMinimalistCollectionHolder}                                                                                                                             from "../src/method/findOrNull"
import {first, firstByArray, firstByCollectionHolder, firstByMinimalistCollectionHolder}                                                                                                                                                 from "../src/method/first"
import {firstIndexed, firstIndexedByArray, firstIndexedByCollectionHolder, firstIndexedByMinimalistCollectionHolder}                                                                                                                     from "../src/method/firstIndexed"
import {firstIndexedOrNull, firstIndexedOrNullByArray, firstIndexedOrNullByCollectionHolder, firstIndexedOrNullByMinimalistCollectionHolder}                                                                                             from "../src/method/firstIndexedOrNull"
import * as firstIndexOfModule                                                                                                                                                                                                           from "../src/method/firstIndexOf"
import {firstIndexOf, firstIndexOfByArray, firstIndexOfByCollectionHolder, firstIndexOfByMinimalistCollectionHolder}                                                                                                                     from "../src/method/firstIndexOf"
import {firstIndexOfOrNull, firstIndexOfOrNullByArray, firstIndexOfOrNullByCollectionHolder, firstIndexOfOrNullByMinimalistCollectionHolder}                                                                                             from "../src/method/firstIndexOfOrNull"
import {firstOrNull, firstOrNullByArray, firstOrNullByCollectionHolder, firstOrNullByMinimalistCollectionHolder}                                                                                                                         from "../src/method/firstOrNull"
import {forEach, forEachByArray, forEachByCollectionHolder, forEachByMinimalistCollectionHolder}                                                                                                                                         from "../src/method/forEach"
import {forEachIndexed, forEachIndexedByArray, forEachIndexedByCollectionHolder, forEachIndexedByMinimalistCollectionHolder}                                                                                                             from "../src/method/forEachIndexed"
import * as getFirstModule                                                                                                                                                                                                               from "../src/method/getFirst"
import {getFirst, getFirstByArray, getFirstByCollectionHolder, getFirstByMinimalistCollectionHolder}                                                                                                                                     from "../src/method/getFirst"
import * as getFirstOrNullModule                                                                                                                                                                                                         from "../src/method/getFirstOrNull"
import {getFirstOrNull, getFirstOrNullByArray, getFirstOrNullByCollectionHolder, getFirstOrNullByMinimalistCollectionHolder}                                                                                                             from "../src/method/getFirstOrNull"
import * as getLastModule                                                                                                                                                                                                                from "../src/method/getLast"
import {getLast, getLastByArray, getLastByCollectionHolder, getLastByMinimalistCollectionHolder}                                                                                                                                         from "../src/method/getLast"
import * as getLastOrNullModule                                                                                                                                                                                                          from "../src/method/getLastOrNull"
import {getLastOrNull, getLastOrNullByArray, getLastOrNullByCollectionHolder, getLastOrNullByMinimalistCollectionHolder}                                                                                                                 from "../src/method/getLastOrNull"
import * as getOrElseModule                                                                                                                                                                                                              from "../src/method/getOrElse"
import {getOrElse, getOrElseByArray, getOrElseByCollectionHolder, getOrElseByMinimalistCollectionHolder}                                                                                                                                 from "../src/method/getOrElse"
import * as getOrNullModule                                                                                                                                                                                                              from "../src/method/getOrNull"
import {getOrNull, getOrNullByArray, getOrNullByCollectionHolder, getOrNullByMinimalistCollectionHolder}                                                                                                                                 from "../src/method/getOrNull"
import * as hasModule                                                                                                                                                                                                                    from "../src/method/has"
import {has, hasByArray, hasByCollectionHolder, hasByMinimalistCollectionHolder}                                                                                                                                                         from "../src/method/has"
import * as hasAllModule                                                                                                                                                                                                                 from "../src/method/hasAll"
import {hasAll, hasAllByArray, hasAllByCollectionHolder, hasAllByMinimalistCollectionHolder}                                                                                                                                             from "../src/method/hasAll"
import * as hasAllWithArrayModule                                                                                                                                                                                                        from "../src/method/hasAll.withArray"
import {hasAllWithArray, hasAllWithArrayByArray, hasAllWithArrayByCollectionHolder, hasAllWithArrayByMinimalistCollectionHolder}                                                                                                         from "../src/method/hasAll.withArray"
import * as hasAllWithCollectionHolderModule                                                                                                                                                                                             from "../src/method/hasAll.withCollectionHolder"
import {hasAllWithCollectionHolder, hasAllWithCollectionHolderByArray, hasAllWithCollectionHolderByCollectionHolder, hasAllWithCollectionHolderByMinimalistCollectionHolder}                                                             from "../src/method/hasAll.withCollectionHolder"
import * as hasAllWithCollectionIteratorModule                                                                                                                                                                                           from "../src/method/hasAll.withCollectionIterator"
import {hasAllWithCollectionIterator, hasAllWithCollectionIteratorByArray, hasAllWithCollectionIteratorByCollectionHolder, hasAllWithCollectionIteratorByMinimalistCollectionHolder}                                                     from "../src/method/hasAll.withCollectionIterator"
import * as hasAllWithIterableModule                                                                                                                                                                                                     from "../src/method/hasAll.withIterable"
import {hasAllWithIterable, hasAllWithIterableByArray, hasAllWithIterableByCollectionHolder, hasAllWithIterableByMinimalistCollectionHolder}                                                                                             from "../src/method/hasAll.withIterable"
import * as hasAllWithMinimalistCollectionHolderModule                                                                                                                                                                                   from "../src/method/hasAll.withMinimalistCollectionHolder"
import {hasAllWithMinimalistCollectionHolder, hasAllWithMinimalistCollectionHolderByArray, hasAllWithMinimalistCollectionHolderByCollectionHolder, hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder}                     from "../src/method/hasAll.withMinimalistCollectionHolder"
import * as hasAllWithSetModule                                                                                                                                                                                                          from "../src/method/hasAll.withSet"
import {hasAllWithSet, hasAllWithSetByArray, hasAllWithSetByCollectionHolder, hasAllWithSetByMinimalistCollectionHolder}                                                                                                                 from "../src/method/hasAll.withSet"
import * as hasDuplicateModule                                                                                                                                                                                                           from "../src/method/hasDuplicate"
import {hasDuplicate, hasDuplicateByArray, hasDuplicateByCollectionHolder, hasDuplicateByMinimalistCollectionHolder}                                                                                                                     from "../src/method/hasDuplicate"
import * as hasNullModule                                                                                                                                                                                                                from "../src/method/hasNull"
import {hasNull, hasNullByArray, hasNullByCollectionHolder, hasNullByMinimalistCollectionHolder}                                                                                                                                         from "../src/method/hasNull"
import * as hasOneModule                                                                                                                                                                                                                 from "../src/method/hasOne"
import {hasOne, hasOneByArray, hasOneByCollectionHolder, hasOneByMinimalistCollectionHolder}                                                                                                                                             from "../src/method/hasOne"
import * as hasOneWithArrayModule                                                                                                                                                                                                        from "../src/method/hasOne.withArray"
import {hasOneWithArray, hasOneWithArrayByArray, hasOneWithArrayByCollectionHolder, hasOneWithArrayByMinimalistCollectionHolder}                                                                                                         from "../src/method/hasOne.withArray"
import * as hasOneWithCollectionHolderModule                                                                                                                                                                                             from "../src/method/hasOne.withCollectionHolder"
import {hasOneWithCollectionHolder, hasOneWithCollectionHolderByArray, hasOneWithCollectionHolderByCollectionHolder, hasOneWithCollectionHolderByMinimalistCollectionHolder}                                                             from "../src/method/hasOne.withCollectionHolder"
import * as hasOneWithCollectionIteratorModule                                                                                                                                                                                           from "../src/method/hasOne.withCollectionIterator"
import {hasOneWithCollectionIterator, hasOneWithCollectionIteratorByArray, hasOneWithCollectionIteratorByCollectionHolder, hasOneWithCollectionIteratorByMinimalistCollectionHolder}                                                     from "../src/method/hasOne.withCollectionIterator"
import * as hasOneWithIterableModule                                                                                                                                                                                                     from "../src/method/hasOne.withIterable"
import {hasOneWithIterable, hasOneWithIterableByArray, hasOneWithIterableByCollectionHolder, hasOneWithIterableByMinimalistCollectionHolder}                                                                                             from "../src/method/hasOne.withIterable"
import * as hasOneWithMinimalistCollectionHolderModule                                                                                                                                                                                   from "../src/method/hasOne.withMinimalistCollectionHolder"
import {hasOneWithMinimalistCollectionHolder, hasOneWithMinimalistCollectionHolderByArray, hasOneWithMinimalistCollectionHolderByCollectionHolder, hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder}                     from "../src/method/hasOne.withMinimalistCollectionHolder"
import * as hasOneWithSetModule                                                                                                                                                                                                          from "../src/method/hasOne.withSet"
import {hasOneWithSet, hasOneWithSetByArray, hasOneWithSetByCollectionHolder, hasOneWithSetByMinimalistCollectionHolder}                                                                                                                 from "../src/method/hasOne.withSet"
import {includes, includesByArray, includesByCollectionHolder, includesByMinimalistCollectionHolder}                                                                                                                                     from "../src/method/includes"
import {includesAll, includesAllByArray, includesAllByCollectionHolder, includesAllByMinimalistCollectionHolder}                                                                                                                         from "../src/method/includesAll"
import {includesAllWithArray, includesAllWithArrayByArray, includesAllWithArrayByCollectionHolder, includesAllWithArrayByMinimalistCollectionHolder}                                                                                     from "../src/method/includesAll.withArray"
import {includesAllWithCollectionHolder, includesAllWithCollectionHolderByArray, includesAllWithCollectionHolderByCollectionHolder, includesAllWithCollectionHolderByMinimalistCollectionHolder}                                         from "../src/method/includesAll.withCollectionHolder"
import {includesAllWithCollectionIterator, includesAllWithCollectionIteratorByArray, includesAllWithCollectionIteratorByCollectionHolder, includesAllWithCollectionIteratorByMinimalistCollectionHolder}                                 from "../src/method/includesAll.withCollectionIterator"
import {includesAllWithIterable, includesAllWithIterableByArray, includesAllWithIterableByCollectionHolder, includesAllWithIterableByMinimalistCollectionHolder}                                                                         from "../src/method/includesAll.withIterable"
import {includesAllWithMinimalistCollectionHolder, includesAllWithMinimalistCollectionHolderByArray, includesAllWithMinimalistCollectionHolderByCollectionHolder, includesAllWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "../src/method/includesAll.withMinimalistCollectionHolder"
import {includesAllWithSet, includesAllWithSetByArray, includesAllWithSetByCollectionHolder, includesAllWithSetByMinimalistCollectionHolder}                                                                                             from "../src/method/includesAll.withSet"
import {includesDuplicate, includesDuplicateByArray, includesDuplicateByCollectionHolder, includesDuplicateByMinimalistCollectionHolder}                                                                                                 from "../src/method/includesDuplicate"
import {includesNull, includesNullByArray, includesNullByCollectionHolder, includesNullByMinimalistCollectionHolder}                                                                                                                     from "../src/method/includesNull"
import {includesOne, includesOneByArray, includesOneByCollectionHolder, includesOneByMinimalistCollectionHolder}                                                                                                                         from "../src/method/includesOne"
import {includesOneWithArray, includesOneWithArrayByArray, includesOneWithArrayByCollectionHolder, includesOneWithArrayByMinimalistCollectionHolder}                                                                                     from "../src/method/includesOne.withArray"
import {includesOneWithCollectionHolder, includesOneWithCollectionHolderByArray, includesOneWithCollectionHolderByCollectionHolder, includesOneWithCollectionHolderByMinimalistCollectionHolder}                                         from "../src/method/includesOne.withCollectionHolder"
import {includesOneWithCollectionIterator, includesOneWithCollectionIteratorByArray, includesOneWithCollectionIteratorByCollectionHolder, includesOneWithCollectionIteratorByMinimalistCollectionHolder}                                 from "../src/method/includesOne.withCollectionIterator"
import {includesOneWithIterable, includesOneWithIterableByArray, includesOneWithIterableByCollectionHolder, includesOneWithIterableByMinimalistCollectionHolder}                                                                         from "../src/method/includesOne.withIterable"
import {includesOneWithMinimalistCollectionHolder, includesOneWithMinimalistCollectionHolderByArray, includesOneWithMinimalistCollectionHolderByCollectionHolder, includesOneWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "../src/method/includesOne.withMinimalistCollectionHolder"
import {includesOneWithSet, includesOneWithSetByArray, includesOneWithSetByCollectionHolder, includesOneWithSetByMinimalistCollectionHolder}                                                                                             from "../src/method/includesOne.withSet"
import {indexOf, indexOfByArray, indexOfByCollectionHolder, indexOfByMinimalistCollectionHolder}                                                                                                                                         from "../src/method/indexOf"
import * as indexOfFirstModule                                                                                                                                                                                                           from "../src/method/indexOfFirst"
import {indexOfFirst, indexOfFirstByArray, indexOfFirstByCollectionHolder, indexOfFirstByMinimalistCollectionHolder}                                                                                                                     from "../src/method/indexOfFirst"
import * as indexOfFirstIndexedModule                                                                                                                                                                                                    from "../src/method/indexOfFirstIndexed"
import {indexOfFirstIndexed, indexOfFirstIndexedByArray, indexOfFirstIndexedByCollectionHolder, indexOfFirstIndexedByMinimalistCollectionHolder}                                                                                         from "../src/method/indexOfFirstIndexed"
import * as indexOfFirstIndexedOrNullModule                                                                                                                                                                                              from "../src/method/indexOfFirstIndexedOrNull"
import {indexOfFirstIndexedOrNull, indexOfFirstIndexedOrNullByArray, indexOfFirstIndexedOrNullByCollectionHolder, indexOfFirstIndexedOrNullByMinimalistCollectionHolder}                                                                 from "../src/method/indexOfFirstIndexedOrNull"
import * as indexOfFirstOrNullModule                                                                                                                                                                                                     from "../src/method/indexOfFirstOrNull"
import {indexOfFirstOrNull, indexOfFirstOrNullByArray, indexOfFirstOrNullByCollectionHolder, indexOfFirstOrNullByMinimalistCollectionHolder}                                                                                             from "../src/method/indexOfFirstOrNull"
import * as indexOfLastModule                                                                                                                                                                                                            from "../src/method/indexOfLast"
import {indexOfLast, indexOfLastByArray, indexOfLastByCollectionHolder, indexOfLastByMinimalistCollectionHolder}                                                                                                                         from "../src/method/indexOfLast"
import * as indexOfLastIndexedModule                                                                                                                                                                                                     from "../src/method/indexOfLastIndexed"
import {indexOfLastIndexed, indexOfLastIndexedByArray, indexOfLastIndexedByCollectionHolder, indexOfLastIndexedByMinimalistCollectionHolder}                                                                                             from "../src/method/indexOfLastIndexed"
import * as indexOfLastIndexedOrNullModule                                                                                                                                                                                               from "../src/method/indexOfLastIndexedOrNull"
import {indexOfLastIndexedOrNull, indexOfLastIndexedOrNullByArray, indexOfLastIndexedOrNullByCollectionHolder, indexOfLastIndexedOrNullByMinimalistCollectionHolder}                                                                     from "../src/method/indexOfLastIndexedOrNull"
import * as indexOfLastOrNullModule                                                                                                                                                                                                      from "../src/method/indexOfLastOrNull"
import {indexOfLastOrNull, indexOfLastOrNullByArray, indexOfLastOrNullByCollectionHolder, indexOfLastOrNullByMinimalistCollectionHolder}                                                                                                 from "../src/method/indexOfLastOrNull"
import {isArray}                                                                                                                                                                                                                         from "../src/method/isArray"
import {isArrayByStructure}                                                                                                                                                                                                              from "../src/method/isArrayByStructure"
import {isBigInt64Array}                                                                                                                                                                                                                 from "../src/method/isBigInt64Array"
import {isBigUint64Array}                                                                                                                                                                                                                from "../src/method/isBigUint64Array"
import {isCollectionHolder}                                                                                                                                                                                                              from "../src/method/isCollectionHolder"
import {isCollectionHolderByStructure}                                                                                                                                                                                                   from "../src/method/isCollectionHolderByStructure"
import {isCollectionIterator}                                                                                                                                                                                                            from "../src/method/isCollectionIterator"
import {isCollectionIteratorByStructure}                                                                                                                                                                                                 from "../src/method/isCollectionIteratorByStructure"
import {isEmpty, isEmptyByArray, isEmptyByCollectionHolder, isEmptyByMinimalistCollectionHolder}                                                                                                                                         from "../src/method/isEmpty"
import {isFloat32Array}                                                                                                                                                                                                                  from "../src/method/isFloat32Array"
import {isFloat64Array}                                                                                                                                                                                                                  from "../src/method/isFloat64Array"
import {isInt8Array}                                                                                                                                                                                                                     from "../src/method/isInt8Array"
import {isInt16Array}                                                                                                                                                                                                                    from "../src/method/isInt16Array"
import {isInt32Array}                                                                                                                                                                                                                    from "../src/method/isInt32Array"
import {isIterator}                                                                                                                                                                                                                      from "../src/method/isIterator"
import {isMinimalistCollectionHolder}                                                                                                                                                                                                    from "../src/method/isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure}                                                                                                                                                                                         from "../src/method/isMinimalistCollectionHolderByStructure"
import {isNotEmpty, isNotEmptyByArray, isNotEmptyByCollectionHolder, isNotEmptyByMinimalistCollectionHolder}                                                                                                                             from "../src/method/isNotEmpty"
import {isSet}                                                                                                                                                                                                                           from "../src/method/isSet"
import {isSetByStructure}                                                                                                                                                                                                                from "../src/method/isSetByStructure"
import {isTypedArray}                                                                                                                                                                                                                    from "../src/method/isTypedArray"
import {isTypedArrayByStructure}                                                                                                                                                                                                         from "../src/method/isTypedArrayByStructure"
import {isUint8Array}                                                                                                                                                                                                                    from "../src/method/isUint8Array"
import {isUint8ClampedArray}                                                                                                                                                                                                             from "../src/method/isUint8ClampedArray"
import {isUint16Array}                                                                                                                                                                                                                   from "../src/method/isUint16Array"
import {isUint32Array}                                                                                                                                                                                                                   from "../src/method/isUint32Array"
import {isWeakSet}                                                                                                                                                                                                                       from "../src/method/isWeakSet"
import {isWeakSetByStructure}                                                                                                                                                                                                            from "../src/method/isWeakSetByStructure"
import {join, joinByArray, joinByCollectionHolder, joinByMinimalistCollectionHolder}                                                                                                                                                     from "../src/method/join"
import * as joinToStringModule                                                                                                                                                                                                           from "../src/method/joinToString"
import {joinToString, joinToStringByArray, joinToStringByCollectionHolder, joinToStringByMinimalistCollectionHolder}                                                                                                                     from "../src/method/joinToString"
import {last, lastByArray, lastByCollectionHolder, lastByMinimalistCollectionHolder}                                                                                                                                                     from "../src/method/last"
import {lastIndexed, lastIndexedByArray, lastIndexedByCollectionHolder, lastIndexedByMinimalistCollectionHolder}                                                                                                                         from "../src/method/lastIndexed"
import {lastIndexedOrNull, lastIndexedOrNullByArray, lastIndexedOrNullByCollectionHolder, lastIndexedOrNullByMinimalistCollectionHolder}                                                                                                 from "../src/method/lastIndexedOrNull"
import {lastIndexOf, lastIndexOfByArray, lastIndexOfByCollectionHolder, lastIndexOfByMinimalistCollectionHolder}                                                                                                                         from "../src/method/lastIndexOf"
import {lastIndexOfOrNull, lastIndexOfOrNullByArray, lastIndexOfOrNullByCollectionHolder, lastIndexOfOrNullByMinimalistCollectionHolder}                                                                                                 from "../src/method/lastIndexOfOrNull"
import {lastOrNull, lastOrNullByArray, lastOrNullByCollectionHolder, lastOrNullByMinimalistCollectionHolder}                                                                                                                             from "../src/method/lastOrNull"
import {limit, limitByArray, limitByCollectionHolder, limitByMinimalistCollectionHolder}                                                                                                                                                 from "../src/method/limit"
import {limitLast, limitLastByArray, limitLastByCollectionHolder, limitLastByMinimalistCollectionHolder}                                                                                                                                 from "../src/method/limitLast"
import {limitLastWhile, limitLastWhileByArray, limitLastWhileByCollectionHolder, limitLastWhileByMinimalistCollectionHolder}                                                                                                             from "../src/method/limitLastWhile"
import {limitLastWhileIndexed, limitLastWhileIndexedByArray, limitLastWhileIndexedByCollectionHolder, limitLastWhileIndexedByMinimalistCollectionHolder}                                                                                 from "../src/method/limitLastWhileIndexed"
import {limitWhile, limitWhileByArray, limitWhileByCollectionHolder, limitWhileByMinimalistCollectionHolder}                                                                                                                             from "../src/method/limitWhile"
import {limitWhileIndexed, limitWhileIndexedByArray, limitWhileIndexedByCollectionHolder, limitWhileIndexedByMinimalistCollectionHolder}                                                                                                 from "../src/method/limitWhileIndexed"
import {map, mapByArray, mapByCollectionHolder, mapByMinimalistCollectionHolder}                                                                                                                                                         from "../src/method/map"
import {mapIndexed, mapIndexedByArray, mapIndexedByCollectionHolder, mapIndexedByMinimalistCollectionHolder}                                                                                                                             from "../src/method/mapIndexed"
import {mapNotNull, mapNotNullByArray, mapNotNullByCollectionHolder, mapNotNullByMinimalistCollectionHolder}                                                                                                                             from "../src/method/mapNotNull"
import {mapNotNullIndexed, mapNotNullIndexedByArray, mapNotNullIndexedByCollectionHolder, mapNotNullIndexedByMinimalistCollectionHolder}                                                                                                 from "../src/method/mapNotNullIndexed"
import {none, noneByArray, noneByCollectionHolder, noneByMinimalistCollectionHolder}                                                                                                                                                     from "../src/method/none"
import {onEach, onEachByArray, onEachByCollectionHolder, onEachByMinimalistCollectionHolder}                                                                                                                                             from "../src/method/onEach"
import {onEachIndexed, onEachIndexedByArray, onEachIndexedByCollectionHolder, onEachIndexedByMinimalistCollectionHolder}                                                                                                                 from "../src/method/onEachIndexed"
import {requireNoNulls, requireNoNullsByArray, requireNoNullsByCollectionHolder, requireNoNullsByMinimalistCollectionHolder}                                                                                                             from "../src/method/requireNoNulls"
import {reversed, reversedByArray, reversedByCollectionHolder, reversedByMinimalistCollectionHolder}                                                                                                                                     from "../src/method/reversed"
import {skip, skipByArray, skipByCollectionHolder, skipByMinimalistCollectionHolder}                                                                                                                                                     from "../src/method/skip"
import {skipLast, skipLastByArray, skipLastByCollectionHolder, skipLastByMinimalistCollectionHolder}                                                                                                                                     from "../src/method/skipLast"
import {skipLastWhile, skipLastWhileByArray, skipLastWhileByCollectionHolder, skipLastWhileByMinimalistCollectionHolder}                                                                                                                 from "../src/method/skipLastWhile"
import {skipLastWhileIndexed, skipLastWhileIndexedByArray, skipLastWhileIndexedByCollectionHolder, skipLastWhileIndexedByMinimalistCollectionHolder}                                                                                     from "../src/method/skipLastWhileIndexed"
import {skipWhile, skipWhileByArray, skipWhileByCollectionHolder, skipWhileByMinimalistCollectionHolder}                                                                                                                                 from "../src/method/skipWhile"
import {skipWhileIndexed, skipWhileIndexedByArray, skipWhileIndexedByCollectionHolder, skipWhileIndexedByMinimalistCollectionHolder}                                                                                                     from "../src/method/skipWhileIndexed"
import {slice, sliceByArray, sliceByCollectionHolder, sliceByMinimalistCollectionHolder}                                                                                                                                                 from "../src/method/slice"
import {sliceWithARange, sliceWithARangeByArray, sliceWithARangeByCollectionHolder, sliceWithARangeByMinimalistCollectionHolder}                                                                                                         from "../src/method/slice.withARange"
import {sliceWithArray, sliceWithArrayByArray, sliceWithArrayByCollectionHolder, sliceWithArrayByMinimalistCollectionHolder}                                                                                                             from "../src/method/slice.withArray"
import {sliceWithCollectionHolder, sliceWithCollectionHolderByArray, sliceWithCollectionHolderByCollectionHolder, sliceWithCollectionHolderByMinimalistCollectionHolder}                                                                 from "../src/method/slice.withCollectionHolder"
import {sliceWithCollectionIterator, sliceWithCollectionIteratorByArray, sliceWithCollectionIteratorByCollectionHolder, sliceWithCollectionIteratorByMinimalistCollectionHolder}                                                         from "../src/method/slice.withCollectionIterator"
import {sliceWithIterable, sliceWithIterableByArray, sliceWithIterableByCollectionHolder, sliceWithIterableByMinimalistCollectionHolder}                                                                                                 from "../src/method/slice.withIterable"
import {sliceWithMinimalistCollectionHolder, sliceWithMinimalistCollectionHolderByArray, sliceWithMinimalistCollectionHolderByCollectionHolder, sliceWithMinimalistCollectionHolderByMinimalistCollectionHolder}                         from "../src/method/slice.withMinimalistCollectionHolder"
import {sliceWithSet, sliceWithSetByArray, sliceWithSetByCollectionHolder, sliceWithSetByMinimalistCollectionHolder}                                                                                                                     from "../src/method/slice.withSet"
import {some, someByArray, someByCollectionHolder, someByMinimalistCollectionHolder}                                                                                                                                                     from "../src/method/some"
import * as takeModule                                                                                                                                                                                                                   from "../src/method/take"
import {take, takeByArray, takeByCollectionHolder, takeByMinimalistCollectionHolder}                                                                                                                                                     from "../src/method/take"
import * as takeLastModule                                                                                                                                                                                                               from "../src/method/takeLast"
import {takeLast, takeLastByArray, takeLastByCollectionHolder, takeLastByMinimalistCollectionHolder}                                                                                                                                     from "../src/method/takeLast"
import * as takeLastWhileModule                                                                                                                                                                                                          from "../src/method/takeLastWhile"
import {takeLastWhile, takeLastWhileByArray, takeLastWhileByCollectionHolder, takeLastWhileByMinimalistCollectionHolder}                                                                                                                 from "../src/method/takeLastWhile"
import * as takeLastWhileIndexedModule                                                                                                                                                                                                   from "../src/method/takeLastWhileIndexed"
import {takeLastWhileIndexed, takeLastWhileIndexedByArray, takeLastWhileIndexedByCollectionHolder, takeLastWhileIndexedByMinimalistCollectionHolder}                                                                                     from "../src/method/takeLastWhileIndexed"
import * as takeWhileModule                                                                                                                                                                                                              from "../src/method/takeWhile"
import {takeWhile, takeWhileByArray, takeWhileByCollectionHolder, takeWhileByMinimalistCollectionHolder}                                                                                                                                 from "../src/method/takeWhile"
import * as takeWhileIndexedModule                                                                                                                                                                                                       from "../src/method/takeWhileIndexed"
import {takeWhileIndexed, takeWhileIndexedByArray, takeWhileIndexedByCollectionHolder, takeWhileIndexedByMinimalistCollectionHolder}                                                                                                     from "../src/method/takeWhileIndexed"
import {toArray, toArrayByArray, toArrayByCollectionHolder, toArrayByMinimalistCollectionHolder}                                                                                                                                         from "../src/method/toArray"
import {toIterator, toIteratorByArray, toIteratorByCollectionHolder, toIteratorByMinimalistCollectionHolder}                                                                                                                             from "../src/method/toIterator"
import {toLocaleLowerCaseString, toLocaleLowerCaseStringByArray, toLocaleLowerCaseStringByCollectionHolder, toLocaleLowerCaseStringByMinimalistCollectionHolder}                                                                         from "../src/method/toLocaleLowerCaseString"
import {toLocaleString, toLocaleStringByArray, toLocaleStringByCollectionHolder, toLocaleStringByMinimalistCollectionHolder}                                                                                                             from "../src/method/toLocaleString"
import {toLocaleUpperCaseString, toLocaleUpperCaseStringByArray, toLocaleUpperCaseStringByCollectionHolder, toLocaleUpperCaseStringByMinimalistCollectionHolder}                                                                         from "../src/method/toLocaleUpperCaseString"
import {toLowerCaseString, toLowerCaseStringByArray, toLowerCaseStringByCollectionHolder, toLowerCaseStringByMinimalistCollectionHolder}                                                                                                 from "../src/method/toLowerCaseString"
import {toMap, toMapByArray, toMapByCollectionHolder, toMapByMinimalistCollectionHolder}                                                                                                                                                 from "../src/method/toMap"
import {toMutableArray, toMutableArrayByArray, toMutableArrayByCollectionHolder, toMutableArrayByMinimalistCollectionHolder}                                                                                                             from "../src/method/toMutableArray"
import {toMutableMap, toMutableMapByArray, toMutableMapByCollectionHolder, toMutableMapByMinimalistCollectionHolder}                                                                                                                     from "../src/method/toMutableMap"
import {toMutableSet, toMutableSetByArray, toMutableSetByCollectionHolder, toMutableSetByMinimalistCollectionHolder}                                                                                                                     from "../src/method/toMutableSet"
import {toMutableWeakSet, toMutableWeakSetByArray, toMutableWeakSetByCollectionHolder, toMutableWeakSetByMinimalistCollectionHolder}                                                                                                     from "../src/method/toMutableWeakSet"
import * as toReverseModule                                                                                                                                                                                                              from "../src/method/toReverse"
import {toReverse, toReverseByArray, toReverseByCollectionHolder, toReverseByMinimalistCollectionHolder}                                                                                                                                 from "../src/method/toReverse"
import {toReversed, toReversedByArray, toReversedByCollectionHolder, toReversedByMinimalistCollectionHolder}                                                                                                                             from "../src/method/toReversed"
import {toSet, toSetByArray, toSetByCollectionHolder, toSetByMinimalistCollectionHolder}                                                                                                                                                 from "../src/method/toSet"
import {toString, toStringByArray, toStringByCollectionHolder, toStringByMinimalistCollectionHolder}                                                                                                                                     from "../src/method/toString"
import {toUpperCaseString, toUpperCaseStringByArray, toUpperCaseStringByCollectionHolder, toUpperCaseStringByMinimalistCollectionHolder}                                                                                                 from "../src/method/toUpperCaseString"
import {toWeakSet, toWeakSetByArray, toWeakSetByCollectionHolder, toWeakSetByMinimalistCollectionHolder}                                                                                                                                 from "../src/method/toWeakSet"

describe("CollectionHolderTest (functions)", () => {
    const symbol = Symbol()
    const callback = () => symbol
    const everyEmptyInstances = [
        new Holder(EMPTY,                                           "array",),
        new Holder(new Set(EMPTY,),                                 "set",),
        new Holder(new CollectionHolderFromArray(EMPTY,),           "collection holder",),
        new Holder(new MinimalistCollectionHolderFromArray(EMPTY,), "minimalist collection holder",),
        new Holder(new MinimalistCollectionHolderFromArray(EMPTY,), "minimalist collection holder",),
        new Holder(new CollectionIteratorFromArray(EMPTY,),         "collection iterator",),
        new Holder(new IterableForTest(EMPTY,),                     "iterable",),
    ] as const satisfies readonly Holder<PossibleIterableArraySetOrCollectionHolder<"">, string>[]
    const everyNonEmptyInstances = [
        new Holder(A,                                           "array",),
        new Holder(new Set(A,),                                 "set",),
        new Holder(new CollectionHolderFromArray(A,),           "collection holder",),
        new Holder(new MinimalistCollectionHolderFromArray(A,), "minimalist collection holder",),
        new Holder(new MinimalistCollectionHolderFromArray(A,), "minimalist collection holder",),
        new Holder(new CollectionIteratorFromArray(A,),         "collection iterator",),
        new Holder(new IterableForTest(A,),                     "iterable",),
    ] as const satisfies readonly Holder<PossibleIterableArraySetOrCollectionHolder<'a'>, string>[]

    describe.each(NULL_UNDEFINED,)("%s", it => {
        describe("isEmpty", () => {
            test("all",                          () => expect(isEmpty(it,),).toBeTrue(),)
            test("minimalist collection holder", () => expect(isEmptyByMinimalistCollectionHolder(it,),).toBeTrue(),)
            test("collection holder",            () => expect(isEmptyByCollectionHolder(it,),).toBeTrue(),)
            test("array",                        () => expect(isEmptyByArray(it,),).toBeTrue(),)
        },)
        describe("isNotEmpty", () => {
            test("all",                          () => expect(isNotEmpty(it,),).toBeFalse(),)
            test("minimalist collection holder", () => expect(isNotEmptyByMinimalistCollectionHolder(it,),).toBeFalse(),)
            test("collection holder",            () => expect(isNotEmptyByCollectionHolder(it,),).toBeFalse(),)
            test("array",                        () => expect(isNotEmptyByArray(it,),).toBeFalse(),)
        },)

        describe("getFirst", () => {
            test("all",                          () => expect(() => getFirst(it,),).toThrow(NullCollectionException,),)
            test("minimalist collection holder", () => expect(() => getFirstByMinimalistCollectionHolder(it,),).toThrow(NullCollectionException,),)
            test("collection holder",            () => expect(() => getFirstByCollectionHolder(it,),).toThrow(NullCollectionException,),)
            test("array",                        () => expect(() => getFirstByArray(it,),).toThrow(NullCollectionException,),)
        },)
        describe("getOrElse", () => {
            test("all",                          () => expect(getOrElse(it, NaN, callback,) === symbol,).toBeTrue(),)
            test("minimalist collection holder", () => expect(getOrElseByMinimalistCollectionHolder(it, NaN, callback,) === symbol,).toBeTrue(),)
            test("collection holder",            () => expect(getOrElseByCollectionHolder(it, NaN, callback,) === symbol,).toBeTrue(),)
            test("array",                        () => expect(getOrElseByArray(it, NaN, callback,) === symbol,).toBeTrue(),)
        },)
        describe("getOrNull", () => {
            test("all",                          () => expect(getOrNull(it, NaN,),).toBeNull(),)
            test("minimalist collection holder", () => expect(getOrNullByMinimalistCollectionHolder(it, NaN,),).toBeNull(),)
            test("collection holder",            () => expect(getOrNullByCollectionHolder(it, NaN,),).toBeNull(),)
            test("array",                        () => expect(getOrNullByArray(it, NaN,),).toBeNull(),)
        },)
        describe("getFirstOrNull", () => {
            test("all",                          () => expect(getFirstOrNull(it,),).toBeNull(),)
            test("minimalist collection holder", () => expect(getFirstOrNullByMinimalistCollectionHolder(it,),).toBeNull(),)
            test("collection holder",            () => expect(getFirstOrNullByCollectionHolder(it,),).toBeNull(),)
            test("array",                        () => expect(getFirstOrNullByArray(it,),).toBeNull(),)
        },)
        describe("getLast", () => {
            test("all",                          () => expect(() => getLast(it,),).toThrow(NullCollectionException,),)
            test("minimalist collection holder", () => expect(() => getLastByMinimalistCollectionHolder(it,),).toThrow(NullCollectionException,),)
            test("collection holder",            () => expect(() => getLastByCollectionHolder(it,),).toThrow(NullCollectionException,),)
            test("array",                        () => expect(() => getLastByArray(it,),).toThrow(NullCollectionException,),)
        },)
        describe("getLastOrNull", () => {
            test("all",                          () => expect(getLastOrNull(it,),).toBeNull(),)
            test("minimalist collection holder", () => expect(getLastOrNullByMinimalistCollectionHolder(it,),).toBeNull(),)
            test("collection holder",            () => expect(getLastOrNullByCollectionHolder(it,),).toBeNull(),)
            test("array",                        () => expect(getLastOrNullByArray(it,),).toBeNull(),)
        },)
        describe("findFirst", () => {
            test("all",                          () => expect(() => findFirst(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("minimalist collection holder", () => expect(() => findFirstByMinimalistCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("collection holder",            () => expect(() => findFirstByCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("array",                        () => expect(() => findFirstByArray(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
        },)
        describe("findFirstOrNull", () => {
            test("all",                          () => expect(findFirstOrNull(it, callbackAsFail0,),).toBeNull(),)
            test("minimalist collection holder", () => expect(findFirstOrNullByMinimalistCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("collection holder",            () => expect(findFirstOrNullByCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("array",                        () => expect(findFirstOrNullByArray(it, callbackAsFail0,),).toBeNull(),)
        },)
        describe("findFirstIndexed", () => {
            test("all",                          () => expect(() => findFirstIndexed(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("minimalist collection holder", () => expect(() => findFirstIndexedByMinimalistCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("collection holder",            () => expect(() => findFirstIndexedByCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("array",                        () => expect(() => findFirstIndexedByArray(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
        },)
        describe("findFirstIndexedOrNull", () => {
            test("all",                          () => expect(findFirstIndexedOrNull(it, callbackAsFail0,),).toBeNull(),)
            test("minimalist collection holder", () => expect(findFirstIndexedOrNullByMinimalistCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("collection holder",            () => expect(findFirstIndexedOrNullByCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("array",                        () => expect(findFirstIndexedOrNullByArray(it, callbackAsFail0,),).toBeNull(),)
        },)
        describe("findLast", () => {
            test("all",                          () => expect(() => findLast(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("minimalist collection holder", () => expect(() => findLastByMinimalistCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("collection holder",            () => expect(() => findLastByCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("array",                        () => expect(() => findLastByArray(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
        },)
        describe("findLastOrNull", () => {
            test("all",                          () => expect(findLastOrNull(it, callbackAsFail0,),).toBeNull(),)
            test("minimalist collection holder", () => expect(findLastOrNullByMinimalistCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("collection holder",            () => expect(findLastOrNullByCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("array",                        () => expect(findLastOrNullByArray(it, callbackAsFail0,),).toBeNull(),)
        },)
        describe("findLastIndexed", () => {
            test("all",                          () => expect(() => findLastIndexed(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("minimalist collection holder", () => expect(() => findLastIndexedByMinimalistCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("collection holder",            () => expect(() => findLastIndexedByCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("array",                        () => expect(() => findLastIndexedByArray(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
        },)
        describe("findLastIndexedOrNull", () => {
            test("all",                          () => expect(findLastIndexedOrNull(it, callbackAsFail0,),).toBeNull(),)
            test("minimalist collection holder", () => expect(findLastIndexedOrNullByMinimalistCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("collection holder",            () => expect(findLastIndexedOrNullByCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("array",                        () => expect(findLastIndexedOrNullByArray(it, callbackAsFail0,),).toBeNull(),)
        },)

        describe("firstIndexOf", () => {
            test("all",                          () => expect(() => firstIndexOf(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("minimalist collection holder", () => expect(() => firstIndexOfByMinimalistCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("collection holder",            () => expect(() => firstIndexOfByCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("array",                        () => expect(() => firstIndexOfByArray(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
        },)
        describe("firstIndexOfOrNull", () => {
            test("all",                          () => expect(firstIndexOfOrNull(it, callbackAsFail0,),).toBeNull(),)
            test("minimalist collection holder", () => expect(firstIndexOfOrNullByMinimalistCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("collection holder",            () => expect(firstIndexOfOrNullByCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("array",                        () => expect(firstIndexOfOrNullByArray(it, callbackAsFail0,),).toBeNull(),)
        },)
        describe("lastIndexOf", () => {
            test("all",                          () => expect(() => lastIndexOf(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("minimalist collection holder", () => expect(() => lastIndexOfByMinimalistCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("collection holder",            () => expect(() => lastIndexOfByCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("array",                        () => expect(() => lastIndexOfByArray(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
        },)
        describe("lastIndexOfOrNull", () => {
            test("all",                          () => expect(lastIndexOfOrNull(it, callbackAsFail0,),).toBeNull(),)
            test("minimalist collection holder", () => expect(lastIndexOfOrNullByMinimalistCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("collection holder",            () => expect(lastIndexOfOrNullByCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("array",                        () => expect(lastIndexOfOrNullByArray(it, callbackAsFail0,),).toBeNull(),)
        },)
        describe("indexOfFirst", () => {
            test("all",                          () => expect(() => indexOfFirst(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("minimalist collection holder", () => expect(() => indexOfFirstByMinimalistCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("collection holder",            () => expect(() => indexOfFirstByCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("array",                        () => expect(() => indexOfFirstByArray(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
        },)
        describe("indexOfFirstOrNull", () => {
            test("all",                          () => expect(indexOfFirstOrNull(it, callbackAsFail0,),).toBeNull(),)
            test("minimalist collection holder", () => expect(indexOfFirstOrNullByMinimalistCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("collection holder",            () => expect(indexOfFirstOrNullByCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("array",                        () => expect(indexOfFirstOrNullByArray(it, callbackAsFail0,),).toBeNull(),)
        },)
        describe("indexOfFirstIndexed", () => {
            test("all",                          () => expect(() => indexOfFirstIndexed(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("minimalist collection holder", () => expect(() => indexOfFirstIndexedByMinimalistCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("collection holder",            () => expect(() => indexOfFirstIndexedByCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("array",                        () => expect(() => indexOfFirstIndexedByArray(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
        },)
        describe("indexOfFirstIndexedOrNull", () => {
            test("all",                          () => expect(indexOfFirstIndexedOrNull(it, callbackAsFail0,),).toBeNull(),)
            test("minimalist collection holder", () => expect(indexOfFirstIndexedOrNullByMinimalistCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("collection holder",            () => expect(indexOfFirstIndexedOrNullByCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("array",                        () => expect(indexOfFirstIndexedOrNullByArray(it, callbackAsFail0,),).toBeNull(),)
        },)
        describe("indexOfLast", () => {
            test("all",                          () => expect(() => indexOfLast(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("minimalist collection holder", () => expect(() => indexOfLastByMinimalistCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("collection holder",            () => expect(() => indexOfLastByCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("array",                        () => expect(() => indexOfLastByArray(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
        },)
        describe("indexOfLastOrNull", () => {
            test("all",                          () => expect(indexOfLastOrNull(it, callbackAsFail0,),).toBeNull(),)
            test("minimalist collection holder", () => expect(indexOfLastOrNullByMinimalistCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("collection holder",            () => expect(indexOfLastOrNullByCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("array",                        () => expect(indexOfLastOrNullByArray(it, callbackAsFail0,),).toBeNull(),)
        },)
        describe("indexOfLastIndexed", () => {
            test("all",                          () => expect(() => indexOfLastIndexed(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("minimalist collection holder", () => expect(() => indexOfLastIndexedByMinimalistCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("collection holder",            () => expect(() => indexOfLastIndexedByCollectionHolder(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
            test("array",                        () => expect(() => indexOfLastIndexedByArray(it, callbackAsFail0,),).toThrow(NullCollectionException,),)
        },)
        describe("indexOfLastIndexedOrNull", () => {
            test("all",                          () => expect(indexOfLastIndexedOrNull(it, callbackAsFail0,),).toBeNull(),)
            test("minimalist collection holder", () => expect(indexOfLastIndexedOrNullByMinimalistCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("collection holder",            () => expect(indexOfLastIndexedOrNullByCollectionHolder(it, callbackAsFail0,),).toBeNull(),)
            test("array",                        () => expect(indexOfLastIndexedOrNullByArray(it, callbackAsFail0,),).toBeNull(),)
        },)

        describe("all", () => {
            test("all",                          () => expect(all(it, callbackAsFail0,),).toBeTrue(),)
            test("minimalist collection holder", () => expect(allByMinimalistCollectionHolder(it, callbackAsFail0,),).toBeTrue(),)
            test("collection holder",            () => expect(allByCollectionHolder(it, callbackAsFail0,),).toBeTrue(),)
            test("array",                        () => expect(allByArray(it, callbackAsFail0,),).toBeTrue(),)
        },)
        describe("any", () => {
            test("all",                          () => expect(any(it,),).toBeFalse(),)
            test("minimalist collection holder", () => expect(anyByMinimalistCollectionHolder(it,),).toBeFalse(),)
            test("collection holder",            () => expect(anyByCollectionHolder(it,),).toBeFalse(),)
            test("array",                        () => expect(anyByArray(it,),).toBeFalse(),)
        },)
        describe("none", () => {
            test("all",                          () => expect(none(it,),).toBeTrue(),)
            test("minimalist collection holder", () => expect(noneByMinimalistCollectionHolder(it,),).toBeTrue(),)
            test("collection holder",            () => expect(noneByCollectionHolder(it,),).toBeTrue(),)
            test("array",                        () => expect(noneByArray(it,),).toBeTrue(),)
        },)
        describe("hasNull", () => {
            test("all",                          () => expect(hasNull(it,),).toBeFalse(),)
            test("minimalist collection holder", () => expect(hasNullByMinimalistCollectionHolder(it,),).toBeFalse(),)
            test("collection holder",            () => expect(hasNullByCollectionHolder(it,),).toBeFalse(),)
            test("array",                        () => expect(hasNullByArray(it,),).toBeFalse(),)
        },)
        describe("hasDuplicate", () => {
            test("all",                          () => expect(hasDuplicate(it,),).toBeFalse(),)
            test("minimalist collection holder", () => expect(hasDuplicateByMinimalistCollectionHolder(it,),).toBeFalse(),)
            test("collection holder",            () => expect(hasDuplicateByCollectionHolder(it,),).toBeFalse(),)
            test("array",                        () => expect(hasDuplicateByArray(it,),).toBeFalse(),)
        },)
        describe("has", () => {
            test("all",                          () => expect(has(it, '',),).toBeFalse(),)
            test("minimalist collection holder", () => expect(hasByMinimalistCollectionHolder(it, '',),).toBeFalse(),)
            test("collection holder",            () => expect(hasByCollectionHolder(it, '',),).toBeFalse(),)
            test("array",                        () => expect(hasByArray(it, '',),).toBeFalse(),)
        },)
        describe("hasOne", () => {
            describe.each(everyEmptyInstances,)("%s (empty)", ({value,},) => {
                test("all",                          () => expect(hasOne(it, value,),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneByMinimalistCollectionHolder(it, value,),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneByCollectionHolder(it, value,),).toBeFalse(),)
                test("array",                        () => expect(hasOneByArray(it, value,),).toBeFalse(),)
            },)
            describe.each(everyNonEmptyInstances,)("%s (non-empty)", ({value,},) => {
                test("all",                          () => expect(hasOne(it, value,),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneByMinimalistCollectionHolder(it, value,),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneByCollectionHolder(it, value,),).toBeFalse(),)
                test("array",                        () => expect(hasOneByArray(it, value,),).toBeFalse(),)
            },)
        },)
        describe("hasOne (array)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasOneWithArray(it, EMPTY,),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithArrayByMinimalistCollectionHolder(it, EMPTY,),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithArrayByCollectionHolder(it, EMPTY,),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithArrayByArray(it, EMPTY,),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasOneWithArray(it, A,),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithArrayByMinimalistCollectionHolder(it, A,),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithArrayByCollectionHolder(it, A,),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithArrayByArray(it, A,),).toBeFalse(),)
            },)
        },)
        describe("hasOne (set)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasOneWithSet(it, new Set(),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithSetByMinimalistCollectionHolder(it, new Set(),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithSetByCollectionHolder(it, new Set(),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithSetByArray(it, new Set(),),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasOneWithSet(it, new Set(A,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithSetByMinimalistCollectionHolder(it, new Set(A,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithSetByCollectionHolder(it, new Set(A,),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithSetByArray(it, new Set(A,),),).toBeFalse(),)
            },)
        },)
        describe("hasOne (collection holder)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasOneWithCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithCollectionHolderByArray(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasOneWithCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithCollectionHolderByArray(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
            },)
        },)
        describe("hasOne (minimalist collection holder)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasOneWithMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithMinimalistCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithMinimalistCollectionHolderByArray(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasOneWithMinimalistCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithMinimalistCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithMinimalistCollectionHolderByArray(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
            },)
        },)
        describe("hasOne (collection iterator)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasOneWithCollectionIterator(it, new CollectionIteratorFromArray(EMPTY,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithCollectionIteratorByMinimalistCollectionHolder(it, new CollectionIteratorFromArray(EMPTY,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithCollectionIteratorByCollectionHolder(it, new CollectionIteratorFromArray(EMPTY,),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithCollectionIteratorByArray(it, new CollectionIteratorFromArray(EMPTY,),),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasOneWithCollectionIterator(it, new CollectionIteratorFromArray(A,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithCollectionIteratorByMinimalistCollectionHolder(it, new CollectionIteratorFromArray(A,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithCollectionIteratorByCollectionHolder(it, new CollectionIteratorFromArray(A,),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithCollectionIteratorByArray(it, new CollectionIteratorFromArray(A,),),).toBeFalse(),)
            },)
        },)
        describe("hasOne (iterable)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasOneWithIterable(it, EMPTY,),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithIterableByMinimalistCollectionHolder(it, EMPTY,),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithIterableByCollectionHolder(it, EMPTY,),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithIterableByArray(it, EMPTY,),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasOneWithIterable(it, A,),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithIterableByMinimalistCollectionHolder(it, A,),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithIterableByCollectionHolder(it, A,),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithIterableByArray(it, A,),).toBeFalse(),)
            },)
        },)
        describe("hasAll", () => {
            describe.each(everyEmptyInstances,)("%s (empty)", ({value,},) => {
                test("all",                          () => expect(hasAll(it, value,),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasAllByMinimalistCollectionHolder(it, value,),).toBeTrue(),)
                test("collection holder",            () => expect(hasAllByCollectionHolder(it, value,),).toBeTrue(),)
                test("array",                        () => expect(hasAllByArray(it, value,),).toBeTrue(),)
            },)
            describe.each(everyNonEmptyInstances,)("%s (non-empty)", ({value,},) => {
                test("all",                          () => expect(hasAll(it, value,),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasAllByMinimalistCollectionHolder(it, value,),).toBeFalse(),)
                test("collection holder",            () => expect(hasAllByCollectionHolder(it, value,),).toBeFalse(),)
                test("array",                        () => expect(hasAllByArray(it, value,),).toBeFalse(),)
            },)
        },)
        describe("hasAll (array)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasAllWithArray(it, EMPTY,),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasAllWithArrayByMinimalistCollectionHolder(it, EMPTY,),).toBeTrue(),)
                test("collection holder",            () => expect(hasAllWithArrayByCollectionHolder(it, EMPTY,),).toBeTrue(),)
                test("array",                        () => expect(hasAllWithArrayByArray(it, EMPTY,),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasAllWithArray(it, A,),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasAllWithArrayByMinimalistCollectionHolder(it, A,),).toBeFalse(),)
                test("collection holder",            () => expect(hasAllWithArrayByCollectionHolder(it, A,),).toBeFalse(),)
                test("array",                        () => expect(hasAllWithArrayByArray(it, A,),).toBeFalse(),)
            },)
        },)
        describe("hasAll (set)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasAllWithSet(it, new Set(),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasAllWithSetByMinimalistCollectionHolder(it, new Set(),),).toBeTrue(),)
                test("collection holder",            () => expect(hasAllWithSetByCollectionHolder(it, new Set(),),).toBeTrue(),)
                test("array",                        () => expect(hasAllWithSetByArray(it, new Set(),),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasAllWithSet(it, new Set(A,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasAllWithSetByMinimalistCollectionHolder(it, new Set(A,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasAllWithSetByCollectionHolder(it, new Set(A,),),).toBeFalse(),)
                test("array",                        () => expect(hasAllWithSetByArray(it, new Set(A,),),).toBeFalse(),)
            },)
        },)
        describe("hasAll (collection holder)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasAllWithCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasAllWithCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
                test("collection holder",            () => expect(hasAllWithCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
                test("array",                        () => expect(hasAllWithCollectionHolderByArray(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasAllWithCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasAllWithCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasAllWithCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("array",                        () => expect(hasAllWithCollectionHolderByArray(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
            },)
        },)
        describe("hasAll (minimalist collection holder)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasAllWithMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
                test("collection holder",            () => expect(hasAllWithMinimalistCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
                test("array",                        () => expect(hasAllWithMinimalistCollectionHolderByArray(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasAllWithMinimalistCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasAllWithMinimalistCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("array",                        () => expect(hasAllWithMinimalistCollectionHolderByArray(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
            },)
        },)
        describe("hasAll (collection iterator)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasAllWithCollectionIterator(it, new CollectionIteratorFromArray(EMPTY,),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasAllWithCollectionIteratorByMinimalistCollectionHolder(it, new CollectionIteratorFromArray(EMPTY,),),).toBeTrue(),)
                test("collection holder",            () => expect(hasAllWithCollectionIteratorByCollectionHolder(it, new CollectionIteratorFromArray(EMPTY,),),).toBeTrue(),)
                test("array",                        () => expect(hasAllWithCollectionIteratorByArray(it, new CollectionIteratorFromArray(EMPTY,),),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasAllWithCollectionIterator(it, new CollectionIteratorFromArray(A,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasAllWithCollectionIteratorByMinimalistCollectionHolder(it, new CollectionIteratorFromArray(A,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasAllWithCollectionIteratorByCollectionHolder(it, new CollectionIteratorFromArray(A,),),).toBeFalse(),)
                test("array",                        () => expect(hasAllWithCollectionIteratorByArray(it, new CollectionIteratorFromArray(A,),),).toBeFalse(),)
            },)
        },)
        describe("hasAll (iterable)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasAllWithIterable(it, EMPTY,),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasAllWithIterableByMinimalistCollectionHolder(it, EMPTY,),).toBeTrue(),)
                test("collection holder",            () => expect(hasAllWithIterableByCollectionHolder(it, EMPTY,),).toBeTrue(),)
                test("array",                        () => expect(hasAllWithIterableByArray(it, EMPTY,),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasAllWithIterable(it, A,),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasAllWithIterableByMinimalistCollectionHolder(it, A,),).toBeFalse(),)
                test("collection holder",            () => expect(hasAllWithIterableByCollectionHolder(it, A,),).toBeFalse(),)
                test("array",                        () => expect(hasAllWithIterableByArray(it, A,),).toBeFalse(),)
            },)
        },)
        describe("requireNoNulls", () => {
            test("all",                          () => expect(() => requireNoNulls(it,),).toThrow(TypeError,),)
            test("minimalist collection holder", () => expect(() => requireNoNullsByMinimalistCollectionHolder(it,),).toThrow(TypeError,),)
            test("collection holder",            () => expect(() => requireNoNullsByCollectionHolder(it,),).toThrow(TypeError,),)
            test("array",                        () => expect(() => requireNoNullsByArray(it,),).toThrow(TypeError,),)
        },)

        describe("filter", () => {
            test("all",                          () => expect(filter(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(filterByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(filterByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(filterByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("filterIndexed", () => {
            test("all",                          () => expect(filterIndexed(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(filterIndexedByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(filterIndexedByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(filterIndexedByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("filterNot", () => {
            test("all",                          () => expect(filterNot(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(filterNotByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(filterNotByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(filterNotByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("filterNotIndexed", () => {
            test("all",                          () => expect(filterNotIndexed(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(filterNotIndexedByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(filterNotIndexedByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(filterNotIndexedByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("filterNotNull", () => {
            test("all",                          () => expect(filterNotNull(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(filterNotNullByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(filterNotNullByCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(filterNotNullByArray(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("slice", () => {
            test("all",                          () => expect(slice(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(sliceByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(sliceByCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(sliceByArray(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("slice (range)", () => {
            test("all",                          () => expect(sliceWithARange(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(sliceWithARangeByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(sliceWithARangeByCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(sliceWithARangeByArray(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("slice (array)", () => {
            test("all",                          () => expect(sliceWithArray(it, EMPTY,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(sliceWithArrayByMinimalistCollectionHolder(it, EMPTY,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(sliceWithArrayByCollectionHolder(it, EMPTY,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(sliceWithArrayByArray(it, EMPTY,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("slice (set)", () => {
            test("all",                          () => expect(sliceWithSet(it, new Set(),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(sliceWithSetByMinimalistCollectionHolder(it, new Set(),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(sliceWithSetByCollectionHolder(it, new Set(),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(sliceWithSetByArray(it, new Set(),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("slice (collection holder)", () => {
            test("all",                          () => expect(sliceWithCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(sliceWithCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(sliceWithCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(sliceWithCollectionHolderByArray(it, new CollectionHolderFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("slice (minimalist collection holder)", () => {
            test("all",                          () => expect(sliceWithMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(sliceWithMinimalistCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(sliceWithMinimalistCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(sliceWithMinimalistCollectionHolderByArray(it, new CollectionHolderFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("slice (collection iterator)", () => {
            test("all",                          () => expect(sliceWithCollectionIterator(it, new CollectionIteratorFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(sliceWithCollectionIteratorByMinimalistCollectionHolder(it, new CollectionIteratorFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(sliceWithCollectionIteratorByCollectionHolder(it, new CollectionIteratorFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(sliceWithCollectionIteratorByArray(it, new CollectionIteratorFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("slice (iterable)", () => {
            test("all",                          () => expect(sliceWithIterable(it, EMPTY,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(sliceWithIterableByMinimalistCollectionHolder(it, EMPTY,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(sliceWithIterableByCollectionHolder(it, EMPTY,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(sliceWithIterableByArray(it, EMPTY,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("take", () => {
            test("all",                          () => expect(take(it, NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(takeByMinimalistCollectionHolder(it, NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(takeByCollectionHolder(it, NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(takeByArray(it, NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("takeWhile", () => {
            test("all",                          () => expect(takeWhile(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(takeWhileByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(takeWhileByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(takeWhileByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("takeWhileIndexed", () => {
            test("all",                          () => expect(takeWhileIndexed(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(takeWhileIndexedByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(takeWhileIndexedByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(takeWhileIndexedByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("takeLast", () => {
            test("all",                          () => expect(takeLast(it, NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(takeLastByMinimalistCollectionHolder(it, NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(takeLastByCollectionHolder(it, NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(takeLastByArray(it, NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("takeLastWhile", () => {
            test("all",                          () => expect(takeLastWhile(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(takeLastWhileByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(takeLastWhileByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(takeLastWhileByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("takeLastWhileIndexed", () => {
            test("all",                          () => expect(takeLastWhileIndexed(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(takeLastWhileIndexedByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(takeLastWhileIndexedByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(takeLastWhileIndexedByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("drop", () => {
            test("all",                          () => expect(drop(it, NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(dropByMinimalistCollectionHolder(it, NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(dropByCollectionHolder(it, NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(dropByArray(it, NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("dropWhile", () => {
            test("all",                          () => expect(dropWhile(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(dropWhileByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(dropWhileByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(dropWhileByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("dropWhileIndexed", () => {
            test("all",                          () => expect(dropWhileIndexed(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(dropWhileIndexedByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(dropWhileIndexedByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(dropWhileIndexedByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("dropLast", () => {
            test("all",                          () => expect(dropLast(it, NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(dropLastByMinimalistCollectionHolder(it, NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(dropLastByCollectionHolder(it, NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(dropLastByArray(it, NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("dropLastWhile", () => {
            test("all",                          () => expect(dropLastWhile(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(dropLastWhileByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(dropLastWhileByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(dropLastWhileByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("dropLastWhileIndexed", () => {
            test("all",                          () => expect(dropLastWhileIndexed(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(dropLastWhileIndexedByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(dropLastWhileIndexedByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(dropLastWhileIndexedByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("map", () => {
            test("all",                          () => expect(map(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(mapByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(mapByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(mapByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("mapIndexed", () => {
            test("all",                          () => expect(mapIndexed(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(mapIndexedByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(mapIndexedByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(mapIndexedByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("mapNotNull", () => {
            test("all",                          () => expect(mapNotNull(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(mapNotNullByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(mapNotNullByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(mapNotNullByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("mapNotNullIndexed", () => {
            test("all",                          () => expect(mapNotNullIndexed(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(mapNotNullIndexedByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(mapNotNullIndexedByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(mapNotNullIndexedByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)

        describe("forEach", () => {
            test("all",                          () => expect(() => forEach(it, callbackAsFail0,),).not.toThrow(),)
            test("minimalist collection holder", () => expect(() => forEachByMinimalistCollectionHolder(it, callbackAsFail0,),).not.toThrow(),)
            test("collection holder",            () => expect(() => forEachByCollectionHolder(it, callbackAsFail0,),).not.toThrow(),)
            test("array",                        () => expect(() => forEachByArray(it, callbackAsFail0,),).not.toThrow(),)
        },)
        describe("forEachIndexed", () => {
            test("all",                          () => expect(() => forEachIndexed(it, callbackAsFail0,),).not.toThrow(),)
            test("minimalist collection holder", () => expect(() => forEachIndexedByMinimalistCollectionHolder(it, callbackAsFail0,),).not.toThrow(),)
            test("collection holder",            () => expect(() => forEachIndexedByCollectionHolder(it, callbackAsFail0,),).not.toThrow(),)
            test("array",                        () => expect(() => forEachIndexedByArray(it, callbackAsFail0,),).not.toThrow(),)
        },)
        describe("onEach", () => {
            test("all",                          () => expect(onEach(it, callbackAsFail0,) === it,).toBeTrue(),)
            test("minimalist collection holder", () => expect(onEachByMinimalistCollectionHolder(it, callbackAsFail0,) === it,).toBeTrue(),)
            test("collection holder",            () => expect(onEachByCollectionHolder(it, callbackAsFail0,) === it,).toBeTrue(),)
            test("array",                        () => expect(onEachByArray(it, callbackAsFail0,) === it,).toBeTrue(),)
        },)
        describe("onEachIndexed", () => {
            test("all",                          () => expect(onEachIndexed(it, callbackAsFail0,) === it,).toBeTrue(),)
            test("minimalist collection holder", () => expect(onEachIndexedByMinimalistCollectionHolder(it, callbackAsFail0,) === it,).toBeTrue(),)
            test("collection holder",            () => expect(onEachIndexedByCollectionHolder(it, callbackAsFail0,) === it,).toBeTrue(),)
            test("array",                        () => expect(onEachIndexedByArray(it, callbackAsFail0,) === it,).toBeTrue(),)
        },)

        describe("toReverse", () => {
            test("all",                          () => expect(toReverse(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(toReverseByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(toReverseByCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(toReverseByArray(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)

        describe("toIterator", () => {
            test("all",                          () => expect(toIterator(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
            test("minimalist collection holder", () => expect(toIteratorByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
            test("collection holder",            () => expect(toIteratorByCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
            test("array",                        () => expect(toIteratorByArray(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
        },)
        describe("toArray", () => {
            test("all",                          () => expect(toArray(it,) === CollectionConstants.EMPTY_ARRAY,).toBeTrue(),)
            test("minimalist collection holder", () => expect(toArrayByMinimalistCollectionHolder(it,) === CollectionConstants.EMPTY_ARRAY,).toBeTrue(),)
            test("collection holder",            () => expect(toArrayByCollectionHolder(it,) === CollectionConstants.EMPTY_ARRAY,).toBeTrue(),)
            test("array",                        () => expect(toArrayByArray(it,) === CollectionConstants.EMPTY_ARRAY,).toBeTrue(),)
        },)
        describe("toMutableArray", () => {
            test("all",                          () => expect(toMutableArray(it,),).toEqual(CollectionConstants.EMPTY_ARRAY,),)
            test("minimalist collection holder", () => expect(toMutableArrayByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_ARRAY,),)
            test("collection holder",            () => expect(toMutableArrayByCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_ARRAY,),)
            test("array",                        () => expect(toMutableArrayByArray(it,),).toEqual(CollectionConstants.EMPTY_ARRAY,),)
        },)
        describe("toSet", () => {
            test("all",                          () => expect(toSet(it,) === CollectionConstants.EMPTY_SET,).toBeTrue(),)
            test("minimalist collection holder", () => expect(toSetByMinimalistCollectionHolder(it,) === CollectionConstants.EMPTY_SET,).toBeTrue(),)
            test("collection holder",            () => expect(toSetByCollectionHolder(it,) === CollectionConstants.EMPTY_SET,).toBeTrue(),)
            test("array",                        () => expect(toSetByArray(it,) === CollectionConstants.EMPTY_SET,).toBeTrue(),)
        },)
        describe("toMutableSet", () => {
            test("all",                          () => expect(toMutableSet(it,),).toEqual(CollectionConstants.EMPTY_SET,),)
            test("minimalist collection holder", () => expect(toMutableSetByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_SET,),)
            test("collection holder",            () => expect(toMutableSetByCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_SET,),)
            test("array",                        () => expect(toMutableSetByArray(it,),).toEqual(CollectionConstants.EMPTY_SET,),)
        },)
        describe("toWeakSet", () => {
            test("all",                          () => expect(toWeakSet(it,) === CollectionConstants.EMPTY_WEAK_SET,).toBeTrue(),)
            test("minimalist collection holder", () => expect(toWeakSetByMinimalistCollectionHolder(it,) === CollectionConstants.EMPTY_WEAK_SET,).toBeTrue(),)
            test("collection holder",            () => expect(toWeakSetByCollectionHolder(it,) === CollectionConstants.EMPTY_WEAK_SET,).toBeTrue(),)
            test("array",                        () => expect(toWeakSetByArray(it,) === CollectionConstants.EMPTY_WEAK_SET,).toBeTrue(),)
        },)
        describe("toMutableWeakSet", () => {
            test("all",                          () => expect(toMutableWeakSet(it,),).toEqual(CollectionConstants.EMPTY_WEAK_SET,),)
            test("minimalist collection holder", () => expect(toMutableWeakSetByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_WEAK_SET,),)
            test("collection holder",            () => expect(toMutableWeakSetByCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_WEAK_SET,),)
            test("array",                        () => expect(toMutableWeakSetByArray(it,),).toEqual(CollectionConstants.EMPTY_WEAK_SET,),)
        },)
        describe("toMap", () => {
            test("all",                          () => expect(toMap(it,) === CollectionConstants.EMPTY_MAP,).toBeTrue(),)
            test("minimalist collection holder", () => expect(toMapByMinimalistCollectionHolder(it,) === CollectionConstants.EMPTY_MAP,).toBeTrue(),)
            test("collection holder",            () => expect(toMapByCollectionHolder(it,) === CollectionConstants.EMPTY_MAP,).toBeTrue(),)
            test("array",                        () => expect(toMapByArray(it,) === CollectionConstants.EMPTY_MAP,).toBeTrue(),)
        },)
        describe("toMutableMap", () => {
            test("all",                          () => expect(toMutableMap(it,),).toEqual(CollectionConstants.EMPTY_MAP,),)
            test("minimalist collection holder", () => expect(toMutableMapByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_MAP,),)
            test("collection holder",            () => expect(toMutableMapByCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_MAP,),)
            test("array",                        () => expect(toMutableMapByArray(it,),).toEqual(CollectionConstants.EMPTY_MAP,),)
        },)
        describe("toString", () => {
            test("all",                          () => expect(toString(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("minimalist collection holder", () => expect(toStringByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("collection holder",            () => expect(toStringByCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("array",                        () => expect(toStringByArray(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        },)
        describe("toLocaleString", () => {
            test("all",                          () => expect(toLocaleString(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("minimalist collection holder", () => expect(toLocaleStringByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("collection holder",            () => expect(toLocaleStringByCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("array",                        () => expect(toLocaleStringByArray(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        },)
        describe("toLowerCaseString", () => {
            test("all",                          () => expect(toLowerCaseString(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("minimalist collection holder", () => expect(toLowerCaseStringByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("collection holder",            () => expect(toLowerCaseStringByCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("array",                        () => expect(toLowerCaseStringByArray(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        },)
        describe("toLocaleLowerCaseString", () => {
            test("all",                          () => expect(toLocaleLowerCaseString(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("minimalist collection holder", () => expect(toLocaleLowerCaseStringByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("collection holder",            () => expect(toLocaleLowerCaseStringByCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("array",                        () => expect(toLocaleLowerCaseStringByArray(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        },)
        describe("toUpperCaseString", () => {
            test("all",                          () => expect(toUpperCaseString(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("minimalist collection holder", () => expect(toUpperCaseStringByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("collection holder",            () => expect(toUpperCaseStringByCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("array",                        () => expect(toUpperCaseStringByArray(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        },)
        describe("toLocaleUpperCaseString", () => {
            test("all",                          () => expect(toLocaleUpperCaseString(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("minimalist collection holder", () => expect(toLocaleUpperCaseStringByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("collection holder",            () => expect(toLocaleUpperCaseStringByCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("array",                        () => expect(toLocaleUpperCaseStringByArray(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        },)
        describe("joinToString", () => {
            test("all",                          () => expect(joinToString(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("minimalist collection holder", () => expect(joinToStringByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("collection holder",            () => expect(joinToStringByCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("array",                        () => expect(joinToStringByArray(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        },)
    },)

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
            new Holder(new GenericCollectionIterator(new CollectionHolderFromArray([],),), "collection iterator (normal)",),
            new Holder(new CollectionIterator_ByStructure([],),                            "collection iterator (by structure)",),
        ] as const

        describe.each(everyInstances,)("%s", ({value: instance, message: type,},) => {
            /** Tell that the instance is structurally a {@link MinimalistCollectionHolder} */
            const isMinimalistCollectionHolderStructurally = type.includes("collection holder",)
            /** Tell that the instance a child instance of {@link AbstractMinimalistCollectionHolder} from its type */
            const isMinimalistCollectionHolderInstance =     type.includes("collection holder",) && !type.endsWith("(by structure)",)
            /** Tell that the instance is structurally a {@link CollectionHolder} */
            const isCollectionHolderStructurally =           type === "collection holder (by structure)"
            /** Tell that the instance a child instance of {@link AbstractCollectionHolder} from its type */
            const isCollectionHolderInstance =               type.startsWith("collection holder",) && !type.endsWith("(by structure)",)
            /** Tell that the instance a child instance of {@link AbstractCollectionIterator} from its type */
            const isCollectionIteratorInstance =             type.startsWith("collection iterator",) && !type.endsWith("(by structure)",)
            /** Tell that the instance is structurally a {@link CollectionIterator} */
            const isCollectionIteratorStructurally =         type.startsWith("collection iterator",)

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
            test("weak set by structure",                     () => expect(isWeakSetByStructure(instance,),)[type === "set" || type === "weak set" || isCollectionHolderInstance || isCollectionHolderStructurally ? "toBeTrue" : "toBeFalse"](),)
            test("minimalist collection holder",              () => expect(isMinimalistCollectionHolder(instance,),)[isMinimalistCollectionHolderInstance ? "toBeTrue" : "toBeFalse"](),)
            test("minimalist collection holder by structure", () => expect(isMinimalistCollectionHolderByStructure(instance,),)[isMinimalistCollectionHolderInstance || isMinimalistCollectionHolderStructurally ? "toBeTrue" : "toBeFalse"](),)
            test("collection holder",                         () => expect(isCollectionHolder(instance,),)[isCollectionHolderInstance ? "toBeTrue" : "toBeFalse"](),)
            test("collection holder by structure",            () => expect(isCollectionHolderByStructure(instance,),)[isCollectionHolderInstance || isCollectionHolderStructurally ? "toBeTrue" : "toBeFalse"](),)
            test("iterator",                                  () => expect(isIterator(instance,),)[type.startsWith("iterator",) ? "toBeTrue" : "toBeFalse"](),)
            test("collection iterator",                       () => expect(isCollectionIterator(instance,),)[isCollectionIteratorInstance ? "toBeTrue" : "toBeFalse"](),)
            test("collection iterator by structure",          () => expect(isCollectionIteratorByStructure(instance,),)[isCollectionIteratorInstance || isCollectionIteratorStructurally ? "toBeTrue" : "toBeFalse"](),)
        },)
    },)

    describe("alias", () => {
        describe("first (no argument)", () => {
            test("all", () => {
                const method = jest.spyOn(getFirstModule, "getFirst",)
                first(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getFirstModule, "getFirstByMinimalistCollectionHolder",)
                firstByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getFirstModule, "getFirstByCollectionHolder",)
                firstByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getFirstModule, "getFirstByArray",)
                firstByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("firstIndexed (no argument)", () => {
            test("all", () => {
                const method = jest.spyOn(getFirstModule, "getFirst",)
                firstIndexed(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getFirstModule, "getFirstByMinimalistCollectionHolder",)
                firstIndexedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getFirstModule, "getFirstByCollectionHolder",)
                firstIndexedByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getFirstModule, "getFirstByArray",)
                firstIndexedByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("last (no argument)", () => {
            test("all", () => {
                const method = jest.spyOn(getLastModule, "getLast",)
                last(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getLastModule, "getLastByMinimalistCollectionHolder",)
                lastByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getLastModule, "getLastByCollectionHolder",)
                lastByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getLastModule, "getLastByArray",)
                lastByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("lastIndexed (no argument)", () => {
            test("all", () => {
                const method = jest.spyOn(getLastModule, "getLast",)
                lastIndexed(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getLastModule, "getLastByMinimalistCollectionHolder",)
                lastIndexedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getLastModule, "getLastByCollectionHolder",)
                lastIndexedByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getLastModule, "getLastByArray",)
                lastIndexedByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("atOrElse", () => {
            test("all", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElse",)
                atOrElse(A, NaN, callback,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElseByMinimalistCollectionHolder",)
                atOrElseByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), NaN, callback,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElseByCollectionHolder",)
                atOrElseByCollectionHolder(new CollectionHolderFromArray(A,), NaN, callback,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElseByArray",)
                atOrElseByArray(A, NaN, callback,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("elementAtOrElse", () => {
            test("all", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElse",)
                elementAtOrElse(A, NaN, callback,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElseByMinimalistCollectionHolder",)
                elementAtOrElseByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), NaN, callback,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElseByCollectionHolder",)
                elementAtOrElseByCollectionHolder(new CollectionHolderFromArray(A,), NaN, callback,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElseByArray",)
                elementAtOrElseByArray(A, NaN, callback,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("firstOrNull (no argument)", () => {
            test("all", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNull",)
                firstOrNull(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNullByMinimalistCollectionHolder",)
                firstOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNullByCollectionHolder",)
                firstOrNullByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNullByArray",)
                firstOrNullByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("firstIndexedOrNull (no argument)", () => {
            test("all", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNull",)
                firstIndexedOrNull(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNullByMinimalistCollectionHolder",)
                firstIndexedOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNullByCollectionHolder",)
                firstIndexedOrNullByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNullByArray",)
                firstIndexedOrNullByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("lastOrNull (no argument)", () => {
            test("all", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNull",)
                lastOrNull(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNullByMinimalistCollectionHolder",)
                lastOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNullByCollectionHolder",)
                lastOrNullByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNullByArray",)
                lastOrNullByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("lastIndexedOrNull (no argument)", () => {
            test("all", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNull",)
                lastIndexedOrNull(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNullByMinimalistCollectionHolder",)
                lastIndexedOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNullByCollectionHolder",)
                lastIndexedOrNullByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNullByArray",)
                lastIndexedOrNullByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("atOrNull", () => {
            test("all", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNull",)
                atOrNull(A, NaN,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNullByMinimalistCollectionHolder",)
                atOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), NaN,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNullByCollectionHolder",)
                atOrNullByCollectionHolder(new CollectionHolderFromArray(A,), NaN,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNullByArray",)
                atOrNullByArray(A, NaN,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("elementAtOrNull", () => {
            test("all", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNull",)
                elementAtOrNull(A, NaN,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNullByMinimalistCollectionHolder",)
                elementAtOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), NaN,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNullByCollectionHolder",)
                elementAtOrNullByCollectionHolder(new CollectionHolderFromArray(A,), NaN,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNullByArray",)
                elementAtOrNullByArray(A, NaN,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("find", () => {
            test("all", () => {
                const method = jest.spyOn(findFirstModule, "findFirst",)
                find(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(findFirstModule, "findFirstByMinimalistCollectionHolder",)
                findByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(findFirstModule, "findFirstByCollectionHolder",)
                findByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(findFirstModule, "findFirstByArray",)
                findByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("first (with argument)", () => {
            test("all", () => {
                const method = jest.spyOn(findFirstModule, "findFirst",)
                first(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(findFirstModule, "findFirstByMinimalistCollectionHolder",)
                firstByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(findFirstModule, "findFirstByCollectionHolder",)
                firstByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(findFirstModule, "findFirstByArray",)
                firstByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("findOrNull", () => {
            test("all", () => {
                const method = jest.spyOn(findFirstOrNullModule, "findFirstOrNull",)
                findOrNull(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(findFirstOrNullModule, "findFirstOrNullByMinimalistCollectionHolder",)
                findOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(findFirstOrNullModule, "findFirstOrNullByCollectionHolder",)
                findOrNullByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(findFirstOrNullModule, "findFirstOrNullByArray",)
                findOrNullByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("firstOrNull (no argument)", () => {
            test("all", () => {
                const method = jest.spyOn(findFirstOrNullModule, "findFirstOrNull",)
                firstOrNull(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(findFirstOrNullModule, "findFirstOrNullByMinimalistCollectionHolder",)
                firstOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(findFirstOrNullModule, "findFirstOrNullByCollectionHolder",)
                firstOrNullByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(findFirstOrNullModule, "findFirstOrNullByArray",)
                firstOrNullByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("findIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(findFirstIndexedModule, "findFirstIndexed",)
                findIndexed(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(findFirstIndexedModule, "findFirstIndexedByMinimalistCollectionHolder",)
                findIndexedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(findFirstIndexedModule, "findFirstIndexedByCollectionHolder",)
                findIndexedByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(findFirstIndexedModule, "findFirstIndexedByArray",)
                findIndexedByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("firstIndexed (with argument)", () => {
            test("all", () => {
                const method = jest.spyOn(findFirstIndexedModule, "findFirstIndexed",)
                firstIndexed(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(findFirstIndexedModule, "findFirstIndexedByMinimalistCollectionHolder",)
                firstIndexedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(findFirstIndexedModule, "findFirstIndexedByCollectionHolder",)
                firstIndexedByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(findFirstIndexedModule, "findFirstIndexedByArray",)
                firstIndexedByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("findIndexedOrNull", () => {
            test("all", () => {
                const method = jest.spyOn(findFirstIndexedOrNullModule, "findFirstIndexedOrNull",)
                findIndexedOrNull(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(findFirstIndexedOrNullModule, "findFirstIndexedOrNullByMinimalistCollectionHolder",)
                findIndexedOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(findFirstIndexedOrNullModule, "findFirstIndexedOrNullByCollectionHolder",)
                findIndexedOrNullByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(findFirstIndexedOrNullModule, "findFirstIndexedOrNullByArray",)
                findIndexedOrNullByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("firstIndexedOrNull (with argument)", () => {
            test("all", () => {
                const method = jest.spyOn(findFirstIndexedOrNullModule, "findFirstIndexedOrNull",)
                firstIndexedOrNull(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(findFirstIndexedOrNullModule, "findFirstIndexedOrNullByMinimalistCollectionHolder",)
                firstIndexedOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(findFirstIndexedOrNullModule, "findFirstIndexedOrNullByCollectionHolder",)
                firstIndexedOrNullByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(findFirstIndexedOrNullModule, "findFirstIndexedOrNullByArray",)
                firstIndexedOrNullByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("last (with argument)", () => {
            test("all", () => {
                const method = jest.spyOn(findLastModule, "findLast",)
                last(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(findLastModule, "findLastByMinimalistCollectionHolder",)
                lastByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(findLastModule, "findLastByCollectionHolder",)
                lastByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(findLastModule, "findLastByArray",)
                lastByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("lastOrNull (no argument)", () => {
            test("all", () => {
                const method = jest.spyOn(findLastOrNullModule, "findLastOrNull",)
                lastOrNull(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(findLastOrNullModule, "findLastOrNullByMinimalistCollectionHolder",)
                lastOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(findLastOrNullModule, "findLastOrNullByCollectionHolder",)
                lastOrNullByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(findLastOrNullModule, "findLastOrNullByArray",)
                lastOrNullByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("lastIndexed (with argument)", () => {
            test("all", () => {
                const method = jest.spyOn(findLastIndexedModule, "findLastIndexed",)
                lastIndexed(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(findLastIndexedModule, "findLastIndexedByMinimalistCollectionHolder",)
                lastIndexedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(findLastIndexedModule, "findLastIndexedByCollectionHolder",)
                lastIndexedByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(findLastIndexedModule, "findLastIndexedByArray",)
                lastIndexedByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("lastIndexedOrNull (with argument)", () => {
            test("all", () => {
                const method = jest.spyOn(findLastIndexedOrNullModule, "findLastIndexedOrNull",)
                lastIndexedOrNull(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(findLastIndexedOrNullModule, "findLastIndexedOrNullByMinimalistCollectionHolder",)
                lastIndexedOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(findLastIndexedOrNullModule, "findLastIndexedOrNullByCollectionHolder",)
                lastIndexedOrNullByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(findLastIndexedOrNullModule, "findLastIndexedOrNullByArray",)
                lastIndexedOrNullByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("indexOf", () => {
            test("all", () => {
                const method = jest.spyOn(firstIndexOfModule, "firstIndexOf",)
                indexOf(A, "a",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(firstIndexOfModule, "firstIndexOfByMinimalistCollectionHolder",)
                indexOfByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), "a",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(firstIndexOfModule, "firstIndexOfByCollectionHolder",)
                indexOfByCollectionHolder(new CollectionHolderFromArray(A,), "a",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(firstIndexOfModule, "firstIndexOfByArray",)
                indexOfByArray(A, "a",)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("findFirstIndex", () => {
            test("all", () => {
                const method = jest.spyOn(indexOfFirstModule, "indexOfFirst",)
                findFirstIndex(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(indexOfFirstModule, "indexOfFirstByMinimalistCollectionHolder",)
                findFirstIndexByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(indexOfFirstModule, "indexOfFirstByCollectionHolder",)
                findFirstIndexByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(indexOfFirstModule, "indexOfFirstByArray",)
                findFirstIndexByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("findIndex", () => {
            test("all", () => {
                const method = jest.spyOn(indexOfFirstModule, "indexOfFirst",)
                findIndex(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(indexOfFirstModule, "indexOfFirstByMinimalistCollectionHolder",)
                findIndexByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(indexOfFirstModule, "indexOfFirstByCollectionHolder",)
                findIndexByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(indexOfFirstModule, "indexOfFirstByArray",)
                findIndexByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("findFirstIndexOrNull", () => {
            test("all", () => {
                const method = jest.spyOn(indexOfFirstOrNullModule, "indexOfFirstOrNull",)
                findFirstIndexOrNull(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(indexOfFirstOrNullModule, "indexOfFirstOrNullByMinimalistCollectionHolder",)
                findFirstIndexOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(indexOfFirstOrNullModule, "indexOfFirstOrNullByCollectionHolder",)
                findFirstIndexOrNullByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(indexOfFirstOrNullModule, "indexOfFirstOrNullByArray",)
                findFirstIndexOrNullByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("findIndexOrNull", () => {
            test("all", () => {
                const method = jest.spyOn(indexOfFirstOrNullModule, "indexOfFirstOrNull",)
                findIndexOrNull(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(indexOfFirstOrNullModule, "indexOfFirstOrNullByMinimalistCollectionHolder",)
                findIndexOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(indexOfFirstOrNullModule, "indexOfFirstOrNullByCollectionHolder",)
                findIndexOrNullByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(indexOfFirstOrNullModule, "indexOfFirstOrNullByArray",)
                findIndexOrNullByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("findFirstIndexIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(indexOfFirstIndexedModule, "indexOfFirstIndexed",)
                findFirstIndexIndexed(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(indexOfFirstIndexedModule, "indexOfFirstIndexedByMinimalistCollectionHolder",)
                findFirstIndexIndexedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(indexOfFirstIndexedModule, "indexOfFirstIndexedByCollectionHolder",)
                findFirstIndexIndexedByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(indexOfFirstIndexedModule, "indexOfFirstIndexedByArray",)
                findFirstIndexIndexedByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("findIndexIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(indexOfFirstIndexedModule, "indexOfFirstIndexed",)
                findIndexIndexed(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(indexOfFirstIndexedModule, "indexOfFirstIndexedByMinimalistCollectionHolder",)
                findIndexIndexedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(indexOfFirstIndexedModule, "indexOfFirstIndexedByCollectionHolder",)
                findIndexIndexedByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(indexOfFirstIndexedModule, "indexOfFirstIndexedByArray",)
                findIndexIndexedByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("findFirstIndexIndexedOrNull", () => {
            test("all", () => {
                const method = jest.spyOn(indexOfFirstIndexedOrNullModule, "indexOfFirstIndexedOrNull",)
                findFirstIndexIndexedOrNull(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(indexOfFirstIndexedOrNullModule, "indexOfFirstIndexedOrNullByMinimalistCollectionHolder",)
                findFirstIndexIndexedOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(indexOfFirstIndexedOrNullModule, "indexOfFirstIndexedOrNullByCollectionHolder",)
                findFirstIndexIndexedOrNullByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(indexOfFirstIndexedOrNullModule, "indexOfFirstIndexedOrNullByArray",)
                findFirstIndexIndexedOrNullByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("findIndexIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(indexOfFirstIndexedOrNullModule, "indexOfFirstIndexedOrNull",)
                findIndexIndexedOrNull(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(indexOfFirstIndexedOrNullModule, "indexOfFirstIndexedOrNullByMinimalistCollectionHolder",)
                findIndexIndexedOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(indexOfFirstIndexedOrNullModule, "indexOfFirstIndexedOrNullByCollectionHolder",)
                findIndexIndexedOrNullByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(indexOfFirstIndexedOrNullModule, "indexOfFirstIndexedOrNullByArray",)
                findIndexIndexedOrNullByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("findLastIndex", () => {
            test("all", () => {
                const method = jest.spyOn(indexOfLastModule, "indexOfLast",)
                findLastIndex(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(indexOfLastModule, "indexOfLastByMinimalistCollectionHolder",)
                findLastIndexByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(indexOfLastModule, "indexOfLastByCollectionHolder",)
                findLastIndexByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(indexOfLastModule, "indexOfLastByArray",)
                findLastIndexByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("findLastIndexOrNull", () => {
            test("all", () => {
                const method = jest.spyOn(indexOfLastOrNullModule, "indexOfLastOrNull",)
                findLastIndexOrNull(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(indexOfLastOrNullModule, "indexOfLastOrNullByMinimalistCollectionHolder",)
                findLastIndexOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(indexOfLastOrNullModule, "indexOfLastOrNullByCollectionHolder",)
                findLastIndexOrNullByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(indexOfLastOrNullModule, "indexOfLastOrNullByArray",)
                findLastIndexOrNullByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("findLastIndexIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(indexOfLastIndexedModule, "indexOfLastIndexed",)
                findLastIndexIndexed(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(indexOfLastIndexedModule, "indexOfLastIndexedByMinimalistCollectionHolder",)
                findLastIndexIndexedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(indexOfLastIndexedModule, "indexOfLastIndexedByCollectionHolder",)
                findLastIndexIndexedByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(indexOfLastIndexedModule, "indexOfLastIndexedByArray",)
                findLastIndexIndexedByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("findLastIndexIndexedOrNull", () => {
            test("all", () => {
                const method = jest.spyOn(indexOfLastIndexedOrNullModule, "indexOfLastIndexedOrNull",)
                findLastIndexIndexedOrNull(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(indexOfLastIndexedOrNullModule, "indexOfLastIndexedOrNullByMinimalistCollectionHolder",)
                findLastIndexIndexedOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(indexOfLastIndexedOrNullModule, "indexOfLastIndexedOrNullByCollectionHolder",)
                findLastIndexIndexedOrNullByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(indexOfLastIndexedOrNullModule, "indexOfLastIndexedOrNullByArray",)
                findLastIndexIndexedOrNullByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("every", () => {
            test("all", () => {
                const method = jest.spyOn(allModule, "all",)
                every(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(allModule, "allByMinimalistCollectionHolder",)
                everyByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(allModule, "allByCollectionHolder",)
                everyByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(allModule, "allByArray",)
                everyByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("some", () => {
            test("all", () => {
                const method = jest.spyOn(anyModule, "any",)
                some(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(anyModule, "anyByMinimalistCollectionHolder",)
                someByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(anyModule, "anyByCollectionHolder",)
                someByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(anyModule, "anyByArray",)
                someByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNull", () => {
            test("all", () => {
                const method = jest.spyOn(hasNullModule, "hasNull",)
                containsNull(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNullModule, "hasNullByMinimalistCollectionHolder",)
                containsNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNullModule, "hasNullByCollectionHolder",)
                containsNullByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNullModule, "hasNullByArray",)
                containsNullByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNull", () => {
            test("all", () => {
                const method = jest.spyOn(hasNullModule, "hasNull",)
                includesNull(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNullModule, "hasNullByMinimalistCollectionHolder",)
                includesNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNullModule, "hasNullByCollectionHolder",)
                includesNullByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNullModule, "hasNullByArray",)
                includesNullByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsDuplicate", () => {
            test("all", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicate",)
                containsDuplicate(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicateByMinimalistCollectionHolder",)
                containsDuplicateByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicateByCollectionHolder",)
                containsDuplicateByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicateByArray",)
                containsDuplicateByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesDuplicate", () => {
            test("all", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicate",)
                includesDuplicate(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicateByMinimalistCollectionHolder",)
                includesDuplicateByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicateByCollectionHolder",)
                includesDuplicateByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicateByArray",)
                includesDuplicateByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("contains", () => {
            test("all", () => {
                const method = jest.spyOn(hasModule, "has",)
                contains(A, "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasModule, "hasByMinimalistCollectionHolder",)
                containsByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasModule, "hasByCollectionHolder",)
                containsByCollectionHolder(new CollectionHolderFromArray(A,), "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasModule, "hasByArray",)
                containsByArray(A, "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includes", () => {
            test("all", () => {
                const method = jest.spyOn(hasModule, "has",)
                includes(A, "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasModule, "hasByMinimalistCollectionHolder",)
                includesByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasModule, "hasByCollectionHolder",)
                includesByCollectionHolder(new CollectionHolderFromArray(A,), "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasModule, "hasByArray",)
                includesByArray(A, "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneModule, "hasOne",)
                containsOne(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneModule, "hasOneByMinimalistCollectionHolder",)
                containsOneByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneModule, "hasOneByCollectionHolder",)
                containsOneByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneModule, "hasOneByArray",)
                containsOneByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArray",)
                containsOneWithArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArrayByMinimalistCollectionHolder",)
                containsOneWithArrayByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArrayByCollectionHolder",)
                containsOneWithArrayByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArrayByArray",)
                containsOneWithArrayByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSet",)
                containsOneWithSet(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSetByMinimalistCollectionHolder",)
                containsOneWithSetByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSetByCollectionHolder",)
                containsOneWithSetByCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSetByArray",)
                containsOneWithSetByArray(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolder",)
                containsOneWithCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolderByMinimalistCollectionHolder",)
                containsOneWithCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolderByCollectionHolder",)
                containsOneWithCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolderByArray",)
                containsOneWithCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolder",)
                containsOneWithMinimalistCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                containsOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolderByCollectionHolder",)
                containsOneWithMinimalistCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolderByArray",)
                containsOneWithMinimalistCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIterator",)
                containsOneWithCollectionIterator(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIteratorByMinimalistCollectionHolder",)
                containsOneWithCollectionIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIteratorByCollectionHolder",)
                containsOneWithCollectionIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIteratorByArray",)
                containsOneWithCollectionIteratorByArray(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterable",)
                containsOneWithIterable(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterableByMinimalistCollectionHolder",)
                containsOneWithIterableByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterableByCollectionHolder",)
                containsOneWithIterableByCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterableByArray",)
                containsOneWithIterableByArray(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneModule, "hasOne",)
                includesOne(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneModule, "hasOneByMinimalistCollectionHolder",)
                includesOneByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneModule, "hasOneByCollectionHolder",)
                includesOneByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneModule, "hasOneByArray",)
                includesOneByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArray",)
                includesOneWithArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArrayByMinimalistCollectionHolder",)
                includesOneWithArrayByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArrayByCollectionHolder",)
                includesOneWithArrayByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArrayByArray",)
                includesOneWithArrayByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSet",)
                includesOneWithSet(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSetByMinimalistCollectionHolder",)
                includesOneWithSetByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSetByCollectionHolder",)
                includesOneWithSetByCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSetByArray",)
                includesOneWithSetByArray(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolder",)
                includesOneWithCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolderByMinimalistCollectionHolder",)
                includesOneWithCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolderByCollectionHolder",)
                includesOneWithCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolderByArray",)
                includesOneWithCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolder",)
                includesOneWithMinimalistCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                includesOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolderByCollectionHolder",)
                includesOneWithMinimalistCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolderByArray",)
                includesOneWithMinimalistCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIterator",)
                includesOneWithCollectionIterator(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIteratorByMinimalistCollectionHolder",)
                includesOneWithCollectionIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIteratorByCollectionHolder",)
                includesOneWithCollectionIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIteratorByArray",)
                includesOneWithCollectionIteratorByArray(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterable",)
                includesOneWithIterable(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterableByMinimalistCollectionHolder",)
                includesOneWithIterableByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterableByCollectionHolder",)
                includesOneWithIterableByCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterableByArray",)
                includesOneWithIterableByArray(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllModule, "hasAll",)
                containsAll(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllModule, "hasAllByMinimalistCollectionHolder",)
                containsAllByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllModule, "hasAllByCollectionHolder",)
                containsAllByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllModule, "hasAllByArray",)
                containsAllByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArray",)
                containsAllWithArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArrayByMinimalistCollectionHolder",)
                containsAllWithArrayByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArrayByCollectionHolder",)
                containsAllWithArrayByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArrayByArray",)
                containsAllWithArrayByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSet",)
                containsAllWithSet(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSetByMinimalistCollectionHolder",)
                containsAllWithSetByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSetByCollectionHolder",)
                containsAllWithSetByCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSetByArray",)
                containsAllWithSetByArray(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolder",)
                containsAllWithCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolderByMinimalistCollectionHolder",)
                containsAllWithCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolderByCollectionHolder",)
                containsAllWithCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolderByArray",)
                containsAllWithCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolder",)
                containsAllWithMinimalistCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                containsAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolderByCollectionHolder",)
                containsAllWithMinimalistCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolderByArray",)
                containsAllWithMinimalistCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIterator",)
                containsAllWithCollectionIterator(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIteratorByMinimalistCollectionHolder",)
                containsAllWithCollectionIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIteratorByCollectionHolder",)
                containsAllWithCollectionIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIteratorByArray",)
                containsAllWithCollectionIteratorByArray(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterable",)
                containsAllWithIterable(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterableByMinimalistCollectionHolder",)
                containsAllWithIterableByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterableByCollectionHolder",)
                containsAllWithIterableByCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterableByArray",)
                containsAllWithIterableByArray(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllModule, "hasAll",)
                includesAll(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllModule, "hasAllByMinimalistCollectionHolder",)
                includesAllByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllModule, "hasAllByCollectionHolder",)
                includesAllByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllModule, "hasAllByArray",)
                includesAllByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArray",)
                includesAllWithArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArrayByMinimalistCollectionHolder",)
                includesAllWithArrayByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArrayByCollectionHolder",)
                includesAllWithArrayByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArrayByArray",)
                includesAllWithArrayByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSet",)
                includesAllWithSet(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSetByMinimalistCollectionHolder",)
                includesAllWithSetByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSetByCollectionHolder",)
                includesAllWithSetByCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSetByArray",)
                includesAllWithSetByArray(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolder",)
                includesAllWithCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolderByMinimalistCollectionHolder",)
                includesAllWithCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolderByCollectionHolder",)
                includesAllWithCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolderByArray",)
                includesAllWithCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolder",)
                includesAllWithMinimalistCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                includesAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolderByCollectionHolder",)
                includesAllWithMinimalistCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolderByArray",)
                includesAllWithMinimalistCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIterator",)
                includesAllWithCollectionIterator(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIteratorByMinimalistCollectionHolder",)
                includesAllWithCollectionIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIteratorByCollectionHolder",)
                includesAllWithCollectionIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIteratorByArray",)
                includesAllWithCollectionIteratorByArray(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterable",)
                includesAllWithIterable(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterableByMinimalistCollectionHolder",)
                includesAllWithIterableByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterableByCollectionHolder",)
                includesAllWithIterableByCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterableByArray",)
                includesAllWithIterableByArray(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("limit", () => {
            test("all", () => {
                const method = jest.spyOn(takeModule, "take",)
                limit(A, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeModule, "takeByMinimalistCollectionHolder",)
                limitByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeModule, "takeByCollectionHolder",)
                limitByCollectionHolder(new CollectionHolderFromArray(A,), 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeModule, "takeByArray",)
                limitByArray(A, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("limitWhile", () => {
            test("all", () => {
                const method = jest.spyOn(takeWhileModule, "takeWhile",)
                limitWhile(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeWhileModule, "takeWhileByMinimalistCollectionHolder",)
                limitWhileByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeWhileModule, "takeWhileByCollectionHolder",)
                limitWhileByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeWhileModule, "takeWhileByArray",)
                limitWhileByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("limitWhileIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(takeWhileIndexedModule, "takeWhileIndexed",)
                limitWhileIndexed(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeWhileIndexedModule, "takeWhileIndexedByMinimalistCollectionHolder",)
                limitWhileIndexedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeWhileIndexedModule, "takeWhileIndexedByCollectionHolder",)
                limitWhileIndexedByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeWhileIndexedModule, "takeWhileIndexedByArray",)
                limitWhileIndexedByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("limitLast", () => {
            test("all", () => {
                const method = jest.spyOn(takeLastModule, "takeLast",)
                limitLast(A, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeLastModule, "takeLastByMinimalistCollectionHolder",)
                limitLastByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeLastModule, "takeLastByCollectionHolder",)
                limitLastByCollectionHolder(new CollectionHolderFromArray(A,), 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeLastModule, "takeLastByArray",)
                limitLastByArray(A, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("limitLastWhile", () => {
            test("all", () => {
                const method = jest.spyOn(takeLastWhileModule, "takeLastWhile",)
                limitLastWhile(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeLastWhileModule, "takeLastWhileByMinimalistCollectionHolder",)
                limitLastWhileByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeLastWhileModule, "takeLastWhileByCollectionHolder",)
                limitLastWhileByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeLastWhileModule, "takeLastWhileByArray",)
                limitLastWhileByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("limitLastWhileIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(takeLastWhileIndexedModule, "takeLastWhileIndexed",)
                limitLastWhileIndexed(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeLastWhileIndexedModule, "takeLastWhileIndexedByMinimalistCollectionHolder",)
                limitLastWhileIndexedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeLastWhileIndexedModule, "takeLastWhileIndexedByCollectionHolder",)
                limitLastWhileIndexedByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeLastWhileIndexedModule, "takeLastWhileIndexedByArray",)
                limitLastWhileIndexedByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("skip", () => {
            test("all", () => {
                const method = jest.spyOn(dropModule, "drop",)
                skip(A, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(dropModule, "dropByMinimalistCollectionHolder",)
                skipByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(dropModule, "dropByCollectionHolder",)
                skipByCollectionHolder(new CollectionHolderFromArray(A,), 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(dropModule, "dropByArray",)
                skipByArray(A, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("skipWhile", () => {
            test("all", () => {
                const method = jest.spyOn(dropWhileModule, "dropWhile",)
                skipWhile(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(dropWhileModule, "dropWhileByMinimalistCollectionHolder",)
                skipWhileByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(dropWhileModule, "dropWhileByCollectionHolder",)
                skipWhileByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(dropWhileModule, "dropWhileByArray",)
                skipWhileByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("skipWhileIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(dropWhileIndexedModule, "dropWhileIndexed",)
                skipWhileIndexed(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(dropWhileIndexedModule, "dropWhileIndexedByMinimalistCollectionHolder",)
                skipWhileIndexedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(dropWhileIndexedModule, "dropWhileIndexedByCollectionHolder",)
                skipWhileIndexedByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(dropWhileIndexedModule, "dropWhileIndexedByArray",)
                skipWhileIndexedByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("skipLast", () => {
            test("all", () => {
                const method = jest.spyOn(dropLastModule, "dropLast",)
                skipLast(A, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(dropLastModule, "dropLastByMinimalistCollectionHolder",)
                skipLastByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(dropLastModule, "dropLastByCollectionHolder",)
                skipLastByCollectionHolder(new CollectionHolderFromArray(A,), 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(dropLastModule, "dropLastByArray",)
                skipLastByArray(A, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("skipLastWhile", () => {
            test("all", () => {
                const method = jest.spyOn(dropLastWhileModule, "dropLastWhile",)
                skipLastWhile(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(dropLastWhileModule, "dropLastWhileByMinimalistCollectionHolder",)
                skipLastWhileByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(dropLastWhileModule, "dropLastWhileByCollectionHolder",)
                skipLastWhileByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(dropLastWhileModule, "dropLastWhileByArray",)
                skipLastWhileByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("skipLastWhileIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(dropLastWhileIndexedModule, "dropLastWhileIndexed",)
                skipLastWhileIndexed(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(dropLastWhileIndexedModule, "dropLastWhileIndexedByMinimalistCollectionHolder",)
                skipLastWhileIndexedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(dropLastWhileIndexedModule, "dropLastWhileIndexedByCollectionHolder",)
                skipLastWhileIndexedByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(dropLastWhileIndexedModule, "dropLastWhileIndexedByArray",)
                skipLastWhileIndexedByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("toReversed", () => {
            test("all", () => {
                const method = jest.spyOn(toReverseModule, "toReverse",)
                toReversed(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(toReverseModule, "toReverseByMinimalistCollectionHolder",)
                toReversedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(toReverseModule, "toReverseByCollectionHolder",)
                toReversedByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(toReverseModule, "toReverseByArray",)
                toReversedByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("reversed", () => {
            test("all", () => {
                const method = jest.spyOn(toReverseModule, "toReverse",)
                reversed(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(toReverseModule, "toReverseByMinimalistCollectionHolder",)
                reversedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(toReverseModule, "toReverseByCollectionHolder",)
                reversedByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(toReverseModule, "toReverseByArray",)
                reversedByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("join", () => {
            test("all", () => {
                const method = jest.spyOn(joinToStringModule, "joinToString",)
                join(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(joinToStringModule, "joinToStringByMinimalistCollectionHolder",)
                joinByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(joinToStringModule, "joinToStringByCollectionHolder",)
                joinByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(joinToStringModule, "joinToStringByArray",)
                joinByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
    },)

},)
