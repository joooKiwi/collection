# Collection (javascript version)
[![downloads](https://img.shields.io/npm/dt/@joookiwi/collection.svg)](https://npm-stat.com/charts.html?package=@joookiwi/collection)

## Table of content
* [Installation](#installation)
* [Usage](#usage)
* [Contribution](#contribution)

The implementation originated from the [@joooKiwi/enumeration](https://github.com/joooKiwi/enumeration)
and is now a standalone implementation.

The way to think about this is to have the functionalities of other languages
(like `Java`, `PHP`, `C#`, `Kotlin` and even `Javascript`)
all in one standalone structure.

But, with a possible functional approach using the collections.

The structure is and will be in continuous change
to implement almost everything that the other languages have (if it is possible).

## Installation
```
npm install @joookiwi/collection
npm i @joookiwi/collection

npm install --save @joookiwi/collection
npm i -S @joookiwi/collection

npm install --save-dev @joookiwi/collection
npm i -D @joookiwi/collection
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
4. Some **utility** methods _(not part of the `CollectionHolder`)_

---
<span>1.</span> The **value** methods are:
 - `size`, `length` & `count`
 - `isEmpty` & `isNotEmpty`
 - `hasNull`, `includesNull` & `containsNull`
 - `hasDuplicate`, `includesDuplicate` & `containsDuplicate`
 - `get`, `at` & `elementAt`
 - `getOrElse`, `atOrElse` & `elementAtOrElse`
 - `getOrNull`, `atOrNull` & `elementAtOrNull`
 - `indexOf` & `lastIndexOf`
 - `indexOfFirst` & `indexOfFirstIndexed`
 - `indexOfLast` & `indexOfLastIndexed`
 - `first` & `firstOrNull`
 - `last` & `lastOrNull`

<span>2.</span> The **loop** methods are:
 - `all`, `any` & `none`
 - `has`, `includes` & `contains`
 - `hasOne`, `includesOne` &`containsOne`
 - `hasAll`, `includesAll` & `containsAll`
 - `joinToString` & `join`
 - `filter` & `filterIndexed`
 - `filterNot` & `filterIndexedNot`
 - `filterNotNull` & `requireNotNull`
 - `find` & `findIndexed`
 - `findLast` & `findLastIndexed`
 - `slice`
 - `map` & `mapIndexed`
 - `mapNotNull` & `mapNotNullIndexed`
 - `forEach` & `forEachIndexed`

<span>3.</span> The **conversion** methods
 - `objectValuesMap` _(a utility method to retrieve the object association of `WeakSet`)_
 - `toIterator`
 - `toArray` & `toMutableArray`
 - `toSet` & `toMutableSet`
 - `toWeakSet` & `toMutableWeakSet`
 - `toMap` & `toMutableMap`
 - `toReverse`, `toReversed`, `reversed`
 - `toString`, `toLocaleString`, `toLowerCaseString`, `toLocaleLowerCaseString`, `toUpperCaseString` & `toLocaleUpperCaseString`

<span>4.</span> The **utility** methods _(not part of the `CollectionHolder`)_
 - `asString`, `asLocaleString`, `asLowerCaseString`, `asLocaleLowerCaseString`, `asUpperCaseString` & `asLocaleUpperCaseString`
   _(These methods will be eventually moved in another project)_
 - `isMinimalistCollectionHolder` / `isMinimalistCollectionHoldeByStructure`
 - `isCollectionHolder` / `isCollectionHolderByStructure`
 - `isCollectionIterator` / `isCollectionIteratorByStructure`

---
Almost every method is present in the `src/method` at the exception to
`get(index)`, `getOrNull(index)` and `getOrElse(index, defaultValue)`
that is handled differently based on the type of instance.

The non-implemented methods are `size` (with its alias `length` & `count`)
and `isEmpty` with its inverse `isNotEmpty`.

The alias methods are not part of the extension function.
It includes:
 - `includesNull` / `containsNull`
 - `includesDuplicate` / `containsDuplicate`
 - `atOrElse` / `elementAtOrElse`
 - `atOrDefault` / `elementAtOrDefault`
 - `includes` / `contains`
 - `includesOne` / `containsOne`
 - `includesAll` / `containsAll`
 - `join` _(it will removed in version 1.10)_
 - `toReversed` / `reversed`.

## Contribution
You can contribute to great simple packages.
All with similar behaviour across different languages (like Java, Kotlin, C# and PHP).
It can be done 2 different ways:
 - [GitHub sponsor](https://github.com/sponsors/joooKiwi) or
 - [!["Buy me a Coffee"](https://img.buymeacoffee.com/button-api/?&button_colour=40DCA5&font_colour=ffffff&font_family=Cookie&outline_colour=000000&coffee_colour=FFDD00)](https://www.buymeacoffee.com/joookiwi)
