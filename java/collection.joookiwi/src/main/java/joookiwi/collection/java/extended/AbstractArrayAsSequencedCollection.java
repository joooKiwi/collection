package joookiwi.collection.java.extended;

import java.util.NoSuchElementException;
import java.util.SequencedCollection;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.method.GetFirst;
import joookiwi.collection.java.method.GetLast;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

import static joookiwi.collection.java.CollectionConstants.emptySequencedCollection;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.exception.EmptyCollectionException.DEFAULT_MESSAGE;

/// A definition of an immutable [SequencedCollection] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsSequencedCollection
/// @see ReversedArrayAsSequencedCollection
@NotNullByDefault
public abstract class AbstractArrayAsSequencedCollection<T extends @Nullable Object>
        extends AbstractArrayAsCollection<T>
        implements SequencedCollection<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsSequencedCollection() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    /// Get the first element in the current [instance][SequencedCollection]
    ///
    /// @throws NoSuchElementException The current [instance][SequencedCollection] [is empty][#isEmpty]
    /// @see SequencedCollection#getFirst()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First()</a>
    @Override public T getFirst() {
        if (isEmpty())
            throw new NoSuchElementException(DEFAULT_MESSAGE);
        return GetFirst.getFirst(_reference());
    }

    /// Get the last element in the current [instance][SequencedCollection]
    ///
    /// @throws EmptyCollectionException The current [instance][SequencedCollection] [is empty][#isEmpty]
    /// @see SequencedCollection#getLast()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @Override public T getLast() {
        if (isEmpty())
            throw new NoSuchElementException(DEFAULT_MESSAGE);
        return GetLast.getLast(_reference());
    }

    /// Give a reversed-view of the current [instance][SequencedCollection]
    ///
    /// @see SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @Override public @UnmodifiableView SequencedCollection<T> reversed() {
        if (isEmpty())
            return emptySequencedCollection();
        return new ReversedArrayAsSequencedCollection<>(this, new ReversedArray<>(_reference()));
    }

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [instance][SequencedCollection]
    ///
    /// @param value The (_never used_) element to add at the start
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(T value) { throw new UnsupportedOperationException("The method “addFirst” is not supported in an immutable SequencedCollection."); }

    /// Fail to add a `value` to the current [instance][SequencedCollection]
    ///
    /// @param value The (_never used_) element to add at the end
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(T value) { throw new UnsupportedOperationException("The method “addLast” is not supported in an immutable SequencedCollection."); }

    /// Fail to remove the first value in the current [instance][SequencedCollection]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedOperationException("The method “removeFirst” is not supported in an immutable SequencedCollection."); }

    /// Fail to remove the last value in the current [instance][SequencedCollection]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedOperationException("The method “removeLast” is not supported in an immutable SequencedCollection."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
