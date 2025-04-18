package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.ArrayDeque;
import java.util.Collection;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;

/// A mutable behaviour of a [ArrayDeque]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableArrayDeque<T>
        extends ArrayDeque<T>
        implements BasicStack<T> {

    @Serial private static final long serialVersionUID = 5277029203307882850L;

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty mutable instance of [ArrayDeque]
    /// with a capacity of 1
    public MutableArrayDeque() {
        super(1);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- initialCapacity --------------------

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableArrayDeque(final @Range(from = 0, to = MAX_VALUE) byte initialCapacity) { super(initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableArrayDeque(final @Range(from = 0, to = MAX_VALUE) @Nullable Byte initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableArrayDeque(final @Range(from = 0, to = MAX_VALUE) short initialCapacity) { super(initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableArrayDeque(final @Range(from = 0, to = MAX_VALUE) @Nullable Short initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableArrayDeque(final @Range(from = 0, to = MAX_VALUE) int initialCapacity) { super(initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableArrayDeque(final @Range(from = 0, to = MAX_VALUE) @Nullable Integer initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity); }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [ArrayDeque]
    /// with a capacity as the `values.length` (or `1` if it is empty)
    public MutableArrayDeque(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values) {
        super(new ArrayAsCollection<>(values));
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with a capacity as the <code>values.[size][Collection#size()]</code> (or `1` if it is empty)
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(values);
    }

    //#endregion -------------------- values --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @Override public T getFirst() { return super.getFirst(); }

    @Override public T getLast() { return super.getLast(); }


    @Override public void addFirst(final T value) { super.addFirst(value); }

    @Override public void addLast(final T value) { super.addLast(value); }


    @Override public synchronized T pop() { return super.pop(); }

    @Override public T removeFirst() { return super.removeFirst(); }

    @Override public T removeLast() { return super.removeLast(); }

    //#endregion -------------------- Methods --------------------
}
