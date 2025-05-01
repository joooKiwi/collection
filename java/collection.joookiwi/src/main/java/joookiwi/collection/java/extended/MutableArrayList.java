package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.ArrayList;
import java.util.Collection;
import joookiwi.collection.java.helper.NumberComparator;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A mutable behaviour of a [ArrayList]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableArrayList<T extends @Nullable Object>
        extends ArrayList<T> {

    @Serial private static final long serialVersionUID = 3159025709828425131L;

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [ArrayList] that starts empty
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    public MutableArrayList() { super(DEFAULT_INITIAL_CAPACITY); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- initialCapacity --------------------

    /// Create a mutable instance of [ArrayList]
    /// with the `initialCapacity` received
    public MutableArrayList(final byte initialCapacity) { super(NumberComparator.getInstance().max(initialCapacity, 0)); }

    /// Create a mutable instance of [ArrayList]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    public MutableArrayList(final @Nullable Byte initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : NumberComparator.getInstance().max(initialCapacity.byteValue(), 0)); }

    /// Create a mutable instance of [ArrayList]
    /// with the `initialCapacity` received
    public MutableArrayList(final short initialCapacity) { super(NumberComparator.getInstance().max(initialCapacity, 0)); }

    /// Create a mutable instance of [ArrayList]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    public MutableArrayList(final @Nullable Short initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : NumberComparator.getInstance().max(initialCapacity.shortValue(), 0)); }

    /// Create a mutable instance of [ArrayList]
    /// with the `initialCapacity` received
    public MutableArrayList(final int initialCapacity) { super(initialCapacity); }

    /// Create a mutable instance of [ArrayList]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    public MutableArrayList(final @Nullable Integer initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : NumberComparator.getInstance().max(initialCapacity.intValue(), 0)); }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [ArrayList]
    /// with the initial capacity as the `values.length`
    public MutableArrayList(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values) {
        super(values.length);
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            set(index, values[index]);
    }

    /// Create a mutable instance of [ArrayList]
    /// with the initial capacity as <code>values.[size][Collection#size()]</code>
    public MutableArrayList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(values.size());
        if (values.isEmpty())
            return;
        addAll(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, initialCapacity --------------------

    /// Create a mutable instance of [ArrayList]
    /// with the largest value between the `initialCapacity` and the `values.length`
    public MutableArrayList(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                            final byte initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length));
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            set(index, values[index]);
    }

    /// Create a mutable instance of [ArrayList]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// (if null provided, then it is the `values.length`)
    public MutableArrayList(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                            final @Nullable Byte initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length));
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            set(index, values[index]);
    }

    /// Create a mutable instance of [ArrayList]
    /// with the largest value between the `initialCapacity` and the `values.length`
    public MutableArrayList(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                            final short initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length));
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            set(index, values[index]);
    }

    /// Create a mutable instance of [ArrayList]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// (if null provided, then it is the `values.length`)
    public MutableArrayList(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                            final @Nullable Short initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length));
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            set(index, values[index]);
    }

    /// Create a mutable instance of [ArrayList]
    /// with the largest value between the `initialCapacity` and the `values.length`
    public MutableArrayList(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                            final int initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length));
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            set(index, values[index]);
    }

    /// Create a mutable instance of [ArrayList]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// (if null provided, then it is the `values.length`)
    public MutableArrayList(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                            final @Nullable Integer initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length));
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            set(index, values[index]);
    }


    /// Create a mutable instance of [ArrayList]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    public MutableArrayList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                            final byte initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()));
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [ArrayList]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// (if null provided, then it is the <code>values.[size][Collection#size()]</code>)
    public MutableArrayList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                            final @Nullable Byte initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()));
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [ArrayList]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    public MutableArrayList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                            final short initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()));
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [ArrayList]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// (if null provided, then it is the <code>values.[size][Collection#size()]</code>)
    public MutableArrayList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                            final @Nullable Short initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()));
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [ArrayList]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    public MutableArrayList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                            final int initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()));
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [ArrayList]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// (if null provided, then it is the <code>values.[size][Collection#size()]</code>)
    public MutableArrayList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                            final @Nullable Integer initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()));
        if (values.isEmpty())
            return;
        addAll(values);
    }

    //#endregion -------------------- values, initialCapacity --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @Contract(ALWAYS_NEW_0)
    @SuppressWarnings("unchecked cast")
    @Override public MutableArrayList<T> clone() { return new MutableArrayList<>((ArrayList<T>) super.clone()); }

    //#endregion -------------------- Methods --------------------

}
