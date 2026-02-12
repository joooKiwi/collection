package instance;

import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.callback.IntObjPredicate;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static value.Arrays.ABCD;

@NotNullByDefault
public final class GenericCollectionHolder_TakeLastWhileIndexedAlias
        extends GenericCollectionHolder<String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_TakeLastWhileIndexedAlias> {

    /// The field that tell the amount of time the method `takeLastWhileIndexed` has been called
    public @Range(from = 0, to = MAX_INT_VALUE) int amountOfCall = 0;

    public GenericCollectionHolder_TakeLastWhileIndexedAlias() { super(ABCD); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_TakeLastWhileIndexedAlias execute(final Consumer<GenericCollectionHolder_TakeLastWhileIndexedAlias> action) {
        action.accept(this);
        return this;
    }


    @Override public CollectionHolder<String> takeLastWhileIndexed(final IntObjPredicate<? super String> predicate) {
        amountOfCall++;
        return super.takeLastWhileIndexed(predicate);
    }

    @Override public CollectionHolder<String> takeLastWhileIndexed(final IntPredicate predicate) {
        amountOfCall++;
        return super.takeLastWhileIndexed(predicate);
    }

    @Override public CollectionHolder<String> takeLastWhileIndexed(final BooleanSupplier predicate) {
        amountOfCall++;
        return super.takeLastWhileIndexed(predicate);
    }

}
