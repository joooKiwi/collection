package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.HashSet;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import joookiwi.collection.java.exception.UnexpectedCloneableExceptionThrownError;
import joookiwi.collection.java.extended.iterator.IteratorAsMutableIterator;
import joookiwi.collection.java.extended.iterator.MutableIterator;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Float.isNaN;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_LOAD_FACTOR;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_SMALL_LOAD_FACTOR;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static joookiwi.collection.java.helper.NumberComparator.max;

/// A mutable behaviour of a [HashSet]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableHashSet<T extends @Nullable Object>
        extends HashSet<T>
        implements MutableSet<T> {

    @Serial private static final long serialVersionUID = -2384944121390432222L;

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [HashSet] that starts empty
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet() { super(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- initialCapacity --------------------

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received (_capped to be over `0`_)
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final byte initialCapacity) { super(max(initialCapacity, 0), DEFAULT_LOAD_FACTOR); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received (_capped to be over `0` or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final @Nullable Byte initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : max(initialCapacity.byteValue(), 0), DEFAULT_LOAD_FACTOR); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received (_capped to be over `0`_)
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final short initialCapacity) { super(max(initialCapacity, 0), DEFAULT_LOAD_FACTOR); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received (_capped to be over `0` or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final @Nullable Short initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : max(initialCapacity.shortValue(), 0), DEFAULT_LOAD_FACTOR); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received (_capped to be over `0`_)
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final int initialCapacity) { super(max(initialCapacity, 0), DEFAULT_LOAD_FACTOR); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received (_capped to be over `0` or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final @Nullable Integer initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : max(initialCapacity.intValue(), 0), DEFAULT_LOAD_FACTOR); }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- initialCapacity, loadFactor --------------------

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_capped to be over `0`_)
    /// and the `loadFactor`received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was [NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final byte initialCapacity,
                          final float loadFactor) { super(max(initialCapacity, 0), isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_capped to be over `0` or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was [NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Nullable Byte initialCapacity,
                          final float loadFactor) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : max(initialCapacity.byteValue(), 0), isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_capped to be over `0`_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final byte initialCapacity,
                          final @Nullable Float loadFactor) { super(max(initialCapacity, 0), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_capped to be over `0` or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]_)
    public MutableHashSet(final @Nullable Byte initialCapacity,
                          final @Nullable Float loadFactor) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : max(initialCapacity.byteValue(), 0), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor); }


    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_capped to be over `0`_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was [NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final short initialCapacity,
                                final float loadFactor) { super(max(initialCapacity, 0), isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_capped to be over `0` or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was [NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Nullable Short initialCapacity,
                          final float loadFactor) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : max(initialCapacity.shortValue(), 0), isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_capped to be over `0`_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final short initialCapacity,
                          final @Nullable Float loadFactor) { super(max(initialCapacity, 0), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_capped to be over `0` or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Nullable Short initialCapacity,
                          final @Nullable Float loadFactor) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : max(initialCapacity.shortValue(), 0), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor); }


    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_capped to be over `0`_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was [NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final int initialCapacity,
                          final float loadFactor) { super(max(initialCapacity, 0), isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_capped to be over `0` or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was [NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Nullable Integer initialCapacity,
                          final float loadFactor) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : max(initialCapacity.intValue(), 0), isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_capped to be over `0`_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final int initialCapacity,
                          final @Nullable Float loadFactor) { super(max(initialCapacity, 0), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_capped to be over `0` or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]_)
    public MutableHashSet(final @Nullable Integer initialCapacity,
                          final @Nullable Float loadFactor) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : max(initialCapacity.intValue(), 0), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor); }

    //#endregion -------------------- initialCapacity, loadFactor --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [HashSet]
    /// with the capacity of the `values.length`
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        final var size = values.length;
        super(size, DEFAULT_LOAD_FACTOR);
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the capacity of <code>values.[size()][Collection#size()]</code>
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(values.size(), DEFAULT_LOAD_FACTOR);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, loadFactor --------------------

    /// Create a mutable instance of [HashSet]
    /// with the capacity of the `values.length`
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was or [NaN][Float#NaN]_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                          final float loadFactor) {
        final var size = values.length;
        super(size, isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the capacity of the `values.length`
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                          final @Nullable Float loadFactor) {
        final var size = values.length;
        super(size, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            add(values[index]);
    }


    /// Create a mutable instance of [HashSet]
    /// with the capacity of <code>values.[size()][Collection#size()]</code>
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was or [NaN][Float#NaN]_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final float loadFactor) {
        super(values.size(), isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the capacity of <code>values.[size()][Collection#size()]</code>
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was negative
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final @Nullable Float loadFactor) {
        super(values.size(), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    //#endregion -------------------- values, loadFactor --------------------
    //#region -------------------- values, initialCapacity, loadFactor --------------------

    /// Create a mutable instance of [MutableHashSet]
    /// with the `initialCapacity` (_or `values.length` if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was [NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                          final byte initialCapacity,
                          final float loadFactor) {
        final var size = values.length;
        super(max(initialCapacity, size), isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            add(values[index]);
    }

    /// Create a mutable instance of [MutableHashSet]
    /// with the `initialCapacity` (_or `values.length` if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                          final byte initialCapacity,
                          final @Nullable Float loadFactor) {
        final var size = values.length;
        super(max(initialCapacity, size), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            add(values[index]);
    }

    /// Create a mutable instance of [MutableHashSet]
    /// with the `initialCapacity` (_or `values.length` if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was [NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                          final @Nullable Byte initialCapacity,
                          final float loadFactor) {
        final var size = values.length;
        super(max(initialCapacity, size), isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or `values.length` if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                          final @Nullable Byte initialCapacity,
                          final @Nullable Float loadFactor) {
        final var size = values.length;
        super(max(initialCapacity, size), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or `values.length` if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was [NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                          final short initialCapacity,
                          final float loadFactor) {
        final var size = values.length;
        super(max(initialCapacity, size), isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or `values.length` if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                          final short initialCapacity,
                          final @Nullable Float loadFactor) {
        final var size = values.length;
        super(max(initialCapacity, size), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or `values.length` if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was [NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                          final @Nullable Short initialCapacity,
                          final float loadFactor) {
        final var size = values.length;
        super(max(initialCapacity, size), isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or `values.length` if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                          final @Nullable Short initialCapacity,
                          final @Nullable Float loadFactor) {
        final var size = values.length;
        super(max(initialCapacity, size), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or `values.length` if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was [NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                          final int initialCapacity,
                          final float loadFactor) {
        final var size = values.length;
        super(max(initialCapacity, size), isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or `values.length` if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                          final int initialCapacity,
                          final @Nullable Float loadFactor) {
        final var size = values.length;
        super(max(initialCapacity, size), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or `values.length` if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was [NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                          final @Nullable Integer initialCapacity,
                          final float loadFactor) {
        final var size = values.length;
        super(max(initialCapacity, size), isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or `values.length` if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                          final @Nullable Integer initialCapacity,
                          final @Nullable Float loadFactor) {
        final var size = values.length;
        super(max(initialCapacity, size), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            add(values[index]);
    }


    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or <code>values.[size()][Collection#size()]</code> if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was [NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final byte initialCapacity,
                          final float loadFactor) {
        super(max(initialCapacity, values.size()), isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or <code>values.[size()][Collection#size()]</code> if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final byte initialCapacity,
                          final @Nullable Float loadFactor) {
        super(max(initialCapacity, values.size()), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or <code>values.[size()][Collection#size()]</code> if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was [NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final @Nullable Byte initialCapacity,
                          final float loadFactor) {
        super(max(initialCapacity, values.size()), isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or <code>values.[size()][Collection#size()]</code> if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final @Nullable Byte initialCapacity,
                          final @Nullable Float loadFactor) {
        super(max(initialCapacity, values.size()), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or <code>values.[size()][Collection#size()]</code> if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was [NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final short initialCapacity,
                          final float loadFactor) {
        super(max(initialCapacity, values.size()), isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or <code>values.[size()][Collection#size()]</code> if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final short initialCapacity,
                          final @Nullable Float loadFactor) {
        super(max(initialCapacity, values.size()), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or <code>values.[size()][Collection#size()]</code> if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was [NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final @Nullable Short initialCapacity,
                          final float loadFactor) {
        super(max(initialCapacity, values.size()), isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or <code>values.[size()][Collection#size()]</code> if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final @Nullable Short initialCapacity,
                          final @Nullable Float loadFactor) {
        super(max(initialCapacity, values.size()), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or <code>values.[size()][Collection#size()]</code> if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was [NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final int initialCapacity,
                          final float loadFactor) {
        super(max(initialCapacity, values.size()), isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or <code>values.[size()][Collection#size()]</code> if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final int initialCapacity,
                          final @Nullable Float loadFactor) {
        super(max(initialCapacity, values.size()), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or <code>values.[size()][Collection#size()]</code> if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was [NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final @Nullable Integer initialCapacity,
                          final float loadFactor) {
        super(max(initialCapacity, values.size()), isNaN(loadFactor) ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or <code>values.[size()][Collection#size()]</code> if it was larger_)
    /// and the `loadFactor` received (_[0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`|[NaN][Float#NaN]
    /// or [0.01][joookiwi.collection.java.CollectionConstants#DEFAULT_SMALL_LOAD_FACTOR] if it was `≤ 0`_)
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final @Nullable Integer initialCapacity,
                          final @Nullable Float loadFactor) {
        super(max(initialCapacity, values.size()), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor.isNaN() ? DEFAULT_LOAD_FACTOR : loadFactor <= 0.0F ? DEFAULT_SMALL_LOAD_FACTOR : loadFactor);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    //#endregion -------------------- values, initialCapacity, loadFactor --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return super.size(); }

    @Override public boolean isEmpty() { return super.isEmpty(); }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Add methods --------------------

    @Contract(mutates = "this")
    @Override public boolean add(final T value) { return super.add(value); }

    @Contract(mutates = "this")
    @Override public boolean addAll(final @Unmodifiable Collection<? extends T> values) { return super.addAll(values); }

    //#endregion -------------------- Add methods --------------------
    //#region -------------------- Remove methods --------------------

    @Contract(mutates = "this")
    @Override public boolean remove(final @Nullable Object value) { return super.remove(value); }

    @Contract(mutates = "this")
    @Override public boolean removeAll(final Collection<? extends @Nullable Object> values) { return super.removeAll(values); }

    @Contract(mutates = "this")
    @Override public boolean removeIf(final Predicate<? super T> filter) { return super.removeIf(filter); }

    //#endregion -------------------- Remove methods --------------------
    //#region -------------------- Retain methods --------------------

    @Contract(mutates = "this")
    @Override public boolean retainAll(final Collection<?> values) { return super.retainAll(values); }

    //#endregion -------------------- Retain methods --------------------
    //#region -------------------- Clear methods --------------------

    @Contract(mutates = "this")
    @Override public void clear() { super.clear(); }

    //#endregion -------------------- Clear methods --------------------
    //#region -------------------- Has methods --------------------

    @Override public boolean contains(final @Nullable Object value) { return super.contains(value); }

    @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return super.containsAll(values); }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- For each methods --------------------

    @Override public void forEach(final Consumer<? super T> action) { super.forEach(action); }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public MutableIterator<T> iterator() { return new IteratorAsMutableIterator<>(super.iterator()); }

    @Contract(ALWAYS_NEW_0)
    @Override public Spliterator<T> spliterator() { return super.spliterator(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- To array methods --------------------

    @Override public @Nullable Object[] toArray() { return super.toArray(); }

    @Override public <U extends @Nullable Object> U[] toArray(final U[] newArray) { return super.toArray(newArray); }

    @Contract(ALWAYS_NEW_1)
    @Override public <U extends @Nullable Object> U[] toArray(final IntFunction<U[]> generator) { return super.toArray(generator); }

    //#endregion -------------------- To array methods --------------------
    //#region -------------------- Stream methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public Stream<T> stream() { return super.stream(); }

    @Contract(ALWAYS_NEW_0)
    @Override public Stream<T> parallelStream() { return super.parallelStream(); }

    //#endregion -------------------- Stream methods --------------------
    //#region -------------------- Clone methods --------------------

    @SuppressWarnings("unchecked cast")
    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public MutableHashSet<T> clone() {
        try {
            return (MutableHashSet<T>) super.clone();
        } catch (InternalError error) {
            if (error.getCause() instanceof CloneNotSupportedException) // We only want a CloneNotSupportedException that have been thrown, not a similar exception
                throw new UnexpectedCloneableExceptionThrownError(getClass(), error);
            throw error;
        }
    }

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- To string methods --------------------

    @Override public String toString() { return super.toString(); }

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Methods --------------------

}
