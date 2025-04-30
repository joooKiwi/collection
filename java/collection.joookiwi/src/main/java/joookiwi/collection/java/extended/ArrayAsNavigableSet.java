package joookiwi.collection.java.extended;

import java.util.Comparator;
import joookiwi.collection.java.helper.ComparatorHelper;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Integer.MAX_VALUE;

/// A bare-bone implementation of a [java NavigableSet][java.util.NavigableSet]
/// with the [immutability][Unmodifiable] in place.
/// During its creation, it <u>implies</u> that the array received has no duplicate.
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method] and [ComparatorHelper]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T> The type
/// @see SubArrayAsNavigableSet
/// @see ReversedArrayAsNavigableSet
@NotNullByDefault
public class ArrayAsNavigableSet<T extends @Nullable Object>
        extends AbstractArrayAsNavigableSet<T> {

    //#region -------------------- Fields --------------------

    private final T[] __reference;
    private final @Nullable Comparator<? super T> __comparator;

    private final int __size;
    private final boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    /// Create an instance of a [java.util.NavigableSet] but allowing `null` in the `reference`.
    /// It also has by default its natural ordering.
    ///
    /// @param reference The array to be the internal structure
    public ArrayAsNavigableSet(final T[] reference) {
        super();
        __comparator = null;
        if (__isEmpty = (__size = (__reference = reference).length) == 0)
            return;
        _hashCode = 0; }

    /// Create an instance of a [java.util.NavigableSet] but allowing `null` in the `reference`
    /// using a `comparator` to compare its values
    ///
    /// @param reference  The array to be the internal structure
    /// @param comparator The [Comparator] to use on its comparisons
    public ArrayAsNavigableSet(final T[] reference, final @Nullable Comparator<? super T> comparator) {
        super();
        __comparator = comparator;
        if (__isEmpty = (__size = (__reference = reference).length) == 0)
            return;
        _hashCode = 0;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    /// The internal reference passed through the constructor
    @Override protected T[] _reference() { return __reference; }

    @Contract(pure = true)
    @Override public @Range(from = 0, to = MAX_VALUE) int size() { return __size; }

    @Contract(pure = true)
    @Override public boolean isEmpty() { return __isEmpty; }

    @Contract(pure = true)
    @Override public @Nullable Comparator<? super T> comparator() { return __comparator; }

    @Override public ArrayAsNavigableSet<T> clone() { return new ArrayAsNavigableSet<>(_reference().clone(), comparator()); }

    //#endregion -------------------- Methods --------------------

}
