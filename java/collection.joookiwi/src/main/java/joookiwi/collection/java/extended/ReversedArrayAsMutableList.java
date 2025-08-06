package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyArray;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// An implementation of a reversed-order [List] similar to the [ArrayAsMutableList] in its behaviour.
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T>               The type
/// @param <SOURCE>          The original source of the instance
///                          (generally [ArrayAsMutableList])
/// @param <REVERSED_ARRAY>> The array that should contain the new reference
/// @see ArrayAsMutableList
@NotNullByDefault
public class ReversedArrayAsMutableList<T extends @Nullable Object,
        SOURCE extends @NotNull MutableList<T>,
        REVERSED_ARRAY extends ReversedMutableArray<T>>
        extends AbstractArrayAsMutableList<T> {

    //#region -------------------- Fields --------------------

    private final SOURCE __source;
    private final REVERSED_ARRAY __reversedArray;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public ReversedArrayAsMutableList(final SOURCE source,
                                      final REVERSED_ARRAY reversedArray) {
        __source = source;
        __reversedArray = reversedArray;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter / setter methods --------------------

    /// The source passed through the constructor
    @Contract(pure = true)
    protected SOURCE _source() { return __source; }

    /// The [ReversedMutableArray] passed through the constructor
    @Contract(pure = true)
    protected REVERSED_ARRAY _reversedArray() { return __reversedArray; }

    /// The internal referenced given from the [reversed-array][#_reversedArray] [source][ReversedMutableArray#reversedSource()]
    @Contract(ALWAYS_NEW_0)
    @Override protected T[] _reference() { return _reversedArray().reversedSource(); }

    /// Change the internal reference in the [reversed-array][#_reversedArray] [source][ReversedMutableArray#reversedSource(Object\[\])]
    ///
    /// @param value The value to reverse and put in replacement on internal reference
    @Override protected void _reference(final T @Unmodifiable [] value) { _reversedArray().reversedSource(value); }

    //#endregion -------------------- Getter / setter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return _reversedArray().source().length; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Set methods --------------------

    @Contract(mutates = "this")
    @Override public T set(final int index, final T value) {
        final var reversedArray = _reversedArray();
        final var source = reversedArray.source();
        return UtilityForMutableArray.set(source, source.length - index, value);
    }

    //#endregion -------------------- Set methods --------------------
    //#region -------------------- Add methods --------------------

    @Contract(value = ALWAYS_TRUE_1, mutates = "this")
    @Override public boolean add(final T value) {
        final var reversedArray = _reversedArray();
        reversedArray._source(UtilityForMutableArray.addToFirst(reversedArray.source(), value));
        return true;
    }

    @Contract(mutates = "this")
    @Override public void add(final int index, final T value) {
        final var reversedArray = _reversedArray();
        final var source = reversedArray.source();
        reversedArray._source(UtilityForMutableArray.add(source, source.length - index, value));
        super.add(index, value);
    }

    @Contract(mutates = "this")
    @Override public void addFirst(final T value) {
        final var reversedArray = _reversedArray();
        reversedArray._source(UtilityForMutableArray.addToLast(reversedArray.source(), value));
    }

    @Contract(mutates = "this")
    @Override public void addLast(final T value) {
        final var reversedArray = _reversedArray();
        reversedArray._source(UtilityForMutableArray.addToFirst(reversedArray.source(), value));
    }


    @Contract(mutates = "this")
    @Override public boolean addAll(final @Unmodifiable Collection<? extends T> values) {
        final var reversedArray = _reversedArray();
        final var source = reversedArray.source();
        final var newArray = UtilityForMutableArray.join(source, values);
        if (source != newArray)
            return false;
        reversedArray._source(newArray);
        return true;
    }

    @Contract(mutates = "this")
    @Override public boolean addAll(final int index, final @Unmodifiable Collection<? extends T> values) {
        final var reversedArray = _reversedArray();
        final var source = reversedArray.source();
        final var newArray = UtilityForMutableArray.addAll(source, source.length - index, UtilityForArray.toReversed(values));
        if (source != newArray)
            return false;
        reversedArray._source(newArray);
        return true;
    }

    //#endregion -------------------- Add methods --------------------
    //#region -------------------- Clear methods --------------------

    @Contract(mutates = "this")
    @Override public void clear() { _reversedArray()._source(emptyArray()); }

    //#endregion -------------------- Clear methods --------------------
    //#region -------------------- Remove methods --------------------

    @Contract(mutates = "this")
    @Override public boolean remove(final @Nullable Object value) {
        final var reversedArray = _reversedArray();
        final var source = reversedArray.source();
        final var newArray = UtilityForMutableArray.remove(source, value);
        if (source != newArray)
            return false;
        reversedArray._source(newArray);
        return true;
    }

    @Contract(mutates = "this")
    @Override public T remove(final int index) {
        final var reversedArray = _reversedArray();
        final var source = reversedArray.source();
        final var newArray = UtilityForMutableArray.removeAt(source, source.length - index);
        reversedArray._source(newArray);
        return source[index];
    }

    @Contract(mutates = "this")
    @Override public T removeFirst() {
        final var reversedArray = _reversedArray();
        final var source = reversedArray.source();
        final var newArray = UtilityForMutableArray.removeLast(source);
        reversedArray._source(newArray);
        return source[source.length - 1];
    }

    @Contract(mutates = "this")
    @Override public T removeLast() {
        final var reversedArray = _reversedArray();
        final var source = reversedArray.source();
        final var newArray = UtilityForMutableArray.removeFirst(source);
        reversedArray._source(newArray);
        return source[0];
    }


    @Contract(mutates = "this")
    @Override public boolean removeAll(final @Unmodifiable Collection<? extends @Nullable Object> values) {
        final var reversedArray = _reversedArray();
        final var source = reversedArray.source();
        final var newArray = UtilityForMutableArray.removeAll(source, values);
        if (source != newArray)
            return false;
        reversedArray._source(newArray);
        return true;
    }


    @Contract(mutates = "this")
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) {
        final var reversedArray = _reversedArray();
        final var source = reversedArray.source();
        final var newArray = UtilityForMutableArray.removeIf(source, filter);
        if (source != newArray)
            return false;
        reversedArray._source(newArray);
        return true;
    }

    //#endregion -------------------- Remove methods --------------------
    //#region -------------------- Replace methods --------------------

    @Contract(mutates = "this")
    @Override public void replaceAll(final UnaryOperator<T> operator) { UtilityForMutableArray.replaceAll(_reversedArray().source(), operator); }

    //#endregion -------------------- Replace methods --------------------
    //#region -------------------- Retain methods --------------------

    @Contract(mutates = "this")
    @Override public boolean retainAll(final @Unmodifiable Collection<? extends @Nullable Object> values) {
        final var reversedArray = _reversedArray();
        final var source = reversedArray.source();
        final var newArray = UtilityForMutableArray.retainAll(source, values);
        if (source != newArray)
            return false;
        reversedArray._source(newArray);
        return true;
    }

    //#endregion -------------------- Retain methods --------------------
    //#region -------------------- Sort methods --------------------

    @Contract(mutates = "this")
    @Override public void sort(final @Nullable Comparator<? super T> comparator) { UtilityForMutableArray.sort(_reversedArray().source(), comparator); }

    //#endregion -------------------- Sort methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Override public SOURCE reversed() { return _source(); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ReversedArrayAsMutableList<T, SOURCE, REVERSED_ARRAY> clone() { return (ReversedArrayAsMutableList<T, SOURCE, REVERSED_ARRAY>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
