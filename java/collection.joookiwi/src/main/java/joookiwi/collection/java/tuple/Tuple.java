package joookiwi.collection.java.tuple;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.annotation.Alias;
import joookiwi.collection.java.annotation.OnlyGivePositiveValue;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import java.util.Collection;
import java.util.Map;

import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

@NotNullByDefault
public interface Tuple<T extends @Nullable Object>
        extends Cloneable {

    //#region -------------------- Size methods --------------------

    /// The current [instance][Tuple] size
    ///
    /// @see Collection#size()
    /// @see Map#size()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/length">JavaScript Array.length</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/size">JavaScript Set.size</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map/size">JavaScript Map.size</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/size.html">Kotlin Collection.size()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/size.html">Kotlin Map.size()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.count">C# Count()</a>
    @OnlyGivePositiveValue
    @Range(from = 0, to = MAX_INT_VALUE)
    int size();

    /// The current [instance][Tuple] size
    ///
    /// @see Collection#size()
    /// @see Map#size()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/length">JavaScript Array.length</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/size">JavaScript Set.size</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map/size">JavaScript Map.size</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/size.html">Kotlin Collection.size()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/size.html">Kotlin Map.size()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.count">C# Count()</a>
    @Alias("size")
    @OnlyGivePositiveValue
    @Range(from = 0, to = MAX_INT_VALUE)
    default int length() { return size(); }

    /// The current [instance][Tuple] size
    ///
    /// @see Collection#size()
    /// @see Map#size()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/length">JavaScript Array.length</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/size">JavaScript Set.size</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map/size">JavaScript Map.size</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/size.html">Kotlin Collection.size()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/size.html">Kotlin Map.size()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.count">C# Count()</a>
    @Alias("size")
    @OnlyGivePositiveValue
    @Range(from = 0, to = MAX_INT_VALUE)
    default int count() { return size(); }


    /// The current [instance][Tuple] has no values
    ///
    /// @see Collection#isEmpty()
    /// @see Map#isEmpty()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html">Kotlin isEmpty()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html">Kotlin Collection.isEmpty()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html">Kotlin Map.isEmpty()</a>
    boolean isEmpty();

    /// The current [instance][Tuple] has a minimum of 1 value
    ///
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html">Kotlin isNotEmpty()</a>
    boolean isNotEmpty();


    /// The current [instance][Tuple] has a minimum of 1 value
    ///
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html">Kotlin isNotEmpty()</a>
    @Alias("isNotEmpty") default boolean hasAtLeast1Element() { return isNotEmpty(); }

    /// The current [instance][Tuple] has a minimum of 1 value
    ///
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html">Kotlin isNotEmpty()</a>
    @Alias("isNotEmpty") default boolean containsAtLeast1Element() { return isNotEmpty(); }

    /// The current [instance][Tuple] has a minimum of 1 value
    ///
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html">Kotlin isNotEmpty()</a>
    @Alias("isNotEmpty") default boolean includesAtLeast1Element() { return isNotEmpty(); }


    /// The current [instance][Tuple] has exactly 1 value
    boolean hasExactly1Element();

    /// The current [instance][Tuple] has exactly 1 value
    @Alias("hasExactly1Element") default boolean containsExactly1Element() { return hasExactly1Element(); }

    /// The current [instance][Tuple] has exactly 1 value
    @Alias("hasExactly1Element") default boolean includesExactly1Element() { return hasExactly1Element(); }


    /// The current [instance][Tuple] has exactly 0 or 1 value
    boolean hasAtMost1Element();

    /// The current [instance][Tuple] has exactly 0 or 1 value
    @Alias("hasAtMost1Element") default boolean containsAtMost1Element() { return hasAtMost1Element(); }

    /// The current [instance][Tuple] has exactly 0 or 1 value
    @Alias("hasAtMost1Element") default boolean includesAtMost1Element() { return hasAtMost1Element(); }


    /// The current [instance][Tuple] has a minimum of 2 values
    boolean hasAtLeast2Elements();

    /// The current [instance][Tuple] has a minimum of 2 values
    @Alias("hasAtLeast2Elements") default boolean containsAtLeast2Elements() { return hasAtLeast2Elements(); }

    /// The current [instance][Tuple] has a minimum of 2 values
    @Alias("hasAtLeast2Elements") default boolean includesAtLeast2Elements() { return hasAtLeast2Elements(); }


    /// The current [instance][Tuple] has exactly 2 values
    boolean hasExactly2Elements();

    /// The current [instance][Tuple] has exactly 2 values
    @Alias("hasExactly2Elements") default boolean containsExactly2Elements() { return hasExactly2Elements(); }

    /// The current [instance][Tuple] has exactly 2 values
    @Alias("hasExactly2Elements") default boolean includesExactly2Elements() { return hasExactly2Elements(); }


    /// The current [instance][Tuple] has exactly 0, 1 or 2 values
    boolean hasAtMost2Elements();

    /// The current [instance][Tuple] has exactly 0, 1 or 2 values
    @Alias("hasAtMost2Elements") default boolean containsAtMost2Elements() { return hasAtMost2Elements(); }

    /// The current [instance][Tuple] has exactly 0, 1 or 2 values
    @Alias("hasAtMost2Elements") default boolean includesAtMost2Elements() { return hasAtMost2Elements(); }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Conversion methods --------------------

    CollectionHolder<T> toCollection();

    @Override String toString();

    //#endregion -------------------- Conversion methods --------------------

    /// Clone the current instance in a shallow manner.
    ///
    /// @apiNote If the instance is [Empty], then it is the only instance that is reserved to give the same instance.
    ///          Otherwise, it should always call its super.[#clone] method.
    Tuple<T> clone();

}
