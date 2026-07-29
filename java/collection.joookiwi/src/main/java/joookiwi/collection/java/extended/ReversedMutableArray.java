package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A container to reverse an array via [#reversedSource]
/// (plus its mutating method [#reversedSource(T\[\])])
///
/// @param <T> The type
/// @see joookiwi.collection.java.extended.ReversedArrayAsMutableSequencedCollection
/// @see joookiwi.collection.java.extended.ReversedArrayAsMutableSortedCollection
/// @see joookiwi.collection.java.extended.list.ReversedArrayAsMutableList
/// @see joookiwi.collection.java.extended.set.ReversedArrayAsMutableSequencedSet
/// @see joookiwi.collection.java.extended.set.ReversedArrayAsMutableSortedSet
/// @see joookiwi.collection.java.extended.set.ReversedArrayAsMutableNavigableSet
/// @see joookiwi.collection.java.extended.stack.ReversedArrayAsMutableDeque
/// @see joookiwi.collection.java.extended.stack.ReversedArrayAsMutableBlockingDeque
@NotNullByDefault
public class ReversedMutableArray<T extends @Nullable Object>
        extends ReversedArray<T> {

    //#region -------------------- Fields --------------------

    private T[] __source;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public ReversedMutableArray(final T[] source) {
        super(source);
        __source = source;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter / setter methods --------------------

    /// The changeable internal reference passed through the constructor or mutated from its setter
    @Contract(pure = true)
    @Override public T[] source() { return __source; }

    @Contract(mutates = "this")
    public void source(final T[] value) { __source = value; }


    ///  The new source that is created in reverse order.
    ///
    /// @implNote The array created could be modified since it is only used by the caller(s)
    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public T[] reversedSource() { return UtilityForArray.toReversed(source()); }

    @Contract(mutates = "this")
    public void reversedSource(final T @Unmodifiable [] value) { source(UtilityForArray.toReversed(value)); }

    //#endregion -------------------- Getter / setter methods --------------------

}
