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
public final class GenericCollectionHolder_IndexOfLastAlias
        extends GenericCollectionHolder<String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_IndexOfLastAlias> {

    /// The field that tell the amount of time the methods `indexOfLast` have been called
    public @Range(from = 0, to = MAX_INT_VALUE) int amountOfCall = 0;

    public GenericCollectionHolder_IndexOfLastAlias() { super(ABCD); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_IndexOfLastAlias execute(final Consumer<GenericCollectionHolder_IndexOfLastAlias> action) {
        action.accept(this);
        return this;
    }


    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super String> predicate) {
        amountOfCall++;
        return super.indexOfLast(predicate);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super String> predicate) {
        amountOfCall++;
        return super.indexOfLast(predicate);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier predicate) {
        amountOfCall++;
        return super.indexOfLast(predicate);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super String> predicate, final int from) {
        amountOfCall++;
        return super.indexOfLast(predicate, from);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super String> predicate, final int from) {
        amountOfCall++;
        return super.indexOfLast(predicate, from);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier predicate, final int from) {
        amountOfCall++;
        return super.indexOfLast(predicate, from);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super String> predicate, final int from, final int to) {
        amountOfCall++;
        return super.indexOfLast(predicate, from, to);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super String> predicate, final int from, final int to) {
        amountOfCall++;
        return super.indexOfLast(predicate, from, to);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier predicate, final int from, final int to) {
        amountOfCall++;
        return super.indexOfLast(predicate, from, to);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super String> predicate, final @Nullable Integer from, final int to) {
        amountOfCall++;
        return super.indexOfLast(predicate, from, to);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super String> predicate, final @Nullable Integer from, final int to) {
        amountOfCall++;
        return super.indexOfLast(predicate, from, to);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier predicate, final @Nullable Integer from, final int to) {
        amountOfCall++;
        return super.indexOfLast(predicate, from, to);
    }

}
