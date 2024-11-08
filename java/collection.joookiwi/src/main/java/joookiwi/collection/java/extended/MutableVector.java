package joookiwi.collection.java.extended;

import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import java.io.Serial;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;

/// A mutable behaviour of a [Vector]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableVector<T>
        extends Vector<T> {

    @Serial private static final long serialVersionUID = -5379583952948526076L;

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [Vector] that start empty
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    public MutableVector() { super(DEFAULT_INITIAL_CAPACITY, 0); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- initialCapacity --------------------

    /// Create a mutable instance of [Vector]
    /// with the `initialCapacity` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableVector(final @Range(from = 0, to = MAX_VALUE) byte initialCapacity) { super(initialCapacity, 0); }

    /// Create a mutable instance of [Vector]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableVector(final @Range(from = 0, to = MAX_VALUE) @Nullable Byte initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, 0); }

    /// Create a mutable instance of [Vector]
    /// with the `initialCapacity` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableVector(final @Range(from = 0, to = MAX_VALUE) short initialCapacity) { super(initialCapacity, 0); }

    /// Create a mutable instance of [Vector]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableVector(final @Range(from = 0, to = MAX_VALUE) @Nullable Short initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, 0); }

    /// Create a mutable instance of [Vector]
    /// with the `initialCapacity` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableVector(final @Range(from = 0, to = MAX_VALUE) int initialCapacity) { super(initialCapacity, 0); }

    /// Create a mutable instance of [Vector]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableVector(final @Range(from = 0, to = MAX_VALUE) @Nullable Integer initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, 0); }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [Vector]
    /// with the capacity of the `values.length`
    public MutableVector(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @NotNull @Unmodifiable [] values) {
        super(values.length, 0);
        final var size = elementCount = values.length;
        if (size == 0)
            return;

        final var array = elementData;
        var index = -1;
        while (++index < size)
            array[index] = values[index];
    }

    /// Create a mutable instance of [Vector]
    /// with the capacity of <code>values.[size][Collection#size()]</code>
    public MutableVector(final @Flow(sourceIsContainer = true, targetIsContainer = true) @NotNull @Unmodifiable Collection<? extends T> values) {
        super(values.size(), 0);
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values --------------------

}
