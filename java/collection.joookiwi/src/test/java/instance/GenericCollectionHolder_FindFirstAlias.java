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
public final class GenericCollectionHolder_FindFirstAlias
        extends GenericCollectionHolder<String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_FindFirstAlias> {

    /// The field that tell the amount of time the method `findFirst` has been called
    public @Range(from = 0, to = MAX_INT_VALUE) int amountOfCall = 0;

    public GenericCollectionHolder_FindFirstAlias() { super(ABCD); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_FindFirstAlias execute(final Consumer<GenericCollectionHolder_FindFirstAlias> action) {
        action.accept(this);
        return this;
    }


    @Override public String findFirst(final ObjIntPredicate<? super String> predicate) {
        amountOfCall++;
        return super.findFirst(predicate);
    }

    @Override public String findFirst(final Predicate<? super String> predicate) {
        amountOfCall++;
        return super.findFirst(predicate);
    }

    @Override public String findFirst(final BooleanSupplier predicate) {
        amountOfCall++;
        return super.findFirst(predicate);
    }

}
