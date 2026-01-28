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

import {expectToBeInstance}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            from "./expect/expectToBeInstance"
import {CollectionHolderFromArray}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     from "./instance/CollectionHolderFromArray"
import {CollectionIteratorFromArray}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   from "./instance/CollectionIteratorFromArray"
import {GenericCollectionHolder_HasAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              from "./instance/GenericCollectionHolder_HasAlias"
import {GenericCollectionHolder_HasAllAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           from "./instance/GenericCollectionHolder_HasAllAlias"
import {GenericCollectionHolder_HasDuplicateAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     from "./instance/GenericCollectionHolder_HasDuplicateAlias"
import {GenericCollectionHolder_HasNoDuplicatesAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  from "./instance/GenericCollectionHolder_HasNoDuplicatesAlias"
import {GenericCollectionHolder_HasNoNullsAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       from "./instance/GenericCollectionHolder_HasNoNullsAlias"
import {GenericCollectionHolder_HasNotAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           from "./instance/GenericCollectionHolder_HasNotAlias"
import {GenericCollectionHolder_HasNotAllAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        from "./instance/GenericCollectionHolder_HasNotAllAlias"
import {GenericCollectionHolder_HasNotOneAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        from "./instance/GenericCollectionHolder_HasNotOneAlias"
import {GenericCollectionHolder_HasNullAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          from "./instance/GenericCollectionHolder_HasNullAlias"
import {GenericCollectionHolder_HasOneAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           from "./instance/GenericCollectionHolder_HasOneAlias"
import {Holder}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        from "./Holder"
import {IterableForTest}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               from "./instance/IterableForTest"
import {IteratorForTest}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               from "./instance/IteratorForTest"
import {LazyGenericCollectionHolder_HasAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          from "./instance/LazyGenericCollectionHolder_HasAlias"
import {LazyGenericCollectionHolder_HasAllAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       from "./instance/LazyGenericCollectionHolder_HasAllAlias"
import {LazyGenericCollectionHolder_HasDuplicateAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 from "./instance/LazyGenericCollectionHolder_HasDuplicateAlias"
import {LazyGenericCollectionHolder_HasNoDuplicatesAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              from "./instance/LazyGenericCollectionHolder_HasNoDuplicatesAlias"
import {LazyGenericCollectionHolder_HasNoNullsAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   from "./instance/LazyGenericCollectionHolder_HasNoNullsAlias"
import {LazyGenericCollectionHolder_HasNotAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       from "./instance/LazyGenericCollectionHolder_HasNotAlias"
import {LazyGenericCollectionHolder_HasNotAllAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    from "./instance/LazyGenericCollectionHolder_HasNotAllAlias"
import {LazyGenericCollectionHolder_HasNotOneAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    from "./instance/LazyGenericCollectionHolder_HasNotOneAlias"
import {LazyGenericCollectionHolder_HasNullAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      from "./instance/LazyGenericCollectionHolder_HasNullAlias"
import {LazyGenericCollectionHolder_HasOneAlias}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       from "./instance/LazyGenericCollectionHolder_HasOneAlias"
import {MinimalistCollectionHolderFromArray}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           from "./instance/MinimalistCollectionHolderFromArray"
import {A, A_NULL, A_NULL_B, A_NULL_C_NULL, A_NULL_NULL_B, A_NULL_NULL_UNDEFINED_B, A_NULL_UNDEFINED_B, A_NULL_UNDEFINED_UNDEFINED_B, A_UNDEFINED, A_UNDEFINED_B, A_UNDEFINED_C_UNDEFINED, A_UNDEFINED_NULL_B, A_UNDEFINED_UNDEFINED_B, AA, AABC, AB, AB_NULL, AB_NULL_NULL, AB_NULL_UNDEFINED, AB_UNDEFINED, AB_UNDEFINED_NULL, AB_UNDEFINED_UNDEFINED, ABAB, ABBC, ABCC, ABCD, B, C, D, E, EF, EFGH, EMPTY, NULL, NULL_A, NULL_AB, NULL_NULL_AB, NULL_UNDEFINED, NULL_UNDEFINED_AB, UNDEFINED, UNDEFINED_A, UNDEFINED_AB, UNDEFINED_NULL_AB, UNDEFINED_UNDEFINED_AB} from "./value/arrays"
import {everyExtensionMethodInstances, everyInstances, everyIterableInstances}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         from "./value/instances"

import type {PossibleIterableIteratorArraySetOrCollectionHolder} from "../src/type/possibleInstance"

import {EmptyCollectionHolder}                                                                                                                                                                                                                       from "../src/EmptyCollectionHolder"
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
import * as hasAllModule                                                                                                                                                                                                                             from "../src/method/hasAll"
import * as hasAllWithArrayModule                                                                                                                                                                                                                    from "../src/method/hasAll.withArray"
import * as hasAllWithCollectionHolderModule                                                                                                                                                                                                         from "../src/method/hasAll.withCollectionHolder"
import * as hasAllWithCollectionIteratorModule                                                                                                                                                                                                       from "../src/method/hasAll.withCollectionIterator"
import * as hasAllWithIterableModule                                                                                                                                                                                                                 from "../src/method/hasAll.withIterable"
import * as hasAllWithIteratorModule                                                                                                                                                                                                                 from "../src/method/hasAll.withIterator"
import * as hasAllWithMinimalistCollectionHolderModule                                                                                                                                                                                               from "../src/method/hasAll.withMinimalistCollectionHolder"
import * as hasAllWithSetModule                                                                                                                                                                                                                      from "../src/method/hasAll.withSet"
import * as hasDuplicateModule                                                                                                                                                                                                                       from "../src/method/hasDuplicate"
import * as hasNotModule                                                                                                                                                                                                                             from "../src/method/hasNot"
import * as hasNotAllModule                                                                                                                                                                                                                          from "../src/method/hasNotAll"
import * as hasNotAllWithArrayModule                                                                                                                                                                                                                 from "../src/method/hasNotAll.withArray"
import * as hasNotAllWithCollectionHolderModule                                                                                                                                                                                                      from "../src/method/hasNotAll.withCollectionHolder"
import * as hasNotAllWithCollectionIteratorModule                                                                                                                                                                                                    from "../src/method/hasNotAll.withCollectionIterator"
import * as hasNotAllWithIterableModule                                                                                                                                                                                                              from "../src/method/hasNotAll.withIterable"
import * as hasNotAllWithIteratorModule                                                                                                                                                                                                              from "../src/method/hasNotAll.withIterator"
import * as hasNotAllWithMinimalistCollectionHolderModule                                                                                                                                                                                            from "../src/method/hasNotAll.withMinimalistCollectionHolder"
import * as hasNotAllWithSetModule                                                                                                                                                                                                                   from "../src/method/hasNotAll.withSet"
import * as hasNotOneModule                                                                                                                                                                                                                          from "../src/method/hasNotOne"
import * as hasNotOneWithArrayModule                                                                                                                                                                                                                 from "../src/method/hasNotOne.withArray"
import * as hasNotOneWithCollectionHolderModule                                                                                                                                                                                                      from "../src/method/hasNotOne.withCollectionHolder"
import * as hasNotOneWithCollectionIteratorModule                                                                                                                                                                                                    from "../src/method/hasNotOne.withCollectionIterator"
import * as hasNotOneWithIterableModule                                                                                                                                                                                                              from "../src/method/hasNotOne.withIterable"
import * as hasNotOneWithIteratorModule                                                                                                                                                                                                              from "../src/method/hasNotOne.withIterator"
import * as hasNotOneWithMinimalistCollectionHolderModule                                                                                                                                                                                            from "../src/method/hasNotOne.withMinimalistCollectionHolder"
import * as hasNotOneWithSetModule                                                                                                                                                                                                                   from "../src/method/hasNotOne.withSet"
import * as hasNoDuplicatesModule                                                                                                                                                                                                                    from "../src/method/hasNoDuplicates"
import * as hasNoNullsModule                                                                                                                                                                                                                         from "../src/method/hasNoNulls"
import * as hasNullModule                                                                                                                                                                                                                            from "../src/method/hasNull"
import * as hasOneModule                                                                                                                                                                                                                             from "../src/method/hasOne"
import * as hasOneWithArrayModule                                                                                                                                                                                                                    from "../src/method/hasOne.withArray"
import * as hasOneWithCollectionHolderModule                                                                                                                                                                                                         from "../src/method/hasOne.withCollectionHolder"
import * as hasOneWithCollectionIteratorModule                                                                                                                                                                                                       from "../src/method/hasOne.withCollectionIterator"
import * as hasOneWithIterableModule                                                                                                                                                                                                                 from "../src/method/hasOne.withIterable"
import * as hasOneWithIteratorModule                                                                                                                                                                                                                 from "../src/method/hasOne.withIterator"
import * as hasOneWithMinimalistCollectionHolderModule                                                                                                                                                                                               from "../src/method/hasOne.withMinimalistCollectionHolder"
import * as hasOneWithSetModule                                                                                                                                                                                                                      from "../src/method/hasOne.withSet"
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
        const instance = EmptyCollectionHolder.get

        test("has",            () => expect(instance.has(),).toBeFalse(),)
        test("includes",       () => expect(instance.includes(),).toBeFalse(),)
        test("contains",       () => expect(instance.contains(),).toBeFalse(),)
        test("hasNot",         () => expect(instance.hasNot(),).toBeTrue(),)
        test("includesNot",    () => expect(instance.includesNot(),).toBeTrue(),)
        test("containsNot",    () => expect(instance.containsNot(),).toBeTrue(),)
        test("hasOne",         () => expect(instance.hasOne(),).toBeFalse(),)
        test("includesOne",    () => expect(instance.includesOne(),).toBeFalse(),)
        test("containsOne",    () => expect(instance.containsOne(),).toBeFalse(),)
        test("hasNotOne",      () => expect(instance.hasNotOne(),).toBeTrue(),)
        test("includesNotOne", () => expect(instance.includesNotOne(),).toBeTrue(),)
        test("containsNotOne", () => expect(instance.containsNotOne(),).toBeTrue(),)

        describe.each(everyIterableInstances,)("hasAll: %s", ({value: it,},) => {
            test("empty",    () => expect(instance.hasAll(it(EMPTY,),),).toBeTrue(),)
            test("1 field",  () => expect(instance.hasAll(it(A,),),).toBeFalse(),)
            test("2 fields", () => expect(instance.hasAll(it(AB,),),).toBeFalse(),)
            test("4 fields", () => expect(instance.hasAll(it(ABCD,),),).toBeFalse(),)
        },)
        describe.each(everyIterableInstances,)("hasNotAll: %s", ({value: it,},) => {
            test("empty",    () => expect(instance.hasNotAll(it(EMPTY,),),).toBeFalse(),)
            test("1 field",  () => expect(instance.hasNotAll(it(A,),),).toBeTrue(),)
            test("2 fields", () => expect(instance.hasNotAll(it(AB,),),).toBeTrue(),)
            test("4 fields", () => expect(instance.hasNotAll(it(ABCD,),),).toBeTrue(),)
        },)

        test("hasNull",              () => expect(instance.hasNull,).toBeFalse(),)
        test("includesNull",         () => expect(instance.includesNull,).toBeFalse(),)
        test("containsNull",         () => expect(instance.containsNull,).toBeFalse(),)
        test("hasNoNulls",           () => expect(instance.hasNoNulls,).toBeTrue(),)
        test("includesNoNulls",      () => expect(instance.includesNoNulls,).toBeTrue(),)
        test("containsNoNulls",      () => expect(instance.containsNoNulls,).toBeTrue(),)
        test("hasDuplicate",         () => expect(instance.hasDuplicate,).toBeFalse(),)
        test("includesDuplicate",    () => expect(instance.includesDuplicate,).toBeFalse(),)
        test("containsDuplicate",    () => expect(instance.containsDuplicate,).toBeFalse(),)
        test("hasNoDuplicates",      () => expect(instance.hasNoDuplicates,).toBeTrue(),)
        test("includesNoDuplicates", () => expect(instance.includesNoDuplicates,).toBeTrue(),)
        test("containsNoDuplicates", () => expect(instance.containsNoDuplicates,).toBeTrue(),)

        test("requireNoNulls",   () => expectToBeInstance(instance, it => it.requireNoNulls(),),)
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

        describe("contains", () => {
            test("all", () => {
                const method = jest.spyOn(hasModule, "has",)
                contains(null, 'a',)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasModule, "hasByMinimalistCollectionHolder",)
                containsByMinimalistCollectionHolder(null, 'a',)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasModule, "hasByCollectionHolder",)
                containsByCollectionHolder(null, 'a',)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasModule, "hasByArray",)
                containsByArray(null, 'a',)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includes", () => {
            test("all", () => {
                const method = jest.spyOn(hasModule, "has",)
                includes(null, 'a',)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasModule, "hasByMinimalistCollectionHolder",)
                includesByMinimalistCollectionHolder(null, 'a',)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasModule, "hasByCollectionHolder",)
                includesByCollectionHolder(null, 'a',)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasModule, "hasByArray",)
                includesByArray(null, 'a',)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("containsNot", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotModule, "hasNot",)
                containsNot(null, 'a',)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotModule, "hasNotByMinimalistCollectionHolder",)
                containsNotByMinimalistCollectionHolder(null, 'a',)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotModule, "hasNotByCollectionHolder",)
                containsNotByCollectionHolder(null, 'a',)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotModule, "hasNotByArray",)
                containsNotByArray(null, 'a',)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNot", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotModule, "hasNot",)
                includesNot(null, 'a',)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotModule, "hasNotByMinimalistCollectionHolder",)
                includesNotByMinimalistCollectionHolder(null, 'a',)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotModule, "hasNotByCollectionHolder",)
                includesNotByCollectionHolder(null, 'a',)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotModule, "hasNotByArray",)
                includesNotByArray(null, 'a',)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)


        describe("containsOne", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneModule, "hasOne",)
                containsOne(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneModule, "hasOneByMinimalistCollectionHolder",)
                containsOneByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneModule, "hasOneByCollectionHolder",)
                containsOneByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneModule, "hasOneByArray",)
                containsOneByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArray",)
                containsOneWithArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArrayByMinimalistCollectionHolder",)
                containsOneWithArrayByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArrayByCollectionHolder",)
                containsOneWithArrayByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArrayByArray",)
                containsOneWithArrayByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSet",)
                containsOneWithSet(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSetByMinimalistCollectionHolder",)
                containsOneWithSetByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSetByCollectionHolder",)
                containsOneWithSetByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSetByArray",)
                containsOneWithSetByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolder",)
                containsOneWithCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolderByMinimalistCollectionHolder",)
                containsOneWithCollectionHolderByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolderByCollectionHolder",)
                containsOneWithCollectionHolderByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolderByArray",)
                containsOneWithCollectionHolderByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolder",)
                containsOneWithMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                containsOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolderByCollectionHolder",)
                containsOneWithMinimalistCollectionHolderByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolderByArray",)
                containsOneWithMinimalistCollectionHolderByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIterator",)
                containsOneWithCollectionIterator(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIteratorByMinimalistCollectionHolder",)
                containsOneWithCollectionIteratorByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIteratorByCollectionHolder",)
                containsOneWithCollectionIteratorByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIteratorByArray",)
                containsOneWithCollectionIteratorByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIterator",)
                containsOneWithIterator(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIteratorByMinimalistCollectionHolder",)
                containsOneWithIteratorByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIteratorByCollectionHolder",)
                containsOneWithIteratorByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIteratorByArray",)
                containsOneWithIteratorByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterable",)
                containsOneWithIterable(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterableByMinimalistCollectionHolder",)
                containsOneWithIterableByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterableByCollectionHolder",)
                containsOneWithIterableByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterableByArray",)
                containsOneWithIterableByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneModule, "hasOne",)
                includesOne(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneModule, "hasOneByMinimalistCollectionHolder",)
                includesOneByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneModule, "hasOneByCollectionHolder",)
                includesOneByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneModule, "hasOneByArray",)
                includesOneByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArray",)
                includesOneWithArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArrayByMinimalistCollectionHolder",)
                includesOneWithArrayByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArrayByCollectionHolder",)
                includesOneWithArrayByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArrayByArray",)
                includesOneWithArrayByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSet",)
                includesOneWithSet(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSetByMinimalistCollectionHolder",)
                includesOneWithSetByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSetByCollectionHolder",)
                includesOneWithSetByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSetByArray",)
                includesOneWithSetByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolder",)
                includesOneWithCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolderByMinimalistCollectionHolder",)
                includesOneWithCollectionHolderByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolderByCollectionHolder",)
                includesOneWithCollectionHolderByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolderByArray",)
                includesOneWithCollectionHolderByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolder",)
                includesOneWithMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                includesOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolderByCollectionHolder",)
                includesOneWithMinimalistCollectionHolderByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolderByArray",)
                includesOneWithMinimalistCollectionHolderByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIterator",)
                includesOneWithCollectionIterator(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIteratorByMinimalistCollectionHolder",)
                includesOneWithCollectionIteratorByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIteratorByCollectionHolder",)
                includesOneWithCollectionIteratorByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIteratorByArray",)
                includesOneWithCollectionIteratorByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIterator",)
                includesOneWithIterator(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIteratorByMinimalistCollectionHolder",)
                includesOneWithIteratorByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIteratorByCollectionHolder",)
                includesOneWithIteratorByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIteratorByArray",)
                includesOneWithIteratorByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterable",)
                includesOneWithIterable(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterableByMinimalistCollectionHolder",)
                includesOneWithIterableByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterableByCollectionHolder",)
                includesOneWithIterableByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterableByArray",)
                includesOneWithIterableByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("containsNotOne", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneModule, "hasNotOne",)
                containsNotOne(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneModule, "hasNotOneByMinimalistCollectionHolder",)
                containsNotOneByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneModule, "hasNotOneByCollectionHolder",)
                containsNotOneByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneModule, "hasNotOneByArray",)
                containsNotOneByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotOne (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithArrayModule, "hasNotOneWithArray",)
                containsNotOneWithArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithArrayModule, "hasNotOneWithArrayByMinimalistCollectionHolder",)
                containsNotOneWithArrayByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithArrayModule, "hasNotOneWithArrayByCollectionHolder",)
                containsNotOneWithArrayByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithArrayModule, "hasNotOneWithArrayByArray",)
                containsNotOneWithArrayByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotOne (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithSetModule, "hasNotOneWithSet",)
                containsNotOneWithSet(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithSetModule, "hasNotOneWithSetByMinimalistCollectionHolder",)
                containsNotOneWithSetByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithSetModule, "hasNotOneWithSetByCollectionHolder",)
                containsNotOneWithSetByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithSetModule, "hasNotOneWithSetByArray",)
                containsNotOneWithSetByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotOne (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithCollectionHolderModule, "hasNotOneWithCollectionHolder",)
                containsNotOneWithCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithCollectionHolderModule, "hasNotOneWithCollectionHolderByMinimalistCollectionHolder",)
                containsNotOneWithCollectionHolderByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithCollectionHolderModule, "hasNotOneWithCollectionHolderByCollectionHolder",)
                containsNotOneWithCollectionHolderByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithCollectionHolderModule, "hasNotOneWithCollectionHolderByArray",)
                containsNotOneWithCollectionHolderByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotOne (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithMinimalistCollectionHolderModule, "hasNotOneWithMinimalistCollectionHolder",)
                containsNotOneWithMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithMinimalistCollectionHolderModule, "hasNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                containsNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithMinimalistCollectionHolderModule, "hasNotOneWithMinimalistCollectionHolderByCollectionHolder",)
                containsNotOneWithMinimalistCollectionHolderByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithMinimalistCollectionHolderModule, "hasNotOneWithMinimalistCollectionHolderByArray",)
                containsNotOneWithMinimalistCollectionHolderByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotOne (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithCollectionIteratorModule, "hasNotOneWithCollectionIterator",)
                containsNotOneWithCollectionIterator(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithCollectionIteratorModule, "hasNotOneWithCollectionIteratorByMinimalistCollectionHolder",)
                containsNotOneWithCollectionIteratorByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithCollectionIteratorModule, "hasNotOneWithCollectionIteratorByCollectionHolder",)
                containsNotOneWithCollectionIteratorByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithCollectionIteratorModule, "hasNotOneWithCollectionIteratorByArray",)
                containsNotOneWithCollectionIteratorByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotOne (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithIteratorModule, "hasNotOneWithIterator",)
                containsNotOneWithIterator(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithIteratorModule, "hasNotOneWithIteratorByMinimalistCollectionHolder",)
                containsNotOneWithIteratorByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithIteratorModule, "hasNotOneWithIteratorByCollectionHolder",)
                containsNotOneWithIteratorByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithIteratorModule, "hasNotOneWithIteratorByArray",)
                containsNotOneWithIteratorByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotOne (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithIterableModule, "hasNotOneWithIterable",)
                containsNotOneWithIterable(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithIterableModule, "hasNotOneWithIterableByMinimalistCollectionHolder",)
                containsNotOneWithIterableByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithIterableModule, "hasNotOneWithIterableByCollectionHolder",)
                containsNotOneWithIterableByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithIterableModule, "hasNotOneWithIterableByArray",)
                containsNotOneWithIterableByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotOne", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneModule, "hasNotOne",)
                includesNotOne(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneModule, "hasNotOneByMinimalistCollectionHolder",)
                includesNotOneByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneModule, "hasNotOneByCollectionHolder",)
                includesNotOneByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneModule, "hasNotOneByArray",)
                includesNotOneByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotOne (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithArrayModule, "hasNotOneWithArray",)
                includesNotOneWithArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithArrayModule, "hasNotOneWithArrayByMinimalistCollectionHolder",)
                includesNotOneWithArrayByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithArrayModule, "hasNotOneWithArrayByCollectionHolder",)
                includesNotOneWithArrayByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithArrayModule, "hasNotOneWithArrayByArray",)
                includesNotOneWithArrayByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotOne (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithSetModule, "hasNotOneWithSet",)
                includesNotOneWithSet(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithSetModule, "hasNotOneWithSetByMinimalistCollectionHolder",)
                includesNotOneWithSetByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithSetModule, "hasNotOneWithSetByCollectionHolder",)
                includesNotOneWithSetByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithSetModule, "hasNotOneWithSetByArray",)
                includesNotOneWithSetByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotOne (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithCollectionHolderModule, "hasNotOneWithCollectionHolder",)
                includesNotOneWithCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithCollectionHolderModule, "hasNotOneWithCollectionHolderByMinimalistCollectionHolder",)
                includesNotOneWithCollectionHolderByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithCollectionHolderModule, "hasNotOneWithCollectionHolderByCollectionHolder",)
                includesNotOneWithCollectionHolderByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithCollectionHolderModule, "hasNotOneWithCollectionHolderByArray",)
                includesNotOneWithCollectionHolderByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotOne (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithMinimalistCollectionHolderModule, "hasNotOneWithMinimalistCollectionHolder",)
                includesNotOneWithMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithMinimalistCollectionHolderModule, "hasNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                includesNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithMinimalistCollectionHolderModule, "hasNotOneWithMinimalistCollectionHolderByCollectionHolder",)
                includesNotOneWithMinimalistCollectionHolderByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithMinimalistCollectionHolderModule, "hasNotOneWithMinimalistCollectionHolderByArray",)
                includesNotOneWithMinimalistCollectionHolderByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotOne (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithCollectionIteratorModule, "hasNotOneWithCollectionIterator",)
                includesNotOneWithCollectionIterator(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithCollectionIteratorModule, "hasNotOneWithCollectionIteratorByMinimalistCollectionHolder",)
                includesNotOneWithCollectionIteratorByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithCollectionIteratorModule, "hasNotOneWithCollectionIteratorByCollectionHolder",)
                includesNotOneWithCollectionIteratorByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithCollectionIteratorModule, "hasNotOneWithCollectionIteratorByArray",)
                includesNotOneWithCollectionIteratorByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotOne (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithIteratorModule, "hasNotOneWithIterator",)
                includesNotOneWithIterator(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithIteratorModule, "hasNotOneWithIteratorByMinimalistCollectionHolder",)
                includesNotOneWithIteratorByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithIteratorModule, "hasNotOneWithIteratorByCollectionHolder",)
                includesNotOneWithIteratorByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithIteratorModule, "hasNotOneWithIteratorByArray",)
                includesNotOneWithIteratorByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotOne (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotOneWithIterableModule, "hasNotOneWithIterable",)
                includesNotOneWithIterable(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotOneWithIterableModule, "hasNotOneWithIterableByMinimalistCollectionHolder",)
                includesNotOneWithIterableByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotOneWithIterableModule, "hasNotOneWithIterableByCollectionHolder",)
                includesNotOneWithIterableByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotOneWithIterableModule, "hasNotOneWithIterableByArray",)
                includesNotOneWithIterableByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)


        describe("containsAll", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllModule, "hasAll",)
                containsAll(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllModule, "hasAllByMinimalistCollectionHolder",)
                containsAllByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllModule, "hasAllByCollectionHolder",)
                containsAllByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllModule, "hasAllByArray",)
                containsAllByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArray",)
                containsAllWithArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArrayByMinimalistCollectionHolder",)
                containsAllWithArrayByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArrayByCollectionHolder",)
                containsAllWithArrayByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArrayByArray",)
                containsAllWithArrayByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSet",)
                containsAllWithSet(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSetByMinimalistCollectionHolder",)
                containsAllWithSetByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSetByCollectionHolder",)
                containsAllWithSetByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSetByArray",)
                containsAllWithSetByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolder",)
                containsAllWithCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolderByMinimalistCollectionHolder",)
                containsAllWithCollectionHolderByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolderByCollectionHolder",)
                containsAllWithCollectionHolderByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolderByArray",)
                containsAllWithCollectionHolderByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolder",)
                containsAllWithMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                containsAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolderByCollectionHolder",)
                containsAllWithMinimalistCollectionHolderByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolderByArray",)
                containsAllWithMinimalistCollectionHolderByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIterator",)
                containsAllWithCollectionIterator(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIteratorByMinimalistCollectionHolder",)
                containsAllWithCollectionIteratorByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIteratorByCollectionHolder",)
                containsAllWithCollectionIteratorByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIteratorByArray",)
                containsAllWithCollectionIteratorByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIterator",)
                containsAllWithIterator(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIteratorByMinimalistCollectionHolder",)
                containsAllWithIteratorByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIteratorByCollectionHolder",)
                containsAllWithIteratorByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIteratorByArray",)
                containsAllWithIteratorByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterable",)
                containsAllWithIterable(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterableByMinimalistCollectionHolder",)
                containsAllWithIterableByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterableByCollectionHolder",)
                containsAllWithIterableByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterableByArray",)
                containsAllWithIterableByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllModule, "hasAll",)
                includesAll(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllModule, "hasAllByMinimalistCollectionHolder",)
                includesAllByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllModule, "hasAllByCollectionHolder",)
                includesAllByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllModule, "hasAllByArray",)
                includesAllByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArray",)
                includesAllWithArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArrayByMinimalistCollectionHolder",)
                includesAllWithArrayByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArrayByCollectionHolder",)
                includesAllWithArrayByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArrayByArray",)
                includesAllWithArrayByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSet",)
                includesAllWithSet(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSetByMinimalistCollectionHolder",)
                includesAllWithSetByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSetByCollectionHolder",)
                includesAllWithSetByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSetByArray",)
                includesAllWithSetByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolder",)
                includesAllWithCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolderByMinimalistCollectionHolder",)
                includesAllWithCollectionHolderByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolderByCollectionHolder",)
                includesAllWithCollectionHolderByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolderByArray",)
                includesAllWithCollectionHolderByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolder",)
                includesAllWithMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                includesAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolderByCollectionHolder",)
                includesAllWithMinimalistCollectionHolderByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolderByArray",)
                includesAllWithMinimalistCollectionHolderByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIterator",)
                includesAllWithCollectionIterator(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIteratorByMinimalistCollectionHolder",)
                includesAllWithCollectionIteratorByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIteratorByCollectionHolder",)
                includesAllWithCollectionIteratorByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIteratorByArray",)
                includesAllWithCollectionIteratorByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIterator",)
                includesAllWithIterator(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIteratorByMinimalistCollectionHolder",)
                includesAllWithIteratorByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIteratorByCollectionHolder",)
                includesAllWithIteratorByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIteratorByArray",)
                includesAllWithIteratorByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterable",)
                includesAllWithIterable(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterableByMinimalistCollectionHolder",)
                includesAllWithIterableByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterableByCollectionHolder",)
                includesAllWithIterableByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterableByArray",)
                includesAllWithIterableByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("containsNotAll", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllModule, "hasNotAll",)
                containsNotAll(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllModule, "hasNotAllByMinimalistCollectionHolder",)
                containsNotAllByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllModule, "hasNotAllByCollectionHolder",)
                containsNotAllByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllModule, "hasNotAllByArray",)
                containsNotAllByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotAll (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithArrayModule, "hasNotAllWithArray",)
                containsNotAllWithArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithArrayModule, "hasNotAllWithArrayByMinimalistCollectionHolder",)
                containsNotAllWithArrayByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithArrayModule, "hasNotAllWithArrayByCollectionHolder",)
                containsNotAllWithArrayByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithArrayModule, "hasNotAllWithArrayByArray",)
                containsNotAllWithArrayByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotAll (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithSetModule, "hasNotAllWithSet",)
                containsNotAllWithSet(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithSetModule, "hasNotAllWithSetByMinimalistCollectionHolder",)
                containsNotAllWithSetByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithSetModule, "hasNotAllWithSetByCollectionHolder",)
                containsNotAllWithSetByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithSetModule, "hasNotAllWithSetByArray",)
                containsNotAllWithSetByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotAll (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithCollectionHolderModule, "hasNotAllWithCollectionHolder",)
                containsNotAllWithCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithCollectionHolderModule, "hasNotAllWithCollectionHolderByMinimalistCollectionHolder",)
                containsNotAllWithCollectionHolderByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithCollectionHolderModule, "hasNotAllWithCollectionHolderByCollectionHolder",)
                containsNotAllWithCollectionHolderByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithCollectionHolderModule, "hasNotAllWithCollectionHolderByArray",)
                containsNotAllWithCollectionHolderByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotAll (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithMinimalistCollectionHolderModule, "hasNotAllWithMinimalistCollectionHolder",)
                containsNotAllWithMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithMinimalistCollectionHolderModule, "hasNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                containsNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithMinimalistCollectionHolderModule, "hasNotAllWithMinimalistCollectionHolderByCollectionHolder",)
                containsNotAllWithMinimalistCollectionHolderByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithMinimalistCollectionHolderModule, "hasNotAllWithMinimalistCollectionHolderByArray",)
                containsNotAllWithMinimalistCollectionHolderByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotAll (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithCollectionIteratorModule, "hasNotAllWithCollectionIterator",)
                containsNotAllWithCollectionIterator(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithCollectionIteratorModule, "hasNotAllWithCollectionIteratorByMinimalistCollectionHolder",)
                containsNotAllWithCollectionIteratorByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithCollectionIteratorModule, "hasNotAllWithCollectionIteratorByCollectionHolder",)
                containsNotAllWithCollectionIteratorByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithCollectionIteratorModule, "hasNotAllWithCollectionIteratorByArray",)
                containsNotAllWithCollectionIteratorByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotAll (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithIteratorModule, "hasNotAllWithIterator",)
                containsNotAllWithIterator(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithIteratorModule, "hasNotAllWithIteratorByMinimalistCollectionHolder",)
                containsNotAllWithIteratorByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithIteratorModule, "hasNotAllWithIteratorByCollectionHolder",)
                containsNotAllWithIteratorByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithIteratorModule, "hasNotAllWithIteratorByArray",)
                containsNotAllWithIteratorByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsNotAll (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithIterableModule, "hasNotAllWithIterable",)
                containsNotAllWithIterable(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithIterableModule, "hasNotAllWithIterableByMinimalistCollectionHolder",)
                containsNotAllWithIterableByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithIterableModule, "hasNotAllWithIterableByCollectionHolder",)
                containsNotAllWithIterableByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithIterableModule, "hasNotAllWithIterableByArray",)
                containsNotAllWithIterableByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotAll", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllModule, "hasNotAll",)
                includesNotAll(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllModule, "hasNotAllByMinimalistCollectionHolder",)
                includesNotAllByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllModule, "hasNotAllByCollectionHolder",)
                includesNotAllByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllModule, "hasNotAllByArray",)
                includesNotAllByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotAll (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithArrayModule, "hasNotAllWithArray",)
                includesNotAllWithArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithArrayModule, "hasNotAllWithArrayByMinimalistCollectionHolder",)
                includesNotAllWithArrayByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithArrayModule, "hasNotAllWithArrayByCollectionHolder",)
                includesNotAllWithArrayByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithArrayModule, "hasNotAllWithArrayByArray",)
                includesNotAllWithArrayByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotAll (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithSetModule, "hasNotAllWithSet",)
                includesNotAllWithSet(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithSetModule, "hasNotAllWithSetByMinimalistCollectionHolder",)
                includesNotAllWithSetByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithSetModule, "hasNotAllWithSetByCollectionHolder",)
                includesNotAllWithSetByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithSetModule, "hasNotAllWithSetByArray",)
                includesNotAllWithSetByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotAll (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithCollectionHolderModule, "hasNotAllWithCollectionHolder",)
                includesNotAllWithCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithCollectionHolderModule, "hasNotAllWithCollectionHolderByMinimalistCollectionHolder",)
                includesNotAllWithCollectionHolderByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithCollectionHolderModule, "hasNotAllWithCollectionHolderByCollectionHolder",)
                includesNotAllWithCollectionHolderByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithCollectionHolderModule, "hasNotAllWithCollectionHolderByArray",)
                includesNotAllWithCollectionHolderByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotAll (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithMinimalistCollectionHolderModule, "hasNotAllWithMinimalistCollectionHolder",)
                includesNotAllWithMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithMinimalistCollectionHolderModule, "hasNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                includesNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithMinimalistCollectionHolderModule, "hasNotAllWithMinimalistCollectionHolderByCollectionHolder",)
                includesNotAllWithMinimalistCollectionHolderByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithMinimalistCollectionHolderModule, "hasNotAllWithMinimalistCollectionHolderByArray",)
                includesNotAllWithMinimalistCollectionHolderByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotAll (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithCollectionIteratorModule, "hasNotAllWithCollectionIterator",)
                includesNotAllWithCollectionIterator(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithCollectionIteratorModule, "hasNotAllWithCollectionIteratorByMinimalistCollectionHolder",)
                includesNotAllWithCollectionIteratorByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithCollectionIteratorModule, "hasNotAllWithCollectionIteratorByCollectionHolder",)
                includesNotAllWithCollectionIteratorByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithCollectionIteratorModule, "hasNotAllWithCollectionIteratorByArray",)
                includesNotAllWithCollectionIteratorByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotAll (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithIteratorModule, "hasNotAllWithIterator",)
                includesNotAllWithIterator(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithIteratorModule, "hasNotAllWithIteratorByMinimalistCollectionHolder",)
                includesNotAllWithIteratorByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithIteratorModule, "hasNotAllWithIteratorByCollectionHolder",)
                includesNotAllWithIteratorByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithIteratorModule, "hasNotAllWithIteratorByArray",)
                includesNotAllWithIteratorByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNotAll (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasNotAllWithIterableModule, "hasNotAllWithIterable",)
                includesNotAllWithIterable(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNotAllWithIterableModule, "hasNotAllWithIterableByMinimalistCollectionHolder",)
                includesNotAllWithIterableByMinimalistCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNotAllWithIterableModule, "hasNotAllWithIterableByCollectionHolder",)
                includesNotAllWithIterableByCollectionHolder(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNotAllWithIterableModule, "hasNotAllWithIterableByArray",)
                includesNotAllWithIterableByArray(null, null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)


        describe("containsNull", () => {
            test("all", () => {
                const method = jest.spyOn(hasNullModule, "hasNull",)
                containsNull(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNullModule, "hasNullByMinimalistCollectionHolder",)
                containsNullByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNullModule, "hasNullByCollectionHolder",)
                containsNullByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNullModule, "hasNullByArray",)
                containsNullByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNull", () => {
            test("all", () => {
                const method = jest.spyOn(hasNullModule, "hasNull",)
                includesNull(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNullModule, "hasNullByMinimalistCollectionHolder",)
                includesNullByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNullModule, "hasNullByCollectionHolder",)
                includesNullByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNullModule, "hasNullByArray",)
                includesNullByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("containsNoNulls", () => {
            test("all", () => {
                const method = jest.spyOn(hasNoNullsModule, "hasNoNulls",)
                containsNoNulls(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNoNullsModule, "hasNoNullsByMinimalistCollectionHolder",)
                containsNoNullsByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNoNullsModule, "hasNoNullsByCollectionHolder",)
                containsNoNullsByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNoNullsModule, "hasNoNullsByArray",)
                containsNoNullsByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNoNulls", () => {
            test("all", () => {
                const method = jest.spyOn(hasNoNullsModule, "hasNoNulls",)
                includesNoNulls(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNoNullsModule, "hasNoNullsByMinimalistCollectionHolder",)
                includesNoNullsByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNoNullsModule, "hasNoNullsByCollectionHolder",)
                includesNoNullsByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNoNullsModule, "hasNoNullsByArray",)
                includesNoNullsByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)


        describe("containsDuplicate", () => {
            test("all", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicate",)
                containsDuplicate(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicateByMinimalistCollectionHolder",)
                containsDuplicateByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicateByCollectionHolder",)
                containsDuplicateByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicateByArray",)
                containsDuplicateByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesDuplicate", () => {
            test("all", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicate",)
                includesDuplicate(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicateByMinimalistCollectionHolder",)
                includesDuplicateByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicateByCollectionHolder",)
                includesDuplicateByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicateByArray",)
                includesDuplicateByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("containsNoDuplicates", () => {
            test("all", () => {
                const method = jest.spyOn(hasNoDuplicatesModule, "hasNoDuplicates",)
                containsNoDuplicates(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNoDuplicatesModule, "hasNoDuplicatesByMinimalistCollectionHolder",)
                containsNoDuplicatesByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNoDuplicatesModule, "hasNoDuplicatesByCollectionHolder",)
                containsNoDuplicatesByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNoDuplicatesModule, "hasNoDuplicatesByArray",)
                containsNoDuplicatesByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNoDuplicates", () => {
            test("all", () => {
                const method = jest.spyOn(hasNoDuplicatesModule, "hasNoDuplicates",)
                includesNoDuplicates(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNoDuplicatesModule, "hasNoDuplicatesByMinimalistCollectionHolder",)
                includesNoDuplicatesByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNoDuplicatesModule, "hasNoDuplicatesByCollectionHolder",)
                includesNoDuplicatesByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNoDuplicatesModule, "hasNoDuplicatesByArray",)
                includesNoDuplicatesByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

    },)

    describe("methods", () => {
    describe.each(everyExtensionMethodInstances,)("%s", ({value: {instance,},},) => {
        test("has", () => expect(instance.has(null,),).toBeFalse(),)
        test("hasNot", () => expect(instance.hasNot(null,),).toBeTrue(),)

        describe("hasOne", () => {
            test.each(NULL_UNDEFINED,)("%s", nullValue =>                       expect(instance.hasOne(nullValue,),).toBeFalse(),)
            test.each(everyEmptyInstances,)("%s (empty)", ({value,},) =>        expect(instance.hasOne(value(),),).toBeFalse(),)
            test.each(everyNonEmptyInstances,)("%s (non-empty)", ({value,},) => expect(instance.hasOne(value(),),).toBeFalse(),)
        },)
        describe("hasOne (array)", () => {
            test.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasOneWithArray(nullValue,),).toBeFalse(),)
            test("empty", () =>                           expect(instance.hasOneWithArray(EMPTY,),).toBeFalse(),)
            test("non-empty", () =>                       expect(instance.hasOneWithArray(A,),).toBeFalse(),)
        },)
        describe("hasOne (set)", () => {
            test.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasOneWithSet(nullValue,),).toBeFalse(),)
            test("empty", () =>                           expect(instance.hasOneWithSet(new Set(),),).toBeFalse(),)
            test("non-empty", () =>                       expect(instance.hasOneWithSet(new Set(A,),),).toBeFalse(),)
        },)
        describe("hasOne (collection holder)", () => {
            test.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasOneWithCollectionHolder(nullValue,),).toBeFalse(),)
            test("empty", () =>                           expect(instance.hasOneWithCollectionHolder(new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
            test("non-empty", () =>                       expect(instance.hasOneWithCollectionHolder(new CollectionHolderFromArray(A,),),).toBeFalse(),)
        },)
        describe("hasOne (minimalist collection holder)", () => {
            test.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasOneWithMinimalistCollectionHolder(nullValue,),).toBeFalse(),)
            test("empty", () =>                           expect(instance.hasOneWithMinimalistCollectionHolder(new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
            test("non-empty", () =>                       expect(instance.hasOneWithMinimalistCollectionHolder(new CollectionHolderFromArray(A,),),).toBeFalse(),)
        },)
        describe("hasOne (collection iterator)", () => {
            test.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasOneWithCollectionIterator(nullValue,),).toBeFalse(),)
            test("empty", () =>                           expect(instance.hasOneWithCollectionIterator(new CollectionIteratorFromArray(EMPTY,),),).toBeFalse(),)
            test("non-empty", () =>                       expect(instance.hasOneWithCollectionIterator(new CollectionIteratorFromArray(A,),),).toBeFalse(),)
        },)
        describe("hasOne (iterator)", () => {
            test.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasOneWithIterator(nullValue,),).toBeFalse(),)
            test("empty", () =>                           expect(instance.hasOneWithIterator(EMPTY[Symbol.iterator](),),).toBeFalse(),)
            test("non-empty", () =>                       expect(instance.hasOneWithIterator(A[Symbol.iterator](),),).toBeFalse(),)
        },)
        describe("hasOne (iterable)", () => {
            test.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasOneWithIterable(nullValue,),).toBeFalse(),)
            test("empty", () =>                           expect(instance.hasOneWithIterable(EMPTY,),).toBeFalse(),)
            test("non-empty", () =>                       expect(instance.hasOneWithIterable(A,),).toBeFalse(),)
        },)

        describe("hasNotOne", () => {
            test.each(NULL_UNDEFINED,)("%s", nullValue =>                       expect(instance.hasNotOne(nullValue,),).toBeTrue(),)
            test.each(everyEmptyInstances,)("%s (empty)", ({value,},) =>        expect(instance.hasNotOne(value(),),).toBeTrue(),)
            test.each(everyNonEmptyInstances,)("%s (non-empty)", ({value,},) => expect(instance.hasNotOne(value(),),).toBeTrue(),)
        },)
        describe("hasNotOne (array)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasNotOneWithArray(nullValue,),).toBeTrue(),)
            describe("empty", () =>                           expect(instance.hasNotOneWithArray(EMPTY,),).toBeTrue(),)
            describe("non-empty", () =>                       expect(instance.hasNotOneWithArray(A,),).toBeTrue(),)
        },)
        describe("hasNotOne (set)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasNotOneWithSet(nullValue,),).toBeTrue(),)
            describe("empty", () =>                           expect(instance.hasNotOneWithSet(new Set(),),).toBeTrue(),)
            describe("non-empty", () =>                       expect(instance.hasNotOneWithSet(new Set(A,),),).toBeTrue(),)
        },)
        describe("hasNotOne (collection holder)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasNotOneWithCollectionHolder(nullValue,),).toBeTrue(),)
            describe("empty", () =>                           expect(instance.hasNotOneWithCollectionHolder(new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
            describe("non-empty", () =>                       expect(instance.hasNotOneWithCollectionHolder(new CollectionHolderFromArray(A,),),).toBeTrue(),)
        },)
        describe("hasNotOne (minimalist collection holder)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasNotOneWithMinimalistCollectionHolder(nullValue,),).toBeTrue(),)
            describe("empty", () =>                           expect(instance.hasNotOneWithMinimalistCollectionHolder(new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
            describe("non-empty", () =>                       expect(instance.hasNotOneWithMinimalistCollectionHolder(new CollectionHolderFromArray(A,),),).toBeTrue(),)
        },)
        describe("hasNotOne (collection iterator)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasNotOneWithCollectionIterator(nullValue,),).toBeTrue(),)
            describe("empty", () =>                           expect(instance.hasNotOneWithCollectionIterator(new CollectionIteratorFromArray(EMPTY,),),).toBeTrue(),)
            describe("non-empty", () =>                       expect(instance.hasNotOneWithCollectionIterator(new CollectionIteratorFromArray(A,),),).toBeTrue(),)
        },)
        describe("hasNotOne (iterator)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasNotOneWithIterator(nullValue,),).toBeTrue(),)
            describe("empty", () =>                           expect(instance.hasNotOneWithIterator(EMPTY[Symbol.iterator](),),).toBeTrue(),)
            describe("non-empty", () =>                       expect(instance.hasNotOneWithIterator(A[Symbol.iterator](),),).toBeTrue(),)
        },)
        describe("hasNotOne (iterable)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasNotOneWithIterable(nullValue,),).toBeTrue(),)
            describe("empty", () =>                           expect(instance.hasNotOneWithIterable(EMPTY,),).toBeTrue(),)
            describe("non-empty", () =>                       expect(instance.hasNotOneWithIterable(A,),).toBeTrue(),)
        },)

        describe("hasAll", () => {
            test.each(NULL_UNDEFINED,)("%s", nullValue =>                       expect(instance.hasAll(nullValue,),).toBeTrue(),)
            test.each(everyEmptyInstances,)("%s (empty)", ({value,},) =>        expect(instance.hasAll(value(),),).toBeTrue(),)
            test.each(everyNonEmptyInstances,)("%s (non-empty)", ({value,},) => expect(instance.hasAll(value(),),).toBeFalse(),)
        },)
        describe("hasAll (array)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasAllWithArray(nullValue,),).toBeTrue(),)
            describe("empty", () =>                           expect(instance.hasAllWithArray(EMPTY,),).toBeTrue(),)
            describe("non-empty", () =>                       expect(instance.hasAllWithArray(A,),).toBeFalse(),)
        },)
        describe("hasAll (set)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasAllWithSet(nullValue,),).toBeTrue(),)
            describe("empty", () =>                           expect(instance.hasAllWithSet(new Set(),),).toBeTrue(),)
            describe("non-empty", () =>                       expect(instance.hasAllWithSet(new Set(A,),),).toBeFalse(),)
        },)
        describe("hasAll (collection holder)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasAllWithCollectionHolder(nullValue,),).toBeTrue(),)
            describe("empty", () =>                           expect(instance.hasAllWithCollectionHolder(new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
            describe("non-empty", () =>                       expect(instance.hasAllWithCollectionHolder(new CollectionHolderFromArray(A,),),).toBeFalse(),)
        },)
        describe("hasAll (minimalist collection holder)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasAllWithMinimalistCollectionHolder(nullValue,),).toBeTrue(),)
            describe("empty", () =>                           expect(instance.hasAllWithMinimalistCollectionHolder(new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
            describe("non-empty", () =>                       expect(instance.hasAllWithMinimalistCollectionHolder(new CollectionHolderFromArray(A,),),).toBeFalse(),)
        },)
        describe("hasAll (collection iterator)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasAllWithCollectionIterator(nullValue,),).toBeTrue(),)
            describe("empty", () =>                           expect(instance.hasAllWithCollectionIterator(new CollectionIteratorFromArray(EMPTY,),),).toBeTrue(),)
            describe("non-empty", () =>                       expect(instance.hasAllWithCollectionIterator(new CollectionIteratorFromArray(A,),),).toBeFalse(),)
        },)
        describe("hasAll (iterator)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasAllWithIterator(nullValue,),).toBeTrue(),)
            describe("empty", () =>                           expect(instance.hasAllWithIterator(EMPTY[Symbol.iterator](),),).toBeTrue(),)
            describe("non-empty", () =>                       expect(instance.hasAllWithIterator(A[Symbol.iterator](),),).toBeFalse(),)
        },)
        describe("hasAll (iterable)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasAllWithIterable(nullValue,),).toBeTrue(),)
            describe("empty", () =>                           expect(instance.hasAllWithIterable(EMPTY,),).toBeTrue(),)
            describe("non-empty", () =>                       expect(instance.hasAllWithIterable(A,),).toBeFalse(),)
        },)

        describe("hasNotAll", () => {
            test.each(NULL_UNDEFINED,)("%s", nullValue =>                       expect(instance.hasNotAll(nullValue,),).toBeFalse(),)
            test.each(everyEmptyInstances,)("%s (empty)", ({value,},) =>        expect(instance.hasNotAll(value(),),).toBeFalse(),)
            test.each(everyNonEmptyInstances,)("%s (non-empty)", ({value,},) => expect(instance.hasNotAll(value(),),).toBeTrue(),)
        },)
        describe("hasNotAll (array)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasNotAllWithArray(nullValue,),).toBeFalse(),)
            describe("empty", () =>                           expect(instance.hasNotAllWithArray(EMPTY,),).toBeFalse(),)
            describe("non-empty", () =>                       expect(instance.hasNotAllWithArray(A,),).toBeTrue(),)
        },)
        describe("hasNotAll (set)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasNotAllWithSet(nullValue,),).toBeFalse(),)
            describe("empty", () =>                           expect(instance.hasNotAllWithSet(new Set(),),).toBeFalse(),)
            describe("non-empty", () =>                       expect(instance.hasNotAllWithSet(new Set(A,),),).toBeTrue(),)
        },)
        describe("hasNotAll (collection holder)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasNotAllWithCollectionHolder(nullValue,),).toBeFalse(),)
            describe("empty", () =>                           expect(instance.hasNotAllWithCollectionHolder(new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
            describe("non-empty", () =>                       expect(instance.hasNotAllWithCollectionHolder(new CollectionHolderFromArray(A,),),).toBeTrue(),)
        },)
        describe("hasNotAll (minimalist collection holder)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasNotAllWithMinimalistCollectionHolder(nullValue,),).toBeFalse(),)
            describe("empty", () =>                           expect(instance.hasNotAllWithMinimalistCollectionHolder(new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
            describe("non-empty", () =>                       expect(instance.hasNotAllWithMinimalistCollectionHolder(new CollectionHolderFromArray(A,),),).toBeTrue(),)
        },)
        describe("hasNotAll (collection iterator)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasNotAllWithCollectionIterator(nullValue,),).toBeFalse(),)
            describe("empty", () =>                           expect(instance.hasNotAllWithCollectionIterator(new CollectionIteratorFromArray(EMPTY,),),).toBeFalse(),)
            describe("non-empty", () =>                       expect(instance.hasNotAllWithCollectionIterator(new CollectionIteratorFromArray(A,),),).toBeTrue(),)
        },)
        describe("hasNotAll (iterator)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasNotAllWithIterator(nullValue,),).toBeFalse(),)
            describe("empty", () =>                           expect(instance.hasNotAllWithIterator(EMPTY[Symbol.iterator](),),).toBeFalse(),)
            describe("non-empty", () =>                       expect(instance.hasNotAllWithIterator(A[Symbol.iterator](),),).toBeTrue(),)
        },)
        describe("hasNotAll (iterable)", () => {
            describe.each(NULL_UNDEFINED,)("%s", nullValue => expect(instance.hasNotAllWithIterable(nullValue,),).toBeFalse(),)
            describe("empty", () =>                           expect(instance.hasNotAllWithIterable(EMPTY,),).toBeFalse(),)
            describe("non-empty", () =>                       expect(instance.hasNotAllWithIterable(A,),).toBeTrue(),)
        },)

        test("hasNull", () => expect(instance.hasNull,).toBeFalse(),)
        test("hasNoNulls", () => expect(instance.hasNoNulls,).toBeTrue(),)

        test("hasDuplicate", () => expect(instance.hasDuplicate,).toBeFalse(),)
        test("hasNoDuplicates", () => expect(instance.hasNoDuplicates,).toBeTrue(),)

        test("requireNoNulls", () => expectToBeInstance(instance, it => it.requireNoNulls(),),)
    },)},)

    describe("instances", () => {
    describe.each(everyInstances,)("%s", ({value: {instance, isMinimalist, isLazy,},},) => {
        describe("get() being called", () => {
            describe("has", () => {
                test("empty",        () => expect(new instance<string>(EMPTY,).execute(it => it.has('a',),).amountOfCall,).toBe(0,),)
                test("1 field (a)",  () => expect(new instance(A,).execute(it =>             it.has('a',),).amountOfCall,).toBe(1,),)
                test("1 field (e)",  () => expect(new instance<string>(A,).execute(it =>     it.has('e',),).amountOfCall,).toBe(1,),)
                test("2 fields (a)", () => expect(new instance(AB,).execute(it =>            it.has('a',),).amountOfCall,).toBe(1,),)
                test("2 fields (e)", () => expect(new instance<string>(AB,).execute(it =>    it.has('e',),).amountOfCall,).toBe(2,),)
                test("4 fields (a)", () => expect(new instance(ABCD,).execute(it =>          it.has('a',),).amountOfCall,).toBe(1,),)
                test("4 fields (e)", () => expect(new instance<string>(ABCD,).execute(it =>  it.has('e',),).amountOfCall,).toBe(4,),)
            },)
            describe("hasNot", () => {
                test("empty",        () => expect(new instance<string>(EMPTY,).execute(it => it.hasNot('a',),).amountOfCall,).toBe(0,),)
                test("1 field (a)",  () => expect(new instance(A,).execute(it =>             it.hasNot('a',),).amountOfCall,).toBe(1,),)
                test("1 field (e)",  () => expect(new instance<string>(A,).execute(it =>     it.hasNot('e',),).amountOfCall,).toBe(1,),)
                test("2 fields (a)", () => expect(new instance(AB,).execute(it =>            it.hasNot('a',),).amountOfCall,).toBe(1,),)
                test("2 fields (e)", () => expect(new instance<string>(AB,).execute(it =>    it.hasNot('e',),).amountOfCall,).toBe(2,),)
                test("4 fields (a)", () => expect(new instance(ABCD,).execute(it =>          it.hasNot('a',),).amountOfCall,).toBe(1,),)
                test("4 fields (e)", () => expect(new instance<string>(ABCD,).execute(it =>  it.hasNot('e',),).amountOfCall,).toBe(4,),)
            },)

            describe("hasOne", () => {
                describe.each(NULL_UNDEFINED,)("%s", nullValue => {
                    test("empty",    () => expect(new instance(EMPTY).execute(it => it.hasOne(nullValue,),).amountOfCall,).toBe(0,),)
                    test("1 field",  () => expect(new instance(A).execute(it =>     it.hasOne(nullValue,),).amountOfCall,).toBe(0,),)
                    test("2 fields", () => expect(new instance(AB).execute(it =>    it.hasOne(nullValue,),).amountOfCall,).toBe(0,),)
                    test("4 fields", () => expect(new instance(ABCD).execute(it =>  it.hasOne(nullValue,),).amountOfCall,).toBe(0,),)
                })
                describe.each(everyIterableInstances,)("%s", ({value: newIterable,},) => {
                    test("0 fields (empty)",     () => expect(new instance(EMPTY,).execute(it =>         it.hasOne(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                    test("0 fields (non-empty)", () => expect(new instance<string>(EMPTY,).execute(it => it.hasOne(newIterable(AB,),),).amountOfCall,).toBe(0,),)
                    test("1 field (empty)",      () => expect(new instance(A,).execute(it =>             it.hasOne(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                    test("1 field (non-empty)",  () => expect(new instance<string>(A,).execute(it =>     it.hasOne(newIterable(AB,),),).amountOfCall,).toBe(1,),)
                    test("2 fields (empty)",     () => expect(new instance(AB,).execute(it =>            it.hasOne(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                    test("2 fields (non-empty)", () => expect(new instance(AB,).execute(it =>            it.hasOne(newIterable(AB,),),).amountOfCall,).toBe(1,),)
                    test("4 fields (empty)",     () => expect(new instance(ABCD,).execute(it =>          it.hasOne(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                    test("4 fields (non-empty)", () => expect(new instance(ABCD,).execute(it =>          it.hasOne(newIterable(AB,),),).amountOfCall,).toBe(1,),)
                },)
            },)
            describe("hasNotOne", () => {
                describe.each(NULL_UNDEFINED,)("%s", nullValue => {
                    test("empty",    () => expect(new instance(EMPTY).execute(it => it.hasNotOne(nullValue,),).amountOfCall,).toBe(0,),)
                    test("1 field",  () => expect(new instance(A).execute(it =>     it.hasNotOne(nullValue,),).amountOfCall,).toBe(0,),)
                    test("2 fields", () => expect(new instance(AB).execute(it =>    it.hasNotOne(nullValue,),).amountOfCall,).toBe(0,),)
                    test("4 fields", () => expect(new instance(ABCD).execute(it =>  it.hasNotOne(nullValue,),).amountOfCall,).toBe(0,),)
                })
                describe.each(everyIterableInstances,)("%s", ({value: newIterable,},) => {
                    test("0 fields (empty)",     () => expect(new instance(EMPTY,).execute(it =>         it.hasNotOne(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                    test("0 fields (non-empty)", () => expect(new instance<string>(EMPTY,).execute(it => it.hasNotOne(newIterable(AB,),),).amountOfCall,).toBe(0,),)
                    test("1 field (empty)",      () => expect(new instance(A,).execute(it =>             it.hasNotOne(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                    test("1 field (non-empty)",  () => expect(new instance<string>(A,).execute(it =>     it.hasNotOne(newIterable(AB,),),).amountOfCall,).toBe(1,),)
                    test("2 fields (empty)",     () => expect(new instance(AB,).execute(it =>            it.hasNotOne(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                    test("2 fields (non-empty)", () => expect(new instance(AB,).execute(it =>            it.hasNotOne(newIterable(AB,),),).amountOfCall,).toBe(1,),)
                    test("4 fields (empty)",     () => expect(new instance(ABCD,).execute(it =>          it.hasNotOne(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                    test("4 fields (non-empty)", () => expect(new instance(ABCD,).execute(it =>          it.hasNotOne(newIterable(AB,),),).amountOfCall,).toBe(1,),)
                },)
            },)

            describe("hasAll", () => {
                describe.each(NULL_UNDEFINED,)("%s", nullValue => {
                    test("empty",    () => expect(new instance(EMPTY).execute(it => it.hasAll(nullValue,),).amountOfCall,).toBe(0,),)
                    test("1 field",  () => expect(new instance(A).execute(it =>     it.hasAll(nullValue,),).amountOfCall,).toBe(0,),)
                    test("2 fields", () => expect(new instance(AB).execute(it =>    it.hasAll(nullValue,),).amountOfCall,).toBe(0,),)
                    test("4 fields", () => expect(new instance(ABCD).execute(it =>  it.hasAll(nullValue,),).amountOfCall,).toBe(0,),)
                })
                describe.each(everyIterableInstances,)("%s", ({value: newIterable,},) => {
                    test("0 fields (empty)",     () => expect(new instance(EMPTY,).execute(it =>         it.hasAll(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                    test("0 fields (non-empty)", () => expect(new instance<string>(EMPTY,).execute(it => it.hasAll(newIterable(AB,),),).amountOfCall,).toBe(0,),)
                    test("1 field (empty)",      () => expect(new instance(A,).execute(it =>             it.hasAll(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                    test("1 field (non-empty)",  () => expect(new instance<string>(A,).execute(it =>     it.hasAll(newIterable(AB,),),).amountOfCall,).toBe(2,),)
                    test("2 fields (empty)",     () => expect(new instance(AB,).execute(it =>            it.hasAll(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                    test("2 fields (non-empty)", () => expect(new instance(AB,).execute(it =>            it.hasAll(newIterable(AB,),),).amountOfCall,).toBe(3,),)
                    test("4 fields (empty)",     () => expect(new instance(ABCD,).execute(it =>          it.hasAll(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                    test("4 fields (non-empty)", () => expect(new instance(ABCD,).execute(it =>          it.hasAll(newIterable(AB,),),).amountOfCall,).toBe(3,),)
                },)
            },)
            describe("hasNotAll", () => {
                describe.each(NULL_UNDEFINED,)("%s", nullValue => {
                    test("empty",    () => expect(new instance(EMPTY).execute(it => it.hasNotAll(nullValue,),).amountOfCall,).toBe(0,),)
                    test("1 field",  () => expect(new instance(A).execute(it =>     it.hasNotAll(nullValue,),).amountOfCall,).toBe(0,),)
                    test("2 fields", () => expect(new instance(AB).execute(it =>    it.hasNotAll(nullValue,),).amountOfCall,).toBe(0,),)
                    test("4 fields", () => expect(new instance(ABCD).execute(it =>  it.hasNotAll(nullValue,),).amountOfCall,).toBe(0,),)
                })
                describe.each(everyIterableInstances,)("%s", ({value: newIterable,},) => {
                    test("1 field (empty)",      () => expect(new instance(EMPTY,).execute(it =>         it.hasNotAll(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                    test("1 field (non-empty)",  () => expect(new instance<string>(EMPTY,).execute(it => it.hasNotAll(newIterable(AB,),),).amountOfCall,).toBe(0,),)
                    test("1 field (empty)",      () => expect(new instance(A,).execute(it =>             it.hasNotAll(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                    test("1 field (non-empty)",  () => expect(new instance<string>(A,).execute(it =>     it.hasNotAll(newIterable(AB,),),).amountOfCall,).toBe(2,),)
                    test("2 fields (empty)",     () => expect(new instance(AB,).execute(it =>            it.hasNotAll(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                    test("2 fields (non-empty)", () => expect(new instance(AB,).execute(it =>            it.hasNotAll(newIterable(AB,),),).amountOfCall,).toBe(3,),)
                    test("4 fields (empty)",     () => expect(new instance(ABCD,).execute(it =>          it.hasNotAll(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                    test("4 fields (non-empty)", () => expect(new instance(ABCD,).execute(it =>          it.hasNotAll(newIterable(AB,),),).amountOfCall,).toBe(3,),)
                },)
            },)

            describe("hasNull", () => {
                test("empty",                          () => expect(new instance(EMPTY,).execute(it =>               it.hasNull,).amountOfCall,).toBe(0,),)
                test("1 field (non-null)",             () => expect(new instance(A,).execute(it =>                   it.hasNull,).amountOfCall,).toBe(isMinimalist ? 1 : 0,),)
                test("1 field (null)",                 () => expect(new instance(NULL,).execute(it =>                it.hasNull,).amountOfCall,).toBe(isMinimalist ? 1 : 0,),)
                test("1 field (undefined)",            () => expect(new instance(UNDEFINED,).execute(it =>           it.hasNull,).amountOfCall,).toBe(isMinimalist ? 1 : 0,),)
                test("2 fields (non-null)",            () => expect(new instance(AB,).execute(it =>                  it.hasNull,).amountOfCall,).toBe(isMinimalist ? 2 : 0,),)
                test("2 fields (null at start)",       () => expect(new instance(NULL_A,).execute(it =>              it.hasNull,).amountOfCall,).toBe(isMinimalist ? 1 : 0,),)
                test("2 fields (null at end)",         () => expect(new instance(A_NULL,).execute(it =>              it.hasNull,).amountOfCall,).toBe(isMinimalist ? 2 : 0,),)
                test("2 fields (undefined at start)",  () => expect(new instance(UNDEFINED_A,).execute(it =>         it.hasNull,).amountOfCall,).toBe(isMinimalist ? 1 : 0,),)
                test("2 fields (undefined at end)",    () => expect(new instance(A_UNDEFINED,).execute(it =>         it.hasNull,).amountOfCall,).toBe(isMinimalist ? 2 : 0,),)
                test("4 fields (non-null)",            () => expect(new instance(ABCD,).execute(it =>                it.hasNull,).amountOfCall,).toBe(isLazy ? 0 : 4,),)
                test("3 fields (null at start)",       () => expect(new instance(NULL_AB,).execute(it =>             it.hasNull,).amountOfCall,).toBe(isLazy ? 0 : 1,),)
                test("3 fields (null at center)",      () => expect(new instance(A_NULL_B,).execute(it =>            it.hasNull,).amountOfCall,).toBe(isLazy ? 0 : 2,),)
                test("3 fields (null at end)",         () => expect(new instance(AB_NULL,).execute(it =>             it.hasNull,).amountOfCall,).toBe(isLazy ? 0 : 3,),)
                test("3 fields (undefined at start)",  () => expect(new instance(UNDEFINED_AB,).execute(it =>        it.hasNull,).amountOfCall,).toBe(isLazy ? 0 : 1,),)
                test("3 fields (undefined at center)", () => expect(new instance(A_UNDEFINED_B,).execute(it =>       it.hasNull,).amountOfCall,).toBe(isLazy ? 0 : 2,),)
                test("3 fields (undefined at end)",    () => expect(new instance(AB_UNDEFINED,).execute(it =>        it.hasNull,).amountOfCall,).toBe(isLazy ? 0 : 3,),)
                test("4 fields (null + undefined)",    () => expect(new instance(A_NULL_UNDEFINED_B,).execute(it =>  it.hasNull,).amountOfCall,).toBe(isLazy ? 0 : 2,),)
                test("4 fields (undefined + null)",    () => expect(new instance(A_UNDEFINED_NULL_B,).execute(it =>  it.hasNull,).amountOfCall,).toBe(isLazy ? 0 : 2,),)
            },)
            describe("hasNoNulls", () => {
                test("empty",                          () => expect(new instance(EMPTY,).execute(it =>               it.hasNoNulls,).amountOfCall,).toBe(0,),)
                test("1 field (non-null)",             () => expect(new instance(A,).execute(it =>                   it.hasNoNulls,).amountOfCall,).toBe(isMinimalist ? 1 : 0,),)
                test("1 field (null)",                 () => expect(new instance(NULL,).execute(it =>                it.hasNoNulls,).amountOfCall,).toBe(isMinimalist ? 1 : 0,),)
                test("1 field (undefined)",            () => expect(new instance(UNDEFINED,).execute(it =>           it.hasNoNulls,).amountOfCall,).toBe(isMinimalist ? 1 : 0,),)
                test("2 fields (non-null)",            () => expect(new instance(AB,).execute(it =>                  it.hasNoNulls,).amountOfCall,).toBe(isMinimalist ? 2 : 0,),)
                test("2 fields (null at start)",       () => expect(new instance(NULL_A,).execute(it =>              it.hasNoNulls,).amountOfCall,).toBe(isMinimalist ? 1 : 0,),)
                test("2 fields (null at end)",         () => expect(new instance(A_NULL,).execute(it =>              it.hasNoNulls,).amountOfCall,).toBe(isMinimalist ? 2 : 0,),)
                test("2 fields (undefined at start)",  () => expect(new instance(UNDEFINED_A,).execute(it =>         it.hasNoNulls,).amountOfCall,).toBe(isMinimalist ? 1 : 0,),)
                test("2 fields (undefined at end)",    () => expect(new instance(A_UNDEFINED,).execute(it =>         it.hasNoNulls,).amountOfCall,).toBe(isMinimalist ? 2 : 0,),)
                test("4 fields (non-null)",            () => expect(new instance(ABCD,).execute(it =>                it.hasNoNulls,).amountOfCall,).toBe(isLazy ? 0 : 4,),)
                test("3 fields (null at start)",       () => expect(new instance(NULL_AB,).execute(it =>             it.hasNoNulls,).amountOfCall,).toBe(isLazy ? 0 : 1,),)
                test("3 fields (null at center)",      () => expect(new instance(A_NULL_B,).execute(it =>            it.hasNoNulls,).amountOfCall,).toBe(isLazy ? 0 : 2,),)
                test("3 fields (null at end)",         () => expect(new instance(AB_NULL,).execute(it =>             it.hasNoNulls,).amountOfCall,).toBe(isLazy ? 0 : 3,),)
                test("3 fields (undefined at start)",  () => expect(new instance(UNDEFINED_AB,).execute(it =>        it.hasNoNulls,).amountOfCall,).toBe(isLazy ? 0 : 1,),)
                test("3 fields (undefined at center)", () => expect(new instance(A_UNDEFINED_B,).execute(it =>       it.hasNoNulls,).amountOfCall,).toBe(isLazy ? 0 : 2,),)
                test("3 fields (undefined at end)",    () => expect(new instance(AB_UNDEFINED,).execute(it =>        it.hasNoNulls,).amountOfCall,).toBe(isLazy ? 0 : 3,),)
                test("4 fields (null + undefined)",    () => expect(new instance(A_NULL_UNDEFINED_B,).execute(it =>  it.hasNoNulls,).amountOfCall,).toBe(isLazy ? 0 : 2,),)
                test("4 fields (undefined + null)",    () => expect(new instance(A_UNDEFINED_NULL_B,).execute(it =>  it.hasNoNulls,).amountOfCall,).toBe(isLazy ? 0 : 2,),)
            },)

            describe("hasDuplicate", () => {
                test("empty",                                  () => { expect(new instance(EMPTY,).execute(it =>                    it.hasDuplicate,).amountOfCall,).toBe(0,) },)
                test("1 field",                                () => { expect(new instance(A,).execute(it =>                        it.hasDuplicate,).amountOfCall,).toBe(0,) },)
                test("2 fields (unique)",                      () => { expect(new instance(AB,).execute(it =>                       it.hasDuplicate,).amountOfCall,).toBe(isMinimalist ? 2 : 0,) },)
                test("2 fields (duplicated)",                  () => { expect(new instance(AA,).execute(it =>                       it.hasDuplicate,).amountOfCall,).toBe(isMinimalist ? 2 : 0,) },)
                test("2 fields (null + undefined)",            () => { expect(new instance(NULL_UNDEFINED,).execute(it =>           it.hasDuplicate,).amountOfCall,).toBe(isMinimalist ? 2 : 0,) },)
                test("4 fields (unique)",                      () => { expect(new instance(ABCD,).execute(it =>                     it.hasDuplicate,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (duplicative)",                 () => { expect(new instance(ABAB,).execute(it =>                     it.hasDuplicate,).amountOfCall,).toBe(isLazy ? 0 : 3,) },)
                test("4 fields (duplicated at start)",         () => { expect(new instance(AABC,).execute(it =>                     it.hasDuplicate,).amountOfCall,).toBe(isLazy ? 0 : 2,) },)
                test("4 fields (duplicated at center)",        () => { expect(new instance(ABBC,).execute(it =>                     it.hasDuplicate,).amountOfCall,).toBe(isLazy ? 0 : 3,) },)
                test("4 fields (duplicated at end)",           () => { expect(new instance(ABCC,).execute(it =>                     it.hasDuplicate,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (null duplicative)",            () => { expect(new instance(A_NULL_C_NULL,).execute(it =>            it.hasDuplicate,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (nulls at start)",              () => { expect(new instance(NULL_NULL_AB,).execute(it =>             it.hasDuplicate,).amountOfCall,).toBe(isLazy ? 0 : 2,) },)
                test("4 fields (nulls at center)",             () => { expect(new instance(A_NULL_NULL_B,).execute(it =>            it.hasDuplicate,).amountOfCall,).toBe(isLazy ? 0 : 3,) },)
                test("4 fields (nulls at end)",                () => { expect(new instance(AB_NULL_NULL,).execute(it =>             it.hasDuplicate,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (undefined duplicative)",       () => { expect(new instance(A_UNDEFINED_C_UNDEFINED,).execute(it =>  it.hasDuplicate,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (undefineds at start)",         () => { expect(new instance(UNDEFINED_UNDEFINED_AB,).execute(it =>   it.hasDuplicate,).amountOfCall,).toBe(isLazy ? 0 : 2,) },)
                test("4 fields (undefineds at center)",        () => { expect(new instance(A_UNDEFINED_UNDEFINED_B,).execute(it =>  it.hasDuplicate,).amountOfCall,).toBe(isLazy ? 0 : 3,) },)
                test("4 fields (undefineds at end)",           () => { expect(new instance(AB_UNDEFINED_UNDEFINED,).execute(it =>   it.hasDuplicate,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (null + undefined at start)",   () => { expect(new instance(NULL_UNDEFINED_AB,).execute(it =>        it.hasDuplicate,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (null + undefined at center)",  () => { expect(new instance(A_NULL_UNDEFINED_B,).execute(it =>       it.hasDuplicate,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (null + undefined at end)",     () => { expect(new instance(AB_NULL_UNDEFINED,).execute(it =>        it.hasDuplicate,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (undefined + null at start)",   () => { expect(new instance(UNDEFINED_NULL_AB,).execute(it =>        it.hasDuplicate,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (undefined + null at center)",  () => { expect(new instance(A_UNDEFINED_NULL_B,).execute(it =>       it.hasDuplicate,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (undefined + null at end)",     () => { expect(new instance(AB_UNDEFINED_NULL,).execute(it =>        it.hasDuplicate,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
            },)
            describe("hasNoDuplicates", () => {
                test("empty",                                  () => { expect(new instance(EMPTY,).execute(it =>                    it.hasNoDuplicates,).amountOfCall,).toBe(0,) },)
                test("1 field",                                () => { expect(new instance(A,).execute(it =>                        it.hasNoDuplicates,).amountOfCall,).toBe(0,) },)
                test("2 fields (unique)",                      () => { expect(new instance(AB,).execute(it =>                       it.hasNoDuplicates,).amountOfCall,).toBe(isMinimalist ? 2 : 0,) },)
                test("2 fields (duplicated)",                  () => { expect(new instance(AA,).execute(it =>                       it.hasNoDuplicates,).amountOfCall,).toBe(isMinimalist ? 2 : 0,) },)
                test("2 fields (null + undefined)",            () => { expect(new instance(NULL_UNDEFINED,).execute(it =>           it.hasNoDuplicates,).amountOfCall,).toBe(isMinimalist ? 2 : 0,) },)
                test("4 fields (unique)",                      () => { expect(new instance(ABCD,).execute(it =>                     it.hasNoDuplicates,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (duplicative)",                 () => { expect(new instance(ABAB,).execute(it =>                     it.hasNoDuplicates,).amountOfCall,).toBe(isLazy ? 0 : 3,) },)
                test("4 fields (duplicated at start)",         () => { expect(new instance(AABC,).execute(it =>                     it.hasNoDuplicates,).amountOfCall,).toBe(isLazy ? 0 : 2,) },)
                test("4 fields (duplicated at center)",        () => { expect(new instance(ABBC,).execute(it =>                     it.hasNoDuplicates,).amountOfCall,).toBe(isLazy ? 0 : 3,) },)
                test("4 fields (duplicated at end)",           () => { expect(new instance(ABCC,).execute(it =>                     it.hasNoDuplicates,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (null duplicative)",            () => { expect(new instance(A_NULL_C_NULL,).execute(it =>            it.hasNoDuplicates,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (nulls at start)",              () => { expect(new instance(NULL_NULL_AB,).execute(it =>             it.hasNoDuplicates,).amountOfCall,).toBe(isLazy ? 0 : 2,) },)
                test("4 fields (nulls at center)",             () => { expect(new instance(A_NULL_NULL_B,).execute(it =>            it.hasNoDuplicates,).amountOfCall,).toBe(isLazy ? 0 : 3,) },)
                test("4 fields (nulls at end)",                () => { expect(new instance(AB_NULL_NULL,).execute(it =>             it.hasNoDuplicates,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (undefined duplicative)",       () => { expect(new instance(A_UNDEFINED_C_UNDEFINED,).execute(it =>  it.hasNoDuplicates,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (undefineds at start)",         () => { expect(new instance(UNDEFINED_UNDEFINED_AB,).execute(it =>   it.hasNoDuplicates,).amountOfCall,).toBe(isLazy ? 0 : 2,) },)
                test("4 fields (undefineds at center)",        () => { expect(new instance(A_UNDEFINED_UNDEFINED_B,).execute(it =>  it.hasNoDuplicates,).amountOfCall,).toBe(isLazy ? 0 : 3,) },)
                test("4 fields (undefineds at end)",           () => { expect(new instance(AB_UNDEFINED_UNDEFINED,).execute(it =>   it.hasNoDuplicates,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (null + undefined at start)",   () => { expect(new instance(NULL_UNDEFINED_AB,).execute(it =>        it.hasNoDuplicates,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (null + undefined at center)",  () => { expect(new instance(A_NULL_UNDEFINED_B,).execute(it =>       it.hasNoDuplicates,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (null + undefined at end)",     () => { expect(new instance(AB_NULL_UNDEFINED,).execute(it =>        it.hasNoDuplicates,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (undefined + null at start)",   () => { expect(new instance(UNDEFINED_NULL_AB,).execute(it =>        it.hasNoDuplicates,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (undefined + null at center)",  () => { expect(new instance(A_UNDEFINED_NULL_B,).execute(it =>       it.hasNoDuplicates,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
                test("4 fields (undefined + null at end)",     () => { expect(new instance(AB_UNDEFINED_NULL,).execute(it =>        it.hasNoDuplicates,).amountOfCall,).toBe(isLazy ? 0 : 4,) },)
            },)

            describe("requireNoNulls", () => {
                test("empty",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.requireNoNulls(),).amountOfCall,).toBe(0,),)
                test("1 field",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it =>     it.requireNoNulls(),).amountOfCall,).toBe(isMinimalist ? 2 : 1,),)
                test("2 fields", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it =>    it.requireNoNulls(),).amountOfCall,).toBe(isMinimalist ? 4 : 2,),)
                test("4 fields", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>  it.requireNoNulls(),).amountOfCall,).toBe(isLazy ? 4 : 8,),)
            },)
        },)

        describe("has", () => {
            test("empty",        () => expect(new instance<string>(EMPTY,).has('a',),).toBeFalse(),)
            test("1 field (a)",  () => expect(new instance(A,)            .has('a',),).toBeTrue(),)
            test("1 field (e)",  () => expect(new instance<string>(A,)    .has('e',),).toBeFalse(),)
            test("2 fields (a)", () => expect(new instance(AB,)           .has('a',),).toBeTrue(),)
            test("2 fields (b)", () => expect(new instance(AB,)           .has('b',),).toBeTrue(),)
            test("2 fields (e)", () => expect(new instance<string>(AB,)   .has('e',),).toBeFalse(),)
            test("4 fields (a)", () => expect(new instance(ABCD,)         .has('a',),).toBeTrue(),)
            test("4 fields (b)", () => expect(new instance(ABCD,)         .has('b',),).toBeTrue(),)
            test("4 fields (c)", () => expect(new instance(ABCD,)         .has('c',),).toBeTrue(),)
            test("4 fields (d)", () => expect(new instance(ABCD,)         .has('d',),).toBeTrue(),)
            test("4 fields (e)", () => expect(new instance<string>(ABCD,) .has('e',),).toBeFalse(),)
        },)
        describe("hasNot", () => {
            test("empty",        () => expect(new instance<string>(EMPTY,).hasNot('a',),).toBeTrue(),)
            test("1 field (a)",  () => expect(new instance(A,)            .hasNot('a',),).toBeFalse(),)
            test("1 field (e)",  () => expect(new instance<string>(A,)    .hasNot('e',),).toBeTrue(),)
            test("2 fields (a)", () => expect(new instance(AB,)           .hasNot('a',),).toBeFalse(),)
            test("2 fields (b)", () => expect(new instance(AB,)           .hasNot('b',),).toBeFalse(),)
            test("2 fields (e)", () => expect(new instance<string>(AB,)   .hasNot('e',),).toBeTrue(),)
            test("4 fields (a)", () => expect(new instance(ABCD,)         .hasNot('a',),).toBeFalse(),)
            test("4 fields (b)", () => expect(new instance(ABCD,)         .hasNot('b',),).toBeFalse(),)
            test("4 fields (c)", () => expect(new instance(ABCD,)         .hasNot('c',),).toBeFalse(),)
            test("4 fields (d)", () => expect(new instance(ABCD,)         .hasNot('d',),).toBeFalse(),)
            test("4 fields (e)", () => expect(new instance<string>(ABCD,) .hasNot('e',),).toBeTrue(),)
        },)

        describe("hasOne", () => {
            describe("null|undefined", () => {
                test("empty (null)",         () => expect(new instance(EMPTY,).hasOne(null,),).toBeFalse(),)
                test("empty (undefined)",    () => expect(new instance(EMPTY,).hasOne(undefined,),).toBeFalse(),)
                test("1 field (null)",       () => expect(new instance(A,)    .hasOne(null,),).toBeTrue(),)
                test("1 field (undefined)",  () => expect(new instance(A,)    .hasOne(undefined,),).toBeTrue(),)
                test("2 fields (null)",      () => expect(new instance(AB,)   .hasOne(null,),).toBeTrue(),)
                test("2 fields (undefined)", () => expect(new instance(AB,)   .hasOne(undefined,),).toBeTrue(),)
                test("4 fields (null)",      () => expect(new instance(ABCD,) .hasOne(null,),).toBeTrue(),)
                test("4 fields (undefined)", () => expect(new instance(ABCD,) .hasOne(undefined,),).toBeTrue(),)
            },)
            describe.each(everyIterableInstances,)("%s", ({value: it,},) => {
                test("empty (none)",      () => expect(new instance(EMPTY,)        .hasOne(it(EMPTY,),),).toBeFalse(),)
                test("empty (a)",         () => expect(new instance<string>(EMPTY,).hasOne(it(A,),),).toBeFalse(),)
                test("empty (ab)",        () => expect(new instance<string>(EMPTY,).hasOne(it(AB,),),).toBeFalse(),)
                test("empty (abcd)",      () => expect(new instance<string>(EMPTY,).hasOne(it(ABCD,),),).toBeFalse(),)
                test("1 field (none)",    () => expect(new instance(A,)            .hasOne(it(EMPTY,),),).toBeTrue(),)
                test("1 field (a)",       () => expect(new instance(A,)            .hasOne(it(A,),),).toBeTrue(),)
                test("1 field (e)",       () => expect(new instance<string>(A,)    .hasOne(it(E,),),).toBeFalse(),)
                test("1 field (ab)",      () => expect(new instance<string>(A,)    .hasOne(it(AB,),),).toBeTrue(),)
                test("1 field (ef)",      () => expect(new instance<string>(A,)    .hasOne(it(EF,),),).toBeFalse(),)
                test("1 field (abcd)",    () => expect(new instance<string>(A,)    .hasOne(it(ABCD,),),).toBeTrue(),)
                test("1 field (efgh)",    () => expect(new instance<string>(A,)    .hasOne(it(EFGH,),),).toBeFalse(),)
                test("2 fields (none)",   () => expect(new instance(AB,)           .hasOne(it(EMPTY,),),).toBeTrue(),)
                test("2 fields (a)",      () => expect(new instance(AB,)           .hasOne(it(A,),),).toBeTrue(),)
                test("2 fields (b)",      () => expect(new instance(AB,)           .hasOne(it(B,),),).toBeTrue(),)
                test("2 fields (e)",      () => expect(new instance<string>(AB,)   .hasOne(it(E,),),).toBeFalse(),)
                test("2 fields (ab)",     () => expect(new instance(AB,)           .hasOne(it(AB,),),).toBeTrue(),)
                test("2 fields (ef)",     () => expect(new instance<string>(AB,)   .hasOne(it(EF,),),).toBeFalse(),)
                test("2 fields (abcd)",   () => expect(new instance<string>(AB,)   .hasOne(it(ABCD,),),).toBeTrue(),)
                test("2 fields (efgh)",   () => expect(new instance<string>(AB,)   .hasOne(it(EFGH,),),).toBeFalse(),)
                test("4 fields (none)",   () => expect(new instance(ABCD,)         .hasOne(it(EMPTY,),),).toBeTrue(),)
                test("4 fields (a)",      () => expect(new instance(ABCD,)         .hasOne(it(A,),),).toBeTrue(),)
                test("4 fields (b)",      () => expect(new instance(ABCD,)         .hasOne(it(B,),),).toBeTrue(),)
                test("4 fields (c)",      () => expect(new instance(ABCD,)         .hasOne(it(C,),),).toBeTrue(),)
                test("4 fields (d)",      () => expect(new instance(ABCD,)         .hasOne(it(D,),),).toBeTrue(),)
                test("4 fields (e)",      () => expect(new instance<string>(ABCD,) .hasOne(it(E,),),).toBeFalse(),)
                test("4 fields (ab)",     () => expect(new instance(ABCD,)         .hasOne(it(AB,),),).toBeTrue(),)
                test("4 fields (ef)",     () => expect(new instance<string>(ABCD,) .hasOne(it(EF,),),).toBeFalse(),)
                test("4 fields (abcd)",   () => expect(new instance(ABCD,)         .hasOne(it(ABCD,),),).toBeTrue(),)
                test("4 fields (efgh)",   () => expect(new instance<string>(ABCD,) .hasOne(it(EFGH,),),).toBeFalse(),)
            },)
        },)
        describe("hasNotOne", () => {
            describe("null|undefined", () => {
                test("empty (null)",         () => expect(new instance(EMPTY,).hasNotOne(null,),).toBeTrue(),)
                test("empty (undefined)",    () => expect(new instance(EMPTY,).hasNotOne(undefined,),).toBeTrue(),)
                test("1 field (null)",       () => expect(new instance(A,)    .hasNotOne(null,),).toBeFalse(),)
                test("1 field (undefined)",  () => expect(new instance(A,)    .hasNotOne(undefined,),).toBeFalse(),)
                test("2 fields (null)",      () => expect(new instance(AB,)   .hasNotOne(null,),).toBeFalse(),)
                test("2 fields (undefined)", () => expect(new instance(AB,)   .hasNotOne(undefined,),).toBeFalse(),)
                test("4 fields (null)",      () => expect(new instance(ABCD,) .hasNotOne(null,),).toBeFalse(),)
                test("4 fields (undefined)", () => expect(new instance(ABCD,) .hasNotOne(undefined,),).toBeFalse(),)
            },)
            describe.each(everyIterableInstances,)("%s", ({value: it,},) => {
                test("empty (none)",     () => expect(new instance(EMPTY,)        .hasNotOne(it(EMPTY,),),).toBeTrue(),)
                test("empty (a)",        () => expect(new instance<string>(EMPTY,).hasNotOne(it(A,),),).toBeTrue(),)
                test("empty (ab)",       () => expect(new instance<string>(EMPTY,).hasNotOne(it(AB,),),).toBeTrue(),)
                test("empty (abcd)",     () => expect(new instance<string>(EMPTY,).hasNotOne(it(ABCD,),),).toBeTrue(),)
                test("1 field (none)",   () => expect(new instance(A,)            .hasNotOne(it(EMPTY,),),).toBeFalse(),)
                test("1 field (a)",      () => expect(new instance(A,)            .hasNotOne(it(A,),),).toBeFalse(),)
                test("1 field (e)",      () => expect(new instance<string>(A,)    .hasNotOne(it(E,),),).toBeTrue(),)
                test("1 field (ab)",     () => expect(new instance<string>(A,)    .hasNotOne(it(AB,),),).toBeFalse(),)
                test("1 field (ef)",     () => expect(new instance<string>(A,)    .hasNotOne(it(EF,),),).toBeTrue(),)
                test("1 field (abcd)",   () => expect(new instance<string>(A,)    .hasNotOne(it(ABCD,),),).toBeFalse(),)
                test("1 field (efgh)",   () => expect(new instance<string>(A,)    .hasNotOne(it(EFGH,),),).toBeTrue(),)
                test("2 fields (none)",  () => expect(new instance(AB,)           .hasNotOne(it(EMPTY,),),).toBeFalse(),)
                test("2 fields (a)",     () => expect(new instance(AB,)           .hasNotOne(it(A,),),).toBeFalse(),)
                test("2 fields (b)",     () => expect(new instance(AB,)           .hasNotOne(it(B,),),).toBeFalse(),)
                test("2 fields (e)",     () => expect(new instance<string>(AB,)   .hasNotOne(it(E,),),).toBeTrue(),)
                test("2 fields (ab)",    () => expect(new instance(AB,)           .hasNotOne(it(AB,),),).toBeFalse(),)
                test("2 fields (ef)",    () => expect(new instance<string>(AB,)   .hasNotOne(it(EF,),),).toBeTrue(),)
                test("2 fields (abcd)",  () => expect(new instance<string>(AB,)   .hasNotOne(it(ABCD,),),).toBeFalse(),)
                test("2 fields (efgh)",  () => expect(new instance<string>(AB,)   .hasNotOne(it(EFGH,),),).toBeTrue(),)
                test("4 fields (none)",  () => expect(new instance(ABCD,)         .hasNotOne(it(EMPTY,),),).toBeFalse(),)
                test("4 fields (a)",     () => expect(new instance(ABCD,)         .hasNotOne(it(A,),),).toBeFalse(),)
                test("4 fields (b)",     () => expect(new instance(ABCD,)         .hasNotOne(it(B,),),).toBeFalse(),)
                test("4 fields (c)",     () => expect(new instance(ABCD,)         .hasNotOne(it(C,),),).toBeFalse(),)
                test("4 fields (d)",     () => expect(new instance(ABCD,)         .hasNotOne(it(D,),),).toBeFalse(),)
                test("4 fields (e)",     () => expect(new instance<string>(ABCD,) .hasNotOne(it(E,),),).toBeTrue(),)
                test("4 fields (ab)",    () => expect(new instance(ABCD,)         .hasNotOne(it(AB,),),).toBeFalse(),)
                test("4 fields (ef)",    () => expect(new instance<string>(ABCD,) .hasNotOne(it(EF,),),).toBeTrue(),)
                test("4 fields (abcd)",  () => expect(new instance(ABCD,)         .hasNotOne(it(ABCD,),),).toBeFalse(),)
                test("4 fields (efgh)",  () => expect(new instance<string>(ABCD,) .hasNotOne(it(EFGH,),),).toBeTrue(),)
            },)
        },)

        describe("hasAll", () => {
            describe("null|undefined", () => {
                test("empty (null)",         () => expect(new instance(EMPTY,).hasAll(null,),).toBeTrue(),)
                test("empty (undefined)",    () => expect(new instance(EMPTY,).hasAll(undefined,),).toBeTrue(),)
                test("1 field (null)",       () => expect(new instance(A,)    .hasAll(null,),).toBeTrue(),)
                test("1 field (undefined)",  () => expect(new instance(A,)    .hasAll(undefined,),).toBeTrue(),)
                test("2 fields (null)",      () => expect(new instance(AB,)   .hasAll(null,),).toBeTrue(),)
                test("2 fields (undefined)", () => expect(new instance(AB,)   .hasAll(undefined,),).toBeTrue(),)
                test("4 fields (null)",      () => expect(new instance(ABCD,) .hasAll(null,),).toBeTrue(),)
                test("4 fields (undefined)", () => expect(new instance(ABCD,) .hasAll(undefined,),).toBeTrue(),)
            },)
            describe.each(everyIterableInstances,)("%s", ({value: it,},) => {
                test("empty (none)",    () => expect(new instance(EMPTY,)        .hasAll(it(EMPTY,),),).toBeTrue(),)
                test("empty (a)",       () => expect(new instance<string>(EMPTY,).hasAll(it(A,),),).toBeFalse(),)
                test("empty (ab)",      () => expect(new instance<string>(EMPTY,).hasAll(it(AB,),),).toBeFalse(),)
                test("empty (abcd)",    () => expect(new instance<string>(EMPTY,).hasAll(it(ABCD,),),).toBeFalse(),)
                test("1 field (none)",  () => expect(new instance(A,)            .hasAll(it(EMPTY,),),).toBeTrue(),)
                test("1 field (a)",     () => expect(new instance(A,)            .hasAll(it(A,),),).toBeTrue(),)
                test("1 field (e)",     () => expect(new instance<string>(A,)    .hasAll(it(E,),),).toBeFalse(),)
                test("1 field (ab)",    () => expect(new instance<string>(A,)    .hasAll(it(AB,),),).toBeFalse(),)
                test("1 field (ef)",    () => expect(new instance<string>(A,)    .hasAll(it(EF,),),).toBeFalse(),)
                test("1 field (abcd)",  () => expect(new instance<string>(A,)    .hasAll(it(ABCD,),),).toBeFalse(),)
                test("1 field (efgh)",  () => expect(new instance<string>(A,)    .hasAll(it(EFGH,),),).toBeFalse(),)
                test("2 fields (none)", () => expect(new instance(AB,)           .hasAll(it(EMPTY,),),).toBeTrue(),)
                test("2 fields (a)",    () => expect(new instance(AB,)           .hasAll(it(A,),),).toBeTrue(),)
                test("2 fields (b)",    () => expect(new instance(AB,)           .hasAll(it(B,),),).toBeTrue(),)
                test("2 fields (e)",    () => expect(new instance<string>(AB,)   .hasAll(it(E,),),).toBeFalse(),)
                test("2 fields (ab)",   () => expect(new instance(AB,)           .hasAll(it(AB,),),).toBeTrue(),)
                test("2 fields (ef)",   () => expect(new instance<string>(AB,)   .hasAll(it(EF,),),).toBeFalse(),)
                test("2 fields (abcd)", () => expect(new instance<string>(AB,)   .hasAll(it(ABCD,),),).toBeFalse(),)
                test("2 fields (efgh)", () => expect(new instance<string>(AB,)   .hasAll(it(EFGH,),),).toBeFalse(),)
                test("4 fields (none)", () => expect(new instance(ABCD,)         .hasAll(it(EMPTY,),),).toBeTrue(),)
                test("4 fields (a)",    () => expect(new instance(ABCD,)         .hasAll(it(A,),),).toBeTrue(),)
                test("4 fields (b)",    () => expect(new instance(ABCD,)         .hasAll(it(B,),),).toBeTrue(),)
                test("4 fields (c)",    () => expect(new instance(ABCD,)         .hasAll(it(C,),),).toBeTrue(),)
                test("4 fields (d)",    () => expect(new instance(ABCD,)         .hasAll(it(D,),),).toBeTrue(),)
                test("4 fields (e)",    () => expect(new instance<string>(ABCD,) .hasAll(it(E,),),).toBeFalse(),)
                test("4 fields (ab)",   () => expect(new instance(ABCD,)         .hasAll(it(AB,),),).toBeTrue(),)
                test("4 fields (ef)",   () => expect(new instance<string>(ABCD,) .hasAll(it(EF,),),).toBeFalse(),)
                test("4 fields (abcd)", () => expect(new instance(ABCD,)         .hasAll(it(ABCD,),),).toBeTrue(),)
                test("4 fields (efgh)", () => expect(new instance<string>(ABCD,) .hasAll(it(EFGH,),),).toBeFalse(),)
            },)
        },)
        describe("hasNotAll", () => {
            describe("null|undefined", () => {
                test("empty (null)",         () => expect(new instance(EMPTY,).hasNotAll(null,),).toBeFalse(),)
                test("empty (undefined)",    () => expect(new instance(EMPTY,).hasNotAll(undefined,),).toBeFalse(),)
                test("1 field (null)",       () => expect(new instance(A,)    .hasNotAll(null,),).toBeFalse(),)
                test("1 field (undefined)",  () => expect(new instance(A,)    .hasNotAll(undefined,),).toBeFalse(),)
                test("2 fields (null)",      () => expect(new instance(AB,)   .hasNotAll(null,),).toBeFalse(),)
                test("2 fields (undefined)", () => expect(new instance(AB,)   .hasNotAll(undefined,),).toBeFalse(),)
                test("4 fields (null)",      () => expect(new instance(ABCD,) .hasNotAll(null,),).toBeFalse(),)
                test("4 fields (undefined)", () => expect(new instance(ABCD,) .hasNotAll(undefined,),).toBeFalse(),)
            },)
            describe.each(everyIterableInstances,)("%s", ({value: it,},) => {
                test("empty (none)",    () => expect(new instance(EMPTY,)        .hasNotAll(it(EMPTY,),),).toBeFalse(),)
                test("empty (a)",       () => expect(new instance<string>(EMPTY,).hasNotAll(it(A,),),).toBeTrue(),)
                test("empty (ab)",      () => expect(new instance<string>(EMPTY,).hasNotAll(it(AB,),),).toBeTrue(),)
                test("empty (abcd)",    () => expect(new instance<string>(EMPTY,).hasNotAll(it(ABCD,),),).toBeTrue(),)
                test("1 field (none)",  () => expect(new instance(A,)            .hasNotAll(it(EMPTY,),),).toBeFalse(),)
                test("1 field (a)",     () => expect(new instance(A,)            .hasNotAll(it(A,),),).toBeFalse(),)
                test("1 field (e)",     () => expect(new instance<string>(A,)    .hasNotAll(it(E,),),).toBeTrue(),)
                test("1 field (ab)",    () => expect(new instance<string>(A,)    .hasNotAll(it(AB,),),).toBeTrue(),)
                test("1 field (ef)",    () => expect(new instance<string>(A,)    .hasNotAll(it(EF,),),).toBeTrue(),)
                test("1 field (abcd)",  () => expect(new instance<string>(A,)    .hasNotAll(it(ABCD,),),).toBeTrue(),)
                test("1 field (efgh)",  () => expect(new instance<string>(A,)    .hasNotAll(it(EFGH,),),).toBeTrue(),)
                test("2 fields (none)", () => expect(new instance(AB,)           .hasNotAll(it(EMPTY,),),).toBeFalse(),)
                test("2 fields (a)",    () => expect(new instance(AB,)           .hasNotAll(it(A,),),).toBeFalse(),)
                test("2 fields (b)",    () => expect(new instance(AB,)           .hasNotAll(it(B,),),).toBeFalse(),)
                test("2 fields (e)",    () => expect(new instance<string>(AB,)   .hasNotAll(it(E,),),).toBeTrue(),)
                test("2 fields (ab)",   () => expect(new instance(AB,)           .hasNotAll(it(AB,),),).toBeFalse(),)
                test("2 fields (ef)",   () => expect(new instance<string>(AB,)   .hasNotAll(it(EF,),),).toBeTrue(),)
                test("2 fields (abcd)", () => expect(new instance<string>(AB,)   .hasNotAll(it(ABCD,),),).toBeTrue(),)
                test("2 fields (efgh)", () => expect(new instance<string>(AB,)   .hasNotAll(it(EFGH,),),).toBeTrue(),)
                test("4 fields (none)", () => expect(new instance(ABCD,)         .hasNotAll(it(EMPTY,),),).toBeFalse(),)
                test("4 fields (a)",    () => expect(new instance(ABCD,)         .hasNotAll(it(A,),),).toBeFalse(),)
                test("4 fields (b)",    () => expect(new instance(ABCD,)         .hasNotAll(it(B,),),).toBeFalse(),)
                test("4 fields (c)",    () => expect(new instance(ABCD,)         .hasNotAll(it(C,),),).toBeFalse(),)
                test("4 fields (d)",    () => expect(new instance(ABCD,)         .hasNotAll(it(D,),),).toBeFalse(),)
                test("4 fields (e)",    () => expect(new instance<string>(ABCD,) .hasNotAll(it(E,),),).toBeTrue(),)
                test("4 fields (ab)",   () => expect(new instance(ABCD,)         .hasNotAll(it(AB,),),).toBeFalse(),)
                test("4 fields (ef)",   () => expect(new instance<string>(ABCD,) .hasNotAll(it(EF,),),).toBeTrue(),)
                test("4 fields (abcd)", () => expect(new instance(ABCD,)         .hasNotAll(it(ABCD,),),).toBeFalse(),)
                test("4 fields (efgh)", () => expect(new instance<string>(ABCD,) .hasNotAll(it(EFGH,),),).toBeTrue(),)
            },)
        },)

        describe("hasNull", () => {
            test("empty",                          () => expect(new instance(EMPTY,)             .hasNull,).toBeFalse(),)
            test("1 field (non-null)",             () => expect(new instance(A,)                 .hasNull,).toBeFalse(),)
            test("1 field (null)",                 () => expect(new instance(NULL,)              .hasNull,).toBeTrue(),)
            test("1 field (undefined)",            () => expect(new instance(UNDEFINED,)         .hasNull,).toBeTrue(),)
            test("2 fields (non-null)",            () => expect(new instance(AB,)                .hasNull,).toBeFalse(),)
            test("2 fields (null at start)",       () => expect(new instance(NULL_A,)            .hasNull,).toBeTrue(),)
            test("2 fields (null at end)",         () => expect(new instance(A_NULL,)            .hasNull,).toBeTrue(),)
            test("2 fields (undefined at start)",  () => expect(new instance(UNDEFINED_A,)       .hasNull,).toBeTrue(),)
            test("2 fields (undefined at end)",    () => expect(new instance(A_UNDEFINED,)       .hasNull,).toBeTrue(),)
            test("4 fields (non-null)",            () => expect(new instance(ABCD,)              .hasNull,).toBeFalse(),)
            test("3 fields (null at start)",       () => expect(new instance(NULL_AB,)           .hasNull,).toBeTrue(),)
            test("3 fields (null at center)",      () => expect(new instance(A_NULL_B,)          .hasNull,).toBeTrue(),)
            test("3 fields (null at end)",         () => expect(new instance(AB_NULL,)           .hasNull,).toBeTrue(),)
            test("3 fields (undefined at start)",  () => expect(new instance(UNDEFINED_AB,)      .hasNull,).toBeTrue(),)
            test("3 fields (undefined at center)", () => expect(new instance(A_UNDEFINED_B,)     .hasNull,).toBeTrue(),)
            test("3 fields (undefined at end)",    () => expect(new instance(AB_UNDEFINED,)      .hasNull,).toBeTrue(),)
            test("4 fields (null + undefined)",    () => expect(new instance(A_NULL_UNDEFINED_B,).hasNull,).toBeTrue(),)
        },)
        describe("hasNoNulls", () => {
            test("empty",                          () => expect(new instance(EMPTY,)             .hasNoNulls,).toBeTrue(),)
            test("1 field (non-null)",             () => expect(new instance(A,)                 .hasNoNulls,).toBeTrue(),)
            test("1 field (null)",                 () => expect(new instance(NULL,)              .hasNoNulls,).toBeFalse(),)
            test("1 field (undefined)",            () => expect(new instance(UNDEFINED,)         .hasNoNulls,).toBeFalse(),)
            test("2 fields (non-null)",            () => expect(new instance(AB,)                .hasNoNulls,).toBeTrue(),)
            test("2 fields (null at start)",       () => expect(new instance(NULL_A,)            .hasNoNulls,).toBeFalse(),)
            test("2 fields (null at end)",         () => expect(new instance(A_NULL,)            .hasNoNulls,).toBeFalse(),)
            test("2 fields (undefined at start)",  () => expect(new instance(UNDEFINED_A,)       .hasNoNulls,).toBeFalse(),)
            test("2 fields (undefined at end)",    () => expect(new instance(A_UNDEFINED,)       .hasNoNulls,).toBeFalse(),)
            test("4 fields (non-null)",            () => expect(new instance(ABCD,)              .hasNoNulls,).toBeTrue(),)
            test("3 fields (null at start)",       () => expect(new instance(NULL_AB,)           .hasNoNulls,).toBeFalse(),)
            test("3 fields (null at center)",      () => expect(new instance(A_NULL_B,)          .hasNoNulls,).toBeFalse(),)
            test("3 fields (null at end)",         () => expect(new instance(AB_NULL,)           .hasNoNulls,).toBeFalse(),)
            test("3 fields (undefined at start)",  () => expect(new instance(UNDEFINED_AB,)      .hasNoNulls,).toBeFalse(),)
            test("3 fields (undefined at center)", () => expect(new instance(A_UNDEFINED_B,)     .hasNoNulls,).toBeFalse(),)
            test("3 fields (undefined at end)",    () => expect(new instance(AB_UNDEFINED,)      .hasNoNulls,).toBeFalse(),)
            test("4 fields (null + undefined)",    () => expect(new instance(A_NULL_UNDEFINED_B,).hasNoNulls,).toBeFalse(),)
        },)

        describe("hasDuplicate", () => {
            test("empty",                           () => expect(new instance(EMPTY,)                       .hasDuplicate,).toBeFalse(),)
            test("1 field",                         () => expect(new instance(A,)                           .hasDuplicate,).toBeFalse(),)
            test("2 fields (unique)",               () => expect(new instance(AB,)                          .hasDuplicate,).toBeFalse(),)
            test("2 fields (duplicated)",           () => expect(new instance(AA,)                          .hasDuplicate,).toBeTrue(),)
            test("4 fields (unique)",               () => expect(new instance(ABCD,)                        .hasDuplicate,).toBeFalse(),)
            test("4 fields (duplicative)",          () => expect(new instance(ABAB,)                        .hasDuplicate,).toBeTrue(),)
            test("5 fields (1 null + 1 undefined)", () => expect(new instance(A_NULL_UNDEFINED_B,)          .hasDuplicate,).toBeFalse(),)
            test("5 fields (2 null + 1 undefined)", () => expect(new instance(A_NULL_NULL_UNDEFINED_B,)     .hasDuplicate,).toBeTrue(),)
            test("5 fields (1 null + 2 undefined)", () => expect(new instance(A_NULL_UNDEFINED_UNDEFINED_B,).hasDuplicate,).toBeTrue(),)
            test("4 fields (2 a + 1 b)",            () => expect(new instance(AABC,)                        .hasDuplicate,).toBeTrue(),)
            test("4 fields (1 a + 2 b)",            () => expect(new instance(ABBC,)                        .hasDuplicate,).toBeTrue(),)
        },)
        describe("hasNoDuplicates", () => {
            test("empty",                           () => expect(new instance(EMPTY,)                       .hasNoDuplicates,).toBeTrue(),)
            test("1 field",                         () => expect(new instance(A,)                           .hasNoDuplicates,).toBeTrue(),)
            test("2 fields (unique)",               () => expect(new instance(AB,)                          .hasNoDuplicates,).toBeTrue(),)
            test("2 fields (duplicated)",           () => expect(new instance(AA,)                          .hasNoDuplicates,).toBeFalse(),)
            test("4 fields (unique)",               () => expect(new instance(ABCD,)                        .hasNoDuplicates,).toBeTrue(),)
            test("4 fields (duplicative)",          () => expect(new instance(ABAB,)                        .hasNoDuplicates,).toBeFalse(),)
            test("5 fields (1 null + 1 undefined)", () => expect(new instance(A_NULL_UNDEFINED_B,)          .hasNoDuplicates,).toBeTrue(),)
            test("5 fields (2 null + 1 undefined)", () => expect(new instance(A_NULL_NULL_UNDEFINED_B,)     .hasNoDuplicates,).toBeFalse(),)
            test("5 fields (1 null + 2 undefined)", () => expect(new instance(A_NULL_UNDEFINED_UNDEFINED_B,).hasNoDuplicates,).toBeFalse(),)
            test("4 fields (2 a + 1 b)",            () => expect(new instance(AABC,)                        .hasNoDuplicates,).toBeFalse(),)
            test("4 fields (1 a + 2 b)",            () => expect(new instance(ABBC,)                        .hasNoDuplicates,).toBeFalse(),)
        },)

        describe("requireNoNulls", () => {
            test("empty",                         () => expectToBeInstance(new instance(EMPTY,), it => it                                              .requireNoNulls(),),)
            test("1 field (non-null)",            () => expectToBeInstance(new instance(A,), it => it                                                  .requireNoNulls(),),)
            test("1 field (null)",                () => expect(() => new instance(NULL,).executeWhileHavingIndexesOnField(it => it                     .requireNoNulls(),),).toThrow(TypeError,),)
            test("1 field (undefined)",           () => expect(() => new instance(UNDEFINED,).executeWhileHavingIndexesOnField(it => it                .requireNoNulls(),),).toThrow(TypeError,),)
            test("2 fields (non-null)",           () => expectToBeInstance(new instance(AB,), it => it                                                 .requireNoNulls(),),)
            test("2 fields (null at start)",      () => expect(() => new instance(NULL_A,).executeWhileHavingIndexesOnField(it => it                   .requireNoNulls(),),).toThrow(TypeError,),)
            test("2 fields (null at end)",        () => expect(() => new instance(A_NULL,).executeWhileHavingIndexesOnField(it => it                   .requireNoNulls(),),).toThrow(TypeError,),)
            test("2 fields (undefined at start)", () => expect(() => new instance(UNDEFINED_A,).executeWhileHavingIndexesOnField(it => it              .requireNoNulls(),),).toThrow(TypeError,),)
            test("2 fields (undefined at end)",   () => expect(() => new instance(A_UNDEFINED,).executeWhileHavingIndexesOnField(it => it              .requireNoNulls(),),).toThrow(TypeError,),)
            test("2 fields (null + undefined)",   () => expect(() => new instance(NULL_UNDEFINED,).executeWhileHavingIndexesOnField(it => it           .requireNoNulls(),),).toThrow(TypeError,),)
            test("4 fields (non-null)",            () => expectToBeInstance(new instance(ABCD,), it => it                                              .requireNoNulls(),),)
            test("3 fields (null at start)",       () => expect(() => new instance(NULL_AB,).executeWhileHavingIndexesOnField(it => it                 .requireNoNulls(),),).toThrow(TypeError,),)
            test("3 fields (null at center)",      () => expect(() => new instance(A_NULL_B,).executeWhileHavingIndexesOnField(it => it                .requireNoNulls(),),).toThrow(TypeError,),)
            test("3 fields (null at end)",         () => expect(() => new instance(AB_NULL,).executeWhileHavingIndexesOnField(it => it                 .requireNoNulls(),),).toThrow(TypeError,),)
            test("3 fields (undefined at start)",  () => expect(() => new instance(UNDEFINED_AB,).executeWhileHavingIndexesOnField(it => it            .requireNoNulls(),),).toThrow(TypeError,),)
            test("3 fields (undefined at center)", () => expect(() => new instance(A_UNDEFINED_B,).executeWhileHavingIndexesOnField(it => it           .requireNoNulls(),),).toThrow(TypeError,),)
            test("3 fields (undefined at end)",    () => expect(() => new instance(AB_UNDEFINED,).executeWhileHavingIndexesOnField(it => it            .requireNoNulls(),),).toThrow(TypeError,),)
            test("4 fields (null + undefined)",    () => expect(() => new instance(A_NULL_UNDEFINED_B,).executeWhileHavingIndexesOnField(it => it      .requireNoNulls(),),).toThrow(TypeError,),)

            if (isMinimalist)
                return // We only do some test that require the CollectionHolder.hasNull method
            describe("non-minimalist collection", () => {
                test("1 field (null)",                 () => expect(() => new instance(NULL,)              .requireNoNulls(),).toThrow(TypeError,),)
                test("1 field (undefined)",            () => expect(() => new instance(UNDEFINED,)         .requireNoNulls(),).toThrow(TypeError,),)
                test("2 fields (null at start)",       () => expect(() => new instance(NULL_A,)            .requireNoNulls(),).toThrow(TypeError,),)
                test("2 fields (null at end)",         () => expect(() => new instance(A_NULL,)            .requireNoNulls(),).toThrow(TypeError,),)
                test("2 fields (undefined at start)",  () => expect(() => new instance(UNDEFINED_A,)       .requireNoNulls(),).toThrow(TypeError,),)
                test("2 fields (undefined at end)",    () => expect(() => new instance(A_UNDEFINED,)       .requireNoNulls(),).toThrow(TypeError,),)
                test("2 fields (null + undefined)",    () => expect(() => new instance(NULL_UNDEFINED,)    .requireNoNulls(),).toThrow(TypeError,),)
                test("4 fields (null at start)",       () => expect(() => new instance(NULL_AB,)           .requireNoNulls(),).toThrow(TypeError,),)
                test("3 fields (null at center)",      () => expect(() => new instance(A_NULL_B,)          .requireNoNulls(),).toThrow(TypeError,),)
                test("3 fields (null at end)",         () => expect(() => new instance(AB_NULL,)           .requireNoNulls(),).toThrow(TypeError,),)
                test("3 fields (undefined at start)",  () => expect(() => new instance(UNDEFINED_AB,)      .requireNoNulls(),).toThrow(TypeError,),)
                test("3 fields (undefined at center)", () => expect(() => new instance(A_UNDEFINED_B,)     .requireNoNulls(),).toThrow(TypeError,),)
                test("3 fields (undefined at end)",    () => expect(() => new instance(AB_UNDEFINED,)      .requireNoNulls(),).toThrow(TypeError,),)
                test("4 fields (null + undefined)",    () => expect(() => new instance(A_NULL_UNDEFINED_B,).requireNoNulls(),).toThrow(TypeError,),)
            },)
        },)
    },)},)

},)
