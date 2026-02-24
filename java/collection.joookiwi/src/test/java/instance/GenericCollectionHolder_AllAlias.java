package instance;

import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.callback.ObjIntPredicate;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static value.Arrays.ABCD;

@NotNullByDefault
public final class GenericCollectionHolder_AllAlias
        extends GenericCollectionHolder<String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_AllAlias> {

    /// The field that tell the amount of time the method `all` has been called
    public @Range(from = 0, to = MAX_INT_VALUE) int amountOfCall = 0;

    public GenericCollectionHolder_AllAlias() { super(ABCD); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_AllAlias execute(final Consumer<GenericCollectionHolder_AllAlias> action) {
        action.accept(this);
        return this;
    }


    @Override public boolean all(final ObjIntPredicate<? super String> predicate) {
        amountOfCall++;
        return super.all(predicate);
    }

    @Override public boolean all(final Predicate<? super String> predicate) {
        amountOfCall++;
        return super.all(predicate);
    }

    @Override public boolean all(final BooleanSupplier predicate) {
        amountOfCall++;
        return super.all(predicate);
    }

}
