package joookiwi.collection.java.stream;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.Stream;
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.FloatBinaryOperator;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.FloatFunction;
import joookiwi.collection.java.callback.additional.FloatObjConsumer;
import joookiwi.collection.java.callback.additional.FloatPredicate;
import joookiwi.collection.java.callback.additional.FloatToBooleanFunction;
import joookiwi.collection.java.callback.additional.FloatToByteFunction;
import joookiwi.collection.java.callback.additional.FloatToCharFunction;
import joookiwi.collection.java.callback.additional.FloatToDoubleFunction;
import joookiwi.collection.java.callback.additional.FloatToIntFunction;
import joookiwi.collection.java.callback.additional.FloatToLongFunction;
import joookiwi.collection.java.callback.additional.FloatToShortFunction;
import joookiwi.collection.java.callback.additional.FloatUnaryOperator;
import joookiwi.collection.java.callback.additional.ObjFloatConsumer;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.extended.iterator.FloatIterator;
import joookiwi.collection.java.extended.iterator.FloatSpliterator;
import joookiwi.collection.java.optional.OptionalFloat;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public interface FloatStream
        extends BaseStream<Float, FloatStream> {
    //TODO: add documentation on FloatStream

    @Override boolean isParallel();

    FloatStream filter(FloatPredicate predicate);

    //#region -------------------- Map methods --------------------

    FloatStream map(FloatUnaryOperator mapper);
    <U extends @Nullable Object> Stream<U> mapToObj(FloatFunction<? extends U> mapper);
    BooleanStream mapToBoolean(FloatToBooleanFunction mapper);
    CharStream mapToChar(FloatToCharFunction mapper);
    ByteStream mapToByte(FloatToByteFunction mapper);
    ShortStream mapToShort(FloatToShortFunction mapper);
    IntStream mapToInt(FloatToIntFunction mapper);
    LongStream mapToLong(FloatToLongFunction mapper);
    DoubleStream mapToDouble(FloatToDoubleFunction mapper);

    FloatStream flatMap(FloatFunction<? extends FloatStream> mapper);
    <U extends @Nullable Object> Stream<U> flatMapToObj(FloatFunction<? extends Stream<? extends U>> mapper);
    BooleanStream flatMapToBoolean(FloatFunction<? extends BooleanStream> mapper);
    CharStream flatMapToChar(FloatFunction<? extends CharStream> mapper);
    ByteStream flatMapToByte(FloatFunction<? extends ByteStream> mapper);
    ShortStream flatMapToShort(FloatFunction<? extends ShortStream> mapper);
    IntStream flatMapToInt(FloatFunction<? extends IntStream> mapper);
    LongStream flatMapToLong(FloatFunction<? extends LongStream> mapper);
    DoubleStream flatMapToDouble(FloatFunction<? extends DoubleStream> mapper);

    FloatStream mapMulti(final FloatObjConsumer<? super FloatConsumer> mapper);
    <U extends @Nullable Object> Stream<U> mapMultiToObj(FloatObjConsumer<? super Consumer<U>> mapper);
    BooleanStream mapMultiToBoolean(FloatObjConsumer<? super BooleanConsumer> mapper);
    CharStream mapMultiToChar(FloatObjConsumer<? super CharConsumer> mapper);
    ByteStream mapMultiToByte(FloatObjConsumer<? super ByteConsumer> mapper);
    ShortStream mapMultiToShort(FloatObjConsumer<? super ShortConsumer> mapper);
    IntStream mapMultiToInt(FloatObjConsumer<? super IntConsumer> mapper);
    LongStream mapMultiToLong(FloatObjConsumer<? super LongConsumer> mapper);
    DoubleStream mapMultiToDouble(FloatObjConsumer<? super DoubleConsumer> mapper);

    //#endregion -------------------- Map methods --------------------

    FloatStream distinct();

    FloatStream sorted();

    FloatStream peek(FloatConsumer action);

    FloatStream limit(long maximum);

    FloatStream skip(long maximum);

    FloatStream takeWhile(final FloatPredicate predicate);

    FloatStream dropWhile(final FloatPredicate predicate);

    //#region -------------------- For each methods --------------------

    void forEach(FloatConsumer consumer);

    void forEachOrdered(FloatConsumer consumer);

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Reduce methods --------------------

    float reduce(float identity, FloatBinaryOperator operator);

    OptionalFloat reduce(FloatBinaryOperator operator);

    //#endregion -------------------- Reduce methods --------------------

    <R extends @Nullable Object> R collect(Supplier<R> supplier, ObjFloatConsumer<R> accumulator, BiConsumer<R, R> combiner);

    float sum();

    OptionalFloat min();

    OptionalFloat max();

    long count();

    OptionalFloat average();

    FloatSummaryStatistics summaryStatistics();

    boolean anyMatch(FloatPredicate predicate);

    boolean allMatch(FloatPredicate predicate);

    boolean noneMatch(FloatPredicate predicate);

    OptionalFloat findFirst();

    OptionalFloat findAny();

    @Override FloatStream sequential();

    @Override FloatStream parallel();

    @Override FloatStream unordered();

    //#region -------------------- Conversion methods --------------------

    DoubleStream asDoubleStream();

    Stream<Float> boxed();

    @Override FloatIterator iterator();

    @Override FloatSpliterator spliterator();

    float[] toArray();

    //#endregion -------------------- Conversion methods --------------------
    //#region -------------------- Close methods --------------------

    @Override void close();

    @Override FloatStream onClose(Runnable handler);

    //#endregion -------------------- Close methods --------------------

}
