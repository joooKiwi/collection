package joookiwi.collection.java.optional;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

@NotNullByDefault
public class Optional<T extends @Nullable Object>
        implements Cloneable {

    //#region -------------------- Fields --------------------

    private final boolean __isPresent;
    private final T __value;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    @Contract(pure = true)
    public Optional() {
        __isPresent = false;
        __value = null;
    }


    @Contract(pure = true)
    public Optional(final T value) {
        __isPresent = true;
        __value = value;
    }


    @Contract(pure = true)
    public Optional(final @Nullable Optional<? extends T> value) {
        if (value == null) {
            __isPresent = false;
            __value = null;
            return;
        }

        __isPresent = value.__isPresent;
        __value = value.__value;
    }

    public Optional(final @Nullable OptionalComparable<? extends T> value) {
        if (value == null) {
            __isPresent = false;
            __value = null;
            return;
        }

        if (__isPresent = value.isPresent())
            __value = value.get();
        else
            __value = null;
    }

    public Optional(final @Nullable java.util.Optional<? extends T> value) {
        if (value == null) {
            __isPresent = false;
            __value = null;
            return;
        }

        if (__isPresent = value.isPresent())
            __value = value.get();
        else
            __value = null;
    }

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    public T get() {
        if (!__isPresent)
            throw new NoSuchElementException("Value not found exception. No value exist in the “Optional” class.");
        return __value;
    }


    public void ifPresent(final Consumer<? super T> action) {
        if (!__isPresent)
            return;
        action.accept(__value);
    }

    public void ifPresentOrElse(final Consumer<? super T> action, final Runnable emptyAction) {
        if (!__isPresent)
            emptyAction.run();
        else
            action.accept(__value);
    }


    public Optional<T> or(final Supplier<? extends Optional<T>> supplier) {
        if (isPresent())
            return this;
        return supplier.get();
    }

    @Contract(pure = true)
    public T orElse(final T other) {
        if (!__isPresent)
            return other;
        return __value;
    }

    public T orElseGet(final Supplier<? extends T> supplier) {
        if (!__isPresent)
            return supplier.get();
        return __value;
    }

    public T orElseThrow() {
        if (!__isPresent)
            throw new NoSuchElementException("Value not found exception. No value exist in the “OptionalComparable” class.");
        return __value;
    }

    public <X extends Throwable> T orElseThrow(final Supplier<? extends X> exceptionSupplier) throws X {
        if (!__isPresent)
            throw exceptionSupplier.get();
        return __value;
    }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Present methods --------------------

    @Contract(pure = true)
    public boolean isPresent() { return __isPresent; }

    @Contract(pure = true)
    public boolean isEmpty() { return !__isPresent; }

    //#endregion -------------------- Present methods --------------------
    //#region -------------------- Stream methods --------------------

    public Stream<T> stream() {
        if (!__isPresent)
            return Stream.of(__value);
        return Stream.empty();
    }

    //#endregion -------------------- Stream methods --------------------
    //#region -------------------- Conversion methods --------------------

    public java.util.Optional<@NotNull T> asJavaOptional() {
        if (__isPresent)
            return java.util.Optional.ofNullable(__value);
        return java.util.Optional.empty();
    }


    @Contract(pure = true)
    @Override public String toString() {
        if (!__isPresent)
            return "Optional.empty()";
        return "Optional[" + __value + ']';
    }

    //#endregion -------------------- Conversion methods --------------------
    //#region -------------------- Comparison methods --------------------

    @Contract(pure = true)
    @Override public int hashCode() {
        if (!__isPresent)
            return 0;

        final var value = __value;
        if (value == null)
            return 0;
        return value.hashCode();
    }

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;

        if (other instanceof Optional<?> otherConverted)
            if (__isPresent && otherConverted.__isPresent)
                return __value == otherConverted.__value;
            else
                return false;

        if (other instanceof OptionalComparable<?> otherConverted)
            if (__isPresent && otherConverted.isPresent())
                return __value == otherConverted.get();
        return false;
    }

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    public boolean equals(final @Nullable Optional<? extends T> other) {
        if (other == null)
            return false;
        if (other == this)
            return true;

        if (__isPresent && other.__isPresent)
            return __value == other.__value;
        return false;
    }

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @SuppressWarnings("unchecked cast")
    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public Optional<T> clone() {
        try {
            return (Optional<T>) super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new InternalError("The “clone” method was not expected to be thrown in “" + getClass().getSimpleName() + "”.", exception);
        }
    }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
