package joookiwi.collection.java.stream;

import joookiwi.collection.java.callback.additional.CharConsumer;
import org.jetbrains.annotations.NotNullByDefault;

@NotNullByDefault
public class CharSummaryStatistics
        implements CharConsumer {
    //TODO: add documentation on CharSummaryStatistics

    //#region -------------------- Fields --------------------

    private long __count;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    public CharSummaryStatistics() {
        super();
        __count = 0L;
    }

    public CharSummaryStatistics(final long count) {
        if (count < 0L)
            throw new IllegalArgumentException("Illegal argument exception. The count (" + ") of the CharSummaryStatistics cannot be negative.");
        __count = count;
    }

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @Override public void accept(final char value) {
        ++__count;
    }

    public void combine(final CharSummaryStatistics other) {
        __count += other.__count;
    }

    public long getCount() { return __count; }

    @Override public String toString() {
        return this.getClass().getSimpleName()
                + "{count=" + getCount() + '}';
    }

    //#endregion -------------------- Methods --------------------

}
