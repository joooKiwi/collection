package joookiwi.collection.java.extended;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import joookiwi.collection.java.exception.UnexpectedCloneableExceptionThrownError;
import joookiwi.collection.java.extended.iterator.ArrayAsMutableIterator;
import joookiwi.collection.java.extended.iterator.MutableIterator;
import joookiwi.collection.java.helper.HashCodeCreator;
import joookiwi.collection.java.method.ForEach;
import joookiwi.collection.java.method.ToArray;
import joookiwi.collection.java.method.ToString;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyArray;
import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static joookiwi.collection.java.method.Has.has;
import static joookiwi.collection.java.method.HasAll.hasAll;

/// A definition of an [MutableCollection] to have a common ancestor.
/// This class is similar to [java.util.AbstractCollection] but for array specifically.
///
/// @param <T> The type
/// @see ArrayAsMutableCollection
@NotNullByDefault
public abstract class AbstractArrayAsMutableCollection<T extends @Nullable Object>
        implements MutableCollection<T> {

    //#region -------------------- Inner class --------------------

    /// A generalized adaptor for to synchronize a reference with mutation behaviour
    ///
    /// @param <T> The type
    protected static interface ArrayMutator<T extends @Nullable Object> {

        /// Change the reference of the adaptor
        ///
        /// @param value The reference to change
        void setReference(T[] value);

    }

    /// An internal class for [AbstractArrayAsMutableCollection] to mutate the reference
    /// when the iterator also mutate the same reference
    ///
    /// @param <T>        The type
    /// @param <INSTANCE> The instance type
    protected static class ArrayAsMutableIteratorAdaptor<T extends @Nullable Object,
            INSTANCE extends AbstractArrayAsMutableCollection<T>>
            extends ArrayAsMutableIterator<T>
            implements ArrayMutator<T> {

        private final INSTANCE __instance;

        public ArrayAsMutableIteratorAdaptor(final INSTANCE instance,
                                             final T[] reference) {
            super(reference, INITIAL_CURRENT_INDEX);
            __instance = instance;
        }

        @Override protected void _array(final T[] value) { setReference(value); }

        protected INSTANCE _instance() { return __instance; }

        @Override public void setReference(final T[] value) {
            _instance()._synchronizeAndSetReference(value);
            super._array(value);
        }

    }

    //#endregion -------------------- Inner class --------------------
    //#region -------------------- Fields --------------------

    private boolean __isDuringReferenceSynchronization;
    private WeakReference<ArrayMutator<T>>[] __references = emptyArray();

    private static final Predicate<WeakReference<?>> NULL_REFERENCES = it -> it.get() == null;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsMutableCollection() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter / setter methods --------------------

    /// The reference to do calculation and retrieval
    protected abstract T[] _reference();

    /// Change the reference to do calculation and retrieval
    protected abstract void _reference(T[] value);

    /// Add the instance to the references followed when doing its synchronization
    ///
    /// @param value      The instance to add to the synchronization
    /// @param <INSTANCE> The instance that can mutate the {@link #_reference()}
    protected <INSTANCE extends ArrayMutator<T>> INSTANCE _addMutator(final INSTANCE value) {
        __references = UtilityForMutableArray.addToLast(__references, new WeakReference<>(value));
        return value;
    }

    /// Change the reference while synchronizing the mutating references
    ///
    /// @param value The new array to synchronize
    protected void _synchronizeAndSetReference(final T @Unmodifiable [] value) {
        if (__isDuringReferenceSynchronization)
            return; // We ignore the setting if we are during the synchronization on the other references

        __isDuringReferenceSynchronization = true;
        _reference(value);

        // We traverse through the weak references that have been created from this instance
        final var references = this.__references;
        if (references.length == 0) {
            __isDuringReferenceSynchronization = false;
            return; // We have nothing to do when we have no references
        }

        ForEach.forEach(references, it -> {
            final var reference = it.get();
            if (reference != null)
                reference.setReference(value);
        });

        __isDuringReferenceSynchronization = false;
        // We remove the unnecessary references
        this.__references = UtilityForMutableArray.removeIf(references, NULL_REFERENCES);
    }

    //#endregion -------------------- Getter / setter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return _reference().length; }

    @Contract(pure = true)
    @Override public boolean isEmpty() { return size() == 0; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has methods --------------------

    @Override public boolean contains(final @Nullable Object value) { return has(_reference(), value); }

    @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return hasAll(_reference(), values); }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- Add methods --------------------

    @Contract(value = ALWAYS_TRUE_1, mutates = "this")
    @Override public boolean add(final @Nullable T value) {
        _reference(UtilityForMutableArray.addToLast(_reference(), value));
        return true;
    }

    @Contract(mutates = "this")
    @Override public boolean addAll(final @Unmodifiable Collection<? extends T> values) {
        final var reference = _reference();
        final var newArray = UtilityForMutableArray.addAll(reference, values);
        if (reference != newArray)
            return false;
        _reference(newArray);
        return true;
    }

    //#endregion -------------------- Add methods --------------------
    //#region -------------------- Clear methods --------------------

    @Contract(mutates = "this")
    @Override public void clear() { _reference(emptyArray()); }

    //#endregion -------------------- Clear methods --------------------
    //#region -------------------- Remove methods --------------------

    @Contract(mutates = "this")
    @Override public boolean remove(final @Nullable Object value) {
        final var reference = _reference();
        final var newArray = UtilityForMutableArray.remove(reference, value);
        if (reference != newArray)
            return false;
        _reference(newArray);
        return true;
    }

    @Contract(mutates = "this")
    @Override public boolean removeAll(final @Unmodifiable Collection<? extends @Nullable Object> values) {
        final var reference = _reference();
        final var newArray = UtilityForMutableArray.removeAll(reference, values);
        if (reference != newArray)
            return false;
        _reference(newArray);
        return true;
    }

    @Contract(mutates = "this")
    @Override public boolean removeIf(final Predicate<? super T> filter) {
        final var reference = _reference();
        final var newArray = UtilityForMutableArray.removeIf(reference, filter);
        if (reference != newArray)
            return false;
        _reference(newArray);
        return true;
    }

    //#endregion -------------------- Remove methods --------------------
    //#region -------------------- Retain methods --------------------

    @Contract(mutates = "this")
    @Override public boolean retainAll(final @Unmodifiable Collection<? extends @Nullable Object> values) {
        final var reference = _reference();
        final var newArray = UtilityForMutableArray.retainAll(reference, values);
        if (reference != newArray)
            return false;
        _reference(newArray);
        return true;
    }

    //#endregion -------------------- Retain methods --------------------
    //#region -------------------- For each methods --------------------

    @Override public void forEach(final Consumer<? super T> action) { ForEach.forEach(_reference(), action); }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public MutableIterator<T> iterator() { return _addMutator(new ArrayAsMutableIteratorAdaptor<>(this, _reference())); }

    @Override public Spliterator<T> spliterator() { return Arrays.spliterator(_reference()); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- To array methods --------------------

    @Contract(pure = true)
    @Override public @Nullable Object[] toArray() { return ToArray.toArray(_reference()); }

    @SuppressWarnings("unchecked cast")
    @Contract(value = ALWAYS_1ST_1, mutates = "param1")
    @Override public <U extends @Nullable Object> U[] toArray(final U[] newArray) {
        final var reference = _reference();
        final var size = newArray.length;
        var index = -1;
        while(++index < size)
            newArray[index] = (U) reference[index];
        return newArray;
    }

    @SuppressWarnings("unchecked cast")
    @Contract(ALWAYS_NEW_1)
    @Override public <U extends @Nullable Object> U[] toArray(final IntFunction<U[]> generator) {
        final var reference = _reference();
        final var newArray = generator.apply(0);
        final var size = newArray.length;
        var index = -1;
        while(++index < size)
            newArray[index] = (U) reference[index];
        return newArray;
    }

    //#endregion -------------------- To array methods --------------------
    //#region -------------------- Stream methods --------------------

    @Override public Stream<T> stream() { return Arrays.stream(_reference()); }

    @Override public Stream<T> parallelStream() { return StreamSupport.stream(Arrays.spliterator(_reference()), true); }

    //#endregion -------------------- Stream methods --------------------
    //#region -------------------- Comparison methods --------------------

    @Override public int hashCode() { return HashCodeCreator.getInstance().newHashCode(_reference()); }

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof Collection<?> otherConverted))
            return false;
        if (size() != otherConverted.size())
            return false;
        return containsAll(otherConverted);
    }

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @SuppressWarnings("unchecked cast")
    @MustBeInvokedByOverriders
    @Override public AbstractArrayAsMutableCollection<T> clone() {
        try {
            return (AbstractArrayAsMutableCollection<T>) super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new UnexpectedCloneableExceptionThrownError(getClass(), exception);
        }
    }

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- To string methods --------------------

    @Override public String toString() { return ToString.toString(_reference()); }

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Methods --------------------

}
