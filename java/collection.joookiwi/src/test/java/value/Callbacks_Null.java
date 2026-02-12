package value;

import joookiwi.collection.java.callback.IntObjFunction;
import joookiwi.collection.java.callback.IntObjPredicate;
import joookiwi.collection.java.callback.ObjIntFunction;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class Callbacks_Null {

    @Contract(ALWAYS_FAIL_0) private Callbacks_Null() { throw new Error("The utility class “Callbacks_Null” cannot be constructed."); }

    public static final Supplier<? super @Nullable String> callbackAsNull0 = () -> null;

    public static final ObjIntFunction<? super String, ? extends @Nullable String> callbackOnlyIfEven =    (it, i) -> i % 2 == 0 ? it : null;
    public static final IntObjFunction<? super String, ? extends @Nullable String> callbackOnlyIfEvenAlt = (i, it) -> i % 2 == 0 ? it : null;

    public static final ObjIntFunction<? super String, ? extends @Nullable String> callbackOnlyIfOdd =    (it, i) -> i % 2 == 0 ? null : it;
    public static final IntObjFunction<? super String, ? extends @Nullable String> callbackOnlyIfOddAlt = (i, it) -> i % 2 == 0 ? null : it;

}
