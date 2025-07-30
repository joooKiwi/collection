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

import {CollectionHolderFromArray}                                                                                                                                                                                                                                                                   from "./instance/CollectionHolderFromArray"
import {CollectionIteratorFromArray}                                                                                                                                                                                                                                                                 from "./instance/CollectionIteratorFromArray"
import {EmptyCollectionHolderForTest}                                                                                                                                                                                                                                                                from "./instance/EmptyCollectionHolderForTest"
import {GenericCollectionHolder_HasAlias}                                                                                                                                                                                                                                                            from "./instance/GenericCollectionHolder_HasAlias"
import {GenericCollectionHolder_HasAllAlias}                                                                                                                                                                                                                                                         from "./instance/GenericCollectionHolder_HasAllAlias"
import {GenericCollectionHolder_HasDuplicateAlias}                                                                                                                                                                                                                                                   from "./instance/GenericCollectionHolder_HasDuplicateAlias"
import {GenericCollectionHolder_HasNoDuplicatesAlias}                                                                                                                                                                                                                                                from "./instance/GenericCollectionHolder_HasNoDuplicatesAlias"
import {GenericCollectionHolder_HasNoNullsAlias}                                                                                                                                                                                                                                                     from "./instance/GenericCollectionHolder_HasNoNullsAlias"
import {GenericCollectionHolder_HasNotAlias}                                                                                                                                                                                                                                                         from "./instance/GenericCollectionHolder_HasNotAlias"
import {GenericCollectionHolder_HasNotAllAlias}                                                                                                                                                                                                                                                      from "./instance/GenericCollectionHolder_HasNotAllAlias"
import {GenericCollectionHolder_HasNotOneAlias}                                                                                                                                                                                                                                                      from "./instance/GenericCollectionHolder_HasNotOneAlias"
import {GenericCollectionHolder_HasNullAlias}                                                                                                                                                                                                                                                        from "./instance/GenericCollectionHolder_HasNullAlias"
import {GenericCollectionHolder_HasOneAlias}                                                                                                                                                                                                                                                         from "./instance/GenericCollectionHolder_HasOneAlias"
import {Holder}                                                                                                                                                                                                                                                                                      from "./Holder"
import {IterableForTest}                                                                                                                                                                                                                                                                             from "./instance/IterableForTest"
import {IteratorForTest}                                                                                                                                                                                                                                                                             from "./instance/IteratorForTest"
import {LazyGenericCollectionHolder_HasAlias}                                                                                                                                                                                                                                                        from "./instance/LazyGenericCollectionHolder_HasAlias"
import {LazyGenericCollectionHolder_HasAllAlias}                                                                                                                                                                                                                                                     from "./instance/LazyGenericCollectionHolder_HasAllAlias"
import {LazyGenericCollectionHolder_HasDuplicateAlias}                                                                                                                                                                                                                                               from "./instance/LazyGenericCollectionHolder_HasDuplicateAlias"
import {LazyGenericCollectionHolder_HasNoDuplicatesAlias}                                                                                                                                                                                                                                            from "./instance/LazyGenericCollectionHolder_HasNoDuplicatesAlias"
import {LazyGenericCollectionHolder_HasNoNullsAlias}                                                                                                                                                                                                                                                 from "./instance/LazyGenericCollectionHolder_HasNoNullsAlias"
import {LazyGenericCollectionHolder_HasNotAlias}                                                                                                                                                                                                                                                     from "./instance/LazyGenericCollectionHolder_HasNotAlias"
import {LazyGenericCollectionHolder_HasNotAllAlias}                                                                                                                                                                                                                                                  from "./instance/LazyGenericCollectionHolder_HasNotAllAlias"
import {LazyGenericCollectionHolder_HasNotOneAlias}                                                                                                                                                                                                                                                  from "./instance/LazyGenericCollectionHolder_HasNotOneAlias"
import {LazyGenericCollectionHolder_HasNullAlias}                                                                                                                                                                                                                                                    from "./instance/LazyGenericCollectionHolder_HasNullAlias"
import {LazyGenericCollectionHolder_HasOneAlias}                                                                                                                                                                                                                                                     from "./instance/LazyGenericCollectionHolder_HasOneAlias"
import {MinimalistCollectionHolderFromArray}                                                                                                                                                                                                                                                         from "./instance/MinimalistCollectionHolderFromArray"
import {A, A_NULL, A_NULL_B, A_NULL_NULL_UNDEFINED_B, A_NULL_UNDEFINED_B, A_NULL_UNDEFINED_UNDEFINED_B, A_UNDEFINED, A_UNDEFINED_B, AA, AABC, AB, AB_NULL, AB_UNDEFINED, ABAB, ABBC, ABCD, B, C, D, E, EF, EFGH, EMPTY, NULL, NULL_A, NULL_AB, NULL_UNDEFINED, UNDEFINED, UNDEFINED_A, UNDEFINED_AB} from "./value/arrays"
import {everyCollectionInstancesAndExtensionFunctionAsCollectionHolder, everyIterableInstances}                                                                                                                                                                                                      from "./value/instances"

import type {PossibleIterableIteratorArraySetOrCollectionHolder} from "../src/type/possibleInstance"

import {contains, containsByArray, containsByCollectionHolder, containsByMinimalistCollectionHolder}                                                                                                                                                 from "../src/method/contains"
import {containsAll, containsAllByArray, containsAllByCollectionHolder, containsAllByMinimalistCollectionHolder}                                                                                                                                     from "../src/method/containsAll"
import {containsAllWithArray, containsAllWithArrayByArray, containsAllWithArrayByCollectionHolder, containsAllWithArrayByMinimalistCollectionHolder}                                                                                                 from "../src/method/containsAll.withArray"
import {containsAllWithCollectionHolder, containsAllWithCollectionHolderByArray, containsAllWithCollectionHolderByCollectionHolder, containsAllWithCollectionHolderByMinimalistCollectionHolder}                                                     from "../src/method/containsAll.withCollectionHolder"
import {containsAllWithCollectionIterator, containsAllWithCollectionIteratorByArray, containsAllWithCollectionIteratorByCollectionHolder, containsAllWithCollectionIteratorByMinimalistCollectionHolder}                                             from "../src/method/containsAll.withCollectionIterator"
import {containsAllWithIterable, containsAllWithIterableByArray, containsAllWithIterableByCollectionHolder, containsAllWithIterableByMinimalistCollectionHolder}                                                                                     from "../src/method/containsAll.withIterable"
import {containsAllWithIterator, containsAllWithIteratorByArray, containsAllWithIteratorByCollectionHolder, containsAllWithIteratorByMinimalistCollectionHolder}                                                                                     from "../src/method/containsAll.withIterator"
import {containsAllWithMinimalistCollectionHolder, containsAllWithMinimalistCollectionHolderByArray, containsAllWithMinimalistCollectionHolderByCollectionHolder, containsAllWithMinimalistCollectionHolderByMinimalistCollectionHolder}             from "../src/method/containsAll.withMinimalistCollectionHolder"
import {containsAllWithSet, containsAllWithSetByArray, containsAllWithSetByCollectionHolder, containsAllWithSetByMinimalistCollectionHolder}                                                                                                         from "../src/method/containsAll.withSet"
import {containsDuplicate, containsDuplicateByArray, containsDuplicateByCollectionHolder, containsDuplicateByMinimalistCollectionHolder}                                                                                                             from "../src/method/containsDuplicate"
import {containsNot, containsNotByArray, containsNotByCollectionHolder, containsNotByMinimalistCollectionHolder}                                                                                                                                     from "../src/method/containsNot"
import {containsNotAll, containsNotAllByArray, containsNotAllByCollectionHolder, containsNotAllByMinimalistCollectionHolder}                                                                                                                         from "../src/method/containsNotAll"
import {containsNotAllWithArray, containsNotAllWithArrayByArray, containsNotAllWithArrayByCollectionHolder, containsNotAllWithArrayByMinimalistCollectionHolder}                                                                                     from "../src/method/containsNotAll.withArray"
import {containsNotAllWithCollectionHolder, containsNotAllWithCollectionHolderByArray, containsNotAllWithCollectionHolderByCollectionHolder, containsNotAllWithCollectionHolderByMinimalistCollectionHolder}                                         from "../src/method/containsNotAll.withCollectionHolder"
import {containsNotAllWithCollectionIterator, containsNotAllWithCollectionIteratorByArray, containsNotAllWithCollectionIteratorByCollectionHolder, containsNotAllWithCollectionIteratorByMinimalistCollectionHolder}                                 from "../src/method/containsNotAll.withCollectionIterator"
import {containsNotAllWithIterable, containsNotAllWithIterableByArray, containsNotAllWithIterableByCollectionHolder, containsNotAllWithIterableByMinimalistCollectionHolder}                                                                         from "../src/method/containsNotAll.withIterable"
import {containsNotAllWithIterator, containsNotAllWithIteratorByArray, containsNotAllWithIteratorByCollectionHolder, containsNotAllWithIteratorByMinimalistCollectionHolder}                                                                         from "../src/method/containsNotAll.withIterator"
import {containsNotAllWithMinimalistCollectionHolder, containsNotAllWithMinimalistCollectionHolderByArray, containsNotAllWithMinimalistCollectionHolderByCollectionHolder, containsNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "../src/method/containsNotAll.withMinimalistCollectionHolder"
import {containsNotAllWithSet, containsNotAllWithSetByArray, containsNotAllWithSetByCollectionHolder, containsNotAllWithSetByMinimalistCollectionHolder}                                                                                             from "../src/method/containsNotAll.withSet"
import {containsNotOne, containsNotOneByArray, containsNotOneByCollectionHolder, containsNotOneByMinimalistCollectionHolder}                                                                                                                         from "../src/method/containsNotOne"
import {containsNotOneWithArray, containsNotOneWithArrayByArray, containsNotOneWithArrayByCollectionHolder, containsNotOneWithArrayByMinimalistCollectionHolder}                                                                                     from "../src/method/containsNotOne.withArray"
import {containsNotOneWithCollectionHolder, containsNotOneWithCollectionHolderByArray, containsNotOneWithCollectionHolderByCollectionHolder, containsNotOneWithCollectionHolderByMinimalistCollectionHolder}                                         from "../src/method/containsNotOne.withCollectionHolder"
import {containsNotOneWithCollectionIterator, containsNotOneWithCollectionIteratorByArray, containsNotOneWithCollectionIteratorByCollectionHolder, containsNotOneWithCollectionIteratorByMinimalistCollectionHolder}                                 from "../src/method/containsNotOne.withCollectionIterator"
import {containsNotOneWithIterable, containsNotOneWithIterableByArray, containsNotOneWithIterableByCollectionHolder, containsNotOneWithIterableByMinimalistCollectionHolder}                                                                         from "../src/method/containsNotOne.withIterable"
import {containsNotOneWithIterator, containsNotOneWithIteratorByArray, containsNotOneWithIteratorByCollectionHolder, containsNotOneWithIteratorByMinimalistCollectionHolder}                                                                         from "../src/method/containsNotOne.withIterator"
import {containsNotOneWithMinimalistCollectionHolder, containsNotOneWithMinimalistCollectionHolderByArray, containsNotOneWithMinimalistCollectionHolderByCollectionHolder, containsNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "../src/method/containsNotOne.withMinimalistCollectionHolder"
import {containsNotOneWithSet, containsNotOneWithSetByArray, containsNotOneWithSetByCollectionHolder, containsNotOneWithSetByMinimalistCollectionHolder}                                                                                             from "../src/method/containsNotOne.withSet"
import {containsNoDuplicates, containsNoDuplicatesByArray, containsNoDuplicatesByCollectionHolder, containsNoDuplicatesByMinimalistCollectionHolder}                                                                                                 from "../src/method/containsNoDuplicates"
import {containsNoNulls, containsNoNullsByArray, containsNoNullsByCollectionHolder, containsNoNullsByMinimalistCollectionHolder}                                                                                                                     from "../src/method/containsNoNulls"
import {containsNull, containsNullByArray, containsNullByCollectionHolder, containsNullByMinimalistCollectionHolder}                                                                                                                                 from "../src/method/containsNull"
import {containsOne, containsOneByArray, containsOneByCollectionHolder, containsOneByMinimalistCollectionHolder}                                                                                                                                     from "../src/method/containsOne"
import {containsOneWithArray, containsOneWithArrayByArray, containsOneWithArrayByCollectionHolder, containsOneWithArrayByMinimalistCollectionHolder}                                                                                                 from "../src/method/containsOne.withArray"
import {containsOneWithCollectionHolder, containsOneWithCollectionHolderByArray, containsOneWithCollectionHolderByCollectionHolder, containsOneWithCollectionHolderByMinimalistCollectionHolder}                                                     from "../src/method/containsOne.withCollectionHolder"
import {containsOneWithCollectionIterator, containsOneWithCollectionIteratorByArray, containsOneWithCollectionIteratorByCollectionHolder, containsOneWithCollectionIteratorByMinimalistCollectionHolder}                                             from "../src/method/containsOne.withCollectionIterator"
import {containsOneWithIterable, containsOneWithIterableByArray, containsOneWithIterableByCollectionHolder, containsOneWithIterableByMinimalistCollectionHolder}                                                                                     from "../src/method/containsOne.withIterable"
import {containsOneWithIterator, containsOneWithIteratorByArray, containsOneWithIteratorByCollectionHolder, containsOneWithIteratorByMinimalistCollectionHolder}                                                                                     from "../src/method/containsOne.withIterator"
import {containsOneWithMinimalistCollectionHolder, containsOneWithMinimalistCollectionHolderByArray, containsOneWithMinimalistCollectionHolderByCollectionHolder, containsOneWithMinimalistCollectionHolderByMinimalistCollectionHolder}             from "../src/method/containsOne.withMinimalistCollectionHolder"
import {containsOneWithSet, containsOneWithSetByArray, containsOneWithSetByCollectionHolder, containsOneWithSetByMinimalistCollectionHolder}                                                                                                         from "../src/method/containsOne.withSet"
import * as hasModule                                                                                                                                                                                                                                from "../src/method/has"
import {has, hasByArray, hasByCollectionHolder, hasByMinimalistCollectionHolder}                                                                                                                                                                     from "../src/method/has"
import * as hasAllModule                                                                                                                                                                                                                             from "../src/method/hasAll"
import {hasAll, hasAllByArray, hasAllByCollectionHolder, hasAllByMinimalistCollectionHolder}                                                                                                                                                         from "../src/method/hasAll"
import * as hasAllWithArrayModule                                                                                                                                                                                                                    from "../src/method/hasAll.withArray"
import {hasAllWithArray, hasAllWithArrayByArray, hasAllWithArrayByCollectionHolder, hasAllWithArrayByMinimalistCollectionHolder}                                                                                                                     from "../src/method/hasAll.withArray"
import * as hasAllWithCollectionHolderModule                                                                                                                                                                                                         from "../src/method/hasAll.withCollectionHolder"
import {hasAllWithCollectionHolder, hasAllWithCollectionHolderByArray, hasAllWithCollectionHolderByCollectionHolder, hasAllWithCollectionHolderByMinimalistCollectionHolder}                                                                         from "../src/method/hasAll.withCollectionHolder"
import * as hasAllWithCollectionIteratorModule                                                                                                                                                                                                       from "../src/method/hasAll.withCollectionIterator"
import {hasAllWithCollectionIterator, hasAllWithCollectionIteratorByArray, hasAllWithCollectionIteratorByCollectionHolder, hasAllWithCollectionIteratorByMinimalistCollectionHolder}                                                                 from "../src/method/hasAll.withCollectionIterator"
import * as hasAllWithIterableModule                                                                                                                                                                                                                 from "../src/method/hasAll.withIterable"
import {hasAllWithIterable, hasAllWithIterableByArray, hasAllWithIterableByCollectionHolder, hasAllWithIterableByMinimalistCollectionHolder}                                                                                                         from "../src/method/hasAll.withIterable"
import * as hasAllWithIteratorModule                                                                                                                                                                                                                 from "../src/method/hasAll.withIterator"
import {hasAllWithIterator, hasAllWithIteratorByArray, hasAllWithIteratorByCollectionHolder, hasAllWithIteratorByMinimalistCollectionHolder}                                                                                                         from "../src/method/hasAll.withIterator"
import * as hasAllWithMinimalistCollectionHolderModule                                                                                                                                                                                               from "../src/method/hasAll.withMinimalistCollectionHolder"
import {hasAllWithMinimalistCollectionHolder, hasAllWithMinimalistCollectionHolderByArray, hasAllWithMinimalistCollectionHolderByCollectionHolder, hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder}                                 from "../src/method/hasAll.withMinimalistCollectionHolder"
import * as hasAllWithSetModule                                                                                                                                                                                                                      from "../src/method/hasAll.withSet"
import {hasAllWithSet, hasAllWithSetByArray, hasAllWithSetByCollectionHolder, hasAllWithSetByMinimalistCollectionHolder}                                                                                                                             from "../src/method/hasAll.withSet"
import * as hasDuplicateModule                                                                                                                                                                                                                       from "../src/method/hasDuplicate"
import {hasDuplicate, hasDuplicateByArray, hasDuplicateByCollectionHolder, hasDuplicateByMinimalistCollectionHolder}                                                                                                                                 from "../src/method/hasDuplicate"
import * as hasNotModule                                                                                                                                                                                                                             from "../src/method/hasNot"
import {hasNot, hasNotByArray, hasNotByCollectionHolder, hasNotByMinimalistCollectionHolder}                                                                                                                                                         from "../src/method/hasNot"
import * as hasNotAllModule                                                                                                                                                                                                                          from "../src/method/hasNotAll"
import {hasNotAll, hasNotAllByArray, hasNotAllByCollectionHolder, hasNotAllByMinimalistCollectionHolder}                                                                                                                                             from "../src/method/hasNotAll"
import * as hasNotAllWithArrayModule                                                                                                                                                                                                                 from "../src/method/hasNotAll.withArray"
import {hasNotAllWithArray, hasNotAllWithArrayByArray, hasNotAllWithArrayByCollectionHolder, hasNotAllWithArrayByMinimalistCollectionHolder}                                                                                                         from "../src/method/hasNotAll.withArray"
import * as hasNotAllWithCollectionHolderModule                                                                                                                                                                                                      from "../src/method/hasNotAll.withCollectionHolder"
import {hasNotAllWithCollectionHolder, hasNotAllWithCollectionHolderByArray, hasNotAllWithCollectionHolderByCollectionHolder, hasNotAllWithCollectionHolderByMinimalistCollectionHolder}                                                             from "../src/method/hasNotAll.withCollectionHolder"
import * as hasNotAllWithCollectionIteratorModule                                                                                                                                                                                                    from "../src/method/hasNotAll.withCollectionIterator"
import {hasNotAllWithCollectionIterator, hasNotAllWithCollectionIteratorByArray, hasNotAllWithCollectionIteratorByCollectionHolder, hasNotAllWithCollectionIteratorByMinimalistCollectionHolder}                                                     from "../src/method/hasNotAll.withCollectionIterator"
import * as hasNotAllWithIterableModule                                                                                                                                                                                                              from "../src/method/hasNotAll.withIterable"
import {hasNotAllWithIterable, hasNotAllWithIterableByArray, hasNotAllWithIterableByCollectionHolder, hasNotAllWithIterableByMinimalistCollectionHolder}                                                                                             from "../src/method/hasNotAll.withIterable"
import * as hasNotAllWithIteratorModule                                                                                                                                                                                                              from "../src/method/hasNotAll.withIterator"
import {hasNotAllWithIterator, hasNotAllWithIteratorByArray, hasNotAllWithIteratorByCollectionHolder, hasNotAllWithIteratorByMinimalistCollectionHolder}                                                                                             from "../src/method/hasNotAll.withIterator"
import * as hasNotAllWithMinimalistCollectionHolderModule                                                                                                                                                                                            from "../src/method/hasNotAll.withMinimalistCollectionHolder"
import {hasNotAllWithMinimalistCollectionHolder, hasNotAllWithMinimalistCollectionHolderByArray, hasNotAllWithMinimalistCollectionHolderByCollectionHolder, hasNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder}                     from "../src/method/hasNotAll.withMinimalistCollectionHolder"
import * as hasNotAllWithSetModule                                                                                                                                                                                                                   from "../src/method/hasNotAll.withSet"
import {hasNotAllWithSet, hasNotAllWithSetByArray, hasNotAllWithSetByCollectionHolder, hasNotAllWithSetByMinimalistCollectionHolder}                                                                                                                 from "../src/method/hasNotAll.withSet"
import * as hasNotOneModule                                                                                                                                                                                                                          from "../src/method/hasNotOne"
import {hasNotOne, hasNotOneByArray, hasNotOneByCollectionHolder, hasNotOneByMinimalistCollectionHolder}                                                                                                                                             from "../src/method/hasNotOne"
import * as hasNotOneWithArrayModule                                                                                                                                                                                                                 from "../src/method/hasNotOne.withArray"
import {hasNotOneWithArray, hasNotOneWithArrayByArray, hasNotOneWithArrayByCollectionHolder, hasNotOneWithArrayByMinimalistCollectionHolder}                                                                                                         from "../src/method/hasNotOne.withArray"
import * as hasNotOneWithCollectionHolderModule                                                                                                                                                                                                      from "../src/method/hasNotOne.withCollectionHolder"
import {hasNotOneWithCollectionHolder, hasNotOneWithCollectionHolderByArray, hasNotOneWithCollectionHolderByCollectionHolder, hasNotOneWithCollectionHolderByMinimalistCollectionHolder}                                                             from "../src/method/hasNotOne.withCollectionHolder"
import * as hasNotOneWithCollectionIteratorModule                                                                                                                                                                                                    from "../src/method/hasNotOne.withCollectionIterator"
import {hasNotOneWithCollectionIterator, hasNotOneWithCollectionIteratorByArray, hasNotOneWithCollectionIteratorByCollectionHolder, hasNotOneWithCollectionIteratorByMinimalistCollectionHolder}                                                     from "../src/method/hasNotOne.withCollectionIterator"
import * as hasNotOneWithIterableModule                                                                                                                                                                                                              from "../src/method/hasNotOne.withIterable"
import {hasNotOneWithIterable, hasNotOneWithIterableByArray, hasNotOneWithIterableByCollectionHolder, hasNotOneWithIterableByMinimalistCollectionHolder}                                                                                             from "../src/method/hasNotOne.withIterable"
import * as hasNotOneWithIteratorModule                                                                                                                                                                                                              from "../src/method/hasNotOne.withIterator"
import {hasNotOneWithIterator, hasNotOneWithIteratorByArray, hasNotOneWithIteratorByCollectionHolder, hasNotOneWithIteratorByMinimalistCollectionHolder}                                                                                             from "../src/method/hasNotOne.withIterator"
import * as hasNotOneWithMinimalistCollectionHolderModule                                                                                                                                                                                            from "../src/method/hasNotOne.withMinimalistCollectionHolder"
import {hasNotOneWithMinimalistCollectionHolder, hasNotOneWithMinimalistCollectionHolderByArray, hasNotOneWithMinimalistCollectionHolderByCollectionHolder, hasNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder}                     from "../src/method/hasNotOne.withMinimalistCollectionHolder"
import * as hasNotOneWithSetModule                                                                                                                                                                                                                   from "../src/method/hasNotOne.withSet"
import {hasNotOneWithSet, hasNotOneWithSetByArray, hasNotOneWithSetByCollectionHolder, hasNotOneWithSetByMinimalistCollectionHolder}                                                                                                                 from "../src/method/hasNotOne.withSet"
import * as hasNoDuplicatesModule                                                                                                                                                                                                                    from "../src/method/hasNoDuplicates"
import {hasNoDuplicates, hasNoDuplicatesByArray, hasNoDuplicatesByCollectionHolder, hasNoDuplicatesByMinimalistCollectionHolder}                                                                                                                     from "../src/method/hasNoDuplicates"
import * as hasNoNullsModule                                                                                                                                                                                                                         from "../src/method/hasNoNulls"
import {hasNoNulls, hasNoNullsByArray, hasNoNullsByCollectionHolder, hasNoNullsByMinimalistCollectionHolder}                                                                                                                                         from "../src/method/hasNoNulls"
import * as hasNullModule                                                                                                                                                                                                                            from "../src/method/hasNull"
import {hasNull, hasNullByArray, hasNullByCollectionHolder, hasNullByMinimalistCollectionHolder}                                                                                                                                                     from "../src/method/hasNull"
import * as hasOneModule                                                                                                                                                                                                                             from "../src/method/hasOne"
import {hasOne, hasOneByArray, hasOneByCollectionHolder, hasOneByMinimalistCollectionHolder}                                                                                                                                                         from "../src/method/hasOne"
import * as hasOneWithArrayModule                                                                                                                                                                                                                    from "../src/method/hasOne.withArray"
import {hasOneWithArray, hasOneWithArrayByArray, hasOneWithArrayByCollectionHolder, hasOneWithArrayByMinimalistCollectionHolder}                                                                                                                     from "../src/method/hasOne.withArray"
import * as hasOneWithCollectionHolderModule                                                                                                                                                                                                         from "../src/method/hasOne.withCollectionHolder"
import {hasOneWithCollectionHolder, hasOneWithCollectionHolderByArray, hasOneWithCollectionHolderByCollectionHolder, hasOneWithCollectionHolderByMinimalistCollectionHolder}                                                                         from "../src/method/hasOne.withCollectionHolder"
import * as hasOneWithCollectionIteratorModule                                                                                                                                                                                                       from "../src/method/hasOne.withCollectionIterator"
import {hasOneWithCollectionIterator, hasOneWithCollectionIteratorByArray, hasOneWithCollectionIteratorByCollectionHolder, hasOneWithCollectionIteratorByMinimalistCollectionHolder}                                                                 from "../src/method/hasOne.withCollectionIterator"
import * as hasOneWithIterableModule                                                                                                                                                                                                                 from "../src/method/hasOne.withIterable"
import {hasOneWithIterable, hasOneWithIterableByArray, hasOneWithIterableByCollectionHolder, hasOneWithIterableByMinimalistCollectionHolder}                                                                                                         from "../src/method/hasOne.withIterable"
import * as hasOneWithIteratorModule                                                                                                                                                                                                                 from "../src/method/hasOne.withIterator"
import {hasOneWithIterator, hasOneWithIteratorByArray, hasOneWithIteratorByCollectionHolder, hasOneWithIteratorByMinimalistCollectionHolder}                                                                                                         from "../src/method/hasOne.withIterator"
import * as hasOneWithMinimalistCollectionHolderModule                                                                                                                                                                                               from "../src/method/hasOne.withMinimalistCollectionHolder"
import {hasOneWithMinimalistCollectionHolder, hasOneWithMinimalistCollectionHolderByArray, hasOneWithMinimalistCollectionHolderByCollectionHolder, hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder}                                 from "../src/method/hasOne.withMinimalistCollectionHolder"
import * as hasOneWithSetModule                                                                                                                                                                                                                      from "../src/method/hasOne.withSet"
import {hasOneWithSet, hasOneWithSetByArray, hasOneWithSetByCollectionHolder, hasOneWithSetByMinimalistCollectionHolder}                                                                                                                             from "../src/method/hasOne.withSet"
import {includes, includesByArray, includesByCollectionHolder, includesByMinimalistCollectionHolder}                                                                                                                                                 from "../src/method/includes"
import {includesAll, includesAllByArray, includesAllByCollectionHolder, includesAllByMinimalistCollectionHolder}                                                                                                                                     from "../src/method/includesAll"
import {includesAllWithArray, includesAllWithArrayByArray, includesAllWithArrayByCollectionHolder, includesAllWithArrayByMinimalistCollectionHolder}                                                                                                 from "../src/method/includesAll.withArray"
import {includesAllWithCollectionHolder, includesAllWithCollectionHolderByArray, includesAllWithCollectionHolderByCollectionHolder, includesAllWithCollectionHolderByMinimalistCollectionHolder}                                                     from "../src/method/includesAll.withCollectionHolder"
import {includesAllWithCollectionIterator, includesAllWithCollectionIteratorByArray, includesAllWithCollectionIteratorByCollectionHolder, includesAllWithCollectionIteratorByMinimalistCollectionHolder}                                             from "../src/method/includesAll.withCollectionIterator"
import {includesAllWithIterable, includesAllWithIterableByArray, includesAllWithIterableByCollectionHolder, includesAllWithIterableByMinimalistCollectionHolder}                                                                                     from "../src/method/includesAll.withIterable"
import {includesAllWithIterator, includesAllWithIteratorByArray, includesAllWithIteratorByCollectionHolder, includesAllWithIteratorByMinimalistCollectionHolder}                                                                                     from "../src/method/includesAll.withIterator"
import {includesAllWithMinimalistCollectionHolder, includesAllWithMinimalistCollectionHolderByArray, includesAllWithMinimalistCollectionHolderByCollectionHolder, includesAllWithMinimalistCollectionHolderByMinimalistCollectionHolder}             from "../src/method/includesAll.withMinimalistCollectionHolder"
import {includesAllWithSet, includesAllWithSetByArray, includesAllWithSetByCollectionHolder, includesAllWithSetByMinimalistCollectionHolder}                                                                                                         from "../src/method/includesAll.withSet"
import {includesDuplicate, includesDuplicateByArray, includesDuplicateByCollectionHolder, includesDuplicateByMinimalistCollectionHolder}                                                                                                             from "../src/method/includesDuplicate"
import {includesNot, includesNotByArray, includesNotByCollectionHolder, includesNotByMinimalistCollectionHolder}                                                                                                                                     from "../src/method/includesNot"
import {includesNotAll, includesNotAllByArray, includesNotAllByCollectionHolder, includesNotAllByMinimalistCollectionHolder}                                                                                                                         from "../src/method/includesNotAll"
import {includesNotAllWithArray, includesNotAllWithArrayByArray, includesNotAllWithArrayByCollectionHolder, includesNotAllWithArrayByMinimalistCollectionHolder}                                                                                     from "../src/method/includesNotAll.withArray"
import {includesNotAllWithCollectionHolder, includesNotAllWithCollectionHolderByArray, includesNotAllWithCollectionHolderByCollectionHolder, includesNotAllWithCollectionHolderByMinimalistCollectionHolder}                                         from "../src/method/includesNotAll.withCollectionHolder"
import {includesNotAllWithCollectionIterator, includesNotAllWithCollectionIteratorByArray, includesNotAllWithCollectionIteratorByCollectionHolder, includesNotAllWithCollectionIteratorByMinimalistCollectionHolder}                                 from "../src/method/includesNotAll.withCollectionIterator"
import {includesNotAllWithIterable, includesNotAllWithIterableByArray, includesNotAllWithIterableByCollectionHolder, includesNotAllWithIterableByMinimalistCollectionHolder}                                                                         from "../src/method/includesNotAll.withIterable"
import {includesNotAllWithIterator, includesNotAllWithIteratorByArray, includesNotAllWithIteratorByCollectionHolder, includesNotAllWithIteratorByMinimalistCollectionHolder}                                                                         from "../src/method/includesNotAll.withIterator"
import {includesNotAllWithMinimalistCollectionHolder, includesNotAllWithMinimalistCollectionHolderByArray, includesNotAllWithMinimalistCollectionHolderByCollectionHolder, includesNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "../src/method/includesNotAll.withMinimalistCollectionHolder"
import {includesNotAllWithSet, includesNotAllWithSetByArray, includesNotAllWithSetByCollectionHolder, includesNotAllWithSetByMinimalistCollectionHolder}                                                                                             from "../src/method/includesNotAll.withSet"
import {includesNotOne, includesNotOneByArray, includesNotOneByCollectionHolder, includesNotOneByMinimalistCollectionHolder}                                                                                                                         from "../src/method/includesNotOne"
import {includesNotOneWithArray, includesNotOneWithArrayByArray, includesNotOneWithArrayByCollectionHolder, includesNotOneWithArrayByMinimalistCollectionHolder}                                                                                     from "../src/method/includesNotOne.withArray"
import {includesNotOneWithCollectionHolder, includesNotOneWithCollectionHolderByArray, includesNotOneWithCollectionHolderByCollectionHolder, includesNotOneWithCollectionHolderByMinimalistCollectionHolder}                                         from "../src/method/includesNotOne.withCollectionHolder"
import {includesNotOneWithCollectionIterator, includesNotOneWithCollectionIteratorByArray, includesNotOneWithCollectionIteratorByCollectionHolder, includesNotOneWithCollectionIteratorByMinimalistCollectionHolder}                                 from "../src/method/includesNotOne.withCollectionIterator"
import {includesNotOneWithIterable, includesNotOneWithIterableByArray, includesNotOneWithIterableByCollectionHolder, includesNotOneWithIterableByMinimalistCollectionHolder}                                                                         from "../src/method/includesNotOne.withIterable"
import {includesNotOneWithIterator, includesNotOneWithIteratorByArray, includesNotOneWithIteratorByCollectionHolder, includesNotOneWithIteratorByMinimalistCollectionHolder}                                                                         from "../src/method/includesNotOne.withIterator"
import {includesNotOneWithMinimalistCollectionHolder, includesNotOneWithMinimalistCollectionHolderByArray, includesNotOneWithMinimalistCollectionHolderByCollectionHolder, includesNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "../src/method/includesNotOne.withMinimalistCollectionHolder"
import {includesNotOneWithSet, includesNotOneWithSetByArray, includesNotOneWithSetByCollectionHolder, includesNotOneWithSetByMinimalistCollectionHolder}                                                                                             from "../src/method/includesNotOne.withSet"
import {includesNoDuplicates, includesNoDuplicatesByArray, includesNoDuplicatesByCollectionHolder, includesNoDuplicatesByMinimalistCollectionHolder}                                                                                                 from "../src/method/includesNoDuplicates"
import {includesNoNulls, includesNoNullsByArray, includesNoNullsByCollectionHolder, includesNoNullsByMinimalistCollectionHolder}                                                                                                                     from "../src/method/includesNoNulls"
import {includesNull, includesNullByArray, includesNullByCollectionHolder, includesNullByMinimalistCollectionHolder}                                                                                                                                 from "../src/method/includesNull"
import {includesOne, includesOneByArray, includesOneByCollectionHolder, includesOneByMinimalistCollectionHolder}                                                                                                                                     from "../src/method/includesOne"
import {includesOneWithArray, includesOneWithArrayByArray, includesOneWithArrayByCollectionHolder, includesOneWithArrayByMinimalistCollectionHolder}                                                                                                 from "../src/method/includesOne.withArray"
import {includesOneWithCollectionHolder, includesOneWithCollectionHolderByArray, includesOneWithCollectionHolderByCollectionHolder, includesOneWithCollectionHolderByMinimalistCollectionHolder}                                                     from "../src/method/includesOne.withCollectionHolder"
import {includesOneWithCollectionIterator, includesOneWithCollectionIteratorByArray, includesOneWithCollectionIteratorByCollectionHolder, includesOneWithCollectionIteratorByMinimalistCollectionHolder}                                             from "../src/method/includesOne.withCollectionIterator"
import {includesOneWithIterable, includesOneWithIterableByArray, includesOneWithIterableByCollectionHolder, includesOneWithIterableByMinimalistCollectionHolder}                                                                                     from "../src/method/includesOne.withIterable"
import {includesOneWithIterator, includesOneWithIteratorByArray, includesOneWithIteratorByCollectionHolder, includesOneWithIteratorByMinimalistCollectionHolder}                                                                                     from "../src/method/includesOne.withIterator"
import {includesOneWithMinimalistCollectionHolder, includesOneWithMinimalistCollectionHolderByArray, includesOneWithMinimalistCollectionHolderByCollectionHolder, includesOneWithMinimalistCollectionHolderByMinimalistCollectionHolder}             from "../src/method/includesOne.withMinimalistCollectionHolder"
import {includesOneWithSet, includesOneWithSetByArray, includesOneWithSetByCollectionHolder, includesOneWithSetByMinimalistCollectionHolder}                                                                                                         from "../src/method/includesOne.withSet"

describe("CollectionHolderTest (has)", () => {
    const everyEmptyInstances = [
        new Holder(() => EMPTY,                                           "array",),
        new Holder(() => new Set(EMPTY,),                                 "set",),
        new Holder(() => new CollectionHolderFromArray(EMPTY,),           "collection holder",),
        new Holder(() => new MinimalistCollectionHolderFromArray(EMPTY,), "minimalist collection holder",),
        new Holder(() => new MinimalistCollectionHolderFromArray(EMPTY,), "minimalist collection holder",),
        new Holder(() => new CollectionIteratorFromArray(EMPTY,),         "collection iterator",),
        new Holder(() => new IteratorForTest(EMPTY,),                     "iterator",),
        new Holder(() => new IterableForTest(EMPTY,),                     "iterable",),
    ] as const satisfies readonly Holder<() => PossibleIterableIteratorArraySetOrCollectionHolder<"">, string>[]
    const everyNonEmptyInstances = [
        new Holder(() => A,                                           "array",),
        new Holder(() => new Set(A,),                                 "set",),
        new Holder(() => new CollectionHolderFromArray(A,),           "collection holder",),
        new Holder(() => new MinimalistCollectionHolderFromArray(A,), "minimalist collection holder",),
        new Holder(() => new MinimalistCollectionHolderFromArray(A,), "minimalist collection holder",),
        new Holder(() => new CollectionIteratorFromArray(A,),         "collection iterator",),
        new Holder(() => new IteratorForTest(A,),                     "iterator",),
        new Holder(() => new IterableForTest(A,),                     "iterable",),
    ] as const satisfies readonly Holder<() => PossibleIterableIteratorArraySetOrCollectionHolder<'a'>, string>[]

    describe("EmptyCollectionHolder", () => {
        test("has",            () => expect(new EmptyCollectionHolderForTest().has(),).toBeFalse(),)
        test("includes",       () => expect(new EmptyCollectionHolderForTest().includes(),).toBeFalse(),)
        test("contains",       () => expect(new EmptyCollectionHolderForTest().contains(),).toBeFalse(),)
        test("hasNot",         () => expect(new EmptyCollectionHolderForTest().hasNot(),).toBeTrue(),)
        test("includesNot",    () => expect(new EmptyCollectionHolderForTest().includesNot(),).toBeTrue(),)
        test("containsNot",    () => expect(new EmptyCollectionHolderForTest().containsNot(),).toBeTrue(),)
        test("hasOne",         () => expect(new EmptyCollectionHolderForTest().hasOne(),).toBeFalse(),)
        test("includesOne",    () => expect(new EmptyCollectionHolderForTest().includesOne(),).toBeFalse(),)
        test("containsOne",    () => expect(new EmptyCollectionHolderForTest().containsOne(),).toBeFalse(),)
        test("hasNotOne",      () => expect(new EmptyCollectionHolderForTest().hasNotOne(),).toBeTrue(),)
        test("includesNotOne", () => expect(new EmptyCollectionHolderForTest().includesNotOne(),).toBeTrue(),)
        test("containsNotOne", () => expect(new EmptyCollectionHolderForTest().containsNotOne(),).toBeTrue(),)

        describe.each(everyIterableInstances,)("hasAll: %s", ({value: it,},) => {
            test("empty",    () => expect(new EmptyCollectionHolderForTest().hasAll(it(EMPTY,),),).toBeTrue(),)
            test("1 field",  () => expect(new EmptyCollectionHolderForTest().hasAll(it(A,),),).toBeFalse(),)
            test("2 fields", () => expect(new EmptyCollectionHolderForTest().hasAll(it(AB,),),).toBeFalse(),)
            test("4 fields", () => expect(new EmptyCollectionHolderForTest().hasAll(it(ABCD,),),).toBeFalse(),)
        },)
        describe.each(everyIterableInstances,)("hasNotAll: %s", ({value: it,},) => {
            test("empty",    () => expect(new EmptyCollectionHolderForTest().hasNotAll(it(EMPTY,),),).toBeFalse(),)
            test("1 field",  () => expect(new EmptyCollectionHolderForTest().hasNotAll(it(A,),),).toBeTrue(),)
            test("2 fields", () => expect(new EmptyCollectionHolderForTest().hasNotAll(it(AB,),),).toBeTrue(),)
            test("4 fields", () => expect(new EmptyCollectionHolderForTest().hasNotAll(it(ABCD,),),).toBeTrue(),)
        },)

        test("hasNull",              () => expect(new EmptyCollectionHolderForTest().hasNull,).toBeFalse(),)
        test("includesNull",         () => expect(new EmptyCollectionHolderForTest().includesNull,).toBeFalse(),)
        test("containsNull",         () => expect(new EmptyCollectionHolderForTest().containsNull,).toBeFalse(),)
        test("hasNoNulls",           () => expect(new EmptyCollectionHolderForTest().hasNoNulls,).toBeTrue(),)
        test("includesNoNulls",      () => expect(new EmptyCollectionHolderForTest().includesNoNulls,).toBeTrue(),)
        test("containsNoNulls",      () => expect(new EmptyCollectionHolderForTest().containsNoNulls,).toBeTrue(),)
        test("hasDuplicate",         () => expect(new EmptyCollectionHolderForTest().hasDuplicate,).toBeFalse(),)
        test("includesDuplicate",    () => expect(new EmptyCollectionHolderForTest().includesDuplicate,).toBeFalse(),)
        test("containsDuplicate",    () => expect(new EmptyCollectionHolderForTest().containsDuplicate,).toBeFalse(),)
        test("hasNoDuplicates",      () => expect(new EmptyCollectionHolderForTest().hasNoDuplicates,).toBeTrue(),)
        test("includesNoDuplicates", () => expect(new EmptyCollectionHolderForTest().includesNoDuplicates,).toBeTrue(),)
        test("containsNoDuplicates", () => expect(new EmptyCollectionHolderForTest().containsNoDuplicates,).toBeTrue(),)
    },)

    describe("aliases", () => {
        const singleValue = 'a'
        const singleValueInArray = ['a',] as const
        describe("GenericCollectionHolder", () => {
            test("includes",             () => expect(new GenericCollectionHolder_HasAlias().execute(it => it.includes(singleValue,),).amountOfCall,).toBe(1,),)
            test("includesNot",          () => expect(new GenericCollectionHolder_HasNotAlias().execute(it => it.includesNot(singleValue,),).amountOfCall,).toBe(1,),)
            test("includesOne",          () => expect(new GenericCollectionHolder_HasOneAlias().execute(it => it.includesOne(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("includesNotOne",       () => expect(new GenericCollectionHolder_HasNotOneAlias().execute(it => it.includesNotOne(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("includesAll",          () => expect(new GenericCollectionHolder_HasAllAlias().execute(it => it.includesAll(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("includesNotAll",       () => expect(new GenericCollectionHolder_HasNotAllAlias().execute(it => it.includesNotAll(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("includesNull",         () => expect(new GenericCollectionHolder_HasNullAlias().execute(it => it.includesNull,).amountOfCall,).toBe(1,),)
            test("includesNoNulls",      () => expect(new GenericCollectionHolder_HasNoNullsAlias().execute(it => it.includesNoNulls,).amountOfCall,).toBe(1,),)
            test("includesDuplicate",    () => expect(new GenericCollectionHolder_HasDuplicateAlias().execute(it => it.includesDuplicate,).amountOfCall,).toBe(1,),)
            test("includesNoDuplicates", () => expect(new GenericCollectionHolder_HasNoDuplicatesAlias().execute(it => it.includesNoDuplicates,).amountOfCall,).toBe(1,),)
            test("contains",             () => expect(new GenericCollectionHolder_HasAlias().execute(it => it.contains(singleValue,),).amountOfCall,).toBe(1,),)
            test("containsNot",          () => expect(new GenericCollectionHolder_HasNotAlias().execute(it => it.containsNot(singleValue,),).amountOfCall,).toBe(1,),)
            test("containsOne",          () => expect(new GenericCollectionHolder_HasOneAlias().execute(it => it.containsOne(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("containsNotOne",       () => expect(new GenericCollectionHolder_HasNotOneAlias().execute(it => it.containsNotOne(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("containsAll",          () => expect(new GenericCollectionHolder_HasAllAlias().execute(it => it.containsAll(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("containsNotAll",       () => expect(new GenericCollectionHolder_HasNotAllAlias().execute(it => it.containsNotAll(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("containsNull",         () => expect(new GenericCollectionHolder_HasNullAlias().execute(it => it.containsNull,).amountOfCall,).toBe(1,),)
            test("containsNoNulls",      () => expect(new GenericCollectionHolder_HasNoNullsAlias().execute(it => it.containsNoNulls,).amountOfCall,).toBe(1,),)
            test("containsDuplicate",    () => expect(new GenericCollectionHolder_HasDuplicateAlias().execute(it => it.containsDuplicate,).amountOfCall,).toBe(1,),)
            test("containsNoDuplicates", () => expect(new GenericCollectionHolder_HasNoDuplicatesAlias().execute(it => it.containsNoDuplicates,).amountOfCall,).toBe(1,),)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("includes",             () => expect(new LazyGenericCollectionHolder_HasAlias().execute(it => it.includes(singleValue,),).amountOfCall,).toBe(1,),)
            test("includesNot",          () => expect(new LazyGenericCollectionHolder_HasNotAlias().execute(it => it.includesNot(singleValue,),).amountOfCall,).toBe(1,),)
            test("includesOne",          () => expect(new LazyGenericCollectionHolder_HasOneAlias().execute(it => it.includesOne(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("includesNotOne",       () => expect(new LazyGenericCollectionHolder_HasNotOneAlias().execute(it => it.includesNotOne(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("includesAll",          () => expect(new LazyGenericCollectionHolder_HasAllAlias().execute(it => it.includesAll(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("includesNotAll",       () => expect(new LazyGenericCollectionHolder_HasNotAllAlias().execute(it => it.includesNotAll(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("includesNull",         () => expect(new LazyGenericCollectionHolder_HasNullAlias().execute(it => it.includesNull,).amountOfCall,).toBe(1,),)
            test("includesNoNulls",      () => expect(new LazyGenericCollectionHolder_HasNoNullsAlias().execute(it => it.includesNoNulls,).amountOfCall,).toBe(1,),)
            test("includesDuplicate",    () => expect(new LazyGenericCollectionHolder_HasDuplicateAlias().execute(it => it.includesDuplicate,).amountOfCall,).toBe(1,),)
            test("includesNoDuplicates", () => expect(new LazyGenericCollectionHolder_HasNoDuplicatesAlias().execute(it => it.includesNoDuplicates,).amountOfCall,).toBe(1,),)
            test("contains",             () => expect(new LazyGenericCollectionHolder_HasAlias().execute(it => it.contains(singleValue,),).amountOfCall,).toBe(1,),)
            test("containsNot",          () => expect(new LazyGenericCollectionHolder_HasNotAlias().execute(it => it.containsNot(singleValue,),).amountOfCall,).toBe(1,),)
            test("containsOne",          () => expect(new LazyGenericCollectionHolder_HasOneAlias().execute(it => it.containsOne(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("containsNotOne",       () => expect(new LazyGenericCollectionHolder_HasNotOneAlias().execute(it => it.containsNotOne(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("containsAll",          () => expect(new LazyGenericCollectionHolder_HasAllAlias().execute(it => it.containsAll(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("containsNotAll",       () => expect(new LazyGenericCollectionHolder_HasNotAllAlias().execute(it => it.containsNotAll(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("containsNull",         () => expect(new LazyGenericCollectionHolder_HasNullAlias().execute(it => it.containsNull,).amountOfCall,).toBe(1,),)
            test("containsNoNulls",      () => expect(new LazyGenericCollectionHolder_HasNoNullsAlias().execute(it => it.containsNoNulls,).amountOfCall,).toBe(1,),)
            test("containsDuplicate",    () => expect(new LazyGenericCollectionHolder_HasDuplicateAlias().execute(it => it.containsDuplicate,).amountOfCall,).toBe(1,),)
            test("containsNoDuplicates", () => expect(new LazyGenericCollectionHolder_HasNoDuplicatesAlias().execute(it => it.containsNoDuplicates,).amountOfCall,).toBe(1,),)
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

        describe("containsNoNulls", () => {
            test("all", () => {
                const method = jest.spyOn(hasNoNullsModule, "hasNoNulls",)
                containsNoNulls(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNoNullsModule, "hasNoNullsByMinimalistCollectionHolder",)
                containsNoNullsByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNoNullsModule, "hasNoNullsByCollectionHolder",)
                containsNoNullsByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNoNullsModule, "hasNoNullsByArray",)
                containsNoNullsByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNoNulls", () => {
            test("all", () => {
                const method = jest.spyOn(hasNoNullsModule, "hasNoNulls",)
                includesNoNulls(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNoNullsModule, "hasNoNullsByMinimalistCollectionHolder",)
                includesNoNullsByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNoNullsModule, "hasNoNullsByCollectionHolder",)
                includesNoNullsByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNoNullsModule, "hasNoNullsByArray",)
                includesNoNullsByArray(A,)
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

        describe("containsNoDuplicates", () => {
            test("all", () => {
                const method = jest.spyOn(hasNoDuplicatesModule, "hasNoDuplicates",)
                containsNoDuplicates(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNoDuplicatesModule, "hasNoDuplicatesByMinimalistCollectionHolder",)
                containsNoDuplicatesByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNoDuplicatesModule, "hasNoDuplicatesByCollectionHolder",)
                containsNoDuplicatesByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNoDuplicatesModule, "hasNoDuplicatesByArray",)
                containsNoDuplicatesByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNoDuplicates", () => {
            test("all", () => {
                const method = jest.spyOn(hasNoDuplicatesModule, "hasNoDuplicates",)
                includesNoDuplicates(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNoDuplicatesModule, "hasNoDuplicatesByMinimalistCollectionHolder",)
                includesNoDuplicatesByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNoDuplicatesModule, "hasNoDuplicatesByCollectionHolder",)
                includesNoDuplicatesByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNoDuplicatesModule, "hasNoDuplicatesByArray",)
                includesNoDuplicatesByArray(A,)
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

        describe("containsNot", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotModule, "hasNot",)
                containsNot(A, "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotModule, "hasNotByMinimalistCollectionHolder",)
                containsNotByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotModule, "hasNotByCollectionHolder",)
                containsNotByCollectionHolder(new CollectionHolderFromArray(A,), "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotModule, "hasNotByArray",)
                containsNotByArray(A, "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNot", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotModule, "hasNot",)
                includesNot(A, "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotModule, "hasNotByMinimalistCollectionHolder",)
                includesNotByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotModule, "hasNotByCollectionHolder",)
                includesNotByCollectionHolder(new CollectionHolderFromArray(A,), "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotModule, "hasNotByArray",)
                includesNotByArray(A, "b",)
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
        describe("containsOne (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIterator",)
                containsOneWithIterator(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIteratorByMinimalistCollectionHolder",)
                containsOneWithIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIteratorByCollectionHolder",)
                containsOneWithIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIteratorByArray",)
                containsOneWithIteratorByArray(A, new IteratorForTest(B,),)
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
        describe("includesOne (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIterator",)
                includesOneWithIterator(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIteratorByMinimalistCollectionHolder",)
                includesOneWithIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIteratorByCollectionHolder",)
                includesOneWithIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIteratorByArray",)
                includesOneWithIteratorByArray(A, new IteratorForTest(B,),)
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

        describe("containsNotOne", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneModule, "hasNotOne",)
                containsNotOne(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneModule, "hasNotOneByMinimalistCollectionHolder",)
                containsNotOneByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneModule, "hasNotOneByCollectionHolder",)
                containsNotOneByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneModule, "hasNotOneByArray",)
                containsNotOneByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotOne (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithArrayModule, "hasNotOneWithArray",)
                containsNotOneWithArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithArrayModule, "hasNotOneWithArrayByMinimalistCollectionHolder",)
                containsNotOneWithArrayByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithArrayModule, "hasNotOneWithArrayByCollectionHolder",)
                containsNotOneWithArrayByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithArrayModule, "hasNotOneWithArrayByArray",)
                containsNotOneWithArrayByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotOne (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithSetModule, "hasNotOneWithSet",)
                containsNotOneWithSet(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithSetModule, "hasNotOneWithSetByMinimalistCollectionHolder",)
                containsNotOneWithSetByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithSetModule, "hasNotOneWithSetByCollectionHolder",)
                containsNotOneWithSetByCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithSetModule, "hasNotOneWithSetByArray",)
                containsNotOneWithSetByArray(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotOne (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithCollectionHolderModule, "hasNotOneWithCollectionHolder",)
                containsNotOneWithCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithCollectionHolderModule, "hasNotOneWithCollectionHolderByMinimalistCollectionHolder",)
                containsNotOneWithCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithCollectionHolderModule, "hasNotOneWithCollectionHolderByCollectionHolder",)
                containsNotOneWithCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithCollectionHolderModule, "hasNotOneWithCollectionHolderByArray",)
                containsNotOneWithCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotOne (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithMinimalistCollectionHolderModule, "hasNotOneWithMinimalistCollectionHolder",)
                containsNotOneWithMinimalistCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithMinimalistCollectionHolderModule, "hasNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                containsNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithMinimalistCollectionHolderModule, "hasNotOneWithMinimalistCollectionHolderByCollectionHolder",)
                containsNotOneWithMinimalistCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithMinimalistCollectionHolderModule, "hasNotOneWithMinimalistCollectionHolderByArray",)
                containsNotOneWithMinimalistCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotOne (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithCollectionIteratorModule, "hasNotOneWithCollectionIterator",)
                containsNotOneWithCollectionIterator(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithCollectionIteratorModule, "hasNotOneWithCollectionIteratorByMinimalistCollectionHolder",)
                containsNotOneWithCollectionIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithCollectionIteratorModule, "hasNotOneWithCollectionIteratorByCollectionHolder",)
                containsNotOneWithCollectionIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithCollectionIteratorModule, "hasNotOneWithCollectionIteratorByArray",)
                containsNotOneWithCollectionIteratorByArray(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotOne (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithIteratorModule, "hasNotOneWithIterator",)
                containsNotOneWithIterator(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithIteratorModule, "hasNotOneWithIteratorByMinimalistCollectionHolder",)
                containsNotOneWithIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithIteratorModule, "hasNotOneWithIteratorByCollectionHolder",)
                containsNotOneWithIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithIteratorModule, "hasNotOneWithIteratorByArray",)
                containsNotOneWithIteratorByArray(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotOne (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithIterableModule, "hasNotOneWithIterable",)
                containsNotOneWithIterable(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithIterableModule, "hasNotOneWithIterableByMinimalistCollectionHolder",)
                containsNotOneWithIterableByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithIterableModule, "hasNotOneWithIterableByCollectionHolder",)
                containsNotOneWithIterableByCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithIterableModule, "hasNotOneWithIterableByArray",)
                containsNotOneWithIterableByArray(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotOne", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneModule, "hasNotOne",)
                includesNotOne(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneModule, "hasNotOneByMinimalistCollectionHolder",)
                includesNotOneByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneModule, "hasNotOneByCollectionHolder",)
                includesNotOneByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneModule, "hasNotOneByArray",)
                includesNotOneByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotOne (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithArrayModule, "hasNotOneWithArray",)
                includesNotOneWithArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithArrayModule, "hasNotOneWithArrayByMinimalistCollectionHolder",)
                includesNotOneWithArrayByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithArrayModule, "hasNotOneWithArrayByCollectionHolder",)
                includesNotOneWithArrayByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithArrayModule, "hasNotOneWithArrayByArray",)
                includesNotOneWithArrayByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotOne (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithSetModule, "hasNotOneWithSet",)
                includesNotOneWithSet(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithSetModule, "hasNotOneWithSetByMinimalistCollectionHolder",)
                includesNotOneWithSetByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithSetModule, "hasNotOneWithSetByCollectionHolder",)
                includesNotOneWithSetByCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithSetModule, "hasNotOneWithSetByArray",)
                includesNotOneWithSetByArray(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotOne (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithCollectionHolderModule, "hasNotOneWithCollectionHolder",)
                includesNotOneWithCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithCollectionHolderModule, "hasNotOneWithCollectionHolderByMinimalistCollectionHolder",)
                includesNotOneWithCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithCollectionHolderModule, "hasNotOneWithCollectionHolderByCollectionHolder",)
                includesNotOneWithCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithCollectionHolderModule, "hasNotOneWithCollectionHolderByArray",)
                includesNotOneWithCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotOne (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithMinimalistCollectionHolderModule, "hasNotOneWithMinimalistCollectionHolder",)
                includesNotOneWithMinimalistCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithMinimalistCollectionHolderModule, "hasNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                includesNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithMinimalistCollectionHolderModule, "hasNotOneWithMinimalistCollectionHolderByCollectionHolder",)
                includesNotOneWithMinimalistCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithMinimalistCollectionHolderModule, "hasNotOneWithMinimalistCollectionHolderByArray",)
                includesNotOneWithMinimalistCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotOne (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithCollectionIteratorModule, "hasNotOneWithCollectionIterator",)
                includesNotOneWithCollectionIterator(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithCollectionIteratorModule, "hasNotOneWithCollectionIteratorByMinimalistCollectionHolder",)
                includesNotOneWithCollectionIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithCollectionIteratorModule, "hasNotOneWithCollectionIteratorByCollectionHolder",)
                includesNotOneWithCollectionIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithCollectionIteratorModule, "hasNotOneWithCollectionIteratorByArray",)
                includesNotOneWithCollectionIteratorByArray(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotOne (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithIteratorModule, "hasNotOneWithIterator",)
                includesNotOneWithIterator(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithIteratorModule, "hasNotOneWithIteratorByMinimalistCollectionHolder",)
                includesNotOneWithIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithIteratorModule, "hasNotOneWithIteratorByCollectionHolder",)
                includesNotOneWithIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithIteratorModule, "hasNotOneWithIteratorByArray",)
                includesNotOneWithIteratorByArray(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotOne (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithIterableModule, "hasNotOneWithIterable",)
                includesNotOneWithIterable(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithIterableModule, "hasNotOneWithIterableByMinimalistCollectionHolder",)
                includesNotOneWithIterableByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithIterableModule, "hasNotOneWithIterableByCollectionHolder",)
                includesNotOneWithIterableByCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithIterableModule, "hasNotOneWithIterableByArray",)
                includesNotOneWithIterableByArray(A, new IterableForTest(B,),)
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
        describe("containsAll (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIterator",)
                containsAllWithIterator(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIteratorByMinimalistCollectionHolder",)
                containsAllWithIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIteratorByCollectionHolder",)
                containsAllWithIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIteratorByArray",)
                containsAllWithIteratorByArray(A, new IteratorForTest(B,),)
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
        describe("includesAll (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIterator",)
                includesAllWithIterator(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIteratorByMinimalistCollectionHolder",)
                includesAllWithIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIteratorByCollectionHolder",)
                includesAllWithIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIteratorByArray",)
                includesAllWithIteratorByArray(A, new IteratorForTest(B,),)
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

        describe("containsNotAll", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllModule, "hasNotAll",)
                containsNotAll(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllModule, "hasNotAllByMinimalistCollectionHolder",)
                containsNotAllByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllModule, "hasNotAllByCollectionHolder",)
                containsNotAllByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllModule, "hasNotAllByArray",)
                containsNotAllByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotAll (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithArrayModule, "hasNotAllWithArray",)
                containsNotAllWithArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithArrayModule, "hasNotAllWithArrayByMinimalistCollectionHolder",)
                containsNotAllWithArrayByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithArrayModule, "hasNotAllWithArrayByCollectionHolder",)
                containsNotAllWithArrayByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithArrayModule, "hasNotAllWithArrayByArray",)
                containsNotAllWithArrayByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotAll (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithSetModule, "hasNotAllWithSet",)
                containsNotAllWithSet(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithSetModule, "hasNotAllWithSetByMinimalistCollectionHolder",)
                containsNotAllWithSetByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithSetModule, "hasNotAllWithSetByCollectionHolder",)
                containsNotAllWithSetByCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithSetModule, "hasNotAllWithSetByArray",)
                containsNotAllWithSetByArray(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotAll (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithCollectionHolderModule, "hasNotAllWithCollectionHolder",)
                containsNotAllWithCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithCollectionHolderModule, "hasNotAllWithCollectionHolderByMinimalistCollectionHolder",)
                containsNotAllWithCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithCollectionHolderModule, "hasNotAllWithCollectionHolderByCollectionHolder",)
                containsNotAllWithCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithCollectionHolderModule, "hasNotAllWithCollectionHolderByArray",)
                containsNotAllWithCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotAll (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithMinimalistCollectionHolderModule, "hasNotAllWithMinimalistCollectionHolder",)
                containsNotAllWithMinimalistCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithMinimalistCollectionHolderModule, "hasNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                containsNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithMinimalistCollectionHolderModule, "hasNotAllWithMinimalistCollectionHolderByCollectionHolder",)
                containsNotAllWithMinimalistCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithMinimalistCollectionHolderModule, "hasNotAllWithMinimalistCollectionHolderByArray",)
                containsNotAllWithMinimalistCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotAll (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithCollectionIteratorModule, "hasNotAllWithCollectionIterator",)
                containsNotAllWithCollectionIterator(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithCollectionIteratorModule, "hasNotAllWithCollectionIteratorByMinimalistCollectionHolder",)
                containsNotAllWithCollectionIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithCollectionIteratorModule, "hasNotAllWithCollectionIteratorByCollectionHolder",)
                containsNotAllWithCollectionIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithCollectionIteratorModule, "hasNotAllWithCollectionIteratorByArray",)
                containsNotAllWithCollectionIteratorByArray(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotAll (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithIteratorModule, "hasNotAllWithIterator",)
                containsNotAllWithIterator(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithIteratorModule, "hasNotAllWithIteratorByMinimalistCollectionHolder",)
                containsNotAllWithIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithIteratorModule, "hasNotAllWithIteratorByCollectionHolder",)
                containsNotAllWithIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithIteratorModule, "hasNotAllWithIteratorByArray",)
                containsNotAllWithIteratorByArray(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotAll (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithIterableModule, "hasNotAllWithIterable",)
                containsNotAllWithIterable(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithIterableModule, "hasNotAllWithIterableByMinimalistCollectionHolder",)
                containsNotAllWithIterableByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithIterableModule, "hasNotAllWithIterableByCollectionHolder",)
                containsNotAllWithIterableByCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithIterableModule, "hasNotAllWithIterableByArray",)
                containsNotAllWithIterableByArray(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotAll", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllModule, "hasNotAll",)
                includesNotAll(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllModule, "hasNotAllByMinimalistCollectionHolder",)
                includesNotAllByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllModule, "hasNotAllByCollectionHolder",)
                includesNotAllByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllModule, "hasNotAllByArray",)
                includesNotAllByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotAll (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithArrayModule, "hasNotAllWithArray",)
                includesNotAllWithArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithArrayModule, "hasNotAllWithArrayByMinimalistCollectionHolder",)
                includesNotAllWithArrayByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithArrayModule, "hasNotAllWithArrayByCollectionHolder",)
                includesNotAllWithArrayByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithArrayModule, "hasNotAllWithArrayByArray",)
                includesNotAllWithArrayByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotAll (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithSetModule, "hasNotAllWithSet",)
                includesNotAllWithSet(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithSetModule, "hasNotAllWithSetByMinimalistCollectionHolder",)
                includesNotAllWithSetByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithSetModule, "hasNotAllWithSetByCollectionHolder",)
                includesNotAllWithSetByCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithSetModule, "hasNotAllWithSetByArray",)
                includesNotAllWithSetByArray(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotAll (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithCollectionHolderModule, "hasNotAllWithCollectionHolder",)
                includesNotAllWithCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithCollectionHolderModule, "hasNotAllWithCollectionHolderByMinimalistCollectionHolder",)
                includesNotAllWithCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithCollectionHolderModule, "hasNotAllWithCollectionHolderByCollectionHolder",)
                includesNotAllWithCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithCollectionHolderModule, "hasNotAllWithCollectionHolderByArray",)
                includesNotAllWithCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotAll (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithMinimalistCollectionHolderModule, "hasNotAllWithMinimalistCollectionHolder",)
                includesNotAllWithMinimalistCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithMinimalistCollectionHolderModule, "hasNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                includesNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithMinimalistCollectionHolderModule, "hasNotAllWithMinimalistCollectionHolderByCollectionHolder",)
                includesNotAllWithMinimalistCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithMinimalistCollectionHolderModule, "hasNotAllWithMinimalistCollectionHolderByArray",)
                includesNotAllWithMinimalistCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotAll (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithCollectionIteratorModule, "hasNotAllWithCollectionIterator",)
                includesNotAllWithCollectionIterator(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithCollectionIteratorModule, "hasNotAllWithCollectionIteratorByMinimalistCollectionHolder",)
                includesNotAllWithCollectionIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithCollectionIteratorModule, "hasNotAllWithCollectionIteratorByCollectionHolder",)
                includesNotAllWithCollectionIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithCollectionIteratorModule, "hasNotAllWithCollectionIteratorByArray",)
                includesNotAllWithCollectionIteratorByArray(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotAll (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithIteratorModule, "hasNotAllWithIterator",)
                includesNotAllWithIterator(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithIteratorModule, "hasNotAllWithIteratorByMinimalistCollectionHolder",)
                includesNotAllWithIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithIteratorModule, "hasNotAllWithIteratorByCollectionHolder",)
                includesNotAllWithIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithIteratorModule, "hasNotAllWithIteratorByArray",)
                includesNotAllWithIteratorByArray(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotAll (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithIterableModule, "hasNotAllWithIterable",)
                includesNotAllWithIterable(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithIterableModule, "hasNotAllWithIterableByMinimalistCollectionHolder",)
                includesNotAllWithIterableByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithIterableModule, "hasNotAllWithIterableByCollectionHolder",)
                includesNotAllWithIterableByCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithIterableModule, "hasNotAllWithIterableByArray",)
                includesNotAllWithIterableByArray(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
    },)

    describe.each(NULL_UNDEFINED,)("%s", it => {
        describe("hasNull", () => {
            test("all",                          () => expect(hasNull(it,),).toBeFalse(),)
            test("minimalist collection holder", () => expect(hasNullByMinimalistCollectionHolder(it,),).toBeFalse(),)
            test("collection holder",            () => expect(hasNullByCollectionHolder(it,),).toBeFalse(),)
            test("array",                        () => expect(hasNullByArray(it,),).toBeFalse(),)
        },)
        describe("hasNoNulls", () => {
            test("all",                          () => expect(hasNoNulls(it,),).toBeTrue(),)
            test("minimalist collection holder", () => expect(hasNoNullsByMinimalistCollectionHolder(it,),).toBeTrue(),)
            test("collection holder",            () => expect(hasNoNullsByCollectionHolder(it,),).toBeTrue(),)
            test("array",                        () => expect(hasNoNullsByArray(it,),).toBeTrue(),)
        },)

        describe("hasDuplicate", () => {
            test("all",                          () => expect(hasDuplicate(it,),).toBeFalse(),)
            test("minimalist collection holder", () => expect(hasDuplicateByMinimalistCollectionHolder(it,),).toBeFalse(),)
            test("collection holder",            () => expect(hasDuplicateByCollectionHolder(it,),).toBeFalse(),)
            test("array",                        () => expect(hasDuplicateByArray(it,),).toBeFalse(),)
        },)
        describe("hasNoDuplicates", () => {
            test("all",                          () => expect(hasNoDuplicates(it,),).toBeTrue(),)
            test("minimalist collection holder", () => expect(hasNoDuplicatesByMinimalistCollectionHolder(it,),).toBeTrue(),)
            test("collection holder",            () => expect(hasNoDuplicatesByCollectionHolder(it,),).toBeTrue(),)
            test("array",                        () => expect(hasNoDuplicatesByArray(it,),).toBeTrue(),)
        },)

        describe("has", () => {
            test("all",                          () => expect(has(it, '',),).toBeFalse(),)
            test("minimalist collection holder", () => expect(hasByMinimalistCollectionHolder(it, '',),).toBeFalse(),)
            test("collection holder",            () => expect(hasByCollectionHolder(it, '',),).toBeFalse(),)
            test("array",                        () => expect(hasByArray(it, '',),).toBeFalse(),)
        },)
        describe("hasNot", () => {
            test("all",                          () => expect(hasNot(it, '',),).toBeTrue(),)
            test("minimalist collection holder", () => expect(hasNotByMinimalistCollectionHolder(it, '',),).toBeTrue(),)
            test("collection holder",            () => expect(hasNotByCollectionHolder(it, '',),).toBeTrue(),)
            test("array",                        () => expect(hasNotByArray(it, '',),).toBeTrue(),)
        },)

        describe("hasOne", () => {
            describe.each(everyEmptyInstances,)("%s (empty)", ({value,},) => {
                test("all",                          () => expect(hasOne(it, value(),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneByMinimalistCollectionHolder(it, value(),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneByCollectionHolder(it, value(),),).toBeFalse(),)
                test("array",                        () => expect(hasOneByArray(it, value(),),).toBeFalse(),)
            },)
            describe.each(everyNonEmptyInstances,)("%s (non-empty)", ({value,},) => {
                test("all",                          () => expect(hasOne(it, value(),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneByMinimalistCollectionHolder(it, value(),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneByCollectionHolder(it, value(),),).toBeFalse(),)
                test("array",                        () => expect(hasOneByArray(it, value(),),).toBeFalse(),)
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
        describe("hasOne (iterator)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasOneWithIterator(it, EMPTY[Symbol.iterator](),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithIteratorByMinimalistCollectionHolder(it, EMPTY[Symbol.iterator](),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithIteratorByCollectionHolder(it, EMPTY[Symbol.iterator](),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithIteratorByArray(it, EMPTY[Symbol.iterator](),),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasOneWithIterator(it, A[Symbol.iterator](),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithIteratorByMinimalistCollectionHolder(it, A[Symbol.iterator](),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithIteratorByCollectionHolder(it, A[Symbol.iterator](),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithIteratorByArray(it, A[Symbol.iterator](),),).toBeFalse(),)
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

        describe("hasNotOne", () => {
            describe.each(everyEmptyInstances,)("%s (empty)", ({value,},) => {
                test("all",                          () => expect(hasNotOne(it, value(),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotOneByMinimalistCollectionHolder(it, value(),),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotOneByCollectionHolder(it, value(),),).toBeTrue(),)
                test("array",                        () => expect(hasNotOneByArray(it, value(),),).toBeTrue(),)
            },)
            describe.each(everyNonEmptyInstances,)("%s (non-empty)", ({value,},) => {
                test("all",                          () => expect(hasNotOne(it, value(),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotOneByMinimalistCollectionHolder(it, value(),),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotOneByCollectionHolder(it, value(),),).toBeTrue(),)
                test("array",                        () => expect(hasNotOneByArray(it, value(),),).toBeTrue(),)
            },)
        },)
        describe("hasNotOne (array)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasNotOneWithArray(it, EMPTY,),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotOneWithArrayByMinimalistCollectionHolder(it, EMPTY,),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotOneWithArrayByCollectionHolder(it, EMPTY,),).toBeTrue(),)
                test("array",                        () => expect(hasNotOneWithArrayByArray(it, EMPTY,),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasNotOneWithArray(it, A,),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotOneWithArrayByMinimalistCollectionHolder(it, A,),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotOneWithArrayByCollectionHolder(it, A,),).toBeTrue(),)
                test("array",                        () => expect(hasNotOneWithArrayByArray(it, A,),).toBeTrue(),)
            },)
        },)
        describe("hasNotOne (set)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasNotOneWithSet(it, new Set(),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotOneWithSetByMinimalistCollectionHolder(it, new Set(),),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotOneWithSetByCollectionHolder(it, new Set(),),).toBeTrue(),)
                test("array",                        () => expect(hasNotOneWithSetByArray(it, new Set(),),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasNotOneWithSet(it, new Set(A,),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotOneWithSetByMinimalistCollectionHolder(it, new Set(A,),),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotOneWithSetByCollectionHolder(it, new Set(A,),),).toBeTrue(),)
                test("array",                        () => expect(hasNotOneWithSetByArray(it, new Set(A,),),).toBeTrue(),)
            },)
        },)
        describe("hasNotOne (collection holder)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasNotOneWithCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotOneWithCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotOneWithCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
                test("array",                        () => expect(hasNotOneWithCollectionHolderByArray(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasNotOneWithCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotOneWithCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotOneWithCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeTrue(),)
                test("array",                        () => expect(hasNotOneWithCollectionHolderByArray(it, new CollectionHolderFromArray(A,),),).toBeTrue(),)
            },)
        },)
        describe("hasNotOne (minimalist collection holder)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasNotOneWithMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotOneWithMinimalistCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
                test("array",                        () => expect(hasNotOneWithMinimalistCollectionHolderByArray(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasNotOneWithMinimalistCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotOneWithMinimalistCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeTrue(),)
                test("array",                        () => expect(hasNotOneWithMinimalistCollectionHolderByArray(it, new CollectionHolderFromArray(A,),),).toBeTrue(),)
            },)
        },)
        describe("hasNotOne (collection iterator)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasNotOneWithCollectionIterator(it, new CollectionIteratorFromArray(EMPTY,),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotOneWithCollectionIteratorByMinimalistCollectionHolder(it, new CollectionIteratorFromArray(EMPTY,),),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotOneWithCollectionIteratorByCollectionHolder(it, new CollectionIteratorFromArray(EMPTY,),),).toBeTrue(),)
                test("array",                        () => expect(hasNotOneWithCollectionIteratorByArray(it, new CollectionIteratorFromArray(EMPTY,),),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasNotOneWithCollectionIterator(it, new CollectionIteratorFromArray(A,),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotOneWithCollectionIteratorByMinimalistCollectionHolder(it, new CollectionIteratorFromArray(A,),),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotOneWithCollectionIteratorByCollectionHolder(it, new CollectionIteratorFromArray(A,),),).toBeTrue(),)
                test("array",                        () => expect(hasNotOneWithCollectionIteratorByArray(it, new CollectionIteratorFromArray(A,),),).toBeTrue(),)
            },)
        },)
        describe("hasNotOne (iterator)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasNotOneWithIterator(it, EMPTY[Symbol.iterator](),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotOneWithIteratorByMinimalistCollectionHolder(it, EMPTY[Symbol.iterator](),),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotOneWithIteratorByCollectionHolder(it, EMPTY[Symbol.iterator](),),).toBeTrue(),)
                test("array",                        () => expect(hasNotOneWithIteratorByArray(it, EMPTY[Symbol.iterator](),),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasNotOneWithIterator(it, A[Symbol.iterator](),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotOneWithIteratorByMinimalistCollectionHolder(it, A[Symbol.iterator](),),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotOneWithIteratorByCollectionHolder(it, A[Symbol.iterator](),),).toBeTrue(),)
                test("array",                        () => expect(hasNotOneWithIteratorByArray(it, A[Symbol.iterator](),),).toBeTrue(),)
            },)
        },)
        describe("hasNotOne (iterable)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasNotOneWithIterable(it, EMPTY,),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotOneWithIterableByMinimalistCollectionHolder(it, EMPTY,),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotOneWithIterableByCollectionHolder(it, EMPTY,),).toBeTrue(),)
                test("array",                        () => expect(hasNotOneWithIterableByArray(it, EMPTY,),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasNotOneWithIterable(it, A,),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotOneWithIterableByMinimalistCollectionHolder(it, A,),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotOneWithIterableByCollectionHolder(it, A,),).toBeTrue(),)
                test("array",                        () => expect(hasNotOneWithIterableByArray(it, A,),).toBeTrue(),)
            },)
        },)

        describe("hasAll", () => {
            describe.each(everyEmptyInstances,)("%s (empty)", ({value,},) => {
                test("all",                          () => expect(hasAll(it, value(),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasAllByMinimalistCollectionHolder(it, value(),),).toBeTrue(),)
                test("collection holder",            () => expect(hasAllByCollectionHolder(it, value(),),).toBeTrue(),)
                test("array",                        () => expect(hasAllByArray(it, value(),),).toBeTrue(),)
            },)
            describe.each(everyNonEmptyInstances,)("%s (non-empty)", ({value,},) => {
                test("all",                          () => expect(hasAll(it, value(),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasAllByMinimalistCollectionHolder(it, value(),),).toBeFalse(),)
                test("collection holder",            () => expect(hasAllByCollectionHolder(it, value(),),).toBeFalse(),)
                test("array",                        () => expect(hasAllByArray(it, value(),),).toBeFalse(),)
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
        describe("hasAll (iterator)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasAllWithIterator(it, EMPTY[Symbol.iterator](),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasAllWithIteratorByMinimalistCollectionHolder(it, EMPTY[Symbol.iterator](),),).toBeTrue(),)
                test("collection holder",            () => expect(hasAllWithIteratorByCollectionHolder(it, EMPTY[Symbol.iterator](),),).toBeTrue(),)
                test("array",                        () => expect(hasAllWithIteratorByArray(it, EMPTY[Symbol.iterator](),),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasAllWithIterator(it, A[Symbol.iterator](),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasAllWithIteratorByMinimalistCollectionHolder(it, A[Symbol.iterator](),),).toBeFalse(),)
                test("collection holder",            () => expect(hasAllWithIteratorByCollectionHolder(it, A[Symbol.iterator](),),).toBeFalse(),)
                test("array",                        () => expect(hasAllWithIteratorByArray(it, A[Symbol.iterator](),),).toBeFalse(),)
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

        describe("hasNotAll", () => {
            describe.each(everyEmptyInstances,)("%s (empty)", ({value,},) => {
                test("all",                          () => expect(hasNotAll(it, value(),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasNotAllByMinimalistCollectionHolder(it, value(),),).toBeFalse(),)
                test("collection holder",            () => expect(hasNotAllByCollectionHolder(it, value(),),).toBeFalse(),)
                test("array",                        () => expect(hasNotAllByArray(it, value(),),).toBeFalse(),)
            },)
            describe.each(everyNonEmptyInstances,)("%s (non-empty)", ({value,},) => {
                test("all",                          () => expect(hasNotAll(it, value(),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotAllByMinimalistCollectionHolder(it, value(),),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotAllByCollectionHolder(it, value(),),).toBeTrue(),)
                test("array",                        () => expect(hasNotAllByArray(it, value(),),).toBeTrue(),)
            },)
        },)
        describe("hasNotAll (array)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasNotAllWithArray(it, EMPTY,),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasNotAllWithArrayByMinimalistCollectionHolder(it, EMPTY,),).toBeFalse(),)
                test("collection holder",            () => expect(hasNotAllWithArrayByCollectionHolder(it, EMPTY,),).toBeFalse(),)
                test("array",                        () => expect(hasNotAllWithArrayByArray(it, EMPTY,),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasNotAllWithArray(it, A,),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotAllWithArrayByMinimalistCollectionHolder(it, A,),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotAllWithArrayByCollectionHolder(it, A,),).toBeTrue(),)
                test("array",                        () => expect(hasNotAllWithArrayByArray(it, A,),).toBeTrue(),)
            },)
        },)
        describe("hasNotAll (set)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasNotAllWithSet(it, new Set(),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasNotAllWithSetByMinimalistCollectionHolder(it, new Set(),),).toBeFalse(),)
                test("collection holder",            () => expect(hasNotAllWithSetByCollectionHolder(it, new Set(),),).toBeFalse(),)
                test("array",                        () => expect(hasNotAllWithSetByArray(it, new Set(),),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasNotAllWithSet(it, new Set(A,),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotAllWithSetByMinimalistCollectionHolder(it, new Set(A,),),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotAllWithSetByCollectionHolder(it, new Set(A,),),).toBeTrue(),)
                test("array",                        () => expect(hasNotAllWithSetByArray(it, new Set(A,),),).toBeTrue(),)
            },)
        },)
        describe("hasNotAll (collection holder)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasNotAllWithCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasNotAllWithCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasNotAllWithCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
                test("array",                        () => expect(hasNotAllWithCollectionHolderByArray(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasNotAllWithCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotAllWithCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotAllWithCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeTrue(),)
                test("array",                        () => expect(hasNotAllWithCollectionHolderByArray(it, new CollectionHolderFromArray(A,),),).toBeTrue(),)
            },)
        },)
        describe("hasNotAll (minimalist collection holder)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasNotAllWithMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasNotAllWithMinimalistCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
                test("array",                        () => expect(hasNotAllWithMinimalistCollectionHolderByArray(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasNotAllWithMinimalistCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotAllWithMinimalistCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeTrue(),)
                test("array",                        () => expect(hasNotAllWithMinimalistCollectionHolderByArray(it, new CollectionHolderFromArray(A,),),).toBeTrue(),)
            },)
        },)
        describe("hasNotAll (collection iterator)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasNotAllWithCollectionIterator(it, new CollectionIteratorFromArray(EMPTY,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasNotAllWithCollectionIteratorByMinimalistCollectionHolder(it, new CollectionIteratorFromArray(EMPTY,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasNotAllWithCollectionIteratorByCollectionHolder(it, new CollectionIteratorFromArray(EMPTY,),),).toBeFalse(),)
                test("array",                        () => expect(hasNotAllWithCollectionIteratorByArray(it, new CollectionIteratorFromArray(EMPTY,),),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasNotAllWithCollectionIterator(it, new CollectionIteratorFromArray(A,),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotAllWithCollectionIteratorByMinimalistCollectionHolder(it, new CollectionIteratorFromArray(A,),),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotAllWithCollectionIteratorByCollectionHolder(it, new CollectionIteratorFromArray(A,),),).toBeTrue(),)
                test("array",                        () => expect(hasNotAllWithCollectionIteratorByArray(it, new CollectionIteratorFromArray(A,),),).toBeTrue(),)
            },)
        },)
        describe("hasNotAll (iterator)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasNotAllWithIterator(it, EMPTY[Symbol.iterator](),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasNotAllWithIteratorByMinimalistCollectionHolder(it, EMPTY[Symbol.iterator](),),).toBeFalse(),)
                test("collection holder",            () => expect(hasNotAllWithIteratorByCollectionHolder(it, EMPTY[Symbol.iterator](),),).toBeFalse(),)
                test("array",                        () => expect(hasNotAllWithIteratorByArray(it, EMPTY[Symbol.iterator](),),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasNotAllWithIterator(it, A[Symbol.iterator](),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotAllWithIteratorByMinimalistCollectionHolder(it, A[Symbol.iterator](),),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotAllWithIteratorByCollectionHolder(it, A[Symbol.iterator](),),).toBeTrue(),)
                test("array",                        () => expect(hasNotAllWithIteratorByArray(it, A[Symbol.iterator](),),).toBeTrue(),)
            },)
        },)
        describe("hasNotAll (iterable)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasNotAllWithIterable(it, EMPTY,),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasNotAllWithIterableByMinimalistCollectionHolder(it, EMPTY,),).toBeFalse(),)
                test("collection holder",            () => expect(hasNotAllWithIterableByCollectionHolder(it, EMPTY,),).toBeFalse(),)
                test("array",                        () => expect(hasNotAllWithIterableByArray(it, EMPTY,),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasNotAllWithIterable(it, A,),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasNotAllWithIterableByMinimalistCollectionHolder(it, A,),).toBeTrue(),)
                test("collection holder",            () => expect(hasNotAllWithIterableByCollectionHolder(it, A,),).toBeTrue(),)
                test("array",                        () => expect(hasNotAllWithIterableByArray(it, A,),).toBeTrue(),)
            },)
        },)
    },)

    describe.each(everyCollectionInstancesAndExtensionFunctionAsCollectionHolder,)("%s", ({value: {instance, isExtension,},},) => {
        if (!isExtension)
            describe("get() being called", () => {
                describe("has", () => {
                    test("empty",        () => expect(new instance<string>(EMPTY,).execute(it => it.has('a',),).amountOfCall,).toBe(0,),)
                    test("1 field (a)",  () => expect(new instance(A,).execute(it => it.has('a',),).amountOfCall,).toBe(1,),)
                    test("1 field (e)",  () => expect(new instance<string>(A,).execute(it => it.has('e',),).amountOfCall,).toBe(1,),)
                    test("2 fields (a)", () => expect(new instance(AB,).execute(it => it.has('a',),).amountOfCall,).toBe(1,),)
                    test("2 fields (e)", () => expect(new instance<string>(AB,).execute(it => it.has('e',),).amountOfCall,).toBe(2,),)
                    test("4 fields (a)", () => expect(new instance(ABCD,).execute(it => it.has('a',),).amountOfCall,).toBe(1,),)
                    test("4 fields (e)", () => expect(new instance<string>(ABCD,).execute(it => it.has('e',),).amountOfCall,).toBe(4,),)
                },)
                describe("hasNot", () => {
                    test("empty",        () => expect(new instance<string>(EMPTY,).execute(it => it.hasNot('a',),).amountOfCall,).toBe(0,),)
                    test("1 field (a)",  () => expect(new instance(A,).execute(it => it.hasNot('a',),).amountOfCall,).toBe(1,),)
                    test("1 field (e)",  () => expect(new instance<string>(A,).execute(it => it.hasNot('e',),).amountOfCall,).toBe(1,),)
                    test("2 fields (a)", () => expect(new instance(AB,).execute(it => it.hasNot('a',),).amountOfCall,).toBe(1,),)
                    test("2 fields (e)", () => expect(new instance<string>(AB,).execute(it => it.hasNot('e',),).amountOfCall,).toBe(2,),)
                    test("4 fields (a)", () => expect(new instance(ABCD,).execute(it => it.hasNot('a',),).amountOfCall,).toBe(1,),)
                    test("4 fields (e)", () => expect(new instance<string>(ABCD,).execute(it => it.hasNot('e',),).amountOfCall,).toBe(4,),)
                },)
                describe.each(everyIterableInstances,)("hasOne: “%s”", ({value: newIterable,},) => {
                    describe("empty", () => {
                        test("empty",     () => expect(new instance(EMPTY,).execute(it => it.hasOne(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance<string>(EMPTY,).execute(it => it.hasOne(newIterable(AB,),),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("empty",     () => expect(new instance(A,).execute(it => it.hasOne(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance<string>(A,).execute(it => it.hasOne(newIterable(AB,),),).amountOfCall,).toBe(1,),)
                    },)
                    describe("2 fields", () => {
                        test("empty",     () => expect(new instance(AB,).execute(it => it.hasOne(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance(AB,).execute(it => it.hasOne(newIterable(AB,),),).amountOfCall,).toBe(1,),)
                    },)
                    describe("4 fields", () => {
                        test("empty",     () => expect(new instance(ABCD,).execute(it => it.hasOne(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance(ABCD,).execute(it => it.hasOne(newIterable(AB,),),).amountOfCall,).toBe(1,),)
                    },)
                },)
                describe.each(everyIterableInstances,)("hasAll: “%s”", ({value: newIterable,},) => {
                    describe("empty", () => {
                        test("empty",     () => expect(new instance(EMPTY,).execute(it => it.hasAll(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance<string>(EMPTY,).execute(it => it.hasAll(newIterable(AB,),),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("empty",     () => expect(new instance(A,).execute(it => it.hasAll(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance<string>(A,).execute(it => it.hasAll(newIterable(AB,),),).amountOfCall,).toBe(2,),)
                    },)
                    describe("2 fields", () => {
                        test("empty",     () => expect(new instance(AB,).execute(it => it.hasAll(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance(AB,).execute(it => it.hasAll(newIterable(AB,),),).amountOfCall,).toBe(3,),)
                    },)
                    describe("4 fields", () => {
                        test("empty",     () => expect(new instance(ABCD,).execute(it => it.hasAll(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance(ABCD,).execute(it => it.hasAll(newIterable(AB,),),).amountOfCall,).toBe(3,),)
                    },)
                },)
            },)

        describe("has", () => {
            test("empty", () => expect(new instance<string>(EMPTY,).has('a',),).toBeFalse(),)
            describe("1 field", () => {
                test('a', () => expect(new instance(A,).has('a',),).toBeTrue(),)
                test('e', () => expect(new instance<string>(A,).has('e',),).toBeFalse(),)
            },)
            describe("2 fields", () => {
                test('a', () => expect(new instance(AB,).has('a',),).toBeTrue(),)
                test('b', () => expect(new instance(AB,).has('b',),).toBeTrue(),)
                test('e', () => expect(new instance<string>(AB,).has('e',),).toBeFalse(),)
            },)
            describe("4 fields", () => {
                test('a', () => expect(new instance(ABCD,).has('a',),).toBeTrue(),)
                test('b', () => expect(new instance(ABCD,).has('b',),).toBeTrue(),)
                test('c', () => expect(new instance(ABCD,).has('c',),).toBeTrue(),)
                test('d', () => expect(new instance(ABCD,).has('d',),).toBeTrue(),)
                test('e', () => expect(new instance<string>(ABCD,).has('e',),).toBeFalse(),)
            },)
        },)
        describe("hasNot", () => {
            test("empty", () => expect(new instance<string>(EMPTY,).hasNot('a',),).toBeTrue(),)
            describe("1 field", () => {
                test('a', () => expect(new instance(A,).hasNot('a',),).toBeFalse(),)
                test('e', () => expect(new instance<string>(A,).hasNot('e',),).toBeTrue(),)
            },)
            describe("2 fields", () => {
                test('a', () => expect(new instance(AB,).hasNot('a',),).toBeFalse(),)
                test('b', () => expect(new instance(AB,).hasNot('b',),).toBeFalse(),)
                test('e', () => expect(new instance<string>(AB,).hasNot('e',),).toBeTrue(),)
            },)
            describe("4 fields", () => {
                test('a', () => expect(new instance(ABCD,).hasNot('a',),).toBeFalse(),)
                test('b', () => expect(new instance(ABCD,).hasNot('b',),).toBeFalse(),)
                test('c', () => expect(new instance(ABCD,).hasNot('c',),).toBeFalse(),)
                test('d', () => expect(new instance(ABCD,).hasNot('d',),).toBeFalse(),)
                test('e', () => expect(new instance<string>(ABCD,).hasNot('e',),).toBeTrue(),)
            },)
        },)
        describe.each(everyIterableInstances,)("hasOne: “%s”", ({value: it,},) => {
            describe("empty", () => {
                test("none", () => expect(new instance(EMPTY,).hasOne(it(EMPTY,),),).toBeFalse(),)
                test('a',    () => expect(new instance<string>(EMPTY,).hasOne(it(A,),),).toBeFalse(),)
                test("ab",   () => expect(new instance<string>(EMPTY,).hasOne(it(AB,),),).toBeFalse(),)
                test("abcd", () => expect(new instance<string>(EMPTY,).hasOne(it(ABCD,),),).toBeFalse(),)
            },)
            describe("1 field", () => {
                test("none", () => expect(new instance(A,).hasOne(it(EMPTY,),),).toBeTrue(),)
                test('a',    () => expect(new instance(A,).hasOne(it(A,),),).toBeTrue(),)
                test('e',    () => expect(new instance<string>(A,).hasOne(it(E,),),).toBeFalse(),)
                test("ab",   () => expect(new instance<string>(A,).hasOne(it(AB,),),).toBeTrue(),)
                test("ef",   () => expect(new instance<string>(A,).hasOne(it(EF,),),).toBeFalse(),)
                test("abcd", () => expect(new instance<string>(A,).hasOne(it(ABCD,),),).toBeTrue(),)
                test("efgh", () => expect(new instance<string>(A,).hasOne(it(EFGH,),),).toBeFalse(),)
            },)
            describe("2 fields", () => {
                test("none", () => expect(new instance(AB,).hasOne(it(EMPTY,),),).toBeTrue(),)
                test('a',    () => expect(new instance(AB,).hasOne(it(A,),),).toBeTrue(),)
                test('b',    () => expect(new instance(AB,).hasOne(it(B,),),).toBeTrue(),)
                test('e',    () => expect(new instance<string>(AB,).hasOne(it(E,),),).toBeFalse(),)
                test("ab",   () => expect(new instance(AB,).hasOne(it(AB,),),).toBeTrue(),)
                test("ef",   () => expect(new instance<string>(AB,).hasOne(it(EF,),),).toBeFalse(),)
                test("abcd", () => expect(new instance<string>(AB,).hasOne(it(ABCD,),),).toBeTrue(),)
                test("efgh", () => expect(new instance<string>(AB,).hasOne(it(EFGH,),),).toBeFalse(),)
            },)
            describe("4 fields", () => {
                test("none", () => expect(new instance(ABCD,).hasOne(it(EMPTY,),),).toBeTrue(),)
                test('a',    () => expect(new instance(ABCD,).hasOne(it(A,),),).toBeTrue(),)
                test('b',    () => expect(new instance(ABCD,).hasOne(it(B,),),).toBeTrue(),)
                test('c',    () => expect(new instance(ABCD,).hasOne(it(C,),),).toBeTrue(),)
                test('d',    () => expect(new instance(ABCD,).hasOne(it(D,),),).toBeTrue(),)
                test('e',    () => expect(new instance<string>(ABCD,).hasOne(it(E,),),).toBeFalse(),)
                test("ab",   () => expect(new instance(ABCD,).hasOne(it(AB,),),).toBeTrue(),)
                test("ef",   () => expect(new instance<string>(ABCD,).hasOne(it(EF,),),).toBeFalse(),)
                test("abcd", () => expect(new instance(ABCD,).hasOne(it(ABCD,),),).toBeTrue(),)
                test("efgh", () => expect(new instance<string>(ABCD,).hasOne(it(EFGH,),),).toBeFalse(),)
            },)
        },)
        describe.each(everyIterableInstances,)("hasNotOne: “%s”", ({value: it,},) => {
            describe("empty", () => {
                test("none", () => expect(new instance(EMPTY,).hasNotOne(it(EMPTY,),),).toBeTrue(),)
                test('a',    () => expect(new instance<string>(EMPTY,).hasNotOne(it(A,),),).toBeTrue(),)
                test("ab",   () => expect(new instance<string>(EMPTY,).hasNotOne(it(AB,),),).toBeTrue(),)
                test("abcd", () => expect(new instance<string>(EMPTY,).hasNotOne(it(ABCD,),),).toBeTrue(),)
            },)
            describe("1 field", () => {
                test("none", () => expect(new instance(A,).hasNotOne(it(EMPTY,),),).toBeFalse(),)
                test('a',    () => expect(new instance(A,).hasNotOne(it(A,),),).toBeFalse(),)
                test('e',    () => expect(new instance<string>(A,).hasNotOne(it(E,),),).toBeTrue(),)
                test("ab",   () => expect(new instance<string>(A,).hasNotOne(it(AB,),),).toBeFalse(),)
                test("ef",   () => expect(new instance<string>(A,).hasNotOne(it(EF,),),).toBeTrue(),)
                test("abcd", () => expect(new instance<string>(A,).hasNotOne(it(ABCD,),),).toBeFalse(),)
                test("efgh", () => expect(new instance<string>(A,).hasNotOne(it(EFGH,),),).toBeTrue(),)
            },)
            describe("2 fields", () => {
                test("none", () => expect(new instance(AB,).hasNotOne(it(EMPTY,),),).toBeFalse(),)
                test('a',    () => expect(new instance(AB,).hasNotOne(it(A,),),).toBeFalse(),)
                test('b',    () => expect(new instance(AB,).hasNotOne(it(B,),),).toBeFalse(),)
                test('e',    () => expect(new instance<string>(AB,).hasNotOne(it(E,),),).toBeTrue(),)
                test("ab",   () => expect(new instance(AB,).hasNotOne(it(AB,),),).toBeFalse(),)
                test("ef",   () => expect(new instance<string>(AB,).hasNotOne(it(EF,),),).toBeTrue(),)
                test("abcd", () => expect(new instance<string>(AB,).hasNotOne(it(ABCD,),),).toBeFalse(),)
                test("efgh", () => expect(new instance<string>(AB,).hasNotOne(it(EFGH,),),).toBeTrue(),)
            },)
            describe("4 fields", () => {
                test("none", () => expect(new instance(ABCD,).hasNotOne(it(EMPTY,),),).toBeFalse(),)
                test('a',    () => expect(new instance(ABCD,).hasNotOne(it(A,),),).toBeFalse(),)
                test('b',    () => expect(new instance(ABCD,).hasNotOne(it(B,),),).toBeFalse(),)
                test('c',    () => expect(new instance(ABCD,).hasNotOne(it(C,),),).toBeFalse(),)
                test('d',    () => expect(new instance(ABCD,).hasNotOne(it(D,),),).toBeFalse(),)
                test('e',    () => expect(new instance<string>(ABCD,).hasNotOne(it(E,),),).toBeTrue(),)
                test("ab",   () => expect(new instance(ABCD,).hasNotOne(it(AB,),),).toBeFalse(),)
                test("ef",   () => expect(new instance<string>(ABCD,).hasNotOne(it(EF,),),).toBeTrue(),)
                test("abcd", () => expect(new instance(ABCD,).hasNotOne(it(ABCD,),),).toBeFalse(),)
                test("efgh", () => expect(new instance<string>(ABCD,).hasNotOne(it(EFGH,),),).toBeTrue(),)
            },)
        },)
        describe.each(everyIterableInstances,)("hasAll: “%s”", ({value: it,},) => {
            describe("empty", () => {
                test("none", () => expect(new instance(EMPTY,).hasAll(it(EMPTY,),),).toBeTrue(),)
                test('a',    () => expect(new instance<string>(EMPTY,).hasAll(it(A,),),).toBeFalse(),)
                test("ab",   () => expect(new instance<string>(EMPTY,).hasAll(it(AB,),),).toBeFalse(),)
                test("abcd", () => expect(new instance<string>(EMPTY,).hasAll(it(ABCD,),),).toBeFalse(),)
            },)
            describe("1 field", () => {
                test("none", () => expect(new instance(A,).hasAll(it(EMPTY,),),).toBeTrue(),)
                test('a',    () => expect(new instance(A,).hasAll(it(A,),),).toBeTrue(),)
                test('e',    () => expect(new instance<string>(A,).hasAll(it(E,),),).toBeFalse(),)
                test("ab",   () => expect(new instance<string>(A,).hasAll(it(AB,),),).toBeFalse(),)
                test("ef",   () => expect(new instance<string>(A,).hasAll(it(EF,),),).toBeFalse(),)
                test("abcd", () => expect(new instance<string>(A,).hasAll(it(ABCD,),),).toBeFalse(),)
                test("efgh", () => expect(new instance<string>(A,).hasAll(it(EFGH,),),).toBeFalse(),)
            },)
            describe("2 fields", () => {
                test("none", () => expect(new instance(AB,).hasAll(it(EMPTY,),),).toBeTrue(),)
                test('a',    () => expect(new instance(AB,).hasAll(it(A,),),).toBeTrue(),)
                test('b',    () => expect(new instance(AB,).hasAll(it(B,),),).toBeTrue(),)
                test('e',    () => expect(new instance<string>(AB,).hasAll(it(E,),),).toBeFalse(),)
                test("ab",   () => expect(new instance(AB,).hasAll(it(AB,),),).toBeTrue(),)
                test("ef",   () => expect(new instance<string>(AB,).hasAll(it(EF,),),).toBeFalse(),)
                test("abcd", () => expect(new instance<string>(AB,).hasAll(it(ABCD,),),).toBeFalse(),)
                test("efgh", () => expect(new instance<string>(AB,).hasAll(it(EFGH,),),).toBeFalse(),)
            },)
            describe("4 fields", () => {
                test("none", () => expect(new instance(ABCD,).hasAll(it(EMPTY,),),).toBeTrue(),)
                test('a',    () => expect(new instance(ABCD,).hasAll(it(A,),),).toBeTrue(),)
                test('b',    () => expect(new instance(ABCD,).hasAll(it(B,),),).toBeTrue(),)
                test('c',    () => expect(new instance(ABCD,).hasAll(it(C,),),).toBeTrue(),)
                test('d',    () => expect(new instance(ABCD,).hasAll(it(D,),),).toBeTrue(),)
                test('e',    () => expect(new instance<string>(ABCD,).hasAll(it(E,),),).toBeFalse(),)
                test("ab",   () => expect(new instance(ABCD,).hasAll(it(AB,),),).toBeTrue(),)
                test("ef",   () => expect(new instance<string>(ABCD,).hasAll(it(EF,),),).toBeFalse(),)
                test("abcd", () => expect(new instance(ABCD,).hasAll(it(ABCD,),),).toBeTrue(),)
                test("efgh", () => expect(new instance<string>(ABCD,).hasAll(it(EFGH,),),).toBeFalse(),)
            },)
        },)
        describe.each(everyIterableInstances,)("hasNotAll: “%s”", ({value: it,},) => {
            describe("empty", () => {
                test("none", () => expect(new instance(EMPTY,).hasNotAll(it(EMPTY,),),).toBeFalse(),)
                test('a',    () => expect(new instance<string>(EMPTY,).hasNotAll(it(A,),),).toBeTrue(),)
                test("ab",   () => expect(new instance<string>(EMPTY,).hasNotAll(it(AB,),),).toBeTrue(),)
                test("abcd", () => expect(new instance<string>(EMPTY,).hasNotAll(it(ABCD,),),).toBeTrue(),)
            },)
            describe("1 field", () => {
                test("none", () => expect(new instance(A,).hasNotAll(it(EMPTY,),),).toBeFalse(),)
                test('a',    () => expect(new instance(A,).hasNotAll(it(A,),),).toBeFalse(),)
                test('e',    () => expect(new instance<string>(A,).hasNotAll(it(E,),),).toBeTrue(),)
                test("ab",   () => expect(new instance<string>(A,).hasNotAll(it(AB,),),).toBeTrue(),)
                test("ef",   () => expect(new instance<string>(A,).hasNotAll(it(EF,),),).toBeTrue(),)
                test("abcd", () => expect(new instance<string>(A,).hasNotAll(it(ABCD,),),).toBeTrue(),)
                test("efgh", () => expect(new instance<string>(A,).hasNotAll(it(EFGH,),),).toBeTrue(),)
            },)
            describe("2 fields", () => {
                test("none", () => expect(new instance(AB,).hasNotAll(it(EMPTY,),),).toBeFalse(),)
                test('a',    () => expect(new instance(AB,).hasNotAll(it(A,),),).toBeFalse(),)
                test('b',    () => expect(new instance(AB,).hasNotAll(it(B,),),).toBeFalse(),)
                test('e',    () => expect(new instance<string>(AB,).hasNotAll(it(E,),),).toBeTrue(),)
                test("ab",   () => expect(new instance(AB,).hasNotAll(it(AB,),),).toBeFalse(),)
                test("ef",   () => expect(new instance<string>(AB,).hasNotAll(it(EF,),),).toBeTrue(),)
                test("abcd", () => expect(new instance<string>(AB,).hasNotAll(it(ABCD,),),).toBeTrue(),)
                test("efgh", () => expect(new instance<string>(AB,).hasNotAll(it(EFGH,),),).toBeTrue(),)
            },)
            describe("4 fields", () => {
                test("none", () => expect(new instance(ABCD,).hasNotAll(it(EMPTY,),),).toBeFalse(),)
                test('a',    () => expect(new instance(ABCD,).hasNotAll(it(A,),),).toBeFalse(),)
                test('b',    () => expect(new instance(ABCD,).hasNotAll(it(B,),),).toBeFalse(),)
                test('c',    () => expect(new instance(ABCD,).hasNotAll(it(C,),),).toBeFalse(),)
                test('d',    () => expect(new instance(ABCD,).hasNotAll(it(D,),),).toBeFalse(),)
                test('e',    () => expect(new instance<string>(ABCD,).hasNotAll(it(E,),),).toBeTrue(),)
                test("ab",   () => expect(new instance(ABCD,).hasNotAll(it(AB,),),).toBeFalse(),)
                test("ef",   () => expect(new instance<string>(ABCD,).hasNotAll(it(EF,),),).toBeTrue(),)
                test("abcd", () => expect(new instance(ABCD,).hasNotAll(it(ABCD,),),).toBeFalse(),)
                test("efgh", () => expect(new instance<string>(ABCD,).hasNotAll(it(EFGH,),),).toBeTrue(),)
            },)
        },)
        describe("hasNull", () => {
            test("empty", () => expect(new instance(EMPTY,).hasNull,).toBeFalse(),)
            describe("1 field", () => {
                test("non-null",  () => expect(new instance(A,).hasNull,).toBeFalse(),)
                test("null",      () => expect(new instance(NULL,).hasNull,).toBeTrue(),)
                test("undefined", () => expect(new instance(UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("2 fields", () => {
                test("non-null",           () => expect(new instance(AB,).hasNull,).toBeFalse(),)
                test("null at start",      () => expect(new instance(NULL_A,).hasNull,).toBeTrue(),)
                test("null at end",        () => expect(new instance(A_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start", () => expect(new instance(UNDEFINED_A,).hasNull,).toBeTrue(),)
                test("undefined at end",   () => expect(new instance(A_UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("4 fields", () => {
                test("non-null",            () => expect(new instance(ABCD,).hasNull,).toBeFalse(),)
                test("null at start",       () => expect(new instance(NULL_AB,).hasNull,).toBeTrue(),)
                test("null at center",      () => expect(new instance(A_NULL_B,).hasNull,).toBeTrue(),)
                test("null at end",         () => expect(new instance(AB_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start",  () => expect(new instance(UNDEFINED_AB,).hasNull,).toBeTrue(),)
                test("undefined at center", () => expect(new instance(A_UNDEFINED_B,).hasNull,).toBeTrue(),)
                test("undefined at end",    () => expect(new instance(AB_UNDEFINED,).hasNull,).toBeTrue(),)
                test("null + undefined",    () => expect(new instance(A_NULL_UNDEFINED_B,).hasNull,).toBeTrue(),)
            },)
        },)
        describe("hasNoNulls", () => {
            test("empty", () => expect(new instance(EMPTY,).hasNoNulls,).toBeTrue(),)
            describe("1 field", () => {
                test("non-null",  () => expect(new instance(A,).hasNoNulls,).toBeTrue(),)
                test("null",      () => expect(new instance(NULL,).hasNoNulls,).toBeFalse(),)
                test("undefined", () => expect(new instance(UNDEFINED,).hasNoNulls,).toBeFalse(),)
            },)
            describe("2 fields", () => {
                test("non-null",           () => expect(new instance(AB,).hasNoNulls,).toBeTrue(),)
                test("null at start",      () => expect(new instance(NULL_A,).hasNoNulls,).toBeFalse(),)
                test("null at end",        () => expect(new instance(A_NULL,).hasNoNulls,).toBeFalse(),)
                test("undefined at start", () => expect(new instance(UNDEFINED_A,).hasNoNulls,).toBeFalse(),)
                test("undefined at end",   () => expect(new instance(A_UNDEFINED,).hasNoNulls,).toBeFalse(),)
            },)
            describe("4 fields", () => {
                test("non-null",            () => expect(new instance(ABCD,).hasNoNulls,).toBeTrue(),)
                test("null at start",       () => expect(new instance(NULL_AB,).hasNoNulls,).toBeFalse(),)
                test("null at center",      () => expect(new instance(A_NULL_B,).hasNoNulls,).toBeFalse(),)
                test("null at end",         () => expect(new instance(AB_NULL,).hasNoNulls,).toBeFalse(),)
                test("undefined at start",  () => expect(new instance(UNDEFINED_AB,).hasNoNulls,).toBeFalse(),)
                test("undefined at center", () => expect(new instance(A_UNDEFINED_B,).hasNoNulls,).toBeFalse(),)
                test("undefined at end",    () => expect(new instance(AB_UNDEFINED,).hasNoNulls,).toBeFalse(),)
                test("null + undefined",    () => expect(new instance(A_NULL_UNDEFINED_B,).hasNoNulls,).toBeFalse(),)
            },)
        },)
        describe("hasDuplicate", () => {
            test("empty", () => expect(new instance(EMPTY,).hasDuplicate,).toBeFalse(),)
            test("1 field", () => expect(new instance(A,).hasDuplicate,).toBeFalse(),)
            describe("2 fields", () => {
                test("unique",     () => expect(new instance(AB,).hasDuplicate,).toBeFalse(),)
                test("duplicated", () => expect(new instance(AA,).hasDuplicate,).toBeTrue(),)
            },)
            describe("4|5 fields", () => {
                test("unique",               () => expect(new instance(ABCD,).hasDuplicate,).toBeFalse(),)
                test("duplicative",          () => expect(new instance(ABAB,).hasDuplicate,).toBeTrue(),)
                test("1 null + 1 undefined", () => expect(new instance(A_NULL_UNDEFINED_B,).hasDuplicate,).toBeFalse(),)
                test("2 null + 1 undefined", () => expect(new instance(A_NULL_NULL_UNDEFINED_B,).hasDuplicate,).toBeTrue(),)
                test("1 null + 2 undefined", () => expect(new instance(A_NULL_UNDEFINED_UNDEFINED_B,).hasDuplicate,).toBeTrue(),)
                test("2 a + 1 b",            () => expect(new instance(AABC,).hasDuplicate,).toBeTrue(),)
                test("1 a + 2 b",            () => expect(new instance(ABBC,).hasDuplicate,).toBeTrue(),)
            },)
        },)
        describe("hasNoDuplicates", () => {
            test("empty", () => expect(new instance(EMPTY,).hasNoDuplicates,).toBeTrue(),)
            test("1 field", () => expect(new instance(A,).hasNoDuplicates,).toBeTrue(),)
            describe("2 fields", () => {
                test("unique",     () => expect(new instance(AB,).hasNoDuplicates,).toBeTrue(),)
                test("duplicated", () => expect(new instance(AA,).hasNoDuplicates,).toBeFalse(),)
            },)
            describe("4|5 fields", () => {
                test("unique",               () => expect(new instance(ABCD,).hasNoDuplicates,).toBeTrue(),)
                test("duplicative",          () => expect(new instance(ABAB,).hasNoDuplicates,).toBeFalse(),)
                test("1 null + 1 undefined", () => expect(new instance(A_NULL_UNDEFINED_B,).hasNoDuplicates,).toBeTrue(),)
                test("2 null + 1 undefined", () => expect(new instance(A_NULL_NULL_UNDEFINED_B,).hasNoDuplicates,).toBeFalse(),)
                test("1 null + 2 undefined", () => expect(new instance(A_NULL_UNDEFINED_UNDEFINED_B,).hasNoDuplicates,).toBeFalse(),)
                test("2 a + 1 b",            () => expect(new instance(AABC,).hasNoDuplicates,).toBeFalse(),)
                test("1 a + 2 b",            () => expect(new instance(ABBC,).hasNoDuplicates,).toBeFalse(),)
            },)
        },)
    },)

},)
