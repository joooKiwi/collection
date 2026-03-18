package joookiwi.collection.java.stream;

import java.util.OptionalDouble;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.stream.Stream;
import joookiwi.collection.java.CollectionCreator;
import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.ByteSupplier;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.CharSupplier;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.FloatSupplier;
import joookiwi.collection.java.callback.additional.ObjShortConsumer;
import joookiwi.collection.java.callback.additional.ObjShortFunction;
import joookiwi.collection.java.callback.additional.ShortBinaryOperator;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.callback.additional.ShortFunction;
import joookiwi.collection.java.callback.additional.ShortObjConsumer;
import joookiwi.collection.java.callback.additional.ShortPredicate;
import joookiwi.collection.java.callback.additional.ShortSupplier;
import joookiwi.collection.java.callback.additional.ShortToBooleanFunction;
import joookiwi.collection.java.callback.additional.ShortToByteFunction;
import joookiwi.collection.java.callback.additional.ShortToCharFunction;
import joookiwi.collection.java.callback.additional.ShortToDoubleFunction;
import joookiwi.collection.java.callback.additional.ShortToFloatFunction;
import joookiwi.collection.java.callback.additional.ShortToIntFunction;
import joookiwi.collection.java.callback.additional.ShortToLongFunction;
import joookiwi.collection.java.callback.additional.ShortUnaryOperator;
import joookiwi.collection.java.extended.iterator.EmptyShortIterator;
import joookiwi.collection.java.optional.OptionalShort;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CollectionCreator.emptyOptionalShort;
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
import static joookiwi.collection.java.method.ArrayCreator.ShortArray;

/// A parallel [ShortStream] with nothing (as a [singleton][Singleton] instance)
///
/// @see EmptyParallelStream
/// @see EmptyParallelBooleanStream
/// @see EmptyParallelCharStream
/// @see EmptyParallelByteStream
/// @see EmptySequentialShortStream
/// @see EmptyParallelIntStream
/// @see EmptyParallelLongStream
/// @see EmptyParallelFloatStream
/// @see EmptyParallelDoubleStream
@Singleton
@NotNullByDefault
public class EmptyParallelShortStream
        implements ShortStream {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyParallelShortStream instance;

    protected EmptyParallelShortStream() { super(); }

    public static EmptyParallelShortStream getInstance() {
        final var instance = EmptyParallelShortStream.instance;
        if (instance != null)
            return instance;
        synchronized (EmptyParallelShortStream.class) {
            final var instance2 = EmptyParallelShortStream.instance;
            if (instance2 != null)
                return instance2;
            return (EmptyParallelShortStream.instance = new EmptyParallelShortStream());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Is parallel --------------------

    @Contract(ALWAYS_TRUE_0) @Override public boolean isParallel(                                            ) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean isParallel(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- Is parallel --------------------
    //#region -------------------- Sequential --------------------

    @Override public EmptySequentialShortStream sequential(                                            ) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream sequential(final @Nullable Object @Nullable ... ignored) { return EmptySequentialShortStream.getInstance(); }

    //#endregion -------------------- Sequential --------------------
    //#region -------------------- Parallel --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelShortStream parallel(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream parallel(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Parallel --------------------
    //#region -------------------- Unordered --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelShortStream unordered(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream unordered(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Unordered --------------------
    //#region -------------------- Filter --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelShortStream filter(final @Nullable ShortPredicate       predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream filter(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream filter(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelShortStream map(final @Nullable ShortUnaryOperator    mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream map(final @Nullable ShortSupplier         mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream map(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public <U extends @Nullable Object> EmptyParallelStream<U> mapToObj(final @Nullable ShortFunction<? extends U> mapper) { return EmptyParallelStream.getInstance(); }
              public <U extends @Nullable Object> EmptyParallelStream<U> mapToObj(final @Nullable Supplier<? extends U>      mapper) { return EmptyParallelStream.getInstance(); }
              public <U extends @Nullable Object> EmptyParallelStream<U> mapToObj(final @Nullable Object @Nullable ...      ignored) { return EmptyParallelStream.getInstance(); }

    @Override public EmptyParallelBooleanStream mapToBoolean(final @Nullable ShortToBooleanFunction mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapToBoolean(final @Nullable BooleanSupplier        mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapToBoolean(final @Nullable Object @Nullable ...  ignored) { return EmptyParallelBooleanStream.getInstance(); }

    @Override public EmptyParallelCharStream mapToChar(final @Nullable ShortToCharFunction   mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapToChar(final @Nullable CharSupplier          mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapToChar(final @Nullable Object @Nullable ... ignored) { return EmptyParallelCharStream.getInstance(); }

    @Override public EmptyParallelByteStream mapToByte(final @Nullable ShortToByteFunction   mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapToByte(final @Nullable ByteSupplier          mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapToByte(final @Nullable Object @Nullable ... ignored) { return EmptyParallelByteStream.getInstance(); }

    @Override public EmptyParallelIntStream mapToInt(final @Nullable ShortToIntFunction    mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapToInt(final @Nullable IntSupplier           mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapToInt(final @Nullable Object @Nullable ... ignored) { return EmptyParallelIntStream.getInstance(); }

    @Override public EmptyParallelLongStream mapToLong(final @Nullable ShortToLongFunction   mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapToLong(final @Nullable LongSupplier          mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapToLong(final @Nullable Object @Nullable ... ignored) { return EmptyParallelLongStream.getInstance(); }

    @Override public EmptyParallelFloatStream mapToFloat(final @Nullable ShortToFloatFunction  mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapToFloat(final @Nullable FloatSupplier         mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapToFloat(final @Nullable Object @Nullable ... ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Override public EmptyParallelDoubleStream mapToDouble(final @Nullable ShortToDoubleFunction mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapToDouble(final @Nullable DoubleSupplier        mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapToDouble(final @Nullable Object @Nullable ... ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Flat map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelShortStream flatMap(final @Nullable ShortFunction<? extends @Nullable ShortStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream flatMap(final @Nullable Supplier<? extends @Nullable ShortStream>      mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream flatMap(final @Nullable Object @Nullable ...                          ignored) { return this; }

    public <U extends @Nullable Object> EmptyParallelStream<U> flatMapToObj(final @Nullable ShortFunction<? extends @Nullable Stream<? extends U>> mapper) { return EmptyParallelStream.getInstance(); }
    public <U extends @Nullable Object> EmptyParallelStream<U> flatMapToObj(final @Nullable Supplier<? extends @Nullable Stream<? extends U>>      mapper) { return EmptyParallelStream.getInstance(); }
    public <U extends @Nullable Object> EmptyParallelStream<U> flatMapToObj(final @Nullable Object @Nullable ...                                  ignored) { return EmptyParallelStream.getInstance(); }

    public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable ShortFunction<? extends @Nullable BooleanStream> mapper) { return EmptyParallelBooleanStream.getInstance(); }
    public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable Supplier<? extends @Nullable BooleanStream>      mapper) { return EmptyParallelBooleanStream.getInstance(); }
    public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable Object @Nullable ...                            ignored) { return EmptyParallelBooleanStream.getInstance(); }

    public EmptyParallelCharStream flatMapToChar(final @Nullable ShortFunction<? extends @Nullable CharStream> mapper) { return EmptyParallelCharStream.getInstance(); }
    public EmptyParallelCharStream flatMapToChar(final @Nullable Supplier<? extends @Nullable CharStream>      mapper) { return EmptyParallelCharStream.getInstance(); }
    public EmptyParallelCharStream flatMapToChar(final @Nullable Object @Nullable ...                         ignored) { return EmptyParallelCharStream.getInstance(); }

    public EmptyParallelByteStream flatMapToByte(final @Nullable ShortFunction<? extends @Nullable ByteStream> mapper) { return EmptyParallelByteStream.getInstance(); }
    public EmptyParallelByteStream flatMapToByte(final @Nullable Supplier<? extends @Nullable ByteStream>      mapper) { return EmptyParallelByteStream.getInstance(); }
    public EmptyParallelByteStream flatMapToByte(final @Nullable Object @Nullable ...                        ignored) { return EmptyParallelByteStream.getInstance(); }

    public EmptyParallelIntStream flatMapToInt(final @Nullable ShortFunction<? extends @Nullable IntStream> mapper) { return EmptyParallelIntStream.getInstance(); }
    public EmptyParallelIntStream flatMapToInt(final @Nullable Supplier<? extends @Nullable IntStream>      mapper) { return EmptyParallelIntStream.getInstance(); }
    public EmptyParallelIntStream flatMapToInt(final @Nullable Object @Nullable ...                        ignored) { return EmptyParallelIntStream.getInstance(); }

    public EmptyParallelLongStream flatMapToLong(final @Nullable ShortFunction<? extends @Nullable LongStream> mapper) { return EmptyParallelLongStream.getInstance(); }
    public EmptyParallelLongStream flatMapToLong(final @Nullable Supplier<? extends @Nullable LongStream>      mapper) { return EmptyParallelLongStream.getInstance(); }
    public EmptyParallelLongStream flatMapToLong(final @Nullable Object @Nullable ...                         ignored) { return EmptyParallelLongStream.getInstance(); }

    public EmptyParallelFloatStream flatMapToFloat(final @Nullable ShortFunction<? extends @Nullable FloatStream> mapper) { return EmptyParallelFloatStream.getInstance(); }
    public EmptyParallelFloatStream flatMapToFloat(final @Nullable Supplier<? extends @Nullable FloatStream>      mapper) { return EmptyParallelFloatStream.getInstance(); }
    public EmptyParallelFloatStream flatMapToFloat(final @Nullable Object @Nullable ...                          ignored) { return EmptyParallelFloatStream.getInstance(); }

    public EmptyParallelDoubleStream flatMapToDouble(final @Nullable ShortFunction<? extends @Nullable DoubleStream> mapper) { return EmptyParallelDoubleStream.getInstance(); }
    public EmptyParallelDoubleStream flatMapToDouble(final @Nullable Supplier<? extends @Nullable DoubleStream>      mapper) { return EmptyParallelDoubleStream.getInstance(); }
    public EmptyParallelDoubleStream flatMapToDouble(final @Nullable Object @Nullable ...                           ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- Flat map --------------------
    //#region -------------------- Map multi --------------------

    @Override public EmptyParallelShortStream mapMulti(final @Nullable ShortObjConsumer<? super ShortConsumer> mapper) { return this; }
              public EmptyParallelShortStream mapMulti(final @Nullable LongConsumer                            mapper) { return this; }
              public EmptyParallelShortStream mapMulti(final @Nullable Runnable                                mapper) { return this; }
              public EmptyParallelShortStream mapMulti(final @Nullable Object @Nullable ...                   ignored) { return this; }

    public <U extends @Nullable Object> EmptyParallelStream<U> mapMultiToObj(final @Nullable ShortObjConsumer<? super @Nullable Consumer<U>> mapper) { return EmptyParallelStream.getInstance(); }
    public <U extends @Nullable Object> EmptyParallelStream<U> mapMultiToObj(final @Nullable Consumer<U>                                     mapper) { return EmptyParallelStream.getInstance(); }
    public <U extends @Nullable Object> EmptyParallelStream<U> mapMultiToObj(final @Nullable Runnable                                        mapper) { return EmptyParallelStream.getInstance(); }
    public <U extends @Nullable Object> EmptyParallelStream<U> mapMultiToObj(final @Nullable Object @Nullable ...                           ignored) { return EmptyParallelStream.getInstance(); }

    public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable ShortObjConsumer<? super @Nullable BooleanConsumer> mapper) { return EmptyParallelBooleanStream.getInstance(); }
    public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable BooleanConsumer                                     mapper) { return EmptyParallelBooleanStream.getInstance(); }
    public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable Runnable                                            mapper) { return EmptyParallelBooleanStream.getInstance(); }
    public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable Object @Nullable ...                               ignored) { return EmptyParallelBooleanStream.getInstance(); }

    public EmptyParallelCharStream mapMultiToChar(final @Nullable ShortObjConsumer<? super @Nullable CharConsumer> mapper) { return EmptyParallelCharStream.getInstance(); }
    public EmptyParallelCharStream mapMultiToChar(final @Nullable CharConsumer                                     mapper) { return EmptyParallelCharStream.getInstance(); }
    public EmptyParallelCharStream mapMultiToChar(final @Nullable Runnable                                         mapper) { return EmptyParallelCharStream.getInstance(); }
    public EmptyParallelCharStream mapMultiToChar(final @Nullable Object @Nullable ...                            ignored) { return EmptyParallelCharStream.getInstance(); }

    public EmptyParallelByteStream mapMultiToByte(final @Nullable ShortObjConsumer<? super @Nullable ByteConsumer> mapper) { return EmptyParallelByteStream.getInstance(); }
    public EmptyParallelByteStream mapMultiToByte(final @Nullable ByteConsumer                                     mapper) { return EmptyParallelByteStream.getInstance(); }
    public EmptyParallelByteStream mapMultiToByte(final @Nullable Runnable                                         mapper) { return EmptyParallelByteStream.getInstance(); }
    public EmptyParallelByteStream mapMultiToByte(final @Nullable Object @Nullable ...                            ignored) { return EmptyParallelByteStream.getInstance(); }

    public EmptyParallelIntStream mapMultiToInt(final @Nullable ShortObjConsumer<? super @Nullable IntConsumer> mapper) { return EmptyParallelIntStream.getInstance(); }
    public EmptyParallelIntStream mapMultiToInt(final @Nullable IntConsumer                                     mapper) { return EmptyParallelIntStream.getInstance(); }
    public EmptyParallelIntStream mapMultiToInt(final @Nullable Runnable                                        mapper) { return EmptyParallelIntStream.getInstance(); }
    public EmptyParallelIntStream mapMultiToInt(final @Nullable Object @Nullable ...                           ignored) { return EmptyParallelIntStream.getInstance(); }

    public EmptyParallelLongStream mapMultiToLong(final @Nullable ShortObjConsumer<? super @Nullable LongConsumer> mapper) { return EmptyParallelLongStream.getInstance(); }
    public EmptyParallelLongStream mapMultiToLong(final @Nullable LongConsumer                                     mapper) { return EmptyParallelLongStream.getInstance(); }
    public EmptyParallelLongStream mapMultiToLong(final @Nullable Runnable                                         mapper) { return EmptyParallelLongStream.getInstance(); }
    public EmptyParallelLongStream mapMultiToLong(final @Nullable Object @Nullable ...                            ignored) { return EmptyParallelLongStream.getInstance(); }

    public EmptyParallelFloatStream mapMultiToFloat(final @Nullable ShortObjConsumer<? super @Nullable FloatConsumer> mapper) { return EmptyParallelFloatStream.getInstance(); }
    public EmptyParallelFloatStream mapMultiToFloat(final @Nullable FloatConsumer                                     mapper) { return EmptyParallelFloatStream.getInstance(); }
    public EmptyParallelFloatStream mapMultiToFloat(final @Nullable Runnable                                          mapper) { return EmptyParallelFloatStream.getInstance(); }
    public EmptyParallelFloatStream mapMultiToFloat(final @Nullable Object @Nullable ...                             ignored) { return EmptyParallelFloatStream.getInstance(); }

    public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable ShortObjConsumer<? super @Nullable DoubleConsumer> mapper) { return EmptyParallelDoubleStream.getInstance(); }
    public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable DoubleConsumer                                     mapper) { return EmptyParallelDoubleStream.getInstance(); }
    public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable Runnable                                           mapper) { return EmptyParallelDoubleStream.getInstance(); }
    public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable Object @Nullable ...                              ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- Map multi --------------------
    //#region -------------------- Distinct --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelShortStream distinct(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream distinct(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Distinct --------------------
    //#region -------------------- Sorted --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelShortStream sorted(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream sorted(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sorted --------------------
    //#region -------------------- Peek --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelShortStream peek(final @Nullable ShortConsumer         action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream peek(final @Nullable Runnable              action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream peek(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Peek --------------------
    //#region -------------------- Limit --------------------

    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream limit(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream limit(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream limit(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelShortStream limit(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream limit(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream limit(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream limit(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream limit(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream limit(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Limit --------------------
    //#region -------------------- Skip --------------------

    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream skip(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream skip(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream skip(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelShortStream skip(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream skip(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream skip(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream skip(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream skip(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream skip(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Skip --------------------
    //#region -------------------- Take while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelShortStream takeWhile(final @Nullable ShortPredicate     predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream takeWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream takeWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Drop while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelShortStream dropWhile(final @Nullable ShortPredicate     predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream dropWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelShortStream dropWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- For each --------------------

    @Override public void forEach(final @Nullable ShortConsumer         action) {}
              public void forEach(final @Nullable Runnable              action) {}
              public void forEach(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each ordered --------------------

    @Override public void forEachOrdered(final @Nullable ShortConsumer         action) {}
              public void forEachOrdered(final @Nullable Runnable              action) {}
              public void forEachOrdered(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each ordered --------------------
    //#region -------------------- To array --------------------

                           @Override public                              short[] toArray(                                 ) { return ShortArray(); }
    @Contract(pure = true)           public <U extends @Nullable Object> U[]     toArray(final LongFunction<U[]> generator) { return generator.apply(0); }

    //#endregion -------------------- To array --------------------
    //#region -------------------- Reduce --------------------

    @Contract(ALWAYS_1ST_1)           public final short reduce(final short initial                                                 ) { return initial; }
    @Contract(ALWAYS_1ST_2) @Override public final short reduce(final short initial, final @Nullable ShortBinaryOperator accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final short reduce(final short initial, final @Nullable ShortSupplier       accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final short reduce(final short initial, final @Nullable Object @Nullable ...    ignored) { return initial; }

    @Override public OptionalShort reduce(final @Nullable ShortBinaryOperator accumulator) { return emptyOptionalShort(); }
              public OptionalShort reduce(final @Nullable ShortSupplier       accumulator) { return emptyOptionalShort(); }
              public OptionalShort reduce(final @Nullable Object @Nullable ...    ignored) { return emptyOptionalShort(); }

    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjShortFunction<U, U> accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjShortFunction<U, U> accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjShortFunction<U, U> accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>         accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>         accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>         accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>            accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>            accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>            accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }

    //#endregion -------------------- Reduce --------------------
    //#region -------------------- Collect --------------------

    @Contract(ALWAYS_NULL_3) @Override public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjShortConsumer<R> accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjShortConsumer<R> accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjShortConsumer<R> accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjShortConsumer<R> accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>         accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>         accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>         accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>         accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable            accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable            accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable            accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable            accumulator, final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_2) public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_1) public <R extends @Nullable Object> R collect(final @Nullable Object @Nullable ... ignored) { return null; }

    //#endregion -------------------- Collect --------------------
    //#region -------------------- Sum --------------------

    @Override public @Range(from = 0, to = 0) short sum(                                            ) { return 0; }
              public @Range(from = 0, to = 0) short sum(final @Nullable Object @Nullable ... ignored) { return 0; }

    //#endregion -------------------- Sum --------------------
    //#region -------------------- Min --------------------

    @Override public OptionalShort min(                                            ) { return emptyOptionalShort(); }
              public OptionalShort min(final @Nullable Object @Nullable ... ignored) { return emptyOptionalShort(); }

    //#endregion -------------------- Min --------------------
    //#region -------------------- Max --------------------

    @Override public OptionalShort max(                                            ) { return emptyOptionalShort(); }
              public OptionalShort max(final @Nullable Object @Nullable ... ignored) { return emptyOptionalShort(); }

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

    @Override public ShortSummaryStatistics summaryStatistics(                                            ) { return new ShortSummaryStatistics(); }
              public ShortSummaryStatistics summaryStatistics(final @Nullable Object @Nullable ... ignored) { return new ShortSummaryStatistics(); }

    //#endregion -------------------- Summary statistics --------------------
    //#region -------------------- All match --------------------

    @Contract(ALWAYS_TRUE_1) @Override public boolean allMatch(final @Nullable ShortPredicate     predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- All match --------------------
    //#region -------------------- Any match --------------------

    @Contract(ALWAYS_FALSE_0)           public boolean anyMatch(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1) @Override public boolean anyMatch(final @Nullable ShortPredicate     predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable BooleanSupplier    predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable Object @Nullable ... ignored) { return false; }

    //#endregion -------------------- Any match --------------------
    //#region -------------------- None match --------------------

    @Contract(ALWAYS_TRUE_0)           public boolean noneMatch(                                            ) { return true; }
    @Contract(ALWAYS_TRUE_1) @Override public boolean noneMatch(final @Nullable ShortPredicate     predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- None match --------------------
    //#region -------------------- Find first --------------------

    @Override public OptionalShort findFirst(                                            ) { return emptyOptionalShort(); }
              public OptionalShort findFirst(final @Nullable Object @Nullable ... ignored) { return emptyOptionalShort(); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find any --------------------

    @Override public OptionalShort findAny(                                            ) { return emptyOptionalShort(); }
              public OptionalShort findAny(final @Nullable Object @Nullable ... ignored) { return emptyOptionalShort(); }

    //#endregion -------------------- Find any --------------------
    //#region -------------------- As stream --------------------

    public <U extends @Nullable Object> EmptyParallelStream<U> asStream(                                            ) { return EmptyParallelStream.getInstance(); }
    public <U extends @Nullable Object> EmptyParallelStream<U> asStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelStream.getInstance(); }

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

    @Override public EmptyParallelStream<Short> boxed(                                            ) { return EmptyParallelStream.getInstance(); }
              public EmptyParallelStream<Short> boxed(final @Nullable Object @Nullable ... ignored) { return EmptyParallelStream.getInstance(); }

    //#endregion -------------------- Boxed --------------------
    //#region -------------------- Java methods --------------------

    @Override public EmptyShortIterator iterator() { return EmptyShortIterator.getInstance(); }
    @Override public Spliterator.OfPrimitive<Short, ShortConsumer, ?> spliterator() { return CollectionCreator.getInstance().ShortSpliterator(); }

    //#endregion -------------------- Java methods --------------------
    //#region -------------------- Close methods --------------------

    @Override public void close() {}
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelShortStream onClose(final @Nullable Runnable handler) { return this; }

    //#endregion -------------------- Close methods --------------------

    //#endregion -------------------- Methods --------------------

}
