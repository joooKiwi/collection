package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.ArrayList;
import java.util.Collection;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;

/// A mutable behaviour of a [ArrayList]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableArrayList<T extends @Nullable Object>
        extends ArrayList<T> {

    @Serial private static final long serialVersionUID = 7760420228348183846L;

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [ArrayList] that start empty
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    public MutableArrayList() { super(DEFAULT_INITIAL_CAPACITY); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- initialCapacity --------------------

    /// Create a mutable instance of [ArrayList]
    /// with the `initialCapacity` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableArrayList(final @Range(from = 0, to = MAX_VALUE) byte initialCapacity) { super(initialCapacity); }

    /// Create a mutable instance of [ArrayList]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableArrayList(final @Range(from = 0, to = MAX_VALUE) @Nullable Byte initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity); }

    /// Create a mutable instance of [ArrayList]
    /// with the `initialCapacity` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableArrayList(final @Range(from = 0, to = MAX_VALUE) short initialCapacity) { super(initialCapacity); }

    /// Create a mutable instance of [ArrayList]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableArrayList(final @Range(from = 0, to = MAX_VALUE) @Nullable Short initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity); }

    /// Create a mutable instance of [ArrayList]
    /// with the `initialCapacity` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableArrayList(final @Range(from = 0, to = MAX_VALUE) int initialCapacity) { super(initialCapacity); }

    /// Create a mutable instance of [ArrayList]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableArrayList(final @Range(from = 0, to = MAX_VALUE) @Nullable Integer initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity); }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [ArrayList]
    /// with the capacity of the `values.length`
    public MutableArrayList(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values) {
        super(values.length);
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.set(index, values[index]);
    }

    /// Create a mutable instance of [ArrayList]
    /// with the capacity of <code>values.[size][Collection#size()]</code>
    public MutableArrayList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(values.size());
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values --------------------

}
