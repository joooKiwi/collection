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
public final class GenericCollectionHolder_FindFirstOrNullAlias
        extends GenericCollectionHolder<String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_FindFirstOrNullAlias> {

    /// The field that tell the amount of time the method `findFirstOrNull` has been called
    public @Range(from = 0, to = MAX_INT_VALUE) int amountOfCall = 0;

    public GenericCollectionHolder_FindFirstOrNullAlias() { super(ABCD); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_FindFirstOrNullAlias execute(final Consumer<GenericCollectionHolder_FindFirstOrNullAlias> action) {
        action.accept(this);
        return this;
    }


    @Override public @Nullable String findFirstOrNull(final ObjIntPredicate<? super String> predicate) {
        amountOfCall++;
        return super.findFirstOrNull(predicate);
    }

    @Override public @Nullable String findFirstOrNull(final Predicate<? super String> predicate) {
        amountOfCall++;
        return super.findFirstOrNull(predicate);
    }

    @Override public @Nullable String findFirstOrNull(final BooleanSupplier predicate) {
        amountOfCall++;
        return super.findFirstOrNull(predicate);
    }

}
