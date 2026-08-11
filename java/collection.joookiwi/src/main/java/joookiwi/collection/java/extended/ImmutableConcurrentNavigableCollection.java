package joookiwi.collection.java.extended;

import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.Collection;
import java.util.function.Predicate;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public interface ImmutableConcurrentNavigableCollection<T extends @Nullable Object>
        extends ImmutableConcurrentCollection<T>,
                ImmutableNavigableCollection<T> {

        //#region -------------------- Supported methods --------------------

        //#region -------------------- As reverse methods --------------------

        /// Give a reversed-view of the current [instance][ImmutableConcurrentNavigableCollection]
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
        @Override ImmutableConcurrentNavigableCollection<T> reversed();

        //#endregion -------------------- As reverse methods --------------------
        //#region -------------------- Clone methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override ImmutableConcurrentNavigableCollection<T> clone();

        //#endregion -------------------- Clone methods --------------------

        //#endregion -------------------- Supported methods --------------------
        //#region -------------------- Unsupported methods --------------------

        /// Fail to add a `value` to the current [instance][ImmutableConcurrentNavigableCollection]
        ///
        /// @param value The (_never used_) element to add
        /// @throws UnsupportedMethodException The method is not supported
        @Contract(ALWAYS_FAIL_1)
        @Override default boolean add(final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable ConcurrentCollection."); }

        /// Fail to add the `values` in the current [instance][ImmutableConcurrentNavigableCollection]
        ///
        /// @param values The (_never used_) elements to add
        /// @throws UnsupportedMethodException The method is not supported
        @Contract(ALWAYS_FAIL_1)
        @Override default boolean addAll(final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable ConcurrentCollection."); }


        /// Fail to clear the current [instance][ImmutableConcurrentNavigableCollection]
        ///
        /// @throws UnsupportedMethodException The method is not supported
        @Contract(ALWAYS_FAIL_0)
        @Override default void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable ConcurrentCollection."); }


        /// Fail to remove a `value` in the current [instance][ImmutableConcurrentNavigableCollection]
        ///
        /// @param value The (_never used_) element to remove
        /// @throws UnsupportedMethodException The method is not supported
        @Contract(ALWAYS_FAIL_1)
        @Override default boolean remove(final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable ConcurrentCollection."); }

        /// Fail to remove the `values` in the current [instance][ImmutableConcurrentNavigableCollection]
        ///
        /// @param values The (_never used_) elements to remove
        /// @throws UnsupportedMethodException The method is not supported
        @Contract(ALWAYS_FAIL_1)
        @Override default boolean removeAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “removeAll” is not supported in an immutable ConcurrentCollection."); }

        /// Fail to remove anything to the current [instance][ImmutableConcurrentNavigableCollection]
        ///
        /// @param filter The (_never used_) predicate
        /// @throws UnsupportedMethodException The method is not supported
        @Contract(ALWAYS_FAIL_1)
        @Override default boolean removeIf(final @Nullable Predicate<? super @Nullable T> filter) { throw new UnsupportedMethodException("The method “removeIf” is not supported in an immutable ConcurrentCollection."); }

        /// Fail to keep the `values` in the current [instance][ImmutableConcurrentNavigableCollection]
        ///
        /// @param values The (_never used_) values to keep
        /// @throws UnsupportedMethodException The method is not supported
        @Contract(ALWAYS_FAIL_1)
        @Override default boolean retainAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “retainAll” is not supported in an immutable ConcurrentCollection."); }

        //#endregion -------------------- Unsupported methods --------------------

}
