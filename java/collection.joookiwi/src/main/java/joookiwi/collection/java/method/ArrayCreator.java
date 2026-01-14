package joookiwi.collection.java.method;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Deque;
import java.util.Enumeration;
import java.util.IdentityHashMap;
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

    private static @Nullable WeakReference<Object @Nullable @Unmodifiable []> __emptyArray;
    private static final java.util.Map<Class<?>, WeakReference<Object @Unmodifiable []>> __otherEmptyArrays = new IdentityHashMap<>();
    private static @Nullable WeakReference<boolean @Unmodifiable []> __emptyBooleanArray;
    private static @Nullable WeakReference<char @Unmodifiable []> __emptyCharArray;
    private static @Nullable WeakReference<byte @Unmodifiable []> __emptyByteArray;
    private static @Nullable WeakReference<short @Unmodifiable []> __emptyShortArray;
    private static @Nullable WeakReference<int @Unmodifiable []> __emptyIntArray;
    private static @Nullable WeakReference<long @Unmodifiable []> __emptyLongArray;
    private static @Nullable WeakReference<float @Unmodifiable []> __emptyFloatArray;
    private static @Nullable WeakReference<double @Unmodifiable []> __emptyDoubleArray;

    //#endregion -------------------- Fields --------------------

    @Contract(ALWAYS_FAIL_0)
    private ArrayCreator() { throw new ImpossibleConstructionException("The utility class “ArrayCreator” cannot be constructed.", ArrayCreator.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// An [Object] (casted to [T]) [empty Array][java.lang.reflect.Array]
    public static <T extends @Nullable Object> T @Unmodifiable [] Array() {
        final var valueHolder = __emptyArray;
        if (valueHolder == null) {
            @SuppressWarnings("unchecked cast") final var value = (T[]) new Object[0];
            __emptyArray = new WeakReference<>(value);
            return value;
        }

        @SuppressWarnings("unchecked cast") final var value = (T[]) valueHolder.get();
        if (value != null)
            return value;

        // We re-assign a new value since the old value is no longer referenced anywhere
        @SuppressWarnings("unchecked cast") final var newValue = (T[]) new Object[0];
        __emptyArray = new WeakReference<>(newValue);
        return newValue;
    }

    /// Give an [empty Array][java.lang.reflect.Array] of the specified type.
    ///
    /// Note that it reuses the [empty Array][java.lang.reflect.Array] depending on the type received.
    /// But, it does not hold any strong reference to the value returned
    @SuppressWarnings("unchecked cast")
    public static <T> T @Unmodifiable [] Array(final Class<? super T> clazz) {
        if (clazz == Object.class)
            return Array();

        final var map = __otherEmptyArrays;
        if (map.containsKey(clazz)) {
            final var valueFound = map.get(clazz).get();
            if (valueFound != null)
                return (T[]) valueFound;
        }
        final var newValue = (T[]) java.lang.reflect.Array.newInstance(clazz, 0);
        map.put(clazz, new WeakReference<>(newValue));
        return newValue;
    }

    /// A `boolean` [empty Array][java.lang.reflect.Array]
    public static boolean @Unmodifiable [] BooleanArray() {
        final var valueHolder = __emptyBooleanArray;
        if (valueHolder == null) {
            final var value = new boolean[0];
            __emptyBooleanArray = new WeakReference<>(value);
            return value;
        }

        final var value = valueHolder.get();
        if (value != null)
            return value;

        // We re-assign a new value since the old value is no longer referenced anywhere
        final var newValue = new boolean[0];
        __emptyBooleanArray = new WeakReference<>(newValue);
        return newValue;
    }

    /// A `char` [empty Array][java.lang.reflect.Array]
    public static char @Unmodifiable [] CharArray() {
        final var valueHolder = __emptyCharArray;
        if (valueHolder == null) {
            final var value = new char[0];
            __emptyCharArray = new WeakReference<>(value);
            return value;
        }

        final var value = valueHolder.get();
        if (value != null)
            return value;

        // We re-assign a new value since the old value is no longer referenced anywhere
        final var newValue = new char[0];
        __emptyCharArray = new WeakReference<>(newValue);
        return newValue;
    }

    /// A `byte` [empty Array][java.lang.reflect.Array]
    public static byte @Unmodifiable [] ByteArray() {
        final var valueHolder = __emptyByteArray;
        if (valueHolder == null) {
            final var value = new byte[0];
            __emptyByteArray = new WeakReference<>(value);
            return value;
        }

        final var value = valueHolder.get();
        if (value != null)
            return value;

        // We re-assign a new value since the old value is no longer referenced anywhere
        final var newValue = new byte[0];
        __emptyByteArray = new WeakReference<>(newValue);
        return newValue;
    }

    /// A `short` [empty Array][java.lang.reflect.Array]
    public static short @Unmodifiable [] ShortArray() {
        final var valueHolder = __emptyShortArray;
        if (valueHolder == null) {
            final var value = new short[0];
            __emptyShortArray = new WeakReference<>(value);
            return value;
        }

        final var value = valueHolder.get();
        if (value != null)
            return value;

        // We re-assign a new value since the old value is no longer referenced anywhere
        final var newValue = new short[0];
        __emptyShortArray = new WeakReference<>(newValue);
        return newValue;
    }

    /// An `int` [empty Array][java.lang.reflect.Array]
    public static int @Unmodifiable [] IntArray() {
        final var valueHolder = __emptyIntArray;
        if (valueHolder == null) {
            final var value = new int[0];
            __emptyIntArray = new WeakReference<>(value);
            return value;
        }

        final var value = valueHolder.get();
        if (value != null)
            return value;

        // We re-assign a new value since the old value is no longer referenced anywhere
        final var newValue = new int[0];
        __emptyIntArray = new WeakReference<>(newValue);
        return newValue;
    }

    /// A `long` [empty Array][java.lang.reflect.Array]
    public static long @Unmodifiable [] LongArray() {
        final var valueHolder = __emptyLongArray;
        if (valueHolder == null) {
            final var value = new long[0];
            __emptyLongArray = new WeakReference<>(value);
            return value;
        }

        final var value = valueHolder.get();
        if (value != null)
            return value;

        // We re-assign a new value since the old value is no longer referenced anywhere
        final var newValue = new long[0];
        __emptyLongArray = new WeakReference<>(newValue);
        return newValue;
    }

    /// A `float` [empty Array][java.lang.reflect.Array]
    public static float @Unmodifiable [] FloatArray() {
        final var valueHolder = __emptyFloatArray;
        if (valueHolder == null) {
            final var value = new float[0];
            __emptyFloatArray = new WeakReference<>(value);
            return value;
        }

        final var value = valueHolder.get();
        if (value != null)
            return value;

        // We re-assign a new value since the old value is no longer referenced anywhere
        final var newValue = new float[0];
        __emptyFloatArray = new WeakReference<>(newValue);
        return newValue;
    }

    /// A `double` [empty Array][java.lang.reflect.Array]
    public static double @Unmodifiable [] DoubleArray() {
        final var valueHolder = __emptyDoubleArray;
        if (valueHolder == null) {
            final var value = new double[0];
            __emptyDoubleArray = new WeakReference<>(value);
            return value;
        }

        final var value = valueHolder.get();
        if (value != null)
            return value;

        // We re-assign a new value since the old value is no longer referenced anywhere
        final var newValue = new double[0];
        __emptyDoubleArray = new WeakReference<>(newValue);
        return newValue;
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
