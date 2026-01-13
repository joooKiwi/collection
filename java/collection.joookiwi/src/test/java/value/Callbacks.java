package value;

import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import joookiwi.collection.java.callback.IntObjFunction;
import joookiwi.collection.java.callback.IntObjPredicate;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.callback.ObjIntPredicate;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static org.junit.jupiter.api.Assertions.fail;

@NotNullByDefault
public final class Callbacks {

    @Contract(ALWAYS_FAIL_0) private Callbacks() { throw new Error("The utility class “Callbacks” cannot be constructed."); }

    public static final ObjIntFunction<?, ? extends String> callback2AsFail = (_, _) -> fail("The test was not expected to have the callback being called");
    public static final IntObjFunction<?, ? extends String> callback2AltAsFail = (_, _) -> fail("The test was not expected to have the callback being called");
    public static final Function<?, ? extends String>       callback1AsFail = _ -> fail("The test was not expected to have the callback being called");
    public static final IntFunction<? extends String>       callback1AltAsFail = _ -> fail("The test was not expected to have the callback being called");
    public static final Supplier<? extends String>          callback0AsFail = () -> fail("The test was not expected to have the callback being called");

    public static final ObjIntFunction<? super String, String> stringTransform2AsFail = (_, _) -> fail("The test was not expected to have the callback being called");
    public static final IntObjFunction<? super String, String> stringTransform2AltAsFail = (_, _) -> fail("The test was not expected to have the callback being called");
    public static final Function<? super String, String>       stringTransform1AsFail = _ -> fail("The test was not expected to have the callback being called");
    public static final IntFunction<String>                    stringTransform1AltAsFail = _ -> fail("The test was not expected to have the callback being called");
    public static final Supplier<String>                       stringTransform0AsFail = () -> fail("The test was not expected to have the callback being called");

    public static final ObjIntPredicate<? super String> predicate2AsFail = (_, _) -> fail("The test was not expected to have the callback being called");
    public static final IntObjPredicate<? super String> predicate2AltAsFail = (_, _) -> fail("The test was not expected to have the callback being called");
    public static final Predicate<? super String>       predicate1AsFail = _ -> fail("The test was not expected to have the callback being called");
    public static final IntPredicate                    predicate1AltAsFail = _ -> fail("The test was not expected to have the callback being called");
    public static final BooleanSupplier                 predicate0AsFail = () -> fail("The test was not expected to have the callback being called");

}
