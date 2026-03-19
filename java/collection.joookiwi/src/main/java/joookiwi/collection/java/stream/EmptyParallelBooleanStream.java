package joookiwi.collection.java.stream;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.LongConsumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.callback.additional.BooleanBinaryOperator;
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.BooleanFunction;
import joookiwi.collection.java.callback.additional.BooleanObjConsumer;
import joookiwi.collection.java.callback.additional.BooleanToByteFunction;
import joookiwi.collection.java.callback.additional.BooleanToCharFunction;
import joookiwi.collection.java.callback.additional.BooleanToDoubleFunction;
import joookiwi.collection.java.callback.additional.BooleanToFloatFunction;
import joookiwi.collection.java.callback.additional.BooleanToIntFunction;
import joookiwi.collection.java.callback.additional.BooleanToLongFunction;
import joookiwi.collection.java.callback.additional.BooleanToShortFunction;
import joookiwi.collection.java.callback.additional.BooleanUnaryOperator;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.CharSupplier;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.FloatSupplier;
import joookiwi.collection.java.callback.additional.ObjBooleanConsumer;
import joookiwi.collection.java.callback.additional.ObjBooleanFunction;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.callback.additional.ShortSupplier;
import joookiwi.collection.java.extended.iterator.BooleanSpliterator;
import joookiwi.collection.java.extended.iterator.EmptyBooleanIterator;
import joookiwi.collection.java.optional.OptionalBoolean;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CollectionConstants.emptyBooleanSpliterator;
import static joookiwi.collection.java.CollectionCreator.emptyOptionalBoolean;
import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_1;
import static joookiwi.collection.java.method.ArrayCreator.BooleanArray;

/// A parallel [BooleanStream] with nothing (as a [singleton][Singleton] instance)
///
/// @see EmptyParallelStream
/// @see EmptySequentialBooleanStream
/// @see EmptyParallelCharStream
/// @see EmptyParallelByteStream
/// @see EmptyParallelShortStream
/// @see EmptyParallelIntStream
/// @see EmptyParallelLongStream
/// @see EmptyParallelFloatStream
/// @see EmptyParallelDoubleStream
@Singleton
@NotNullByDefault
public class EmptyParallelBooleanStream
        implements BooleanStream {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyParallelBooleanStream instance;

    protected EmptyParallelBooleanStream() { super(); }

    public static EmptyParallelBooleanStream getInstance() {
        final var instance = EmptyParallelBooleanStream.instance;
        if (instance != null)
            return instance;
        synchronized (EmptyParallelBooleanStream.class) {
            final var instance2 = EmptyParallelBooleanStream.instance;
            if (instance2 != null)
                return instance2;
            return (EmptyParallelBooleanStream.instance = new EmptyParallelBooleanStream());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Is parallel --------------------

    @Contract(ALWAYS_TRUE_0) @Override public boolean isParallel(                                            ) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean isParallel(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- Is parallel --------------------
    //#region -------------------- Sequential --------------------

    @Override public EmptySequentialBooleanStream sequential(                                            ) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream sequential(final @Nullable Object @Nullable ... ignored) { return EmptySequentialBooleanStream.getInstance(); }

    //#endregion -------------------- Sequential --------------------
    //#region -------------------- Parallel --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelBooleanStream parallel(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream parallel(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Parallel --------------------
    //#region -------------------- Unordered --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelBooleanStream unordered(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream unordered(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Unordered --------------------
    //#region -------------------- Filter --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelBooleanStream filter(final @Nullable BooleanUnaryOperator predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream filter(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream filter(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelBooleanStream map(final @Nullable BooleanUnaryOperator  mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream map(final @Nullable BooleanSupplier       mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream map(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public <U> EmptyParallelStream<U> mapToObj(final @Nullable BooleanFunction<? extends U> mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapToObj(final @Nullable Supplier<? extends U>        mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapToObj(final @Nullable Object @Nullable ...        ignored) { return EmptyParallelStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptyParallelBooleanStream mapToBoolean(final @Nullable BooleanUnaryOperator  mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelBooleanStream mapToBoolean(final @Nullable BooleanSupplier       mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelBooleanStream mapToBoolean(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public EmptyParallelCharStream mapToChar(final @Nullable BooleanToCharFunction mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapToChar(final @Nullable CharSupplier          mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapToChar(final @Nullable Object @Nullable ... ignored) { return EmptyParallelCharStream.getInstance(); }

    @Override public EmptyParallelByteStream mapToByte(final @Nullable BooleanToByteFunction  mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapToByte(final @Nullable BooleanSupplier        mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapToByte(final @Nullable Object @Nullable ...  ignored) { return EmptyParallelByteStream.getInstance(); }

    @Override public EmptyParallelShortStream mapToShort(final @Nullable BooleanToShortFunction mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapToShort(final @Nullable ShortSupplier          mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapToShort(final @Nullable Object @Nullable ...  ignored) { return EmptyParallelShortStream.getInstance(); }

    @Override public EmptyParallelIntStream mapToInt(final @Nullable BooleanToIntFunction  mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapToInt(final @Nullable IntSupplier           mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapToInt(final @Nullable Object @Nullable ... ignored) { return EmptyParallelIntStream.getInstance(); }

    @Override public EmptyParallelLongStream mapToLong(final @Nullable BooleanToLongFunction mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapToLong(final @Nullable LongSupplier          mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapToLong(final @Nullable Object @Nullable ... ignored) { return EmptyParallelLongStream.getInstance(); }

    @Override public EmptyParallelFloatStream mapToFloat(final @Nullable BooleanToFloatFunction mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapToFloat(final @Nullable FloatSupplier          mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapToFloat(final @Nullable Object @Nullable ...  ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Override public EmptyParallelDoubleStream mapToDouble(final @Nullable BooleanToDoubleFunction mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapToDouble(final @Nullable DoubleSupplier          mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapToDouble(final @Nullable Object @Nullable ...   ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Flat map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelBooleanStream flatMap(final @Nullable BooleanFunction<? extends @Nullable BooleanStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream flatMap(final @Nullable Supplier<? extends @Nullable BooleanStream>        mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream flatMap(final @Nullable Object @Nullable ...                              ignored) { return this; }

    @Override public <U> EmptyParallelStream<U> flatMapToObj(final @Nullable BooleanFunction<? extends @Nullable Stream<? extends U>> mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> flatMapToObj(final @Nullable Supplier<? extends @Nullable Stream<? extends U>>        mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> flatMapToObj(final @Nullable Object @Nullable ...                                    ignored) { return EmptyParallelStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable BooleanFunction<? extends @Nullable BooleanStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable Supplier<? extends @Nullable BooleanStream>        mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable Object @Nullable ...                              ignored) { return this; }


    @Override public EmptyParallelCharStream flatMapToChar(final @Nullable BooleanFunction<? extends @Nullable CharStream> mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream flatMapToChar(final @Nullable Supplier<? extends @Nullable CharStream>        mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream flatMapToChar(final @Nullable Object @Nullable ...                           ignored) { return EmptyParallelCharStream.getInstance(); }

    @Override public EmptyParallelByteStream flatMapToByte(final @Nullable BooleanFunction<? extends @Nullable ByteStream> mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream flatMapToByte(final @Nullable Supplier<? extends @Nullable ByteStream>        mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream flatMapToByte(final @Nullable Object @Nullable ...                           ignored) { return EmptyParallelByteStream.getInstance(); }

    @Override public EmptyParallelShortStream flatMapToShort(final @Nullable BooleanFunction<? extends @Nullable ShortStream> mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream flatMapToShort(final @Nullable Supplier<? extends @Nullable ShortStream>        mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream flatMapToShort(final @Nullable Object @Nullable ...                            ignored) { return EmptyParallelShortStream.getInstance(); }

    @Override public EmptyParallelIntStream flatMapToInt(final @Nullable BooleanFunction<? extends @Nullable IntStream> mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream flatMapToInt(final @Nullable Supplier<? extends @Nullable IntStream>        mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream flatMapToInt(final @Nullable Object @Nullable ...                          ignored) { return EmptyParallelIntStream.getInstance(); }

    @Override public EmptyParallelLongStream flatMapToLong(final @Nullable BooleanFunction<? extends @Nullable LongStream> mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream flatMapToLong(final @Nullable Supplier<? extends @Nullable LongStream>        mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream flatMapToLong(final @Nullable Object @Nullable ...                           ignored) { return EmptyParallelLongStream.getInstance(); }

    @Override public EmptyParallelFloatStream flatMapToFloat(final @Nullable BooleanFunction<? extends @Nullable FloatStream> mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream flatMapToFloat(final @Nullable Supplier<? extends @Nullable FloatStream>        mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream flatMapToFloat(final @Nullable Object @Nullable ...                            ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Override public EmptyParallelDoubleStream flatMapToDouble(final @Nullable BooleanFunction<? extends @Nullable DoubleStream> mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream flatMapToDouble(final @Nullable Supplier<? extends @Nullable DoubleStream>        mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream flatMapToDouble(final @Nullable Object @Nullable ...                             ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- Flat map --------------------
    //#region -------------------- Map multi --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelBooleanStream mapMulti(final @Nullable BooleanObjConsumer<? super BooleanConsumer> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream mapMulti(final @Nullable BooleanConsumer                             mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream mapMulti(final @Nullable Runnable                                    mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream mapMulti(final @Nullable Object @Nullable ...                       ignored) { return this; }

    @Override public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable BooleanObjConsumer<? super @Nullable Consumer<U>> mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable BooleanConsumer                                   mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable Runnable                                          mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable Object @Nullable ...                             ignored) { return EmptyParallelStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable BooleanObjConsumer<? super BooleanConsumer> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable BooleanConsumer                             mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable Runnable                                    mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable Object @Nullable ...                       ignored) { return this; }

    @Override public EmptyParallelCharStream mapMultiToChar(final @Nullable BooleanObjConsumer<? super @Nullable CharConsumer> mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapMultiToChar(final @Nullable BooleanConsumer                                    mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapMultiToChar(final @Nullable Runnable                                           mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapMultiToChar(final @Nullable Object @Nullable ...                              ignored) { return EmptyParallelCharStream.getInstance(); }

    @Override public EmptyParallelByteStream mapMultiToByte(final @Nullable BooleanObjConsumer<? super @Nullable ByteConsumer> mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapMultiToByte(final @Nullable BooleanConsumer                                    mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapMultiToByte(final @Nullable Runnable                                           mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapMultiToByte(final @Nullable Object @Nullable ...                              ignored) { return EmptyParallelByteStream.getInstance(); }

    @Override public EmptyParallelShortStream mapMultiToShort(final @Nullable BooleanObjConsumer<? super @Nullable ShortConsumer> mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapMultiToShort(final @Nullable BooleanConsumer                                     mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapMultiToShort(final @Nullable Runnable                                            mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapMultiToShort(final @Nullable Object @Nullable ...                               ignored) { return EmptyParallelShortStream.getInstance(); }

    @Override public EmptyParallelIntStream mapMultiToInt(final @Nullable BooleanObjConsumer<? super @Nullable IntConsumer> mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapMultiToInt(final @Nullable BooleanConsumer                                   mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapMultiToInt(final @Nullable Runnable                                          mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapMultiToInt(final @Nullable Object @Nullable ...                             ignored) { return EmptyParallelIntStream.getInstance(); }

    @Override public EmptyParallelLongStream mapMultiToLong(final @Nullable BooleanObjConsumer<? super @Nullable LongConsumer> mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapMultiToLong(final @Nullable BooleanConsumer                                    mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapMultiToLong(final @Nullable Runnable                                           mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapMultiToLong(final @Nullable Object @Nullable ...                              ignored) { return EmptyParallelLongStream.getInstance(); }

    @Override public EmptyParallelFloatStream mapMultiToFloat(final @Nullable BooleanObjConsumer<? super @Nullable FloatConsumer> mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapMultiToFloat(final @Nullable BooleanConsumer                                     mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapMultiToFloat(final @Nullable Runnable                                            mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapMultiToFloat(final @Nullable Object @Nullable ...                               ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Override public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable BooleanObjConsumer<? super @Nullable DoubleConsumer> mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable BooleanConsumer                                      mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable Runnable                                             mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable Object @Nullable ...                                ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- Map multi --------------------
    //#region -------------------- Distinct --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelBooleanStream distinct(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream distinct(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Distinct --------------------
    //#region -------------------- Sorted --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelBooleanStream sorted(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream sorted(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sorted --------------------
    //#region -------------------- Peek --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelBooleanStream peek(final @Nullable BooleanConsumer       action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream peek(final @Nullable Runnable              action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream peek(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Peek --------------------
    //#region -------------------- Limit --------------------

    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream limit(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream limit(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream limit(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelBooleanStream limit(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream limit(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream limit(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream limit(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream limit(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream limit(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Limit --------------------
    //#region -------------------- Skip --------------------

    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream skip(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream skip(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream skip(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelBooleanStream skip(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream skip(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream skip(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream skip(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream skip(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream skip(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Skip --------------------
    //#region -------------------- Take while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelBooleanStream takeWhile(final @Nullable BooleanUnaryOperator predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream takeWhile(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream takeWhile(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Drop while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelBooleanStream dropWhile(final @Nullable BooleanUnaryOperator predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream dropWhile(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelBooleanStream dropWhile(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- For each --------------------

    @Override public void forEach(final @Nullable BooleanConsumer       action) {}
              public void forEach(final @Nullable Runnable              action) {}
              public void forEach(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each ordered --------------------

    @Override public void forEachOrdered(final @Nullable BooleanConsumer       action) {}
              public void forEachOrdered(final @Nullable Runnable              action) {}
              public void forEachOrdered(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each ordered --------------------
    //#region -------------------- To array --------------------

                           @Override public                              boolean[] toArray(                                 ) { return BooleanArray(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> U[]       toArray(final IntFunction<U[]> generator) { return generator.apply(0); }

    //#endregion -------------------- To array --------------------
    //#region -------------------- Reduce --------------------

    @Contract(ALWAYS_1ST_1)           public final boolean reduce(final boolean initial                                                   ) { return initial; }
    @Contract(ALWAYS_1ST_2) @Override public final boolean reduce(final boolean initial, final @Nullable BooleanBinaryOperator accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final boolean reduce(final boolean initial, final @Nullable BooleanSupplier       accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final boolean reduce(final boolean initial, final @Nullable Object @Nullable ...      ignored) { return initial; }

    @Override public OptionalBoolean reduce(final @Nullable BooleanBinaryOperator accumulator) { return emptyOptionalBoolean(); }
              public OptionalBoolean reduce(final @Nullable BooleanSupplier       accumulator) { return emptyOptionalBoolean(); }
              public OptionalBoolean reduce(final @Nullable Object @Nullable ...      ignored) { return emptyOptionalBoolean(); }

    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjBooleanFunction<U, U> accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjBooleanFunction<U, U> accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjBooleanFunction<U, U> accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>           accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>           accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>           accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>              accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>              accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>              accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }

    //#endregion -------------------- Reduce --------------------
    //#region -------------------- Collect --------------------

    @Contract(ALWAYS_NULL_3) @Override public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjBooleanConsumer<R> accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjBooleanConsumer<R> accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjBooleanConsumer<R> accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjBooleanConsumer<R> accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>           accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>           accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>           accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>           accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable              accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable              accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable              accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable              accumulator, final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_2) public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_1) public <R extends @Nullable Object> R collect(final @Nullable Object @Nullable ... ignored) { return null; }

    //#endregion -------------------- Collect --------------------
    //#region -------------------- Count --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) long count(                                            ) { return 0; }
    @Contract(pure = true)           public @Range(from = 0, to = 0) long count(final @Nullable Object @Nullable ... ignored) { return 0; }

    //#endregion -------------------- Count --------------------
    //#region -------------------- Summary statistics --------------------

    @Override public BooleanSummaryStatistics summaryStatistics(                                            ) { return new BooleanSummaryStatistics(); }
              public BooleanSummaryStatistics summaryStatistics(final @Nullable Object @Nullable ... ignored) { return new BooleanSummaryStatistics(); }

    //#endregion -------------------- Summary statistics --------------------
    //#region -------------------- All match --------------------

    @Contract(ALWAYS_TRUE_1) @Override public boolean allMatch(final @Nullable BooleanUnaryOperator predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable BooleanSupplier      predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable Object @Nullable ...   ignored) { return true; }

    //#endregion -------------------- All match --------------------
    //#region -------------------- Any match --------------------

    @Contract(ALWAYS_FALSE_0)           public boolean anyMatch(                                              ) { return false; }
    @Contract(ALWAYS_FALSE_1) @Override public boolean anyMatch(final @Nullable BooleanUnaryOperator predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable BooleanSupplier      predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable Object @Nullable ...   ignored) { return false; }

    //#endregion -------------------- Any match --------------------
    //#region -------------------- None match --------------------

    @Contract(ALWAYS_TRUE_0)           public boolean noneMatch(                                              ) { return true; }
    @Contract(ALWAYS_TRUE_1) @Override public boolean noneMatch(final @Nullable BooleanUnaryOperator predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable BooleanSupplier      predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable Object @Nullable ...   ignored) { return true; }

    //#endregion -------------------- None match --------------------
    //#region -------------------- Find first --------------------

    @Override public OptionalBoolean findFirst(                                            ) { return emptyOptionalBoolean(); }
              public OptionalBoolean findFirst(final @Nullable Object @Nullable ... ignored) { return emptyOptionalBoolean(); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find any --------------------

    @Override public OptionalBoolean findAny(                                            ) { return emptyOptionalBoolean(); }
              public OptionalBoolean findAny(final @Nullable Object @Nullable ... ignored) { return emptyOptionalBoolean(); }

    //#endregion -------------------- Find any --------------------
    //#region -------------------- As stream --------------------

    public <U> EmptyParallelStream<U> asStream(                                            ) { return EmptyParallelStream.getInstance(); }
    public <U> EmptyParallelStream<U> asStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelStream.getInstance(); }

    @Contract(ALWAYS_THIS_0) public EmptyParallelBooleanStream asBooleanStream(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelBooleanStream asBooleanStream(final @Nullable Object @Nullable ... ignored) { return this; }

    public EmptyParallelCharStream asCharStream(                                            ) { return EmptyParallelCharStream.getInstance(); }
    public EmptyParallelCharStream asCharStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelCharStream.getInstance(); }

    public EmptyParallelByteStream asByteStream(                                            ) { return EmptyParallelByteStream.getInstance(); }
    public EmptyParallelByteStream asByteStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelByteStream.getInstance(); }

    public EmptyParallelShortStream asShortStream(                                            ) { return EmptyParallelShortStream.getInstance(); }
    public EmptyParallelShortStream asShortStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelShortStream.getInstance(); }

    public EmptyParallelIntStream asIntStream(                                            ) { return EmptyParallelIntStream.getInstance(); }
    public EmptyParallelIntStream asIntStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelIntStream.getInstance(); }

    public EmptyParallelLongStream asLongStream(                                            ) { return EmptyParallelLongStream.getInstance(); }
    public EmptyParallelLongStream asLongStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelLongStream.getInstance(); }

    public EmptyParallelFloatStream asFloatStream(                                            ) { return EmptyParallelFloatStream.getInstance(); }
    public EmptyParallelFloatStream asFloatStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelFloatStream.getInstance(); }

    public EmptyParallelDoubleStream asDoubleStream(                                            ) { return EmptyParallelDoubleStream.getInstance(); }
    public EmptyParallelDoubleStream asDoubleStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- As stream --------------------
    //#region -------------------- Boxed --------------------

    @Override public EmptyParallelStream<Boolean> boxed(                                            ) { return EmptyParallelStream.getInstance(); }
              public EmptyParallelStream<Boolean> boxed(final @Nullable Object @Nullable ... ignored) { return EmptyParallelStream.getInstance(); }

    //#endregion -------------------- Boxed --------------------
    //#region -------------------- Java methods --------------------

    @Override public EmptyBooleanIterator iterator() { return EmptyBooleanIterator.getInstance(); }
    @Override public BooleanSpliterator spliterator() { return emptyBooleanSpliterator(); }

    //#endregion -------------------- Java methods --------------------
    //#region -------------------- Close methods --------------------

    @Override public void close() {}
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelBooleanStream onClose(final @Nullable Runnable handler) { return this; }

    //#endregion -------------------- Close methods --------------------

    //#endregion -------------------- Methods --------------------

}
