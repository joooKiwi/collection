package joookiwi.collection.java;

import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.OnlyGivePositiveValue;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.EmptyCollectionException;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A minimalist declaration of the [CollectionHolder]
///
/// @param <T> the type
@NotNullByDefault
public interface MinimalistCollectionHolder<T extends @Nullable Object> {

    /// Get the size of the current [collection][MinimalistCollectionHolder]
    ///
    /// @see java.util.Collection#size()
    /// @see java.util.Map#size()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/length">JavaScript Array.length</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/size">JavaScript Set.size</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map/size">JavaScript Map.size</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/size.html">Kotlin Collection.size()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/size.html">Kotlin Map.size()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.count">C# Count()</a>
    @OnlyGivePositiveValue
    @Range(from = 0, to = MAX_INT_VALUE)
    int size();

    /// Get the element at the specified `index` in the current [collection][MinimalistCollectionHolder]
    ///
    /// @param index The index to retrieve a value
    /// @throws EmptyCollectionException  The current [collection][MinimalistCollectionHolder] is empty
    /// @throws IndexOutOfBoundsException The index calculated is under zero or over the [size][#size] (after calculation)
    /// @see java.util.List#get(int)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/at">JavaScript Array.at(index)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html">Kotlin get(index)</a>
    @CanReceiveNegativeValue T get(int index);

}
