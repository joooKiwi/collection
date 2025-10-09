package joookiwi.collection.java.method;

import java.util.Collection;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.Spliterator;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import joookiwi.collection.java.iterator.CollectionIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;

@NotNullByDefault
public final class ArrayCreator
        extends CreatorUtility {

    //#region -------------------- Fields --------------------

    private static @Nullable Object @Nullable @Unmodifiable [] __emptyArray;
    private static boolean @Nullable @Unmodifiable [] __emptyBooleanArray;
    private static char @Nullable @Unmodifiable [] __emptyCharArray;
    private static byte @Nullable @Unmodifiable [] __emptyByteArray;
    private static short @Nullable @Unmodifiable [] __emptyShortArray;
    private static int @Nullable @Unmodifiable [] __emptyIntArray;
    private static long @Nullable @Unmodifiable [] __emptyLongArray;
    private static float @Nullable @Unmodifiable [] __emptyFloatArray;
    private static double @Nullable @Unmodifiable [] __emptyDoubleArray;

    //#endregion -------------------- Fields --------------------

    @Contract(ALWAYS_FAIL_0)
    private ArrayCreator() { throw new ImpossibleConstructionException("The utility class “ArrayCreator” cannot be constructed.", ArrayCreator.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// An [empty Array][java.lang.reflect.Array]
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array() {
        final var value = __emptyArray;
        if (value != null)
            return (T[]) value;
        return (T[]) (__emptyArray = new Object[0]);
    }

    /// A `boolean` [empty Array][java.lang.reflect.Array]
    public static boolean @Unmodifiable [] BooleanArray() {
        final var value = __emptyBooleanArray;
        if (value != null)
            return value;
        return __emptyBooleanArray = new boolean[0];
    }

    /// A `char` [empty Array][java.lang.reflect.Array]
    public static char @Unmodifiable [] CharArray() {
        final var value = __emptyCharArray;
        if (value != null)
            return value;
        return __emptyCharArray = new char[0];
    }

    /// A `byte` [empty Array][java.lang.reflect.Array]
    public static byte @Unmodifiable [] ByteArray() {
        final var value = __emptyByteArray;
        if (value != null)
            return value;
        return __emptyByteArray = new byte[0];
    }

    /// A `short` [empty Array][java.lang.reflect.Array]
    public static short @Unmodifiable [] ShortArray() {
        final var value = __emptyShortArray;
        if (value != null)
            return value;
        return __emptyShortArray = new short[0];
    }

    /// An `int` [empty Array][java.lang.reflect.Array]
    public static int @Unmodifiable [] IntArray() {
        final var value = __emptyIntArray;
        if (value != null)
            return value;
        return __emptyIntArray = new int[0];
    }

    /// A `long` [empty Array][java.lang.reflect.Array]
    public static long @Unmodifiable [] LongArray() {
        final var value = __emptyLongArray;
        if (value != null)
            return value;
        return __emptyLongArray = new long[0];
    }

    /// A `float` [empty Array][java.lang.reflect.Array]
    public static float @Unmodifiable [] FloatArray() {
        final var value = __emptyFloatArray;
        if (value != null)
            return value;
        return __emptyFloatArray = new float[0];
    }

    /// A `double` [empty Array][java.lang.reflect.Array]
    public static double @Unmodifiable [] DoubleArray() {
        final var value = __emptyDoubleArray;
        if (value != null)
            return value;
        return __emptyDoubleArray = new double[0];
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- value --------------------

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final T value) { return (T[]) new Object[]{value,}; }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    public static boolean @Unmodifiable [] Array(final boolean value) { return new boolean[]{value,}; }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    public static char @Unmodifiable [] Array(final char value) { return new char[]{value,}; }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    public static byte @Unmodifiable [] Array(final byte value) { return new byte[]{value,}; }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    public static short @Unmodifiable [] Array(final short value) { return new short[]{value,}; }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    public static int @Unmodifiable [] Array(final int value) { return new int[]{value,}; }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    public static long @Unmodifiable [] Array(final long value) { return new long[]{value,}; }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    public static float @Unmodifiable [] Array(final float value) { return new float[]{value,}; }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    public static double @Unmodifiable [] Array(final double value) { return new double[]{value,}; }

    //#endregion -------------------- value --------------------
    //#region -------------------- value1, value2 --------------------

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final T value1, final T value2) { return (T[]) new Object[]{value1, value2,}; }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    public static boolean @Unmodifiable [] Array(final boolean value1, final boolean value2) { return new boolean[]{value1, value2,}; }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    public static char @Unmodifiable [] Array(final char value1, final char value2) { return new char[]{value1, value2,}; }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    public static byte @Unmodifiable [] Array(final byte value1, final byte value2) { return new byte[]{value1, value2,}; }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    public static short @Unmodifiable [] Array(final short value1, final short value2) { return new short[]{value1, value2,}; }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    public static int @Unmodifiable [] Array(final int value1, final int value2) { return new int[]{value1, value2,}; }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    public static long @Unmodifiable [] Array(final long value1, final long value2) { return new long[]{value1, value2,}; }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    public static float @Unmodifiable [] Array(final float value1, final float value2) { return new float[]{value1, value2,}; }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    public static double @Unmodifiable [] Array(final double value1, final double value2) { return new double[]{value1, value2,}; }

    //#endregion -------------------- value1, value2 --------------------
    //#region -------------------- values --------------------

    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToArray.toArray(values); }

    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable CollectionHolder<? extends T> values) { return ToArray.toArray(values); }


    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final T @Nullable @Unmodifiable [] values) { return ToArray.toArray(values); }

    public static boolean @Unmodifiable [] Array(final boolean @Nullable @Unmodifiable [] values) {
        if (values == null)
            return BooleanArray();
        if (values.length == 0)
            return BooleanArray(); // We do not keep the empty array any longer.
        return values;
    }

    public static char @Unmodifiable [] Array(final char @Nullable @Unmodifiable [] values) {
        if (values == null)
            return CharArray();
        if (values.length == 0)
            return CharArray(); // We do not keep the empty array any longer.
        return values;
    }

    public static byte @Unmodifiable [] Array(final byte @Nullable @Unmodifiable [] values) {
        if (values == null)
            return ByteArray();
        if (values.length == 0)
            return ByteArray(); // We do not keep the empty array any longer.
        return values;
    }

    public static short @Unmodifiable [] Array(final short @Nullable @Unmodifiable [] values) {
        if (values == null)
            return ShortArray();
        if (values.length == 0)
            return ShortArray(); // We do not keep the empty array any longer.
        return values;
    }

    public static int @Unmodifiable [] Array(final int @Nullable @Unmodifiable [] values) {
        if (values == null)
            return IntArray();
        if (values.length == 0)
            return IntArray(); // We do not keep the empty array any longer.
        return values;
    }

    public static long @Unmodifiable [] Array(final long @Nullable [] values) {
        if (values == null)
            return LongArray();
        if (values.length == 0)
            return LongArray(); // We do not keep the empty array any longer.
        return values;
    }

    public static float @Unmodifiable [] Array(final float @Nullable @Unmodifiable [] values) {
        if (values == null)
            return FloatArray();
        if (values.length == 0)
            return FloatArray(); // We do not keep the empty array any longer.
        return values;
    }

    public static double @Unmodifiable [] Array(final double @Nullable @Unmodifiable [] values) {
        if (values == null)
            return DoubleArray();
        if (values.length == 0)
            return DoubleArray(); // We do not keep the empty array any longer.
        return values;
    }


    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return Array();
        if (values.isEmpty())
            return Array();
        if (values instanceof List<? extends T>)
            if (values instanceof RandomAccess)
                return __newInstance((List<? extends T>) values, values.size());
        return (T[]) values.toArray();
    }

    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable @Unmodifiable List<? extends T> values) {
        if (values == null)
            return Array();
        if (values.isEmpty())
            return Array();
        if (values instanceof RandomAccess)
            return __newInstance(values, values.size());
        return (T[]) values.toArray();
    }

    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable @Unmodifiable Set<? extends T> values) {
        if (values == null)
            return Array();
        if (values.isEmpty())
            return Array();
        return (T[]) values.toArray();
    }

    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable @Unmodifiable Queue<? extends T> values) {
        if (values == null)
            return Array();
        if (values.isEmpty())
            return Array();
        return (T[]) values.toArray();
    }

    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable @Unmodifiable Deque<? extends T> values) {
        if (values == null)
            return Array();
        if (values.isEmpty())
            return Array();
        return (T[]) values.toArray();
    }


    @Contract(mutates = "param")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable Iterator<? extends T> values) {
        if (values == null)
            return Array();
        if (values instanceof CollectionIterator<? extends T> valuesAsCollectionIterator)
            if (valuesAsCollectionIterator.isEmpty())
                return Array();
            else
                return __newInstance(valuesAsCollectionIterator, valuesAsCollectionIterator.size());
        return __newInstance(values);
    }

    @Contract(mutates = "param")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable Spliterator<? extends T> values) {
        if (values == null)
            return Array();
        return __newInstance(values);
    }

    @Contract(mutates = "param")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable Enumeration<? extends T> values) {
        if (values == null)
            return Array();
        return __newInstance(values);
    }

    @Contract(mutates = "param")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable CollectionIterator<? extends T> values) {
        if (values == null)
            return Array();
        if (values.isEmpty())
            return Array();
        return __newInstance(values, values.size());
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, newSize --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final T @Nullable @Unmodifiable [] values,
                                                                        final int newSize) {
        if (values == null)
            return (T[]) new Object[newSize];
        if (values.length == 0)
            return (T[]) new Object[newSize];
        return __newInstance(values, newSize);
    }

    @Contract(ALWAYS_NEW_2)
    public static boolean @Unmodifiable [] Array(final boolean @Nullable @Unmodifiable [] values,
                                                 final int newSize) {
        if (values == null)
            return new boolean[newSize];
        if (values.length == 0)
            return new boolean[newSize];
        return __newInstance(values, newSize);
    }

    @Contract(ALWAYS_NEW_2)
    public static char @Unmodifiable [] Array(final char @Nullable @Unmodifiable [] values,
                                              final int newSize) {
        if (values == null)
            return new char[newSize];
        if (values.length == 0)
            return new char[newSize];
        return __newInstance(values, newSize);
    }

    @Contract(ALWAYS_NEW_2)
    public static byte @Unmodifiable [] Array(final byte @Nullable @Unmodifiable [] values,
                                              final int newSize) {
        if (values == null)
            return new byte[newSize];
        if (values.length == 0)
            return new byte[newSize];
        return __newInstance(values, newSize);
    }

    @Contract(ALWAYS_NEW_2)
    public static short @Unmodifiable [] Array(final short @Nullable @Unmodifiable [] values,
                                               final int newSize) {
        if (values == null)
            return new short[newSize];
        if (values.length == 0)
            return new short[newSize];
        return __newInstance(values, newSize);
    }

    @Contract(ALWAYS_NEW_2)
    public static int @Unmodifiable [] Array(final int @Nullable @Unmodifiable [] values,
                                             final int newSize) {
        if (values == null)
            return new int[newSize];
        if (values.length == 0)
            return new int[newSize];
        return __newInstance(values, newSize);
    }

    @Contract(ALWAYS_NEW_2)
    public static long @Unmodifiable [] Array(final long @Nullable @Unmodifiable [] values,
                                              final int newSize) {
        if (values == null)
            return new long[newSize];
        if (values.length == 0)
            return new long[newSize];
        return __newInstance(values, newSize);
    }

    @Contract(ALWAYS_NEW_2)
    public static float @Unmodifiable [] Array(final float @Nullable @Unmodifiable [] values,
                                               final int newSize) {
        if (values == null)
            return new float[newSize];
        if (values.length == 0)
            return new float[newSize];
        return __newInstance(values, newSize);
    }

    @Contract(ALWAYS_NEW_2)
    public static double @Unmodifiable [] Array(final double @Nullable @Unmodifiable [] values,
                                                final int newSize) {
        if (values == null)
            return new double[newSize];
        if (values.length == 0)
            return new double[newSize];
        return __newInstance(values, newSize);
    }


    @Contract(ALWAYS_NEW_2)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable Iterable<? extends T> values,
                                                                        final int newSize) {
        if (values == null)
            return (T[]) new Object[newSize];
        if (values instanceof CollectionHolder<? extends T> valuesAsCollectionHolder)
            if (valuesAsCollectionHolder.isEmpty())
                return (T[]) new Object[newSize];
            else
                return __newInstance(valuesAsCollectionHolder, newSize);
        if (values instanceof List<? extends T> valuesAsList)
            if (valuesAsList.isEmpty())
                return (T[]) new Object[newSize];
            else
                return __newInstance(valuesAsList, newSize);
        return __newInstance(values.iterator(), newSize);
    }

    @Contract(ALWAYS_NEW_2)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                        final int newSize) {
        if (values == null)
            return (T[]) new Object[newSize];
        if (values.isEmpty())
            return (T[]) new Object[newSize];
        if (values instanceof List<? extends T>)
            return __newInstance((List<? extends T>) values, newSize);
        return __newInstance(values.iterator(), newSize);
    }

    @Contract(ALWAYS_NEW_2)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable @Unmodifiable List<? extends T> values,
                                                                        final int newSize) {
        if (values == null)
            return (T[]) new Object[newSize];
        if (values.isEmpty())
            return (T[]) new Object[newSize];
        return __newInstance(values, newSize);
    }

    @Contract(ALWAYS_NEW_2)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable @Unmodifiable Set<? extends T> values,
                                                                        final int newSize) {
        if (values == null)
            return (T[]) new Object[newSize];
        if (values.isEmpty())
            return (T[]) new Object[newSize];
        return __newInstance(values.iterator(), newSize);
    }

    @Contract(ALWAYS_NEW_2)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable @Unmodifiable Queue<? extends T> values,
                                                                        final int newSize) {
        if (values == null)
            return (T[]) new Object[newSize];
        if (values.isEmpty())
            return (T[]) new Object[newSize];
        return __newInstance(values.iterator(), newSize);
    }

    @Contract(ALWAYS_NEW_2)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable @Unmodifiable Deque<? extends T> values,
                                                                        final int newSize) {
        if (values == null)
            return (T[]) new Object[newSize];
        if (values.isEmpty())
            return (T[]) new Object[newSize];
        return __newInstance(values.iterator(), newSize);
    }

    @Contract(ALWAYS_NEW_2)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                        final int newSize) {
        if (values == null)
            return (T[]) new Object[newSize];
        if (values.size() == 0)
            return (T[]) new Object[newSize];
        return __newInstance(values, newSize);
    }

    @Contract(ALWAYS_NEW_2)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable CollectionHolder<? extends T> values,
                                                                        final int newSize) {
        if (values == null)
            return (T[]) new Object[newSize];
        if (values.isEmpty())
            return (T[]) new Object[newSize];
        return __newInstance(values, newSize);
    }


    @Contract(value = ALWAYS_NEW_2, mutates = "param1")
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable Iterator<? extends T> values,
                                                                        final int newSize) {
        if (values == null)
            return (T[]) new Object[newSize];
        if (!values.hasNext())
            return (T[]) new Object[newSize];
        if (values instanceof CollectionIterator<? extends T> valuesAsCollectionIterator)
            if (valuesAsCollectionIterator.isEmpty())
                return (T[]) new Object[newSize];
            else
                return __newInstance(valuesAsCollectionIterator, newSize);
        return __newInstance(values, newSize);
    }

    @Contract(value = ALWAYS_NEW_2, mutates = "param1")
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable Spliterator<? extends T> values,
                                                                        final int newSize) {
        if (values == null)
            return (T[]) new Object[newSize];
        return __newInstance(values, newSize);
    }

    @Contract(value = ALWAYS_NEW_2, mutates = "param1")
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable Enumeration<? extends T> values,
                                                                        final int newSize) {
        if (values == null)
            return (T[]) new Object[newSize];
        if (!values.hasMoreElements())
            return (T[]) new Object[newSize];
        return __newInstance(values, newSize);
    }

    @Contract(value = ALWAYS_NEW_2, mutates = "param1")
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable CollectionIterator<? extends T> values,
                                                                        final int newSize) {
        if (values == null)
            return (T[]) new Object[newSize];
        if (values.isEmpty())
            return (T[]) new Object[newSize];
        if (!values.hasNext())
            return (T[]) new Object[newSize];
        return __newInstance(values, newSize);
    }

    //#endregion -------------------- values, newSize --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    private static <T extends @Nullable Object> T @Unmodifiable [] __newInstance(final T @Unmodifiable [] values,
                                                                                 final int size) {
        @SuppressWarnings("unchecked cast") final var array = (T[]) new Object[size];
        var index = size;
        while (index-- > 0)
            array[index] = values[index];
        return array;
    }

    private static boolean @Unmodifiable [] __newInstance(final boolean @Unmodifiable [] values,
                                                          final int size) {
        final var array = new boolean[size];
        var index = size;
        while (index-- > 0)
            array[index] = values[index];
        return array;
    }

    private static char @Unmodifiable [] __newInstance(final char @Unmodifiable [] values,
                                                       final int size) {
        final var array = new char[size];
        var index = size;
        while (index-- > 0)
            array[index] = values[index];
        return array;
    }

    private static byte @Unmodifiable [] __newInstance(final byte @Unmodifiable [] values,
                                                       final int size) {
        final var array = new byte[size];
        var index = size;
        while (index-- > 0)
            array[index] = values[index];
        return array;
    }

    private static short @Unmodifiable [] __newInstance(final short @Unmodifiable [] values,
                                                        final int size) {
        final var array = new short[size];
        var index = size;
        while (index-- > 0)
            array[index] = values[index];
        return array;
    }

    private static int @Unmodifiable [] __newInstance(final int @Unmodifiable [] values,
                                                      final int size) {
        final var array = new int[size];
        var index = size;
        while (index-- > 0)
            array[index] = values[index];
        return array;
    }

    private static long @Unmodifiable [] __newInstance(final long @Unmodifiable [] values,
                                                       final int size) {
        final var array = new long[size];
        var index = size;
        while (index-- > 0)
            array[index] = values[index];
        return array;
    }

    private static float @Unmodifiable [] __newInstance(final float @Unmodifiable [] values,
                                                        final int size) {
        final var array = new float[size];
        var index = size;
        while (index-- > 0)
            array[index] = values[index];
        return array;
    }

    private static double @Unmodifiable [] __newInstance(final double @Unmodifiable [] values,
                                                         final int size) {
        final var array = new double[size];
        var index = size;
        while (index-- > 0)
            array[index] = values[index];
        return array;
    }


    private static <T extends @Nullable Object> T @Unmodifiable [] __newInstance(final MinimalistCollectionHolder<? extends T> values,
                                                                                 final int size) {
        @SuppressWarnings("unchecked cast") final var array = (T[]) new Object[size];
        var index = size;
        while (index-- > 0)
            array[index] = values.get(index);
        return array;
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __newInstance(final List<? extends T> values,
                                                                                 final int size) {
        @SuppressWarnings("unchecked cast") final var array = (T[]) new Object[size];
        var index = size;
        while (index-- > 0)
            array[index] = values.get(index);
        return array;
    }


    private static <T extends @Nullable Object> T @Unmodifiable [] __newInstance(final CollectionIterator<? extends T> values,
                                                                                 final int size) {
        @SuppressWarnings("unchecked cast") final var array = (T[]) new Object[size];
        var index = size;
        while (index-- > 0)
            array[index] = values.nextValue();
        return array;
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __newInstance(final Iterator<? extends T> values,
                                                                                 final int size) {
        @SuppressWarnings("unchecked cast") final var array = (T[]) new Object[size];
        var index = size;
        while (index-- > 0)
            array[index] = values.next();
        return array;
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __newInstance(final Spliterator<? extends T> values,
                                                                                 final int size) {
        @SuppressWarnings("unchecked cast") final var array = (T[]) new Object[size];
        var index = size;
        while (index-- > 0) {
            final var index2 = index;
            if (!values.tryAdvance(it -> array[index2] = it))
                throw new NoElementFoundInCollectionException("No element could be found at the index “" + index + "” on the Spliterator instance");
        }
        return array;
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __newInstance(final Enumeration<? extends T> values,
                                                                                 final int size) {
        @SuppressWarnings("unchecked cast") final var array = (T[]) new Object[size];
        var index = size;
        while (index-- > 0)
            array[index] = values.nextElement();
        return array;
    }


    private static <T extends @Nullable Object> T @Unmodifiable [] __newInstance(final Iterator<? extends T> values) {
        T[] array = Array();
        var index = -1;
        while (values.hasNext()) {
            // We create a new array of 1 more element and add the next element afterward
            @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[++index + 1];
            var index2 = -1;
            while (++index2 < index)
                newArray[index2] = array[index2];
            array = newArray;
            array[index] = values.next();
        }
        return array;
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __newInstance(final Spliterator<? extends T> values) {
        T[] array = Array();
        var canContinue = true;
        var index = -1;
        while (canContinue) {
            final var index2 = ++index;
            // We create a new array of 1 more element and add the next element afterward
            @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[index2 + 1];
            var index3 = -1;
            while (++index3 < index)
                newArray[index3] = array[index3];
            final var arraySent = array = newArray;
            canContinue = values.tryAdvance(it -> arraySent[index2] = it);
        }
        return array;
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __newInstance(final Enumeration<? extends T> values) {
        T[] array = Array();
        var index = -1;
        while (values.hasMoreElements()) {
            // We create a new array of 1 more element and add the next element afterward
            @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[++index + 1];
            var index2 = -1;
            while (++index2 < index)
                newArray[index2] = array[index2];
            array = newArray;
            array[index] = values.nextElement();
        }
        return array;
    }

    //#endregion -------------------- Core methods --------------------

}
