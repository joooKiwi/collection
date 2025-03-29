package joookiwi.collection.java.extended;

import java.util.SequencedCollection;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CollectionConstants.emptySequencedCollection;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;
import static joookiwi.collection.java.method.First.first;
import static joookiwi.collection.java.method.Last.last;

/// A bare-bone implementation of a [java SequencedCollection][SequencedCollection]
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
public class ArrayAsSequencedCollection<T extends @Nullable Object>
        extends ArrayAsCollection<T>
        implements SequencedCollection<T> {

    //#region -------------------- Constructor --------------------

    /// Create an instance of a [SequencedCollection] and allowing `null` in the `reference`
    ///
    /// @param reference The array to be the internal structure
    public ArrayAsSequencedCollection(final T[] reference) {
        super(reference);
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    @Override public T getFirst() { return first(_reference()); }

    @Override public T getLast() { return last(_reference()); }

    @Override public SequencedCollection<T> reversed() {
        if (isEmpty())
            return emptySequencedCollection();

        final var reference = _reference();
        final var size = size();
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size];
        var index = size;
        while (--index >= 0)
            newArray[index] = reference[index];
        return new ArrayAsSequencedCollection<>(newArray);
    }


    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof SequencedCollection<?> otherConverted))
            return false;
        if (size() != otherConverted.size())
            return false;
        return containsAll(otherConverted);
    }

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [ArrayAsSequencedCollection]
    ///
    /// @param value The (_never used_) element to add at the start
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(T value) { throw new UnsupportedOperationException("The method “addFirst” is not supported in an immutable List."); }

    /// Fail to add a `value` to the current [ArrayAsSequencedCollection]
    ///
    /// @param value The (_never used_) element to add at the end
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(T value) { throw new UnsupportedOperationException("The method “addLast” is not supported in an immutable List."); }

    /// Fail to remove the first value in the current [ArrayAsSequencedCollection]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedOperationException("The method “removeFirst” is not supported in an immutable List."); }

    /// Fail to remove the last value in the current [ArrayAsSequencedCollection]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedOperationException("The method “removeLast” is not supported in an immutable List."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
