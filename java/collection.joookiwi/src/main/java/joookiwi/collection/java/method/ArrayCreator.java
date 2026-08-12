package joookiwi.collection.java.method;

import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
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
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import joookiwi.collection.java.iterator.CollectionIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_10;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_4;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_5;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_6;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_7;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_8;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_9;

@NotNullByDefault
public final class ArrayCreator
        extends CreatorUtility {

    //#region -------------------- Fields --------------------

    private static @Nullable WeakReference<Object @Nullable @Unmodifiable []> __emptyArray;
    private static final java.util.Map<Class<?>, WeakReference<Object @Unmodifiable []>> __otherEmptyArrays = new IdentityHashMap<>();
    private static final java.util.Map<Integer, WeakReference<Object @Unmodifiable []>> __sizedArrays = new IdentityHashMap<>();
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

    /// An [Object] (cast to [T]) [empty Array][java.lang.reflect.Array]
    public static <T extends @Nullable Object> T @Unmodifiable [] Array() {
        final var valueHolder = __emptyArray;
        if (valueHolder == null) {
            @SuppressWarnings("unchecked cast") final var value = (T[]) new Object[0];
            __emptyArray = new WeakReference<>(value);
            return value;
        }

        // We see if the value from the WeakReference still exists
        @SuppressWarnings("unchecked cast") final var value = (T[]) valueHolder.get();
        if (value != null)
            return value;

        // We re-assign a new value since the old value is no longer referenced anywhere
        @SuppressWarnings("unchecked cast") final var newValue = (T[]) new Object[0];
        __emptyArray = new WeakReference<>(newValue);
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

        // We see if the value from the WeakReference still exists
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

        // We see if the value from the WeakReference still exists
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

        // We see if the value from the WeakReference still exists
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

        // We see if the value from the WeakReference still exists
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

        // We see if the value from the WeakReference still exists
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

        // We see if the value from the WeakReference still exists
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

        // We see if the value from the WeakReference still exists
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

        // We see if the value from the WeakReference still exists
        final var value = valueHolder.get();
        if (value != null)
            return value;

        // We re-assign a new value since the old value is no longer referenced anywhere
        final var newValue = new double[0];
        __emptyDoubleArray = new WeakReference<>(newValue);
        return newValue;
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- type --------------------

    /// Give an [empty Array][java.lang.reflect.Array] of the specified type.
    ///
    /// Note that it reuses the [empty Array][java.lang.reflect.Array] depending on the type received.
    /// But, it does not hold any strong reference to the value returned
    ///
    /// @param <T> The type
    /// @param type The [Class] type to get a new empty array
    @Contract(value = ALWAYS_NEW_1, pure = true)
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final Class<? extends T> type) {
        if (type == Object.class)
            return Array();

        final var map = __otherEmptyArrays;
        if (map.containsKey(type)) {
            @SuppressWarnings("unchecked cast") final var valueFound = (T @Nullable []) map.get(type).get();
            if (valueFound != null)
                return valueFound;
        }
        @SuppressWarnings("unchecked cast") final var newValue = (T[]) Array.newInstance(type, 0);
        map.put(type, new WeakReference<>(newValue));
        return newValue;
    }

    @SuppressWarnings("unchecked cast")
    @Contract(value = ALWAYS_NEW_2, pure = true)
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final Class<? extends T> type, int size) {
        if (size == 0)
            return Array(type);
        if (size < 0)
            throw new IndexOutOfBoundsException("No array can be created with a negative size (“" + size + "”).", size);//TODO: replace with a negative index exception instead
        return (T[]) Array.newInstance(type, size);
    }

    //#endregion -------------------- type --------------------
    //#region -------------------- size --------------------

    public static <T extends @Nullable Object> T @Unmodifiable [] sizedArray(final int size) {
        if (size == 0)
            return Array();
        if (size < 0)
            throw new IndexOutOfBoundsException("No array can be created with a negative size (“" + size + "”).", size);//TODO: replace with a negative index exception instead

        final var map = __sizedArrays;
        if (map.containsKey(size)) {
            @SuppressWarnings("unchecked cast") final var valueFound = (T @Nullable []) map.get(size).get();
            if (valueFound != null)
                return valueFound;
        }

        @SuppressWarnings("unchecked cast") final var newValue = (T[]) new Object[size];
        map.put(size, new WeakReference<>(newValue));
        return newValue;
    }

    //#endregion -------------------- size --------------------
    //#region -------------------- value --------------------

    @Contract(value = ALWAYS_NEW_1, pure = true)
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final T value) {
        if (value == null)
            return sizedArray(1);

        @SuppressWarnings("unchecked cast") final var newArray = Array((Class<? extends T>) value.getClass(), 1);
        newArray[0] = value;
        return newArray;
    }

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
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final T value1, final T value2) {
        if (value1 == null)
            if (value2 == null)
                return sizedArray(2);
            else { // We have null (value1) and value2
                @SuppressWarnings("unchecked cast") final var newArray = Array((Class<? extends T>) value2.getClass(), 2);
                newArray[0] = null;
                newArray[1] = value2;
                return newArray;
            }
        if (value2 == null) { // We have value1 and null (value2)
            @SuppressWarnings("unchecked cast") final var newArray = Array((Class<? extends T>) value1.getClass(), 2);
            newArray[0] = value1;
            newArray[1] = null;
            return newArray;
        }

        final var value1Class = value1.getClass();
        final var value2Class = value2.getClass();
        if (value1Class == value2Class) { // We have the same type on both value1 & value2
            @SuppressWarnings("unchecked cast") final var newArray = Array((Class<? extends T>) value1Class, 2);
            newArray[0] = value1;
            newArray[1] = value2;
            return newArray;
        }
        if (value1Class.isAssignableFrom(value2Class)) { // value1 is of the parent type
            @SuppressWarnings("unchecked cast") final var newArray = Array((Class<? extends T>) value1Class, 2);
            newArray[0] = value1;
            newArray[1] = value2;
            return newArray;
        }
        if (value2Class.isAssignableFrom(value1Class)) { // value2 is of the parent type
            @SuppressWarnings("unchecked cast") final var newArray = Array((Class<? extends T>) value2Class, 2);
            newArray[0] = value1;
            newArray[1] = value2;
            return newArray;
        }

        // Object is the common ancestor of both types
        @SuppressWarnings("unchecked cast") final var newArray = Array((Class<? extends T>) Object.class, 2);
        newArray[0] = value1;
        newArray[1] = value2;
        return newArray;
    }

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
    //#region -------------------- value1, value2, value3 --------------------

    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final T value1, final T value2, final T value3) { throw new RuntimeException("Not implemented yet."); }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    public static boolean @Unmodifiable [] Array(final boolean value1, final boolean value2, final boolean value3) { return new boolean[]{value1, value2, value3,}; }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    public static char @Unmodifiable [] Array(final char value1, final char value2, final char value3) { return new char[]{value1, value2, value3,}; }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    public static byte @Unmodifiable [] Array(final byte value1, final byte value2, final byte value3) { return new byte[]{value1, value2, value3,}; }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    public static short @Unmodifiable [] Array(final short value1, final short value2, final short value3) { return new short[]{value1, value2, value3,}; }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    public static int @Unmodifiable [] Array(final int value1, final int value2, final int value3) { return new int[]{value1, value2, value3,}; }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    public static long @Unmodifiable [] Array(final long value1, final long value2, final long value3) { return new long[]{value1, value2, value3,}; }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    public static float @Unmodifiable [] Array(final float value1, final float value2, final float value3) { return new float[]{value1, value2, value3,}; }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    public static double @Unmodifiable [] Array(final double value1, final double value2, final double value3) { return new double[]{value1, value2, value3,}; }

    //#endregion -------------------- value1, value2, value3 --------------------
    //#region -------------------- value1, value2, value3, value4 --------------------

    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final T value1, final T value2, final T value3, final T value4) { throw new RuntimeException("Not implemented yet."); }

    @Contract(value = ALWAYS_NEW_4, pure = true)
    public static boolean @Unmodifiable [] Array(final boolean value1, final boolean value2, final boolean value3, final boolean value4) { return new boolean[]{value1, value2, value3, value4,}; }

    @Contract(value = ALWAYS_NEW_4, pure = true)
    public static char @Unmodifiable [] Array(final char value1, final char value2, final char value3, final char value4) { return new char[]{value1, value2, value3, value4,}; }

    @Contract(value = ALWAYS_NEW_4, pure = true)
    public static byte @Unmodifiable [] Array(final byte value1, final byte value2, final byte value3, final byte value4) { return new byte[]{value1, value2, value3, value4,}; }

    @Contract(value = ALWAYS_NEW_4, pure = true)
    public static short @Unmodifiable [] Array(final short value1, final short value2, final short value3, final short value4) { return new short[]{value1, value2, value3, value4,}; }

    @Contract(value = ALWAYS_NEW_4, pure = true)
    public static int @Unmodifiable [] Array(final int value1, final int value2, final int value3, final int value4) { return new int[]{value1, value2, value3, value4,}; }

    @Contract(value = ALWAYS_NEW_4, pure = true)
    public static long @Unmodifiable [] Array(final long value1, final long value2, final long value3, final long value4) { return new long[]{value1, value2, value3, value4,}; }

    @Contract(value = ALWAYS_NEW_4, pure = true)
    public static float @Unmodifiable [] Array(final float value1, final float value2, final float value3, final float value4) { return new float[]{value1, value2, value3, value4,}; }

    @Contract(value = ALWAYS_NEW_4, pure = true)
    public static double @Unmodifiable [] Array(final double value1, final double value2, final double value3, final double value4) { return new double[]{value1, value2, value3, value4,}; }

    //#endregion -------------------- value1, value2, value3, value4 --------------------
    //#region -------------------- value1, value2, value3, value4, value5 --------------------

    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final T value1, final T value2, final T value3, final T value4, final T value5) { throw new RuntimeException("Not implemented yet."); }

    @Contract(value = ALWAYS_NEW_5, pure = true)
    public static boolean @Unmodifiable [] Array(final boolean value1, final boolean value2, final boolean value3, final boolean value4, final boolean value5) { return new boolean[]{value1, value2, value3, value4, value5,}; }

    @Contract(value = ALWAYS_NEW_5, pure = true)
    public static char @Unmodifiable [] Array(final char value1, final char value2, final char value3, final char value4, final char value5) { return new char[]{value1, value2, value3, value4, value5,}; }

    @Contract(value = ALWAYS_NEW_5, pure = true)
    public static byte @Unmodifiable [] Array(final byte value1, final byte value2, final byte value3, final byte value4, final byte value5) { return new byte[]{value1, value2, value3, value4, value5,}; }

    @Contract(value = ALWAYS_NEW_5, pure = true)
    public static short @Unmodifiable [] Array(final short value1, final short value2, final short value3, final short value4, final short value5) { return new short[]{value1, value2, value3, value4, value5,}; }

    @Contract(value = ALWAYS_NEW_5, pure = true)
    public static int @Unmodifiable [] Array(final int value1, final int value2, final int value3, final int value4, final int value5) { return new int[]{value1, value2, value3, value4, value5,}; }

    @Contract(value = ALWAYS_NEW_5, pure = true)
    public static long @Unmodifiable [] Array(final long value1, final long value2, final long value3, final long value4, final long value5) { return new long[]{value1, value2, value3, value4, value5,}; }

    @Contract(value = ALWAYS_NEW_5, pure = true)
    public static float @Unmodifiable [] Array(final float value1, final float value2, final float value3, final float value4, final float value5) { return new float[]{value1, value2, value3, value4, value5,}; }

    @Contract(value = ALWAYS_NEW_5, pure = true)
    public static double @Unmodifiable [] Array(final double value1, final double value2, final double value3, final double value4, final double value5) { return new double[]{value1, value2, value3, value4, value5,}; }

    //#endregion -------------------- value1, value2, value3, value4, value5 --------------------
    //#region -------------------- value1, value2, value3, value4, value5, value6 --------------------

    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final T value1, final T value2, final T value3, final T value4, final T value5, final T value6) { throw new RuntimeException("Not implemented yet."); }

    @Contract(value = ALWAYS_NEW_6, pure = true)
    public static boolean @Unmodifiable [] Array(final boolean value1, final boolean value2, final boolean value3, final boolean value4, final boolean value5, final boolean value6) { return new boolean[]{value1, value2, value3, value4, value5, value6,}; }
    
    @Contract(value = ALWAYS_NEW_6, pure = true)
    public static char @Unmodifiable [] Array(final char value1, final char value2, final char value3, final char value4, final char value5, final char value6) { return new char[]{value1, value2, value3, value4, value5, value6,}; }
    
    @Contract(value = ALWAYS_NEW_6, pure = true)
    public static byte @Unmodifiable [] Array(final byte value1, final byte value2, final byte value3, final byte value4, final byte value5, final byte value6) { return new byte[]{value1, value2, value3, value4, value5, value6,}; }
    
    @Contract(value = ALWAYS_NEW_6, pure = true)
    public static short @Unmodifiable [] Array(final short value1, final short value2, final short value3, final short value4, final short value5, final short value6) { return new short[]{value1, value2, value3, value4, value5, value6,}; }
    
    @Contract(value = ALWAYS_NEW_6, pure = true)
    public static int @Unmodifiable [] Array(final int value1, final int value2, final int value3, final int value4, final int value5, final int value6) { return new int[]{value1, value2, value3, value4, value5, value6,}; }
    
    @Contract(value = ALWAYS_NEW_6, pure = true)
    public static long @Unmodifiable [] Array(final long value1, final long value2, final long value3, final long value4, final long value5, final long value6) { return new long[]{value1, value2, value3, value4, value5, value6,}; }
    
    @Contract(value = ALWAYS_NEW_6, pure = true)
    public static float @Unmodifiable [] Array(final float value1, final float value2, final float value3, final float value4, final float value5, final float value6) { return new float[]{value1, value2, value3, value4, value5, value6,}; }
    
    @Contract(value = ALWAYS_NEW_6, pure = true)
    public static double @Unmodifiable [] Array(final double value1, final double value2, final double value3, final double value4, final double value5, final double value6) { return new double[]{value1, value2, value3, value4, value5, value6,}; }

    //#endregion -------------------- value1, value2, value3, value4, value5, value6 --------------------
    //#region -------------------- value1, value2, value3, value4, value5, value6, value7 --------------------

    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final T value1, final T value2, final T value3, final T value4, final T value5, final T value6, final T value7) { throw new RuntimeException("Not implemented yet."); }

    @Contract(value = ALWAYS_NEW_7, pure = true)
    public static boolean @Unmodifiable [] Array(final boolean value1, final boolean value2, final boolean value3, final boolean value4, final boolean value5, final boolean value6, final boolean value7) { return new boolean[]{value1, value2, value3, value4, value5, value6, value7,}; }

    @Contract(value = ALWAYS_NEW_7, pure = true)
    public static char @Unmodifiable [] Array(final char value1, final char value2, final char value3, final char value4, final char value5, final char value6, final char value7) { return new char[]{value1, value2, value3, value4, value5, value6, value7,}; }

    @Contract(value = ALWAYS_NEW_7, pure = true)
    public static byte @Unmodifiable [] Array(final byte value1, final byte value2, final byte value3, final byte value4, final byte value5, final byte value6, final byte value7) { return new byte[]{value1, value2, value3, value4, value5, value6, value7,}; }

    @Contract(value = ALWAYS_NEW_7, pure = true)
    public static short @Unmodifiable [] Array(final short value1, final short value2, final short value3, final short value4, final short value5, final short value6, final short value7) { return new short[]{value1, value2, value3, value4, value5, value6, value7,}; }

    @Contract(value = ALWAYS_NEW_7, pure = true)
    public static int @Unmodifiable [] Array(final int value1, final int value2, final int value3, final int value4, final int value5, final int value6, final int value7) { return new int[]{value1, value2, value3, value4, value5, value6, value7,}; }

    @Contract(value = ALWAYS_NEW_7, pure = true)
    public static long @Unmodifiable [] Array(final long value1, final long value2, final long value3, final long value4, final long value5, final long value6, final long value7) { return new long[]{value1, value2, value3, value4, value5, value6, value7,}; }

    @Contract(value = ALWAYS_NEW_7, pure = true)
    public static float @Unmodifiable [] Array(final float value1, final float value2, final float value3, final float value4, final float value5, final float value6, final float value7) { return new float[]{value1, value2, value3, value4, value5, value6, value7,}; }

    @Contract(value = ALWAYS_NEW_7, pure = true)
    public static double @Unmodifiable [] Array(final double value1, final double value2, final double value3, final double value4, final double value5, final double value6, final double value7) { return new double[]{value1, value2, value3, value4, value5, value6, value7,}; }

    //#endregion -------------------- value1, value2, value3, value4, value5, value6, value7 --------------------
    //#region -------------------- value1, value2, value3, value4, value5, value6, value7, value8 --------------------

    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final T value1, final T value2, final T value3, final T value4, final T value5, final T value6, final T value7, final T value8) { throw new RuntimeException("Not implemented yet."); }

    @Contract(value = ALWAYS_NEW_8, pure = true)
    public static boolean @Unmodifiable [] Array(final boolean value1, final boolean value2, final boolean value3, final boolean value4, final boolean value5, final boolean value6, final boolean value7, final boolean value8) { return new boolean[]{value1, value2, value3, value4, value5, value6, value7, value8,}; }

    @Contract(value = ALWAYS_NEW_8, pure = true)
    public static char @Unmodifiable [] Array(final char value1, final char value2, final char value3, final char value4, final char value5, final char value6, final char value7, final char value8) { return new char[]{value1, value2, value3, value4, value5, value6, value7, value8,}; }

    @Contract(value = ALWAYS_NEW_8, pure = true)
    public static byte @Unmodifiable [] Array(final byte value1, final byte value2, final byte value3, final byte value4, final byte value5, final byte value6, final byte value7, final byte value8) { return new byte[]{value1, value2, value3, value4, value5, value6, value7, value8,}; }

    @Contract(value = ALWAYS_NEW_8, pure = true)
    public static short @Unmodifiable [] Array(final short value1, final short value2, final short value3, final short value4, final short value5, final short value6, final short value7, final short value8) { return new short[]{value1, value2, value3, value4, value5, value6, value7, value8,}; }

    @Contract(value = ALWAYS_NEW_8, pure = true)
    public static int @Unmodifiable [] Array(final int value1, final int value2, final int value3, final int value4, final int value5, final int value6, final int value7, final int value8) { return new int[]{value1, value2, value3, value4, value5, value6, value7, value8,}; }

    @Contract(value = ALWAYS_NEW_8, pure = true)
    public static long @Unmodifiable [] Array(final long value1, final long value2, final long value3, final long value4, final long value5, final long value6, final long value7, final long value8) { return new long[]{value1, value2, value3, value4, value5, value6, value7, value8,}; }

    @Contract(value = ALWAYS_NEW_8, pure = true)
    public static float @Unmodifiable [] Array(final float value1, final float value2, final float value3, final float value4, final float value5, final float value6, final float value7, final float value8) { return new float[]{value1, value2, value3, value4, value5, value6, value7, value8,}; }

    @Contract(value = ALWAYS_NEW_8, pure = true)
    public static double @Unmodifiable [] Array(final double value1, final double value2, final double value3, final double value4, final double value5, final double value6, final double value7, final double value8) { return new double[]{value1, value2, value3, value4, value5, value6, value7, value8,}; }

    //#endregion -------------------- value1, value2, value3, value4, value5, value6, value7, value8 --------------------
    //#region -------------------- value1, value2, value3, value4, value5, value6, value7, value8, value9 --------------------

    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final T value1, final T value2, final T value3, final T value4, final T value5, final T value6, final T value7, final T value8, final T value9) { throw new RuntimeException("Not implemented yet."); }

    @Contract(value = ALWAYS_NEW_9, pure = true)
    public static boolean @Unmodifiable [] Array(final boolean value1, final boolean value2, final boolean value3, final boolean value4, final boolean value5, final boolean value6, final boolean value7, final boolean value8, final boolean value9) { return new boolean[]{value1, value2, value3, value4, value5, value6, value7, value8, value9,}; }

    @Contract(value = ALWAYS_NEW_9, pure = true)
    public static char @Unmodifiable [] Array(final char value1, final char value2, final char value3, final char value4, final char value5, final char value6, final char value7, final char value8, final char value9) { return new char[]{value1, value2, value3, value4, value5, value6, value7, value8, value9,}; }

    @Contract(value = ALWAYS_NEW_9, pure = true)
    public static byte @Unmodifiable [] Array(final byte value1, final byte value2, final byte value3, final byte value4, final byte value5, final byte value6, final byte value7, final byte value8, final byte value9) { return new byte[]{value1, value2, value3, value4, value5, value6, value7, value8, value9,}; }

    @Contract(value = ALWAYS_NEW_9, pure = true)
    public static short @Unmodifiable [] Array(final short value1, final short value2, final short value3, final short value4, final short value5, final short value6, final short value7, final short value8, final short value9) { return new short[]{value1, value2, value3, value4, value5, value6, value7, value8, value9,}; }

    @Contract(value = ALWAYS_NEW_9, pure = true)
    public static int @Unmodifiable [] Array(final int value1, final int value2, final int value3, final int value4, final int value5, final int value6, final int value7, final int value8, final int value9) { return new int[]{value1, value2, value3, value4, value5, value6, value7, value8, value9,}; }

    @Contract(value = ALWAYS_NEW_9, pure = true)
    public static long @Unmodifiable [] Array(final long value1, final long value2, final long value3, final long value4, final long value5, final long value6, final long value7, final long value8, final long value9) { return new long[]{value1, value2, value3, value4, value5, value6, value7, value8, value9,}; }

    @Contract(value = ALWAYS_NEW_9, pure = true)
    public static float @Unmodifiable [] Array(final float value1, final float value2, final float value3, final float value4, final float value5, final float value6, final float value7, final float value8, final float value9) { return new float[]{value1, value2, value3, value4, value5, value6, value7, value8, value9,}; }

    @Contract(value = ALWAYS_NEW_9, pure = true)
    public static double @Unmodifiable [] Array(final double value1, final double value2, final double value3, final double value4, final double value5, final double value6, final double value7, final double value8, final double value9) { return new double[]{value1, value2, value3, value4, value5, value6, value7, value8, value9,}; }

    //#endregion -------------------- value1, value2, value3, value4, value5, value6, value7, value8, value9 --------------------
    //#region -------------------- value1, value2, value3, value4, value5, value6, value7, value8, value9, value10 --------------------

    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final T value1, final T value2, final T value3, final T value4, final T value5, final T value6, final T value7, final T value8, final T value9, final T value10) { throw new RuntimeException("Not implemented yet."); }

    @Contract(value = ALWAYS_NEW_10, pure = true)
    public static boolean @Unmodifiable [] Array(final boolean value1, final boolean value2, final boolean value3, final boolean value4, final boolean value5, final boolean value6, final boolean value7, final boolean value8, final boolean value9, final boolean value10) { return new boolean[]{value1, value2, value3, value4, value5, value6, value7, value8, value9, value10,}; }

    @Contract(value = ALWAYS_NEW_10, pure = true)
    public static char @Unmodifiable [] Array(final char value1, final char value2, final char value3, final char value4, final char value5, final char value6, final char value7, final char value8, final char value9, final char value10) { return new char[]{value1, value2, value3, value4, value5, value6, value7, value8, value9, value10,}; }

    @Contract(value = ALWAYS_NEW_10, pure = true)
    public static byte @Unmodifiable [] Array(final byte value1, final byte value2, final byte value3, final byte value4, final byte value5, final byte value6, final byte value7, final byte value8, final byte value9, final byte value10) { return new byte[]{value1, value2, value3, value4, value5, value6, value7, value8, value9, value10,}; }

    @Contract(value = ALWAYS_NEW_10, pure = true)
    public static short @Unmodifiable [] Array(final short value1, final short value2, final short value3, final short value4, final short value5, final short value6, final short value7, final short value8, final short value9, final short value10) { return new short[]{value1, value2, value3, value4, value5, value6, value7, value8, value9, value10,}; }

    @Contract(value = ALWAYS_NEW_10, pure = true)
    public static int @Unmodifiable [] Array(final int value1, final int value2, final int value3, final int value4, final int value5, final int value6, final int value7, final int value8, final int value9, final int value10) { return new int[]{value1, value2, value3, value4, value5, value6, value7, value8, value9, value10,}; }

    @Contract(value = ALWAYS_NEW_10, pure = true)
    public static long @Unmodifiable [] Array(final long value1, final long value2, final long value3, final long value4, final long value5, final long value6, final long value7, final long value8, final long value9, final long value10) { return new long[]{value1, value2, value3, value4, value5, value6, value7, value8, value9, value10,}; }

    @Contract(value = ALWAYS_NEW_10, pure = true)
    public static float @Unmodifiable [] Array(final float value1, final float value2, final float value3, final float value4, final float value5, final float value6, final float value7, final float value8, final float value9, final float value10) { return new float[]{value1, value2, value3, value4, value5, value6, value7, value8, value9, value10,}; }

    @Contract(value = ALWAYS_NEW_10, pure = true)
    public static double @Unmodifiable [] Array(final double value1, final double value2, final double value3, final double value4, final double value5, final double value6, final double value7, final double value8, final double value9, final double value10) { return new double[]{value1, value2, value3, value4, value5, value6, value7, value8, value9, value10,}; }

    //#endregion -------------------- value1, value2, value3, value4, value5, value6, value7, value8, value9, value10 --------------------
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
            return sizedArray(newSize); // TODO: find the array type to keep its continuity
        if (values.length == 0)
            return sizedArray(newSize); // TODO: find the array type to keep its continuity
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
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable Iterable<? extends T> values,
                                                                        final int newSize) {
        if (values == null) // We cannot determine the type since there is no values
            return sizedArray(newSize);
        if (values instanceof CollectionHolder<? extends T> valuesAsCollectionHolder)
            if (valuesAsCollectionHolder.isEmpty())
                return sizedArray(newSize); // TODO: find the array type to keep its continuity
            else
                return __newInstance(valuesAsCollectionHolder, newSize);
        if (values instanceof List<? extends T> valuesAsList)
            if (valuesAsList.isEmpty())
                return sizedArray(newSize); // TODO: find the array type to keep its continuity
            else
                return __newInstance(valuesAsList, newSize);
        return __newInstance(values.iterator(), newSize);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                        final int newSize) {
        if (values == null) // We cannot determine the type since there is no values
            return sizedArray(newSize);
        if (values.isEmpty())
            return sizedArray(newSize); // TODO: find the array type to keep its continuity
        if (values instanceof List<? extends T>)
            return __newInstance((List<? extends T>) values, newSize);
        return __newInstance(values.iterator(), newSize);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable @Unmodifiable List<? extends T> values,
                                                                        final int newSize) {
        if (values == null) // We cannot determine the type since there is no values
            return sizedArray(newSize);
        if (values.isEmpty())
            return sizedArray(newSize); // TODO: find the array type to keep its continuity
        return __newInstance(values, newSize);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable @Unmodifiable Set<? extends T> values,
                                                                        final int newSize) {
        if (values == null) // We cannot determine the type since there is no values
            return sizedArray(newSize);
        if (values.isEmpty())
            return sizedArray(newSize); // TODO: find the array type to keep its continuity
        return __newInstance(values.iterator(), newSize);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable @Unmodifiable Queue<? extends T> values,
                                                                        final int newSize) {
        if (values == null) // We cannot determine the type since there is no values
            return sizedArray(newSize);
        if (values.isEmpty())
            return sizedArray(newSize); // TODO: find the array type to keep its continuity
        return __newInstance(values.iterator(), newSize);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable @Unmodifiable Deque<? extends T> values,
                                                                        final int newSize) {
        if (values == null) // We cannot determine the type since there is no values
            return sizedArray(newSize);
        if (values.isEmpty())
            return sizedArray(newSize); // TODO: find the array type to keep its continuity
        return __newInstance(values.iterator(), newSize);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                        final int newSize) {
        if (values == null) // We cannot determine the type since there is no values
            return sizedArray(newSize);
        if (values.size() == 0)
            return sizedArray(newSize); // TODO: find the array type to keep its continuity
        return __newInstance(values, newSize);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable CollectionHolder<? extends T> values,
                                                                        final int newSize) {
        if (values == null) // We cannot determine the type since there is no values
            return sizedArray(newSize);
        if (values.isEmpty())
            return sizedArray(newSize); // TODO: find the array type to keep its continuity
        return __newInstance(values, newSize);
    }


    @Contract(value = ALWAYS_NEW_2, mutates = "param1")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable Iterator<? extends T> values,
                                                                        final int newSize) {
        if (values == null) // We cannot determine the type since there is no values
            return sizedArray(newSize);
        if (!values.hasNext())
            return sizedArray(newSize); // TODO: find the array type to keep its continuity
        if (values instanceof CollectionIterator<? extends T> valuesAsCollectionIterator)
            if (valuesAsCollectionIterator.isEmpty())
                return sizedArray(newSize); // TODO: find the array type to keep its continuity
            else
                return __newInstance(valuesAsCollectionIterator, newSize);
        return __newInstance(values, newSize);
    }

    @Contract(value = ALWAYS_NEW_2, mutates = "param1")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable Spliterator<? extends T> values,
                                                                        final int newSize) {
        if (values == null) // We cannot determine the type since there is no values
            return sizedArray(newSize);
        return __newInstance(values, newSize);
    }

    @Contract(value = ALWAYS_NEW_2, mutates = "param1")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable Enumeration<? extends T> values,
                                                                        final int newSize) {
        if (values == null) // We cannot determine the type since there is no values
            return sizedArray(newSize);
        if (!values.hasMoreElements())
            return sizedArray(newSize); // TODO: find the array type to keep its continuity
        return __newInstance(values, newSize);
    }

    @Contract(value = ALWAYS_NEW_2, mutates = "param1")
    public static <T extends @Nullable Object> T @Unmodifiable [] Array(final @Nullable CollectionIterator<? extends T> values,
                                                                        final int newSize) {
        if (values == null) // We cannot determine the type since there is no values
            return sizedArray(newSize);
        if (values.isEmpty())
            return sizedArray(newSize); // TODO: find the array type to keep its continuity
        if (!values.hasNext())
            return sizedArray(newSize); // TODO: find the array type to keep its continuity
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
