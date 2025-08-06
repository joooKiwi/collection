package joookiwi.collection.java.extended;

import java.util.NoSuchElementException;
import java.util.SequencedCollection;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A definition of an [MutableSequencedCollection] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsMutableSequencedCollection
/// @see ReversedArrayAsMutableSequencedCollection
@NotNullByDefault
public abstract class AbstractArrayAsMutableSequencedCollection<T extends @Nullable Object>
        extends AbstractArrayAsMutableCollection<T>
        implements MutableSequencedCollection<T> {

    //#region -------------------- Inner class --------------------

    /// An internal class for [AbstractArrayAsMutableSequencedCollection] to mutate the reference
    /// when the instance also mutates its reference
    ///
    /// @param <T>        The type
    /// @param <INSTANCE> The instance type
    protected static class ReversedMutableArrayAdaptor<T extends @Nullable Object,
            INSTANCE extends AbstractArrayAsMutableSequencedCollection<T>>
            extends ReversedMutableArray<T>
            implements ArrayMutator<T> {

        private final INSTANCE __instance;

        public ReversedMutableArrayAdaptor(final INSTANCE instance,
                                           final T[] source) {
            super(source);
            __instance = instance;
        }

        @Override protected void _source(final T[] value) { setReference(value); }

        protected INSTANCE _instance() { return __instance; }

        @Override public void setReference(final T[] value) {
            _instance()._synchronizeAndSetReference(value);
            super._source(value);
        }

    }

    //#endregion -------------------- Inner class --------------------
    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsMutableSequencedCollection() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    /// Get the first element in the current [instance][SequencedCollection]
    ///
    /// @throws NoSuchElementException The current [instance][SequencedCollection] [is empty][#isEmpty]
    /// @see SequencedCollection#getFirst()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First()</a>
    @Override public T getFirst() { return UtilityForArray.getFirst(_reference()); }

    /// Get the last element in the current [instance][SequencedCollection]
    ///
    /// @throws NoSuchElementException The current [instance][SequencedCollection] [is empty][#isEmpty]
    /// @see SequencedCollection#getLast()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @Override public T getLast() { return UtilityForArray.getLast(_reference()); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Add methods --------------------

    @Contract(mutates = "this")
    @Override public void addFirst(final T value) { _reference(UtilityForMutableArray.addToFirst(_reference(), value)); }

    @Contract(mutates = "this")
    @Override public void addLast(final T value) { _reference(UtilityForMutableArray.addToLast(_reference(), value)); }

    //#endregion -------------------- Add methods --------------------
    //#region -------------------- Remove methods --------------------

    @Contract(mutates = "this")
    @Override public T removeFirst() {
        final var reference = _reference();
        final var newArray = UtilityForMutableArray.removeFirst(reference);
        _reference(newArray);
        return reference[0];
    }

    @Contract(mutates = "this")
    @Override public T removeLast() {
        final var reference = _reference();
        final var newArray = UtilityForMutableArray.removeLast(reference);
        _reference(newArray);
        return reference[reference.length - 1];
    }

    //#endregion -------------------- Remove methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Override public MutableSequencedCollection<T> reversed() { return new ReversedArrayAsMutableSequencedCollection<>(this, _addMutator(new ReversedMutableArrayAdaptor<>(this, _reference()))); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractArrayAsMutableSequencedCollection<T> clone() { return (AbstractArrayAsMutableSequencedCollection<T>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
