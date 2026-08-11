package joookiwi.collection.java.extended.set;

import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.extended.iterator.EmptyIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_4;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.exception.EmptyCollectionException.DEFAULT_MESSAGE;

/// An [ImmutableConcurrentNavigableSet] with no values (as a [singleton][Singleton] instance)
///
/// @param <T> The type
/// @see joookiwi.collection.java.CollectionConstants#emptyConcurrentNavigableSet
@Singleton
@NotNullByDefault
public class EmptyConcurrentNavigableSet<T extends @Nullable Object>
        extends EmptyNavigableSet<T>
        implements ImmutableConcurrentNavigableSet<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyConcurrentNavigableSet<?> __instance;

    protected EmptyConcurrentNavigableSet() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyConcurrentNavigableSet<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptyConcurrentNavigableSet<T>) instance;
        synchronized (EmptyConcurrentNavigableSet.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptyConcurrentNavigableSet<T>) instance2;
            return (EmptyConcurrentNavigableSet<T>) (__instance = new EmptyConcurrentNavigableSet<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- As subdivided methods --------------------

    @Contract(ALWAYS_FAIL_0) @Override public ImmutableConcurrentNavigableSet<T> subSet(                                                                                    ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_2) @Override public ImmutableConcurrentNavigableSet<T> subSet(final T from,                                final T to                             ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_4) @Override public ImmutableConcurrentNavigableSet<T> subSet(final T from, final boolean fromIsInclusive, final T to, final boolean toIsInclusive) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1) @Override public ImmutableConcurrentNavigableSet<T> subSet(final @Nullable Object @Nullable ...                                         ignored) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }

    @Contract(ALWAYS_FAIL_0) @Override public ImmutableConcurrentNavigableSet<T> headSet(                                            ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1) @Override public ImmutableConcurrentNavigableSet<T> headSet(final T to                                  ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_2) @Override public ImmutableConcurrentNavigableSet<T> headSet(final T to, final boolean isInclusive       ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1) @Override public ImmutableConcurrentNavigableSet<T> headSet(final @Nullable Object @Nullable ... ignored) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }

    @Contract(ALWAYS_FAIL_0) @Override public ImmutableConcurrentNavigableSet<T> tailSet(                                            ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1) @Override public ImmutableConcurrentNavigableSet<T> tailSet(final T from                                ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_2) @Override public ImmutableConcurrentNavigableSet<T> tailSet(final T from, final boolean isInclusive     ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1) @Override public ImmutableConcurrentNavigableSet<T> tailSet(final @Nullable Object @Nullable ... ignored) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyConcurrentNavigableSet<T> reversed(                                            ) { return this; }
    @Contract(value = ALWAYS_THIS_1, pure = true) @Override public EmptyConcurrentNavigableSet<T> reversed(final @Nullable Object @Nullable ... ignored) { return this; }

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyConcurrentNavigableSet<T> descendingSet(                                            ) { return reversed(); }
    @Contract(value = ALWAYS_THIS_1, pure = true)           public EmptyConcurrentNavigableSet<T> descendingSet(final @Nullable Object @Nullable ... ignored) { return reversed(); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public EmptyIterator<T> descendingIterator(                                            ) { return EmptyIterator.getInstance(); }
              public EmptyIterator<T> descendingIterator(final @Nullable Object @Nullable ... ignored) { return EmptyIterator.getInstance(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyConcurrentNavigableSet<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
