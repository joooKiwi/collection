package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.ArrayDeque;
import java.util.Collection;
import joookiwi.collection.java.exception.UnexpectedCloneableExceptionThrownError;
import joookiwi.collection.java.helper.NumberComparator;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A mutable behaviour of a [ArrayDeque]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableArrayDeque<T>
        extends ArrayDeque<T>
        implements BasicStack<T> {

    @Serial private static final long serialVersionUID = -4901951039087361762L;

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty mutable instance of [ArrayDeque]
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    public MutableArrayDeque() { super(DEFAULT_INITIAL_CAPACITY); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- initialCapacity --------------------

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received
    public MutableArrayDeque(final byte initialCapacity) { super(initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    public MutableArrayDeque(final @Nullable Byte initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received
    public MutableArrayDeque(final short initialCapacity) { super(initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    public MutableArrayDeque(final @Nullable Short initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received
    public MutableArrayDeque(final int initialCapacity) { super(initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    public MutableArrayDeque(final @Nullable Integer initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity); }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [ArrayDeque]
    /// with an initial capacity as the `values.length`
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super(values.length);

        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            addLast(values[index]);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with an initial capacity as the <code>values.[size][Collection#size()]</code>
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, initialCapacity --------------------

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the `values.length`
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                             final byte initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length));

        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            addLast(values[index]);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// (if null provided, then it is the `values.length`)
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                             final @Nullable Byte initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length));

        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            addLast(values[index]);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the `values.length`
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                             final short initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length));

        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            addLast(values[index]);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// (if null provided, then it is the `values.length`)
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                             final @Nullable Short initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length));

        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            addLast(values[index]);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the `values.length`
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                             final int initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length));

        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            addLast(values[index]);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// (if null provided, then it is the `values.length`)
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                             final @Nullable Integer initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length));

        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            addLast(values[index]);
    }


    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                             final byte initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()));
        if (values.isEmpty())
            return;
        for (final var value : values)
            addLast(value);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// (if null provided, then it is the <code>values.[size][Collection#size()]</code>)
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                             final @Nullable Byte initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()));
        if (values.isEmpty())
            return;
        for (final var value : values)
            addLast(value);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                             final short initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()));
        if (values.isEmpty())
            return;
        for (final var value : values)
            addLast(value);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// (if null provided, then it is the <code>values.[size][Collection#size()]</code>)
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                             final @Nullable Short initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()));
        if (values.isEmpty())
            return;
        for (final var value : values)
            addLast(value);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                             final int initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()));
        if (values.isEmpty())
            return;
        for (final var value : values)
            addLast(value);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// (if null provided, then it is the <code>values.[size][Collection#size()]</code>)
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                             final @Nullable Integer initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()));
        if (values.isEmpty())
            return;
        for (final var value : values)
            addLast(value);
    }

    //#endregion -------------------- values, initialCapacity --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @Contract(pure = true)
    @Override public T getFirst() { return super.getFirst(); }

    @Contract(pure = true)
    @Override public T getLast() { return super.getLast(); }


    @Override public void addFirst(final T value) { super.addFirst(value); }

    @Override public void addLast(final T value) { super.addLast(value); }


    @Override public T pop() { return super.pop(); }

    @Override public T removeFirst() { return super.removeFirst(); }

    @Override public T removeLast() { return super.removeLast(); }


    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public MutableArrayDeque<T> clone() {
        try {
            return (MutableArrayDeque<T>) super.clone();
        } catch (AssertionError error) {
            if (error.getCause() == null) // We only want a CloneNotSupportedException that have been thrown, not a similar exception
                throw new UnexpectedCloneableExceptionThrownError(getClass(), error);
            throw error;
        }
    }

    //#endregion -------------------- Methods --------------------
}
