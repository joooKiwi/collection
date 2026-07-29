package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Comparator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A [Collection] that can order its elements via a [Comparator] in addition to be a [SequencedCollection][java.util.SequencedCollection]
///
/// @apiNote This is not part of the <a href="https://docs.oracle.com/en/java/javase/24/core/java-collections-framework.html">Java collection framework</a>,
///          but it is an extension of it
/// @see joookiwi.collection.java.extended.set.ImmutableSortedSet ImmutableSortedSet
@NotNullByDefault
public interface ImmutableSortedCollection<T extends @Nullable Object>
        extends ImmutableSequencedCollection<T>,
                OrderableCollection<T> {

    //#region -------------------- As reverse methods --------------------

    /// Give a reversed-view of the current [instance][ImmutableSortedCollection]
    ///
    /// @see java.util.SequencedCollection#reversed
    /// @see java.util.List#reversed
    /// @see java.util.SequencedSet#reversed
    /// @see java.util.SortedSet#reversed
    /// @see java.util.NavigableSet#reversed
    /// @see java.util.Deque#reversed
    /// @see java.util.SequencedMap#reversed
    /// @see java.util.SortedMap#reversed
    /// @see java.util.NavigableMap#reversed
    /// @see java.util.concurrent.ConcurrentNavigableMap#reversed
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @Override ImmutableSortedCollection<T> reversed();

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override ImmutableSortedCollection<T> clone();

    //#endregion -------------------- Clone methods --------------------

}
