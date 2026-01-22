package value;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import joookiwi.collection.java.callback.IntObjFunction;
import joookiwi.collection.java.callback.IntObjPredicate;
import joookiwi.collection.java.callback.ObjIntFunction;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static org.junit.jupiter.api.Assertions.fail;

@NotNullByDefault
public final class Callbacks_String {

    @Contract(ALWAYS_FAIL_0) private Callbacks_String() { throw new Error("The utility class “Callbacks_String” cannot be constructed."); }

    public static final Supplier<? super String>                         callbackToString0 =         () -> "E";
    public static final Function<? extends String, ? super String>       callbackToUpperString1 =    String::toUpperCase;
    public static final IntFunction<? super String>                      callbackToUpperString1Alt = _ -> "E";
    public static final ObjIntFunction<? extends String, ? super String> callbackToUpperString2 =    (it, i) -> i + ":" + it.toUpperCase();
    public static final IntObjFunction<? extends String, ? super String> callbackToUpperString2Alt = (_, it) -> it.toUpperCase();

    public static final Predicate<? super String> callbackIsA = it -> it.equals("a");
    public static final Predicate<? super String> callbackIsB = it -> it.equals("b");
    public static final Predicate<? super String> callbackIsC = it -> it.equals("c");
    public static final Predicate<? super String> callbackIsD = it -> it.equals("d");
    public static final Predicate<? super String> callbackIsE = it -> it.equals("e");

    public static final IntObjPredicate<? super String> callbackIsAAlt = (_, it) -> it.equals("a");
    public static final IntObjPredicate<? super String> callbackIsBAlt = (_, it) -> it.equals("b");
    public static final IntObjPredicate<? super String> callbackIsCAlt = (_, it) -> it.equals("c");
    public static final IntObjPredicate<? super String> callbackIsDAlt = (_, it) -> it.equals("d");
    public static final IntObjPredicate<? super String> callbackIsEAlt = (_, it) -> it.equals("e");

    public static final Predicate<? super String> callbackIsUnderA = it -> it.compareTo("a") < 0;
    public static final Predicate<? super String> callbackIsUnderB = it -> it.compareTo("b") < 0;
    public static final Predicate<? super String> callbackIsUnderC = it -> it.compareTo("c") < 0;
    public static final Predicate<? super String> callbackIsUnderD = it -> it.compareTo("d") < 0;
    public static final Predicate<? super String> callbackIsUnderE = it -> it.compareTo("e") < 0;

    public static final IntObjPredicate<? super String> callbackIsUnderAAlt = (_, it) -> it.compareTo("a") < 0;
    public static final IntObjPredicate<? super String> callbackIsUnderBAlt = (_, it) -> it.compareTo("b") < 0;
    public static final IntObjPredicate<? super String> callbackIsUnderCAlt = (_, it) -> it.compareTo("c") < 0;
    public static final IntObjPredicate<? super String> callbackIsUnderDAlt = (_, it) -> it.compareTo("d") < 0;
    public static final IntObjPredicate<? super String> callbackIsUnderEAlt = (_, it) -> it.compareTo("e") < 0;

    public static final Predicate<? super String> callbackIsOverA = it -> it.compareTo("a") > 0;
    public static final Predicate<? super String> callbackIsOverB = it -> it.compareTo("b") > 0;
    public static final Predicate<? super String> callbackIsOverC = it -> it.compareTo("c") > 0;
    public static final Predicate<? super String> callbackIsOverD = it -> it.compareTo("d") > 0;
    public static final Predicate<? super String> callbackIsOverE = it -> it.compareTo("e") > 0;

    public static final IntObjPredicate<? super String> callbackIsOverAAlt = (_, it) -> it.compareTo("a") > 0;
    public static final IntObjPredicate<? super String> callbackIsOverBAlt = (_, it) -> it.compareTo("b") > 0;
    public static final IntObjPredicate<? super String> callbackIsOverCAlt = (_, it) -> it.compareTo("c") > 0;
    public static final IntObjPredicate<? super String> callbackIsOverDAlt = (_, it) -> it.compareTo("d") > 0;
    public static final IntObjPredicate<? super String> callbackIsOverEAlt = (_, it) -> it.compareTo("e") > 0;

}
