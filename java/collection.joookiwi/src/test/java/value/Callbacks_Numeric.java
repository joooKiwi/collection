package value;

import java.util.function.IntPredicate;
import joookiwi.collection.java.callback.ObjIntPredicate;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class Callbacks_Numeric {

    @Contract(ALWAYS_FAIL_0) private Callbacks_Numeric() { throw new Error("The utility class “Callbacks_Numeric” cannot be constructed."); }

    public static final IntPredicate callbackIsEven = it -> it % 2 == 0;
    public static final IntPredicate callbackIsOdd = it -> it % 2 != 0;

    public static final ObjIntPredicate<? super String> callbackIsEvenAlt = (_, it) -> it % 2 == 0;
    public static final ObjIntPredicate<? super String> callbackIsOddAlt = (_, it) -> it % 2 != 0;

    public static final IntPredicate callbackIs0 = it -> it == 0;
    public static final IntPredicate callbackIs1 = it -> it == 1;
    public static final IntPredicate callbackIs2 = it -> it == 2;
    public static final IntPredicate callbackIs3 = it -> it == 3;
    public static final IntPredicate callbackIs4 = it -> it == 4;

    public static final ObjIntPredicate<? super String> callbackIs0Alt = (_, it) -> it == 0;
    public static final ObjIntPredicate<? super String> callbackIs1Alt = (_, it) -> it == 1;
    public static final ObjIntPredicate<? super String> callbackIs2Alt = (_, it) -> it == 2;
    public static final ObjIntPredicate<? super String> callbackIs3Alt = (_, it) -> it == 3;
    public static final ObjIntPredicate<? super String> callbackIs4Alt = (_, it) -> it == 4;

    public static final IntPredicate callbackIsUnder0 = it -> it < 0;
    public static final IntPredicate callbackIsUnder1 = it -> it < 1;
    public static final IntPredicate callbackIsUnder2 = it -> it < 2;
    public static final IntPredicate callbackIsUnder3 = it -> it < 3;
    public static final IntPredicate callbackIsUnder4 = it -> it < 4;

    public static final ObjIntPredicate<? super String> callbackIsUnder0Alt = (_, it) -> it < 0;
    public static final ObjIntPredicate<? super String> callbackIsUnder1Alt = (_, it) -> it < 1;
    public static final ObjIntPredicate<? super String> callbackIsUnder2Alt = (_, it) -> it < 2;
    public static final ObjIntPredicate<? super String> callbackIsUnder3Alt = (_, it) -> it < 3;
    public static final ObjIntPredicate<? super String> callbackIsUnder4Alt = (_, it) -> it < 4;

    public static final IntPredicate callbackIsOver0 = it -> it > 0;
    public static final IntPredicate callbackIsOver1 = it -> it > 1;
    public static final IntPredicate callbackIsOver2 = it -> it > 2;
    public static final IntPredicate callbackIsOver3 = it -> it > 3;
    public static final IntPredicate callbackIsOver4 = it -> it > 4;

    public static final ObjIntPredicate<? super String> callbackIsOver0Alt = (_, it) -> it > 0;
    public static final ObjIntPredicate<? super String> callbackIsOver1Alt = (_, it) -> it > 1;
    public static final ObjIntPredicate<? super String> callbackIsOver2Alt = (_, it) -> it > 2;
    public static final ObjIntPredicate<? super String> callbackIsOver3Alt = (_, it) -> it > 3;
    public static final ObjIntPredicate<? super String> callbackIsOver4Alt = (_, it) -> it > 4;

}
