package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.SequencedCollection;
import java.util.function.Predicate;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.jetbrains.annotations.UnmodifiableView;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

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

    //#region -------------------- Get methods --------------------

    /// Get the first element in the current [instance][SequencedCollection]
    ///
    /// @throws NoSuchElementException The current [instance][SequencedCollection] [is empty][#isEmpty]
    /// @see SequencedCollection#getFirst()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First()</a>
    @Override public T getFirst() { return UtilityForArray.getFirst(_reference()); }

    /// Get the last element in the current [instance][SequencedCollection]
    ///
    /// @throws NoSuchElementException The current [instance][SequencedCollection] [is empty][#isEmpty]
    /// @see SequencedCollection#getLast()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @Override public T getLast() { return UtilityForArray.getLast(_reference()); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    /// Give a reversed-view of the current [instance][SequencedCollection]
    ///
    /// @see SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @Override public @UnmodifiableView SequencedCollection<T> reversed() { return UtilityForArray.asReversed(this, _reference()); }

    //#endregion -------------------- As reverse methods --------------------

    @Override public abstract AbstractArrayAsSequencedCollection<T> clone();

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [instance][SequencedCollection]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable SequencedCollection."); }

    /// Fail to add a `value` to the current [instance][SequencedCollection]
    ///
    /// @param value The (_never used_) element to add at the start
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(final @Nullable T value) { throw new UnsupportedMethodException("The method “addFirst” is not supported in an immutable SequencedCollection."); }

    /// Fail to add a `value` to the current [instance][SequencedCollection]
    ///
    /// @param value The (_never used_) element to add at the end
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(final @Nullable T value) { throw new UnsupportedMethodException("The method “addLast” is not supported in an immutable SequencedCollection."); }

    /// Fail to add the `values` in the current [instance][SequencedCollection]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable SequencedCollection."); }


    /// Fail to clear the current [instance][SequencedCollection]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable SequencedCollection."); }


    /// Fail to remove a `value` in the current [instance][SequencedCollection]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable SequencedCollection."); }

    /// Fail to remove the first value in the current [instance][SequencedCollection]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedMethodException("The method “removeFirst” is not supported in an immutable SequencedCollection."); }

    /// Fail to remove the last value in the current [instance][SequencedCollection]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedMethodException("The method “removeLast” is not supported in an immutable SequencedCollection."); }

    /// Fail to remove the `values` in the current [instance][SequencedCollection]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedMethodException("The method “removeAll” is not supported in an immutable SequencedCollection."); }

    /// Fail to remove anything to the current [instance][SequencedCollection]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedMethodException("The method “removeIf” is not supported in an immutable SequencedCollection."); }

    /// Fail to keep the `values` in the current [instance][SequencedCollection]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedMethodException("The method “retainAll” is not supported in an immutable SequencedCollection."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
