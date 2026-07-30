package joookiwi.collection.java.extended;

import joookiwi.collection.java.extended.iterator.MutableIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A [Collection][java.util.Collection] that can order its elements via a [Comparator][java.util.Comparator]
/// in addition to be a [SequencedCollection][java.util.SequencedCollection]
/// and contains a way to retrieve values via either
/// [#floor] (`<`), [#lower] (`<=`), [#ceiling] (`>`) or [#higher] (`>=`)
///
/// @apiNote This is not part of the <a href="https://docs.oracle.com/en/java/javase/24/core/java-collections-framework.html">Java collection framework</a>,
///          but it is an extension of it
/// @see joookiwi.collection.java.extended.set.MutableNavigableSet MutableNavigableSet
@NotNullByDefault
public interface MutableNavigableCollection<T extends @Nullable Object>
        extends MutableSortedCollection<T> {

    //#region -------------------- Get methods --------------------

    @Contract(mutates = "this")
    @Nullable T pollFirst();

    @Contract(mutates = "this")
    @Nullable T pollLast();


    @Nullable T floor(final T value);

    @Nullable T lower(final T value);

    @Nullable T ceiling(final T value);

    @Nullable T higher(final T value);

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Iterator methods --------------------

    MutableIterator<T> descendingIterator();

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override MutableNavigableCollection<T> clone();

    //#endregion -------------------- Clone methods --------------------

}
