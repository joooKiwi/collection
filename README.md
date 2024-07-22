# Collection

This project has the sole purpose to have methods in a collection (list, array, set enumerable) with similar methods (or extension method).

It retrieves notions from `Javascript`, `Java`, `Kotlin`, `PHP` and `C#`.

Also, all the features are based on immutability.

_(Maybe other languages will be integrated, only the future will tell it)_

## Publication location
This project has only the Javascript / Typescript version uploaded.

But other languages will have different features based on how they can handle it.

| Language                  |                                                                                                    Published                                                                                                     |
|:--------------------------|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| Javascript<br/>Typescript | [Published to npm](https://www.npmjs.com/package/@joookiwi/collection)<br/>[![downloads](https://img.shields.io/npm/dt/@joookiwi/collection.svg)](https://npm-stat.com/charts.html?package=@joookiwi/collection) |
| Java                      |                                                                                                      Maven                                                                                                       |
| Kotlin                    |                                                                                                      Maven                                                                                                       |
| PHP                       |                                                                                                     Composer                                                                                                     |
| C#                        |                                                                                                      Nuget                                                                                                       |

## Related projects

Here is a list of the related projects made by me
- type ([GitHub](https://github.com/joooKiwi/type) | [NPM](https://www.npmjs.com/package/@joookiwi/type))
- lazy ([GitHub](https://github.com/joooKiwi/lazy) | [NPM](https://www.npmjs.com/package/@joookiwi/lazy))
- enumeration ([GitHub](https://github.com/joooKiwi/enumeration) | [NPM](https://www.npmjs.com/package/@joookiwi/enumerable))

## Contribution

You can contribute to my projects in 2 different ways
- [GitHub sponsor](https://github.com/sponsors/joooKiwi) or
- [!["Buy me a Coffee"](https://img.buymeacoffee.com/button-api/?&button_colour=40DCA5&font_colour=ffffff&font_family=Cookie&outline_colour=000000&coffee_colour=FFDD00)](https://www.buymeacoffee.com/joookiwi)

## Functionality equivalent from language to language

Every method used in the project has a reference in one or another language.
They are used differently across different languages.
But they should result to the same thing in the end.

And keep in mind that methods may not really be exactly the definition or optimized for performance.

Here is a quick reference of the variables with their associated type:

| variable in a template | Javascript                                                                                                                                                                            | Java                                                                                                 | Kotlin                                                                                                                                                                                               | PHP                                                                         | C#                                                                                                                                                                                                    |
|------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| iterable               | Object with a [[Symbol.iterator]](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Symbol/iterator)                                                   | [Iterable](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/Iterable.html)     | [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable) / [MutableIterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterable)         | [IteratorAggregate](https://www.php.net/manual/class.iteratoraggregate.php) | [IEnumerable](https://learn.microsoft.com/dotnet/api/system.collections.ienumerable) / [Enumerable](https://learn.microsoft.com/dotnet/api/system.linq.enumerable)                                    |
| array                  | [Array](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array)                                                                                             | Array                                                                                                | Array                                                                                                                                                                                                | [Array](https://www.php.net/manual/language.types.array.php)                | [ImmutableArray](https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1) / [Array](https://learn.microsoft.com/dotnet/api/system.array)                                 |
| collection             | _N/A_                                                                                                                                                                                 | [Collection](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/Collection.html) | [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection) / [MutableCollection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection) | [Collection](https://www.php.net/manual/class.ds-collection.php)            | [IReadOnlyCollection](https://learn.microsoft.com/dotnet/api/system.collections.generic.ireadonlycollection-1) / [ICollection](https://learn.microsoft.com/dotnet/api/system.collections.icollection) |
| list                   | _N/A_                                                                                                                                                                                 | [List](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/List.html)             | [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list) / [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list)                         | _N/A_                                                                       | [IImmutableList](https://learn.microsoft.com/dotnet/api/system.collections.immutable.iimmutablelist-1) / [IList](https://learn.microsoft.com/dotnet/api/system.collections.generic.ilist-1)           |
| set                    | [Set](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set) / [WeakSet](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakSet) | [Set](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/Set.html)               | [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set) / [MutableSet](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set)                             | [Set](https://www.php.net/manual/class.ds-set.php)                          | [IImmutableSet](https://learn.microsoft.com/dotnet/api/system.collections.immutable.iimmutableset-1) / [ISet](https://learn.microsoft.com/dotnet/api/system.collections.generic.iset-1)               |
 
_Quick note: For the `C#`, no external library other than the `.NET` is used (even though `MoreLINQ` is a fantastic library) ._

_Another note: Some parts may be incomplete due to some research that has to be made._

### Size methods
The getter methods associated to a size

| Method                                      | Javascript                                                                                                                                                                                                  | Java                                                                                                                                             | Kotlin                                                                                                                    | PHP              | C#                                                                                                                                                                                                                                                                                     |
|---------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `get size`<br/>`get length`<br/>`get count` | [Array.length](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/length)<br/>[Set.size](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/size) | `array.length`<br/>[Collection.size()](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/Collection.html#size())            | `array.size`<br/>[Collection.size](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/size.html) | `sizeof($array)` | <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.count#system-linq-enumerable-count-1(system-collections-generic-ienumerable((-0)))">Enumerable.Count()</a><br/>[ICollection.Count](https://learn.microsoft.com/dotnet/api/system.collections.icollection.count) |
| `get isEmpty`                               | `array.length === 0`<br/>`set.size === 0`                                                                                                                                                                   | `array.length == 0`<br/>[Collection.isEmpty()](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/Collection.html#isEmpty()) | [Collection.isEmpty()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/is-empty.html)         | `empty($array)`  | `collection.Any()`                                                                                                                                                                                                                                                                     |
| `get isNotEmpty`                            | `array.length !== 0`<br/>`set.size !== 0`                                                                                                                                                                   | `array.length == 0`<br/>`!collection.isEmpty()`                                                                                                  | `iterable.isNotEmpty`                                                                                                     | `!empty($array)` | `!collection.Any()`                                                                                                                                                                                                                                                                    |

### Has ... methods
The methods to validate one type of value

| Methods                                                     | Javascript              | Java                        | Kotlin | PHP                            | C#                                                                             |
|-------------------------------------------------------------|-------------------------|-----------------------------|--------|--------------------------------|--------------------------------------------------------------------------------|
| `get hasNull`<br/>`get includesNull`<br/>`get containsNull` | `array.includes(null)`  | `collection.contains(null)` | _N/A_  | `in_array(null, $array, true)` | `enumerable.Contains(null)`<br/>`list.Contains(null)`<br/>`set.Contains(null)` |

### Value methods
The methods associated to a value or index

<details><summary>get(index) / at(index) / elementAt(index)</summary>

**Javascript**
```javascript
if (index in array)
    return array[index]
throw
```

**Java**
 - [List.get(index)](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/List.html#get(int))

**Kotlin**
 - [Array.elementAt(index)<br/>Iterable.elementAt(index)<br/>List.elementAt(index)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/element-at.html)
 - [List.get(index)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/get.html)

**PHP**
```php
if (array_key_exists($index, $array))
    return $array[index];
throw
```

**C#**
 - [Enumerable.ElementAt(index)](https://learn.microsoft.com/dotnet/api/system.linq.enumerable.elementat)
 - [IList[index]](https://learn.microsoft.com/dotnet/api/system.collections.ilist.item)

</details>
<details><summary>getOrElse(index, defaultValue) / atOrElse(index, defaultValue) / elementAtOrElse(index, defaultValue)</summary>

**Javascript**
```javascript
if (index in array)
    return array[index]
return defaultValue()
```

**Java**
```java
if (index < list.size())
    return list.get(index);
return defaultValue();
```

**Kotlin**
 - [Array.elementAtOrElse(index, defaultValue)<br/>Iterable.elementAtOrElse(index, defaultValue)<br/>List.elementAtOrElse(index, defaultValue)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/element-at-or-else.html)
 - [Array.getOrElse(index, defaultValue)<br/>List.getOrElse(index, defaultValue)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/get-or-else.html)

**PHP**
```php
if (array_key_exists($index, $array))
    return $array[$index];
return defaultValue();
```

**C#**
 - `enumerable.ElementAtOrDefault(index) ?? defaultValue()`

</details>
<details><summary>getOrNull(index) / atOrNull(index) / elementAtOrNull(index)</summary>

**Javascript**
```javascript
if (index in array)
    return array[index]
return null
```

**Java**
```java
if (index <= list.size())
    return list.get(index);
return null;
```

**Kotlin**
 - [Array.elementAtOrNull(index)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/element-at-or-null.html)
 - [Iterable.elementAtOrNull(index)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/element-at-or-null.html)
 - [List.elementAtOrNull(index)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/element-at-or-null.html)
 - [List.getOrNull(index)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/get-or-null.html)

**PHP**
```php
return $array?[$index];
```

**C#**
 - <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.elementatordefault#system-linq-enumerable-elementatordefault-1(system-collections-generic-ienumerable((-0))-system-index)">Enumerable.ElementAtOrDefault(index)</a>

</details>
<br/>
<details><summary>indexOf(element, fromIndex, toIndex, limit)</summary>

**Javascript**
 - [Array.indexOf(element, fromIndex)](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf)

**Java**
 - [List.indexOf(element)](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object))

**Kotlin**
 - [Array.indexOf(element)<br/>Iterable.indexOf(element)<br/>List.indexOf(element)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of.html)

**PHP**

**C#**
 - [IndexOf(array, element, fromIndex, limit)](https://learn.microsoft.com/dotnet/api/system.array.indexof)
 - [IList.IndexOf(element)](https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.system-collections-ilist-indexof)
 - [List.IndexOf(element, fromIndex, limit)](https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof)

</details>
<details><summary>lastIndexOf(element, fromIndex, toIndex, limit)</summary>

**Javascript**
 - [Array.lastIndexOf(element, fromIndex)](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf)

**Java**
 - [List.lastIndexOf(element)](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object))

**Kotlin**
 - [Array.lastIndexOf(element)<br/>Iterable.lastIndexOf(element)<br/>List.lastIndexOf(element)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last-index-of.html)

**PHP**

**C#**
 - [LastIndexOf(array, element, startIndex, limit)](https://learn.microsoft.com/dotnet/api/system.array.lastindexof)
 - [List.LastIndexOf(element, startIndex, limit)](https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof)

</details>
<details><summary>indexOfFirst(predicate, fromIndex, toIndex, limit)<br/>indexOfFirstIndexed(predicate, fromIndex, toIndex, limit)</summary>

**Javascript**
 - [Array.findIndex(predicate)](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex)

**Java**
```java
var index = startingIndex - 1;
while (++index <= endingIndex)
    if (predicate)
            return index;
return null;
```

**Kotlin**
 - [Array.indexOfFirst(predicate)<br/>Iterable.indexOfFirst(predicate)<br/>List.indexOfFirst(predicate)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-first.html)

**PHP**

**C#**
 - [FindIndex(array, predicate)<br/>FindIndex(array, fromIndex, predicate)<br/>FindIndex(array, fromIndex, limit, predicate)](https://learn.microsoft.com/dotnet/api/system.array.findindex)
 - [List.FindIndex(predicate)<br/>List.FindPredicate(fromIndex, predicate)<br/>List.FindPredicate(fromIndex, limit, predicate)](https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.findindex)

</details>
<details><summary>indexOfLast(predicate, fromIndex, toIndex, limit)<br/>indexOfLastIndexed(predicate, fromIndex, toIndex, limit))</summary>

**Javascript**
 - [Array.findLastIndex(predicate)](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex)

**Java**
```java
var index = endingIndex + 1;
while (--index >= startingIndex)
    if (predicate)
            return index;
return null;
```

**Kotlin**
 - [Array.indexOfLast(predicate)<br/>Iterable.indexOfLast(predicate)<br/>List.indexOfLast(predicate)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html)

**PHP**

**C#**
 - [FindLastIndex(array, predicate)<br/>FindLastIndex(array, fromIndex, predicate)<br/>FindLastIndex(array, fromIndex, limit, predicate)](https://learn.microsoft.com/dotnet/api/system.array.findlastindex)
 - [List.FindLastIndex(predicate)<br/>List.FindLastIndex(fromIndex, predicate)<br/>List.FindLastIndex(fromIndex, limit, predicate)](https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.findlastindex)

</details>
<br/>
<details><summary>first()</summary>

**Javascript**
```javascript
if (0 in array)
    return array[0]
throw
```

**Java**
 - `collection.stream().findFirst().orElseThrow()`

**Kotlin**
 - [Array.first()<br/>Iterable.first()<br/>List.first()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html)

**PHP**

**C#**
 - <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first#system-linq-enumerable-first-1(system-collections-generic-ienumerable((-0)))">IEnumerable.First()</a>

</details>
<details><summary>first(predicate)</summary>

**Javascript**
```javascript
const size = array.length
let index = -1
while (++index < size) {
    const value = array[index]
    if (predicate)
        return value
}
throw
```

**Java**
 - `collection.stream().findFirst().or(predicate).orElseThrow()`

**Kotlin**
 - [Array.first(predicate)<br/>Iterable.first(predicate)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html)

**PHP**

**C#**
 - <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first#system-linq-enumerable-first-1(system-collections-generic-ienumerable((-0))-system-func((-0-system-boolean)))">IEnumerable.First(predicate)</a>

</details>
<details><summary>firstOrNull()</summary>

**Javascript**
```javascript
if (0 in array)
    return array[0]
return null
```

**Java**
 - `collection.stream().findFirst().orElse(null)`

**Kotlin**
 - [Array.firstOrNull()<br/>Iterable.firstOrNull()<br/>List.firstOrNull()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first-or-null.html)

**PHP**

**C#**
 - <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault#system-linq-enumerable-firstordefault-1(system-collections-generic-ienumerable((-0)))">IEnumerable.FirstOrDefault()</a>

</details>
<details><summary>firstOrNull(predicate)</summary>

**Javascript**
```javascript
const size = array.length
let index = -1
while (++index < size) {
    const value = array[index]
    if (predicate)
        return value
}
return null 
```

**Java**
 - `collection.stream().findFirst().or(predicate).orElse(null)`

**Kotlin**
 - [Array.firstOrNull(predicate)<br/>Iterable.firstOrNull(predicate)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first-or-null.html)

**PHP**

**C#**
 - <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first#system-linq-enumerable-first-1(system-collections-generic-ienumerable((-0))-system-func((-0-system-boolean)))">IEnumerable.FirstOrDefault(predicate)</a>

</details>
<br/>
<details><summary>last()</summary>

**Javascript**
```javascript
const size = array.length
if (size > 0)
    return array[size - 1]
throw
```

**Java**
 - `collection.stream().reduce((_, it) -> it).orElseThrow()`
```java
var size = list.size();
if (size > 0)
    return list.get(size - 1);
throw
```

**Kotlin**
 - [Array.last()<br/>Iterable.last()<br/>List.last()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last.html)

**PHP**

**C#**
 - <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last#system-linq-enumerable-last-1(system-collections-generic-ienumerable((-0)))">IEnumerable.Last()</a>

</details>
<details><summary>last(predicate)</summary>

**Javascript**
```javascript
let index = array.length
while (index-- > 0) {
    const value = array[index]
    if (predicate)
        return value
}
throw
```

**Java**
 - `collection.stream().reduce((_, it) -> it).or(predicate).orElseThrow()`
```java
var index = list.size();
while (index-- > 0) {
    var value = list.get(index);
    if (predicate)
        return value;
}
throw
```

**Kotlin**
 - [Array.last(predicate)<br/>Iterable.last(predicate)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last.html)

**PHP**

**C#**
 - <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last#system-linq-enumerable-last-1(system-collections-generic-ienumerable((-0))-system-func((-0-system-boolean)))">IEnumerable.Last(predicate)</a>

</details>
<details><summary>lastOrNull()</summary>

**Javascript**
```javascript
const size = array.length
if (size > 0)
    return array[size - 1]
return null
```

**Java**
 - `collection.stream().reduce((_, it) -> it).orElse(null)`
```java
var size = list.size();
if (size > 0)
    return list.get(size - 1);
return null;
```

**Kotlin**
 - [Array.lastOrNull()<br/>Iterable.lastOrNull()<br/>List.lastOrNull()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last-or-null.html)

**PHP**

**C#**
 - <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault#system-linq-enumerable-lastordefault-1(system-collections-generic-ienumerable((-0)))">IEnumerable.LastOrDefault()</a>

</details>
<details><summary>lastOrNull(predicate)</summary>

**Javascript**
```javascript
let index = array.length
while (index-- > 0) {
    const value = array[index]
    if (predicate)
        return value
}
return null
```

**Java**
 - `collection.stream().reduce((_, it) -> it).or(predicate).orElse(null)`
```java
var index = list.size();
while (index-- > 0) {
    const value = list.get(index);
    if (predicate)
        return value;
}
return null;
```

**Kotlin**
 - [Array.lastOrNull(predicate)<br/>Iterable.lastOrNull(predicate)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last-or-null.html)

**PHP**

**C#**
 - <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault#system-linq-enumerable-lastordefault-1(system-collections-generic-ienumerable((-0))-system-func((-0-system-boolean)))">IEnumerable.LastOrDefault(predicate)</a>

</details>

### Loop methods
The methods utilizing a loop in their behaviour

<details><summary>all(predicate)</summary>

**Javascript**
```javascript
const size = array.length
let index = -1
while (++index < size)
    if (!predicate)
        return false
return true
```

**Java**
 - `collection.stream().allMatch(predicate)`
```java
var size = list.size();
var index = -1;
while (++index < size)
    if (!predicate)
        return false;
return true;
```

**Kotlin**
 - [Array.all(predicate)<br/>Iterable.all(predicate)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/all.html)

**PHP**

**C#**
 - [IEnumerable.All()](https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all)

</details>
<details><summary>any()</summary>

**Javascript**
 - `array.length !== 0`
 - `set.size !== 0`

**Java**
 - `array.length == 0`
 - `collection.isEmpty()`

**Kotlin**
 - [Array.any()<br/>Iterable.any()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html)

**PHP**

**C#**
 - <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any#system-linq-enumerable-any-1(system-collections-generic-ienumerable((-0)))">IEnumerable.Any()</a>

</details>
<details><summary>any(predicate)</summary>

**Javascript**
```javascript
const size = array.length
let index = -1
while (++index < size)
    if (predicate)
        return true
return false
```

**Java**
 - `collection.stream().anyMatch(predicate)`
```java
var size = array.size();
var index = -1;
while (++index < size)
    if (predicate)
        return true;
return false;
```

**Kotlin**
 - [Array.any(predicate)<br/>Iterable.any(predicate)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html)

**PHP**

**C#**
 - <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any#system-linq-enumerable-any-1(system-collections-generic-ienumerable((-0))-system-func((-0-system-boolean)))">IEnumerable.Any(predicate)</a>

</details>
<details><summary>none()</summary>

**Javascript**
 - `array.length === 0`
 - `set.size === 0`

**Java**
 - `array.length == 0`
 - `!collection.isEmpty()`

**Kotlin**
 - [Array.none()<br/>Iterable.none()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/none.html)

**PHP**

**C#**
 - `!enumerable.Any()`

</details>
<details><summary>none(predicate)</summary>

**Javascript**
```javascript
const size = array.length
let index = -1
while (++index < size)
    if (predicate)
        return false
return true
```

**Java**
 - `collection.stream().noneMatch(predicate)`
```java
var size = array.size();
var index = -1;
while (++index < size)
    if (predicate)
        return false;
return true;
```

**Kotlin**
 - [Array.none(predicate)<br/>Iterable.none(predicate)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/none.html)

**PHP**

**C#**
 - `!enumerable.Any(predicate)`

</details>
<br/>
<details><summary>hasOne(values) / has(values) / includesOne(values) / includes(values) / containsOne(values) / contains(values)</summary>

**Javascript**
```javascript
const size = array.length
let index = -1
while (++index < size)
    if (array.includes(values[index]))
        return true
return false
```

**Java**
```java
var size = list.size();
var index = -1;
while (++index < size)
    if (list.contains(values[index]))
        return true;
return false;
```

**Kotlin**
```kotlin
val size = list.size()
var index = -1
while (++index < size)
    if (values[index] in list)
            return true
return false
```

**PHP**

**C#**
```csharp
var size = enumerable.Count();
var index = -1;
while (++index < size)
    if (enumerable.Contains(values.ElementAt(index)))
        return true;
return false;
```

</details>
<details><summary>hasAll(values) / includesAll(values) / containsAll(values)</summary>

**Javascript**
```javascript
const size = values.length
let index = -1
while (++index < size)
    if (!array.includes(values[index]))
        return false
return true
```

**Java**
```java
var size = list.size();
var index = -1;
while (++index < size)
    if (!list.contains(values[index]))
            return false;
return true;
```

**Kotlin**
```kotlin
val size = values.size()
var index = -1
while (++index < size)
    if (values[index] !in array)
            return false
return true
```

**PHP**

**C#**
```csharp
var size = enumerable.Count();
var index = -1;
while (++index < size)
    if (!enumerable.Contains(values.ElementAt(index)))
        return false;
return true;
```

</details>
<br/>
<details><summary>join(separator, prefix, postfix, limit, truncated, transform)</summary>

**Javascript**
 - [Array.join(separator)](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/join)

**Java**
 - [String.join(separator, iterable)](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/String.html#join(java.lang.CharSequence,java.lang.Iterable))

**Kotlin**
 - [Array.joinToString(separator, prefix, postfix, limit, truncated, transform)<br/>Iterable.joinToString(separator, prefix, postfix, limit, truncated, transform)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/join-to-string.html)

**PHP**

**C#**
 - [string.Join(separator, array, fromIndex, limit)<br/>Join(separator, enumerable)](https://learn.microsoft.com/dotnet/api/system.string.join)

</details>
<br/>
<details><summary>filter(predicate)</summary>

**Javascript**
 - [Array.filter(predicate)](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/filter)

**Java**
 - `collection.stream().filter(predicate).toList()`

**Kotlin**
 - [Array.filter(predicate)<br/>Iterable.filter(predicate)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter.html)

**PHP**
 - [array_filter($array, $predicate)](https://www.php.net/manual/function.array-filter.php)

**C#**
 - [IEnumerable.Where(predicate)](https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where)

</details>
<details><summary>filterIndexed(predicate)</summary>

**Javascript**
 - [Array.filter(predicate)](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/filter)

**Java**
 - `collection.stream().filter(predicate).toList()`

**Kotlin**
 - [Array.filterIndexed(predicate)<br/>Iterable.filterIndexed(predicate)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-indexed.html)

**PHP**
 - [array_filter($array, $predicate)](https://www.php.net/manual/function.array-filter.php)

**C#**
 - [IEnumerable.Where(predicate)](https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where)

</details>
<details><summary>filterNot(predicate)<br/>filterIndexedNot(predicate)</summary>

**Javascript**
 - `!array.filter(predicate)`

**Java**
 - `collection.stream().filter(!predicate).toList()`

**Kotlin**
 - [Array.filterNot(predicate)<br/>Iterable.filterNot(predicate)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-not.html)

**PHP**
- `array_filter($array, !$predicate)`

**C#**
 - `!enumerable.Where(predicate)`

</details>
<details><summary>filterNotNull()</summary>

**Javascript**
 - `array.filter(it => it != null)`

**Java**
 - `collection.stream().filter(it -> it != null).toList()`

**Kotlin**
 - [Array.filterNotNull()<br/>Iterable.filterNotNull()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-not-null.html)

**PHP**
 - `array_filter($array, fn(it) => $array[$it] != null,)`

**C#**
 - `!enumerable.Where(it => it != null)`

</details>
<details><summary>requireNoNulls()</summary>

**Javascript**
```javascript
const size = array.length
let index = -1
while (++index < size)
    if (array[index] == null)
        throw
```

**Java**
```java
var size = list.size();
var index = -1;
while (++index < size)
    if (list.get(index) == null)
        throw
```

**Kotlin**
 - [Array.requireNoNulls()<br/>Iterable.requireNoNulls()<br/>List.requireNoNulls()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/require-no-nulls.html)

**PHP**
```php
$size = sizeof($array);
$index = -1;
while (++$index < $size)
    if ($array[$index] == null)
        throw
```

**C#**
```csharp
var size = enumerable.Count();
var index = -1;
while (++index < size)
    if (enumerable.ElementAt(index) == null)
        throw
```

</details>
<br/>
<details><summary>find(predicate)<br/>findIndexed(predicate)</summary>

**Javascript**
 - [Array.find(predicate)](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find)

**Java**
 - `collection.stream().filter(predicate).findFirst().orElse(null)`

**Kotlin**
 - [Array.find(predicate)<br/>Iterable.find(predicate)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find.html)

**PHP**

**C#**
 - [Find(array, predicate)](https://learn.microsoft.com/dotnet/api/system.array.find)
 - [List.Find(predicate)](https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.find)

</details>
<details><summary>findLast(predicate)<br/>findLastIndexed(predicate)</summary>

**Javascript**
 - [Array.findLast(predicate)](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast)

**Java**
 - `collection.stream().filter(predicate).reduce((_, it) -> it).orElse(null)`

**Kotlin**
 - [Array.findLast(predicate)<br/>Iterable.findLast(predicate)<br/>List.findLast(predicate)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find-last.html)

**PHP**

**C#**
 - [FindLast(array, predicate)](https://learn.microsoft.com/dotnet/api/system.array.findlast)
 - [List.FindLast(predicate)](https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.findlast)

</details>
<br/>
<details><summary>slice(indices)</summary>

**Javascript**
```javascript
const indiceSize = indices.length
const newArray = new Array(indiceSize)
let index = indiceSize
while (index-- > 0)
    newArray[index] = this[indices[index]]
return newArray
```

**Java**
```java
var indiceSize = indices.length;
var newArray = (T[]) new Object[indiceSize];
>var index = indiceSize;
while (index-- > 0)
    newArray[index] = this.get(indices[index]);
return newArray;
```

**Kotlin**
 - [Array.slice(indices)<br/>List.slice(indices)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html)

**PHP**

**C#**
```csharp
var indiceSize = indices.Count();
var newArray = new T[indiceSize];
var index = indiceSize;
while (index-- > 0)
    newArray[index] = this.ElementAt(indices[index]);
return newArray;
```

</details>
<details><summary>slice(fromIndex, toIndex, limit)</summary>

**Javascript**
 - [Array.slice(fromIndex, toIndex)](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/slice)

**Java**
 - `Arrays.copyOfRange(array, fromIndex, toIndex)`

**Kotlin**
 - [Array.slice(indices)<br/>List.slice(indices)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html)

**PHP**

**C#**
 - `enumerable.Skip(fromIndex).Take(toIndex)`

</details>
<br/>
<details><summary>map(transform)</summary>

**Javascript**
 - [Array.map(transform)](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/map)

**Java**
 - `collection.stream().map(transform).toList()`

**Kotlin**
 - [Array.map(transform)<br/>Iterable.map(transform)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/map.html)

**PHP**
 - [array_map($transform, $array)](https://www.php.net/manual/function.array-map.php)

**C#**
 - [IEnumerable.Select(predicate)](https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select)

</details>
<details><summary>mapIndexed(transform)</summary>

**Javascript**
 - [Array.map(transform)](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/map)

**Java**
 - `collection.stream().map(transform).toList()`

**Kotlin**
 - [Array.mapIndexed(transform)<br/>Iterable.mapIndexed(transform)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/map-indexed.html)

**PHP**
 - [array_map($transform, $array)](https://www.php.net/manual/function.array-map.php)

**C#**
 - [IEnumerable.Select(predicate)](https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select)

</details>
<details><summary>mapNotNull(transform)</summary>

**Javascript**
```javascript
const size = this.size
const newArray = []
let index = -1
while (++index < size) {
    const value = transform
    if (value == null)
        continue
    newArray.push(value)
}
return newArray
```

**Java**
```java
var size = this.size();
var newList = new LinkedList<T>();
var index = -1;
while (++index < size) {
    const value = transform;
    if (value == null)
        continue
    newList.add(value);
}
return newList.toArray((T[]) new Object[newList.size()]);
```

**Kotlin**
 - [Array.mapNotNull(transform)<br/>Iterable.mapNotNull(transform)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/map-not-null.html)

**PHP**
```php
$size = sizeof($this);
$newArray = [];
$index = -1;
while (++$index < $size) {
    $value = transform;
    if ($value == null)
        continue;
    $newArray[] = $value;
}
return $newArray;
```

**C#**

```csharp
var size = this.Count();
const newArray = new T[];
var index = -1;
while (++index < size) {
    var value = transform;
        if (value == null)
            continue;
        newArray.Add(value);
}
return newArray;
```

</details>
<details><summary>mapNotNullIndexed(transform)</summary>

**Javascript**
```javascript
const size = this.size
const newArray = []
let index = -1
while (++index < size) {
    const value = transform
    if (value == null)
        continue
    newArray.push(value)
}
return newArray
```

**Java**
```java
var size = this.size();
var newList = new LinkedList<T>();
var index = -1;
while (++index < size) {
    const value = transform;
    if (value == null)
        continue
    newList.add(value);
}
return newList.toArray((T[]) new Object[newList.size()]);
```

**Kotlin**
 - [Array.mapIndexedNotNull(transform)<br/>Iterable.mapIndexedNotNull(transform)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/map-indexed-not-null.html)

**PHP**
```php
$size = sizeof($this);
$newArray = [];
$index = -1;
while (++$index < $size) {
    $value = transform;
    if ($value == null)
        continue;
    $newArray[] = $value;
}
return $newArray;
```

**C#**
```csharp
var size = this.Count();
const newArray = new T[];
var index = -1;
while (++index < size) {
    var value = transform;
        if (value == null)
            continue;
        newArray.Add(value);
}
return newArray;
```

</details>
<br/>
<details><summary>forEach(action)</summary>

**Javascript**
 - [Array.forEach(action)](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach)
 - [Set.forEach(action)](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach)

**Java**
 - [Iterable.forEach(action)](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer))

**Kotlin**
 - [Array.forEach(action)<br/>Iterable.forEach(action)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/for-each.html)

**PHP**
 - [array_walk(&$array, $action)](https://www.php.net/manual/function.array-walk.php)

**C#**
 - [List.forEach(action)](https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.foreach)

</details>
<details><summary>forEachIndexed(action)</summary>

**Javascript**
 - [Array.forEach(action)](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach)
 - [Set.forEach(action)](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach)

**Java**
 - [Iterable.forEach(action)](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer))

**Kotlin**
 - [Array.forEachIndexed(action)<br/>Iterable.forEachIndexed(action)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/for-each-indexed.html)

**PHP**
 - [array_walk(&$array, $action)](https://www.php.net/manual/function.array-walk.php)

**C#**
 - [List.forEach(action)](https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.foreach)

</details>

### Conversion methods
A method made to convert it to another value

<details><summary>toIterator()</summary>

**Javascript**
 - [Array\[Symbol.iterator\]()](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/@@iterator)
 - [Set\[Symbol.iterator\]()](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/@@iterator)

**Java**
 - [Iterable.iterator()](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/Iterable.html#iterator())
 - [Collection.iterator()](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/Collection.html#iterator())
 - [List.iterator()](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/List.html#iterator())
 - [Set.iterator()](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/Set.html#iterator())

**Kotlin**
 - [Iterable.iterator()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/iterator.html)
 - [Collection.iterator()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/iterator.html)
 - [List.iterator()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/iterator.html)
 - [Set.iterator()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/iterator.html)

**PHP**

**C#**
 - [IEnumerable.GetEnumerator()](https://learn.microsoft.com/dotnet/api/system.collections.ienumerable.getenumerator)

</details>
<br/>
<details><summary>toArray()</summary>

**Javascript**
```javascript
Object.freeze([...iterable])
```

**Java**
 - [Collection.toArray(T[] array)](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/Collection.html#toArray(T%5B%5D))

**Kotlin**
 - [Collection.toTypedArray()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/to-typed-array.html)

**PHP**

**C#**
 - `new ReadOnlyCollection<T>(enumerable)`
 - [enumerable.ToImmutableArray()](https://learn.microsoft.com/en-us/dotnet/api/system.collections.immutable.immutablearray.toimmutablearray#system-collections-immutable-immutablearray-toimmutablearray-1%28system-collections-generic-ienumerable%28%28-0%29%29%29)

</details>
<details><summary>toMutableArray()</summary>

**Javascript**
```javascript
[...iterable]
```

~~**Java**~~

~~**Kotlin**~~

**PHP**

**C#**
 - [IEnumerable.ToArray()](https://learn.microsoft.com/dotnet/api/system.linq.enumerable.toarray)

</details>
<br/>
<details><summary>toCollection()</summary>

~~**Javascript**~~

**Java**
 - [Collections.unmodifiableCollection(collection)](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/Collections.html#unmodifiableCollection(java.util.Collection))

**Kotlin**
 - [Array.toCollection()<br/>Iterable.toCollection()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/to-collection.html)

**PHP**

**C#**
```csharp
new ReadOnlyCollection<T>(enumerable)
```

</details>
<details><summary>toMutableCollection()</summary>

~~**Javascript**~~

**Java**
 - [Collections.addAll(collection)](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/Collections.html#addAll(java.util.Collection,T...))

**Kotlin**
 - `mutableArrayOf(*iterable)`
 - `mutableSetOf(*iterable)`

**PHP**

**C#**
 - `enumerable.toList()`
 - `enumerable.toHashSet()`

</details>
<br/>
<details><summary>toList()</summary>

~~**Javascript**~~

**Java**
 - [Collections.unmodifiableList(list)](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/Collections.html#unmodifiableList(java.util.List))

**Kotlin**
 - [Array.toList()<br/>Iterable.toList()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/to-list.html)

**PHP**

**C#**
 - `new ReadOnlyCollection<T>(enumerable)`
 - [enumerable.toImmutableList()](https://learn.microsoft.com/en-us/dotnet/api/system.collections.immutable.immutablelist.toimmutablelist?#system-collections-immutable-immutablelist-toimmutablelist-1%28system-collections-generic-ienumerable%28%28-0%29%29%29)

</details>
<details><summary>toMutableList()</summary>

~~**Javascript**~~

**Java**
```java
new ArrayList<>(collection)
```

**Kotlin**
 - [Array.toMutableList()<br/>Iterable.toMutableList()<br/>Collection.toMutableList()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/to-mutable-list.html)

**PHP**

**C#**
 - [IEnumerable.ToList()](https://learn.microsoft.com/dotnet/api/system.linq.enumerable.tolist)

</details>
<br/>
<details><summary>toSet()</summary>

**Javascript**
```javascript
Object.freeze(new Set(iterable))
```

**Java**
 - [Collections.unmodifiableSet(set)](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/Collections.html#unmodifiableSet(java.util.Set))

**Kotlin**
 - [Array.toSet()<br/>Iterable.toSet()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/to-set.html)

**PHP**

**C#**
```csharp
new ReadOnlyCollection<T>(enumerable)
```

</details>
<details><summary>toMutableSet()</summary>

**Javascript**
```javascript
new Set(iterable)
```

**Java**
```java
new HashSet<>(collection)
```

**Kotlin**
 - [Array.toMutableSet()<br/>Iterable.toMutableSet()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/to-mutable-set.html)

**PHP**

**C#**
 - <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.tohashset#system-linq-enumerable-tohashset-1(system-collections-generic-ienumerable((-0)))">IEnumerable.toHashSet()</a>

</details>
<br/>
<details><summary>toWeakSet()</summary>

**Javascript**
```javascript
Object.freeze(new WeakSet(array.map(it => Object(it))))
```

~~**Java**~~

~~**Kotlin**~~

**PHP**

~~**C#**~~

</details>
<details><summary>toMutableWeakSet()</summary>

**Javascript**
```javascript
new WeakSet(array.map(it => Object(it)))
```

~~**Java**~~

~~**Kotlin**~~

**PHP**

~~**C#**~~

</details>
<br/>
<details><summary>toMap()<br/>toDictionary()</summary>

**Javascript**
```javascript
Object.freeze(new Map(array.map((it, index) => [it, index]))) 
```

**Java**
```java
list.stream().collect(Collectors.toUnmodifiableMap(list::indexOf, it -> it))
```

**Kotlin**
```kotlin
iterable.mapIndexed { index, i -> index to i }.toMap()
```

**PHP**

**C#**
```csharp
new ReadOnlyCollection<T>(enumerable)
```

</details>
<details><summary>toMutableMap()<br/>toMutableDictionary()</summary>

**Javascript**
```javascript
new Map(array.map((it, index) => [it, index]))
```

**Java**
```java
list.stream().collect(Collectors.toMap(list::indexOf, it -> it))
```

**Kotlin**
```kotlin
iterable.mapIndexed { index, i -> index to i }.toMap().toMutableMap()
```

**PHP**

**C#**
 - <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.todictionary#system-linq-enumerable-todictionary-3(system-collections-generic-ienumerable((-0))-system-func((-0-1))-system-func((-0-2)))">IEnumerable.ToDictionary()</a>

</details>
<br/>
<details><summary>toReverse() / toReversed() / reversed()</summary>

**Javascript**
 - [Array.toReversed()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed)

**Java**
```java
var size = list.size();
var newArray = (T[]) new Object[size];
var index = size;
var indexToSet = 0;
while (--index > 0)
    newArray[indexToSet++] = list.get(index);
return newArray;
```

**Kotlin**
 - [Array.reversed()<br/>Iterable.reversed()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reversed.html)

**PHP**
 - [array_reverse($array)](https://www.php.net/manual/function.array-reverse.php)

**C#**
 - [Reverse(array, fromIndex, limit)](https://learn.microsoft.com/dotnet/api/system.array.reverse)
 - [IEnumerable.Reverse()](https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse)
 - [List.Reverse(fromIndex, limit)](https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse)

</details>

## Version history

| JS/TS                                                                       | Date                 | Quick note                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
|-----------------------------------------------------------------------------|----------------------|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1.9.1                                                                       | July 21st, 2024      | Spread of the deprecation across the inheritor of `CollectionHolder`                                                                                                                                                                                                                                                                                                                                                                                                                         |
| [1.9.0](https://github.com/joooKiwi/collection/releases/tag/v1.9.0-js)      | July 21st, 2024      | Addition of `hasDuplicate`, `joinToString` for the `CollectionHolder` <br/>Change on the `CollectionIterator` to use `NullableNumber` instead of `number` for the indexes<br/>Addition of implementation for the `ValueHolder`<br/>Deprecation of variadic parameters for `has`, `hasAll` & `hasOne`<br/>The abstract implementations no longer have fields held<br/>[lazy](https://github.com/joookiwi/lazy) (~~1.4.0~~ → [1.5.0](https://github.com/joooKiwi/lazy/releases/tag/v1.5.0-js)) |
| [1.8.0](https://github.com/joooKiwi/collection/releases/tag/v1.8.0-js)      | March 31st, 2024     | Addition of [type](https://github.com/joooKiwi/type) to the dependency                                                                                                                                                                                                                                                                                                                                                                                                                       |
| 1.7.1                                                                       | February 19th, 2024  | Change from `==` to `===` on the `GenericCollectionIterator`                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| [1.7.0](https://github.com/joooKiwi/collection/releases/tag/v1.7.0-js)      | February 19th, 2024  | New implementation of [MinimalistCollectionHolder](https://github.com/joooKiwi/collection/blob/main/javascript/src/MinimalistCollectionHolder.ts)<br/>Addition of `has`, `contains`, `includes`, `reversed`, `toReversed` alias methods to the `CollectionHolder`<br/>New names to the `CollectionHandler`s<br/>[lazy](https://github.com/joookiwi/lazy) (~~1.2.1~~ → [1.3.0](https://github.com/joooKiwi/lazy/releases/tag/v1.3.0-js))                                                      |
| 1.6.1                                                                       | December 23rd, 2023  | Addition of the missing amd (asynchronous module definition) package                                                                                                                                                                                                                                                                                                                                                                                                                         |
| [1.6.0](https://github.com/joooKiwi/collection/releases/tag/v1.6.0-js)      | December 4th, 2023   | New implementation based on the amount of arguments received in a callback<br/>Addition of `toString` variants methods to the `CollectionHolder`<br/>Deprecation (for removal) of the `newInstance`                                                                                                                                                                                                                                                                                          |
| [1.5.0](https://github.com/joooKiwi/collection/releases/tag/v1.5.0-js)      | September 28th, 2023 | The `RangeError` and `ReferenceError` has been changed to custom exceptions<br/>[lazy](https://github.com/joookiwi/lazy) (~~1.1.0~~ → [1.2.0](https://github.com/joooKiwi/lazy/releases/tag/v1.2.0-js))                                                                                                                                                                                                                                                                                      |
| [1.4.0](https://github.com/joooKiwi/collection/releases/tag/v1.4.0-js)      | September 8th, 2023  | Addition of a `limit` on every methods where it has `fromIndex` and `toIndex`<br/>Change on the `toIndex` to be inclusive instead of exclusive<br/>Addition of `elementAt`, `elementAtOrNull`, `elementAtOrElse`, `mapNotNull`, `mapNotNullIndexed`, `slice` to the `CollectionHolder`                                                                                                                                                                                                       |
| [1.3.0](https://github.com/joooKiwi/collection/releases/tag/v1.3.0-js)      | August 14th, 2023    | Small changes on some utility methods<br/>Addition of `nextValue` and `previousValue` to the `CollectionIterator`                                                                                                                                                                                                                                                                                                                                                                            |
| [1.2.0](https://github.com/joooKiwi/collection/releases/tag/v1.2.0-js)      | July 27th, 2023      | Fix on a "for‥of" not working properly                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| [1.1.0](https://github.com/joooKiwi/collection/releases/tag/v1.1.0-js)      | July 23rd, 2023      | Addition of a new [CollectionIterator](https://github.com/joooKiwi/collection/blob/main/javascript/src/iterator/CollectionIterator.ts)                                                                                                                                                                                                                                                                                                                                                       |
| 1.0.4                                                                       | July 2nd, 2023       | There were recursive import for the [EmptyCollectionHolder](https://github.com/joooKiwi/collection/blob/main/javascript/src/EmptyCollectionHolder.ts) from the [CollectionConstants](https://github.com/joooKiwi/collection/blob/main/javascript/src/CollectionConstants.ts)                                                                                                                                                                                                                 |
| 1.0.3                                                                       | July 1st, 2023       | For some reason, the file [CollectionHolder](https://github.com/joooKiwi/collection/blob/main/javascript/src/CollectionHolder.ts) had a Symbol not declared                                                                                                                                                                                                                                                                                                                                  |
| 1.0.2                                                                       | July 1st, 2023       | Small fix on the [package.json](https://github.com/joooKiwi/collection/blob/main/javascript/package.json)                                                                                                                                                                                                                                                                                                                                                                                    |
| 1.0.1                                                                       | July 1st, 2023       | An update based on the new [lazy version](https://github.com/joookiwi/lazy)                                                                                                                                                                                                                                                                                                                                                                                                                  |
| [1.0.0](https://github.com/joooKiwi/collection/releases/tag/v1.0.0-JS%26TS) | July 1st, 2023       | The first version<br/>It was originally on the [enumeration](https://github.com/joooKiwi/enumeration) project                                                                                                                                                                                                                                                                                                                                                                                |
