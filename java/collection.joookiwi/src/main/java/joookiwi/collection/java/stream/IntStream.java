package joookiwi.collection.java.stream;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import joookiwi.collection.java.callback.IntObjConsumer;
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.IntToBooleanFunction;
import joookiwi.collection.java.callback.additional.IntToByteFunction;
import joookiwi.collection.java.callback.additional.IntToCharFunction;
import joookiwi.collection.java.callback.additional.IntToFloatFunction;
import joookiwi.collection.java.callback.additional.IntToShortFunction;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.extended.iterator.IntIterator;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public interface IntStream
        extends java.util.stream.IntStream {
    //TODO: add documentation on IntStream

    @Override boolean isParallel();

    @Override IntStream filter(IntPredicate predicate);

    //#region -------------------- Map methods --------------------

    @Override IntStream map(IntUnaryOperator mapper);
    @Override <U> Stream<U> mapToObj(IntFunction<? extends U> mapper);
    BooleanStream mapToBoolean(IntToBooleanFunction mapper);
    CharStream mapToChar(IntToCharFunction mapper);
    ByteStream mapToByte(IntToByteFunction mapper);
    ShortStream mapToShort(IntToShortFunction mapper);
    @Override LongStream mapToLong(IntToLongFunction mapper);
    FloatStream mapToFloat(IntToFloatFunction mapper);
    @Override DoubleStream mapToDouble(IntToDoubleFunction mapper);

    @Override IntStream flatMap(IntFunction<? extends java.util.stream.IntStream> mapper);
    <U> Stream<U> flatMapToObj(IntFunction<? extends Stream<? extends U>> mapper);
    BooleanStream flatMapToBoolean(IntFunction<? extends BooleanStream> mapper);
    CharStream flatMapToChar(IntFunction<? extends CharStream> mapper);
    ByteStream flatMapToByte(IntFunction<? extends ByteStream> mapper);
    ShortStream flatMapToShort(IntFunction<? extends ShortStream> mapper);
    LongStream flatMapToLong(IntFunction<? extends LongStream> mapper);
    FloatStream flatMapToFloat(IntFunction<? extends FloatStream> mapper);
    DoubleStream flatMapToDouble(IntFunction<? extends DoubleStream> mapper);

    @Override IntStream mapMulti(IntMapMultiConsumer mapper);
    <U> Stream<U> mapMultiToObj(IntObjConsumer<? super Consumer<U>> mapper);
    BooleanStream mapMultiToBoolean(IntObjConsumer<? super BooleanConsumer> mapper);
    CharStream mapMultiToChar(IntObjConsumer<? super CharConsumer> mapper);
    ByteStream mapMultiToByte(IntObjConsumer<? super ByteConsumer> mapper);
    ShortStream mapMultiToShort(IntObjConsumer<? super ShortConsumer> mapper);
    LongStream mapMultiToLong(IntObjConsumer<? super LongConsumer> mapper);
    FloatStream mapMultiToFloat(IntObjConsumer<? super FloatConsumer> mapper);
    DoubleStream mapMultiToDouble(IntObjConsumer<? super DoubleConsumer> mapper);

    //#endregion -------------------- Map methods --------------------

    @Override IntStream distinct();

    @Override IntStream sorted();

    @Override IntStream peek(IntConsumer action);

    @Override IntStream limit(long maximum);

    @Override IntStream skip(long maximum);

    @Override IntStream takeWhile(IntPredicate predicate);

    @Override IntStream dropWhile(IntPredicate predicate);

    //#region -------------------- For each methods --------------------

    void forEach(IntConsumer action);

    void forEachOrdered(IntConsumer action);

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Reduce methods --------------------

    int reduce(int initial, IntBinaryOperator accumulator);

    @Override OptionalInt reduce(IntBinaryOperator accumulator);

    //#endregion -------------------- Reduce methods --------------------

    @Override <R extends @Nullable Object> R collect(Supplier<R> supplier, ObjIntConsumer<R> accumulator, BiConsumer<R, R> combiner);

    @Override int sum();

    @Override OptionalInt min();

    @Override OptionalInt max();

    @Override long count();

    @Override OptionalDouble average();

    @Override IntSummaryStatistics summaryStatistics();

    @Override boolean allMatch(IntPredicate predicate);

    @Override boolean anyMatch(IntPredicate predicate);

    @Override boolean noneMatch(IntPredicate predicate);

    @Override OptionalInt findFirst();

    @Override OptionalInt findAny();

    @Override IntStream sequential();

    @Override IntStream parallel();

    @Override IntStream unordered();

    //#region -------------------- Conversion methods --------------------

    @Override LongStream asLongStream();

    FloatStream asFloatStream();

    @Override DoubleStream asDoubleStream();

    @Override Stream<Integer> boxed();

    @Override IntIterator iterator();

    @Override Spliterator.OfInt spliterator();//TODO create interface IntSpliterator

    @Override int[] toArray();
    <U extends @Nullable Object> U[] toArray(IntFunction<U[]> generator);

    //#endregion -------------------- Conversion methods --------------------
    //#region -------------------- Close methods --------------------

    @Override void close();

    @Override IntStream onClose(Runnable closeHandler);

    //#endregion -------------------- Close methods --------------------

}
