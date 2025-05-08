package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_LOAD_FACTOR;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A mutable behaviour of a [LinkedHashSet]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableLinkedHashSet<T extends @Nullable Object>
        extends LinkedHashSet<T> {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = 299331378293604076L;

    private final float __loadFactor;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [LinkedHashSet] that starts empty
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableLinkedHashSet() {
        super(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- initialCapacity --------------------

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` received
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_VALUE) byte initialCapacity) {
        super(initialCapacity, DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
    }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_VALUE) @Nullable Byte initialCapacity) {
        super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
    }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` received
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_VALUE) short initialCapacity) {
        super(initialCapacity, DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
    }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_VALUE) @Nullable Short initialCapacity) {
        super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
    }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` received
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_VALUE) int initialCapacity) {
        super(initialCapacity, DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
    }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_VALUE) @Nullable Integer initialCapacity) {
        super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
    }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- initialCapacity, loadFactor --------------------

    /// Create a mutable instance of [LinkedHashSet] with the `initialCapacity` and the `loadFactor`received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_VALUE) byte initialCapacity,
                                final float loadFactor) {
        super(initialCapacity, loadFactor);
        __loadFactor = loadFactor;
    }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_VALUE) @Nullable Byte initialCapacity,
                                final float loadFactor) {
        super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, loadFactor);
        __loadFactor = loadFactor;
    }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_VALUE) byte initialCapacity,
                                final @Nullable Float loadFactor) {
        super(initialCapacity, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
    }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_VALUE) @Nullable Byte initialCapacity,
                                final @Nullable Float loadFactor) {
        super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
    }


    /// Create a mutable instance of [LinkedHashSet] with the `initialCapacity` and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_VALUE) short initialCapacity,
                                final float loadFactor) {
        super(initialCapacity, loadFactor);
        __loadFactor = loadFactor;
    }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_VALUE) @Nullable Short initialCapacity,
                                final float loadFactor) {
        super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, loadFactor);
        __loadFactor = loadFactor;
    }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_VALUE) short initialCapacity,
                                final @Nullable Float loadFactor) {
        super(initialCapacity, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
    }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_VALUE) @Nullable Short initialCapacity,
                                final @Nullable Float loadFactor) {
        super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
    }


    /// Create a mutable instance of [LinkedHashSet] with the `initialCapacity` and the `loadFactor` received
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_VALUE) int initialCapacity,
                                final float loadFactor) {
        super(initialCapacity, loadFactor);
        __loadFactor = loadFactor;
    }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_VALUE) @Nullable Integer initialCapacity,
                                final float loadFactor) {
        super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, loadFactor);
        __loadFactor = loadFactor;
    }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_VALUE) int initialCapacity,
                                final @Nullable Float loadFactor) {
        super(initialCapacity, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
    }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_VALUE) @Nullable Integer initialCapacity,
                                final @Nullable Float loadFactor) {
        super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
    }

    //#endregion -------------------- initialCapacity, loadFactor --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [LinkedHashSet]
    /// with the capacity of the `values.length`
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableLinkedHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super(values.length, DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the capacity of <code>values.[size][Collection#size()]</code>
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableLinkedHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(values.size(), DEFAULT_LOAD_FACTOR);
        __loadFactor = DEFAULT_LOAD_FACTOR;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, loadFactor --------------------

    /// Create a mutable instance of [LinkedHashSet]
    /// with the capacity of the `values.length`
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `loadFactor` was negative
    public MutableLinkedHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                final float loadFactor) {
        super(values.length, loadFactor);
        __loadFactor = loadFactor;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the capacity of the `values.length`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was negative
    public MutableLinkedHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                final @Nullable Float loadFactor) {
        super(values.length, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }


    /// Create a mutable instance of [LinkedHashSet]
    /// with the capacity of <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was negative
    public MutableLinkedHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                final float loadFactor) {
        super(values.size(), loadFactor);
        __loadFactor = loadFactor;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the capacity of <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was negative
    public MutableLinkedHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                final @Nullable Float loadFactor) {
        super(values.size(), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __loadFactor = loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor;
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values, loadFactor --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @Contract(ALWAYS_NEW_0)
    @SuppressWarnings("unchecked cast")
    @Override public MutableLinkedHashSet<T> clone() { return new MutableLinkedHashSet<>((HashSet<T>) super.clone(), __loadFactor); }

    //#endregion -------------------- Methods --------------------

}
