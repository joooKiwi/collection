package joookiwi.collection.java.stream;

import java.util.OptionalDouble;
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
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.ByteBinaryOperator;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.ByteFunction;
import joookiwi.collection.java.callback.additional.ByteObjConsumer;
import joookiwi.collection.java.callback.additional.BytePredicate;
import joookiwi.collection.java.callback.additional.ByteSupplier;
import joookiwi.collection.java.callback.additional.ByteToBooleanFunction;
import joookiwi.collection.java.callback.additional.ByteToCharFunction;
import joookiwi.collection.java.callback.additional.ByteToDoubleFunction;
import joookiwi.collection.java.callback.additional.ByteToFloatFunction;
import joookiwi.collection.java.callback.additional.ByteToIntFunction;
import joookiwi.collection.java.callback.additional.ByteToLongFunction;
import joookiwi.collection.java.callback.additional.ByteToShortFunction;
import joookiwi.collection.java.callback.additional.ByteUnaryOperator;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.CharSupplier;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.FloatSupplier;
import joookiwi.collection.java.callback.additional.ObjByteConsumer;
import joookiwi.collection.java.callback.additional.ObjByteFunction;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.callback.additional.ShortSupplier;
import joookiwi.collection.java.extended.iterator.ByteSpliterator;
import joookiwi.collection.java.extended.iterator.EmptyByteIterator;
import joookiwi.collection.java.optional.OptionalByte;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CollectionConstants.emptyByteSpliterator;
import static joookiwi.collection.java.CollectionCreator.emptyOptionalByte;
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
import static joookiwi.collection.java.method.ArrayCreator.ByteArray;

/// A parallel [ByteStream] with nothing (as a [singleton][Singleton] instance)
///
/// @see EmptyParallelStream
/// @see EmptyParallelBooleanStream
/// @see EmptyParallelCharStream
/// @see EmptySequentialByteStream
/// @see EmptyParallelShortStream
/// @see EmptyParallelIntStream
/// @see EmptyParallelLongStream
/// @see EmptyParallelFloatStream
/// @see EmptyParallelDoubleStream
@Singleton
@NotNullByDefault
public class EmptyParallelByteStream
        implements ByteStream {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyParallelByteStream instance;

    protected EmptyParallelByteStream() { super(); }

    public static EmptyParallelByteStream getInstance() {
        final var instance = EmptyParallelByteStream.instance;
        if (instance != null)
            return instance;
        synchronized (EmptyParallelByteStream.class) {
            final var instance2 = EmptyParallelByteStream.instance;
            if (instance2 != null)
                return instance2;
            return (EmptyParallelByteStream.instance = new EmptyParallelByteStream());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Is parallel --------------------

    @Contract(ALWAYS_FALSE_0) @Override public boolean isParallel(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean isParallel(final @Nullable Object @Nullable ... ignored) { return false; }

    //#endregion -------------------- Is parallel --------------------
    //#region -------------------- Sequential --------------------

    @Override public EmptySequentialByteStream sequential(                                            ) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream sequential(final @Nullable Object @Nullable ... ignored) { return EmptySequentialByteStream.getInstance(); }

    //#endregion -------------------- Sequential --------------------
    //#region -------------------- Parallel --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelByteStream parallel(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream parallel(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Parallel --------------------
    //#region -------------------- Unordered --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelByteStream unordered(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream unordered(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Unordered --------------------
    //#region -------------------- Filter --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelByteStream filter(final @Nullable BytePredicate       predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream filter(final @Nullable BooleanSupplier     predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream filter(final @Nullable Object @Nullable ...  ignored) { return this; }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelByteStream map(final @Nullable ByteUnaryOperator     mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream map(final @Nullable ByteSupplier          mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream map(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public <U> EmptyParallelStream<U> mapToObj(final @Nullable ByteFunction<? extends U> mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapToObj(final @Nullable Supplier<? extends U>     mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapToObj(final @Nullable Object @Nullable ...      ignored) { return EmptyParallelStream.getInstance(); }

    @Override public EmptyParallelBooleanStream mapToBoolean(final @Nullable ByteToBooleanFunction  mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapToBoolean(final @Nullable BooleanSupplier        mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapToBoolean(final @Nullable Object @Nullable ...  ignored) { return EmptyParallelBooleanStream.getInstance(); }

    @Override public EmptyParallelCharStream mapToChar(final @Nullable ByteToCharFunction    mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapToChar(final @Nullable CharSupplier          mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapToChar(final @Nullable Object @Nullable ... ignored) { return EmptyParallelCharStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptyParallelByteStream mapToByte(final @Nullable ByteUnaryOperator     mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelByteStream mapToByte(final @Nullable ByteSupplier          mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelByteStream mapToByte(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public EmptyParallelShortStream mapToShort(final @Nullable ByteToShortFunction   mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapToShort(final @Nullable ShortSupplier         mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapToShort(final @Nullable Object @Nullable ... ignored) { return EmptyParallelShortStream.getInstance(); }

    @Override public EmptyParallelIntStream mapToInt(final @Nullable ByteToIntFunction     mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapToInt(final @Nullable IntSupplier           mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapToInt(final @Nullable Object @Nullable ... ignored) { return EmptyParallelIntStream.getInstance(); }

    @Override public EmptyParallelLongStream mapToLong(final @Nullable ByteToLongFunction   mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapToLong(final @Nullable LongSupplier          mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapToLong(final @Nullable Object @Nullable ... ignored) { return EmptyParallelLongStream.getInstance(); }

    @Override public EmptyParallelFloatStream mapToFloat(final @Nullable ByteToFloatFunction   mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapToFloat(final @Nullable FloatSupplier         mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapToFloat(final @Nullable Object @Nullable ... ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Override public EmptyParallelDoubleStream mapToDouble(final @Nullable ByteToDoubleFunction  mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapToDouble(final @Nullable DoubleSupplier        mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapToDouble(final @Nullable Object @Nullable ... ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Flat map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelByteStream flatMap(final @Nullable ByteFunction<? extends @Nullable ByteStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream flatMap(final @Nullable Supplier<? extends @Nullable ByteStream>     mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream flatMap(final @Nullable Object @Nullable ...                        ignored) { return this; }

    @Override public <U> EmptyParallelStream<U> flatMapToObj(final @Nullable ByteFunction<? extends @Nullable Stream<? extends U>> mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> flatMapToObj(final @Nullable Supplier<? extends @Nullable Stream<? extends U>>     mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> flatMapToObj(final @Nullable Object @Nullable ...                                 ignored) { return EmptyParallelStream.getInstance(); }

    @Override public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable ByteFunction<? extends @Nullable BooleanStream> mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable Supplier<? extends @Nullable BooleanStream>     mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable Object @Nullable ...                           ignored) { return EmptyParallelBooleanStream.getInstance(); }

    @Override public EmptyParallelCharStream flatMapToChar(final @Nullable ByteFunction<? extends @Nullable CharStream> mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream flatMapToChar(final @Nullable Supplier<? extends @Nullable CharStream>     mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream flatMapToChar(final @Nullable Object @Nullable ...                        ignored) { return EmptyParallelCharStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptyParallelByteStream flatMapToByte(final @Nullable ByteFunction<? extends @Nullable ByteStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelByteStream flatMapToByte(final @Nullable Supplier<? extends @Nullable ByteStream>     mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelByteStream flatMapToByte(final @Nullable Object @Nullable ...                        ignored) { return this; }

    @Override public EmptyParallelShortStream flatMapToShort(final @Nullable ByteFunction<? extends @Nullable ShortStream> mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream flatMapToShort(final @Nullable Supplier<? extends @Nullable ShortStream>     mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream flatMapToShort(final @Nullable Object @Nullable ...                         ignored) { return EmptyParallelShortStream.getInstance(); }

    @Override public EmptyParallelIntStream flatMapToInt(final @Nullable ByteFunction<? extends @Nullable IntStream> mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream flatMapToInt(final @Nullable Supplier<? extends @Nullable IntStream>     mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream flatMapToInt(final @Nullable Object @Nullable ...                       ignored) { return EmptyParallelIntStream.getInstance(); }

    @Override public EmptyParallelLongStream flatMapToLong(final @Nullable ByteFunction<? extends @Nullable LongStream> mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream flatMapToLong(final @Nullable Supplier<? extends @Nullable LongStream>     mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream flatMapToLong(final @Nullable Object @Nullable ...                        ignored) { return EmptyParallelLongStream.getInstance(); }

    @Override public EmptyParallelFloatStream flatMapToFloat(final @Nullable ByteFunction<? extends @Nullable FloatStream> mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream flatMapToFloat(final @Nullable Supplier<? extends @Nullable FloatStream>     mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream flatMapToFloat(final @Nullable Object @Nullable ...                         ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Override public EmptyParallelDoubleStream flatMapToDouble(final @Nullable ByteFunction<? extends @Nullable DoubleStream> mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream flatMapToDouble(final @Nullable Supplier<? extends @Nullable DoubleStream>     mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream flatMapToDouble(final @Nullable Object @Nullable ...                          ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- Flat map --------------------
    //#region -------------------- Map multi --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelByteStream mapMulti(final @Nullable ByteObjConsumer<? super ByteConsumer> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream mapMulti(final @Nullable ByteConsumer                          mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream mapMulti(final @Nullable Runnable                              mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream mapMulti(final @Nullable Object @Nullable ...                 ignored) { return this; }

    @Override public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable ByteObjConsumer<? super @Nullable Consumer<U>> mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable ByteConsumer                                   mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable Runnable                                       mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable Object @Nullable ...                          ignored) { return EmptyParallelStream.getInstance(); }

    @Override public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable ByteObjConsumer<? super @Nullable BooleanConsumer> mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable ByteConsumer                                       mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable Runnable                                           mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable Object @Nullable ...                              ignored) { return EmptyParallelBooleanStream.getInstance(); }

    @Override public EmptyParallelCharStream mapMultiToChar(final @Nullable ByteObjConsumer<? super @Nullable CharConsumer> mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapMultiToChar(final @Nullable ByteConsumer                                    mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapMultiToChar(final @Nullable Runnable                                        mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapMultiToChar(final @Nullable Object @Nullable ...                           ignored) { return EmptyParallelCharStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptyParallelByteStream mapMultiToByte(final @Nullable ByteObjConsumer<? super ByteConsumer> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelByteStream mapMultiToByte(final @Nullable ByteConsumer                          mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelByteStream mapMultiToByte(final @Nullable Runnable                              mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelByteStream mapMultiToByte(final @Nullable Object @Nullable ...                 ignored) { return this; }

    @Override public EmptyParallelShortStream mapMultiToShort(final @Nullable ByteObjConsumer<? super @Nullable ShortConsumer> mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapMultiToShort(final @Nullable ByteConsumer                                     mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapMultiToShort(final @Nullable Runnable                                         mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapMultiToShort(final @Nullable Object @Nullable ...                            ignored) { return EmptyParallelShortStream.getInstance(); }

    @Override public EmptyParallelIntStream mapMultiToInt(final @Nullable ByteObjConsumer<? super @Nullable IntConsumer> mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapMultiToInt(final @Nullable ByteConsumer                                   mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapMultiToInt(final @Nullable Runnable                                       mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapMultiToInt(final @Nullable Object @Nullable ...                          ignored) { return EmptyParallelIntStream.getInstance(); }

    @Override public EmptyParallelLongStream mapMultiToLong(final @Nullable ByteObjConsumer<? super @Nullable LongConsumer> mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapMultiToLong(final @Nullable ByteConsumer                                    mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapMultiToLong(final @Nullable Runnable                                        mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapMultiToLong(final @Nullable Object @Nullable ...                           ignored) { return EmptyParallelLongStream.getInstance(); }

    @Override public EmptyParallelFloatStream mapMultiToFloat(final @Nullable ByteObjConsumer<? super @Nullable FloatConsumer> mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapMultiToFloat(final @Nullable ByteConsumer                                     mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapMultiToFloat(final @Nullable Runnable                                         mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapMultiToFloat(final @Nullable Object @Nullable ...                            ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Override public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable ByteObjConsumer<? super @Nullable DoubleConsumer> mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable ByteConsumer                                      mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable Runnable                                          mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable Object @Nullable ...                             ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- Map multi --------------------
    //#region -------------------- Distinct --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelByteStream distinct(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream distinct(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Distinct --------------------
    //#region -------------------- Sorted --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelByteStream sorted(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream sorted(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sorted --------------------
    //#region -------------------- Peek --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelByteStream peek(final @Nullable ByteConsumer          action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream peek(final @Nullable Runnable              action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream peek(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Peek --------------------
    //#region -------------------- Limit --------------------

    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream limit(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream limit(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream limit(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelByteStream limit(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream limit(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream limit(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream limit(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream limit(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream limit(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Limit --------------------
    //#region -------------------- Skip --------------------

    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream skip(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream skip(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream skip(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelByteStream skip(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream skip(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream skip(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream skip(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream skip(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream skip(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Skip --------------------
    //#region -------------------- Take while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelByteStream takeWhile(final @Nullable BytePredicate      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream takeWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream takeWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Drop while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelByteStream dropWhile(final @Nullable BytePredicate      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream dropWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelByteStream dropWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- For each --------------------

    @Override public void forEach(final @Nullable ByteConsumer          action) {}
              public void forEach(final @Nullable Runnable              action) {}
              public void forEach(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each ordered --------------------

    @Override public void forEachOrdered(final @Nullable ByteConsumer          action) {}
              public void forEachOrdered(final @Nullable Runnable              action) {}
              public void forEachOrdered(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each ordered --------------------
    //#region -------------------- To array --------------------

                           @Override public                              byte[] toArray(                                ) { return ByteArray(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> U[]    toArray(final IntFunction<U[]> generator) { return generator.apply(0); }

    //#endregion -------------------- To array --------------------
    //#region -------------------- Reduce --------------------

    @Contract(ALWAYS_1ST_1)           public final byte reduce(final byte initial                                                ) { return initial; }
    @Contract(ALWAYS_1ST_2) @Override public final byte reduce(final byte initial, final @Nullable ByteBinaryOperator accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final byte reduce(final byte initial, final @Nullable ByteSupplier       accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final byte reduce(final byte initial, final @Nullable Object @Nullable ...   ignored) { return initial; }

    @Override public OptionalByte reduce(final @Nullable ByteBinaryOperator accumulator) { return emptyOptionalByte(); }
              public OptionalByte reduce(final @Nullable ByteSupplier       accumulator) { return emptyOptionalByte(); }
              public OptionalByte reduce(final @Nullable Object @Nullable ...   ignored) { return emptyOptionalByte(); }

    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjByteFunction<U, U> accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjByteFunction<U, U> accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjByteFunction<U, U> accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>        accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>        accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>        accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>           accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>           accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>           accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }

    //#endregion -------------------- Reduce --------------------
    //#region -------------------- Collect --------------------

    @Contract(ALWAYS_NULL_3) @Override public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjByteConsumer<R> accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjByteConsumer<R> accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjByteConsumer<R> accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjByteConsumer<R> accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>        accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>        accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>        accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>        accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable           accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable           accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable           accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable           accumulator, final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_2) public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_1) public <R extends @Nullable Object> R collect(final @Nullable Object @Nullable ... ignored) { return null; }

    //#endregion -------------------- Collect --------------------
    //#region -------------------- Sum --------------------

    @Override public @Range(from = 0, to = 0) byte sum(                                            ) { return 0; }
              public @Range(from = 0, to = 0) byte sum(final @Nullable Object @Nullable ... ignored) { return 0; }

    //#endregion -------------------- Sum --------------------
    //#region -------------------- Min --------------------

    @Override public OptionalByte min(                                            ) { return emptyOptionalByte(); }
              public OptionalByte min(final @Nullable Object @Nullable ... ignored) { return emptyOptionalByte(); }

    //#endregion -------------------- Min --------------------
    //#region -------------------- Max --------------------

    @Override public OptionalByte max(                                            ) { return emptyOptionalByte(); }
              public OptionalByte max(final @Nullable Object @Nullable ... ignored) { return emptyOptionalByte(); }

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

    @Override public ByteSummaryStatistics summaryStatistics(                                            ) { return new ByteSummaryStatistics(); }
              public ByteSummaryStatistics summaryStatistics(final @Nullable Object @Nullable ... ignored) { return new ByteSummaryStatistics(); }

    //#endregion -------------------- Summary statistics --------------------
    //#region -------------------- All match --------------------

    @Contract(ALWAYS_TRUE_1) @Override public boolean allMatch(final @Nullable BytePredicate      predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- All match --------------------
    //#region -------------------- Any match --------------------

    @Contract(ALWAYS_FALSE_0)           public boolean anyMatch(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1) @Override public boolean anyMatch(final @Nullable BytePredicate      predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable BooleanSupplier    predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable Object @Nullable ... ignored) { return false; }

    //#endregion -------------------- Any match --------------------
    //#region -------------------- None match --------------------

    @Contract(ALWAYS_TRUE_0)           public boolean noneMatch(                                            ) { return true; }
    @Contract(ALWAYS_TRUE_1) @Override public boolean noneMatch(final @Nullable BytePredicate      predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- None match --------------------
    //#region -------------------- Find first --------------------

    @Override public OptionalByte findFirst(                                            ) { return emptyOptionalByte(); }
              public OptionalByte findFirst(final @Nullable Object @Nullable ... ignored) { return emptyOptionalByte(); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find any --------------------

    @Override public OptionalByte findAny(                                            ) { return emptyOptionalByte(); }
              public OptionalByte findAny(final @Nullable Object @Nullable ... ignored) { return emptyOptionalByte(); }

    //#endregion -------------------- Find any --------------------
    //#region -------------------- As stream --------------------

    public <U> EmptyParallelStream<U> asStream(                                            ) { return EmptyParallelStream.getInstance(); }
    public <U> EmptyParallelStream<U> asStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelStream.getInstance(); }

    public EmptyParallelBooleanStream asBooleanStream(                                            ) { return EmptyParallelBooleanStream.getInstance(); }
    public EmptyParallelBooleanStream asBooleanStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelBooleanStream.getInstance(); }

    public EmptyParallelCharStream asCharStream(                                            ) { return EmptyParallelCharStream.getInstance(); }
    public EmptyParallelCharStream asCharStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelCharStream.getInstance(); }

    @Contract(ALWAYS_THIS_0) public EmptyParallelByteStream asByteStream(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelByteStream asByteStream(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public EmptyParallelShortStream asShortStream(                                            ) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream asShortStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelShortStream.getInstance(); }

    @Override public EmptyParallelIntStream asIntStream(                                            ) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream asIntStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelIntStream.getInstance(); }

    @Override public EmptyParallelLongStream asLongStream(                                            ) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream asLongStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelLongStream.getInstance(); }

    @Override public EmptyParallelFloatStream asFloatStream(                                            ) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream asFloatStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Override public EmptyParallelDoubleStream asDoubleStream(                                            ) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream asDoubleStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- As stream --------------------
    //#region -------------------- Boxed --------------------

    @Override public EmptyParallelStream<Byte> boxed(                                            ) { return EmptyParallelStream.getInstance(); }
              public EmptyParallelStream<Byte> boxed(final @Nullable Object @Nullable ... ignored) { return EmptyParallelStream.getInstance(); }

    //#endregion -------------------- Boxed --------------------
    //#region -------------------- Java methods --------------------

    @Override public EmptyByteIterator iterator() { return EmptyByteIterator.getInstance(); }
    @Override public ByteSpliterator spliterator() { return emptyByteSpliterator(); }

    //#endregion -------------------- Java methods --------------------
    //#region -------------------- Close methods --------------------

    @Override public void close() {}
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelByteStream onClose(final @Nullable Runnable handler) { return this; }

    //#endregion -------------------- Close methods --------------------

    //#endregion -------------------- Methods --------------------

}
