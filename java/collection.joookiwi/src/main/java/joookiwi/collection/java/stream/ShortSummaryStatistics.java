package joookiwi.collection.java.stream;

import joookiwi.collection.java.callback.additional.ShortConsumer;
import org.jetbrains.annotations.NotNullByDefault;

import static java.lang.Short.MAX_VALUE;
import static java.lang.Short.MIN_VALUE;
import static joookiwi.collection.java.helper.NumberComparator.max;
import static joookiwi.collection.java.helper.NumberComparator.min;

@NotNullByDefault
public class ShortSummaryStatistics
        implements ShortConsumer {
    //TODO: add documentation on ShortSummaryStatistics

    //#region -------------------- Fields --------------------

    private long __count;
    private short __sum;
    private short __min;
    private short __max;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    public ShortSummaryStatistics() {
        super();
        __count = 0L;
        __sum = 0;
        __min = MAX_VALUE;
        __max = MIN_VALUE;
    }

    public ShortSummaryStatistics(final long count,
                                  final short min,
                                  final short max,
                                  final short sum) {
        if (count < 0L)
            throw new IllegalArgumentException("Illegal argument exception. The count (" + ") of the ShortSummaryStatistics cannot be negative.");

        if (count == 0L) { // Use default field values if count == 0
            __count = 0L;
            __sum = 0;
            __min = MAX_VALUE;
            __max = MIN_VALUE;
            return;
        }

        if (min > max)
            throw new IllegalArgumentException("Illegal argument exception. The minimum (" + ") is greater than the maximum (" + ") of the ShortSummaryStatistics.");

        __count = count;
        __sum = sum;
        __min = min;
        __max = max;
    }

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @Override public void accept(final short value) {
        ++__count;
        __sum += value;
        __min = min(__min, value);
        __max = max(__max, value);
    }

    public void combine(final ShortSummaryStatistics other) {
        __count += other.__count;
        __sum += other.__sum;
        __min = min(__min, other.__min);
        __max = max(__max, other.__max);
    }

    public long getCount() { return __count; }

    public short getSum() { return __sum; }

    public short getMin() { return __min; }

    public short getMax() { return __max; }

    public double getAverage() {
        final var count = getCount();
        if (count > 0)
            return (double) getSum() / count;
        return 0.0D;
    }

    @Override public String toString() {
        return this.getClass().getSimpleName()
                + "{count=" + getCount()
                + ", sum=" + getSum()
                + ", min=" + getMin()
                + ", average=" + getAverage()
                + ", max=" + getMax() + '}';
    }

    //#endregion -------------------- Methods --------------------

}
