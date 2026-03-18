package joookiwi.collection.java.stream;

import joookiwi.collection.java.callback.additional.FloatConsumer;
import org.jetbrains.annotations.NotNullByDefault;

import static java.lang.Float.NEGATIVE_INFINITY;
import static java.lang.Float.POSITIVE_INFINITY;
import static java.lang.Float.isInfinite;
import static java.lang.Float.isNaN;
import static java.lang.Math.min;
import static joookiwi.collection.java.helper.NumberComparator.max;

@NotNullByDefault
public class FloatSummaryStatistics
        implements FloatConsumer {
    //TODO: add documentation on FloatSummaryStatistics

    //#region -------------------- Fields --------------------

    private long __count;
    private float __sum;
    private float __sumCompensation; // Low order bits of sum
    private float __simpleSum; // Used to compute right sum for non-finite inputs
    private float __min;
    private float __max;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    public FloatSummaryStatistics() {
        super();
        __count = 0L;
        __sum = __sumCompensation = __simpleSum = 0.0F;
        __min = POSITIVE_INFINITY;
        __max = NEGATIVE_INFINITY;
    }

    public FloatSummaryStatistics(final long count,
                                  final float min,
                                  final float max,
                                  final float sum) {
        if (count < 0L)
            throw new IllegalArgumentException("Illegal argument exception. The count (" + ") of the FloatSummaryStatistics cannot be negative.");

        if (count == 0L) { // Use default field values if count == 0
            __count = 0L;
            __sum = __sumCompensation = __simpleSum = 0.0F;
            __min = POSITIVE_INFINITY;
            __max = NEGATIVE_INFINITY;
            return;
        }

        if (min > max)
            throw new IllegalArgumentException("Illegal argument exception. The minimum (" + ") is greater than the maximum (" + ") of the FloatSummaryStatistics.");

        // NaN verification
        if (isNaN(min))
            if (isNaN(max))
                if (isNaN(sum))
                    throw new IllegalArgumentException("The minimum, maximum and sum cannot be NaN for a FloatSummaryStatistics.");
                else
                    throw new IllegalArgumentException("The minimum and maximum cannot be NaN for a FloatSummaryStatistics.");
            else if (isNaN(sum))
                throw new IllegalArgumentException("The minimum and sum cannot be NaN for a FloatSummaryStatistics.");
            else
                throw new IllegalArgumentException("The minimum cannot be NaN for a FloatSummaryStatistics.");
        if (isNaN(max))
            if (isNaN(sum))
                throw new IllegalArgumentException("The maximum and sum cannot be NaN for a FloatSummaryStatistics.");
            else
                throw new IllegalArgumentException("The maximum cannot be NaN for a FloatSummaryStatistics.");
        if (isNaN(sum))
            throw new IllegalArgumentException("The sum cannot be NaN for a FloatSummaryStatistics.");

        __count = count;
        __sum = sum;
        __simpleSum = sum;
        __sumCompensation = 0.0F;
        __min = min;
        __max = max;
    }

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @Override public void accept(final float value) {
        ++__count;
        __simpleSum += value;
        sumWithCompensation(value);
        __min = min(__min, value);
        __max = max(__max, value);
    }

    public void combine(final FloatSummaryStatistics other) {
        __count += other.__count;
        __simpleSum += other.__simpleSum;
        sumWithCompensation(other.__sum);

        // Subtract compensation bits
        sumWithCompensation(-other.__sumCompensation);
        __min = min(__min, other.__min);
        __max = max(__max, other.__max);
    }

    private void sumWithCompensation(final float value) {
        final var temporary = value - __sumCompensation;
        final var velvel = __sum + temporary;
        __sumCompensation = (velvel - __sum) - temporary;
        __sum = velvel;
    }

    public long getCount() { return __count; }

    public float getSum() {
        // Better error bounds to add both terms as the final sum
        final var temporary =  __sum - __sumCompensation;
        if (isNaN(temporary) && isInfinite(__simpleSum))
            // If the compensated sum is spuriously NaN from
            // accumulating one or more same-signed infinite values,
            // return the correctly-signed infinity stored in
            // simpleSum.
            return __simpleSum;
        return temporary;
    }

    public float getMin() { return __min; }

    public float getMax() { return __max; }

    public double getAverage() {
        final var count = getCount();
        if (count > 0L)
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
