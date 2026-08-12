package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.stack.ArrayAsImmutableDeque;
import joookiwi.collection.java.extended.stack.EmptyDeque;
import joookiwi.collection.java.extended.stack.ImmutableDeque;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class DequeCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private DequeCreator() { throw new ImpossibleConstructionException("The utility class “DequeCreator” cannot be constructed.", DequeCreator.class); }

    //#region -------------------- ∅ --------------------

    /// An [EmptyDeque] instance
    public static <T extends @Nullable Object> EmptyDeque<T> Deque() { return EmptyDeque.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T extends @Nullable Object> ImmutableDeque<T> Deque(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToDeque.toDeque(values); }

    public static <T extends @Nullable Object> ImmutableDeque<T> Deque(final @Nullable CollectionHolder<? extends T> values) { return ToDeque.toDeque(values); }

    public static <T extends @Nullable Object> ImmutableDeque<T> Deque(final T @Nullable @Unmodifiable [] values) { return ToDeque.toDeque(values); }

    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> ImmutableDeque<T> Deque(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptyDeque.getInstance();
        if (values.isEmpty())
            return EmptyDeque.getInstance();
        return new ArrayAsImmutableDeque<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
