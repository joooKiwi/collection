package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.HashSet;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_LOAD_FACTOR;

/// A mutable behaviour of a [HashSet]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableHashSet<T>
        extends HashSet<T> {

    @Serial private static final long serialVersionUID = -8220050431323577746L;

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [HashSet] that start empty
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet() { super(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- initialCapacity --------------------

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableHashSet(final @Range(from = 0, to = MAX_VALUE) byte initialCapacity) { super(initialCapacity, DEFAULT_LOAD_FACTOR); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableHashSet(final @Range(from = 0, to = MAX_VALUE) @Nullable Byte initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, DEFAULT_LOAD_FACTOR); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableHashSet(final @Range(from = 0, to = MAX_VALUE) short initialCapacity) { super(initialCapacity, DEFAULT_LOAD_FACTOR); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableHashSet(final @Range(from = 0, to = MAX_VALUE) @Nullable Short initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, DEFAULT_LOAD_FACTOR); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableHashSet(final @Range(from = 0, to = MAX_VALUE) int initialCapacity) { super(initialCapacity, DEFAULT_LOAD_FACTOR); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableHashSet(final @Range(from = 0, to = MAX_VALUE) @Nullable Integer initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, DEFAULT_LOAD_FACTOR); }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- initialCapacity, loadFactor --------------------

    /// Create a mutable instance of [HashSet] with the `initialCapacity` and the `loadFactor`received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableHashSet(final @Range(from = 0, to = MAX_VALUE) byte initialCapacity,
                          final float loadFactor) { super(initialCapacity, loadFactor); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableHashSet(final @Range(from = 0, to = MAX_VALUE) @Nullable Byte initialCapacity,
                          final float loadFactor) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, loadFactor); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableHashSet(final @Range(from = 0, to = MAX_VALUE) byte initialCapacity,
                          final @Nullable Float loadFactor) { super(initialCapacity, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableHashSet(final @Range(from = 0, to = MAX_VALUE) @Nullable Byte initialCapacity,
                          final @Nullable Float loadFactor) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor); }


    /// Create a mutable instance of [HashSet] with the `initialCapacity` and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableHashSet(final @Range(from = 0, to = MAX_VALUE) short initialCapacity,
                          final float loadFactor) { super(initialCapacity, loadFactor); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableHashSet(final @Range(from = 0, to = MAX_VALUE) @Nullable Short initialCapacity,
                          final float loadFactor) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, loadFactor); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableHashSet(final @Range(from = 0, to = MAX_VALUE) short initialCapacity,
                          final @Nullable Float loadFactor) { super(initialCapacity, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableHashSet(final @Range(from = 0, to = MAX_VALUE) @Nullable Short initialCapacity,
                          final @Nullable Float loadFactor) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor); }


    /// Create a mutable instance of [HashSet] with the `initialCapacity` and the `loadFactor` received
    public MutableHashSet(final @Range(from = 0, to = MAX_VALUE) int initialCapacity,
                          final float loadFactor) { super(initialCapacity, loadFactor); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableHashSet(final @Range(from = 0, to = MAX_VALUE) @Nullable Integer initialCapacity,
                          final float loadFactor) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, loadFactor); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableHashSet(final @Range(from = 0, to = MAX_VALUE) int initialCapacity,
                          final @Nullable Float loadFactor) { super(initialCapacity, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor); }

    /// Create a mutable instance of [HashSet]
    /// with the `initialCapacity` (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableHashSet(final @Range(from = 0, to = MAX_VALUE) @Nullable Integer initialCapacity,
                          final @Nullable Float loadFactor) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor); }

    //#endregion -------------------- initialCapacity, loadFactor --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [HashSet]
    /// with the capacity of the `values.length`
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @NotNull @Unmodifiable [] values) {
        super(values.length, DEFAULT_LOAD_FACTOR);
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
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @NotNull @Unmodifiable Collection<? extends T> values) {
        super(values.size(), DEFAULT_LOAD_FACTOR);
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, loadFactor --------------------

    /// Create a mutable instance of [HashSet]
    /// with the capacity of the `values.length`
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `loadFactor` was negative
    public MutableHashSet(final T@Flow(sourceIsContainer = true, targetIsContainer = true)  @NotNull @Unmodifiable [] values,
                          final float loadFactor) {
        super(values.length, loadFactor);
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [HashSet]
    /// with the capacity of the `values.length`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was negative
    public MutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @NotNull @Unmodifiable [] values,
                          final @Nullable Float loadFactor) {
        super(values.length, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }


    /// Create a mutable instance of [HashSet]
    /// with the capacity of <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was negative
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @NotNull @Unmodifiable Collection<? extends T> values,
                          final float loadFactor) {
        super(values.size(), loadFactor);
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [HashSet]
    /// with the capacity of <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was negative
    public MutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @NotNull @Unmodifiable Collection<? extends T> values,
                          final @Nullable Float loadFactor) {
        super(values.size(), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values, loadFactor --------------------

}
