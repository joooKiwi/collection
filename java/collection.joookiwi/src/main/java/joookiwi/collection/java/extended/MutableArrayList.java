package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.ArrayList;
import java.util.Collection;
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

    @Serial private static final long serialVersionUID = 5882521604946086928L;

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [ArrayList] that starts empty
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    public MutableArrayList() { super(DEFAULT_INITIAL_CAPACITY); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- initialCapacity --------------------

    /// Create a mutable instance of [ArrayList]
    /// with the `initialCapacity` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableArrayList(final @Range(from = 0, to = Byte.MAX_VALUE) byte initialCapacity) { super(initialCapacity); }

    /// Create a mutable instance of [ArrayList]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableArrayList(final @Range(from = 0, to = Byte.MAX_VALUE) @Nullable Byte initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity); }

    /// Create a mutable instance of [ArrayList]
    /// with the `initialCapacity` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableArrayList(final @Range(from = 0, to = Short.MAX_VALUE) short initialCapacity) { super(initialCapacity); }

    /// Create a mutable instance of [ArrayList]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableArrayList(final @Range(from = 0, to = Short.MAX_VALUE) @Nullable Short initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity); }

    /// Create a mutable instance of [ArrayList]
    /// with the `initialCapacity` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableArrayList(final @Range(from = 0, to = Integer.MAX_VALUE) int initialCapacity) { super(initialCapacity); }

    /// Create a mutable instance of [ArrayList]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableArrayList(final @Range(from = 0, to = Integer.MAX_VALUE) @Nullable Integer initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity); }

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
                            final @Range(from = 0, to = Byte.MAX_VALUE) byte initialCapacity) {
        super(initialCapacity < values.length ? values.length : initialCapacity);
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
                            final @Range(from = 0, to = Byte.MAX_VALUE) @Nullable Byte initialCapacity) {
        super(initialCapacity == null ? values.length : initialCapacity < values.length ? values.length : initialCapacity);
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
                            final @Range(from = 0, to = Short.MAX_VALUE) short initialCapacity) {
        super(initialCapacity < values.length ? values.length : initialCapacity);
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
                            final @Range(from = 0, to = Short.MAX_VALUE) @Nullable Short initialCapacity) {
        super(initialCapacity == null ? values.length : initialCapacity < values.length ? values.length : initialCapacity);
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
                            final @Range(from = 0, to = Integer.MAX_VALUE) int initialCapacity) {
        super(initialCapacity < values.length ? values.length : initialCapacity);
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
                            final @Range(from = 0, to = Integer.MAX_VALUE) @Nullable Integer initialCapacity) {
        super(initialCapacity == null ? values.length : initialCapacity < values.length ? values.length : initialCapacity);
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
                            final @Range(from = 0, to = Byte.MAX_VALUE) byte initialCapacity) {
        super(initialCapacity < values.size() ? values.size() : initialCapacity);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [ArrayList]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// (if null provided, then it is the <code>values.[size][Collection#size()]</code>)
    public MutableArrayList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                            final @Range(from = 0, to = Byte.MAX_VALUE) @Nullable Byte initialCapacity) {
        super(initialCapacity == null ? values.size() : initialCapacity < values.size() ? values.size() : initialCapacity);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [ArrayList]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    public MutableArrayList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                            final @Range(from = 0, to = Short.MAX_VALUE) short initialCapacity) {
        super(initialCapacity < values.size() ? values.size() : initialCapacity);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [ArrayList]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// (if null provided, then it is the <code>values.[size][Collection#size()]</code>)
    public MutableArrayList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                            final @Range(from = 0, to = Short.MAX_VALUE) @Nullable Short initialCapacity) {
        super(initialCapacity == null ? values.size() : initialCapacity < values.size() ? values.size() : initialCapacity);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [ArrayList]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    public MutableArrayList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                            final @Range(from = 0, to = Integer.MAX_VALUE) int initialCapacity) {
        super(initialCapacity < values.size() ? values.size() : initialCapacity);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [ArrayList]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// (if null provided, then it is the <code>values.[size][Collection#size()]</code>)
    public MutableArrayList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                            final @Range(from = 0, to = Integer.MAX_VALUE) @Nullable Integer initialCapacity) {
        super(initialCapacity == null ? values.size() : initialCapacity < values.size() ? values.size() : initialCapacity);
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
