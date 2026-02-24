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
public final class GenericCollectionHolder_AnyAlias
        extends GenericCollectionHolder<String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_AnyAlias> {

    /// The field that tell the amount of time the method `any` has been called
    public @Range(from = 0, to = MAX_INT_VALUE) int amountOfCall = 0;

    public GenericCollectionHolder_AnyAlias() { super(ABCD); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_AnyAlias execute(final Consumer<GenericCollectionHolder_AnyAlias> action) {
        action.accept(this);
        return this;
    }


    //TODO do a proper test for GenericCollectionHolder.any() being called
//    @Override public boolean any() {
//        amountOfCall++;
//        return super.any();
//    }

    @Override public boolean any(final @Nullable ObjIntPredicate<? super String> predicate) {
        amountOfCall++;
        return super.any(predicate);
    }

    @Override public boolean any(final @Nullable Predicate<? super String> predicate) {
        amountOfCall++;
        return super.any(predicate);
    }

    @Override public boolean any(final @Nullable BooleanSupplier predicate) {
        amountOfCall++;
        return super.any(predicate);
    }

}
