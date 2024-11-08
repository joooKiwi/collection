# Collection

This project has the sole purpose to have methods in a collection (list, array, set enumerable) with similar methods (or extension method).

It retrieves notions from `Javascript`, `Java`, `Kotlin`, `PHP` and `C#`.

Also, all the features are based on immutability.

_(Maybe other languages will be integrated, only the future will tell it)_

## Table of content
* [Publication location](#publication-location)
* [Related projects](#related-projects)
* [Contribution](#contribution)
* [Equivalence depending on the language](#equivalence-depending-on-the-language)
  * [Size methods](#size-methods)
  * [Research methods](#research-methods)
  * [Index methods](#index-methods)
  * [Validation methods](#validation-methods)
  * [Transformation methods](#transformation-methods)
  * [Loop methods](#loop-methods)
  * [Reordering methods](#reordering-methods)
  * [Conversion methods](#conversion-methods)
* [Version history](#version-history)

## Publication location
This project has only the Javascript / Typescript version uploaded.

But other languages will have different features based on how they can handle it.

| Language                  |                                               Published                                               |
|:--------------------------|:-----------------------------------------------------------------------------------------------------:|
| Javascript<br/>Typescript | [![version][npm-image-link]][npm-link]<br/>[![downloads][npm-download-image-link]][npm-download-link] |
| Java                      |                                                 Maven                                                 |
| Kotlin                    |                                                 Maven                                                 |
| PHP                       |                                               Composer                                                |
| C#                        |                                                 Nuget                                                 |

[npm-image-link]:          https://img.shields.io/npm/v/@joookiwi/collection.svg?logo=npm&label=
[npm-link]:                https://npmjs.org/package/@joookiwi/collection
[npm-download-image-link]: https://img.shields.io/npm/dt/@joookiwi/collection.svg
[npm-download-link]:       https://npm-stat.com/charts.html?package=@joookiwi/collection

## Related projects

Here is a list of the related projects made by me
- type ([GitHub](https://github.com/joooKiwi/type) | [NPM](https://www.npmjs.com/package/@joookiwi/type))
- lazy ([GitHub](https://github.com/joooKiwi/lazy) | [NPM](https://www.npmjs.com/package/@joookiwi/lazy))
- enumeration ([GitHub](https://github.com/joooKiwi/enumeration) | [NPM](https://www.npmjs.com/package/@joookiwi/enumerable))

## Contribution

You can contribute to my projects in 2 different ways
- [GitHub sponsor](https://github.com/sponsors/joooKiwi) or
- [!["Buy me a Coffee"](https://img.buymeacoffee.com/button-api/?&button_colour=40DCA5&font_colour=ffffff&font_family=Cookie&outline_colour=000000&coffee_colour=FFDD00)](https://www.buymeacoffee.com/joookiwi)

## Equivalence depending on the language

Every method used in the project has a reference in one or another language.
They are used differently across different languages.
But they should result to the same thing in the end.
They are meant to give a preview, but not always the most efficient.

The structure can sometime have an equivalent on other languages:

| variable in a template | Javascript                                            | Java                          | Kotlin                                                                           | PHP                               | C#                                                                                           |
|------------------------|-------------------------------------------------------|-------------------------------|----------------------------------------------------------------------------------|-----------------------------------|----------------------------------------------------------------------------------------------|
| iterable               | Object with a [[Symbol.iterator]][js-symbol-iterator] | [Iterable][java-iterable]     | [Iterable][kotlin-iterable] / [MutableIterable][kotlin-mutable-iterable]         | [IteratorAggregate][php-iterable] | [IEnumerable][c#-iterable-1] / [IEnumerable<T>][c#-iterable-2] / [Enumerable][c#-iterable-3] |
| iterator               | [Iterator][js-iterator]                               | [Iterator][java-iterator]     | [Iterator][kotlin-iterator] / [MutableIterator][kotlin-mutable-iterator]         | [Iterator][php-iterator]          | [IEnumerator][c#-iterator-1] / [IEnumerator<T>][c#-iterator-2]                               |
| array                  | [Array][js-array]                                     | Array                         | [Array][kotlin-array]                                                            | [Array][php-array]                | [ImmutableArray][c#-array] / [Array][c#-mutable-array]                                       |
| collection             | _N/A_                                                 | [Collection][java-collection] | [Collection][kotlin-collection] / [MutableCollection][kotlin-mutable-collection] | [Collection][php-collection]      | [IReadOnlyCollection][c#-collection] / [ICollection][c#-mutable-collection]                  |
| list                   | _N/A_                                                 | [List][java-list]             | [List][kotlin-list] / [MutableList][kotlin-mutable-list]                         | _N/A_                             | [IImmutableList][c#-list-2] / [IReadOnlyList][c#-list-1] / [IList][c#-mutable-list]          |
| set                    | [Set][js-set] / [WeakSet][js-weak-set]                | [Set][java-set]               | [Set][kotlin-set] / [MutableSet][kotlin-mutable-set]                             | [Set][php-set]                    | [IImmutableSet][c#-set-2] / [IReadOnlySet][c#-set-1] / [ISet][c#-mutable-set]                |
 
Quick note: _For the `C#`, no external library other than the `.NET` is used (even though `MoreLINQ` is a fantastic library) ._

Another note: _Some parts may be incomplete due to some research that has to be made._

### Size methods

The methods directly associated to a size
 - `size`|`length`|`count`()
 - `isEmpty`()
 - `isNotEmpty`()

<details><summary>get size()<br/>get length()<br/>get count()</summary>

| Language       | Equivalent                                                                                         |
|:---------------|:---------------------------------------------------------------------------------------------------|
| **Javascript** | [Array.length][js-array-size]<br/>[Set.size][js-set-size]                                          |
| **Java**       | `array.length`<br/>[Collection.size()][java-size]                                                  |
| **Kotlin**     | `array.size`<br/>[Collection.size][kotlin-size]                                                    |
| **PHP**        | `sizeof($array)`                                                                                   |
| **C#**         | [IEnumerable.Count()][c#-i-enumerable-size]<br/>[ICollection.Count][c#-i-collection-size]          |

</details>
<br/>
<details><summary>get isEmpty()</summary>

| Language       | Equivalent                                                                                      |
|:---------------|:------------------------------------------------------------------------------------------------|
| **Javascript** | `array.length === 0`<br/>`set.size === 0`                                                       |
| **Java**       | `array.length == 0`<br/>[Collection.isEmpty()][java-is-empty]                                   |
| **Kotlin**     | [Array.isEmpty()][kotlin-array-is-empty]<br/>[Collection.isEmpty()][kotlin-collection-is-empty] |
| **PHP**        | `empty($array)`                                                                                 |
| **C#**         | [IEnumerable.Any()][c#-is-empty]                                                                |

</details>
<details><summary>get isNotEmpty()</summary>

| Language       | Equivalent                                                            |
|:---------------|:----------------------------------------------------------------------|
| **Javascript** | `array.length !== 0`<br/>`set.size !== 0`                             |
| **Java**       | `array.length != 0`<br/>`!collection.isEmpty()`                       |
| **Kotlin**     | [Array.isNotEmpty()<br/>Collection.isNotEmpty()][kotlin-is-not-empty] |
| **PHP**        | `!empty($array)`                                                      |
| **C#**         | `!iEnumerable.Any()`                                                  |

</details>

### Research methods

The methods are made to find an element or giving a value
 - `get`|`at`|`elementAt`(index)
 - `getFirst`|`first`()
 - `getLast`|`last`()
 - `getOrElse`|`atOrElse`|`elementAtOrElse`(index, defaultValue)
 - `getOrDefault`|`atOrDefault`|`elementAtOrDefault`(index)
 - `getOrNull`|`atOrNull`|`elementAtOrNull`(index)
 - `getFirstOrDefault`|`firstOrDefault`()
 - `getFirstOrNull`|`firstOrNull`()
 - `getLastOrDefault`|`lastOrDefault`()
 - `getLastOrNull`|`lastOrNull`()
 - `findFirst`|`find`|`first`(predicate)
 - `findFirstOrNull`|`findOrNull`|`firstOrNull`(predicate)
 - `findFirstIndexed`|`findIndexed`|`firstIndexed`(predicate)
 - `findFirstIndexedOrNull`|`findIndexedOrNull`|`firstIndexedOrNull`(predicate)
 - `findLast`|`last`(predicate)
 - `findLastOrNull`|`lastOrNull`(predicate)
 - `findLastIndexed`|`lastIndexed`(predicate)
 - `findLastIndexedOrNull`|`lastIndexedOrNull`(predicate)

<details><summary>get(index)</summary>

| Language       | Equivalent                                                                                                                                       |
|:---------------|:-------------------------------------------------------------------------------------------------------------------------------------------------|
| **Javascript** | <ul><li>[Array.at(index)][js-get]                                                                                                                |
| **Java**       | <ul><li>[List.get(index)][java-get]                                                                                                              |
| **Kotlin**     | <ul><li>[Array.elementAt(index)<br/>Iterable.elementAt(index)<br/>List.elementAt(index)][kotlin-array-get]<li>[List.get(index)][kotlin-list-get] |
| **PHP**        | `$array[$index]`                                                                                                                                 |
| **C#**         | <ul><li>[IEnumerable.ElementAt(index)][c#-i-enumerable-get]<li>[IList[index]][c#-i-list-get]                                                     |

</details>
<details><summary>getFirst()</summary>

| Language       | Equivalent                                                                  |
|:---------------|:----------------------------------------------------------------------------|
| **Javascript** | `0 in array ? array[0] : throw`                                             |
| **Java**       | `collection.stream().findFirst().orElseThrow()`                             |
| **Kotlin**     | <ul><li>[Array.first()<br/>Iterable.first()<br/>List.first()][kotlin-first] |
| **PHP**        |                                                                             |
| **C#**         | <ul><li>[IEnumerable.First()][c#-first]                                     |

</details>
<details><summary>getLast()</summary>

| Language       | Equivalent                                                              |
|:---------------|:------------------------------------------------------------------------|
| **Javascript** | `size - 1 in array[size - 1] : throw `                                  |
| **Java**       | `collection.stream().reduce((_, it) -> it).orElseThrow()`               |
| **Kotlin**     | <ul><li>[Array.last()<br/>Iterable.last()<br/>List.last()][kotlin-last] |
| **PHP**        |                                                                         |
| **C#**         | <ul><li>[IEnumerable.Last()][c#-last]                                   |

</details>
<br/>

<details><summary>getOrElse(index, defaultValue)</summary>

| Language       | Equivalent                                                                                                                                                                                                                                                                         |
|:---------------|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Javascript** | `index in array ? array[index] : defaultValue()`                                                                                                                                                                                                                                   |
| **Java**       | `index < size ? array[index] : defaultValue()`                                                                                                                                                                                                                                     |
| **Kotlin**     | <ul><li>[Array.elementAtOrElse(index, defaultValue)<br/>Iterable.elementAtOrElse(index, defaultValue)<br/>List.elementAtOrElse(index, defaultValue)][kotlin-get-or-else-2]<li>[Array.getOrElse(index, defaultValue)<br/>List.getOrElse(index, defaultValue)][kotlin-get-or-else-1] |
| **PHP**        | `array_key_exists($index, $array) ? $array[$index] : defaultValue()`                                                                                                                                                                                                               |
| **C#**         | `enumerable.ElementAtOrDefault(index) ?? defaultValue()`                                                                                                                                                                                                                           |

</details>
<br/>

<details><summary>getOrDefault(index)</summary>

| Language           | Equivalent                                                         |
|:-------------------|:-------------------------------------------------------------------|
| **~~Javascript~~** |                                                                    |
| **~~Java~~**       |                                                                    |
| **~~Kotlin~~**     |                                                                    |
| **~~PHP~~**        |                                                                    |
| **C#**             | <ul><li>[IEnumerable.ElementAtOrDefault(index)][c#-get-or-default] |

</details>
<details><summary>getFirstOrDefault()</summary>

| Language           | Equivalent                                                  |
|:-------------------|:------------------------------------------------------------|
| **~~Javascript~~** |                                                             |
| **~~Java~~**       |                                                             |
| **~~Kotlin~~**     |                                                             |
| **~~PHP~~**        |                                                             |
| **C#**             | <ul><li>[IEnumerable.FirstOrDefault()][c#-first-or-default] |

</details>
<details><summary>getLastOrDefault()</summary>

| Language           | Equivalent                                                |
|:-------------------|:----------------------------------------------------------|
| **~~Javascript~~** |                                                           |
| **~~Java~~**       |                                                           |
| **~~Kotlin~~**     |                                                           |
| **~~PHP~~**        |                                                           |
| **C#**             | <ul><li>[IEnumerable.LastOrDefault()][c#-last-or-default] |

</details>
<details><summary>getOrNull(index)</summary>

| Language       | Equivalent                                                                                                                                                                                                   |
|:---------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Javascript** | `index in array ? array[index] : null`                                                                                                                                                                       |
| **Java**       | `index <= size ? array[index] : null`                                                                                                                                                                        |
| **Kotlin**     | <ul><li>[Array.elementAtOrNull(index)<br/>Iterable.elementAtOrNull(index)<br/>List.elementAtOrNull(index)][kotlin-get-or-null-2]<li>[Array.getOrNull(index)<br/>List.getOrNull(index)][kotlin-get-or-null-1] |
| **PHP**        | `$array?[$index]`                                                                                                                                                                                            |
| **C#**         | `enumerable.ElementAtOrDefault(index) ?? null`                                                                                                                                                               |

</details>
<details><summary>getFirstOrNull()</summary>

| Language       | Equivalent                                                                                            |
|:---------------|:------------------------------------------------------------------------------------------------------|
| **Javascript** | `0 in array ? array[0] : null`                                                                        |
| **Java**       | `collection.stream().findFirst().orElse(null)`                                                        |
| **Kotlin**     | <ul><li>[Array.firstOrNull()<br/>Iterable.firstOrNull()<br/>List.firstOrNull()][kotlin-first-or-null] |
| **PHP**        |                                                                                                       |
| **C#**         |                                                                                                       |

</details>
<details><summary>getLastOrNull()</summary>

| Language       | Equivalent                                                                                        |
|:---------------|:--------------------------------------------------------------------------------------------------|
| **Javascript** | `size - 1 in array ? array[size - 1] : null`                                                      |
| **Java**       | `collection.stream().reduce((_, it) -> it).orElse(null)`                                          |
| **Kotlin**     | <ul><li>[Array.lastOrNull()<br/>Iterable.lastOrNull()<br/>List.lastOrNull()][kotlin-last-or-null] |
| **PHP**        |                                                                                                   |
| **C#**         |                                                                                                   |

</details>
<br/>

<details><summary>findFirst(predicate)<br/>findFirstIndexed(predicate)</summary>

| Language       | Equivalent                                                                             |
|:---------------|:---------------------------------------------------------------------------------------|
| **Javascript** | `array.find(predicate,) ?? throw`                                                      |
| **Java**       | `collection.stream().filter(predicate).findFirst().orElseThrow()`                      |
| **Kotlin**     | <ul><li>[Array.first(predicate)<br/>Iterable.first(predicate)][kotlin-first-predicate] |
| **PHP**        |                                                                                        |
| **C#**         | <ul><li>[IEnumerable.First(predicate)][c#-first-predicate]                             |

</details>
<details><summary>findFirstOrDefault(predicate)<br/>findFirstIndexedOrDefault(predicate)</summary>

| Language           | Equivalent                                                                     |
|:-------------------|:-------------------------------------------------------------------------------|
| **~~Javascript~~** |                                                                                |
| **~~Java~~**       |                                                                                |
| **~~Kotlin~~**     |                                                                                |
| **~~PHP~~**        |                                                                                |
| **C#**             | <ul><li>[IEnumerable.FirstOrDefault(predicate)][c#-first-or-default-predicate] |

</details>
<details><summary>findFirstOrNull(predicate)<br/>findFirstIndexedOrNull(predicate)</summary>

| Language       | Equivalent                                                                                                                                                                      |
|:---------------|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Javascript** | <ul><li>[Array.find(predicate)][js-find]                                                                                                                                        |
| **Java**       | `collection.stream().filter(predicate).findFirst().orElse(null)`                                                                                                                |
| **Kotlin**     | <ul><li>[Array.firstOrNull(predicate)<br/>Iterable.firstOrNull(predicate)][kotlin-first-or-null-predicate]<li>[Array.find(predicate)<br/>Iterable.find(predicate)][kotlin-find] |
| **PHP**        |                                                                                                                                                                                 |
| **C#**         | <ul><li>[IEnumerable.FirstOrDefault(predicate)][c#-first-or-default-predicate]<li>[Find(array, predicate)][c#-array-find]<li>[List.Find(predicate)][c#-list-find]               |

</details>
<br/>

<details><summary>findLast(predicate)<br/>findLastIndexed(predicate)</summary>

| Language       | Equivalent                                                                               |
|:---------------|:-----------------------------------------------------------------------------------------|
| **Javascript** | `array.findLast(predicate,) ?? throw`                                                    |
| **Java**       | `collection.stream().filter(predicate).reduce((_, it) -> it).orElseThrow()`              |
| **Kotlin**     | <ul><li>[Array.last(predicate)<br/>Iterable.last(predicate)][kotlin-last-predicate]      |
| **PHP**        |                                                                                          |
| **C#**         | <ul><li>[IEnumerable.Last(predicate)][c#-last-predicate]                                 |

</details>
<details><summary>findLastOrDefault(predicate)<br/>findLastIndexedOrDefault(predicate)</summary>

| Language           | Equivalent                                                                   |
|:-------------------|:-----------------------------------------------------------------------------|
| **~~Javascript~~** |                                                                              |
| **~~Java~~**       |                                                                              |
| **~~Kotlin~~**     |                                                                              |
| **~~PHP~~**        |                                                                              |
| **C#**             | <ul><li>[IEnumerable.LastOrDefault(predicate)][c#-last-or-default-predicate] |

</details>
<details><summary>findLastOrNull(predicate)<br/>findLastIndexedOrNull(predicate)</summary>

| Language       | Equivalent                                                                                                                                                                                                                                            |
|:---------------|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Javascript** | <ul><li>[Array.findLast(predicate)][js-find-last]                                                                                                                                                                                                     |
| **Java**       | `collection.stream().filter(predicate).reduce((_, it) -> it).orElse(null)`                                                                                                                                                                            |
| **Kotlin**     | <ul><li>[Array.lastOrNull(predicate)<br/>Iterable.lastOrNull(predicate)<br/>List.lastOrNull(predicate)][kotlin-last-or-null-predicate]<li>[Array.findLast(predicate)<br/>Iterable.findLast(predicate)<br/>List.findLast(predicate)][kotlin-find-last] |
| **PHP**        |                                                                                                                                                                                                                                                       |
| **C#**         | <ul><li>[IEnumerable.LastOrDefault(predicate)][c#-last-or-default-predicate]                                                                                                                                                                          |

</details>
<br/>

### Index methods

The methods are made to find an index
 - `firstIndexOf`|`indexOf`(element, fromIndex?, toIndex?)
 - `firstIndexOfOrNull`|`indexOfOrNull`(element, fromIndex?, toIndex?)
 - `lastIndexOf`(element, fromIndex?, toIndex?)
 - `lastIndexOfOrNull`(element, fromIndex?, toIndex?)
 - `indexOfFirst`|`findFirstIndex`|`findIndex`(predicate, fromIndex?, toIndex?)
 - `indexOfFirstOrNull`|`findFirstIndexOrNull`|`findIndexOrNull`(predicate, fromIndex?, toIndex?)
 - `indexOfFirstIndexed`|`findFirstIndexIndexed`|`findIndexIndexed`(predicate, fromIndex?, toIndex?)
 - `indexOfFirstIndexedOrNull`|`findFirstIndexIndexedOrNull`|`findIndexIndexedOrNull`(predicate, fromIndex?, toIndex?)
 - `indexOfLast`|`findLastIndex`(predicate, fromIndex?, toIndex?)
 - `indexOfLastOrNull`|`findLastIndexOrNull`(predicate, fromIndex?, toIndex?)
 - `indexOfLastIndexed`|`findLastIndexIndexed`(predicate, fromIndex?, toIndex?)
 - `indexOfLastIndexedOrNull`|`findLastIndexIndexedOrNull`(predicate, fromIndex?, toIndex?)

<details><summary>firstIndexOf(element)</summary>

| Language       | Equivalent                                                                                                                                                                |
|:---------------|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Javascript** | <ul><li>[Array.indexOf(element)][js-index-of-element]                                                                                                                     |
| **Java**       | <ul><li>[List.indexOf(element)][java-index-of-element]                                                                                                                    |
| **Kotlin**     | <ul><li>[Array.indexOf(element)<br/>Iterable.indexOf(element)<br/>List.indexOf(element)][kotlin-index-of-element]                                                         |
| **PHP**        |                                                                                                                                                                           |
| **C#**         | <ul><li>[IndexOf(array, element)][c#-array-index-of-element]<li>[IList.IndexOf(element)][c#-i-list-index-of-element]<li>[List.IndexOf(element)][c#-list-index-of-element] |

</details>
<details><summary>firstIndexOf(element, fromIndex)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

 - [Array.indexOf(element, fromIndex)][js-index-of-element-from]
</td></tr>
<tr><th>Java</th><td>

```java
for (var i = calculate-starting-index(fromIndex); i < size; i++)
    if (array[i] == element)
        return i;
throw
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
for (i in calculate-starting-index(fromIndex)..(size - 1))
    if (element in array[i])
        return i
throw
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

 - [IndexOf(array, element, fromIndex)][c#-array-index-of-element-from]
 - [List.IndexOf(element, fromIndex)][c#-list-index-of-element-from]
</td></tr>
</table></details>
<details><summary>firstIndexOf(element, fromIndex, toIndex)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
const startingIndex = calculate-starting-index(fromIndex)
const endingIndex = calculate-ending-index(toIndex)
for (let i = startingIndex; i <= endingIndex; i+=)
    if (array[i] === element)
        return i
throw
```

</td></tr>
<tr><th>Java</th><td>

```java
final var startingIndex = calculate-starting-index(fromIndex);
final var endingIndex = calculate-ending-index(toIndex);
var index = startingIndex - 1;
while (++index <= endingIndex)
    if (array[i] == element)
        return i;
throw
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
for (i in calculate-starting-index(fromIndex)..calculate-ending-index(toIndex))
    if (element in array[i])
        return i
throw
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

```csharp
foreach (var i in calculate-starting-index(fromIndex)..calculate-ending-index(toIndex))
    if (array[i] == element)
        return i;
throw
```
</td></tr>
</table></details>
<br/>

<details><summary>firstIndexOfOrNull(element)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
for (let i = 0; i < size; i++)
    if (array[i] === element)
        return i
return null
```
</td></tr>
<tr><th>Java</th><td>

```java
for (var i = 0; i < size; i++)
    if (array[i] == element)
        return i;
return null;
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
for (i in 0..(size - 1))
    if (element in array[i])
        return i
return null
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

```csharp
foreach (var i in 0..(size - 1))
    if (array[i] == element)
        return i;
return null;
```
</td></tr>
</table></details>
<details><summary>firstIndexOfOrNull(element, fromIndex)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
for (let i = calculate-starting-index(fromIndex); i < size; i++)
    if (element in array[i])
        return i
return null
```
</td></tr>
<tr><th>Java</th><td>

```java
for (var i = calculate-starting-index(fromIndex); i < size; i++)
    if (array[i] == element)
        return i;
return null;
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
for (i in calculate-starting-index(fromIndex)..(size - 1))
    if (element in array[i])
        return i
return null
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

```csharp
foreach (i in calculate-starting-index(fromIndex)..(size - 1))
    if (array[i] == element)
        return i;
return null;
```
</td></tr>
</table></details>
<details><summary>firstIndexOf(element, fromIndex, toIndex)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
const startingIndex = calculate-starting-index(fromIndex)
const endingIndex = calculate-ending-index(toIndex)
for (let i = startingIndex; i <= endingIndex; i++)
    if (array[i] === element)
        return i
return null
```

</td></tr>
<tr><th>Java</th><td>

```java
final var startingIndex = calculate-starting-index(fromIndex);
final var endingIndex = calculate-ending-index(toIndex);
for (var i = startingIndex; i < endingIndex; i++)
    if (array[i] == element)
        return i;
return null;
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
for (i in calculate-starting-index(fromIndex)..calculate-ending-index(toIndex))
    if (element in array[i])
        return i
return null
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

```csharp
foreach (var i in calculate-starting-index(fromIndex)..calculate-ending-index(toIndex))
    if (array[i] == element)
        return i;
return null;
```
</td></tr>
</table></details>
<br/>

<details><summary>lastIndexOf(element)</summary>

| Language       | Equivalent                                                                                                                          |
|:---------------|:------------------------------------------------------------------------------------------------------------------------------------|
| **Javascript** | <ul><li>[Array.lastIndexOf(element)][js-last-index-of-element]                                                                      |
| **Java**       | <ul><li>[List.lastIndexOf(element)][java-last-index-of-element]                                                                     |
| **Kotlin**     | <ul><li>[Array.lastIndexOf(element)<br/>Iterable.lastIndexOf(element)<br/>List.lastIndexOf(element)][kotlin-last-index-of-element]  |
| **PHP**        |                                                                                                                                     |
| **C#**         | <ul><li>[LastIndexOf(array, element)][c#-array-last-index-of-element]<li>[List.LastIndexOf(element)][c#-list-last-index-of-element] |

</details>
<details><summary>lastIndexOf(element, fromIndex)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

- [Array.lastIndexOf(element, fromIndex)][js-last-index-of-element-from]
</td></tr>
<tr><th>Java</th><td>

```java
final var startingIndex = calculate-starting-index(fromIndex);
var index = size;
while (--index >= startingIndex)
    if (array[index] == element)
        return index;
throw
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
val startingIndex = calculate-starting-index(fromIndex)
var index = size
while (--index >= startingIndex)
    if (element in array[index])
        return index
throw
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

- [LastIndexOf(array, element, fromIndex)][c#-array-last-index-of-element-from]
- [List.LastIndexOf(element, fromIndex)][c#-list-last-index-of-element-from]
</td></tr>
</table></details>
<details><summary>lastIndexOf(element, fromIndex, toIndex)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
const startingIndex = calculate-starting-index(fromIndex)
const endingIndex = calculate-ending-index(toIndex)
var index = endingIndex + 1
while (--index >= startingIndex)
    if (array[index] == element)
        return index
throw
```
</td></tr>
<tr><th>Java</th><td>

```java
final var startingIndex = calculate-starting-index(fromIndex);
final var endingIndex = calculate-ending-index(toIndex);
var index = endingIndex + 1;
while (--index >= startingIndex)
    if (array[index] == element)
        return index;
throw
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
val startingIndex = calculate-starting-index(fromIndex)
val endingIndex = calculate-ending-index(toIndex)
var index = endingIndex + 1
while (--index >= startingIndex)
    if (element in array[index])
        return index
throw
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

```csharp
var startingIndex = calculate-starting-index(fromIndex);
var endingIndex = calculate-ending-index(toIndex);
var index = endingIndex + 1;
while (--index >= startingIndex)
    if (array[index] == element)
        return index;
return null;
```
</td></tr>
</table></details>
<br/>

<details><summary>lastIndexOfOrNull(element)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```java
for (let i = size - 1; i > -1; i--)
    if (array[i] === element)
        return i
return null
```
</td></tr>
<tr><th>Java</th><td>

```java
for (var i = size - 1; i > -1; i--)
    if (array[i] == element)
        return i;
return null;
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
for (i in (size - 1) downTo 0)
    if (element in array[i])
        return i
return null
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

```csharp
for (var i = size - 1; i >= -1; i--)
    if (array[i] == element)
        return i;
return null;
```
</td></tr>
</table></details>
<details><summary>lastIndexOfOrNull(element, fromIndex)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```java
const startingIndex = calculate-starting-index(fromIndex)
for (let i = size - 1; i >= startingIndex; i--)
    if (array[i] === element)
        return i
return null
```
</td></tr>
<tr><th>Java</th><td>

```java
final var startingIndex = calculate-starting-index(fromIndex);
for (var i = size - 1; i >= startingIndex; i--)
    if (array[i] == element)
        return i;
return null;
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
for (i in (size - 1) downTo calculate-starting-index(fromIndex))
    if (element in array[i])
        return i
return null
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

```csharp
final var startingIndex = calculate-starting-index(fromIndex);
for (var i = size - 1; i >= startingIndex; i--)
    if (array[i] == element)
        return i;
return null;
```
</td></tr>
</table></details>
<details><summary>lastIndexOfOrNull(element, fromIndex, toIndex)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
const startingIndex = calculate-starting-index(fromIndex)
const endingIndex = calculate-ending-index(toIndex)
for (let i = endingIndex; i >= startingIndex; i--)
    if (array[i] === element)
        return i
return null
```
</td></tr>
<tr><th>Java</th><td>

```java
final var startingIndex = calculate-starting-index(fromIndex);
final var endingIndex = calculate-ending-index(toIndex);
while (var i = endingIndex; i >= startingIndex; i--)
    if (array[i] == element)
        return i;
return null;
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
val startingIndex = calculate-starting-index(fromIndex)
val endingIndex = calculate-ending-index(toIndex)
for (i in endingIndex downTo startingIndex)
    if (element in array[i])
        return i
return null
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

```csharp
var startingIndex = calculate-starting-index(fromIndex);
var endingIndex = calculate-ending-index(toIndex);
while (var i = endingIndex; i >= startingIndex; i--)
    if (array[i] == element)
        return i;
return null;
```
</td></tr>
</table></details>
<br/>

<details><summary>indexOfFirst(predicate)<br/>indexOfFirstIndexed(predicate)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

 - [Array.findIndex(predicate)][js-index-of-first-element]
</td></tr>
<tr><th>Java</th><td>

```java
for (var i = 0; i < size; i++)
    if (predicate)
        return i;
return null;
```
</td></tr>
<tr><th>Kotlin</th><td>

 - [Array.indexOfFirst(predicate)<br/>Iterable.indexOfFirst(predicate)<br/>List.indexOfFirst(predicate)][kotlin-index-of-first-element]
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

 - [FindIndex(array, predicate)][c#-array-index-of-first-element]
 - [List.FindIndex(predicate)][c#-list-index-of-first-element]
</td></tr>
</table></details>
<details><summary>indexOfFirst(predicate, fromIndex)<br/>indexOfFirstIndexed(predicate, fromIndex)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
for (let i = calculate-starting-index(fromIndex); i < size; i++)
    if (predicate)
        return i
return null
```
</td></tr>
<tr><th>Java</th><td>

```java
for (var i = calculate-starting-index(fromIndex); i < size; i++)
    if (predicate)
        return i;
return null;
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
for (i in calculate-starting-index(fromIndex)..(size - 1))
    if (predicate)
        return i
return null
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

- [FindIndex(array, fromIndex, predicate)][c#-array-index-of-first-element-from]
- [List.FindIndex(fromIndex, predicate)][c#-list-index-of-first-element-from]
</td></tr>
</table></details>
<details><summary>indexOfFirst(predicate, fromIndex, toIndex)<br/>indexOfFirstIndexed(predicate, fromIndex, toIndex)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
const startingIndex = calculate-starting-index(fromIndex)
const endingIndex = calculate-ending-index(toIndex)
for (let i = startingIndex; i <= endingIndex; i++)
    if (predicate)
        return i
return null
```
</td></tr>
<tr><th>Java</th><td>

```java
final var startingIndex = calculate-starting-index(fromIndex);
final var endingIndex = calculate-ending-index(toIndex);
for (var i = startingIndex; i <= endingIndex; i++)
    if (predicate)
        return i;
return null;
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
for (i in calculate-starting-index(fromIndex)..alculate-ending-index(toIndex))
    if (predicate)
        return i
return null
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

```csharp
foreach (var i in calculate-starting-index(fromIndex)..calculate-ending-index(toIndex))
    if (predicate)
        return i;
return null;
```
</td></tr>
</table></details>
<br/>

<details><summary>indexOfFirstOrNull(predicate)<br/>indexOfFirstIndexedOrNull(predicate)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

 - [Array.findIndex(predicate)][js-index-of-first-element]
</td></tr>
<tr><th>Java</th><td>

```java
for (let i = 0; i < size; i++)
    if (predicate)
        return index;
return null;
```
</td></tr>
<tr><th>Kotlin</th><td>

 - [Array.indexOfFirst(predicate)<br/>Iterable.indexOfFirst(predicate)<br/>List.indexOfFirst(predicate)][kotlin-index-of-first-element]
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

 - [FindIndex(array, predicate)][c#-array-index-of-first-element]
 - [List.FindIndex(predicate)][c#-list-index-of-first-element]
</td></tr>
</table></details>
<details><summary>indexOfFirstOrNull(predicate, fromIndex)<br/>indexOfFirstIndexedOrNull(predicate, fromIndex)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
for (let i = calculate-starting-index(fromIndex); i < size; i++)
    if (predicate)
        return i
return null
```
</td></tr>
<tr><th>Java</th><td>

```java
for (var i = calculate-starting-index(fromIndex); i < size; i++)
    if (predicate)
        return i;
return null;
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
for (i in calculate-starting-index(fromIndex)..(size - 1))
    if (predicate)
        return i
return null
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

```csharp
foreach (var i = calculate-starting-index(fromIndex)..(size - 1))
    if (predicate)
        return i;
return null;
```
</td></tr>
</table></details>
<details><summary>indexOfFirstOrNull(predicate, fromIndex, toIndex)<br/>indexOfFirstIndexedOrNull(predicate, fromIndex, toIndex)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
const startingIndex = calculate-starting-index(fromIndex)
const endingIndex = calculate-ending-index(toIndex)
for (let i = startingIndex; i < endingIndex; i++)
    if (predicate)
        return i
return null
```
</td></tr>
<tr><th>Java</th><td>

```java
final var startingIndex = calculate-starting-index(fromIndex);
final var endingIndex = calculate-ending-index(toIndex);
for (var i = startingIndex; i < endingIndex; i++)
    if (predicate)
        return i;
return null;
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
for (i in calculate-starting-index(fromIndex)..calculate-ending-index(toIndex))
    if (predicate)
        return i
return null
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

```csharp
foreach (i in calculate-starting-index(fromIndex)..calculate-ending-index(toIndex))
    if (predicate)
        return i;
return null;
```
</td></tr>
</table></details>
<br/>

<details><summary>indexOfLast(predicate)<br/>indexOfLastIndexed(predicate)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

 - [Array.findLastIndex(predicate)][js-index-of-first-element]
</td></tr>
<tr><th>Java</th><td>

```java
for (var i = size - 1; i > -1; i--)
    if (predicate)
        return i;
throw
```
</td></tr>
<tr><th>Kotlin</th><td>

 - [Array.indexOfLast(predicate)<br/>Iterable.indexOfLast(predicate)<br/>List.indexOfLast(predicate)][kotlin-index-of-first-element]
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

 - [FindLastIndex(array, predicate)][c#-array-index-of-first-element]
 - [List.FindLastIndex(predicate)][c#-list-index-of-first-element]
</td></tr>
</table></details>
<details><summary>indexOfLast(predicate, fromIndex)<br/>indexOfLastIndexed(predicate, fromIndex)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
const startingIndex = calculate-starting-index(fromIndex,)
for (let i = size - 1; i >= startingIndex; i--)
    if (predicate)
        return index
throw
```
</td></tr>
<tr><th>Java</th><td>

```java
final var startingIndex = calculate-starting-index(fromIndex);
for (var i = size - 1; i >= startingIndex; i--)
    if (predicate)
        return index;
throw
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
for (i in (size - 1) downTo calculate-starting-index(fromIndex))
    if (predicate)
       return index
throw
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

- [FindLastIndex(array, predicate)][c#-array-index-of-first-element-from]
- [List.FindLastIndex(predicate)][c#-list-index-of-first-element-from]
</td></tr>
</table></details>
<details><summary>indexOfLast(predicate, fromIndex, toIndex)<br/>indexOfLastIndexed(predicate, fromIndex, toIndex)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
const startingIndex = calculate-starting-index(fromIndex,)
const endingIndex = calculate-ending-index(toIndex,)
for (let i = endingIndex; i >= startingIndex; i--)
    if (predicate)
        return i
throw
```
</td></tr>
<tr><th>Java</th><td>

```java
final var startingIndex = calculate-starting-index(fromIndex);
final var endingIndex = calculate-ending-index(toIndex);
for (let i = endingIndex; i >= startingIndex; i--)
    if (predicate)
        return i;
throw
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
val startingIndex = calculate-starting-index(fromIndex)
val endingIndex = calculate-ending-index(toIndex)
for (i in endingIndex downTo startingIndex)
    if (predicate)
        return i
throw
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

```csharp
var startingIndex = calculate-starting-index(fromIndex);
var endingIndex = calculate-ending-index(toIndex);
for (let i = endingIndex; i >= startingIndex; i--)
    if (predicate)
        return i;
throw
```
</td></tr>
</table></details>
<br/>

<details><summary>indexOfLastOrNull(predicate)<br/>indexOfLastIndexedOrNull(predicate)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
for (let i = size - 1; i > -1; i--)
    if (predicate)
        return i
return null
```
</td></tr>
<tr><th>Java</th><td>

```java
for (var i = size - 1; i > -1; i--)
    if (predicate)
        return i;
return null;
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
for (i in (size - 1) downTo 0)
    if (predicate)
        return i;
return null;
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

```csharp
for (var i = size - 1; i > -1; i--)
    if (predicate)
        return i;
return null;
```
</td></tr>
</table></details>
<details><summary>indexOfLastOrNull(predicate, fromIndex)<br/>indexOfLastIndexedOrNull(predicate, fromIndex)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
const startingIndex = calculate-starting-index(fromIndex,)
for (let i = size - 1; i >= startingIndex; i--)
    if (predicate)
        return index
return null
```
</td></tr>
<tr><th>Java</th><td>

```java
final var startingIndex = calculate-starting-index(fromIndex);
for (var i = size - 1; i >= startingIndex; i--)
    if (predicate)
        return i;
return null;
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
val startingIndex = 
var index = size
for (i in (size - 1) downTo calculate-starting-index(fromIndex))
    if (predicate)
        return i
return null
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

```csharp
var startingIndex = calculate-starting-index(fromIndex);
for (var i = size - 1; i >= startingIndex; i--)
    if (predicate)
        return i;
return null;
```
</td></tr>
</table></details>
<details><summary>indexOfLastOrNull(predicate, fromIndex, toIndex)<br/>indexOfLastIndexedOrNull(predicate, fromIndex, toIndex)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
const startingIndex = calculate-starting-index(fromIndex,)
const endingIndex = calculate-ending-index(toIndex,)
for (let i = endingIndex; i >= startingIndex; i--)
    if (predicate)
        return i
return null
```
</td></tr>
<tr><th>Java</th><td>

```java
final var startingIndex = calculate-starting-index(fromIndex);
final var endingIndex = calculate-ending-index(toIndex);
for (let i = endingIndex; i >= startingIndex; i--)
    if (predicate)
        return i;
return null;
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
val startingIndex = calculate-starting-index(fromIndex)
val endingIndex = calculate-ending-index(toIndex)
for (i in endingIndex downTo startingIndex)
    if (predicate)
        return i
return null
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

```csharp
var startingIndex = calculate-starting-index(fromIndex);
var endingIndex = calculate-ending-index(toIndex);
for (let i = endingIndex; i >= startingIndex; i--)
    if (predicate)
        return i;
return null;
```
</td></tr>
</table></details>

### Validation methods

The methods are made to do validation on type, value or comparison
 - `all`|`every`()
 - `any`|`some`(predicate?)
 - `none`(predicate?)
 - `hasNull`|`containsNull`|`includesNull`()
 - `hasDuplicate`|`containsDuplicate`|`includesDuplicate`()
 - `has`|`contains`|`includes`(value)
 - `hasOne`|`containsOne`|`includesOne`(values)
 - `hasAll`|`containsAll`|`includesAll`(values)
 - `requireNoNulls`()

<details><summary>all(predicate)</summary>

| Language       | Equivalent                                                             |
|:---------------|:-----------------------------------------------------------------------|
| **Javascript** | <ul><li>[Array.every(predicate)][js-all]                               |
| **Java**       | `collection.stream().allMatch(predicate)`                              |
| **Kotlin**     | <ul><li>[Array.all(predicate)<br/>Iterable.all(predicate)][kotlin-all] |
| **PHP**        |                                                                        |
| **C#**         | <ul><li>[IEnumerable.All(predicate)][c#-all]                           |

</details>
<details><summary>any()</summary>

| Language       | Equivalent                                            |
|:---------------|:------------------------------------------------------|
| **Javascript** | <ul><li>`array.length !== 0`<li>`set.size !== 0`      |
| **Java**       | <ul><li>`array.length == 0`<li>`collection.isEmpty()` |
| **Kotlin**     | <ul><li>[Array.any()<br/>Iterable.any()][kotlin-any]  |
| **PHP**        |                                                       |
| **C#**         | <ul><li>[IEnumerable.Any()][c#-any]                   |

</details>
<details><summary>any(predicate)</summary>

| Language       | Equivalent                                                                       |
|:---------------|:---------------------------------------------------------------------------------|
| **Javascript** | <ul><li>[Array.some(predicate)][js-any-predicate]                                |
| **Java**       | `collection.stream().anyMatch(predicate)`                                        |
| **Kotlin**     | <ul><li>[Array.any(predicate)<br/>Iterable.any(predicate)][kotlin-any-predicate] |
| **PHP**        |                                                                                  |
| **C#**         | <ul><li>[IEnumerable.Any(predicate)][c#-any-predicate]                           |

</details>
<details><summary>none()</summary>

| Language       | Equivalent                                              |
|:---------------|:--------------------------------------------------------|
| **Javascript** | <ul><li>`array.length === 0`<li>`set.size === 0`        |
| **Java**       | <ul><li>`array.length == 0`<li>`!collection.isEmpty()`  |
| **Kotlin**     | <ul><li>[Array.none()<br/>Iterable.none()][kotlin-none] |
| **PHP**        |                                                         |
| **C#**         | <ul><li>`!enumerable.Any()`                             |

</details>
<details><summary>none(predicate)</summary>

| Language       | Equivalent                                                                          |
|:---------------|:------------------------------------------------------------------------------------|
| **Javascript** | `array.some(!predicate)`                                                            |
| **Java**       | `collection.stream().noneMatch(predicate)`                                          |
| **Kotlin**     | <ul><li>[Array.none(predicate)<br/>Iterable.none(predicate)][kotlin-none-predicate] |
| **PHP**        |                                                                                     |
| **C#**         | `enumerable.Any(!predicate)`                                                        |
</details>
<br/>

<details><summary>hasNull()</summary>

| Language       | Equivalent                                                                     |
|:---------------|:-------------------------------------------------------------------------------|
| **Javascript** | `array.includes(null,)`                                                        |
| **Java**       | `collection.contains(null)`                                                    |
| **Kotlin**     | _N/A_                                                                          |
| **PHP**        | `in_array(null, $array, true)`                                                 |
| **C#**         | `enumerable.Contains(null)`<br/>`list.Contains(null)`<br/>`set.Contains(null)` |
</details>
<details><summary>hasDuplicate()</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
const temporaryArray = new Array(size,)
temporaryArray[0] = array[0]
let amountOfItemAdded = 1
let index = 0
while (++index < size) {
    const value = array[index]
    let index2 = -1
    while (++index2 < amountOfItemAdded)
        if (temporaryArray[index2] === value)
            return true
  temporaryArray[amountOfItemAdded++] = value
}
return false
```
</td></tr>
<tr><th>Java</th><td>

```java
final var temporaryArray = (T[]) new Object[size]
temporaryArray[0] = array[0]
var amountOfItemAdded = 1
var index = 0
while (++index < size) {
    final var value = array[index]
    var index2 = -1
    while (++index2 < amountOfItemAdded)
        if (temporaryArray[index2] == value)
            return true
  temporaryArray[amountOfItemAdded++] = value
}
return false
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
val temporaryArray = arrayOfNulls<T>(size,)
temporaryArray[0] = array[0]
var amountOfItemAdded = 1
var index = 0
while (++index < size) {
    val value = array[index]
    var index2 = -1
    while (++index2 < amountOfItemAdded)
        if (temporaryArray[index2] == value)
            return true
  temporaryArray[amountOfItemAdded++] = value
}
return false
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

```csharp
var temporaryArray = new T[size]
temporaryArray[0] = array[0]
var amountOfItemAdded = 1
var index = 0
while (++index < size) {
    var value = array[index]
    var index2 = -1
    while (++index2 < amountOfItemAdded)
        if (temporaryArray[index2] == value)
            return true
  temporaryArray[amountOfItemAdded++] = value
}
return false
```
</td></tr>
</table></details>
<br/>

<details><summary>has(value)</summary>

| Language       | Equivalent                                                                    |
|:---------------|:------------------------------------------------------------------------------|
| **Javascript** | <ul><li>[Array.includes(value)][js-array-has]<li>[Set.has(value)][js-set-has] |
| **Java**       | <ul><li>[List.contains(value)][java-has]                                      |
| **Kotlin**     | <ul><li>[Array.contains(value)<br/>Iterable.contains(value)][kotlin-has]      |
| **PHP**        |                                                                               |
| **C#**         | <ul><li>[IList.contains(value)][c#-has]                                       |

</details>
<details><summary>hasOne(values)</summary>

| Language       | Equivalent                                  |
|:---------------|:--------------------------------------------|
| **Javascript** | `array.some(it => values.includes(it,),)`   |
| **Java**       | `list.stream().anyMatch(values::contains)`  |
| **Kotlin**     | `array.any { it in values }`                |
| **PHP**        |                                             |
| **C#**         | `enumerable.Any(it => values.Contains(it))` |

</details>
<details><summary>hasAll(values)</summary>

| Language       | Equivalent                                               |
|:---------------|:---------------------------------------------------------|
| **Javascript** | `array.every(it => values.includes(it,),)`               |
| **Java**       | <ul><li>[Collection.containsAll(values)][java-has-all]   |
| **Kotlin**     | <ul><li>[Collection.containsAll(values)][kotlin-has-all] |
| **PHP**        |                                                          |
| **C#**         | `enumerable.All(it => values.Contains(it))`              |

</details>
<br/>

<details><summary>requireNoNulls()</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
let index = -1
while (++index < size)
    if (array[index] == null)
        throw forbidden-exception
```
</td></tr>
<tr><th>Java</th><td>

```java
var index = -1;
while (++index < size)
    if (array[index] == null)
        throw forbidden-exception;
```
</td></tr>
<tr><th>Kotlin</th><td>

- [Array.requireNoNulls()<br/>Iterable.requireNoNulls()<br/>List.requireNoNulls()][kotlin-require-no-nulls]
</td></tr>
<tr><th>PHP</th><td>

```php
$index = -1;
while (++$index < $size)
    if ($array[$index] == null)
        throw forbidden-exception
```
</td></tr>
<tr><th>C#</th><td>

```csharp
var index = -1;
while (++index < size)
    if (array[index] == null)
        throw
```
</td></tr>
</table></details>

### Transformation methods

The methods are made to transform the structure by different type or size
 - `filter`(predicate)
 - `filterIndexed`(predicate)
 - `filterNot`(predicate)
 - `filterNotIndexed`(predicate)
 - `filterNotNull`()
 - `slice`(indices)
 - `slice`(fromIndex?, toIndex?)
 - `take`|`limit`(n)
 - `takeWhile`|`limitWhile`(predicate)
 - `takeWhileIndexed`|`limitWhileIndexed`(predicate)
 - `takeLast`|`limitLast`(n)
 - `takeLastWhile`|`limitLastWhile`(predicate)
 - `takeLastWhileIndexed`|`limitLastWhileIndexed`(predicate)
 - `drop`|`skip`(n)
 - `dropWhile`|`skipWhile`(predicate)
 - `dropWhileIndexed`|`skipWhileIndexed`(predicate)
 - `dropLast`|`skipLast`(n)
 - `dropLastWhile`|`skipLastWhile`(predicate)
 - `dropLastWhileIndexed`|`skipLastWhileIndexed`(predicate)
 - `map`(transform)
 - `mapIndexed`(transform)
 - `mapNotNull`(transform)
 - `mapNotNullIndexed`(transform)

<details><summary>filter(predicate)</summary>

| Language       | Equivalent                                                                      |
|:---------------|:--------------------------------------------------------------------------------|
| **Javascript** | <ul><li>[Array.filter(predicate)][js-filter]                                    |
| **Java**       | `collection.stream().filter(predicate).toList()`                                |
| **Kotlin**     | <ul><li>[Array.filter(predicate)<br/>Iterable.filter(predicate)][kotlin-filter] |
| **PHP**        | <ul><li>[array_filter($array, $predicate)][php-filter]                          |
| **C#**         | <ul><li>[IEnumerable.Where(predicate)][c#-filter]                               |

</details>
<details><summary>filterIndexed(predicate)</summary>

| Language       | Equivalent                                                                                            |
|:---------------|:------------------------------------------------------------------------------------------------------|
| **Javascript** | <ul><li>[Array.filter(predicate)][js-filter]                                                          |
| **Java**       | `collection.stream().filter(predicate).toList()`                                                      |
| **Kotlin**     | <ul><li>[Array.filterIndexed(predicate)<br/>Iterable.filterIndexed(predicate)][kotlin-filter-indexed] |
| **PHP**        | <ul><li>[array_filter($array, $predicate)][php-filter]                                                |
| **C#**         | <ul><li>[IEnumerable.Where(predicate)][c#-filter]                                                     |

</details>
<details><summary>filterNot(predicate)<br/>filterNotIndexed(predicate)</summary>

| Language       | Equivalent                                                                                |
|:---------------|:------------------------------------------------------------------------------------------|
| **Javascript** | `array.filter(!predicate)`                                                                |
| **Java**       | `collection.stream().filter(!predicate).toList()`                                         |
| **Kotlin**     | <ul><li>[Array.filterNot(predicate)<br/>Iterable.filterNot(predicate)][kotlin-filter-not] |
| **PHP**        | `array_filter($array, !$predicate)`                                                       |
| **C#**         | `enumerable.Where(!predicate)`                                                            |

</details>
<details><summary>filterNotNull()</summary>

| Language       | Equivalent                                                                           |
|:---------------|:-------------------------------------------------------------------------------------|
| **Javascript** | `array.filter(it => it != null,)`                                                    |
| **Java**       | `collection.stream().filter(it -> it != null).toList()`                              |
| **Kotlin**     | <ul><li>[Array.filterNotNull()<br/>Iterable.filterNotNull()][kotlin-filter-not-null] |
| **PHP**        | `array_filter($array, fn(it) => $array[$it] != null,)`                               |
| **C#**         | `enumerable.Where(it => it != null)`                                                 |

</details>
<br/>
<details><summary>slice(indices)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
const newArray = new Array(indiceSize,)
let index = indiceSize
while (index-- > 0)
    newArray[index] = array[indices[index]]
return newArray
```
</td></tr>
<tr><th>Java</th><td>

```java
final var newArray = (T[]) new Object[indiceSize];
var index = indiceSize;
while (index-- > 0)
    newArray[index] = array[indices[index]];
return newArray;
```
</td></tr>
<tr><th>Kotlin</th><td>

 - [Array.slice(indices)<br/>List.slice(indices)][kotlin-slice-indices]
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

```csharp
var newArray = new T[indiceSize];
var index = indiceSize;
while (index-- > 0)
    newArray[index] = array[indices[index]];
return newArray;
```
</td></tr>
</table>

[kotlin-slice-indices]: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html

</details>
<details><summary>slice()</summary>

| Language       | Equivalent                |
|:---------------|:--------------------------|
| **Javascript** | [Array.slice()][js-slice] |
| **Java**       | `array`                   |
| **Kotlin**     | `array`                   |
| **PHP**        |                           |
| **C#**         | `array`                   |

</details>
<details><summary>slice(fromIndex)</summary>

| Language       | Equivalent                                          |
|:---------------|:----------------------------------------------------|
| **Javascript** | [Array.slice(fromIndex)][js-slice]                  |
| **Java**       | `Arrays.copyOfRange(array, fromIndex, size - 1)`    |
| **Kotlin**     | `array[fromIndex..]`<br/>`array.slice(fromIndex..)` |
| **PHP**        |                                                     |
| **C#**         | `array[fromIndex..^0]`                              |

</details>
<details><summary>slice(fromIndex, toIndex)</summary>

| Language       | Equivalent                                                        |
|:---------------|:------------------------------------------------------------------|
| **Javascript** | [Array.slice(fromIndex, toIndex)][js-slice]                       |
| **Java**       | `Arrays.copyOfRange(array, fromIndex, toIndex)`                   |
| **Kotlin**     | `array[fromIndex..toIndex]`<br/>`array.slice(fromIndex..toIndex)` |
| **PHP**        |                                                                   |
| **C#**         | `array[fromIndex..toIndex]`                                       |

</details>
<br/>
<details><summary>take(n)</summary>

| Language       | Equivalent                                            |
|----------------|-------------------------------------------------------|
| **Javascript** | `array.slice(0, n)`                                   |
| **Java**       |                                                       |
| **Kotlin**     | <ul><li>[Array.take(n)<br/>List.take(n)][kotlin-take] |
| **PHP**        |                                                       |
| **C#**         |                                                       |

</details>
<details><summary>takeWhile(predicate)<br/>takeWhileIndexed(predicate)</summary>

| Language       | Equivalent                                                                            |
|----------------|---------------------------------------------------------------------------------------|
| **Javascript** | `array.filter(predicate)`                                                             |
| **Java**       |                                                                                       |
| **Kotlin**     | <ul><li>[Array.takeWhile(predicate)<br/>List.takeWhile(predicate)][kotlin-take-while] |
| **PHP**        |                                                                                       |
| **C#**         |                                                                                       |

</details>
<details><summary>takeLast(n)</summary>

| Language       | Equivalent                                                         |
|----------------|--------------------------------------------------------------------|
| **Javascript** | `array.slice(-n)`                                                  |
| **Java**       |                                                                    |
| **Kotlin**     | <ul><li>[Array.takeLast(n)<br/>List.takeLast(n)][kotlin-take-last] |
| **PHP**        |                                                                    |
| **C#**         |                                                                    |

</details>
<details><summary>takeLastWhile(predicate)<br/>takeLastWhileIndexed(predicate)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
let index = size
while (--index >= 0)
    if (!predicate) {
        const newArrayFromIndexToLast = new Array(size - index - 1,)
        let indexAdded = 0
        while (++index < size)
            newArrayFromIndexToLast[indexAdded++] = array[index]
        return newArrayFromIndexToLast
    }
return newArray
```
</td></tr>
<tr><th>Java</th><td></td></tr>
<tr><th>Kotlin</th><td>

- [Array.takeLastWhile(predicate)<br/>List.takeLastWhile(predicate)][kotlin-take-last-while]
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td></td></tr>
</table></details>
<br/>
<details><summary>drop(n)</summary>

| Language       | Equivalent                                    |
|----------------|-----------------------------------------------|
| **Javascript** | `array.slice(n)`                              |
| **Java**       |                                               |
| **Kotlin**     | [Array.drop(n)<br/>List.drop(n)][kotlin-drop] |
| **PHP**        |                                               |
| **C#**         |                                               |

</details>
<details><summary>dropWhile(predicate)<br/>dropWhileIndexed(predicate)</summary>

| Language       | Equivalent                                                                    |
|----------------|-------------------------------------------------------------------------------|
| **Javascript** | `array.filter(!predicate)`                                                    |
| **Java**       |                                                                               |
| **Kotlin**     | [Array.dropWhile(predicate)<br/>List.dropWhile(predicate)][kotlin-drop-while] |
| **PHP**        |                                                                               |
| **C#**         |                                                                               |

</details>
<details><summary>dropLast(n)</summary>

| Language       | Equivalent                                                 |
|----------------|------------------------------------------------------------|
| **Javascript** | `array.slice(0, -n)`                                       |
| **Java**       |                                                            |
| **Kotlin**     | [Array.dropLast(n)<br/>List.dropLast(n)][kotlin-drop-last] |
| **PHP**        |                                                            |
| **C#**         |                                                            |

</details>
<details><summary>dropLastWhile(predicate)<br/>dropLastWhileIndexed(predicate)</summary><table>
<tr><th>Language</th><th>Equivalent</th>
<tr><th>Javascript</th><td>

```javascript
let index = size
while (--index >= 0)
    if (!predicate) {
        const newArrayFrom0ToIndex = new Array(index + 1,)
        let index2 = -1
        while (++index2 <= index)
            newArrayFrom0ToIndex[index2] = array[index2]
        return newArrayFrom0ToIndex
    }
return []
```
</td></tr>
<tr><th>Java</th><td></td></tr>
<tr><th>Kotlin</th><td>

- [Array.dropLastWhile(predicate)<br/>List.dropLastWhile(predicate)][kotlin-drop-last-while]
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td></td></tr>

</table></details>
<br/>
<details><summary>map(transform)</summary>

| Language       | Equivalent                                                             |
|:---------------|:-----------------------------------------------------------------------|
| **Javascript** | <ul><li>[Array.map(transform)][js-map]                                 |
| **Java**       | `collection.stream().map(transform).toList()`                          |
| **Kotlin**     | <ul><li>[Array.map(transform)<br/>Iterable.map(transform)][kotlin-map] |
| **PHP**        | <ul><li>[array_map($transform, $array)][php-map]                       |
| **C#**         | <ul><li>[IEnumerable.Select(predicate)][c#-map]                        |

</details>
<details><summary>mapIndexed(transform)</summary>

| Language       | Equivalent                                                                     |
|:---------------|:-------------------------------------------------------------------------------|
| **Javascript** | <ul><li>[Array.map(transform)][js-map]                                         |
| **Java**       | `collection.stream().map(transform).toList()`                                  |
| **Kotlin**     | <ul><li>[Array.map(transform)<br/>Iterable.map(transform)][kotlin-map-indexed] |
| **PHP**        | <ul><li>[array_map($transform, $array)][php-map]                               |
| **C#**         | <ul><li>[IEnumerable.Select(predicate)][c#-map]                                |

</details>
<details><summary>mapNotNull(transform)</summary>

| Language       | Equivalent                                                                                    |
|:---------------|:----------------------------------------------------------------------------------------------|
| **Javascript** | `array.map(it => it != null,)`                                                                |
| **Java**       | `collection.stream().map(it -> it != null).toList()`                                          |
| **Kotlin**     | <ul><li>[Array.mapNotNull(transform)<br/>Iterable.mapNotNull(transform)][kotlin-map-not-null] |
| **PHP**        | `array_map(fn(it,) => it != null, $array)`                                                    |
| **C#**         | `enumerable.Select(it it != null)`                                                            |

</details>
<details><summary>mapNotNullIndexed(transform)</summary>

| Language       | Equivalent                                                                                                          |
|:---------------|:--------------------------------------------------------------------------------------------------------------------|
| **Javascript** | `array.map(it => it != null,)`                                                                                      |
| **Java**       | `collection.stream().map(it -> it != null).toList()`                                                                |
| **Kotlin**     | <ul><li>[Array.mapIndexedNotNull(transform)<br/>Iterable.mapIndexedNotNull(transform)][kotlin-map-not-null-indexed] |
| **PHP**        | `array_map(fn(it,) => it != null, $array)`                                                                          |
| **C#**         | `enumerable.Select(it it != null)`                                                                                  |

</details>

### Loop methods

The methods are basically an embedded loop
 - `forEach`(action)
 - `forEachIndexed`(action)
 - `onEach`(action)
 - `onEachIndexed`(action)

<details><summary>forEach(action)</summary>

| Language       | Equivalent                                                                                   |
|:---------------|:---------------------------------------------------------------------------------------------|
| **Javascript** | <ul><li>[Array.forEach(action)][js-array-for-each]<li>[Set.forEach(action)][js-set-for-each] |
| **Java**       | <ul><li>[Iterable.forEach(action)][java-for-each]                                            |
| **Kotlin**     | <ul><li>[Array.forEach(action)<br/>Iterable.forEach(action)][kotlin-for-each]                |
| **PHP**        | <ul><li>[array_walk(&$array, $action)][php-for-each]                                         |
| **C#**         | <ul><li>[List.forEach(action)][c#-for-each]                                                  |

</details>
<details><summary>forEachIndexed(action)</summary>

| Language       | Equivalent                                                                                          |
|:---------------|:----------------------------------------------------------------------------------------------------|
| **Javascript** | <ul><li>[Array.forEach(action)][js-array-for-each]<li>[Set.forEach(action)][js-set-for-each]        |
| **Java**       | <ul><li>[Iterable.forEach(action)][java-for-each]                                                   |
| **Kotlin**     | <ul><li>[Array.forEachIndexed(action)<br/>Iterable.forEachIndexed(action)][kotlin-for-each-indexed] |
| **PHP**        | <ul><li>[array_walk(&$array, $action)][php-for-each]                                                |
| **C#**         | <ul><li>[List.forEach(action)][c#-for-each]                                                         |

</details>
<br/>

<details><summary>onEach(action)</summary>

| Language       | Equivalent                                                                 |
|:---------------|:---------------------------------------------------------------------------|
| **Javascript** | <code>array.forEach(action,)<br/>return array                              |
| **Java**       | <code>array.forEach(action);<br/>return array;                             |
| **Kotlin**     | <ul><li>[Array.onEach(action)<br/>Iterable.onEach(action)][kotlin-on-each] |
| **PHP**        | <code>array_walk(&$array, $action,)<br/>return $array;                     |
| **C#**         | <code>list.forEach(action);<br/>return list;                               |

</details>
<details><summary>onEachIndexed(action)</summary>

| Language       | Equivalent                                                                                       |
|:---------------|:-------------------------------------------------------------------------------------------------|
| **Javascript** | <code>array.forEach(action,)<br/>return array                                                    |
| **Java**       | <code>array.forEach(action);<br/>return array;                                                   |
| **Kotlin**     | <ul><li>[Array.onEachIndexed(action)<br/>Iterable.onEachIndexed(action)][kotlin-on-each-indexed] |
| **PHP**        | <code>array_walk(&$array, $action,)<br/>return $array;                                           |
| **C#**         | <code>list.forEach(action);<br/>return list;                                                     |

</details>

### Reordering methods

The methods are there to reorder the values
 - `toReverse`|`toReversed`|`reversed`(fromIndex?, toIndex?)

<details><summary>toReverse()</summary>

| Language       | Equivalent                                                                                                                                                 |
|:---------------|:-----------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Javascript** | <ul><li>[Array.toReversed()][js-to-reverse]                                                                                                                |
| **Java**       | `Collections.reverse(list)`                                                                                                                                |
| **Kotlin**     | <ul><li>[Array.reversed()<br/>Iterable.reversed()][kotlin-to-reverse]                                                                                      |
| **PHP**        | <ul><li>[array_reverse($array)][php-to-reverse]                                                                                                            |
| **C#**         | <ul><li>[Reverse(array)][c#-array-to-reverse]<li>[IEnumerable.Reverse()][c#-enumerable-to-reverse]<li>[List.Reverse(fromIndex, limit)][c#-list-to-reverse] |


</details>
<details><summary>toReverse(fromIndex)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
const startingIndex = calculate-starting-index(fromIndex,)
const newArray = new Array(size - 1 - startingIndex,)
let indexAdded = -1
let index = size
while (--index >= startingIndex)
    newArray[++indexAdded] = collection.get(index,)
return newArray
```
</td></tr>
<tr><th>Java</th><td>

```java
final var startingIndex = calculate-starting-index(fromIndex);
final var newArray = (T[]) new Object[size - 1 - startingIndex];
var indexAdded = -1;
var index = size;
while (--index >= startingIndex)
    newArray[++indexAdded] = array[index];
return newArray;
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
val startingIndex = calculate-starting-index(fromIndex,)
val newArray = arrayOfNulls<T>(size - 1 - startingIndex,)
var indexAdded = -1
var index = size
while (--index >= startingIndex)
    newArray[++indexAdded] = array[index]
return newArray as T[]
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

```csharp
var startingIndex = calculate-starting-index(fromIndex);
var newArray = new T[size - 1 - startingIndex];
var indexAdded = -1;
var index = size;
while (--index >= startingIndex)
    newArray[++indexAdded] = array[index];
return newArray;
```
</td></tr>
</table></details>
<details><summary>toReverse(fromIndex, toIndex)</summary><table>
<tr><th>Language</th><th>Equivalent</th></tr>
<tr><th>Javascript</th><td>

```javascript
const startingIndex = calculate-starting-index(fromIndex,)
const endingIndex = calculate-ending-index(toIndex,)
const newArray = new Array(endingIndex - startingIndex,)
let indexAdded = -1
let index = endingIndex + 1
while (--index >= startingIndex)
    newArray[++indexAdded] = collection.get(index,)
return newArray
```
</td></tr>
<tr><th>Java</th><td>

```java
final var startingIndex = calculate-starting-index(fromIndex);
final var endingIndex = calculate-ending-index(toIndex);
final var newArray = (T[]) new Object[endingIndex - startingIndex];
var indexAdded = -1;
var index = endingIndex + 1;
while (--index >= startingIndex)
    newArray[++indexAdded] = array[index];
return newArray;
```
</td></tr>
<tr><th>Kotlin</th><td>

```kotlin
val startingIndex = calculate-starting-index(fromIndex,)
val endingIndex = calculate-ending-index(toIndex,)
val newArray = arrayOfNulls<T>(endingIndex - startingIndex,)
var indexAdded = -1
var index = endingIndex + 1
while (--index >= startingIndex)
    newArray[++indexAdded] = array[index]
return newArray as T[]
```
</td></tr>
<tr><th>PHP</th><td></td></tr>
<tr><th>C#</th><td>

```csharp
var startingIndex = calculate-starting-index(fromIndex);
var endingIndex = calculate-ending-index(toIndex);
var newArray = new T[endingIndex - startingIndex];
var indexAdded = -1;
var index = endingIndex + 1;
while (--index >= startingIndex)
    newArray[++indexAdded] = array[index];
return newArray;
```
</td></tr>
</table></details>

### Conversion methods

The methods are here to convert the structure to another kind depending on the language

<details><summary>To iterator/enumerator</summary>

This is for the structure that can use the language looping mechanism

| Language       | Equivalence                                                                                                                                                                                                                   |
|----------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Javascript** | <ul><li>[Array\[Symbol.iterator\]()][js-array-to-iterator]<li> [Set\[Symbol.iterator\]()][js-set-to-iterator]                                                                                                                 |
| **Java**       | <ul><li>[Iterable.iterator()][java-iterable-to-iterator]<br/><li>[Collection.iterator()][java-collection-to-iterator]<br/><li>[List.iterator()][java-list-to-iterator]<br/><li>[Set.iterator()][java-set-to-iterator]         |
| **Kotlin**     | <ul><li>[Iterable.iterator()][kotlin-iterable-to-iterator]<br/><li>[Collection.iterator()][kotlin-collection-to-iterator]<br/><li>[List.iterator()][kotlin-list-to-iterator]<br/><li>[Set.iterator()][kotlin-set-to-iterator] |
| **PHP**        |                                                                                                                                                                                                                               |
| **C#**         | <ul><li>[IEnumerable.GetEnumerator()][c#-iterable-to-iterator]                                                                                                                                                                |

</details>
<br/>

<details><summary>To (mutable) array</summary>

This is the most bare-bones structure
- Javascript [Array][js-array] (`toArray` / `toMutableArray`)
- Java `T[]` (`toArray`)
- Kotlin [Array][kotlin-array] (`toArray`)
- PHP [Array][php-array]
- C# [T[]][c#-mutable-array] (`toArray`)

| Language       | Equivalence<br/>toArray                                                                           | Equivalence<br/>toMutableArray                       |
|:---------------|:--------------------------------------------------------------------------------------------------|:-----------------------------------------------------|
| **Javascript** | `Object.freeze([...iterable,],)`                                                                  | `[...iterable,]`                                     |
| **Java**       | <ul><li>[Collection.toArray(T[] array)][java-to-array]                                            | _N/A_                                                |
| **Kotlin**     | <ul><li>[Collection.toTypedArray()][kotlin-to-array]                                              | _N/A_                                                |
| **PHP**        |                                                                                                   |                                                      |
| **C#**         | `new ReadOnlyCollection<T>(enumerable)`<br/><ul><li>[IEnumerable.ToImmutableArray()][c#-to-array] | <ul><li>[IEnumerable.ToArray()][c#-to-mutable-array] |

</details>
<br/>

<details><summary>To (mutable) collection</summary>

| Language           | Equivalent<br/>toCollection                                                      | Equivalent<br/>toMutableCollection                                   |
|:-------------------|:---------------------------------------------------------------------------------|----------------------------------------------------------------------|
| **~~Javascript~~** |                                                                                  |                                                                      |
| **Java**           | <ul><li>[Collections.unmodifiableCollection(collection)][java-to-collection]     | <ul><li>[Collections.addAll(collection)][java-to-mutable-collection] |
| **Kotlin**         | <ul><li>[Array.toCollection()<br/>Iterable.toCollection()][kotlin-to-collection] | `mutableArrayOf(*iterable)`<br/>`mutableSetOf(*iterable)`            |
| **PHP**            |                                                                                  |                                                                      |
| **C#**             | `new ReadOnlyCollection<T>(enumerable)`                                          | `enumerable.toList()`<br/>`enumerable.toHashSet()`                   |

</details>
<details><summary>To (mutable) list</summary>

| Language           | Equivalent<br/>toList                                                                      | Equivalent<br/>toMutableList                                                                                                                 |
|:-------------------|:-------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------|
| **~~Javascript~~** |                                                                                            |                                                                                                                                              |
| **Java**           | <ul><li>[Collections.unmodifiableList(list)][java-to-list]                                 | `new ArrayList<>(collection)`<br/>`new CopyOnWriteArrayList<>(collection)`<br/>`new LinkedList<>(collection)`<br/>`new Vector<>(collection)` |
| **Kotlin**         | <ul><li>[Array.toList()<br/>Iterable.toList()][kotlin-to-list]                             | <ul><li>[Array.toMutableList()<br/>Iterable.toMutableList()<br/>Collection.toMutableList()][kotlin-to-mutable-list]                          |
| **PHP**            |                                                                                            |                                                                                                                                              |
| **C#**             | `new ReadOnlyCollection<T>(enumerable)`<ul><li>[IEnumerable.toImmutableList()][c#-to-list] | <ul><li>[IEnumerable.ToList()][c#-to-mutable-list]                                                                                           |

[java-to-list]:           https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collections.html#unmodifiableList(java.util.List)
[kotlin-to-list]:         https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/to-list.html
[c#-to-list]:             https://learn.microsoft.com/en-us/dotnet/api/system.collections.immutable.immutablelist.toimmutablelist?#system-collections-immutable-immutablelist-toimmutablelist-1%28system-collections-generic-ienumerable%28%28-0%29%29%29
[kotlin-to-mutable-list]: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/to-mutable-list.html
[c#-to-mutable-list]:     https://learn.microsoft.com/dotnet/api/system.linq.enumerable.tolist

</details>
<details><summary>To (mutable) set</summary>

| Language       | Equivalent<br/>toSet                                                              | Equivalent<br/>toMutableSet                                                                                                                                                                 |
|:---------------|:----------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Javascript** | `Object.freeze(new Set(iterable,),)`<br/>`Object.freeze(new WeakSet(iterable,),)` | `new Set(iterable,)`<br/>`new WeakSet(iterable,)`                                                                                                                                           |
| **Java**       | <ul><li>[Collections.unmodifiableSet(set)][java-to-set]                           | `new ConcurrentSkipListSet<>(collection)`<br/>`new CopyOnWriteArraySet<>(collection)`<br/>`new HashSet<>(collection)`<br/>`new LinkedHashSet<>(collection)`<br/>`new TreeSet<>(collection)` |
| **Kotlin**     | <ul><li>[Array.toSet()<br/>Iterable.toSet()][kotlin-to-set]                       | <ul><li>[Array.toMutableSet()<br/>Iterable.toMutableSet()][kotlin-to-mutable-set]                                                                                                           |
| **PHP**        |                                                                                   |                                                                                                                                                                                             |
| **C#**         | `new ReadOnlyCollection<T>(enumerable)`                                           | <ul><li>[IEnumerable.toHashSet()][c#-to-mutable-set]                                                                                                                                        |

</details>
<br/>

<details><summary>To (mutable) map/dictionary</summary>

| Language       | Equivalent<br/>toMap                                                           | Equivalent<br/>toMutableMap                                             |
|:---------------|:-------------------------------------------------------------------------------|-------------------------------------------------------------------------|
| **Javascript** | `Object.freeze(new Map(array.map((it, index,) => [it, index,],),),)`           | `new Map(array.map((it, index,) => [it, index,],),)`                    |
| **Java**       | `list.stream().collect(Collectors.toUnmodifiableMap(list::indexOf, it -> it))` | `list.stream().collect(Collectors.toMap(list::indexOf, it -> it))`      |
| **Kotlin**     | `iterable.mapIndexed { index, i -> index to i }.toMap()`                       | `iterable.mapIndexed { index, i -> index to i }.toMap().toMutableMap()` |
| **PHP**        |                                                                                |                                                                         |
| **C#**         | `new ReadOnlyCollection<T>(enumerable)`                                        | <ul><li>[IEnumerable.ToDictionary()][c#-to-mutable-map]                 |

</details>
<br/>

<details><summary>joinToString()</summary>

| Language       | Equivalent                                                                                   |
|:---------------|:---------------------------------------------------------------------------------------------|
| **Javascript** | <code>\`\[${array.join(", ",)}]`                                                             |
| **Java**       | `array.join(", ")`                                                                           |
| **Kotlin**     | [Array.joinToString()<br/>Iterable.joinToString()][kotlin-join-to-string]                    |
| **PHP**        |                                                                                              |
| **C#**         | `'[' + string.Join(", ", array, 0, size - 1) + ']'`<br/>`'[' + Join(", ", enumerable) + ']'` |

</details>
<details><summary>joinToString(separator)</summary>

| Language       | Equivalent                                                                                                                                    |
|:---------------|:----------------------------------------------------------------------------------------------------------------------------------------------|
| **Javascript** | <code>\`\[${[array.join(separator)][js-join-to-string]}]`                                                                                     |
| **Java**       | [String.join(separator, iterable)][java-join-to-string]                                                                                       |
| **Kotlin**     | [Array.joinToString(separator)<br/>Iterable.joinToString(separator)][kotlin-join-to-string]                                                   |
| **PHP**        |                                                                                                                                               |
| **C#**         | <code>'\[' + string.Join(separator, array, 0, size - 1) + ']'</code><br/><code>'\[' + [Join(separator, enumerable)][c#-join-to-string] + ']'` |

</details>
<details><summary>joinToString(separator, prefix)</summary>

| Language       | Equivalent                                                                                                                                        |
|:---------------|:--------------------------------------------------------------------------------------------------------------------------------------------------|
| **Javascript** | <code>\`\${prefix}${[array.join(separator)][js-join-to-string]}]`                                                                                 |
| **Java**       |                                                                                                                                                   |
| **Kotlin**     | [Array.joinToString(separator, prefix)<br/>Iterable.joinToString(separator, prefix)][kotlin-join-to-string]                                       |
| **PHP**        |                                                                                                                                                   |
| **C#**         | <code>prefix + string.Join(separator, array, 0, size - 1) + ']'</code><br/><code>prefix + [Join(separator, enumerable)][c#-join-to-string] + ']'` |

</details>
<details><summary>joinToString(separator, prefix, postfix)</summary>

| Language       | Equivalent                                                                                                                                                |
|:---------------|:----------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Javascript** | <code>\`\${prefix}\${[array.join(separator)][js-join-to-string]}${postfix}`                                                                               |
| **Java**       |                                                                                                                                                           |
| **Kotlin**     | [Array.joinToString(separator, prefix, postfix)<br/>Iterable.joinToString(separator, prefix, postfix)][kotlin-join-to-string]                             |
| **PHP**        |                                                                                                                                                           |
| **C#**         | <code>prefix + string.Join(separator, array, 0, size - 1) + postfix</code><br/><code>prefix + [Join(separator, enumerable)][c#-join-to-string] + postfix` |

</details>
<details><summary>joinToString(separator, prefix, postfix, limit, truncated)</summary>

| Language       | Equivalent                                                                                                                                                        |
|:---------------|:------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Javascript** |                                                                                                                                                                   |
| **Java**       |                                                                                                                                                                   |
| **Kotlin**     | [Array.joinToString(separator, prefix, postfix, limit, truncated)<br/>Iterable.joinToString(separator, prefix, postfix, limit, truncated)][kotlin-join-to-string] |
| **PHP**        |                                                                                                                                                                   |
| **C#**         |                                                                                                                                                                   |

</details>
<details><summary>joinToString(separator, prefix, postfix, limit, truncated, transform)</summary>

| Language       | Equivalent                                                                                                                                                                              |
|:---------------|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Javascript** |                                                                                                                                                                                         |
| **Java**       |                                                                                                                                                                                         |
| **Kotlin**     | [Array.joinToString(separator, prefix, postfix, limit, truncated, transform)<br/>Iterable.joinToString(separator, prefix, postfix, limit, truncated, transform)][kotlin-join-to-string] |
| **PHP**        |                                                                                                                                                                                         |
| **C#**         |                                                                                                                                                                                         |

</details>


<!-- JavaScript references -->
[js-symbol-iterator]:            https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/iterator
[js-iterator]:                   https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator
[js-array]:                      https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array
[js-set]:                        https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set
[js-weak-set]:                   https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakSet

[js-array-size]:                 https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/length
[js-set-size]:                   https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/size

[js-get]:                        https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/at

[js-find]:                       https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find
[js-find-last]:                  https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast

[js-index-of-element]:           https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf
[js-index-of-element-from]:      https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf
[js-last-index-of-element]:      https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf
[js-last-index-of-element-from]: https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf
[js-index-of-first-element]:     https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex
[js-index-of-first-element]:     https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex

[js-all]:                        https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/every
[js-any-predicate]:              https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/some
[js-array-has]:                  https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/includes
[js-set-has]:                    https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/has

[js-filter]:                     https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/filter
[js-slice]:                      https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/slice
[js-map]:                        https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/map
[js-array-for-each]:             https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach
[js-set-for-each]:               https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach
[js-to-reverse]:                 https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed
[js-array-to-iterator]:          https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/@@iterator
[js-set-to-iterator]:            https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/@@iterator
[js-join-to-string]:             https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/join

<!-- JavaScript references -->
<!-- Java references -->
[java-iterable]:               https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/Iterable.html
[java-iterator]:               https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Iterator.html
[java-collection]:             https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html
[java-list]:                   https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html
[java-set]:                    https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Set.html

[java-size]:                   https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#size()
[java-is-empty]:               https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#isEmpty()
[java-get]:                    https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html#get(int)

[java-index-of-element]:       https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object)
[java-last-index-of-element]:  https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object)

[java-has]:                    https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html#contains(java.lang.Object)
[java-has-all]:                https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html#containsAll(java.util.Collection)
[java-for-each]:               https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer)

[java-iterable-to-iterator]:   https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/Iterable.html#iterator()
[java-collection-to-iterator]: https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#iterator()
[java-list-to-iterator]:       https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html#iterator()
[java-set-to-iterator]:        https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Set.html#iterator()
[java-to-array]:               https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#toArray(T%5B%5D)
[java-to-collection]:          https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collections.html#unmodifiableCollection(java.util.Collection)
[java-to-mutable-collection]:  https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collections.html#addAll(java.util.Collection,T...)
[java-to-set]:                 https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collections.html#unmodifiableSet(java.util.Set)
[java-join-to-string]:         https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/String.html#join(java.lang.CharSequence,java.lang.Iterable)

<!-- Java references -->
<!-- Kotlin references -->
[kotlin-iterable]:                https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable
[kotlin-mutable-iterable]:        https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterable
[kotlin-iterator]:                https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator
[kotlin-mutable-iterator]:        https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterator
[kotlin-array]:                   https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-array/
[kotlin-collection]:              https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection
[kotlin-mutable-collection]:      https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection
[kotlin-list]:                    https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list
[kotlin-mutable-list]:            https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list
[kotlin-set]:                     https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set
[kotlin-mutable-set]:             https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set

[kotlin-size]:                    https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/size.html
[kotlin-array-is-empty]:          https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html
[kotlin-collection-is-empty]:     https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html
[kotlin-is-not-empty]:            https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html

[kotlin-array-get]:               https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at.html
[kotlin-list-get]:                https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html
[kotlin-get-or-else-1]:           https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html
[kotlin-get-or-else-2]:           https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html
[kotlin-get-or-null-1]:           https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html
[kotlin-get-or-null-2]:           https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html

[kotlin-first]:                   https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html
[kotlin-first-predicate]:         https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html
[kotlin-first-or-null]:           https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html
[kotlin-first-or-null-predicate]: https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html

[kotlin-last]:                    https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html
[kotlin-last-predicate]:          https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html
[kotlin-last-or-null]:            https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last-or-null.html
[kotlin-last-or-null-predicate]:  https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last-or-null.html

[kotlin-find]:                    https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html
[kotlin-find-last]:               https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html

[kotlin-index-of-element]:        https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html
[kotlin-last-index-of-element]:   https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html
[kotlin-index-of-first-element]:  https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html
[kotlin-index-of-first-element]:  https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html

[kotlin-all]:                     https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/all.html
[kotlin-any]:                     https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html
[kotlin-any-predicate]:           https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html
[kotlin-none]:                    https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html
[kotlin-none-predicate]:          https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html
[kotlin-has]:                     https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html
[kotlin-has-all]:                 https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html
[kotlin-require-no-nulls]:        https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html

[kotlin-filter]:                  https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter.html
[kotlin-filter-indexed]:          https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-indexed.html
[kotlin-filter-not]:              https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not.html
[kotlin-filter-not-null]:         https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not-null.html
[kotlin-slice]:                   https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html
[kotlin-take]:                    https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take.html
[kotlin-take-while]:              https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html
[kotlin-take-last]:               https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last.html
[kotlin-take-last-while]:         https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html
[kotlin-drop]:                    https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop.html
[kotlin-drop-while]:              https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html
[kotlin-drop-last]:               https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last.html
[kotlin-drop-last-while]:         https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html
[kotlin-map]:                     https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html
[kotlin-map-indexed]:             https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map-indexed.html
[kotlin-map-not-null]:            https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map-not-null.html
[kotlin-map-not-null-indexed]:    https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map-indexed-not-null.html

[kotlin-for-each]:                https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html
[kotlin-for-each-indexed]:        https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each-indexed.html
[kotlin-on-each]:                 https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html
[kotlin-on-each-indexed]:         https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each-indexed.html
[kotlin-to-reverse]:              https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reversed.html

[kotlin-iterable-to-iterator]:    https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/iterator.html
[kotlin-collection-to-iterator]:  https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/iterator.html
[kotlin-list-to-iterator]:        https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/iterator.html
[kotlin-set-to-iterator]:         https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/iterator.html
[kotlin-to-array]:                https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/to-typed-array.html
[kotlin-to-collection]:           https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/to-collection.html
[kotlin-to-set]:                  https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/to-set.html
[kotlin-to-mutable-set]:          https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/to-mutable-set.html
[kotlin-join-to-string]:          https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/join-to-string.html

<!-- Kotlin references -->
<!-- PHP references -->
[php-iterable]:    https://www.php.net/manual/class.iteratoraggregate.php
[php-iterator]:    https://www.php.net/manual/class.iterator.php
[php-array]:       https://www.php.net/manual/language.types.array.php
[php-collection]:  https://www.php.net/manual/class.ds-collection.php
[php-set]:         https://www.php.net/manual/class.ds-set.php

[php-filter]:      https://www.php.net/manual/function.array-filter.php
[php-map]:         https://www.php.net/manual/function.array-map.php
[php-for-each]:    https://www.php.net/manual/function.array-walk.php
[php-to-reverse]:  https://www.php.net/manual/function.array-reverse.php

<!-- PHP references -->
<!-- C# references -->
[c#-iterable-1]:                        https://learn.microsoft.com/dotnet/api/system.collections.ienumerable
[c#-iterable-2]:                        https://learn.microsoft.com/dotnet/api/system.collections.generic.ienumerable-1
[c#-iterable-3]:                        https://learn.microsoft.com/dotnet/api/system.linq.enumerable
[c#-iterator-1]:                        https://learn.microsoft.com/dotnet/api/system.collections.ienumerator
[c#-iterator-2]:                        https://learn.microsoft.com/dotnet/api/system.collections.generic.ienumerator-1
[c#-array]:                             https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1
[c#-mutable-array]:                     https://learn.microsoft.com/dotnet/api/system.array
[c#-collection]:                        https://learn.microsoft.com/dotnet/api/system.collections.generic.ireadonlycollection-1
[c#-mutable-collection]:                https://learn.microsoft.com/dotnet/api/system.collections.icollection
[c#-list-1]:                            https://learn.microsoft.com/dotnet/api/system.collections.generic.ireadonlylist-1
[c#-list-2]:                            https://learn.microsoft.com/dotnet/api/system.collections.immutable.iimmutablelist-1
[c#-mutable-list]:                      https://learn.microsoft.com/dotnet/api/system.collections.generic.ilist-1
[c#-set-1]:                             https://learn.microsoft.com/dotnet/api/system.collections.generic.ireadonlyset-1
[c#-set-2]:                             https://learn.microsoft.com/dotnet/api/system.collections.immutable.iimmutableset-1
[c#-mutable-set]:                       https://learn.microsoft.com/dotnet/api/system.collections.generic.iset-1

[c#-i-enumerable-size]:                 https://learn.microsoft.com/dotnet/api/system.linq.enumerable.count#system-linq-enumerable-count-1(system-collections-generic-ienumerable%28%28-0)%29%29
[c#-i-collection-size]:                 https://learn.microsoft.com/dotnet/api/system.collections.icollection.count
[c#-is-empty]:                          https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any#system-linq-enumerable-any-1\(system-collections-generic-ienumerable(%28-0)%29%29

[c#-i-enumerable-get]:                  https://learn.microsoft.com/dotnet/api/system.linq.enumerable.elementat
[c#-i-list-get]:                        https://learn.microsoft.com/dotnet/api/system.collections.ilist.item
[c#-get-or-default]:                    https://learn.microsoft.com/dotnet/api/system.linq.enumerable.elementatordefault

[c#-first]:                             https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first#system-linq-enumerable-first-1(system-collections-generic-ienumerable%28%28-0)%29%29
[c#-first-predicate]:                   https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first#system-linq-enumerable-first-1(system-collections-generic-ienumerable%28%28-0%29%29-system-func%28%28-0-system-boolean)%29%29
[c#-first-or-default]:                  https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault#system-linq-enumerable-firstordefault-1(system-collections-generic-ienumerable%28%28-0%29%29)
[c#-first-or-default-predicate]:        https://learn.microsoft.com/en-ca/dotnet/api/system.linq.enumerable.firstordefault?view=net-8.0#system-linq-enumerable-firstordefault-1(system-collections-generic-ienumerable%28%28-0%29%29-system-func%28%28-0-system-boolean%29%29)

[c#-last]:                              https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last#system-linq-enumerable-last-1(system-collections-generic-ienumerable%28%28-0)%29%29
[c#-last-predicate]:                    https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last#system-linq-enumerable-last-1(system-collections-generic-ienumerable%28%28-0)%29-system-func%28%28-0-system-boolean%29%29%29
[c#-last-or-default]:                   https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault#system-linq-enumerable-lastordefault-1(system-collections-generic-ienumerable%28%28-0)%29%29
[c#-last-or-default-predicate]:         https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault#system-linq-enumerable-lastordefault-1(system-collections-generic-ienumerable%28%28-0)%29-system-func%28%28-0-system-boolean%29%29%29

[c#-array-find]:                        https://learn.microsoft.com/dotnet/api/system.array.find
[c#-list-find]:                         https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.find

[c#-array-index-of-element]:            https://learn.microsoft.com/dotnet/api/system.array.indexof#system-array-indexof-1(-0%28%29-0%29
[c#-i-list-index-of-element]:           https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.system-collections-ilist-indexof
[c#-list-index-of-element]:             https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof#system-collections-generic-list-1-indexof(-0)
[c#-array-index-of-element-from]:       https://learn.microsoft.com/dotnet/api/system.array.indexof#system-array-indexof-1(-0%28)-0-system-int32%29
[c#-list-index-of-element-from]:        https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof#system-collections-generic-list-1-indexof(-0-system-int32)
[c#-array-last-index-of-element]:       https://learn.microsoft.com/dotnet/api/system.array.lastindexof#system-array-lastindexof-1(-0%28)-0%29
[c#-list-last-index-of-element]:        https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof#system-collections-generic-list-1-lastindexof(-0)
[c#-array-last-index-of-element-from]:  https://learn.microsoft.com/dotnet/api/system.array.lastindexof#system-array-lastindexof-1(-0%28)-0-system-int32%29
[c#-list-last-index-of-element-from]:   https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof#system-collections-generic-list-1-lastindexof(-0-system-int32)
[c#-array-index-of-first-element]:      https://learn.microsoft.com/dotnet/api/system.array.findindex#system-array-findindex-1(-0%28)-system-predicate%28%28-0%29%29%29
[c#-list-index-of-first-element]:       https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.findindex#system-collections-generic-list-1-findindex(system-predicate%28%28-0)%29%29
[c#-array-index-of-first-element-from]: https://learn.microsoft.com/dotnet/api/system.array.findindex#system-array-findindex-1(-0%28)-system-int32-system-predicate%28%28-0%29%29%29
[c#-list-index-of-first-element-from]:  https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.findindex#system-collections-generic-list-1-findindex(system-int32-system-predicate%28%28-0%29%29%29
[c#-array-index-of-first-element]:      https://learn.microsoft.com/en-ca/dotnet/api/system.array.findlastindex?view=net-8.0#system-array-findlastindex-1(-0%28)-system-predicate(%28-0%29%29)
[c#-list-index-of-first-element]:       https://learn.microsoft.com/en-ca/dotnet/api/system.collections.generic.list-1.findlastindex?view=net-8.0#system-collections-generic-list-1-findlastindex(system-predicate%28%28-0%29%29)
[c#-array-index-of-first-element-from]: https://learn.microsoft.com/en-ca/dotnet/api/system.array.findindex?view=net-8.0#system-array-findindex-1(-0%28)-system-int32-system-predicate%28%28-0%29%29%29
[c#-list-index-of-first-element-from]:  https://learn.microsoft.com/en-ca/dotnet/api/system.collections.generic.list-1.findlastindex?view=net-8.0#system-collections-generic-list-1-findlastindex(system-int32-system-predicate%28%28-0%29%29)

[c#-all]:                               https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all
[c#-any]:                               https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any#system-linq-enumerable-any-1(system-collections-generic-ienumerable%28%28-0)%29%29
[c#-any-predicate]:                     https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any#system-linq-enumerable-any-1(system-collections-generic-ienumerable%28%28-0)%29-system-func%28%28-0-system-boolean%29%29%29
[c#-has]:                               https://learn.microsoft.com/d/dotnet/api/system.collections.ilist.contains#system-collections-ilist-contains(system-object)
[c#-filter]:                            https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where
[c#-map]:                               https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select
[c#-for-each]:                          https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.foreach
[c#-array-to-reverse]:                  https://learn.microsoft.com/en-ca/dotnet/api/system.array.reverse?view=net-8.0#system-array-reverse(system-array)
[c#-enumerable-to-reverse]:             https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse
[c#-list-to-reverse]:                   https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.reverse#system-collections-generic-list-1-reverse

[c#-iterable-to-iterator]:              https://learn.microsoft.com/dotnet/api/system.collections.ienumerable.getenumerator
[c#-to-array]:                          https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray.toimmutablearray#system-collections-immutable-immutablearray-toimmutablearray-1%28system-collections-generic-ienumerable%28%28-0%29%29%29
[c#-to-mutable-array]:                  https://learn.microsoft.com/dotnet/api/system.linq.enumerable.toarray
[c#-to-mutable-set]:                    https://learn.microsoft.com/dotnet/api/system.linq.enumerable.tohashset#system-linq-enumerable-tohashset-1(system-collections-generic-ienumerable%28%28-0%29%29)
[c#-to-mutable-map]:                    https://learn.microsoft.com/dotnet/api/system.linq.enumerable.todictionary#system-linq-enumerable-todictionary-3(system-collections-generic-ienumerable%28%28-0%29%29-system-func%28%28-0-1%29%29-system-func%28%28-0-2%29%29)
[c#-join-to-string]:                    https://learn.microsoft.com/dotnet/api/system.string.join

<!-- C# references -->

## Version history

| JS/TS              | Date                 | Quick note                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
|--------------------|----------------------|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [1.11.0][js-v1.11] | November 7th, 2024   | New methods `firstIndexOfOrNull`, `lastIndexOfOrNull`, `indexOfFirstOrNull`, `indexOfLastOrNull`, `isTypedArray` (_plus the specific type_),<br/>Separation of `first`, `last` into `findFirst`, `findLast`,<br/>Addition of aliases `limit`, `skip`<br/>Re-addition of the methods (_now as alias_) `findIndex`, `findLastIndex`,<br/>New methods for the aliased methods in `CollectionHolder`<br/>[lazy][lazy] (~~1.5.0~~ → [1.6.0][js-lazy-v1.6]), [type][type] (~~1.0.0~~ → 1.1.0)                                             |
| [1.10.0][js-v1.10] | October 8th, 2024    | New methods `take`, `takeWhile`, `takeLast`, `takeLastWhile`, `drop`, `dropWhile`, `dropLast` and `dropLastWhile`,<br/>New aliases `some` and `every`,<br/>Deprecation of the argument `limit` where there is a `fromIndex` and `toIndex`,<br/>Addition of `Array` to be handled in the `methods`                                                                                                                                                                                                                                   |
| 1.9.3              | August 15th, 2024    | Fix on the missing export for `filterNotIndexed`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| 1.9.2              | July 23rd, 2024      | Fix on an array of 2 on `MinimalistCollectionHolder`,<br/>Fix on the `CollectionIterator` to handle properly when it has 2 values                                                                                                                                                                                                                                                                                                                                                                                                   |
| 1.9.1              | July 21st, 2024      | Spread of the deprecation across the inheritor of `CollectionHolder`                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [1.9.0][js-v1.9]   | July 21st, 2024      | Addition of `hasDuplicate`, `joinToString` for the `CollectionHolder`,<br/>Change on the `CollectionIterator` to use `NullableNumber` instead of `number` for the indexes,<br/>Addition of implementation for the `ValueHolder`,<br/>Deprecation of variadic parameters for `has`, `hasAll` & `hasOne`,<br/>The abstract implementations no longer have fields held,<br/>[lazy][lazy] (~~1.4.0~~ → [1.5.0][js-lazy-v1.5])                                                                                                           |
| [1.8.0][js-v1.8]   | March 31st, 2024     | Addition of [type][type] to the dependency                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| 1.7.1              | February 19th, 2024  | Change from `==` to `===` on the `GenericCollectionIterator`                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| [1.7.0][js-v1.7]   | February 19th, 2024  | New implementation of [MinimalistCollectionHolder](https://github.com/joooKiwi/collection/blob/main/javascript/src/MinimalistCollectionHolder.ts),<br/>New method `has`,<br/>New aliases `contains`, `includes`, `reversed`, `toReversed`,<br/>New names to the `CollectionHandler`s,<br/>[lazy][lazy] (~~1.2.1~~ → [1.3.0][js-lazy-v1.3])                                                                                                                                                                                          |
| 1.6.1              | December 23rd, 2023  | Addition of the missing amd (asynchronous module definition) package                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [1.6.0][js-v1.6]   | December 4th, 2023   | New implementation based on the amount of arguments received in a callback,<br/>New method variant of `toString`,<br/>Deprecation (for removal) of the `newInstance`                                                                                                                                                                                                                                                                                                                                                                |
| [1.5.0][js-v1.5]   | September 28th, 2023 | The `RangeError` and `ReferenceError` has been changed to custom exceptions,<br/>[lazy][lazy] (~~1.1.0~~ → [1.2.0][js-lazy-v1.2])                                                                                                                                                                                                                                                                                                                                                                                                   |
| [1.4.0][js-v1.4]   | September 8th, 2023  | Addition of a `limit` on every methods where it has `fromIndex` and `toIndex`,<br/>Change on the `toIndex` to be inclusive instead of exclusive,<br/>New methods `mapNotNull`, `mapNotNullIndexed` and `slice`,<br/>New aliases `elementAt`, `elementAtOrNull` and `elementAtOrElse`                                                                                                                                                                                                                                                |
| [1.3.0][js-v1.3]   | August 14th, 2023    | Small changes on some utility methods,<br/>Addition of `nextValue` and `previousValue` to the `CollectionIterator`                                                                                                                                                                                                                                                                                                                                                                                                                  |
| [1.2.0][js-v1.2]   | July 27th, 2023      | Fix on a "for‥of" not working properly                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [1.1.0][js-v1.1]   | July 23rd, 2023      | Addition of a new [CollectionIterator](https://github.com/joooKiwi/collection/blob/main/javascript/src/iterator/CollectionIterator.ts)                                                                                                                                                                                                                                                                                                                                                                                              |
| 1.0.4              | July 2nd, 2023       | There were recursive import for the [EmptyCollectionHolder](https://github.com/joooKiwi/collection/blob/main/javascript/src/EmptyCollectionHolder.ts) from the [CollectionConstants](https://github.com/joooKiwi/collection/blob/main/javascript/src/CollectionConstants.ts)                                                                                                                                                                                                                                                        |
| 1.0.3              | July 1st, 2023       | For some reason, the file [CollectionHolder](https://github.com/joooKiwi/collection/blob/main/javascript/src/CollectionHolder.ts) had a Symbol not declared                                                                                                                                                                                                                                                                                                                                                                         |
| 1.0.2              | July 1st, 2023       | Small fix on the [package.json](https://github.com/joooKiwi/collection/blob/main/javascript/package.json)                                                                                                                                                                                                                                                                                                                                                                                                                           |
| 1.0.1              | July 1st, 2023       | An update based on the new [lazy version][lazy]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| [1.0.0][js-v1]     | July 1st, 2023       | The first version,<br/>It was originally on the [enumeration](https://github.com/joooKiwi/enumeration) project                                                                                                                                                                                                                                                                                                                                                                                                                      |

<!-- Version references -->

[js-v1]:    https://github.com/joooKiwi/collection/releases/tag/v1.0.0-JS%26TS
[js-v1.1]:  https://github.com/joooKiwi/collection/releases/tag/v1.1.0-js
[js-v1.2]:  https://github.com/joooKiwi/collection/releases/tag/v1.2.0-js
[js-v1.3]:  https://github.com/joooKiwi/collection/releases/tag/v1.3.0-js
[js-v1.4]:  https://github.com/joooKiwi/collection/releases/tag/v1.4.0-js
[js-v1.5]:  https://github.com/joooKiwi/collection/releases/tag/v1.5.0-js
[js-v1.6]:  https://github.com/joooKiwi/collection/releases/tag/v1.6.0-js
[js-v1.7]:  https://github.com/joooKiwi/collection/releases/tag/v1.7.0-js
[js-v1.8]:  https://github.com/joooKiwi/collection/releases/tag/v1.8.0-js
[js-v1.9]:  https://github.com/joooKiwi/collection/releases/tag/v1.9.0-js
[js-v1.10]: https://github.com/joooKiwi/collection/releases/tag/v1.10.0-js
[js-v1.11]: https://github.com/joooKiwi/collection/releases/tag/v1.11.0-js

[lazy]: https://github.com/joookiwi/lazy
[js-lazy-v1.2]: https://github.com/joooKiwi/lazy/releases/tag/v1.2.0-js
[js-lazy-v1.3]: https://github.com/joooKiwi/lazy/releases/tag/v1.3.0-js
[js-lazy-v1.5]: https://github.com/joooKiwi/lazy/releases/tag/v1.5.0-js
[js-lazy-v1.6]: https://github.com/joooKiwi/lazy/releases/tag/v1.6.0-js

[type]: https://github.com/joooKiwi/type

<!-- Version references -->
