package joookiwi.collection.java.extended;

import joookiwi.collection.java.annotation.InitializedOnFirstCall;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

/// A container to reverse an array lazily via [#reversedSource]
///
/// @param <T> The type
/// @see ReversedArrayAsSequencedCollection
/// @see ReversedArrayAsList
/// @see ReversedArrayAsSequencedSet
/// @see ReversedArrayAsSortedSet
/// @see ReversedArrayAsNavigableSet
@NotNullByDefault
public class ReversedArray<T extends @Nullable Object> {

    //#region -------------------- Fields --------------------

    private final T[] __source;
    private T @Nullable [] __reversedSource;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    /// Create a new container from a source array
    ///
    /// @param source The array source to create a new [reversed-source][#reversedSource]
    public ReversedArray(final T[] source) { this.__source = source; }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    /// The original source received in the constructor
    @Contract(pure = true)
    public T[] source() { return __source; }

    ///  The new source that is created in reverse order.
    ///
    /// Note that it is lazily created and is kept within the current instance
    /// to not de-duplicate the creation of the sub-source.
    ///
    /// @implNote The array created should not be modified.
    /// It is only there to help referencing the source reversed.
    @InitializedOnFirstCall
    public T[] reversedSource() {
        final var value = __reversedSource;
        if (value != null)
            return value;

        final var source = source();
        final var size = source.length;
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size];
        var index = size;
        while (--index >= 0)
            newArray[index] = source[index];
        return __reversedSource = newArray;
    }

    //#endregion -------------------- Getter methods --------------------

}
