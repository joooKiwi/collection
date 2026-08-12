package joookiwi.collection.java.stream;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.Gatherer;
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.callback.additional.ToByteFunction;
import joookiwi.collection.java.callback.additional.ToCharFunction;
import joookiwi.collection.java.callback.additional.ToFloatFunction;
import joookiwi.collection.java.callback.additional.ToShortFunction;
import joookiwi.collection.java.extended.list.ImmutableList;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public interface Stream<T>
        extends java.util.stream.Stream<T> {
    //TODO: add documentation on Stream

    @Override boolean isParallel();

    @Override Stream<T> filter(Predicate<? super T> predicate);

    //#region -------------------- Map methods --------------------

    @Override <U> Stream<U> map(Function<? super T, ? extends U> mapper);
    BooleanStream mapToBoolean(Predicate<? super T> mapper);
    CharStream mapToChar(ToCharFunction<? super T> mapper);
    ByteStream mapToByte(ToByteFunction<? super T> mapper);
    ShortStream mapToShort(ToShortFunction<? super T> mapper);
    @Override IntStream mapToInt(ToIntFunction<? super T> mapper);
    @Override LongStream mapToLong(ToLongFunction<? super T> mapper);
    FloatStream mapToFloat(ToFloatFunction<? super T> mapper);
    @Override DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper);

    @Override <U> Stream<U> flatMap(Function<? super T, ? extends java.util.stream.Stream<? extends U>> mapper);
    BooleanStream flatMapToBoolean(Function<? super T, ? extends BooleanStream> mapper);
    CharStream flatMapToChar(Function<? super T, ? extends CharStream> mapper);
    ByteStream flatMapToByte(Function<? super T, ? extends ByteStream> mapper);
    ShortStream flatMapToShort(Function<? super T, ? extends ShortStream> mapper);
    @Override IntStream flatMapToInt(Function<? super T, ? extends java.util.stream.IntStream> mapper);
    @Override LongStream flatMapToLong(Function<? super T, ? extends java.util.stream.LongStream> mapper);
    FloatStream flatMapToFloat(Function<? super T, ? extends FloatStream> mapper);
    @Override DoubleStream flatMapToDouble(Function<? super T, ? extends java.util.stream.DoubleStream> mapper);

    @Override <U> Stream<U> mapMulti(BiConsumer<? super T, ? super Consumer<U>> mapper);
    BooleanStream mapMultiToBoolean(BiConsumer<? super T, ? super BooleanConsumer> mapper);
    CharStream mapMultiToChar(BiConsumer<? super T, ? super CharConsumer> mapper);
    ByteStream mapMultiToByte(BiConsumer<? super T, ? super ByteConsumer> mapper);
    ShortStream mapMultiToShort(BiConsumer<? super T, ? super ShortConsumer> mapper);
    @Override IntStream mapMultiToInt(BiConsumer<? super T, ? super IntConsumer> mapper);
    @Override LongStream mapMultiToLong(BiConsumer<? super T, ? super LongConsumer> mapper);
    FloatStream mapMultiToFloat(BiConsumer<? super T, ? super FloatConsumer> mapper);
    @Override DoubleStream mapMultiToDouble(BiConsumer<? super T, ? super DoubleConsumer> mapper);

    //#endregion -------------------- Map methods --------------------

    @Override Stream<T> distinct();

    @Override Stream<T> sorted();
    @Override Stream<T> sorted(Comparator<? super T> comparator);

    @Override Stream<T> peek(Consumer<? super T> action);

    @Override Stream<T> limit(long maximum);

    @Override Stream<T> skip(long maximum);

    @Override Stream<T> takeWhile(Predicate<? super T> predicate);

    @Override Stream<T> dropWhile(Predicate<? super T> predicate);

    //#region -------------------- For each methods --------------------

    @Override void forEach(Consumer<? super T> action);

    @Override void forEachOrdered(Consumer<? super T> action);

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Reduce methods --------------------

    @Override <U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner);

    @Override T reduce(T initial, BinaryOperator<T> accumulator);

    @Override Optional<T> reduce(BinaryOperator<T> accumulator);

    //#endregion -------------------- Reduce methods --------------------

    @Override <U> Stream<U> gather(Gatherer<? super T, ?, U> gatherer);

    //#region -------------------- Collect methods --------------------

    @Override <R extends @Nullable Object> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner);

    @Override <R extends @Nullable Object, U extends @Nullable Object> R collect(Collector<? super T, U, R> collector);

    //#endregion -------------------- Collect methods --------------------

    @Override Optional<T> min(Comparator<? super T> comparator);

    @Override Optional<T> max(Comparator<? super T> comparator);

    @Override long count();

    @Override boolean allMatch(Predicate<? super T> predicate);

    @Override boolean anyMatch(Predicate<? super T> predicate);

    @Override boolean noneMatch(Predicate<? super T> predicate);

    @Override Optional<T> findFirst();

    @Override Optional<T> findAny();

    @Override Stream<T> sequential();

    @Override Stream<T> parallel();

    @Override Stream<T> unordered();

    //#region -------------------- Conversion methods --------------------

    @Override Iterator<T> iterator();

    @Override Spliterator<T> spliterator();

    @Override ImmutableList<T> toList();

    @Override T[] toArray();

    @Override <U extends @Nullable Object> U[] toArray(IntFunction<U[]> generator);

    //#endregion -------------------- Conversion methods --------------------
    //#region -------------------- Close methods --------------------

    @Override void close();

    @Override Stream<T> onClose(Runnable closeHandler);

    //#endregion -------------------- Close methods --------------------

}
