package joookiwi.collection.java.stream;

import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.LongObjConsumer;
import joookiwi.collection.java.callback.additional.LongToBooleanFunction;
import joookiwi.collection.java.callback.additional.LongToByteFunction;
import joookiwi.collection.java.callback.additional.LongToCharFunction;
import joookiwi.collection.java.callback.additional.LongToFloatFunction;
import joookiwi.collection.java.callback.additional.LongToShortFunction;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.extended.iterator.LongIterator;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public interface LongStream
        extends java.util.stream.LongStream {
    //TODO: add documentation on LongStream

    @Override boolean isParallel();

    @Override LongStream filter(LongPredicate predicate);

    //#region -------------------- Map methods --------------------

    @Override LongStream map(LongUnaryOperator mapper);
    @Override <U> Stream<U> mapToObj(LongFunction<? extends U> mapper);
    BooleanStream mapToBoolean(LongToBooleanFunction mapper);
    CharStream mapToChar(LongToCharFunction mapper);
    ByteStream mapToByte(LongToByteFunction mapper);
    ShortStream mapToShort(LongToShortFunction mapper);
    @Override IntStream mapToInt(LongToIntFunction mapper);
    FloatStream mapToFloat(LongToFloatFunction mapper);
    @Override DoubleStream mapToDouble(LongToDoubleFunction mapper);

    @Override LongStream flatMap(LongFunction<? extends java.util.stream.LongStream> mapper);
    <U> Stream<U> flatMapToObj(LongFunction<? extends Stream<? extends U>> mapper);
    BooleanStream flatMapToBoolean(LongFunction<? extends BooleanStream> mapper);
    CharStream flatMapToChar(LongFunction<? extends CharStream> mapper);
    ByteStream flatMapToByte(LongFunction<? extends ByteStream> mapper);
    ShortStream flatMapToShort(LongFunction<? extends ShortStream> mapper);
    IntStream flatMapToInt(LongFunction<? extends IntStream> mapper);
    FloatStream flatMapToFloat(LongFunction<? extends FloatStream> mapper);
    DoubleStream flatMapToDouble(LongFunction<? extends DoubleStream> mapper);

    @Override LongStream mapMulti(LongMapMultiConsumer mapper);
    <U> Stream<U> mapMultiToObj(LongObjConsumer<? super Consumer<U>> mapper);
    BooleanStream mapMultiToBoolean(LongObjConsumer<? super BooleanConsumer> mapper);
    CharStream mapMultiToChar(LongObjConsumer<? super CharConsumer> mapper);
    ByteStream mapMultiToByte(LongObjConsumer<? super ByteConsumer> mapper);
    ShortStream mapMultiToShort(LongObjConsumer<? super ShortConsumer> mapper);
    IntStream mapMultiToInt(LongObjConsumer<? super IntConsumer> mapper);
    FloatStream mapMultiToFloat(LongObjConsumer<? super FloatConsumer> mapper);
    DoubleStream mapMultiToDouble(LongObjConsumer<? super DoubleConsumer> mapper);

    //#endregion -------------------- Map methods --------------------

    @Override LongStream distinct();

    @Override LongStream sorted();

    @Override LongStream peek(LongConsumer action);

    @Override LongStream limit(long maximum);

    @Override LongStream skip(long maximum);

    @Override LongStream takeWhile(LongPredicate predicate);

    @Override LongStream dropWhile(LongPredicate predicate);

    //#region -------------------- For each methods --------------------

    void forEach(LongConsumer action);

    void forEachOrdered(LongConsumer action);

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Reduce methods --------------------

    long reduce(long initial, LongBinaryOperator accumulator);

    @Override OptionalLong reduce(LongBinaryOperator accumulator);

    //#endregion -------------------- Reduce methods --------------------

    @Override <R extends @Nullable Object> R collect(Supplier<R> supplier, ObjLongConsumer<R> accumulator, BiConsumer<R, R> combiner);

    @Override long sum();

    @Override OptionalLong min();

    @Override OptionalLong max();

    @Override long count();

    @Override OptionalDouble average();

    @Override LongSummaryStatistics summaryStatistics();

    @Override boolean allMatch(LongPredicate predicate);

    @Override boolean anyMatch(LongPredicate predicate);

    @Override boolean noneMatch(LongPredicate predicate);

    @Override OptionalLong findFirst();

    @Override OptionalLong findAny();

    @Override LongStream sequential();

    @Override LongStream parallel();

    @Override LongStream unordered();

    //#region -------------------- Conversion methods --------------------

    @Override Stream<Long> boxed();

    FloatStream asFloatStream();

    @Override DoubleStream asDoubleStream();

    @Override LongIterator iterator();

    @Override Spliterator.OfLong spliterator();//TODO create interface LongSpliterator

    @Override long[] toArray();
    <U extends @Nullable Object> U[] toArray(IntFunction<U[]> generator);

    //#endregion -------------------- Conversion methods --------------------
    //#region -------------------- Close methods --------------------

    @Override void close();

    @Override LongStream onClose(Runnable closeHandler);

    //#endregion -------------------- Close methods --------------------

}
