package instance;

import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.callback.IntObjPredicate;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static value.Arrays.ABCD;

@NotNullByDefault
public final class GenericCollectionHolder_IndexOfLastIndexedOrNullAlias
        extends GenericCollectionHolder<String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_IndexOfLastIndexedOrNullAlias> {

    /// The field that tell the amount of time the methods `indexOfLastIndexedOrNull` have been called
    public @Range(from = 0, to = MAX_INT_VALUE) int amountOfCall = 0;

    public GenericCollectionHolder_IndexOfLastIndexedOrNullAlias() { super(ABCD); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_IndexOfLastIndexedOrNullAlias execute(final Consumer<GenericCollectionHolder_IndexOfLastIndexedOrNullAlias> action) {
        action.accept(this);
        return this;
    }


    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super String> predicate) {
        amountOfCall++;
        return super.indexOfLastIndexedOrNull(predicate);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate predicate) {
        amountOfCall++;
        return super.indexOfLastIndexedOrNull(predicate);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier predicate) {
        amountOfCall++;
        return super.indexOfLastIndexedOrNull(predicate);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super String> predicate, final int from) {
        amountOfCall++;
        return super.indexOfLastIndexedOrNull(predicate, from);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate predicate, final int from) {
        amountOfCall++;
        return super.indexOfLastIndexedOrNull(predicate, from);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier predicate, final int from) {
        amountOfCall++;
        return super.indexOfLastIndexedOrNull(predicate, from);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super String> predicate, final int from, final int to) {
        amountOfCall++;
        return super.indexOfLastIndexedOrNull(predicate, from, to);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate predicate, final int from, final int to) {
        amountOfCall++;
        return super.indexOfLastIndexedOrNull(predicate, from, to);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier predicate, final int from, final int to) {
        amountOfCall++;
        return super.indexOfLastIndexedOrNull(predicate, from, to);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super String> predicate, final @Nullable Integer from, final int to) {
        amountOfCall++;
        return super.indexOfLastIndexedOrNull(predicate, from, to);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate predicate, final @Nullable Integer from, final int to) {
        amountOfCall++;
        return super.indexOfLastIndexedOrNull(predicate, from, to);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier predicate, final @Nullable Integer from, final int to) {
        amountOfCall++;
        return super.indexOfLastIndexedOrNull(predicate, from, to);
    }

}
