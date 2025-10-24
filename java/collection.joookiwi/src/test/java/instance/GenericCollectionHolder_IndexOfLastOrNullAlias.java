package instance;

import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.callback.ObjIntPredicate;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static value.Arrays.ABCD;

@NotNullByDefault
public final class GenericCollectionHolder_IndexOfLastOrNullAlias
        extends GenericCollectionHolder<String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_IndexOfLastOrNullAlias> {

    /// The field that tell the amount of time the methods `indexOfLastOrNull` have been called
    public @Range(from = 0, to = MAX_INT_VALUE) int amountOfCall = 0;

    public GenericCollectionHolder_IndexOfLastOrNullAlias() { super(ABCD); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_IndexOfLastOrNullAlias execute(final Consumer<GenericCollectionHolder_IndexOfLastOrNullAlias> action) {
        action.accept(this);
        return this;
    }


    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super String> predicate) {
        amountOfCall++;
        return super.indexOfLastOrNull(predicate);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super String> predicate) {
        amountOfCall++;
        return super.indexOfLastOrNull(predicate);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier predicate) {
        amountOfCall++;
        return super.indexOfLastOrNull(predicate);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super String> predicate, final int from) {
        amountOfCall++;
        return super.indexOfLastOrNull(predicate, from);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super String> predicate, final int from) {
        amountOfCall++;
        return super.indexOfLastOrNull(predicate, from);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier predicate, final int from) {
        amountOfCall++;
        return super.indexOfLastOrNull(predicate, from);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super String> predicate, final int from, final int to) {
        amountOfCall++;
        return super.indexOfLastOrNull(predicate, from, to);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super String> predicate, final int from, final int to) {
        amountOfCall++;
        return super.indexOfLastOrNull(predicate, from, to);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier predicate, final int from, final int to) {
        amountOfCall++;
        return super.indexOfLastOrNull(predicate, from, to);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super String> predicate, final @Nullable Integer from, final int to) {
        amountOfCall++;
        return super.indexOfLastOrNull(predicate, from, to);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super String> predicate, final @Nullable Integer from, final int to) {
        amountOfCall++;
        return super.indexOfLastOrNull(predicate, from, to);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier predicate, final @Nullable Integer from, final int to) {
        amountOfCall++;
        return super.indexOfLastOrNull(predicate, from, to);
    }

}
