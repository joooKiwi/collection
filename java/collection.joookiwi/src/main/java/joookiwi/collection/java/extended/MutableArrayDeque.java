package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.ArrayDeque;
import java.util.Collection;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;

/// A mutable behaviour of a [ArrayDeque]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableArrayDeque<T>
        extends ArrayDeque<T>
        implements BasicStack<T> {

    @Serial private static final long serialVersionUID = 1870490230614814883L;

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty mutable instance of [ArrayDeque]
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    public MutableArrayDeque() { super(DEFAULT_INITIAL_CAPACITY); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- initialCapacity --------------------

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received
    public MutableArrayDeque(final @Range(from = 0, to = Byte.MAX_VALUE) byte initialCapacity) { super(initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    public MutableArrayDeque(final @Range(from = 0, to = Byte.MAX_VALUE) @Nullable Byte initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received
    public MutableArrayDeque(final @Range(from = 0, to = Short.MAX_VALUE) short initialCapacity) { super(initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    public MutableArrayDeque(final @Range(from = 0, to = Short.MAX_VALUE) @Nullable Short initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received
    public MutableArrayDeque(final @Range(from = 0, to = Integer.MAX_VALUE) int initialCapacity) { super(initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    public MutableArrayDeque(final @Range(from = 0, to = Integer.MAX_VALUE) @Nullable Integer initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity); }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [ArrayDeque]
    /// with an initial capacity as the `values.length`
    public MutableArrayDeque(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values) {
        super(new ArrayAsCollection<>(values));
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
    public MutableArrayDeque(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                             final @Range(from = 0, to = Byte.MAX_VALUE) byte initialCapacity) {
        super(initialCapacity < values.length ? values.length : initialCapacity);

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
    public MutableArrayDeque(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                             final @Range(from = 0, to = Byte.MAX_VALUE) @Nullable Byte initialCapacity) {
        super(initialCapacity == null ? values.length : initialCapacity < values.length ? values.length : initialCapacity);

        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            addLast(values[index]);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the `values.length`
    public MutableArrayDeque(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                             final @Range(from = 0, to = Byte.MAX_VALUE) short initialCapacity) {
        super(initialCapacity < values.length ? values.length : initialCapacity);

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
    public MutableArrayDeque(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                             final @Range(from = 0, to = Byte.MAX_VALUE) @Nullable Short initialCapacity) {
        super(initialCapacity == null ? values.length : initialCapacity < values.length ? values.length : initialCapacity);

        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            addLast(values[index]);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the `values.length`
    public MutableArrayDeque(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                             final @Range(from = 0, to = Byte.MAX_VALUE) int initialCapacity) {
        super(initialCapacity < values.length ? values.length : initialCapacity);

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
    public MutableArrayDeque(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                             final @Range(from = 0, to = Byte.MAX_VALUE) @Nullable Integer initialCapacity) {
        super(initialCapacity == null ? values.length : initialCapacity < values.length ? values.length : initialCapacity);

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
                             final @Range(from = 0, to = Byte.MAX_VALUE) byte initialCapacity) {
        super(initialCapacity < values.size() ? values.size() : initialCapacity);
        if (values.isEmpty())
            return;
        for (final var value : values)
            addLast(value);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// (if null provided, then it is the <code>values.[size][Collection#size()]</code>)
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                             final @Range(from = 0, to = Byte.MAX_VALUE) @Nullable Byte initialCapacity) {
        super(initialCapacity == null ? values.size() : initialCapacity < values.size() ? values.size() : initialCapacity);
        if (values.isEmpty())
            return;
        for (final var value : values)
            addLast(value);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                             final @Range(from = 0, to = Short.MAX_VALUE) short initialCapacity) {
        super(initialCapacity < values.size() ? values.size() : initialCapacity);
        if (values.isEmpty())
            return;
        for (final var value : values)
            addLast(value);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// (if null provided, then it is the <code>values.[size][Collection#size()]</code>)
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                             final @Range(from = 0, to = Short.MAX_VALUE) @Nullable Short initialCapacity) {
        super(initialCapacity == null ? values.size() : initialCapacity < values.size() ? values.size() : initialCapacity);
        if (values.isEmpty())
            return;
        for (final var value : values)
            addLast(value);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                             final @Range(from = 0, to = Integer.MAX_VALUE) int initialCapacity) {
        super(initialCapacity < values.size() ? values.size() : initialCapacity);
        if (values.isEmpty())
            return;
        for (final var value : values)
            addLast(value);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// (if null provided, then it is the <code>values.[size][Collection#size()]</code>)
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                             final @Range(from = 0, to = Integer.MAX_VALUE) @Nullable Integer initialCapacity) {
        super(initialCapacity == null ? values.size() : initialCapacity < values.size() ? values.size() : initialCapacity);
        if (values.isEmpty())
            return;
        for (final var value : values)
            addLast(value);
    }

    //#endregion -------------------- values, initialCapacity --------------------

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
