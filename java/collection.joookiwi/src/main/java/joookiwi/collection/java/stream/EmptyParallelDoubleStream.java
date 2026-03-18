package joookiwi.collection.java.stream;

import java.util.DoubleSummaryStatistics;
import java.util.OptionalDouble;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionCreator;
import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.DoubleObjConsumer;
import joookiwi.collection.java.callback.additional.DoubleToBooleanFunction;
import joookiwi.collection.java.callback.additional.DoubleToByteFunction;
import joookiwi.collection.java.callback.additional.DoubleToCharFunction;
import joookiwi.collection.java.callback.additional.DoubleToFloatFunction;
import joookiwi.collection.java.callback.additional.DoubleToShortFunction;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.ObjDoubleFunction;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.extended.iterator.EmptyDoubleIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

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
import static joookiwi.collection.java.method.ArrayCreator.DoubleArray;

/// A parallel [DoubleStream] with nothing (as a [singleton][Singleton] instance)
///
/// @see EmptyParallelStream
/// @see EmptyParallelBooleanStream
/// @see EmptyParallelCharStream
/// @see EmptyParallelByteStream
/// @see EmptyParallelShortStream
/// @see EmptyParallelIntStream
/// @see EmptyParallelLongStream
/// @see EmptyParallelFloatStream
/// @see EmptySequentialDoubleStream
@Singleton
@NotNullByDefault
public class EmptyParallelDoubleStream
        implements DoubleStream {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyParallelDoubleStream instance;

    protected EmptyParallelDoubleStream() { super(); }

    public static EmptyParallelDoubleStream getInstance() {
        final var instance = EmptyParallelDoubleStream.instance;
        if (instance != null)
            return instance;
        synchronized (EmptyParallelDoubleStream.class) {
            final var instance2 = EmptyParallelDoubleStream.instance;
            if (instance2 != null)
                return instance2;
            return (EmptyParallelDoubleStream.instance = new EmptyParallelDoubleStream());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Is parallel --------------------

    @Contract(ALWAYS_TRUE_0) @Override public boolean isParallel(                                            ) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean isParallel(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- Is parallel --------------------
    //#region -------------------- Sequential --------------------

    @Override public EmptySequentialDoubleStream sequential(                                            ) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream sequential(final @Nullable Object @Nullable ... ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Sequential --------------------
    //#region -------------------- Parallel --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelDoubleStream parallel(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream parallel(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Parallel --------------------
    //#region -------------------- Unordered --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelDoubleStream unordered(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream unordered(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Unordered --------------------
    //#region -------------------- Filter --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelDoubleStream filter(final @Nullable DoublePredicate      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream filter(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream filter(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelDoubleStream map(final @Nullable DoubleUnaryOperator   mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream map(final @Nullable DoubleSupplier        mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream map(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public <U> EmptyParallelStream<U> mapToObj(final @Nullable DoubleFunction<? extends U> mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapToObj(final @Nullable Supplier<? extends U>       mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapToObj(final @Nullable Object @Nullable ...       ignored) { return EmptyParallelStream.getInstance(); }

    @Override public EmptyParallelBooleanStream mapToBoolean(final @Nullable DoubleToBooleanFunction mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapToBoolean(final @Nullable DoubleSupplier          mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapToBoolean(final @Nullable Object @Nullable ...   ignored) { return EmptyParallelBooleanStream.getInstance(); }

    @Override public EmptyParallelCharStream mapToChar(final @Nullable DoubleToCharFunction  mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapToChar(final @Nullable DoubleSupplier        mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapToChar(final @Nullable Object @Nullable ... ignored) { return EmptyParallelCharStream.getInstance(); }

    @Override public EmptyParallelByteStream mapToByte(final @Nullable DoubleToByteFunction  mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapToByte(final @Nullable DoubleSupplier        mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapToByte(final @Nullable Object @Nullable ... ignored) { return EmptyParallelByteStream.getInstance(); }

    @Override public EmptyParallelShortStream mapToShort(final @Nullable DoubleToShortFunction mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapToShort(final @Nullable DoubleSupplier        mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapToShort(final @Nullable Object @Nullable ... ignored) { return EmptyParallelShortStream.getInstance(); }

    @Override public EmptyParallelIntStream mapToInt(final @Nullable DoubleToIntFunction   mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapToInt(final @Nullable DoubleSupplier        mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapToInt(final @Nullable Object @Nullable ... ignored) { return EmptyParallelIntStream.getInstance(); }

    @Override public EmptyParallelLongStream mapToLong(final @Nullable DoubleToLongFunction  mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapToLong(final @Nullable DoubleSupplier        mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapToLong(final @Nullable Object @Nullable ... ignored) { return EmptyParallelLongStream.getInstance(); }

    @Override public EmptyParallelFloatStream mapToFloat(final @Nullable DoubleToFloatFunction mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapToFloat(final @Nullable DoubleSupplier        mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapToFloat(final @Nullable Object @Nullable ... ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptyParallelDoubleStream mapToDouble(final @Nullable DoubleUnaryOperator   mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelDoubleStream mapToDouble(final @Nullable DoubleSupplier        mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelDoubleStream mapToDouble(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Flat map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelDoubleStream flatMap(final @Nullable DoubleFunction<? extends java.util.stream.@Nullable DoubleStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream flatMap(final @Nullable Supplier<? extends @Nullable DoubleStream>                        mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream flatMap(final @Nullable Object @Nullable ...                                             ignored) { return this; }

    @Override public <U> EmptyParallelStream<U> flatMapToObj(final @Nullable DoubleFunction<? extends @Nullable Stream<? extends U>> mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> flatMapToObj(final @Nullable Supplier<? extends @Nullable Stream<? extends U>>       mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> flatMapToObj(final @Nullable Object @Nullable ...                                   ignored) { return EmptyParallelStream.getInstance(); }

    @Override public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable DoubleFunction<? extends @Nullable BooleanStream> mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable Supplier<? extends @Nullable BooleanStream>       mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable Object @Nullable ...                             ignored) { return EmptyParallelBooleanStream.getInstance(); }

    @Override public EmptyParallelCharStream flatMapToChar(final @Nullable DoubleFunction<? extends @Nullable CharStream> mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream flatMapToChar(final @Nullable Supplier<? extends @Nullable CharStream>       mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream flatMapToChar(final @Nullable Object @Nullable ...                          ignored) { return EmptyParallelCharStream.getInstance(); }

    @Override public EmptyParallelByteStream flatMapToByte(final @Nullable DoubleFunction<? extends @Nullable ByteStream> mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream flatMapToByte(final @Nullable Supplier<? extends @Nullable ByteStream>       mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream flatMapToByte(final @Nullable Object @Nullable ...                          ignored) { return EmptyParallelByteStream.getInstance(); }

    @Override public EmptyParallelShortStream flatMapToShort(final @Nullable DoubleFunction<? extends @Nullable ShortStream> mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream flatMapToShort(final @Nullable Supplier<? extends @Nullable ShortStream>       mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream flatMapToShort(final @Nullable Object @Nullable ...                           ignored) { return EmptyParallelShortStream.getInstance(); }

    @Override public EmptyParallelIntStream flatMapToInt(final @Nullable DoubleFunction<? extends @Nullable IntStream> mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream flatMapToInt(final @Nullable Supplier<? extends @Nullable IntStream>       mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream flatMapToInt(final @Nullable Object @Nullable ...                         ignored) { return EmptyParallelIntStream.getInstance(); }

    @Override public EmptyParallelLongStream flatMapToLong(final @Nullable DoubleFunction<? extends @Nullable LongStream> mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream flatMapToLong(final @Nullable Supplier<? extends @Nullable LongStream>       mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream flatMapToLong(final @Nullable Object @Nullable ...                          ignored) { return EmptyParallelLongStream.getInstance(); }

    @Override public EmptyParallelFloatStream flatMapToFloat(final @Nullable DoubleFunction<? extends @Nullable FloatStream> mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream flatMapToFloat(final @Nullable Supplier<? extends @Nullable FloatStream>       mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream flatMapToFloat(final @Nullable Object @Nullable ...                           ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptyParallelDoubleStream flatMapToDouble(final @Nullable DoubleFunction<? extends @Nullable DoubleStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelDoubleStream flatMapToDouble(final @Nullable Supplier<? extends @Nullable DoubleStream>       mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelDoubleStream flatMapToDouble(final @Nullable Object @Nullable ...                            ignored) { return this; }

    //#endregion -------------------- Flat map --------------------
    //#region -------------------- Map multi --------------------

    @Override public EmptyParallelDoubleStream mapMulti(final @Nullable DoubleMapMultiConsumer  mapper) { return this; }
              public EmptyParallelDoubleStream mapMulti(final @Nullable DoubleConsumer          mapper) { return this; }
              public EmptyParallelDoubleStream mapMulti(final @Nullable Runnable                mapper) { return this; }
              public EmptyParallelDoubleStream mapMulti(final @Nullable Object @Nullable ...   ignored) { return this; }

    @Override public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable DoubleObjConsumer<? super @Nullable Consumer<U>> mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable DoubleConsumer                                   mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable Runnable                                         mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable Object @Nullable ...                            ignored) { return EmptyParallelStream.getInstance(); }

    @Override public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable DoubleObjConsumer<? super @Nullable BooleanConsumer> mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable DoubleConsumer                                       mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable Runnable                                             mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable Object @Nullable ...                                ignored) { return EmptyParallelBooleanStream.getInstance(); }

    @Override public EmptyParallelCharStream mapMultiToChar(final @Nullable DoubleObjConsumer<? super @Nullable CharConsumer> mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapMultiToChar(final @Nullable DoubleConsumer                                    mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapMultiToChar(final @Nullable Runnable                                          mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapMultiToChar(final @Nullable Object @Nullable ...                             ignored) { return EmptyParallelCharStream.getInstance(); }

    @Override public EmptyParallelByteStream mapMultiToByte(final @Nullable DoubleObjConsumer<? super @Nullable ByteConsumer> mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapMultiToByte(final @Nullable DoubleConsumer                                    mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapMultiToByte(final @Nullable Runnable                                          mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapMultiToByte(final @Nullable Object @Nullable ...                             ignored) { return EmptyParallelByteStream.getInstance(); }

    @Override public EmptyParallelShortStream mapMultiToShort(final @Nullable DoubleObjConsumer<? super @Nullable ShortConsumer> mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapMultiToShort(final @Nullable DoubleConsumer                                     mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapMultiToShort(final @Nullable Runnable                                           mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapMultiToShort(final @Nullable Object @Nullable ...                              ignored) { return EmptyParallelShortStream.getInstance(); }

    @Override public EmptyParallelIntStream mapMultiToInt(final @Nullable DoubleObjConsumer<? super @Nullable IntConsumer> mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapMultiToInt(final @Nullable DoubleConsumer                                   mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapMultiToInt(final @Nullable Runnable                                         mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapMultiToInt(final @Nullable Object @Nullable ...                            ignored) { return EmptyParallelIntStream.getInstance(); }

    @Override public EmptyParallelLongStream mapMultiToLong(final @Nullable DoubleObjConsumer<? super @Nullable LongConsumer> mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapMultiToLong(final @Nullable DoubleConsumer                                    mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapMultiToLong(final @Nullable Runnable                                          mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapMultiToLong(final @Nullable Object @Nullable ...                             ignored) { return EmptyParallelLongStream.getInstance(); }

    @Override public EmptyParallelFloatStream mapMultiToFloat(final @Nullable DoubleObjConsumer<? super @Nullable FloatConsumer> mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapMultiToFloat(final @Nullable DoubleConsumer                                     mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapMultiToFloat(final @Nullable Runnable                                           mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapMultiToFloat(final @Nullable Object @Nullable ...                              ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable DoubleObjConsumer<? super @Nullable DoubleConsumer> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable DoubleConsumer                                      mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable Runnable                                            mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable Object @Nullable ...                               ignored) { return this; }

    //#endregion -------------------- Map multi --------------------
    //#region -------------------- Distinct --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelDoubleStream distinct(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream distinct(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Distinct --------------------
    //#region -------------------- Sorted --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelDoubleStream sorted(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream sorted(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sorted --------------------
    //#region -------------------- Peek --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelDoubleStream peek(final @Nullable DoubleConsumer        action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream peek(final @Nullable Runnable              action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream peek(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Peek --------------------
    //#region -------------------- Limit --------------------

    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream limit(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream limit(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream limit(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelDoubleStream limit(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream limit(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream limit(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream limit(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream limit(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream limit(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Limit --------------------
    //#region -------------------- Skip --------------------

    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream skip(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream skip(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream skip(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelDoubleStream skip(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream skip(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream skip(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream skip(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream skip(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream skip(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Skip --------------------
    //#region -------------------- Take while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelDoubleStream takeWhile(final @Nullable DoublePredicate    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream takeWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream takeWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Drop while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelDoubleStream dropWhile(final @Nullable DoublePredicate    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream dropWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelDoubleStream dropWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- For each --------------------

    @Override public void forEach(final @Nullable DoubleConsumer        action) {}
              public void forEach(final @Nullable Runnable              action) {}
              public void forEach(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each ordered --------------------

    @Override public void forEachOrdered(final @Nullable DoubleConsumer        action) {}
              public void forEachOrdered(final @Nullable Runnable              action) {}
              public void forEachOrdered(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each ordered --------------------
    //#region -------------------- To array --------------------

                           @Override public                              double[] toArray(                                ) { return DoubleArray(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> U[]      toArray(final IntFunction<U[]> generator) { return generator.apply(0); }

    //#endregion -------------------- To array --------------------
    //#region -------------------- Reduce --------------------

    @Contract(ALWAYS_1ST_1)           public final double reduce(final double initial                                                  ) { return initial; }
    @Contract(ALWAYS_1ST_2) @Override public final double reduce(final double initial, final @Nullable DoubleBinaryOperator accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final double reduce(final double initial, final @Nullable DoubleSupplier       accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final double reduce(final double initial, final @Nullable Object @Nullable ...     ignored) { return initial; }

    @Override public OptionalDouble reduce(final @Nullable DoubleBinaryOperator accumulator) { return OptionalDouble.empty(); }
              public OptionalDouble reduce(final @Nullable DoubleSupplier       accumulator) { return OptionalDouble.empty(); }
              public OptionalDouble reduce(final @Nullable Object @Nullable ...     ignored) { return OptionalDouble.empty(); }

    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjDoubleFunction<U, U> accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjDoubleFunction<U, U> accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjDoubleFunction<U, U> accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>          accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>          accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>          accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>             accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>             accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>             accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }

    //#endregion -------------------- Reduce --------------------
    //#region -------------------- Collect --------------------

    @Contract(ALWAYS_NULL_3) @Override public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjDoubleConsumer<R> accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjDoubleConsumer<R> accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjDoubleConsumer<R> accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjDoubleConsumer<R> accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>          accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>          accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>          accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>          accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable             accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable             accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable             accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable             accumulator, final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_2) public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_1) public <R extends @Nullable Object> R collect(final @Nullable Object @Nullable ... ignored) { return null; }

    //#endregion -------------------- Collect --------------------
    //#region -------------------- Sum --------------------

    @Override public @Range(from = 0, to = 0) double sum(                                            ) { return 0; }
              public @Range(from = 0, to = 0) double sum(final @Nullable Object @Nullable ... ignored) { return 0; }

    //#endregion -------------------- Sum --------------------
    //#region -------------------- Min --------------------

    @Override public OptionalDouble min(                                            ) { return OptionalDouble.empty(); }
              public OptionalDouble min(final @Nullable Object @Nullable ... ignored) { return OptionalDouble.empty(); }

    //#endregion -------------------- Min --------------------
    //#region -------------------- Max --------------------

    @Override public OptionalDouble max(                                            ) { return OptionalDouble.empty(); }
              public OptionalDouble max(final @Nullable Object @Nullable ... ignored) { return OptionalDouble.empty(); }

    //#endregion -------------------- Max --------------------
    //#region -------------------- Count --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) long count(                                            ) { return 0; }
    @Contract(pure = true)           public @Range(from = 0, to = 0) long count(final @Nullable Object @Nullable ... ignored) { return 0; }

    //#endregion -------------------- Count --------------------
    //#region -------------------- Average --------------------

    @Override public OptionalDouble average(                                            ) { return OptionalDouble.empty(); }
              public OptionalDouble average(final @Nullable Object @Nullable ... ignored) { return OptionalDouble.empty(); }

    //#endregion -------------------- Average --------------------
    //#region -------------------- Summary statistics --------------------

    @Override public DoubleSummaryStatistics summaryStatistics(                                            ) { return new DoubleSummaryStatistics(); }
              public DoubleSummaryStatistics summaryStatistics(final @Nullable Object @Nullable ... ignored) { return new DoubleSummaryStatistics(); }

    //#endregion -------------------- Summary statistics --------------------
    //#region -------------------- All match --------------------

    @Contract(ALWAYS_TRUE_1) @Override public boolean allMatch(final @Nullable DoublePredicate    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- All match --------------------
    //#region -------------------- Any match --------------------

    @Contract(ALWAYS_FALSE_0)           public boolean anyMatch(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1) @Override public boolean anyMatch(final @Nullable DoublePredicate    predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable BooleanSupplier    predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable Object @Nullable ... ignored) { return false; }

    //#endregion -------------------- Any match --------------------
    //#region -------------------- None match --------------------

    @Contract(ALWAYS_TRUE_0)           public boolean noneMatch(                                            ) { return true; }
    @Contract(ALWAYS_TRUE_1) @Override public boolean noneMatch(final @Nullable DoublePredicate    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- None match --------------------
    //#region -------------------- Find first --------------------

    @Override public OptionalDouble findFirst(                                            ) { return OptionalDouble.empty(); }
              public OptionalDouble findFirst(final @Nullable Object @Nullable ... ignored) { return OptionalDouble.empty(); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find any --------------------

    @Override public OptionalDouble findAny(                                            ) { return OptionalDouble.empty(); }
              public OptionalDouble findAny(final @Nullable Object @Nullable ... ignored) { return OptionalDouble.empty(); }

    //#endregion -------------------- Find any --------------------
    //#region -------------------- As stream --------------------

    public <U> EmptyParallelStream<U> asStream(                                            ) { return EmptyParallelStream.getInstance(); }
    public <U> EmptyParallelStream<U> asStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelStream.getInstance(); }

    public EmptyParallelBooleanStream asBooleanStream(                                            ) { return EmptyParallelBooleanStream.getInstance(); }
    public EmptyParallelBooleanStream asBooleanStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelBooleanStream.getInstance(); }

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

    @Contract(ALWAYS_THIS_0) public EmptyParallelDoubleStream asDoubleStream(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelDoubleStream asDoubleStream(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- As stream --------------------
    //#region -------------------- Boxed --------------------

    @Override public EmptyParallelStream<Double> boxed(                                            ) { return EmptyParallelStream.getInstance(); }
              public EmptyParallelStream<Double> boxed(final @Nullable Object @Nullable ... ignored) { return EmptyParallelStream.getInstance(); }

    //#endregion -------------------- Boxed --------------------
    //#region -------------------- Java methods --------------------

    @Override public EmptyDoubleIterator iterator() { return EmptyDoubleIterator.getInstance(); }
    @Override public Spliterator.OfDouble spliterator() { return CollectionCreator.getInstance().DoubleSpliterator(); }

    //#endregion -------------------- Java methods --------------------
    //#region -------------------- Close methods --------------------

    @Override public void close() {}
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelDoubleStream onClose(final @Nullable Runnable handler) { return this; }

    //#endregion -------------------- Close methods --------------------

    //#endregion -------------------- Methods --------------------

}
