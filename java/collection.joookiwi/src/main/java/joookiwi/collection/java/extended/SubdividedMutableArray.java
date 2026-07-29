package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A container to create a subdivided array lazily via [#subdividedSource]
/// (plus its mutating method [#subdividedSource(T\[\])])
///
/// @param <T> The type
/// @see joookiwi.collection.java.extended.list.SubdividedArrayAsMutableList
/// @see joookiwi.collection.java.extended.set.SubdividedArrayAsMutableSortedSet
/// @see joookiwi.collection.java.extended.set.SubdividedArrayAsMutableNavigableSet
@NotNullByDefault
public class SubdividedMutableArray<T extends @Nullable Object>
        extends SubdividedArray<T> {
    //TODO verify how mutating works in the Java framework on sub-collection

    //#region -------------------- Fields --------------------

    private T[] __source;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    /// Create a new container from a source array, a starting and ending index
    ///
    /// @param source        The array source to create a new [subdivided-source][#subdividedSource]
    /// @param startingIndex The starting index that should be the beginning of the [subdivided-source][#subdividedSource]
    /// @param endingIndex   The ending index that should be the end of the [subdivided-source][#subdividedSource]
    public SubdividedMutableArray(final T[] source,
                                  final @Range(from = 0, to = MAX_INT_VALUE) int startingIndex,
                                  final @Range(from = 0, to = MAX_INT_VALUE) int endingIndex) {
        super(source, startingIndex, endingIndex);
        __source = source;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    /// The changeable internal reference passed through the constructor or mutated from its setter
    @Contract(pure = true)
    @Override public T[] source() {
        return __source;
    }

    @Contract(mutates = "this")
    protected void _source(final T[] value) {
        __source = value;
    }

    /// The new source that is created within the range
    /// of the [starting][#startingIndex] and [ending][#endingIndex] indexes.
    ///
    /// @implNote The array created could be modified since it is only used by the caller(s)
    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public T[] subdividedSource() {
        return UtilityForArray.toSubdivided(source(), startingIndex(), endingIndex());
    }

    @Contract(mutates = "this")
    public void subdividedSource(final T @Unmodifiable [] value) {
        final var source = source();
        final var part1 = UtilityForArray.toSubdivided(source, 0, startingIndex() - 1);
        final var part3 = UtilityForArray.toSubdivided(source, endingIndex() + 1, source.length);

        final var part1Size = part1.length;
        final var part2Size = value.length;
        final var part3Size = part3.length;
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[part1Size + part2Size + part3Size];
        var index = -1;
        var index1 = -1;
        while (++index1 < part1Size)
            newArray[++index] = part1[index1];

        var index2 = -1;
        while (++index2 < part2Size)
            newArray[++index] = value[index2];

        var index3 = -1;
        while (++index3 < part3Size)
            newArray[++index] = part3[index3];
        _source(newArray);
    }

    //#endregion -------------------- Getter methods --------------------

}
