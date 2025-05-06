package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static java.lang.Integer.MAX_VALUE;

/// A bare-bone implementation of a [java Collection][java.util.Deque]
/// with the [immutability][org.jetbrains.annotations.Unmodifiable] in place.
/// During its creation, it <u>implies</u> that the array received has no duplicate.
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T> The type
@NotNullByDefault
public class ArrayAsDeque<T extends @Nullable Object>
        extends AbstractArrayAsDeque<T> {

    //#region -------------------- Fields --------------------

    private final T[] __reference;

    private final int __size;
    private final boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    /// Create an instance of a [java.util.Deque] and allowing `null` in the `reference`
    ///
    /// @param reference The array to be the internal structure
    public ArrayAsDeque(final T[] reference) {
        super();
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

    @Override public ArrayAsDeque<T> clone() { return new ArrayAsDeque<>(_reference().clone()); }

    //#endregion -------------------- Methods --------------------

}
