package value;

import java.util.function.BooleanSupplier;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import joookiwi.collection.java.callback.IntObjPredicate;
import joookiwi.collection.java.callback.ObjIntPredicate;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class Callbacks_Boolean {

    @Contract(ALWAYS_FAIL_0) private Callbacks_Boolean() { throw new Error("The utility class “Callbacks_Boolean” cannot be constructed."); }

    public static final ObjIntPredicate<? super String> callback2AsTrue = (_, _) -> true;
    public static final IntObjPredicate<? super String> callback2AltAsTrue = (_, _) -> true;
    public static final Predicate<? super String>       callback1AsTrue = _ -> true;
    public static final IntPredicate                    callback1AltAsTrue = _ -> true;
    public static final BooleanSupplier                 callback0AsTrue = () -> true;

    public static final ObjIntPredicate<? super String> callback2AsFalse = (_, _) -> false;
    public static final IntObjPredicate<? super String> callback2AltAsFalse = (_, _) -> false;
    public static final Predicate<? super String>       callback1AsFalse = _ -> false;
    public static final IntPredicate                    callback1AltAsFalse = _ -> false;
    public static final BooleanSupplier                 callback0AsFalse = () -> false;

}
