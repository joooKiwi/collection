package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.function.Predicate;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

@NotNullByDefault
public interface ImmutableConcurrentCollection<T extends @Nullable Object>
        extends ImmutableCollection<T> {

        //#region -------------------- Unsupported methods --------------------

        /// Fail to add a `value` to the current [instance][ImmutableConcurrentCollection]
        ///
        /// @param value The (_never used_) element to add
        /// @throws UnsupportedMethodException The method is not supported
        @Contract(ALWAYS_FAIL_1)
        @Override default boolean add(final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable ConcurrentCollection."); }

        /// Fail to add the `values` in the current [instance][ImmutableConcurrentCollection]
        ///
        /// @param values The (_never used_) elements to add
        /// @throws UnsupportedMethodException The method is not supported
        @Contract(ALWAYS_FAIL_1)
        @Override default boolean addAll(final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable ConcurrentCollection."); }


        /// Fail to clear the current [instance][ImmutableConcurrentCollection]
        ///
        /// @throws UnsupportedMethodException The method is not supported
        @Contract(ALWAYS_FAIL_0)
        @Override default void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable ConcurrentCollection."); }


        /// Fail to remove a `value` in the current [instance][ImmutableConcurrentCollection]
        ///
        /// @param value The (_never used_) element to remove
        /// @throws UnsupportedMethodException The method is not supported
        @Contract(ALWAYS_FAIL_1)
        @Override default boolean remove(final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable ConcurrentCollection."); }

        /// Fail to remove the `values` in the current [instance][ImmutableConcurrentCollection]
        ///
        /// @param values The (_never used_) elements to remove
        /// @throws UnsupportedMethodException The method is not supported
        @Contract(ALWAYS_FAIL_1)
        @Override default boolean removeAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “removeAll” is not supported in an immutable ConcurrentCollection."); }

        /// Fail to remove anything to the current [instance][ImmutableConcurrentCollection]
        ///
        /// @param filter The (_never used_) predicate
        /// @throws UnsupportedMethodException The method is not supported
        @Contract(ALWAYS_FAIL_1)
        @Override default boolean removeIf(final @Nullable Predicate<? super @Nullable T> filter) { throw new UnsupportedMethodException("The method “removeIf” is not supported in an immutable ConcurrentCollection."); }

        /// Fail to keep the `values` in the current [instance][ImmutableConcurrentCollection]
        ///
        /// @param values The (_never used_) values to keep
        /// @throws UnsupportedMethodException The method is not supported
        @Contract(ALWAYS_FAIL_1)
        @Override default boolean retainAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “retainAll” is not supported in an immutable ConcurrentCollection."); }

        //#endregion -------------------- Unsupported methods --------------------

}
