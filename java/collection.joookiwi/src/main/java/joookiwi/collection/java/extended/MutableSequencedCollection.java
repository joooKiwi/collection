package joookiwi.collection.java.extended;

import java.util.NoSuchElementException;
import java.util.SequencedCollection;
import org.jetbrains.annotations.ApiStatus.Experimental;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public interface MutableSequencedCollection<T extends @Nullable Object>
        extends MutableCollection<T>,
                SequencedCollection<T> {

    //#region -------------------- Get methods --------------------

    /// Get the first element in the current [instance][MutableSequencedCollection]
    ///
    /// @throws NoSuchElementException The current [instance][MutableSequencedCollection] [is empty][#isEmpty]
    /// @see java.util.SequencedCollection#getFirst()
    /// @see java.util.SequencedSet#getFirst()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First()</a>
    @Override T getFirst();

    /// Get the last element in the current [instance][MutableSequencedCollection]
    ///
    /// @throws NoSuchElementException The current [instance][MutableSequencedCollection] [is empty][#isEmpty]
    /// @see java.util.SequencedCollection#getLast()
    /// @see java.util.SequencedSet#getLast()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @Override T getLast();

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Add methods --------------------

    @Contract(mutates = "this")
    @Override void addFirst(T value);

    @Contract(mutates = "this")
    @Override void addLast(T value);

    //#endregion -------------------- Add methods --------------------
    //#region -------------------- Remove methods --------------------

    @Contract(mutates = "this")
    @Override T removeFirst();

    @Contract(mutates = "this")
    @Override T removeLast();

    //#endregion -------------------- Remove methods --------------------
    //#region -------------------- As reverse methods --------------------

    /// Give a reversed-view of the current [instance][MutableSequencedCollection]
    ///
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @Experimental
    @Override MutableSequencedCollection<T> reversed();

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override MutableSequencedCollection<T> clone();

    //#endregion -------------------- Clone methods --------------------

}
