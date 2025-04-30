package joookiwi.collection.java.extended;

import java.util.SequencedSet;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

import static joookiwi.collection.java.CollectionConstants.emptySequencedSet;

/// A definition of an immutable [SequencedSet] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsSequencedSet
/// @see ReversedArrayAsSequencedSet
@NotNullByDefault
public abstract class AbstractArrayAsSequencedSet<T extends @Nullable Object>
        extends AbstractArrayAsSet<T>
        implements SequencedSet<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsSequencedSet() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    @Override public @UnmodifiableView SequencedSet<T> reversed() {
        if (isEmpty())
            return emptySequencedSet();
        return new ReversedArrayAsSequencedSet<>(this, new ReversedArray<>(_reference()));
    }

    @Override public abstract AbstractArrayAsSequencedSet<T> clone();

    //#endregion -------------------- Methods --------------------

}
