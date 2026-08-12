package joookiwi.collection.java.stream;

import java.util.DoubleSummaryStatistics;
import java.util.OptionalDouble;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
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
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.extended.iterator.DoubleIterator;
import joookiwi.collection.java.extended.iterator.DoubleSpliterator;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public interface DoubleStream
        extends java.util.stream.DoubleStream {
    //TODO: add documentation on DoubleStream

    @Override boolean isParallel();

    @Override DoubleStream filter(DoublePredicate predicate);

    //#region -------------------- Map methods --------------------

    @Override DoubleStream map(DoubleUnaryOperator mapper);
    @Override <U> Stream<U> mapToObj(DoubleFunction<? extends U> mapper);
    BooleanStream mapToBoolean(DoubleToBooleanFunction mapper);
    CharStream mapToChar(DoubleToCharFunction mapper);
    ByteStream mapToByte(DoubleToByteFunction mapper);
    ShortStream mapToShort(DoubleToShortFunction mapper);
    @Override IntStream mapToInt(DoubleToIntFunction mapper);
    @Override LongStream mapToLong(DoubleToLongFunction mapper);
    FloatStream mapToFloat(DoubleToFloatFunction mapper);

    @Override DoubleStream flatMap(DoubleFunction<? extends java.util.stream.DoubleStream> mapper);
    <U> Stream<U> flatMapToObj(DoubleFunction<? extends Stream<? extends U>> mapper);
    BooleanStream flatMapToBoolean(DoubleFunction<? extends BooleanStream> mapper);
    CharStream flatMapToChar(DoubleFunction<? extends CharStream> mapper);
    ByteStream flatMapToByte(DoubleFunction<? extends ByteStream> mapper);
    ShortStream flatMapToShort(DoubleFunction<? extends ShortStream> mapper);
    IntStream flatMapToInt(DoubleFunction<? extends IntStream> mapper);
    LongStream flatMapToLong(DoubleFunction<? extends LongStream> mapper);
    FloatStream flatMapToFloat(DoubleFunction<? extends FloatStream> mapper);

    @Override DoubleStream mapMulti(java.util.stream.DoubleStream.DoubleMapMultiConsumer mapper);
    <U> Stream<U> mapMultiToObj(DoubleObjConsumer<? super Consumer<U>> mapper);
    BooleanStream mapMultiToBoolean(DoubleObjConsumer<? super BooleanConsumer> mapper);
    CharStream mapMultiToChar(DoubleObjConsumer<? super CharConsumer> mapper);
    ByteStream mapMultiToByte(DoubleObjConsumer<? super ByteConsumer> mapper);
    ShortStream mapMultiToShort(DoubleObjConsumer<? super ShortConsumer> mapper);
    IntStream mapMultiToInt(DoubleObjConsumer<? super IntConsumer> mapper);
    LongStream mapMultiToLong(DoubleObjConsumer<? super LongConsumer> mapper);
    FloatStream mapMultiToFloat(DoubleObjConsumer<? super FloatConsumer> mapper);

    //#endregion -------------------- Map methods --------------------

    @Override DoubleStream distinct();

    @Override DoubleStream sorted();

    @Override DoubleStream peek(DoubleConsumer action);

    @Override DoubleStream limit(long maximum);

    @Override DoubleStream skip(long maximum);

    @Override DoubleStream takeWhile(DoublePredicate predicate);

    @Override DoubleStream dropWhile(DoublePredicate predicate);

    //#region -------------------- For each methods --------------------

    @Override void forEach(DoubleConsumer action);

    @Override void forEachOrdered(DoubleConsumer action);

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Reduce methods --------------------

    @Override double reduce(double initial, DoubleBinaryOperator accumulator);

    @Override OptionalDouble reduce(DoubleBinaryOperator accumulator);

    //#endregion -------------------- Reduce methods --------------------

    @Override <R extends @Nullable Object> R collect(Supplier<R> supplier, ObjDoubleConsumer<R> accumulator, BiConsumer<R, R> combiner);

    @Override double sum();

    @Override OptionalDouble min();

    @Override OptionalDouble max();

    @Override long count();

    @Override OptionalDouble average();

    @Override DoubleSummaryStatistics summaryStatistics();

    @Override boolean allMatch(DoublePredicate predicate);

    @Override boolean anyMatch(DoublePredicate predicate);

    @Override boolean noneMatch(DoublePredicate predicate);

    @Override OptionalDouble findFirst();

    @Override OptionalDouble findAny();

    @Override DoubleStream sequential();

    @Override DoubleStream parallel();

    @Override DoubleStream unordered();

    //#region -------------------- Conversion methods --------------------

    @Override Stream<Double> boxed();

    @Override DoubleIterator iterator();

    @Override DoubleSpliterator spliterator();

    @Override double[] toArray();
    <U extends @Nullable Object> U[] toArray(IntFunction<U[]> generator);

    //#endregion -------------------- Conversion methods --------------------
    //#region -------------------- Close methods --------------------

    @Override void close();

    @Override DoubleStream onClose(Runnable closeHandler);

    //#endregion -------------------- Close methods --------------------

}
