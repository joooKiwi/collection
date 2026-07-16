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
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.CharBinaryOperator;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.CharFunction;
import joookiwi.collection.java.callback.additional.CharObjConsumer;
import joookiwi.collection.java.callback.additional.CharPredicate;
import joookiwi.collection.java.callback.additional.CharSupplier;
import joookiwi.collection.java.callback.additional.CharToBooleanFunction;
import joookiwi.collection.java.callback.additional.CharToByteFunction;
import joookiwi.collection.java.callback.additional.CharToDoubleFunction;
import joookiwi.collection.java.callback.additional.CharToFloatFunction;
import joookiwi.collection.java.callback.additional.CharToIntFunction;
import joookiwi.collection.java.callback.additional.CharToLongFunction;
import joookiwi.collection.java.callback.additional.CharToShortFunction;
import joookiwi.collection.java.callback.additional.CharUnaryOperator;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.FloatSupplier;
import joookiwi.collection.java.callback.additional.ObjCharConsumer;
import joookiwi.collection.java.callback.additional.ObjCharFunction;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.callback.additional.ShortSupplier;
import joookiwi.collection.java.extended.iterator.CharSpliterator;
import joookiwi.collection.java.extended.iterator.EmptyCharIterator;
import joookiwi.collection.java.optional.EmptyOptionalChar;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CollectionConstants.emptyCharSpliterator;
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
import static joookiwi.collection.java.method.ArrayCreator.CharArray;

/// A parallel [CharStream] with nothing (as a [singleton][Singleton] instance)
///
/// @see EmptyParallelStream
/// @see EmptyParallelBooleanStream
/// @see EmptySequentialCharStream
/// @see EmptyParallelByteStream
/// @see EmptyParallelShortStream
/// @see EmptyParallelIntStream
/// @see EmptyParallelLongStream
/// @see EmptyParallelFloatStream
/// @see EmptyParallelDoubleStream
@Singleton
@NotNullByDefault
public class EmptyParallelCharStream
        implements CharStream {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyParallelCharStream instance;

    protected EmptyParallelCharStream() { super(); }

    public static EmptyParallelCharStream getInstance() {
        final var instance = EmptyParallelCharStream.instance;
        if (instance != null)
            return instance;
        synchronized (EmptyParallelCharStream.class) {
            final var instance2 = EmptyParallelCharStream.instance;
            if (instance2 != null)
                return instance2;
            return (EmptyParallelCharStream.instance = new EmptyParallelCharStream());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Is parallel --------------------

    @Contract(ALWAYS_TRUE_0) @Override public boolean isParallel(                                            ) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean isParallel(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- Is parallel --------------------
    //#region -------------------- Sequential --------------------

    @Override public EmptySequentialCharStream sequential(                                            ) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream sequential(final @Nullable Object @Nullable ... ignored) { return EmptySequentialCharStream.getInstance(); }

    //#endregion -------------------- Sequential --------------------
    //#region -------------------- Parallel --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelCharStream parallel(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream parallel(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Parallel --------------------
    //#region -------------------- Unordered --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelCharStream unordered(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream unordered(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Unordered --------------------
    //#region -------------------- Filter --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelCharStream filter(final @Nullable CharPredicate        predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream filter(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream filter(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelCharStream map(final @Nullable CharUnaryOperator     mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream map(final @Nullable CharSupplier          mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream map(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public <U> EmptyParallelStream<U> mapToObj(final @Nullable CharFunction<? extends U>    mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapToObj(final @Nullable Supplier<? extends U>        mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapToObj(final @Nullable Object @Nullable ...        ignored) { return EmptyParallelStream.getInstance(); }

    @Override public EmptyParallelBooleanStream mapToBoolean(final @Nullable CharToBooleanFunction mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapToBoolean(final @Nullable BooleanSupplier       mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapToBoolean(final @Nullable Object @Nullable ... ignored) { return EmptyParallelBooleanStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptyParallelCharStream mapToChar(final @Nullable CharUnaryOperator     mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelCharStream mapToChar(final @Nullable CharSupplier          mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelCharStream mapToChar(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public EmptyParallelByteStream mapToByte(final @Nullable CharToByteFunction     mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapToByte(final @Nullable CharSupplier           mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapToByte(final @Nullable Object @Nullable ...  ignored) { return EmptyParallelByteStream.getInstance(); }

    @Override public EmptyParallelShortStream mapToShort(final @Nullable CharToShortFunction    mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapToShort(final @Nullable ShortSupplier          mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapToShort(final @Nullable Object @Nullable ...  ignored) { return EmptyParallelShortStream.getInstance(); }

    @Override public EmptyParallelIntStream mapToInt(final @Nullable CharToIntFunction     mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapToInt(final @Nullable IntSupplier           mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapToInt(final @Nullable Object @Nullable ... ignored) { return EmptyParallelIntStream.getInstance(); }

    @Override public EmptyParallelLongStream mapToLong(final @Nullable CharToLongFunction    mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapToLong(final @Nullable LongSupplier          mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapToLong(final @Nullable Object @Nullable ... ignored) { return EmptyParallelLongStream.getInstance(); }

    @Override public EmptyParallelFloatStream mapToFloat(final @Nullable CharToFloatFunction    mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapToFloat(final @Nullable FloatSupplier          mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapToFloat(final @Nullable Object @Nullable ...  ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Override public EmptyParallelDoubleStream mapToDouble(final @Nullable CharToDoubleFunction    mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapToDouble(final @Nullable DoubleSupplier          mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapToDouble(final @Nullable Object @Nullable ...   ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Flat map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelCharStream flatMap(final @Nullable CharFunction<? extends @Nullable CharStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream flatMap(final @Nullable Supplier<? extends @Nullable CharStream>     mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream flatMap(final @Nullable Object @Nullable ...                        ignored) { return this; }

    @Override public <U> EmptyParallelStream<U> flatMapToObj(final @Nullable CharFunction<? extends @Nullable Stream<? extends U>> mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> flatMapToObj(final @Nullable Supplier<? extends @Nullable Stream<? extends U>>     mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> flatMapToObj(final @Nullable Object @Nullable ...                                 ignored) { return EmptyParallelStream.getInstance(); }

    @Override public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable CharFunction<? extends @Nullable BooleanStream> mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable Supplier<? extends @Nullable BooleanStream>     mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable Object @Nullable ...                           ignored) { return EmptyParallelBooleanStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptyParallelCharStream flatMapToChar(final @Nullable CharFunction<? extends @Nullable CharStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelCharStream flatMapToChar(final @Nullable Supplier<? extends @Nullable CharStream>     mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelCharStream flatMapToChar(final @Nullable Object @Nullable ...                        ignored) { return this; }

    @Override public EmptyParallelByteStream flatMapToByte(final @Nullable CharFunction<? extends @Nullable ByteStream> mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream flatMapToByte(final @Nullable Supplier<? extends @Nullable ByteStream>     mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream flatMapToByte(final @Nullable Object @Nullable ...                        ignored) { return EmptyParallelByteStream.getInstance(); }

    @Override public EmptyParallelShortStream flatMapToShort(final @Nullable CharFunction<? extends @Nullable ShortStream> mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream flatMapToShort(final @Nullable Supplier<? extends @Nullable ShortStream>     mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream flatMapToShort(final @Nullable Object @Nullable ...                         ignored) { return EmptyParallelShortStream.getInstance(); }

    @Override public EmptyParallelIntStream flatMapToInt(final @Nullable CharFunction<? extends @Nullable IntStream> mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream flatMapToInt(final @Nullable Supplier<? extends @Nullable IntStream>     mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream flatMapToInt(final @Nullable Object @Nullable ...                       ignored) { return EmptyParallelIntStream.getInstance(); }

    @Override public EmptyParallelLongStream flatMapToLong(final @Nullable CharFunction<? extends @Nullable LongStream> mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream flatMapToLong(final @Nullable Supplier<? extends @Nullable LongStream>     mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream flatMapToLong(final @Nullable Object @Nullable ...                        ignored) { return EmptyParallelLongStream.getInstance(); }

    @Override public EmptyParallelFloatStream flatMapToFloat(final @Nullable CharFunction<? extends @Nullable FloatStream> mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream flatMapToFloat(final @Nullable Supplier<? extends @Nullable FloatStream>     mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream flatMapToFloat(final @Nullable Object @Nullable ...                         ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Override public EmptyParallelDoubleStream flatMapToDouble(final @Nullable CharFunction<? extends @Nullable DoubleStream> mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream flatMapToDouble(final @Nullable Supplier<? extends @Nullable DoubleStream>     mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream flatMapToDouble(final @Nullable Object @Nullable ...                          ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- Flat map --------------------
    //#region -------------------- Map multi --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelCharStream mapMulti(final @Nullable CharObjConsumer<? super CharConsumer> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream mapMulti(final @Nullable CharConsumer                          mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream mapMulti(final @Nullable Runnable                              mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream mapMulti(final @Nullable Object @Nullable ...                 ignored) { return this; }

    @Override public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable CharObjConsumer<? super @Nullable Consumer<U>> mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable CharConsumer                                   mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable Runnable                                       mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable Object @Nullable ...                          ignored) { return EmptyParallelStream.getInstance(); }

    @Override public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable CharObjConsumer<? super @Nullable BooleanConsumer> mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable CharConsumer                                       mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable Runnable                                           mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable Object @Nullable ...                              ignored) { return EmptyParallelBooleanStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptyParallelCharStream mapMultiToChar(final @Nullable CharObjConsumer<? super CharConsumer> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelCharStream mapMultiToChar(final @Nullable CharConsumer                          mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelCharStream mapMultiToChar(final @Nullable Runnable                              mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelCharStream mapMultiToChar(final @Nullable Object @Nullable ...                 ignored) { return this; }

    @Override public EmptyParallelByteStream mapMultiToByte(final @Nullable CharObjConsumer<? super @Nullable ByteConsumer> mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapMultiToByte(final @Nullable CharConsumer                                    mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapMultiToByte(final @Nullable Runnable                                        mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapMultiToByte(final @Nullable Object @Nullable ...                           ignored) { return EmptyParallelByteStream.getInstance(); }

    @Override public EmptyParallelShortStream mapMultiToShort(final @Nullable CharObjConsumer<? super @Nullable ShortConsumer> mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapMultiToShort(final @Nullable CharConsumer                                     mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapMultiToShort(final @Nullable Runnable                                         mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapMultiToShort(final @Nullable Object @Nullable ...                            ignored) { return EmptyParallelShortStream.getInstance(); }

    @Override public EmptyParallelIntStream mapMultiToInt(final @Nullable CharObjConsumer<? super @Nullable IntConsumer> mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapMultiToInt(final @Nullable CharConsumer                                   mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapMultiToInt(final @Nullable Runnable                                       mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapMultiToInt(final @Nullable Object @Nullable ...                          ignored) { return EmptyParallelIntStream.getInstance(); }

    @Override public EmptyParallelLongStream mapMultiToLong(final @Nullable CharObjConsumer<? super @Nullable LongConsumer> mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapMultiToLong(final @Nullable CharConsumer                                    mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapMultiToLong(final @Nullable Runnable                                        mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapMultiToLong(final @Nullable Object @Nullable ...                           ignored) { return EmptyParallelLongStream.getInstance(); }

    @Override public EmptyParallelFloatStream mapMultiToFloat(final @Nullable CharObjConsumer<? super @Nullable FloatConsumer> mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapMultiToFloat(final @Nullable CharConsumer                                     mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapMultiToFloat(final @Nullable Runnable                                         mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapMultiToFloat(final @Nullable Object @Nullable ...                            ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Override public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable CharObjConsumer<? super @Nullable DoubleConsumer> mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable CharConsumer                                      mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable Runnable                                          mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable Object @Nullable ...                             ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- Map multi --------------------
    //#region -------------------- Distinct --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelCharStream distinct(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream distinct(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Distinct --------------------
    //#region -------------------- Sorted --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelCharStream sorted(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream sorted(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sorted --------------------
    //#region -------------------- Peek --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelCharStream peek(final @Nullable CharConsumer          action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream peek(final @Nullable Runnable              action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream peek(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Peek --------------------
    //#region -------------------- Limit --------------------

    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream limit(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream limit(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream limit(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelCharStream limit(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream limit(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream limit(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream limit(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream limit(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream limit(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Limit --------------------
    //#region -------------------- Skip --------------------

    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream skip(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream skip(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream skip(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelCharStream skip(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream skip(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream skip(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream skip(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream skip(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream skip(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Skip --------------------
    //#region -------------------- Take while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelCharStream takeWhile(final @Nullable CharPredicate      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream takeWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream takeWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Drop while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelCharStream dropWhile(final @Nullable CharPredicate      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream dropWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelCharStream dropWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- For each --------------------

    @Override public void forEach(final @Nullable CharConsumer          action) {}
              public void forEach(final @Nullable Runnable              action) {}
              public void forEach(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each ordered --------------------

    @Override public void forEachOrdered(final @Nullable CharConsumer          action) {}
              public void forEachOrdered(final @Nullable Runnable              action) {}
              public void forEachOrdered(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each ordered --------------------
    //#region -------------------- To array --------------------

                           @Override public                              char[] toArray(                                ) { return CharArray(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> U[]    toArray(final IntFunction<U[]> generator) { return generator.apply(0); }

    //#endregion -------------------- To array --------------------
    //#region -------------------- Reduce --------------------

    @Contract(ALWAYS_1ST_1)           public final char reduce(final char initial                                                ) { return initial; }
    @Contract(ALWAYS_1ST_2) @Override public final char reduce(final char initial, final @Nullable CharBinaryOperator accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final char reduce(final char initial, final @Nullable CharSupplier       accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final char reduce(final char initial, final @Nullable Object @Nullable ...   ignored) { return initial; }

    @Override public EmptyOptionalChar reduce(final @Nullable CharBinaryOperator accumulator) { return EmptyOptionalChar.getInstance(); }
              public EmptyOptionalChar reduce(final @Nullable CharSupplier       accumulator) { return EmptyOptionalChar.getInstance(); }
              public EmptyOptionalChar reduce(final @Nullable Object @Nullable ...   ignored) { return EmptyOptionalChar.getInstance(); }

    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjCharFunction<U, U> accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjCharFunction<U, U> accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjCharFunction<U, U> accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>        accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>        accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>        accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>           accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>           accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>           accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }

    //#endregion -------------------- Reduce --------------------
    //#region -------------------- Collect --------------------

    @Contract(ALWAYS_NULL_3) @Override public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjCharConsumer<R> accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjCharConsumer<R> accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjCharConsumer<R> accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjCharConsumer<R> accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
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
    //#region -------------------- Count --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) long count(                                            ) { return 0; }
    @Contract(pure = true)           public @Range(from = 0, to = 0) long count(final @Nullable Object @Nullable ... ignored) { return 0; }

    //#endregion -------------------- Count --------------------
    //#region -------------------- Summary statistics --------------------

    @Override public CharSummaryStatistics summaryStatistics(                                            ) { return new CharSummaryStatistics(); }
              public CharSummaryStatistics summaryStatistics(final @Nullable Object @Nullable ... ignored) { return new CharSummaryStatistics(); }

    //#endregion -------------------- Summary statistics --------------------
    //#region -------------------- All match --------------------

    @Contract(ALWAYS_TRUE_1) @Override public boolean allMatch(final @Nullable CharPredicate      predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- All match --------------------
    //#region -------------------- Any match --------------------

    @Contract(ALWAYS_FALSE_0)           public boolean anyMatch(                                              ) { return false; }
    @Contract(ALWAYS_FALSE_1) @Override public boolean anyMatch(final @Nullable CharPredicate        predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable BooleanSupplier      predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable Object @Nullable ...   ignored) { return false; }

    //#endregion -------------------- Any match --------------------
    //#region -------------------- None match --------------------

    @Contract(ALWAYS_TRUE_0)           public boolean noneMatch(                                            ) { return true; }
    @Contract(ALWAYS_TRUE_1) @Override public boolean noneMatch(final @Nullable CharPredicate      predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- None match --------------------
    //#region -------------------- Find first --------------------

    @Override public EmptyOptionalChar findFirst(                                            ) { return EmptyOptionalChar.getInstance(); }
              public EmptyOptionalChar findFirst(final @Nullable Object @Nullable ... ignored) { return EmptyOptionalChar.getInstance(); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find any --------------------

    @Override public EmptyOptionalChar findAny(                                            ) { return EmptyOptionalChar.getInstance(); }
              public EmptyOptionalChar findAny(final @Nullable Object @Nullable ... ignored) { return EmptyOptionalChar.getInstance(); }

    //#endregion -------------------- Find any --------------------
    //#region -------------------- As stream --------------------

    public <U> EmptyParallelStream<U> asStream(                                            ) { return EmptyParallelStream.getInstance(); }
    public <U> EmptyParallelStream<U> asStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelStream.getInstance(); }

    public EmptyParallelBooleanStream asBooleanStream(                                            ) { return EmptyParallelBooleanStream.getInstance(); }
    public EmptyParallelBooleanStream asBooleanStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelBooleanStream.getInstance(); }

    @Contract(ALWAYS_THIS_0) public EmptyParallelCharStream asCharStream(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelCharStream asCharStream(final @Nullable Object @Nullable ... ignored) { return this; }

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

    @Override public EmptyParallelStream<Character> boxed(                                            ) { return EmptyParallelStream.getInstance(); }
              public EmptyParallelStream<Character> boxed(final @Nullable Object @Nullable ... ignored) { return EmptyParallelStream.getInstance(); }

    //#endregion -------------------- Boxed --------------------
    //#region -------------------- Java methods --------------------

    @Override public EmptyCharIterator iterator() { return EmptyCharIterator.getInstance(); }
    @Override public CharSpliterator spliterator() { return emptyCharSpliterator(); }

    //#endregion -------------------- Java methods --------------------
    //#region -------------------- Close methods --------------------

    @Override public void close() {}
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelCharStream onClose(final @Nullable Runnable handler) { return this; }

    //#endregion -------------------- Close methods --------------------

    //#endregion -------------------- Methods --------------------

}
