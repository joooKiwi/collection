package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.SequencedSet;
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

import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_LOAD_FACTOR;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A mutable behaviour of a [LinkedHashSet]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableLinkedHashSet<T extends @Nullable Object>
        extends LinkedHashSet<T>
        implements MutableSequencedSet<T> {

    @Serial private static final long serialVersionUID = 6804011349926330091L;

    //#region -------------------- Sub class --------------------

    /// A view of a subdivided or reversed [MutableTreeSet]
    ///
    /// @param <T> The type
    @NotNullByDefault
    private static final class MutableLinkedHashSetView<T extends @Nullable Object>
            extends MutableTreeSet<T> {

        //#region -------------------- Fields --------------------

        @Serial private static final long serialVersionUID = 8978271227979986336L;

        private final SequencedSet<T> __reference;

        //#endregion -------------------- Fields --------------------
        //#region -------------------- Constructor --------------------

        public MutableLinkedHashSetView(final SequencedSet<T> reference) {
            super();
            __reference = reference;
        }

        //#endregion -------------------- Constructor --------------------
        //#region -------------------- Methods --------------------

        //#region -------------------- Size methods --------------------

        @Contract(pure = true)
        @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return __reference.size(); }

        @Contract(pure = true)
        @Override public boolean isEmpty() { return __reference.isEmpty(); }

        //#endregion -------------------- Size methods --------------------
        //#region -------------------- Get methods --------------------

        @Contract(pure = true)
        @Override public T getFirst() { return __reference.getFirst(); }

        @Contract(pure = true)
        @Override public T getLast() { return __reference.getLast(); }

        //#endregion -------------------- Get methods --------------------
        //#region -------------------- Add methods --------------------

        @Contract(mutates = "this")
        @Override public boolean add(final T value) { return __reference.add(value); }

        @Contract(mutates = "this")
        @Override public void addFirst(final T value) { __reference.addFirst(value); }

        @Contract(mutates = "this")
        @Override public void addLast(final T value) { __reference.addLast(value); }


        @Contract(mutates = "this")
        @Override public boolean addAll(final @Unmodifiable Collection<? extends T> values) { return __reference.addAll(values); }

        //#endregion -------------------- Add methods --------------------
        //#region -------------------- Remove methods --------------------

        @Contract(mutates = "this")
        @Override public T removeFirst() { return __reference.removeFirst(); }

        @Contract(mutates = "this")
        @Override public T removeLast() { return __reference.removeLast(); }


        @Contract(mutates = "this")
        @Override public boolean remove(final @Nullable Object value) { return __reference.remove(value); }


        @Contract(mutates = "this")
        @Override public boolean removeAll(final Collection<? extends @Nullable Object> values) { return __reference.removeAll(values); }


        @Contract(mutates = "this")
        @Override public boolean removeIf(final Predicate<? super T> filter) { return __reference.removeIf(filter); }

        //#endregion -------------------- Remove methods --------------------
        //#region -------------------- Retain methods --------------------

        @Contract(mutates = "this")
        @Override public boolean retainAll(final Collection<?> values) { return __reference.retainAll(values); }

        //#endregion -------------------- Retain methods --------------------
        //#region -------------------- Clear methods --------------------

        @Contract(mutates = "this")
        @Override public void clear() { super.clear(); }

        //#endregion -------------------- Clear methods --------------------
        //#region -------------------- Has methods --------------------

        @Contract(pure = true)
        @Override public boolean contains(final @Nullable Object value) { return __reference.contains(value); }

        @Contract(pure = true)
        @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return __reference.containsAll(values); }

        //#endregion -------------------- Has methods --------------------
        //#region -------------------- For each methods --------------------

        @Override public void forEach(final Consumer<? super T> action) { __reference.forEach(action); }

        //#endregion -------------------- For each methods --------------------
        //#region -------------------- As reverse methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override public MutableLinkedHashSetView<T> reversed() { return new MutableLinkedHashSetView<>(__reference.reversed()); }

        //#endregion -------------------- As reverse methods --------------------
        //#region -------------------- Iterator methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override public MutableIterator<T> iterator() { return new IteratorAsMutableIterator<>(__reference.iterator()); }

        @Contract(value = ALWAYS_NEW_0, pure = true)
        @Override public Spliterator<T> spliterator() { return __reference.spliterator(); }

        //#endregion -------------------- Iterator methods --------------------
        //#region -------------------- To array methods --------------------

        @Contract(pure = true)
        @Override public @Nullable Object[] toArray() { return __reference.toArray(); }

        @Override public <U extends @Nullable Object> U[] toArray(final U[] newArray) { return __reference.toArray(newArray); }

        @Contract(ALWAYS_NEW_1)
        @Override public <U extends @Nullable Object> U[] toArray(final IntFunction<U[]> generator) { return __reference.toArray(generator); }

        //#endregion -------------------- To array methods --------------------
        //#region -------------------- Stream methods --------------------

        @Contract(value = ALWAYS_NEW_0, pure = true)
        @Override public Stream<T> stream() { return __reference.stream(); }

        @Contract(value = ALWAYS_NEW_0, pure = true)
        @Override public Stream<T> parallelStream() { return __reference.parallelStream(); }

        //#endregion -------------------- Stream methods --------------------
        //#region -------------------- Clone methods --------------------

        @MustBeInvokedByOverriders
        @Contract(ALWAYS_NEW_0)
        @Override public MutableLinkedHashSetView<T> clone() { return (MutableLinkedHashSetView<T>) super.clone(); }

        //#endregion -------------------- Clone methods --------------------
        //#region -------------------- To string methods --------------------

        @Override public String toString() { return __reference.toString(); }

        //#endregion -------------------- To string methods --------------------

        //#endregion -------------------- Methods --------------------

    }

    //#endregion -------------------- Sub class --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [LinkedHashSet] that starts empty
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableLinkedHashSet() { super(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- initialCapacity --------------------

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` received
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_INT_VALUE) byte initialCapacity) { super(initialCapacity, DEFAULT_LOAD_FACTOR); }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Byte initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, DEFAULT_LOAD_FACTOR); }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` received
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_INT_VALUE) short initialCapacity) { super(initialCapacity, DEFAULT_LOAD_FACTOR); }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Short initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, DEFAULT_LOAD_FACTOR); }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` received
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_INT_VALUE) int initialCapacity) { super(initialCapacity, DEFAULT_LOAD_FACTOR); }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, DEFAULT_LOAD_FACTOR); }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- initialCapacity, loadFactor --------------------

    /// Create a mutable instance of [LinkedHashSet] with the `initialCapacity` and the `loadFactor`received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_INT_VALUE) byte initialCapacity,
                                final float loadFactor) { super(initialCapacity, loadFactor); }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Byte initialCapacity,
                                final float loadFactor) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, loadFactor); }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_INT_VALUE) byte initialCapacity,
                                final @Nullable Float loadFactor) { super(initialCapacity, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor); }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Byte initialCapacity,
                                final @Nullable Float loadFactor) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor); }


    /// Create a mutable instance of [LinkedHashSet] with the `initialCapacity` and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_INT_VALUE) short initialCapacity,
                                final float loadFactor) { super(initialCapacity, loadFactor); }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Short initialCapacity,
                                final float loadFactor) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, loadFactor); }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_INT_VALUE) short initialCapacity,
                                final @Nullable Float loadFactor) { super(initialCapacity, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor); }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Short initialCapacity,
                                final @Nullable Float loadFactor) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor); }


    /// Create a mutable instance of [LinkedHashSet] with the `initialCapacity` and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_INT_VALUE) int initialCapacity,
                                final float loadFactor) { super(initialCapacity, loadFactor); }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer initialCapacity,
                                final float loadFactor) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, loadFactor); }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_INT_VALUE) int initialCapacity,
                                final @Nullable Float loadFactor) { super(initialCapacity, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor); }

    /// Create a mutable instance of [LinkedHashSet]
    /// with the `initialCapacity` (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` or the `loadFactor` was negative
    public MutableLinkedHashSet(final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer initialCapacity,
                                final @Nullable Float loadFactor) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor); }

    //#endregion -------------------- initialCapacity, loadFactor --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [LinkedHashSet]
    /// with the capacity of the `values.length`
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableLinkedHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super(values.length, DEFAULT_LOAD_FACTOR);
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
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values, loadFactor --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return super.size(); }

    @Override public boolean isEmpty() { return super.isEmpty(); }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Override public T getFirst() { return super.getFirst(); }

    @Override public T getLast() { return super.getLast(); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Add methods --------------------

    @Contract(mutates = "this")
    @Override public boolean add(final T value) { return super.add(value); }

    @Contract(mutates = "this")
    @Override public void addFirst(final T value) { super.addFirst(value); }

    @Contract(mutates = "this")
    @Override public void addLast(final T value) { super.addLast(value); }


    @Contract(mutates = "this")
    @Override public boolean addAll(final @Unmodifiable Collection<? extends T> values) { return super.addAll(values); }

    //#endregion -------------------- Add methods --------------------
    //#region -------------------- Remove methods --------------------

    @Contract(mutates = "this")
    @Override public T removeFirst() { return super.removeFirst(); }

    @Contract(mutates = "this")
    @Override public T removeLast() { return super.removeLast(); }


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
    //#region -------------------- As reverse methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public MutableTreeSet<T> reversed() { return new MutableLinkedHashSetView<>(super.reversed()); }

    //#endregion -------------------- As reverse methods --------------------
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
    @Override public MutableLinkedHashSet<T> clone() {
        try {
            return (MutableLinkedHashSet<T>) super.clone();
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
