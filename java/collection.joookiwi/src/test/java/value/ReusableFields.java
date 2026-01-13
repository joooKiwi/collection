package value;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

import joookiwi.collection.java.callback.IntObjFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import org.jetbrains.annotations.Contract;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

public final class ReusableFields {

    @Contract(ALWAYS_FAIL_0) private ReusableFields() { throw new Error("The utility class “ReusableFields” cannot be constructed."); }

    public static final Number            ZERO_NUMBER = 0;
    public static final AtomicInteger     ZERO_ATOMIC_INTEGER = new AtomicInteger();
    public static final AtomicLong        ZERO_ATOMIC_LONG = new AtomicLong();
    public static final LongAdder         ZERO_LONG_ADDER = new LongAdder();
    public static final LongAccumulator   ZERO_LONG_ACCUMULATOR = new LongAccumulator(null, 0L);
    public static final DoubleAdder       ZERO_DOUBLE_ADDER = new DoubleAdder();
    public static final DoubleAccumulator ZERO_DOUBLE_ACCUMULATOR = new DoubleAccumulator(null, 0L);

    public static final Object[] EMPTY_ARRAY = new Object[]{};
    public static final char MIN_CHAR = '\0';

    public static final int EXISTANT_INDEX = 2;
    public static final int INVALID_INDEX = 2000;


    public static final String VALUE = "";

    public static final ObjIntFunction<?, ? extends String> callback2 = (_, _) -> VALUE;
    public static final IntObjFunction<?, ? extends String> callback2Alt = (_, _) -> VALUE;
    public static final Function<?, ? extends String>       callback1 = _ -> VALUE;
    public static final IntFunction<? extends String>       callback1Alt = _ -> VALUE;
    public static final Supplier<? extends String>          callback0 = () -> VALUE;

}
