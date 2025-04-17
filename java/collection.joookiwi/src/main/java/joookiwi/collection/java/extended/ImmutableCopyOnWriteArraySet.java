package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Predicate;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

/// An [immutable-like][Unmodifiable] behaviour of a [CopyOnWriteArraySet]
///
/// @param <T> The type of the element
@NotNullByDefault
public class ImmutableCopyOnWriteArraySet<T>
        extends CopyOnWriteArraySet<T> {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = -1143887041339012426L;

    private boolean __isInitialized = false;
    private int __size = -1;
    private boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty [immutable-like][Unmodifiable] instance of [CopyOnWriteArraySet]
    /// (similar to [java.util.Set#of()])
    /// with a load factor of [1][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    /// and a capacity of [0][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_INITIAL_CAPACITY]
    public ImmutableCopyOnWriteArraySet() {
        super();
        __size = 0;
        __isEmpty = true;
        __isInitialized = true;
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create an [immutable-like][Unmodifiable] instance of [CopyOnWriteArraySet]
    /// (similar to {@link java.util.Set#of(Object[])})
    /// with a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR]
    /// and the capacity is the `values.length`
    public ImmutableCopyOnWriteArraySet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values) {
        super();
        final var size = values.length;
        if (__isEmpty = size == 0) {
            __isInitialized = true;
            __size = 0;
            return;
        }
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [CopyOnWriteArraySet]
    /// (similar to [java.util.Set#copyOf(Collection)])
    /// with a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR]
    /// and the capacity is the <code>values.[size][Collection#size()]</code>
    public ImmutableCopyOnWriteArraySet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super();
        if (__isEmpty = values.isEmpty()) {
            __isInitialized = true;
            __size = 0;
            return;
        }
        super.addAll(values);
    }

    //#endregion -------------------- values --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    @Override public int size() {
        if (__isInitialized)
            return __size;

        final var value = __size = super.size();
        __isEmpty = value == 0;
        __isInitialized = true;
        return value;
    }

    @Override public boolean isEmpty() {
        if (__isInitialized)
            return __isEmpty;

        final var value = __isEmpty = (__size = super.size()) == 0;
        __isInitialized = true;
        return value;
    }

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [ImmutableCopyOnWriteArraySet]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable CopyOnWriteArraySet."); }

    /// Fail to add the `values` in the current [ImmutableCopyOnWriteArraySet]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable CopyOnWriteArraySet."); }


    /// Fail to clear the current [ImmutableCopyOnWriteArraySet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedOperationException("The method “clear” is not supported in an immutable CopyOnWriteArraySet."); }


    /// Fail to remove a `value` in the current [ImmutableCopyOnWriteArraySet]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable CopyOnWriteArraySet."); }

    /// Fail to remove the `values` in the current [ImmutableCopyOnWriteArraySet]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “removeAll” is not supported in an immutable CopyOnWriteArraySet."); }

    /// Fail to remove anything to the current [ImmutableCopyOnWriteArraySet]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedOperationException("The method “removeIf” is not supported in an immutable CopyOnWriteArraySet."); }


    /// Fail to keep the `values` in the current [ImmutableCopyOnWriteArraySet]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “retainAll” is not supported in an immutable CopyOnWriteArraySet."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
