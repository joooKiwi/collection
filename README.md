# Collection

This project has the sole purpose to have methods in a collection (list, array, set enumerable) with similar methods (or extension method).

It retrieves notions from `Javascript`, `Java`, `Kotlin`, `PHP` and `C#`.

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
| C#                        |                                                                                                      Nugget                                                                                                      |

## Related projects

Here is a list of the related projects made by me
- lazy [GitHub](https://github.com/joooKiwi/lazy) / [NPM](https://www.npmjs.com/package/@joookiwi/lazy)
- enumeration [GitHub](https://github.com/joooKiwi/enumeration) / [NPM](https://www.npmjs.com/package/@joookiwi/enumerable)

## Version history

| JS/TS                                                                       | Date                | Quick note                                                                                                                                                                                                                                                                             |
|-----------------------------------------------------------------------------|---------------------|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [1.4.0](https://github.com/joooKiwi/collection/releases/tag/v1.4.0-js)      | September 5th, 2023 | Addition of a `limit` on every methods where it has `fromIndex` and `toIndex`<br/>Change on the `toIndex` to be inclusive instead of exclusive<br/>Addition of `elementAt`, `elementAtOrNull`, `elementAtOrElse`, `mapNotNull`, `mapNotNullIndexed`, `slice` to the `CollectionHolder` |
| [1.3.0](https://github.com/joooKiwi/collection/releases/tag/v1.3.0-js)      | August 14th, 2023   | Small changes on some utility methods<br/>Addition of `nextValue` and `previousValue` to the `CollectionIterator`                                                                                                                                                                      |
| [1.2.0](https://github.com/joooKiwi/collection/releases/tag/v1.2.0-js)      | July 27th, 2023     | Fix on a "for‥of" not working properly                                                                                                                                                                                                                                                 |
| [1.1.0](https://github.com/joooKiwi/collection/releases/tag/v1.1.0-js)      | July 23rd, 2023     | Addition of a new [CollectionIterator](https://github.com/joooKiwi/collection/blob/main/javascript/src/iterator/CollectionIterator.ts)                                                                                                                                                 |
| 1.0.4                                                                       | July 2nd, 2023      | The were recursive import for the [EmptyCollectionHolder](https://github.com/joooKiwi/collection/blob/main/javascript/src/EmptyCollectionHolder.ts) from the [CollectionConstants](https://github.com/joooKiwi/collection/blob/main/javascript/src/CollectionConstants.ts)             |
| 1.0.3                                                                       | July 1st, 2023      | For some reason, the file [CollectionHolder](https://github.com/joooKiwi/collection/blob/main/javascript/src/CollectionHolder.ts) had a Symbol not declared                                                                                                                            |
| 1.0.2                                                                       | July 1st, 2023      | Small fix on the [package.json](https://github.com/joooKiwi/collection/blob/main/javascript/package.json)                                                                                                                                                                              |
| 1.0.1                                                                       | July 1st, 2023      | An update based on the new [lazy version](https://github.com/joookiwi/lazy)                                                                                                                                                                                                            |
| [1.0.0](https://github.com/joooKiwi/collection/releases/tag/v1.0.0-JS%26TS) | July 1st, 2023      | The first version<br/>It was originally on the [enumeration](https://github.com/joooKiwi/enumeration) project                                                                                                                                                                          |

