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
public final class GenericCollectionHolder_FindFirstIndexedOrNullAlias
        extends GenericCollectionHolder<String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_FindFirstIndexedOrNullAlias> {

    /// The field that tell the amount of time the method `findFirstIndexedOrNull` has been called
    public @Range(from = 0, to = MAX_INT_VALUE) int amountOfCall = 0;

    public GenericCollectionHolder_FindFirstIndexedOrNullAlias() { super(ABCD); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_FindFirstIndexedOrNullAlias execute(final Consumer<GenericCollectionHolder_FindFirstIndexedOrNullAlias> action) {
        action.accept(this);
        return this;
    }


    @Override public @Nullable String findFirstIndexedOrNull(final IntObjPredicate<? super String> predicate) {
        amountOfCall++;
        return super.findFirstIndexedOrNull(predicate);
    }

    @Override public @Nullable String findFirstIndexedOrNull(final IntPredicate predicate) {
        amountOfCall++;
        return super.findFirstIndexedOrNull(predicate);
    }

    @Override public @Nullable String findFirstIndexedOrNull(final BooleanSupplier predicate) {
        amountOfCall++;
        return super.findFirstIndexedOrNull(predicate);
    }

}
