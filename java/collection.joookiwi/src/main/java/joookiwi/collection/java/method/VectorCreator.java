package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.EmptyVector;
import joookiwi.collection.java.extended.ImmutableVector;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class VectorCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private VectorCreator() { throw new ImpossibleConstructionException("The utility class “VectorCreator” cannot be constructed.", VectorCreator.class); }

    //#region -------------------- ∅ --------------------

    /// An [EmptyVector] instance
    public static <T extends @Nullable Object> EmptyVector<T> Vector() { return EmptyVector.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T extends @Nullable Object> ImmutableVector<T> Vector(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToVector.toVector(values); }

    public static <T extends @Nullable Object> ImmutableVector<T> Vector(final @Nullable CollectionHolder<? extends T> values) { return ToVector.toVector(values); }

    public static <T extends @Nullable Object> ImmutableVector<T> Vector(final T @Nullable @Unmodifiable [] values) { return ToVector.toVector(values); }

    public static <T extends @Nullable Object> ImmutableVector<T> Vector(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptyVector.getInstance();
        if (values.isEmpty())
            return EmptyVector.getInstance();
        return new ImmutableVector<>(values);
    }

    //#endregion -------------------- values --------------------

}
