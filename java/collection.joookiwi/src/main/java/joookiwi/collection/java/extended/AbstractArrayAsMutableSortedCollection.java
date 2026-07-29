package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public abstract class AbstractArrayAsMutableSortedCollection<T extends @Nullable Object>
        extends AbstractArrayAsMutableSequencedCollection<T>
        implements MutableSortedCollection<T> {

    //#region -------------------- Inner class --------------------

    /// An internal class for [AbstractArrayAsMutableSortedCollection] to mutate the reference
    /// when the instance also mutates its reference
    ///
    /// @param <T>        The type
    /// @param <INSTANCE> The instance type
    protected static class ReversedMutableArrayAdaptor<T extends @Nullable Object,
            INSTANCE extends AbstractArrayAsMutableSortedCollection<T>>
            extends ReversedMutableArray<T>
            implements ArrayMutator<T> {

        private final INSTANCE __instance;

        public ReversedMutableArrayAdaptor(final INSTANCE instance,
                                           final T[] source) {
            super(source);
            __instance = instance;
        }

        @Override public void source(final T[] value) { setReference(value); }

        protected INSTANCE _instance() { return __instance; }

        @Override public void setReference(final T[] value) {
            _instance()._synchronizeAndSetReference(value);
            super.source(value);
        }

    }

    //#endregion -------------------- Inner class --------------------
    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsMutableSortedCollection() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- As reverse methods --------------------

    @Override public MutableSortedCollection<T> reversed() { return new ReversedArrayAsMutableSortedCollection<>(this, _addMutator(new ReversedMutableArrayAdaptor<>(this, _reference()))); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractArrayAsMutableSortedCollection<T> clone() { return (AbstractArrayAsMutableSortedCollection<T>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
