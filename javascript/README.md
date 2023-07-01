# Collection (javascript version)

## Table of content
* [Installation](#installation)
* [Usage](#usage)
* [Contribution](#contribution)

The implementation originated from the [@joooKiwi/enumeration](https://github.com/joooKiwi/enumeration)
and is now a standalone implementation.

The way to think about this is to have the functionalities of other languages (like `Java`, `PHP`, `C#`, `Kotlin` and even `Javascript`)
all in one standalone structure.

But, with a possible functional approach using the collections.

The structure is and will be in continuous change in order to implement almost everything that the other languages have (if it is possible).

## Installation
```
npm install @joookiwi/collection
npm i @joookiwi/lazy

npm install --save @joookiwi/collection
npm i -S @joookiwi/lazy

npm install --save-dev @joookiwi/collection
npm i -D @joookiwi/lazy
```

## Usage

There are 2 different kinds of collections.
A lazy (`LazyGenericCollectionHolder`) and an eager (`GenericCollectionHolder`) one.
All of which are non-mutable.

So, no computation can be done _"normally"_ in these instances.

But they can always be converted to the `Array`, `Set`, `WeakSet` or even `Map` depending on the usage.

It can be separated in different categories.
1. The **value** methods
2. The **loop** methods
3. The **conversion** methods
4. Some hasNull **utility** methods _(not part of the `CollectionHolder`)_

---
<span>1.</span> The **value** methods are:
 - `size`, `length` & `count`
 - `isEmpty` & `isNotEmpty`
 - `hasNull`, `includesNull` & `containsNull`
 - `get` & `at`
 - `getOrElse` & `atOrElse`
 - `getOrNull` & `atOrNull`
 - `indexOf` & `lastIndexOf`
 - `indexOfFirst` & `indexOfFirstIndexed`
 - `indexOfLast` & `indexOfLastIndexed`
 - `first` & `firstOrNull`
 - `last` & `lastOrNull`

<span>2.</span> The **loop** methods are:
 - `all`, `any` & `none`
 - `hasOne`, `includesOne` & `containsOne`
 - `hasAll`, `includesAll` & `containsAll`
 - `join`
 - `filter` & `filterIndexed`
 - `filterNot` & `filterIndexedNot`
 - `filterNotNull` & `requireNotNull`
 - `find` & `findIndexed`
 - `findLast` & `findLastIndexed`
 - `map` & `mapIndexed`
 - `forEach` & `forEachIndexed`

<span>3.</span> The **conversion** methods
 - `objectValuesMap` _(a utility method to retrieve the object association of `WeakSet`)_
 - `toIterator`
 - `toArray` & `toMutableArray`
 - `toSet` & `toMutableSet`
 - `toMap` & `toMutableMap`
 - `toReversed`
 - `toString` & `toLocaleString`

<span>4.</span> The **utility** methods _(not part of the `CollectionHolder`)_
 - `endingIndex`
 - `startingIndex`
 - `newInstance`

---
Almost every method is present in the `src/methods` at the exception of `get(index)`
that is handled differently based on the type of instance.

The non-implemented methods are `size` (with its alias `length` & `count`)
and `isEmpty` with its inverse `isNotEmpty`.

The alias methods are not part of the extension function.
It includes `includesNull`, `containsNull`, `atOrElse`, `atOrDefault`,
`includesOne`, `containsOne`, `includesAll` & `containsAll`.

## Contribution
You can contribute to great simple packages.
All with similar behaviour across different languages (like Java, Kotlin, C# and PHP).
It can be done via my [GitHub sponsor](https://github.com/sponsors/joooKiwi).
