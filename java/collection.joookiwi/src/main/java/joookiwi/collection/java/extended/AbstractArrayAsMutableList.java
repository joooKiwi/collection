package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;
import joookiwi.collection.java.extended.iterator.ArrayAsMutableListIterator;
import joookiwi.collection.java.extended.iterator.MutableListIterator;
import org.jetbrains.annotations.ApiStatus.Experimental;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

@NotNullByDefault
public abstract class AbstractArrayAsMutableList<T extends @Nullable Object>
        extends AbstractArrayAsMutableSequencedCollection<T>
        implements MutableList<T>,
                   RandomAccess {

    //#region -------------------- Inner class --------------------

    /// An internal class for [AbstractArrayAsMutableList] to mutate the reference
    /// when the instance also mutates its reference
    protected static class ArrayAsMutableListIteratorAdaptor<T extends @Nullable Object,
            INSTANCE extends AbstractArrayAsMutableList<T>>
            extends ArrayAsMutableListIterator<T>
            implements ArrayMutator<T> {

        private final INSTANCE __instance;

        public ArrayAsMutableListIteratorAdaptor(final INSTANCE instance,
                                                 final T[] reference,
                                                 final int currentIndex) {
            super(reference, currentIndex);
            __instance = instance;
        }

        public ArrayAsMutableListIteratorAdaptor(final INSTANCE instance,
                                                 final T[] reference) { this(instance, reference, INITIAL_CURRENT_INDEX); }

        @Override protected void _array(final T[] value) { setReference(value); }

        protected INSTANCE _instance() { return __instance; }

        @Override public void setReference(final T[] value) {
            _instance()._synchronizeAndSetReference(value);
            super._array(value);
        }

    }

    //#endregion -------------------- Inner class --------------------
    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsMutableList() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Override public T get(final int index) { return UtilityForArray.get(_reference(), index); }

    @Override public @Range(from = -1, to = MAX_INT_VALUE) int indexOf(final @Nullable Object element) { return UtilityForArray.firstIndexOf(_reference(), element); }

    @Override public @Range(from = -1, to = MAX_INT_VALUE) int lastIndexOf(final @Nullable Object element) { return UtilityForArray.lastIndexOf(_reference(), element); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Set methods --------------------

    @Contract(mutates = "this")
    @Override public T set(final int index, final T value) { return UtilityForMutableArray.set(_reference(), index, value); }

    //#endregion -------------------- Set methods --------------------
    //#region -------------------- Add methods --------------------

    @Contract(mutates = "this")
    @Override public void add(final int index, final T value) { _reference(UtilityForMutableArray.add(_reference(), index, value)); }

    @Contract(mutates = "this")
    @Override public boolean addAll(final int index, final @Unmodifiable Collection<? extends T> values) {
        final var reference = _reference();
        final var newArray = UtilityForMutableArray.addAll(reference, index, values);
        if (reference != newArray)
            return false;
        _reference(newArray);
        return true;
    }

    //#endregion -------------------- Add methods --------------------
    //#region -------------------- Remove methods --------------------

    @Contract(mutates = "this")
    @Override public T remove(final int index) {
        final var reference = _reference();
        final var newArray = UtilityForMutableArray.removeAt(reference, index);
        _reference(newArray);
        return reference[index];
    }

    //#endregion -------------------- Remove methods --------------------
    //#region -------------------- Replace methods --------------------

    @Contract(mutates = "this")
    @Override public void replaceAll(final UnaryOperator<T> operator) { UtilityForMutableArray.replaceAll(_reference(), operator); }

    //#endregion -------------------- Replace methods --------------------
    //#region -------------------- As subdivided methods --------------------

    @Experimental
    @Override public MutableList<T> subList(final int from, final int to) { return UtilityForMutableArray.asSubdivided(this, _reference(), from, to); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Override public MutableList<T> reversed() { return new ReversedArrayAsMutableList<>(this, _addMutator(new ReversedMutableArrayAdaptor<>(this, _reference()))); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Sort methods --------------------

    @Contract(mutates = "this")
    @Override public void sort(final @Nullable Comparator<? super T> comparator) { UtilityForMutableArray.sort(_reference(), comparator); }

    //#endregion -------------------- Sort methods --------------------
    //#region -------------------- Conversion methods --------------------

    @Override public MutableListIterator<T> listIterator() { return _addMutator(new ArrayAsMutableListIteratorAdaptor<>(this, _reference())); }

    @Override public MutableListIterator<T> listIterator(final int index) { return _addMutator(new ArrayAsMutableListIteratorAdaptor<>(this, _reference(), index)); }

    //#endregion -------------------- Conversion methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractArrayAsMutableList<T> clone() { return (AbstractArrayAsMutableList<T>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- Comparison methods --------------------

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof List<?> otherConverted))
            return false;
        if (size() != otherConverted.size())
            return false;
        return containsAll(otherConverted);
    }

    //#endregion -------------------- Comparison methods --------------------

    //#endregion -------------------- Methods --------------------

}
