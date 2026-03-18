package joookiwi.collection.java.stream;

import joookiwi.collection.java.callback.additional.BooleanConsumer;
import org.jetbrains.annotations.NotNullByDefault;

@NotNullByDefault
public class BooleanSummaryStatistics
        implements BooleanConsumer {
    //TODO: add documentation on BooleanSummaryStatistics

    //#region -------------------- Fields --------------------

    private long __count;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    public BooleanSummaryStatistics() {
        super();
        __count = 0L;
    }

    public BooleanSummaryStatistics(final long count) {
        if (count < 0L)
            throw new IllegalArgumentException("Illegal argument exception. The count (" + ") of the BooleanSummaryStatistics cannot be negative.");
        __count = count;
    }

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @Override public void accept(final boolean value) {
        ++__count;
    }

    public void combine(final BooleanSummaryStatistics other) {
        __count += other.__count;
    }

    public long getCount() { return __count; }

    @Override public String toString() {
        return this.getClass().getSimpleName()
                + "{count=" + getCount() + '}';
    }

    //#endregion -------------------- Methods --------------------

}
