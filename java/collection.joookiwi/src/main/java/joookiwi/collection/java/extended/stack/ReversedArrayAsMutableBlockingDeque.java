package joookiwi.collection.java.extended.stack;

import java.util.Collection;
import java.util.function.Predicate;

import joookiwi.collection.java.extended.ReversedArray;
import joookiwi.collection.java.extended.ReversedMutableArray;
import joookiwi.collection.java.extended.UtilityForMutableArray;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyArray;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// An implementation of a reversed-order [MutableBlockingDeque] similar to the [ArrayAsMutableBlockingDeque] in its behaviour.
///
/// Note that `null` is **NOT** permitted in this instance
/// /// due to the [java.util.concurrent.BlockingDeque] declaration.
///
/// The instance uses the [methods][joookiwi.collection.java.method]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T>               The type
/// @param <SOURCE>          The original source of the instance
///                          (generally a [ArrayAsMutableBlockingDeque] or [ReversedArrayAsMutableBlockingDeque])
/// @param <REVERSED_ARRAY>> The array that should contain the new reference
/// @see ArrayAsMutableBlockingDeque
@NotNullByDefault
public class ReversedArrayAsMutableBlockingDeque<T,
        SOURCE extends MutableBlockingDeque<T>,
        REVERSED_ARRAY extends ReversedMutableArray<T>>
        extends AbstractArrayAsMutableBlockingDeque<T> {

    //#region -------------------- Fields --------------------

    private final SOURCE __source;
    private final REVERSED_ARRAY __reversedArray;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public ReversedArrayAsMutableBlockingDeque(final SOURCE source,
                                               final REVERSED_ARRAY reversedArray) {
        super();
        __source = source;
        __reversedArray = reversedArray;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter / setter methods --------------------

    /// The source passed through the constructor
    @Contract(pure = true)
    protected SOURCE _source() { return __source; }

    /// The [ReversedArray] passed through the constructor
    @Contract(pure = true)
    protected REVERSED_ARRAY _reversedArray() { return __reversedArray; }

    /// The internal referenced generated from the [reversed-array][#_reversedArray] [source][ReversedArray#reversedSource]
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
    //#region -------------------- Add methods --------------------

    @Contract(value = ALWAYS_TRUE_1, mutates = "this")
    @Override public boolean add(final T value) {
        final var reversedArray = _reversedArray();
        reversedArray.source(UtilityForMutableArray.addToFirst(reversedArray.source(), value));
        return true;
    }

    @Contract(mutates = "this")
    @Override public void addFirst(final T value) {
        final var reversedArray = _reversedArray();
        reversedArray.source(UtilityForMutableArray.addToLast(reversedArray.source(), value));
    }

    @Contract(mutates = "this")
    @Override public void addLast(final T value) {
        final var reversedArray = _reversedArray();
        reversedArray.source(UtilityForMutableArray.addToFirst(reversedArray.source(), value));
    }


    @Contract(mutates = "this")
    @Override public boolean addAll(final @Unmodifiable Collection<? extends T> values) {
        final var reversedArray = _reversedArray();
        final var source = reversedArray.source();
        final var newArray = UtilityForMutableArray.join(source, values);
        if (source != newArray)
            return false;
        reversedArray.source(newArray);
        return true;
    }

    //#endregion -------------------- Add methods --------------------
    //#region -------------------- Clear methods --------------------

    @Contract(mutates = "this")
    @Override public void clear() { _reversedArray().source(emptyArray()); }

    //#endregion -------------------- Clear methods --------------------
    //#region -------------------- Remove methods --------------------

    @Contract(mutates = "this")
    @Override public boolean remove(final @Nullable Object value) {
        final var reversedArray = _reversedArray();
        final var source = reversedArray.source();
        final var newArray = UtilityForMutableArray.remove(source, value);
        if (source != newArray)
            return false;
        reversedArray.source(newArray);
        return true;
    }

    @Contract(mutates = "this")
    @Override public T removeFirst() {
        final var reversedArray = _reversedArray();
        final var source = reversedArray.source();
        final var newArray = UtilityForMutableArray.removeLast(source);
        reversedArray.source(newArray);
        return source[source.length - 1];
    }

    @Contract(mutates = "this")
    @Override public T removeLast() {
        final var reversedArray = _reversedArray();
        final var source = reversedArray.source();
        final var newArray = UtilityForMutableArray.removeFirst(source);
        reversedArray.source(newArray);
        return source[0];
    }


    @Contract(mutates = "this")
    @Override public boolean removeAll(final @Unmodifiable Collection<? extends @Nullable Object> values) {
        final var reversedArray = _reversedArray();
        final var source = reversedArray.source();
        final var newArray = UtilityForMutableArray.removeAll(source, values);
        if (source != newArray)
            return false;
        reversedArray.source(newArray);
        return true;
    }


    @Contract(mutates = "this")
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) {
        final var reversedArray = _reversedArray();
        final var source = reversedArray.source();
        final var newArray = UtilityForMutableArray.removeIf(source, filter);
        if (source != newArray)
            return false;
        reversedArray.source(newArray);
        return true;
    }

    //#endregion -------------------- Remove methods --------------------
    //#region -------------------- Retain methods --------------------

    @Contract(mutates = "this")
    @Override public boolean retainAll(final @Unmodifiable Collection<? extends @Nullable Object> values) {
        final var reversedArray = _reversedArray();
        final var source = reversedArray.source();
        final var newArray = UtilityForMutableArray.retainAll(source, values);
        if (source != newArray)
            return false;
        reversedArray.source(newArray);
        return true;
    }

    //#endregion -------------------- Retain methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Override public SOURCE reversed() { return _source(); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ReversedArrayAsMutableBlockingDeque<T, SOURCE, REVERSED_ARRAY> clone() { return (ReversedArrayAsMutableBlockingDeque<T, SOURCE, REVERSED_ARRAY>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
