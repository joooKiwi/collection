# Collection (javascript version)
[![version][npm-image-link]][npm-link]
[![downloads][npm-download-image-link]][npm-download-link]

[npm-image-link]:          https://img.shields.io/npm/v/@joookiwi/collection.svg?logo=npm&label=
[npm-link]:                https://npmjs.org/package/@joookiwi/collection
[npm-download-image-link]: https://img.shields.io/npm/dt/@joookiwi/collection.svg
[npm-download-link]:       https://npm-stat.com/charts.html?package=@joookiwi/collection

## Table of content
* [Installation](#installation)
* [Usage](#usage)
  * [The size methods](#the-size-methods)
  * [The research methods](#the-research-methods)
  * [The index methods](#the-index-methods)
  * [The validation methods](#the-validation-methods)
  * [The transformation methods](#the-transformation-methods)
  * [The loop methods](#the-loop-methods)
  * [The reordering methods](#the-reordering-methods)
  * [The conversion methods](#the-conversion-methods)
  * [The utility methods](#the-utility-methods)
  * [Non-present methods](#non-present-methods)
* [Contribution](#contribution)

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

There are 3 different kinds of collections (_which are all non-mutable_).
- a minimalist (`GenericMinimalistCollectionHolder`),
- a lazy (`LazyGenericCollectionHolder`)
- and an eager (`GenericCollectionHolder`) one.

So, no computation can be done _"normally"_ in these instances.

But they can always be converted to
the `Array`, `Set`,
`WeakSet` (it the type is a `WeakKey`)
or even `Map` depending on the usage.

It can be separated in different categories.
1. The **size** methods
2. The **research** methods
3. The **index** methods
4. The **validation** methods
5. The **transformation** methods
6. The **loop** methods
7. The **reordering** methods
8. The **conversion** methods
9. Some **utility** methods _(not part of the `CollectionHolder`)_

---
### The size methods

Those methods are associated with a size or directly compared
 - `size`|`length`|`count`
 - `isEmpty`
 - `isNotEmpty`

### The research methods

Those methods are meant to find an element comparing it
or giving a value from the **collection**
 - `get`|`at`|`elementAt`
 - `getOrElse`|`atOrElse`|`elementAtOrElse`
 - `getOrNull`|`atOrNull`|`elementAtOrNull`
 - `first`
 - `firstOrNull`
 - `last`
 - `lastOrNull`
 - `find`
 - `findIndexed`
 - `findLast`
 - `findLastIndexed`

### The index methods

Those methods are giving or finding index values in the **collection**
 - `indexOf`
 - `lastIndexOf`
 - `indexOfFirst`
 - `indexOfFirstIndexed`
 - `indexOfLast`
 - `indexOfLastIndexed`

### The validation methods

Those methods are to give a validation on some type, value
or comparison across the **collection**
 - `all`
 - `any`
 - `none`
 - `hasNull`|`includesNull`|`containsNull`
 - `hasDuplicate`|`includesDuplicate`|`containsDuplicate`
 - `has`|`includes`|`contains`
 - `hasOne`|`includesOne`|`containsOne`
 - `hasAll`|`includesAll`|`containsAll`
 - `requireNotNull`

### The transformation methods

Those methods have the purpose to give a new **collection** 
with a possibly different type from the original **collection**
 - `filter`
 - `filterIndexed`
 - `filterNot`
 - `filterIndexedNot`
 - `filterNotNull`
 - `slice`
 - `map`
 - `mapIndexed`
 - `mapNotNull`
 - `mapNotNullIndexed`

### The loop methods

Those methods are just doing a basic loop on the **collection**
 - `forEach`
 - `forEachIndexed`
 - `onEach`
 - `onEachIndexed`

### The reordering methods

Those methods are just changing the order to the elements of the **collection**
 - `toReverse`|`toReversed`|`reversed`

### The conversion methods

Those methods have the sole purpose to convert the structure from a **collection**
to another structure.
It can also convert the value to a **string**.
 - ~~`objectValuesMap`~~ (_a no longer useful utility method that will be removed in the version 1.11_)
 - `toIterator`
 - `toArray`
 - `toMutableArray`
 - `toSet`
 - `toMutableSet`
 - `toWeakSet` (_only if the it is an `object`|`symbol` or in `GenericObjectCollectionHolder`_)
 - `toMutableWeakSet` (_only if it is an `object`|`symbol` or in `GenericObjectCollectionHolder`_)
 - `toMap`
 - `toMutableMap`
 - `toString`
 - `toLocaleString`
 - `toLowerCaseString`
 - `toLocaleLowerCaseString`
 - `toUpperCaseString`
 - `toLocaleUpperCaseString`
 - `joinToString`|`join`

### The utility methods

Those methods are not part of the `CollectionHolder`,
but are a complement to the overall robustest of the **collection**
 - `asString` (_This will be eventually moved in another project_)
 - `asLocaleString` (_This will be eventually moved in another project_)
 - `asLowerCaseString` (_This will be eventually moved in another project_)
 - `asLocaleLowerCaseString` (_This will be eventually moved in another project_)
 - `asUpperCaseString` (_This will be eventually moved in another project_)
 - `asLocaleUpperCaseString` (_This will be eventually moved in another project_)
 - `isArray`
 - `isArrayByStructure`
 - `isCollectionHolder`
 - `isCollectionHolderByStructure`
 - `isCollectionIterator`
 - `isCollectionIteratorByStructure`
 - `isMinimalistCollectionHolder`
 - `isMinimalistCollectionHoldeByStructure`
 - `isSet`
 - `isSetByStructure`

---

### Non-present methods

Almost every method is present in the `src/method` at the exception to
`get(index)` and `get size()` that is handled differently based on the type of instance.

The alias methods are not part of the extension function.
It includes:
 - `get length()` / `get count()`
 - `includesNull()` / `containsNull()`
 - `includesDuplicate()` / `containsDuplicate()`
 - `atOrElse()` / `elementAtOrElse()`
 - `atOrDefault()` / `elementAtOrDefault()`
 - `includes()` / `contains()`
 - `includesOne()` / `containsOne()`
 - `includesAll()` / `containsAll()`
 - `join()`
 - `toReversed()` / `reversed()`.

## Contribution
You can contribute to great simple packages.
All with similar behaviour across different languages (like Java, Kotlin, C# and PHP).
It can be done 2 different ways:
 - [GitHub sponsor](https://github.com/sponsors/joooKiwi) or
 - [!["Buy me a Coffee"](https://img.buymeacoffee.com/button-api/?&button_colour=40DCA5&font_colour=ffffff&font_family=Cookie&outline_colour=000000&coffee_colour=FFDD00)](https://www.buymeacoffee.com/joookiwi)
