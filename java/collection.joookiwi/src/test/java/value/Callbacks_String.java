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

    public static final Supplier<? super String>                         callbackAsString0 =    () -> "";
    public static final Function<? super String, ? extends String>       callbackAsString1 =    _ -> "";
    public static final IntFunction<? extends String>                    callbackAsString1Alt = _ -> "";
    public static final ObjIntFunction<? super String, ? extends String> callbackAsString2 =    (_, _) -> "";
    public static final IntObjFunction<? super String, ? extends String> callbackAsString2Alt = (_, _) -> "";

    public static final Supplier<? super String>                         callbackToString0 =         () -> "E";
    public static final Function<? extends String, ? super String>       callbackToUpperString1 =    String::toUpperCase;
    public static final IntFunction<? super String>                      callbackToUpperString1Alt = _ -> "E";
    public static final ObjIntFunction<? extends String, ? super String> callbackToUpperString2 =    (it, i) -> i + ":" + it.toUpperCase();
    public static final IntObjFunction<? extends String, ? super String> callbackToUpperString2Alt = (_, it) -> it.toUpperCase();

    public static final Predicate<? super String> callbackIsA = "a"::equals;
    public static final Predicate<? super String> callbackIsB = "b"::equals;
    public static final Predicate<? super String> callbackIsC = "c"::equals;
    public static final Predicate<? super String> callbackIsD = "d"::equals;
    public static final Predicate<? super String> callbackIsE = "e"::equals;

    public static final IntObjPredicate<? super String> callbackIsAAlt = (_, it) -> "a".equals(it);
    public static final IntObjPredicate<? super String> callbackIsBAlt = (_, it) -> "b".equals(it);
    public static final IntObjPredicate<? super String> callbackIsCAlt = (_, it) -> "c".equals(it);
    public static final IntObjPredicate<? super String> callbackIsDAlt = (_, it) -> "d".equals(it);
    public static final IntObjPredicate<? super String> callbackIsEAlt = (_, it) -> "e".equals(it);

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
