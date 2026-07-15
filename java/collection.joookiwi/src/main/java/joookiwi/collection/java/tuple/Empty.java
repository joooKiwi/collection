package joookiwi.collection.java.tuple;

import joookiwi.collection.java.EmptyCollectionHolder;
import joookiwi.collection.java.annotation.Alias;
import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.method.ArrayCreator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;
import static joookiwi.collection.java.CommonContracts._1ST_IS_NOT_NULL_1;
import static joookiwi.collection.java.annotation.AliasArgument.IGNORED;

/// A [Tuple] with no values (as a [singleton][Singleton] instance)
///
/// @param <T> The type
/// @see Monuple
/// @see Couple
@Singleton
@NotNullByDefault
public class Empty<T extends @Nullable Object>
        implements Tuple<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable Empty<?> instance;

    protected Empty() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> Empty<T> getInstance() {
        final var instance = Empty.instance;
        if (instance != null)
            return (Empty<T>) instance;
        synchronized (Empty.class) {
            final var instance2 = Empty.instance;
            if (instance2 != null)
                return (Empty<T>) instance2;
            return (Empty<T>) (Empty.instance = new Empty<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Size methods --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int size() { return 0; }
    @Contract(pure = true) @Override public @Range(from = 0, to = 0) final int length() { return size(); }
    @Contract(pure = true) @Override public @Range(from = 0, to = 0) final int count() { return size(); }


    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public boolean isEmpty() { return true; }
    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public boolean isNotEmpty() { return false; }


    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public final boolean hasAtLeast1Element() { return isNotEmpty(); }
    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public final boolean containsAtLeast1Element() { return isNotEmpty(); }
    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public final boolean includesAtLeast1Element() { return isNotEmpty(); }

    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public boolean hasExactly1Element() { return false; }
    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public final boolean containsExactly1Element() { return hasExactly1Element(); }
    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public final boolean includesExactly1Element() { return hasExactly1Element(); }

    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public boolean hasAtMost1Element() { return true; }
    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public final boolean containsAtMost1Element() { return hasAtMost1Element(); }
    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public final boolean includesAtMost1Element() { return hasAtMost1Element(); }


    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public boolean hasAtLeast2Elements() { return false; }
    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public final boolean containsAtLeast2Elements() { return hasAtLeast2Elements(); }
    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public final boolean includesAtLeast2Elements() { return hasAtLeast2Elements(); }

    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public boolean hasExactly2Elements() { return false; }
    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public final boolean containsExactly2Elements() { return hasExactly2Elements(); }
    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public final boolean includesExactly2Elements() { return hasExactly2Elements(); }

    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public boolean hasAtMost2Elements() { return true; }
    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public final boolean containsAtMost2Elements() { return hasAtMost2Elements(); }
    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public final boolean includesAtMost2Elements() { return hasAtMost2Elements(); }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has ‥ --------------------

    //#region -------------------- Has null --------------------

    @Contract(ALWAYS_FALSE_0) @Override public boolean hasNull(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean hasNull(final @Nullable Object @Nullable ... ignored) { return false; }

    @Contract(ALWAYS_FALSE_0)                                                @Override public final boolean includesNull(                                            ) { return hasNull(); }
    @Contract(ALWAYS_FALSE_1) @Alias(value = "hasNull", arguments = IGNORED)           public final boolean includesNull(final @Nullable Object @Nullable ... ignored) { return hasNull(); }

    @Contract(ALWAYS_FALSE_0)                                                @Override public final boolean containsNull(                                            ) { return hasNull(); }
    @Contract(ALWAYS_FALSE_1) @Alias(value = "hasNull", arguments = IGNORED)           public final boolean containsNull(final @Nullable Object @Nullable ... ignored) { return hasNull(); }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has no nulls --------------------

    @Contract(ALWAYS_TRUE_0) @Override public boolean hasNoNulls(                                            ) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean hasNoNulls(final @Nullable Object @Nullable ... ignored) { return true; }

    @Contract(ALWAYS_TRUE_0)                                                   @Override public final boolean includesNoNulls(                                            ) { return hasNoNulls(); }
    @Contract(ALWAYS_TRUE_1) @Alias(value = "hasNoNulls", arguments = IGNORED)           public final boolean includesNoNulls(final @Nullable Object @Nullable ... ignored) { return hasNoNulls(); }

    @Contract(ALWAYS_TRUE_0)                                                   @Override public final boolean containsNoNulls(                                            ) { return hasNoNulls(); }
    @Contract(ALWAYS_TRUE_1) @Alias(value = "hasNoNulls", arguments = IGNORED)           public final boolean containsNoNulls(final @Nullable Object @Nullable ... ignored) { return hasNoNulls(); }

    //#endregion -------------------- Has no nulls --------------------
    //#region -------------------- Has duplicate --------------------

    @Contract(ALWAYS_FALSE_0) @Override public boolean hasDuplicate(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean hasDuplicate(final @Nullable Object @Nullable ... ignored) { return false; }

    @Contract(ALWAYS_FALSE_0)                                                     @Override public final boolean includesDuplicate(                                            ) { return hasDuplicate(); }
    @Contract(ALWAYS_FALSE_1) @Alias(value = "hasDuplicate", arguments = IGNORED)           public final boolean includesDuplicate(final @Nullable Object @Nullable ... ignored) { return hasDuplicate(); }

    @Contract(ALWAYS_FALSE_0)                                                     @Override public final boolean containsDuplicate(                                            ) { return hasDuplicate(); }
    @Contract(ALWAYS_FALSE_1) @Alias(value = "hasDuplicate", arguments = IGNORED)           public final boolean containsDuplicate(final @Nullable Object @Nullable ... ignored) { return hasDuplicate(); }

    //#endregion -------------------- Has duplicate --------------------
    //#region -------------------- Has no duplicates --------------------

    @Contract(ALWAYS_TRUE_0) @Override public boolean hasNoDuplicates(                                            ) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean hasNoDuplicates(final @Nullable Object @Nullable ... ignored) { return true; }

    @Contract(ALWAYS_TRUE_0)                                                        @Override public final boolean includesNoDuplicates(                                            ) { return hasNoDuplicates(); }
    @Contract(ALWAYS_TRUE_1) @Alias(value = "hasNoDuplicates", arguments = IGNORED)           public final boolean includesNoDuplicates(final @Nullable Object @Nullable ... ignored) { return hasNoDuplicates(); }

    @Contract(ALWAYS_TRUE_0)                                                        @Override public final boolean containsNoDuplicates(                                            ) { return hasNoDuplicates(); }
    @Contract(ALWAYS_TRUE_1) @Alias(value = "hasNoDuplicates", arguments = IGNORED)           public final boolean containsNoDuplicates(final @Nullable Object @Nullable ... ignored) { return hasNoDuplicates(); }

    //#endregion -------------------- Has no duplicates --------------------

    //#endregion -------------------- Has ‥ --------------------
    //#region -------------------- Conversion methods --------------------

    @Override public T[] toArray() { return ArrayCreator.Array(); }

    @Override public EmptyCollectionHolder<T> toCollection() { return EmptyCollectionHolder.getInstance(); }

    @Override public String toString() { return "Empty ()"; }

    //#endregion -------------------- Conversion methods --------------------
    //#region -------------------- Comparison methods --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int hashCode() { return 0; }

    //#region -------------------- Equals --------------------

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (other instanceof Empty<?> otherConverted)
            return otherConverted.isEmpty();
        return false;
    }

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    public boolean equals(final @Nullable Tuple<?> other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        return other.isEmpty();
    }

    @Contract(value = _1ST_IS_NOT_NULL_1, pure = true) public boolean equals(final @Nullable Empty<?> other) { return other != null; }

    //#endregion -------------------- Equals --------------------
    //#region -------------------- Reference equals --------------------

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true) @Override public boolean referenceEquals(final @Nullable Object           other) { return other == this; }
    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)           public boolean referenceEquals(final @Nullable Tuple<?>         other) { return other == this; }
    @Contract(value = ALWAYS_FALSE_1,           pure = true)           public boolean referenceEquals(final @Nullable AbstractTuple<?> other) { return false; }
    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)           public boolean referenceEquals(final @Nullable Empty<?>         other) { return other == this; }

    //#endregion -------------------- Reference equals --------------------

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @Override public Empty<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

}
