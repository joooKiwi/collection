package joookiwi.collection.java.stream;

import joookiwi.collection.java.callback.additional.ByteConsumer;
import org.jetbrains.annotations.NotNullByDefault;

import static java.lang.Byte.MAX_VALUE;
import static java.lang.Byte.MIN_VALUE;
import static joookiwi.collection.java.helper.NumberComparator.max;
import static joookiwi.collection.java.helper.NumberComparator.min;

@NotNullByDefault
public class ByteSummaryStatistics
        implements ByteConsumer {
    //TODO: add documentation on ByteSummaryStatistics

    //#region -------------------- Fields --------------------

    private long __count;
    private byte __sum;
    private byte __min;
    private byte __max;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    public ByteSummaryStatistics() {
        super();
        __count = 0L;
        __sum = 0;
        __min = MAX_VALUE;
        __max = MIN_VALUE;
    }

    public ByteSummaryStatistics(final long count,
                                 final byte min,
                                 final byte max,
                                 final byte sum) {
        if (count < 0L)
            throw new IllegalArgumentException("Illegal argument exception. The count (" + ") of the ByteSummaryStatistics cannot be negative.");

        if (count == 0L) { // Use default field values if count == 0
            __count = 0L;
            __sum = 0;
            __min = MAX_VALUE;
            __max = MIN_VALUE;
            return;
        }

        if (min > max)
            throw new IllegalArgumentException("Illegal argument exception. The minimum (" + ") is greater than the maximum (" + ") of the ByteSummaryStatistics.");

        __count = count;
        __sum = sum;
        __min = min;
        __max = max;
    }

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @Override public void accept(final byte value) {
        ++__count;
        __sum += value;
        __min = min(__min, value);
        __max = max(__max, value);
    }

    public void combine(final ByteSummaryStatistics other) {
        __count += other.__count;
        __sum += other.__sum;
        __min = min(__min, other.__min);
        __max = max(__max, other.__max);
    }

    public long getCount() { return __count; }

    public byte getSum() { return __sum; }

    public byte getMin() { return __min; }

    public byte getMax() { return __max; }

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
