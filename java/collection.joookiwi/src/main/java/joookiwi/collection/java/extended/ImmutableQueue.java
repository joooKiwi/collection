package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Queue;
import java.util.function.Predicate;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

@NotNullByDefault
public interface ImmutableQueue<T extends @Nullable Object>
        extends ImmutableCollection<T>,
                Queue<T> {

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Get methods --------------------

    @Override T element();

    @Override @Nullable T peek();

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Clone methods --------------------

    @Override ImmutableQueue<T> clone();

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [instance][ImmutableQueue]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean add(final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable Queue."); }

    /// Fail to add the `values` in the current [instance][ImmutableQueue]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean addAll(final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable Queue."); }

    /// Fail to add a `value` to the current [instance][ImmutableQueue]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean offer(final @Nullable T value) { throw new UnsupportedMethodException("The method “offer” is not supported in an immutable Queue."); }

    /// Fail to remove and retrieve the head of the current [instance][ImmutableQueue]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T poll() { throw new UnsupportedMethodException("The method “poll” is not supported in an immutable Queue."); }


    /// Fail to clear the current [instance][ImmutableQueue]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable Queue."); }


    /// Fail to remove the head of the current [instance][ImmutableQueue]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T remove() { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable Queue."); }

    /// Fail to remove a `value` in the current [instance][ImmutableQueue]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean remove(final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable Queue."); }

    /// Fail to remove the `values` in the current [instance][ImmutableQueue]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “removeAll” is not supported in an immutable Queue."); }

    /// Fail to remove anything to the current [instance][ImmutableQueue]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeIf(final @Nullable Predicate<? super @Nullable T> filter) { throw new UnsupportedMethodException("The method “removeIf” is not supported in an immutable Queue."); }


    /// Fail to keep the `values` in the current [instance][ImmutableQueue]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean retainAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “retainAll” is not supported in an immutable Queue."); }

    //#endregion -------------------- Unsupported methods --------------------

}
