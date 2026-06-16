package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Stream;
import joookiwi.collection.java.ClassWith1Value;
import joookiwi.collection.java.iterator.CollectionIteratorOf1;
import joookiwi.collection.java.method.ArrayCreator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

@NotNullByDefault
public class ImmutableCollectionOf1<T extends @Nullable Object>
        implements ImmutableCollection<T>,
                   ClassWith1Value<T> {

    private final T __value;

    public ImmutableCollectionOf1(final T value) {
        super();
        __value = value;
    }

    @Override public T value() { return __value; }

    //#region -------------------- Size methods --------------------

    /// Get **1** as the size of the current [instance][Collection]
    @Override public @Range(from = 1, to = 1) int size() { return 1; }

    /// Tell if the current [instance][ImmutableCollectionOf1] has always a single [#value]
    @Contract(ALWAYS_FALSE_0) @Override public boolean isEmpty() { return false; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has methods --------------------

    /// Tell whenever the `value` is equals to the [#value] in the current [instance][ImmutableCollectionOf1]
    ///
    /// @param value The value to compare
    @Override public boolean contains(final @Nullable Object value) { return UtilityFor1.has(this, value); }

    /// Tell that all the `values` are in the current [instance][ImmutableCollectionOf1]
    ///
    /// @param values The values to compare
    /// @see Collection#containsAll(Collection)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html">Kotlin containsAll(values)</a>
    @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return UtilityFor1.hasAll(this, values); }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- For each methods --------------------

    /// Perform a given `action` for the only [#value]
    ///
    /// @param action The given action
    @Override public void forEach(Consumer<? super T> action) {
        action.accept(value());
    }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public CollectionIteratorOf1<T> iterator() { return new CollectionIteratorOf1<>(value()); }

    @Contract(ALWAYS_NEW_0) @Override public Spliterator<T> spliterator() { throw new RuntimeException(); /*TODO create a new SpliteratorOf1 instance*/ }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Stream methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public Stream<T> stream() { throw new RuntimeException(); /*TODO create a new SequentialStreamOf1 instance*/ }

    @Contract(ALWAYS_NEW_0)
    @Override public Stream<T> parallelStream() { throw new RuntimeException(); /*TODO create a new ParallelStreamOf1 instance*/ }

    //#endregion -------------------- Stream methods --------------------
    //#region -------------------- To array methods --------------------

    /// Convert the current [instance][ImmutableCollectionOf1] to an `array`
    @Contract(pure = true)
    public @Override @Nullable T[] toArray() { return ArrayCreator.Array(value()); }

    /// Put the values inside the `newArray`
    ///
    /// @param newArray The source array to put the values
    /// @param <U>      The new type
    @Contract(value = ALWAYS_1ST_1, mutates = "param1")
    public @Override <U extends @Nullable Object> U[] toArray(final U[] newArray) { return UtilityFor1.toArray(this, newArray); }

    /// Put the values inside a new array produced by the `generator`
    ///
    /// @param generator The given generator
    /// @param <U>       The new type
    @Contract(ALWAYS_NEW_1)
    public @Override <U extends @Nullable Object> U[] toArray(final IntFunction<U[]> generator) { return UtilityFor1.toArray(this, generator); }

    //#endregion -------------------- To array methods --------------------
    //#region -------------------- To string methods --------------------

    /// Convert the current [instance][ImmutableCollectionOf1] to a [String] on the [#value]
    /// by calling its "_[toString\(\)][Object#toString()]_" method
    ///
    /// @see Object#toString()
    public @Override String toString() { return UtilityFor1.toString(this); }

    //#endregion -------------------- To string methods --------------------
    //#region -------------------- Comparison methods --------------------

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof Collection<?> otherConverted))
            return false;
        if (otherConverted.size() != 1)
            return false;
        return containsAll(otherConverted);
    }

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @SuppressWarnings("unchecked cast")
    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableCollectionOf1<T> clone() {
        try {
            return (ImmutableCollectionOf1<T>) super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new InternalError("The “clone” method was not expected to be thrown in “" + getClass().getSimpleName() + "”.", exception);
        }
    }

    //#endregion -------------------- Clone methods --------------------

}
