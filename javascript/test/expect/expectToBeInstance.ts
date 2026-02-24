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

import type {CollectionHolder} from "../../src/CollectionHolder"

/**
 * Do a partial test to validate that the returned value by the {@link action} is equal (===) to the {@link instance}
 *
 * @param instance The instance to do an action
 * @param action   The action to do and return a {@link CollectionHolder}
 */
export function expectToBeInstance<const INSTANCE extends CollectionHolder, >(instance: INSTANCE, action: (instance: INSTANCE,) => CollectionHolder,) {
    expect(action(instance,) === instance,).toBeTrue()
}
