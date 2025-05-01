package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.HashSet;
import joookiwi.collection.java.helper.NumberComparator;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_LOAD_FACTOR;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A mutable behaviour of a [HashSet]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableHashSet<T extends @Nullable Object>
        extends HashSet<T> {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = -3785694475957286791L;

    private final float __loadFactor;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [HashSet] that starts empty
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet() {
        super(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- initialCapacity --------------------

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final byte initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, 0), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final @Nullable Byte initialCapacity) {
        super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : NumberComparator.getInstance().max(initialCapacity.byteValue(), 0), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final short initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, 0), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final @Nullable Short initialCapacity) {
        super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : NumberComparator.getInstance().max(initialCapacity.shortValue(), 0), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final int initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, 0), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final @Nullable Integer initialCapacity) {
        super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : NumberComparator.getInstance().max(initialCapacity.intValue(), 0), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
    }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- initialCapacity, loadFactor --------------------

    /// Create a mutable instance of [HashSet] with the `initialCapacity` and the `loadFactor`received
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final byte initialCapacity,
                          final float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, 0), loadFactor);
        __loadFactor = loadFactor;
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final byte initialCapacity,
                          final @Nullable Float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, 0), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final @Nullable Byte initialCapacity,
                          final float loadFactor) {
        super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : NumberComparator.getInstance().max(initialCapacity.byteValue(), 0), loadFactor);
        __loadFactor = loadFactor;
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final @Nullable Byte initialCapacity,
                          final @Nullable Float loadFactor) {
        super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : NumberComparator.getInstance().max(initialCapacity.byteValue(), 0), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
    }


    /// Create a mutable instance of [HashSet] with the `initialCapacity` and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final short initialCapacity,
                          final float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, 0), loadFactor);
        __loadFactor = loadFactor;
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final short initialCapacity,
                          final @Nullable Float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, 0), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final @Nullable Short initialCapacity,
                          final float loadFactor) {
        super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : NumberComparator.getInstance().max(initialCapacity.shortValue(), 0), loadFactor);
        __loadFactor = loadFactor;
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final @Nullable Short initialCapacity,
                          final @Nullable Float loadFactor) {
        super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : NumberComparator.getInstance().max(initialCapacity.shortValue(), 0), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
    }


    /// Create a mutable instance of [HashSet] with the `initialCapacity` and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final int initialCapacity,
                          final float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, 0), loadFactor);
        __loadFactor = loadFactor;
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final int initialCapacity,
                          final @Nullable Float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, 0), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final @Nullable Integer initialCapacity,
                          final float loadFactor) {
        super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : NumberComparator.getInstance().max(initialCapacity.intValue(), 0), loadFactor);
        __loadFactor = loadFactor;
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final @Nullable Integer initialCapacity,
                          final @Nullable Float loadFactor) {
        super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : NumberComparator.getInstance().max(initialCapacity.intValue(), 0), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
    }

    //#endregion -------------------- initialCapacity, loadFactor --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [HashSet]
    /// with the capacity of the `values.length`
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values) {
        super(values.length, DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the capacity of <code>values.[size][Collection#size()]</code>
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(values.size(), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, initialCapacity --------------------

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                          final byte initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                          final @Nullable Byte initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                          final short initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                          final @Nullable Short initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                          final int initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                          final @Nullable Integer initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }


    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final byte initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final @Nullable Byte initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final short initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final @Nullable Short initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final int initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final @Nullable Integer initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values, initialCapacity --------------------
    //#region -------------------- values, initialCapacity, loadFactor --------------------

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                          final byte initialCapacity,
                          final float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), loadFactor);
        __loadFactor = loadFactor;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                          final byte initialCapacity,
                          final @Nullable Float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                          final @Nullable Byte initialCapacity,
                          final float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), loadFactor);
        __loadFactor = loadFactor;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                          final @Nullable Byte initialCapacity,
                          final @Nullable Float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                          final short initialCapacity,
                          final float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), loadFactor);
        __loadFactor = loadFactor;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                          final short initialCapacity,
                          final @Nullable Float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                          final @Nullable Short initialCapacity,
                          final float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), loadFactor);
        __loadFactor = loadFactor;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                          final @Nullable Short initialCapacity,
                          final @Nullable Float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                          final int initialCapacity,
                          final float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), loadFactor);
        __loadFactor = loadFactor;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                          final int initialCapacity,
                          final @Nullable Float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                          final @Nullable Integer initialCapacity,
                          final float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), loadFactor);
        __loadFactor = loadFactor;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                          final @Nullable Integer initialCapacity,
                          final @Nullable Float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }


    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final byte initialCapacity,
                          final float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), loadFactor);
        __loadFactor = loadFactor;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final byte initialCapacity,
                          final @Nullable Float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final @Nullable Byte initialCapacity,
                          final float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), loadFactor);
        __loadFactor = loadFactor;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final @Nullable Byte initialCapacity,
                          final @Nullable Float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final short initialCapacity,
                          final float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), loadFactor);
        __loadFactor = loadFactor;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final short initialCapacity,
                          final @Nullable Float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final @Nullable Short initialCapacity,
                          final float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), loadFactor);
        __loadFactor = loadFactor;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final @Nullable Short initialCapacity,
                          final @Nullable Float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final int initialCapacity,
                          final float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), loadFactor);
        __loadFactor = loadFactor;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final int initialCapacity,
                          final @Nullable Float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final @Nullable Integer initialCapacity,
                          final float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), loadFactor);
        __loadFactor = loadFactor;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final @Nullable Integer initialCapacity,
                          final @Nullable Float loadFactor) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values, initialCapacity, loadFactor --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @Contract(ALWAYS_NEW_0)
    @SuppressWarnings("unchecked cast")
    @Override public MutableHashSet<T> clone() { return new MutableHashSet<>((HashSet<T>) super.clone(), (Integer) null, __loadFactor); }

    //#endregion -------------------- Methods --------------------

}
