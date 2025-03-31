package joookiwi.collection.java.extended;

import java.util.SequencedSet;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

import static joookiwi.collection.java.CollectionConstants.emptySequencedSet;

/// A bare-bone implementation of a [java SequencedSet][SequencedSet]
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
/// @see ReversedArrayAsSequencedSet
@NotNullByDefault
public class ArrayAsSequencedSet<T extends @Nullable Object>
        extends ArrayAsSet<T>
        implements SequencedSet<T> {

    /// Create an instance of a [SequencedSet] but allowing `null` in the `reference`
    ///
    /// @param reference The array to be the internal structure
    public ArrayAsSequencedSet(final T[] reference) { super(reference); }

    @Override public @UnmodifiableView SequencedSet<T> reversed() {
        if (isEmpty())
            return emptySequencedSet();
        return new ReversedArrayAsSequencedSet<>(this, new ReversedArray<>(_reference()));
    }

}
