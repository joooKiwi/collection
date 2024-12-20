package joookiwi.collection.java.extended;

import java.util.SequencedSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptySequencedSet;

/// A bare-bone implementation of a [java SequencedSet][SequencedSet]
/// with the [immutability][Unmodifiable] in place.
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
public class ArrayAsSequencedSet<T extends @Nullable Object>
        extends ArrayAsSet<T>
        implements SequencedSet<T> {

    /// Create an instance of a [SequencedSet] but allowing `null` in the `reference`
    ///
    /// @param reference The array to be the internal structure
    public ArrayAsSequencedSet(final T @NotNull @Unmodifiable [] reference) { super(reference); }

    @Override public SequencedSet<T> reversed() {
        if (isEmpty())
            return emptySequencedSet();

        final var reference = _reference();
        final var size = size();
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size];
        var index = size;
        while (--index >= 0)
            newArray[index] = reference[index];
        return new ArrayAsSequencedSet<>(newArray);
    }

}
