package joookiwi.collection.java.tuple;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

@NotNullByDefault
public abstract class AbstractTuple<T extends @Nullable Object>
        implements Tuple<T> {

    protected AbstractTuple() { super(); }

    //#region -------------------- Size methods --------------------

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int length() { return size(); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int count() { return size(); }

    @Override public final boolean hasAtLeast1Element() { return isNotEmpty(); }
    @Override public final boolean containsAtLeast1Element() { return isNotEmpty(); }
    @Override public final boolean includesAtLeast1Element() { return isNotEmpty(); }

    @Override public final boolean containsExactly1Element() { return hasExactly1Element(); }
    @Override public final boolean includesExactly1Element() { return hasExactly1Element(); }

    @Override public final boolean containsAtMost1Element() { return hasAtMost1Element(); }
    @Override public final boolean includesAtMost1Element() { return hasAtMost1Element(); }

    @Override public final boolean containsAtLeast2Elements() { return hasAtLeast2Elements(); }
    @Override public final boolean includesAtLeast2Elements() { return hasAtLeast2Elements(); }

    @Override public final boolean containsExactly2Elements() { return hasExactly2Elements(); }
    @Override public final boolean includesExactly2Elements() { return hasExactly2Elements(); }

    @Override public final boolean containsAtMost2Elements() { return hasAtMost2Elements(); }
    @Override public final boolean includesAtMost2Elements() { return hasAtMost2Elements(); }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has ‥ --------------------

    @Override public final boolean includesNull() { return hasNull(); }
    @Override public final boolean containsNull() { return hasNull(); }

    @Override public final boolean includesNoNulls() { return hasNoNulls(); }
    @Override public final boolean containsNoNulls() { return hasNoNulls(); }

    @Override public final boolean includesDuplicate() { return hasDuplicate(); }
    @Override public final boolean containsDuplicate() { return hasDuplicate(); }

    @Override public final boolean includesNoDuplicates() { return hasNoDuplicates(); }
    @Override public final boolean containsNoDuplicates() { return hasNoDuplicates(); }

    //#endregion -------------------- Has ‥ --------------------
    //#region -------------------- Conversion methods --------------------

    @Override public abstract String toString();

    //#endregion -------------------- Conversion methods --------------------
    //#region -------------------- Comparison methods --------------------

    //#region -------------------- Reference equals --------------------

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override public boolean referenceEquals(final @Nullable Object other) { return other == this; }

    //#endregion -------------------- Reference equals --------------------

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @SuppressWarnings("unchecked cast")
    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractTuple<T> clone() {
        try {
            return (AbstractTuple<T>) super.clone();
        } catch (final CloneNotSupportedException exception) {
            throw new InternalError("The “clone” method was not expected to be thrown in “" + getClass().getSimpleName() + "”.", exception);
        }
    }

    //#endregion -------------------- Clone methods --------------------

}
