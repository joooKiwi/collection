package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.NavigableSet;
import java.util.function.Predicate;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import joookiwi.collection.java.extended.iterator.ImmutableIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

@NotNullByDefault
public interface ImmutableNavigableSet<T extends @Nullable Object>
        extends ImmutableSortedSet<T>,
                NavigableSet<T> {

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Get methods --------------------

    @Override @Nullable T floor(final T value);

    @Override @Nullable T lower(final T value);

    @Override @Nullable T ceiling(final T value);

    @Override @Nullable T higher(final T value);

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As subdivided methods --------------------

    @Override ImmutableNavigableSet<T> subSet(final T from, final boolean fromIsInclusive, final T to, final boolean toIsInclusive);

    @Override ImmutableNavigableSet<T> headSet(final T to, final boolean isInclusive);

    @Override ImmutableNavigableSet<T> tailSet(final T from, final boolean isInclusive);

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reversed methods --------------------

    @Override ImmutableNavigableSet<T> reversed();

    @Contract(pure = true)
    @Override ImmutableNavigableSet<T> descendingSet();

    //#endregion -------------------- As reversed methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override ImmutableIterator<T> descendingIterator();

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Clone methods --------------------

    @Override ImmutableNavigableSet<T> clone();

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [instance][NavigableSet]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean add(final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable NavigableSet."); }

    /// Fail to add a `value` to the current [instance][NavigableSet]
    ///
    /// @param value The (_never used_) element to add at the start
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void addFirst(final @Nullable T value) { throw new UnsupportedMethodException("The method “addFirst” is not supported in an immutable NavigableSet."); }

    /// Fail to add a `value` to the current [instance][NavigableSet]
    ///
    /// @param value The (_never used_) element to add at the end
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void addLast(final @Nullable T value) { throw new UnsupportedMethodException("The method “addLast” is not supported in an immutable NavigableSet."); }

    /// Fail to add the `values` in the current [instance][NavigableSet]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean addAll(final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable NavigableSet."); }


    /// Fail to clear the current [instance][NavigableSet]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable NavigableSet."); }


    /// Fail to remove a `value` in the current [instance][NavigableSet]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean remove(final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable NavigableSet."); }

    /// Fail to remove the first value in the current [instance][NavigableSet]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T removeFirst() { throw new UnsupportedMethodException("The method “removeFirst” is not supported in an immutable NavigableSet."); }

    /// Fail to retrieve and remove the first value in the current [instance][NavigableSet]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T pollFirst() { throw new UnsupportedMethodException("The method “pollFirst” is not supported in an immutable NavigableSet."); }

    /// Fail to remove the last value in the current [instance][NavigableSet]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T removeLast() { throw new UnsupportedMethodException("The method “removeLast” is not supported in an immutable NavigableSet."); }

    /// Fail to retrieve and remove the last value in the current [instance][NavigableSet]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T pollLast() { throw new UnsupportedMethodException("The method “pollLast” is not supported in an immutable NavigableSet."); }

    /// Fail to remove the `values` in the current [instance][NavigableSet]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “removeAll” is not supported in an immutable NavigableSet."); }

    /// Fail to remove anything to the current [instance][NavigableSet]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeIf(final @Nullable Predicate<? super @Nullable T> filter) { throw new UnsupportedMethodException("The method “removeIf” is not supported in an immutable NavigableSet."); }

    /// Fail to keep the `values` in the current [instance][NavigableSet]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean retainAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “retainAll” is not supported in an immutable NavigableSet."); }

    //#endregion -------------------- Unsupported methods --------------------

}
