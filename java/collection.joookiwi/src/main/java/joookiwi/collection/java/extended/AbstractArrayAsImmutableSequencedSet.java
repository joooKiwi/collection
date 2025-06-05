package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.SequencedSet;
import java.util.function.Predicate;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.jetbrains.annotations.UnmodifiableView;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

/// A definition of an immutable [SequencedSet] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsImmutableSequencedSet
/// @see ReversedArrayAsImmutableSequencedSet
@NotNullByDefault
public abstract class AbstractArrayAsImmutableSequencedSet<T extends @Nullable Object>
        extends AbstractArrayAsImmutableSet<T>
        implements SequencedSet<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableSequencedSet() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Get methods --------------------

    @Override public T getFirst() { return UtilityForArray.getFirst(_reference()); }

    @Override public T getLast() { return UtilityForArray.getLast(_reference()); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Override public @UnmodifiableView SequencedSet<T> reversed() { return UtilityForArray.asReversed(this, _reference()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Clone methods --------------------

    @Override public abstract AbstractArrayAsImmutableSequencedSet<T> clone();

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [instance][SequencedSet]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable SequencedSet."); }

    /// Fail to add a `value` to the current [instance][SequencedSet]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(final @Nullable T value) { throw new UnsupportedMethodException("The method “addFirst” is not supported in an immutable SequencedSet."); }

    /// Fail to add a `value` to the current [instance][SequencedSet]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(final @Nullable T value) { throw new UnsupportedMethodException("The method “addLast” is not supported in an immutable SequencedSet."); }

    /// Fail to add the `values` in the current [instance][SequencedSet]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable SequencedSet."); }


    /// Fail to clear the current [instance][SequencedSet]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable SequencedSet."); }


    /// Fail to remove a `value` in the current [instance][SequencedSet]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable SequencedSet."); }

    /// Fail to remove the 1<sup>st</sup> value in the current [instance][SequencedSet]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedMethodException("The method “removeFirst” is not supported in an immutable SequencedSet."); }

    /// Fail to remove the last value in the current [instance][SequencedSet]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedMethodException("The method “removeLast” is not supported in an immutable SequencedSet."); }

    /// Fail to remove the `values` in the current [instance][SequencedSet]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “removeAll” is not supported in an immutable SequencedSet."); }

    /// Fail to remove anything to the current [instance][SequencedSet]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super @Nullable T> filter) { throw new UnsupportedMethodException("The method “removeIf” is not supported in an immutable SequencedSet."); }

    /// Fail to keep the `values` in the current [instance][SequencedSet]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “retainAll” is not supported in an immutable SequencedSet."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
