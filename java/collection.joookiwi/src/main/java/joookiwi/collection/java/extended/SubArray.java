package joookiwi.collection.java.extended;

import joookiwi.collection.java.annotation.InitializedOnFirstCall;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A container to create a subdivided array lazily via [#subSource]
///
/// @param <T> The type
/// @see SubArrayAsImmutableList
/// @see SubArrayAsImmutableSortedSet
/// @see SubArrayAsImmutableNavigableSet
@NotNullByDefault
public class SubArray<T extends @Nullable Object> {

    //#region -------------------- Fields --------------------

    private final T[] __source;
    private T @Nullable [] __subSource;
    private final @Range(from = 0, to = MAX_INT_VALUE) int __startingIndex;
    private final @Range(from = 0, to = MAX_INT_VALUE) int __endingIndex;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    /// Create a new container from a source array, a starting and ending index
    ///
    /// @param source        The array source to create a new [sub-source][#subSource]
    /// @param startingIndex The starting index that should be the beginning of the [sub-source][#subSource]
    /// @param endingIndex   The ending index that should be the end of the [sub-source][#subSource]
    public SubArray(final T[] source,
                    final @Range(from = 0, to = MAX_INT_VALUE) int startingIndex,
                    final @Range(from = 0, to = MAX_INT_VALUE) int endingIndex) {
        __source = source;
        __startingIndex = startingIndex;
        __endingIndex = endingIndex;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    /// The original source received in the constructor
    @Contract(pure = true)
    public T[] source() { return __source; }

    /// The new source that is created within the range
    /// of the [starting][#startingIndex] and [ending][#endingIndex] indexes.
    ///
    /// Note that it is lazily created and is kept within the current instance
    /// to not de-duplicate the creation of the sub-source.
    ///
    /// @implNote The array created should not be modified.
    /// It is only there to help referencing the source trimmed.
    @InitializedOnFirstCall
    public T[] subSource() {
        final var value = __subSource;
        if (value != null)
            return value;
        return __subSource = UtilityForArray.toSubdivided(source(), startingIndex(), endingIndex());
    }

    /// The starting index that should be the beginning of the [sub-source][#subSource]
    @Contract(pure = true)
    public @Range(from = 0, to = MAX_INT_VALUE) int startingIndex() { return __startingIndex; }

    /// The ending index that should be the end of the [sub-source][#subSource]
    @Contract(pure = true)
    public @Range(from = 0, to = MAX_INT_VALUE) int endingIndex() { return __endingIndex; }

    //#endregion -------------------- Getter methods --------------------

}
