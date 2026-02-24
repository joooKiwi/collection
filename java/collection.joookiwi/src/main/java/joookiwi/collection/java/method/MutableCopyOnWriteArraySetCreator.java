package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableCopyOnWriteArraySet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;

@NotNullByDefault
public final class MutableCopyOnWriteArraySetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableCopyOnWriteArraySetCreator() { throw new ImpossibleConstructionException("The utility class “MutableCopyOnWriteArraySetCreator” cannot be constructed.", MutableCopyOnWriteArraySetCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T> MutableCopyOnWriteArraySet<T> MutableCopyOnWriteArraySet() { return new MutableCopyOnWriteArraySet<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T> MutableCopyOnWriteArraySet<T> MutableCopyOnWriteArraySet(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableCopyOnWriteArraySet.toMutableCopyOnWriteArraySet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T> MutableCopyOnWriteArraySet<T> MutableCopyOnWriteArraySet(final @Nullable CollectionHolder<? extends T> values) { return ToMutableCopyOnWriteArraySet.toMutableCopyOnWriteArraySet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T> MutableCopyOnWriteArraySet<T> MutableCopyOnWriteArraySet(final T @Nullable @Unmodifiable [] values) { return ToMutableCopyOnWriteArraySet.toMutableCopyOnWriteArraySet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T> MutableCopyOnWriteArraySet<T> MutableCopyOnWriteArraySet(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new MutableCopyOnWriteArraySet<>();
        if (values.isEmpty())
            return new MutableCopyOnWriteArraySet<>();
        return new MutableCopyOnWriteArraySet<>(values);
    }

    //#endregion -------------------- values --------------------

}
