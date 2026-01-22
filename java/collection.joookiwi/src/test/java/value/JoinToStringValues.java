package value;

import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.callback.ObjIntFunction;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.junit.jupiter.api.Named;
import org.junit.jupiter.params.provider.Arguments;

import static value.Callbacks.stringTransform0AsFail;
import static value.Callbacks.stringTransform1AsFail;
import static value.Callbacks.stringTransform2AsFail;
import static value.Callbacks_String.callbackToString0;
import static value.Callbacks_String.callbackToUpperString1;
import static value.Callbacks_String.callbackToUpperString2;
import static value.ReusableFields.MIN_CHAR;

/// The values used in `CollectionHolder07_JoinToStringTests`.`EmptyCollectionHolder` tests
@NotNullByDefault
public final class JoinToStringValues {

    //#region -------------------- Fields --------------------

    private static final String @Unmodifiable [] __nullObjectNames =                          {"null Object",};
    private static final String @Unmodifiable [] __nullArrayEmptyArrayNames =                 {"null array", "[]",};
    private static final String @Unmodifiable [] __nullStringCharacterNames =                 {"null String", "null Character",};
    private static final String @Unmodifiable [] __StringCharacterNames =                     {"String", "Character",};
    private static final String @Unmodifiable [] __nullCharSequenceStringCharacterCharNames = {"null CharSequence", "null String", "null Character", "char",};
    private static final String @Unmodifiable [] __StringCharacterCharNames =                 {"String", "Character", "char",};
    private static final String @Unmodifiable [] __nullIntegerNames =                         {"null Integer",};
    private static final String @Unmodifiable [] __intIntegerNames =                          {"int", "Integer",};
    private static final String @Unmodifiable [] __minus500IntIntegerNames =                  {"-500 int", "-500 Integer",};
    private static final String @Unmodifiable [] __minus6IntIntegerNames =                    {"-6 int", "-6 Integer",};
    private static final String @Unmodifiable [] __minus5IntIntegerNames =                    {"-5 int", "-5 Integer",};
    private static final String @Unmodifiable [] __minus4IntIntegerNames =                    {"-4 int", "-4 Integer",};
    private static final String @Unmodifiable [] __minus3IntIntegerNames =                    {"-3 int", "-3 Integer",};
    private static final String @Unmodifiable [] __minus2IntIntegerNames =                    {"-2 int", "-2 Integer",};
    private static final String @Unmodifiable [] __minus1IntIntegerNames =                    {"-1 int", "-1 Integer",};
    private static final String @Unmodifiable [] __0IntIntegerNames =                         {"0 int", "0 Integer",};
    private static final String @Unmodifiable [] __1IntIntegerNames =                         {"1 int", "1 Integer",};
    private static final String @Unmodifiable [] __2IntIntegerNames =                         {"2 int", "2 Integer",};
    private static final String @Unmodifiable [] __3IntIntegerNames =                         {"3 int", "3 Integer",};
    private static final String @Unmodifiable [] __4IntIntegerNames =                         {"4 int", "4 Integer",};
    private static final String @Unmodifiable [] __5IntIntegerNames =                         {"5 int", "5 Integer",};
    private static final String @Unmodifiable [] __500IntIntegerNames =                       {"500 int", "500 Integer",};
    private static final String @Unmodifiable [] __callbackNames =                            {"(T, int) → String", "(T) → String", "() → String",};
    private static final String @Unmodifiable [] __nullCallbackNames =                        {"null (T, int) → String", "null (T) → String", "null () → String",};
    private static final String @Unmodifiable [] __0CallbackNames =                           {"() → String",};
    private static final String @Unmodifiable [] __1CallbackNames =                           {"(T) → String",};
    private static final String @Unmodifiable [] __2CallbackNames =                           {"(T, int) → String",};

    private static final @Nullable Object @Unmodifiable [] __1Nulls =                {null,};
    private static final @Nullable Object @Unmodifiable [] __2Nulls =                {null, null,};
    private static final @Nullable Object @Unmodifiable [] __3Nulls =                {null, null, null,};
    private static final @Nullable Object @Unmodifiable [] __1NullsPlusEmptyArray =  {null, new Object[]{},};
    private static final @Nullable Object @Unmodifiable [] __2NullsPlusChar =        {null, null, MIN_CHAR,};
    private static final @Nullable Object @Unmodifiable [] __2NullsPlusSpaceChar =   {null, null, ' ',};
    private static final @Nullable Object @Unmodifiable [] __3NullsPlusChar =        {null, null, null, MIN_CHAR,};
    private static final @Nullable Object @Unmodifiable [] __separatorStringValues = {";", ';', ';',};
    private static final @Nullable Object @Unmodifiable [] __prefixStringValues =    {"<", '<', '<',};
    private static final @Nullable Object @Unmodifiable [] __prefix2StringValues =   {"{", '{', '{',};
    private static final @Nullable Object @Unmodifiable [] __postfixStringValues =   {">", '>', '>',};
    private static final @Nullable Object @Unmodifiable [] __truncateStringValues =  {"‥", '‥', '‥',};
    private static final @Nullable Object @Unmodifiable [] __2_minus500 =            {-500, -500,};
    private static final @Nullable Object @Unmodifiable [] __2_minus6 =              {-6, -6,};
    private static final @Nullable Object @Unmodifiable [] __2_minus5 =              {-5, -5,};
    private static final @Nullable Object @Unmodifiable [] __2_minus4 =              {-4, -4,};
    private static final @Nullable Object @Unmodifiable [] __2_minus3 =              {-3, -3,};
    private static final @Nullable Object @Unmodifiable [] __2_minus2 =              {-2, -2,};
    private static final @Nullable Object @Unmodifiable [] __2_minus1 =              {-1, -1,};
    private static final @Nullable Object @Unmodifiable [] __2_0 =                   {0, 0,};
    private static final @Nullable Object @Unmodifiable [] __2_1 =                   {1, 1,};
    private static final @Nullable Object @Unmodifiable [] __2_2 =                   {2, 2,};
    private static final @Nullable Object @Unmodifiable [] __2_3 =                   {3, 3,};
    private static final @Nullable Object @Unmodifiable [] __2_4 =                   {4, 4,};
    private static final @Nullable Object @Unmodifiable [] __2_5 =                   {5, 5,};
    private static final @Nullable Object @Unmodifiable [] __2_500 =                 {500, 500,};
    private static final @Nullable Object @Unmodifiable [] __0AndNull =              {0, null,};
    private static final @Nullable Object @Unmodifiable [] __500AndNull =            {500, null,};
    private static final @Nullable Object @Unmodifiable [] __0CallbackValues =       {callbackToString0,};
    private static final @Nullable Object @Unmodifiable [] __1CallbackValues =       {callbackToUpperString1,};
    private static final @Nullable Object @Unmodifiable [] __2CallbackValues =       {callbackToUpperString2,};
    private static final @Nullable Object @Unmodifiable [] __callbackValues =        {callbackToUpperString2, callbackToUpperString1, callbackToString0,};
    private static final @Nullable Object @Unmodifiable [] __failCallbackValues =    {stringTransform2AsFail, stringTransform1AsFail, stringTransform0AsFail,};

    private static final Class<?> @Unmodifiable [] __Object =                          {Object.class,};
    private static final Class<?> @Unmodifiable [] __ObjectArray2x =                   {Object[].class, Object[].class,};
    private static final Class<?> @Unmodifiable [] __StringCharacter =                 {String.class, Character.class,};
    private static final Class<?> @Unmodifiable [] __CharSequenceStringCharacterChar = {CharSequence.class, String.class, Character.class, char.class,};
    private static final Class<?> @Unmodifiable [] __StringCharacterChar =             {String.class, Character.class, char.class,};
    private static final Class<?> @Unmodifiable [] __Integer =                         {Integer.class,};
    private static final Class<?> @Unmodifiable [] __intInteger =                      {int.class, Integer.class,};
    private static final Class<?> @Unmodifiable [] __0CallbackClasses =                {Supplier.class,};
    private static final Class<?> @Unmodifiable [] __1CallbackClasses =                {Function.class,};
    private static final Class<?> @Unmodifiable [] __2CallbackClasses =                {ObjIntFunction.class,};
    private static final Class<?> @Unmodifiable [] __callbackClasses =                 {ObjIntFunction.class, Function.class, Supplier.class,};

    //#endregion -------------------- Fields --------------------

    //#region -------------------- Arguments --------------------

    public static final Arguments @Unmodifiable [] arguments0 = {
        Arguments.of(Named.of("∅", new Object[]{}), new Class<?>[]{}),
    };

    public static final Arguments @Unmodifiable [] arguments1 = {
        Arguments.of(Named.of("String",    new @Nullable Object[]{null,}), new Class<?>[]{String.class,}),
        Arguments.of(Named.of("Character", new @Nullable Object[]{null,}), new Class<?>[]{Character.class,}),
        Arguments.of(Named.of("char",      new @Nullable Object[]{' ',}),  new Class<?>[]{char.class,}),
    };

    public static final Arguments @Unmodifiable [] arguments2 = create2Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,
            __2NullsPlusSpaceChar,      __2NullsPlusSpaceChar
    );

    public static final Arguments @Unmodifiable [] arguments3 = create3Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,
            __2NullsPlusSpaceChar,      __2NullsPlusSpaceChar,      __2NullsPlusSpaceChar
    );

    public static final Arguments @Unmodifiable [] arguments4 = create4Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __intIntegerNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,
            __2NullsPlusSpaceChar,      __2NullsPlusSpaceChar,      __2NullsPlusSpaceChar,      __0AndNull
    );

    public static final Arguments @Unmodifiable [] arguments5 = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __intIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,      __StringCharacterChar,
            __2NullsPlusSpaceChar,      __2NullsPlusSpaceChar,      __2NullsPlusSpaceChar,      __0AndNull,        __2NullsPlusSpaceChar
    );

    public static final Arguments @Unmodifiable [] arguments6 = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __intIntegerNames, __StringCharacterCharNames, __callbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,      __StringCharacterChar,      __callbackClasses,
            __2NullsPlusSpaceChar,      __2NullsPlusSpaceChar,      __2NullsPlusSpaceChar,      __0AndNull,        __2NullsPlusSpaceChar,      __callbackValues
    );

    //#endregion -------------------- Arguments --------------------
    //#region -------------------- Arguments (any value) --------------------

    public static final Arguments @Unmodifiable [] anySeparator_arguments = {
            Arguments.of(Named.of("String",    new @Nullable Object[]{null,}),     new Class<?>[]{String.class,}),
            Arguments.of(Named.of("Character", new @Nullable Object[]{null,}),     new Class<?>[]{Character.class,}),
            Arguments.of(Named.of("char",      new @Nullable Object[]{MIN_CHAR,}), new Class<?>[]{char.class,}),
    };


    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_arguments = create2Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,
            __2NullsPlusChar,           __2NullsPlusChar
    );


    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_arguments = create3Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar
    );


    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_anyLimit_arguments = create4Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __intIntegerNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __500AndNull
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_0Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __0IntIntegerNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_0
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_1Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_1
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_2Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_2
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_3Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_3
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_4Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_4
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_nullLimit_arguments = create4Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullIntegerNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __Integer,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __1Nulls
    );


    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_anyLimit_anyTruncate_arguments = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __intIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,      __StringCharacterChar,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __500AndNull,      __2NullsPlusChar
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_0Limit_anyTruncate_arguments = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __0IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_0,              __2NullsPlusChar
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_1Limit_anyTruncate_arguments = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_1,              __2NullsPlusChar
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_2Limit_anyTruncate_arguments = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_2,              __2NullsPlusChar
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_3Limit_anyTruncate_arguments = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_3,              __2NullsPlusChar
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_4Limit_anyTruncate_arguments = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_4,              __2NullsPlusChar
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_nullLimit_anyTruncate_arguments = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __Integer,          __StringCharacterChar,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __1Nulls,           __2NullsPlusChar
    );


    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_anyLimit_anyTruncate_anyFailCallbacks_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __intIntegerNames, __StringCharacterCharNames, __callbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,      __StringCharacterChar,      __callbackClasses,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __500AndNull,      __2NullsPlusChar,           __failCallbackValues
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_0Limit_anyTruncate_anyFailCallbacks_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __0IntIntegerNames, __StringCharacterCharNames, __callbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __callbackClasses,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_0,              __2NullsPlusChar,           __failCallbackValues
    );


    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_1Limit_anyTruncate_0Callbacks_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_1,              __2NullsPlusChar,           __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_2Limit_anyTruncate_0Callbacks_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames,   __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_2,              __2NullsPlusChar,           __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_3Limit_anyTruncate_0Callbacks_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_3,              __2NullsPlusChar,           __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_4Limit_anyTruncate_0Callbacks_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_4,              __2NullsPlusChar,           __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_nullLimit_anyTruncate_0Callbacks_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __Integer,          __StringCharacterChar,      __0CallbackClasses,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __1Nulls,           __2NullsPlusChar,           __0CallbackValues
    );


    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_1Limit_anyTruncate_1Callbacks_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_1,              __2NullsPlusChar,           __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_2Limit_anyTruncate_1Callbacks_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_2,              __2NullsPlusChar,           __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_3Limit_anyTruncate_1Callbacks_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_3,              __2NullsPlusChar,           __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_4Limit_anyTruncate_1Callbacks_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_4,              __2NullsPlusChar,           __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_nullLimit_anyTruncate_1Callbacks_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __Integer,          __StringCharacterChar,      __1CallbackClasses,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __1Nulls,           __2NullsPlusChar,           __1CallbackValues
    );


    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_1Limit_anyTruncate_2Callbacks_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_1,              __2NullsPlusChar,           __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_2Limit_anyTruncate_2Callbacks_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_2,              __2NullsPlusChar,           __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_3Limit_anyTruncate_2Callbacks_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_3,              __2NullsPlusChar,           __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_4Limit_anyTruncate_2Callbacks_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __2_4,              __2NullsPlusChar,           __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] anySeparator_anyPrefix_anyPostfix_nullLimit_anyTruncate_2Callbacks_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __Integer,          __StringCharacterChar,      __2CallbackClasses,
            __2NullsPlusChar,           __2NullsPlusChar,           __2NullsPlusChar,           __1Nulls,           __2NullsPlusChar,           __2CallbackValues
    );


    //#endregion -------------------- Arguments (any value) --------------------
    //#region -------------------- Arguments (methods|instances) --------------------

    //#region -------------------- Arguments (methods|instances separator) --------------------

    public static final Arguments @Unmodifiable [] separator_arguments = {
            Arguments.of(Named.of("String",    new @Nullable Object[]{";",}), new Class<?>[]{String.class,}),
            Arguments.of(Named.of("Character", new @Nullable Object[]{';',}), new Class<?>[]{Character.class,}),
            Arguments.of(Named.of("char",      new @Nullable Object[]{';',}), new Class<?>[]{char.class,}),
    };

    //#endregion -------------------- Arguments (methods|instances separator) --------------------
    //#region -------------------- Arguments (methods|instances null separator) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_arguments = {
            Arguments.of(Named.of("null String",    new @Nullable Object[]{null,}), new Class<?>[]{String.class,}),
            Arguments.of(Named.of("null Character", new @Nullable Object[]{null,}), new Class<?>[]{Character.class,}),
    };

    //#endregion -------------------- Arguments (methods|instances null separator) --------------------

    //#region -------------------- Arguments (methods|instances prefix) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_arguments = create2Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames,
            __StringCharacter,      __StringCharacterChar,
            __2Nulls,               __prefixStringValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix) --------------------
    //#region -------------------- Arguments (methods|instances null prefix) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_arguments = create2Arguments(
            __nullStringCharacterNames, __StringCharacterNames,
            __StringCharacter,      __StringCharacter,
            __2Nulls,               __2Nulls
    );

    //#endregion -------------------- Arguments (methods|instances null prefix) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_arguments = create2Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,
            __separatorStringValues,    __prefixStringValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix) --------------------

    //#region -------------------- Arguments (methods|instances postfix) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_arguments = create3Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,
            __2Nulls,                   __2Nulls,                   __postfixStringValues
    );

    //#endregion -------------------- Arguments (methods|instances postfix) --------------------
    //#region -------------------- Arguments (methods|instances null postfix) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_arguments = create3Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,
            __2Nulls,                   __2Nulls,                   __2Nulls
    );

    //#endregion -------------------- Arguments (methods|instances null postfix) --------------------
    //#region -------------------- Arguments (methods|instances prefix + postfix) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_arguments = create3Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + postfix) --------------------
    //#region -------------------- Arguments (methods|instances separator + postfix) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_arguments = create3Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + postfix) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + postfix) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_arguments = create3Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + postfix) --------------------

    //#region -------------------- Arguments (methods|instances limit) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_minus500Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __minus500IntIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_minus500
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_minus6Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __minus6IntIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_minus6
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_minus5Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __minus5IntIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_minus5
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_minus4Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __minus4IntIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_minus4
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_minus3Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __minus3IntIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_minus3
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_minus2Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __minus2IntIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_minus2
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_minus1Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __minus1IntIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_minus1
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_0Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __0IntIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_0
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_1Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __0IntIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_1
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_2Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __2IntIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_2
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_3Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __3IntIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_3
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_4Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __4IntIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_4
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_5Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __5IntIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_5
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_500Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __500IntIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_500
    );

    //#endregion -------------------- Arguments (methods|instances limit) --------------------
    //#region -------------------- Arguments (methods|instances null limit) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_nullLimit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __nullIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __Integer,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __1Nulls
    );

    //#endregion -------------------- Arguments (methods|instances null limit) --------------------
    //#region -------------------- Arguments (methods|instances postfix + limit) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_0Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __0IntIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_0
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_1Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __1IntIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_1
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_2Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __2IntIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_2
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_3Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __3IntIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_3
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_4Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __4IntIntegerNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_4
    );

    //#endregion -------------------- Arguments (methods|instances postfix + limit) --------------------
    //#region -------------------- Arguments (methods|instances prefix + limit) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_0Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __0IntIntegerNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_0
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_1Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __1IntIntegerNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_1
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_2Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __2IntIntegerNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_2
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_3Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __3IntIntegerNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_3
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_4Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __4IntIntegerNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_4
    );

    //#endregion -------------------- Arguments (methods|instances prefix + limit) --------------------
    //#region -------------------- Arguments (methods|instances prefix + postfix + limit) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_0Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __0IntIntegerNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_0
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_1Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_1
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_2Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_2
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_3Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_3
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_4Limit_arguments = create4Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_4
    );

    //#endregion -------------------- Arguments (methods|instances prefix + postfix + limit) --------------------
    //#region -------------------- Arguments (methods|instances separator + limit) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_0Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __0IntIntegerNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_0
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_1Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __1IntIntegerNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_1
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_2Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __2IntIntegerNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_2
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_3Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __3IntIntegerNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_3
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_4Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __4IntIntegerNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_4
    );

    //#endregion -------------------- Arguments (methods|instances separator + limit) --------------------
    //#region -------------------- Arguments (methods|instances separator + postfix + limit) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_0Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __0IntIntegerNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_0
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_1Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __1IntIntegerNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_1
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_2Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __2IntIntegerNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_2
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_3Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __3IntIntegerNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_3
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_4Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __4IntIntegerNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_4
    );

    //#endregion -------------------- Arguments (methods|instances separator + postfix + limit) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + limit) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_0Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __0IntIntegerNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_0
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_1Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __1IntIntegerNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_1
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_2Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __2IntIntegerNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_2
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_3Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __3IntIntegerNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_3
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_4Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __4IntIntegerNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_4
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + limit) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + postfix + limit) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_0Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __0IntIntegerNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_0
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_1Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_1
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_2Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_2
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_3Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_3
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_4Limit_arguments = create4Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_4
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + postfix + limit) --------------------

    //#region -------------------- Arguments (methods|instances truncate) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_nullLimit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __nullIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __Integer,          __StringCharacterChar,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __1Nulls,           __truncateStringValues
    );

    //#endregion -------------------- Arguments (methods|instances truncate) --------------------
    //#region -------------------- Arguments (methods|instances null truncate) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_nullLimit_nullTruncated_arguments = create5Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __nullIntegerNames, __nullStringCharacterNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __Integer,          __StringCharacter,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __1Nulls,           __2Nulls
    );

    //#endregion -------------------- Arguments (methods|instances null truncate) --------------------
    //#region -------------------- Arguments (methods|instances limit + truncate) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_0Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __0IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_0,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_1Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __1IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_1,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_2Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __2IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_2,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_3Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __3IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_3,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_4Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __4IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_4,              __truncateStringValues
    );

    //#endregion -------------------- Arguments (methods|instances limit + truncate) --------------------
    //#region -------------------- Arguments (methods|instances postfix + truncate) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_nullLimit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __Integer,          __StringCharacterChar,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __1Nulls,           __truncateStringValues
    );

    //#endregion -------------------- Arguments (methods|instances postfix + truncate) --------------------
    //#region -------------------- Arguments (methods|instances postfix + limit + truncate) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_0Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __0IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_0,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_1Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_1,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_2Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __2IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_2,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_3Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_3,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_4Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_4,              __truncateStringValues
    );

    //#endregion -------------------- Arguments (methods|instances postfix + limit + truncate) --------------------
    //#region -------------------- Arguments (methods|instances prefix + truncate) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_nullLimit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __nullIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __Integer,          __StringCharacterChar,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __1Nulls,           __truncateStringValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + truncate) --------------------
    //#region -------------------- Arguments (methods|instances prefix + limit + truncate) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_0Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __0IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_0,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_1Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __1IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_1,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_2Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __2IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_2,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_3Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __3IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_3,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_4Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __4IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_4,              __truncateStringValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + limit + truncate) --------------------
    //#region -------------------- Arguments (methods|instances prefix + postfix + truncate) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_nullLimit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __Integer,          __StringCharacterChar,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __1Nulls,           __truncateStringValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + postfix + truncate) --------------------
    //#region -------------------- Arguments (methods|instances prefix + postfix + limit + truncate) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_0Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __0IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_0,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_1Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_1,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_2Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_2,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_3Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_3,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_4Limit_truncated_arguments = create5Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_4,              __truncateStringValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + postfix + limit + truncate) --------------------
    //#region -------------------- Arguments (methods|instances separator + truncate) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_nullLimit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __nullIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __Integer,          __StringCharacterChar,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __1Nulls,           __truncateStringValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + truncate) --------------------
    //#region -------------------- Arguments (methods|instances separator + limit + truncate) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_0Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __0IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_0,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_1Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __1IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_1,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_2Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __2IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_2,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_3Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __3IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_3,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_4Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __4IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_4,              __truncateStringValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + limit + truncate) --------------------
    //#region -------------------- Arguments (methods|instances separator + postfix + truncate) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_nullLimit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __Integer,          __StringCharacterChar,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __1Nulls,           __truncateStringValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + postfix + truncate) --------------------
    //#region -------------------- Arguments (methods|instances separator + postfix + limit + truncate) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_0Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __0IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_0,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_1Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_1,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_2Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __2IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_2,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_3Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_3,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_4Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_4,              __truncateStringValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + postfix + limit + truncate) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + truncate) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_nullLimit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __nullIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __Integer,          __StringCharacterChar,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __1Nulls,           __truncateStringValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + truncate) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + limit + truncate) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_0Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __0IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_0,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_1Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __1IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_1,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_2Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __2IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_2,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_3Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __3IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_3,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_4Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __4IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_4,              __truncateStringValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + limit + truncate) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + postfix + truncate) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_nullLimit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __Integer,          __StringCharacterChar,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __1Nulls,           __truncateStringValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + postfix + truncate) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + postfix + limit + truncate) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_0Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __0IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_0,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_1Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_1,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_2Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_2,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_3Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_3,              __truncateStringValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_4Limit_truncated_arguments = create5Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_4,              __truncateStringValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + postfix + limit + truncate) --------------------

    //#region -------------------- Arguments (methods|instances null transform) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_nullLimit_nullTruncated_nullTransform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __nullIntegerNames, __nullStringCharacterNames, __nullCallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __Integer,          __StringCharacter,          __callbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __1Nulls,           __2Nulls,                   __3Nulls
    );

    //#endregion -------------------- Arguments (methods|instances null transform) --------------------

    //#region -------------------- Arguments (methods|instances transform () → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_nullLimit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __nullIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __Integer,          __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __1Nulls,           __2Nulls,                   __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances truncated + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_nullLimit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __nullIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __Integer,          __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __1Nulls,           __truncateStringValues,     __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances truncated + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances limit + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_0Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __0IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_0,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_1Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __1IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_1,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_2Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __2IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_2,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_3Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __3IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_3,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_4Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __4IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_4,              __2Nulls,                   __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances limit + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances limit + truncated + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_0Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __0IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_0,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_1Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __1IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_1,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_2Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __2IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_2,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_3Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __3IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_3,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_4Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __4IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_4,              __truncateStringValues,     __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances limit + truncated + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances postfix + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_nullLimit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __nullIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __Integer,          __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __1Nulls,           __2Nulls,                   __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances postfix + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances postfix + truncated + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_nullLimit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __Integer,          __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __1Nulls,           __truncateStringValues,     __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances postfix + truncated + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances postfix + limit + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_0Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __0IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_0,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_1Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __1IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_1,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_2Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __2IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_2,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_3Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __3IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_3,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_4Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __4IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_4,              __2Nulls,                   __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances postfix + limit + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances postfix + limit + truncated + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_0Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __0IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_0,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_1Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_1,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_2Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __2IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_2,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_3Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_3,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_4Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_4,              __truncateStringValues,     __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances postfix + limit + truncated + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_nullLimit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __nullIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __Integer,          __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __1Nulls,           __2Nulls,                   __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + truncated + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_nullLimit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __nullIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __Integer,          __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __1Nulls,           __truncateStringValues,     __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + truncated + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + limit + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_0Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __0IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_0,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_1Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __1IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_1,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_2Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __2IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_2,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_3Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __3IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_3,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_4Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __4IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_4,              __2Nulls,                   __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + limit + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + limit + truncated + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_0Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __0IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_0,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_1Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __1IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_1,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_2Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __2IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_2,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_3Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __3IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_3,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_4Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __4IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_4,              __truncateStringValues,     __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + limit + truncated + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + postfix + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_nullLimit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __Integer,          __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __1Nulls,           __2Nulls,                   __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + postfix + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + postfix + truncated + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_nullLimit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __Integer,          __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __1Nulls,           __truncateStringValues,     __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + postfix + truncated + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + postfix + limit + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_0Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __0IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_0,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_1Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_1,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_2Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_2,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_3Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_3,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_4Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_4,              __2Nulls,                   __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + postfix + limit + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + postfix + limit + truncated + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_0Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __0IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_0,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_1Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_1,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_2Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_2,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_3Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_3,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_4Limit_truncated_0Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_4,              __truncateStringValues,     __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + postfix + limit + truncated + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_nullLimit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __nullIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __Integer,          __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __1Nulls,           __2Nulls,                   __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + truncated + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_nullLimit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __nullIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __Integer,          __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __1Nulls,           __truncateStringValues,     __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + truncated + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + limit + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_0Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __0IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_0,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_1Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __1IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_1,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_2Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __2IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_2,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_3Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __3IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_3,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_4Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __4IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_4,              __2Nulls,                   __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + limit + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + limit + truncated + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_0Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __0IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_0,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_1Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __1IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_1,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_2Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __2IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_2,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_3Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __3IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_3,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_4Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __4IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_4,              __truncateStringValues,     __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + limit + truncated + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + postfix + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_nullLimit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __nullIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __Integer,          __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __1Nulls,           __2Nulls,                   __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + postfix + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + postfix + truncated + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_nullLimit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __Integer,          __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __1Nulls,           __truncateStringValues,     __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + postfix + truncated + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + postfix + limit + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_0Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __0IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_0,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_1Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __1IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_1,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_2Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __2IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_2,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_3Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __3IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_3,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_4Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __4IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_4,              __2Nulls,                   __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + postfix + limit + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + postfix + limit + truncated + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_0Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __0IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_0,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_1Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_1,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_2Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __2IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_2,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_3Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_3,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_4Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_4,              __truncateStringValues,     __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + postfix + limit + truncated + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_nullLimit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __nullIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __Integer,          __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __1Nulls,           __2Nulls,                   __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + truncated + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_nullLimit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __nullIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __Integer,          __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __1Nulls,           __truncateStringValues,     __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + truncated + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + limit + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_0Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __0IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_0,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_1Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __1IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_1,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_2Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __2IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_2,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_3Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __3IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_3,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_4Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __4IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_4,              __2Nulls,                   __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + limit + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + limit + truncated + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_0Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __0IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_0,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_1Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __1IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_1,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_2Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __2IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_2,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_3Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __3IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_3,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_4Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __4IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_4,              __truncateStringValues,     __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + limit + truncated + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + postfix + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_nullLimit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __Integer,          __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __1Nulls,           __2Nulls,                   __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + postfix + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + postfix + truncated + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_nullLimit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __Integer,          __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __1Nulls,           __truncateStringValues,     __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + postfix + truncated + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + postfix + limit + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_0Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __0IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_0,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_1Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_1,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_2Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_2,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_3Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_3,              __2Nulls,                   __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_4Limit_nullTruncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames, __nullStringCharacterNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __0CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_4,              __2Nulls,                   __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + postfix + limit + transform () → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + postfix + limit + truncated + transform () → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_0Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __0IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_0,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_1Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_1,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_2Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_2,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_3Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_3,              __truncateStringValues,     __0CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_4Limit_truncated_0Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames, __0CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __0CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_4,              __truncateStringValues,     __0CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + postfix + limit + truncated + transform () → String) --------------------

    //#region -------------------- Arguments (methods|instances transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_nullLimit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __nullIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __Integer,          __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __1Nulls,           __2Nulls,                   __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances truncated + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_nullLimit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __nullIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __Integer,          __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __1Nulls,           __truncateStringValues,     __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances truncated + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances limit + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_0Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __0IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_0,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_1Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __1IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_1,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_2Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __2IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_2,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_3Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __3IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_3,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_4Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __4IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_4,              __2Nulls,                   __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances limit + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances limit + truncated + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_0Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __0IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_0,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_1Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __1IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_1,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_2Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __2IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_2,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_3Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __3IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_3,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_4Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __4IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_4,              __truncateStringValues,     __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances limit + truncated + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances postfix + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_nullLimit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __nullIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __Integer,          __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __1Nulls,           __2Nulls,                   __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances postfix + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances postfix + truncated + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_nullLimit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __Integer,          __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __1Nulls,           __truncateStringValues,     __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances postfix + truncated + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances postfix + limit + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_0Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __0IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_0,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_1Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __1IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_1,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_2Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __2IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_2,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_3Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __3IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_3,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_4Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __4IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_4,              __2Nulls,                   __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances postfix + limit + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances postfix + limit + truncated + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_0Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __0IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_0,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_1Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_1,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_2Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __2IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_2,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_3Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_3,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_4Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_4,              __truncateStringValues,     __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances postfix + limit + truncated + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_nullLimit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __nullIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __Integer,          __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __1Nulls,           __2Nulls,                   __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + truncated + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_nullLimit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __nullIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __Integer,          __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __1Nulls,           __truncateStringValues,     __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + truncated + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + limit + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_0Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __0IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_0,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_1Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __1IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_1,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_2Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __2IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_2,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_3Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __3IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_3,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_4Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __4IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_4,              __2Nulls,                   __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + limit + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + limit + truncated + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_0Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __0IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_0,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_1Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __1IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_1,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_2Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __2IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_2,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_3Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __3IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_3,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_4Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __4IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_4,              __truncateStringValues,     __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + limit + truncated + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + postfix + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_nullLimit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __Integer,          __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __1Nulls,           __2Nulls,                   __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + postfix + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + postfix + truncated + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_nullLimit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __Integer,          __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __1Nulls,           __truncateStringValues,     __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + postfix + truncated + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + postfix + limit + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_0Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __0IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_0,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_1Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_1,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_2Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_2,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_3Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_3,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_4Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_4,              __2Nulls,                   __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + postfix + limit + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + postfix + limit + truncated + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_0Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __0IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_0,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_1Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_1,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_2Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_2,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_3Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_3,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_4Limit_truncated_1Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_4,              __truncateStringValues,     __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + postfix + limit + truncated + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_nullLimit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __nullIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __Integer,          __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __1Nulls,           __2Nulls,                   __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + truncated + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_nullLimit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __nullIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __Integer,          __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __1Nulls,           __truncateStringValues,     __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + truncated + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + limit + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_0Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __0IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_0,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_1Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __1IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_1,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_2Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __2IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_2,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_3Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __3IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_3,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_4Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __4IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_4,              __2Nulls,                   __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + limit + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + limit + truncated + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_0Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __0IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_0,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_1Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __1IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_1,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_2Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __2IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_2,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_3Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __3IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_3,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_4Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __4IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_4,              __truncateStringValues,     __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + limit + truncated + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + postfix + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_nullLimit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __nullIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __Integer,          __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __1Nulls,           __2Nulls,                   __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + postfix + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + postfix + truncated + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_nullLimit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __Integer,          __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __1Nulls,           __truncateStringValues,     __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + postfix + truncated + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + postfix + limit + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_0Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __0IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_0,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_1Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __1IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_1,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_2Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __2IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_2,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_3Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __3IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_3,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_4Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __4IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_4,              __2Nulls,                   __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + postfix + limit + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + postfix + limit + truncated + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_0Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __0IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_0,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_1Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_1,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_2Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __2IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_2,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_3Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_3,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_4Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_4,              __truncateStringValues,     __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + postfix + limit + truncated + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_nullLimit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __nullIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __Integer,          __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __1Nulls,           __2Nulls,                   __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + truncated + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_nullLimit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __nullIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __Integer,          __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __1Nulls,           __truncateStringValues,     __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + truncated + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + limit + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_0Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __0IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_0,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_1Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __1IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_1,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_2Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __2IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_2,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_3Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __3IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_3,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_4Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __4IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_4,              __2Nulls,                   __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + limit + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + limit + truncated + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_0Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __0IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_0,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_1Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __1IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_1,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_2Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __2IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_2,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_3Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __3IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_3,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_4Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __4IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_4,              __truncateStringValues,     __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + limit + truncated + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + postfix + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_nullLimit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __Integer,          __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __1Nulls,           __2Nulls,                   __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + postfix + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + postfix + truncated + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_nullLimit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __Integer,          __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __1Nulls,           __truncateStringValues,     __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + postfix + truncated + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + postfix + limit + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_0Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __0IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_0,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_1Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_1,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_2Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_2,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_3Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_3,              __2Nulls,                   __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_4Limit_nullTruncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames, __nullStringCharacterNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __1CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_4,              __2Nulls,                   __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + postfix + limit + transform (T) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + postfix + limit + truncated + transform (T) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_0Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __0IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_0,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_1Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_1,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_2Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_2,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_3Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_3,              __truncateStringValues,     __1CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_4Limit_truncated_1Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames, __1CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __1CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_4,              __truncateStringValues,     __1CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + postfix + limit + truncated + transform (T) → String) --------------------

    //#region -------------------- Arguments (methods|instances transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_nullLimit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __nullIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __Integer,          __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __1Nulls,           __2Nulls,                   __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances truncated + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_nullLimit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __nullIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __Integer,          __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __1Nulls,           __truncateStringValues,     __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances truncated + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances limit + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_0Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __0IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_0,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_1Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __1IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_1,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_2Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __2IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_2,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_3Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __3IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_3,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_4Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __4IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_4,              __2Nulls,                   __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances limit + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances limit + truncated + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_0Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __0IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_0,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_1Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __1IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_1,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_2Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __2IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_2,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_3Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __3IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_3,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_nullPostfix_4Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __nullStringCharacterNames, __4IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __2Nulls,                   __2_4,              __truncateStringValues,     __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances limit + truncated + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances postfix + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_nullLimit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __nullIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __Integer,          __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __1Nulls,           __2Nulls,                   __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances postfix + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances postfix + truncated + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_nullLimit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __Integer,          __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __1Nulls,           __truncateStringValues,     __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances postfix + truncated + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances postfix + limit + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_0Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __0IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_0,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_1Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __1IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_1,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_2Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __2IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_2,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_3Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __3IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_3,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_4Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __4IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_4,              __2Nulls,                   __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances postfix + limit + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances postfix + limit + truncated + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_0Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __0IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_0,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_1Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_1,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_2Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __2IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_2,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_3Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_3,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_nullPrefix_postfix_4Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __nullStringCharacterNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __2Nulls,                   __postfixStringValues,      __2_4,              __truncateStringValues,     __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances postfix + limit + truncated + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_nullLimit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __nullIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __Integer,          __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __1Nulls,           __2Nulls,                   __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + truncated + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_nullLimit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __nullIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __Integer,          __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __1Nulls,           __truncateStringValues,     __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + truncated + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + limit + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_0Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __0IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_0,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_1Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __1IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_1,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_2Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __2IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_2,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_3Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __3IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_3,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_4Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __4IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_4,              __2Nulls,                   __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + limit + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + limit + truncated + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_0Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __0IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_0,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_1Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __1IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_1,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_2Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __2IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_2,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_3Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __3IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_3,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_nullPostfix_4Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __nullStringCharacterNames, __4IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __prefixStringValues,       __2Nulls,                   __2_4,              __truncateStringValues,     __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + limit + truncated + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + postfix + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_nullLimit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __Integer,          __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __1Nulls,           __2Nulls,                   __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + postfix + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + postfix + truncated + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_nullLimit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __Integer,          __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __1Nulls,           __truncateStringValues,     __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + postfix + truncated + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + postfix + limit + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_0Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __0IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_0,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_1Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_1,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_2Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_2,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_3Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_3,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_4Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_4,              __2Nulls,                   __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + postfix + limit + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances prefix + postfix + limit + truncated + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_0Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __0IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_0,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_1Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_1,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_2Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_2,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_3Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_3,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] nullSeparator_prefix_postfix_4Limit_truncated_2Transform_arguments = create6Arguments(
            __nullStringCharacterNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacter,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __2Nulls,                   __prefix2StringValues,      __postfixStringValues,      __2_4,              __truncateStringValues,     __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances prefix + postfix + limit + truncated + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_nullLimit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __nullIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __Integer,          __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __1Nulls,           __2Nulls,                   __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + truncated + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_nullLimit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __nullIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __Integer,          __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __1Nulls,           __truncateStringValues,     __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + truncated + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + limit + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_0Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __0IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_0,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_1Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __1IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_1,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_2Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __2IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_2,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_3Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __3IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_3,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_4Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __4IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_4,              __2Nulls,                   __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + limit + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + limit + truncated + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_0Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __0IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_0,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_1Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __1IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_1,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_2Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __2IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_2,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_3Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __3IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_3,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_nullPostfix_4Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __4IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __2Nulls,                   __2_4,              __truncateStringValues,     __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + limit + truncated + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + postfix + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_nullLimit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __nullIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __Integer,          __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __1Nulls,           __2Nulls,                   __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + postfix + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + postfix + truncated + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_nullLimit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __Integer,          __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __1Nulls,           __truncateStringValues,     __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + postfix + truncated + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + postfix + limit + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_0Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __0IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_0,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_1Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __1IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_1,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_2Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __2IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_2,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_3Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __3IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_3,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_4Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __4IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_4,              __2Nulls,                   __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + postfix + limit + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + postfix + limit + truncated + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_0Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __0IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_0,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_1Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_1,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_2Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __2IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_2,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_3Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_3,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_nullPrefix_postfix_4Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacter,          __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __2Nulls,                   __postfixStringValues,      __2_4,              __truncateStringValues,     __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + postfix + limit + truncated + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_nullLimit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __nullIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __Integer,          __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __1Nulls,           __2Nulls,                   __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + truncated + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_nullLimit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __nullIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __Integer,          __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __1Nulls,           __truncateStringValues,     __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + truncated + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + limit + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_0Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __0IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_0,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_1Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __1IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_1,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_2Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __2IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_2,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_3Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __3IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_3,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_4Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __4IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_4,              __2Nulls,                   __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + limit + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + limit + truncated + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_0Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __0IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_0,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_1Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __1IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_1,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_2Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __2IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_2,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_3Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __3IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_3,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_nullPostfix_4Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __4IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacter,          __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __prefixStringValues,       __2Nulls,                   __2_4,              __truncateStringValues,     __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + limit + truncated + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + postfix + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_nullLimit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __Integer,          __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __1Nulls,           __2Nulls,                   __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + postfix + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + postfix + truncated + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_nullLimit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __Integer,          __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __1Nulls,           __truncateStringValues,     __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + postfix + truncated + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + postfix + limit + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_0Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __0IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_0,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_1Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_1,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_2Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_2,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_3Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_3,              __2Nulls,                   __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_4Limit_nullTruncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames, __nullStringCharacterNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacter,          __2CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_4,              __2Nulls,                   __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + postfix + limit + transform (T, int) → String) --------------------
    //#region -------------------- Arguments (methods|instances separator + prefix + postfix + limit + truncated + transform (T, int) → String) --------------------

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_0Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __0IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_0,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_1Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __1IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_1,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_2Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __2IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_2,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_3Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __3IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_3,              __truncateStringValues,     __2CallbackValues
    );

    public static final Arguments @Unmodifiable [] separator_prefix_postfix_4Limit_truncated_2Transform_arguments = create6Arguments(
            __StringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __4IntIntegerNames, __StringCharacterCharNames, __2CallbackNames,
            __StringCharacterChar,      __StringCharacterChar,      __StringCharacterChar,      __intInteger,       __StringCharacterChar,      __2CallbackClasses,
            __separatorStringValues,    __prefix2StringValues,      __postfixStringValues,      __2_4,              __truncateStringValues,     __2CallbackValues
    );

    //#endregion -------------------- Arguments (methods|instances separator + prefix + postfix + limit + truncated + transform (T, int) → String) --------------------

    //#endregion -------------------- Arguments (methods|instances) --------------------
    //#region -------------------- Arguments (separator) --------------------

    public static final Arguments @Unmodifiable [] separator_extendedArguments = {
            Arguments.of(Named.of("null CharSequence", new @Nullable Object[]{null,}),     new Class<?>[]{CharSequence.class,}),
            Arguments.of(Named.of("null String",       new @Nullable Object[]{null,}),     new Class<?>[]{String.class,}),
            Arguments.of(Named.of("null Character",    new @Nullable Object[]{null,}),     new Class<?>[]{Character.class,}),
            Arguments.of(Named.of("char",              new @Nullable Object[]{MIN_CHAR,}), new Class<?>[]{char.class,}),
    };

    //#endregion -------------------- Arguments (separator) --------------------
    //#region -------------------- Arguments (separator, null prefix) --------------------

    public static final Arguments @Unmodifiable [] nullPrefix_extendedArguments = create2Arguments(
            __nullCharSequenceStringCharacterCharNames, __nullStringCharacterNames,
            __CharSequenceStringCharacterChar,          __StringCharacter,
            __3NullsPlusChar,                           __2Nulls
    );

    public static final Arguments @Unmodifiable [] nullPrefix_extendedArgumentsAdded = create2Arguments(
            __nullObjectNames, __nullStringCharacterNames,
            __Object,          __StringCharacter,
            __1Nulls,          __2Nulls
    );

    //#endregion -------------------- Arguments (separator, null prefix) --------------------
    //#region -------------------- Arguments (separator, prefix) --------------------

    public static final Arguments @Unmodifiable [] prefix_extendedArguments = create2Arguments(
            __nullCharSequenceStringCharacterCharNames, __StringCharacterCharNames,
            __CharSequenceStringCharacterChar,          __StringCharacterChar,
            __3NullsPlusChar,                           __prefixStringValues
    );

    public static final Arguments @Unmodifiable [] prefix_extendedArgumentsAdded = create2Arguments(
            __nullObjectNames, __StringCharacterCharNames,
            __Object,          __StringCharacterChar,
            __1Nulls,          __prefixStringValues
    );

    //#endregion -------------------- Arguments (separator, prefix) --------------------
    //#region -------------------- Arguments (separator, null prefix, null postfix) --------------------

    public static final Arguments @Unmodifiable [] nullPrefix_nullPostfix_extendedArguments3 = create3Arguments(
        __nullCharSequenceStringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames,
        __CharSequenceStringCharacterChar,          __StringCharacter,          __StringCharacter,
        __3NullsPlusChar,                           __2Nulls,                   __2Nulls
    );

    public static final Arguments @Unmodifiable [] nullPrefix_nullPostfix_extendedArguments4 = create4Arguments(
        __nullCharSequenceStringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __intIntegerNames,
        __CharSequenceStringCharacterChar,          __StringCharacter,          __StringCharacter,          __intInteger,
        __3NullsPlusChar,                           __2Nulls,                   __2Nulls,                   __500AndNull
    );

    public static final Arguments @Unmodifiable [] nullPrefix_nullPostfix_extendedArguments5 = create5Arguments(
        __nullCharSequenceStringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __intIntegerNames, __nullCharSequenceStringCharacterCharNames,
        __CharSequenceStringCharacterChar,          __StringCharacter,          __StringCharacter,          __intInteger,      __CharSequenceStringCharacterChar,
        __3NullsPlusChar,                           __2Nulls,                   __2Nulls,                   __500AndNull,      __3NullsPlusChar
    );

    public static final Arguments @Unmodifiable [] nullPrefix_nullPostfix_extendedArguments6 = create6Arguments(
        __nullCharSequenceStringCharacterCharNames, __nullStringCharacterNames, __nullStringCharacterNames, __intIntegerNames, __nullCharSequenceStringCharacterCharNames, __callbackNames,
        __CharSequenceStringCharacterChar,          __StringCharacter,          __StringCharacter,          __intInteger,      __CharSequenceStringCharacterChar,          __callbackClasses,
        __3NullsPlusChar,                           __2Nulls,                   __2Nulls,                   __500AndNull,      __3NullsPlusChar,                           __failCallbackValues
    );

    public static final Arguments @Unmodifiable [] nullPrefix_nullPostfix_extendedArgumentsAdded1 = create3Arguments(
        __nullObjectNames, __nullStringCharacterNames, __nullStringCharacterNames,
        __Object,          __StringCharacter,          __StringCharacter,
        __1Nulls,          __2Nulls,                   __2Nulls
    );

    public static final Arguments @Unmodifiable [] nullPrefix_nullPostfix_extendedArgumentsAdded2 = create4Arguments(
        __nullObjectNames, __nullStringCharacterNames, __nullStringCharacterNames, __nullArrayEmptyArrayNames,
        __Object,          __StringCharacter,          __StringCharacter,          __ObjectArray2x,
        __1Nulls,          __2Nulls,                   __2Nulls,                   __1NullsPlusEmptyArray
    );

    //#endregion -------------------- Arguments (separator, null prefix, null postfix) --------------------
    //#region -------------------- Arguments (separator, null prefix, postfix) --------------------

    public static final Arguments @Unmodifiable [] nullPrefix_postfix_extendedArguments3 = create3Arguments(
        __nullCharSequenceStringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames,
        __CharSequenceStringCharacterChar,          __StringCharacter,          __StringCharacterChar,
        __3NullsPlusChar,                           __2Nulls,                   __postfixStringValues
    );

    public static final Arguments @Unmodifiable [] nullPrefix_postfix_extendedArguments4 = create4Arguments(
        __nullCharSequenceStringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __intIntegerNames,
        __CharSequenceStringCharacterChar,          __StringCharacter,          __StringCharacterChar,      __intInteger,
        __3NullsPlusChar,                           __2Nulls,                   __postfixStringValues,      __500AndNull
    );

    public static final Arguments @Unmodifiable [] nullPrefix_postfix_extendedArguments5 = create5Arguments(
        __nullCharSequenceStringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __intIntegerNames, __nullCharSequenceStringCharacterCharNames,
        __CharSequenceStringCharacterChar,          __StringCharacter,          __StringCharacterChar,      __intInteger,      __CharSequenceStringCharacterChar,
        __3NullsPlusChar,                           __2Nulls,                   __postfixStringValues,      __500AndNull,      __3NullsPlusChar
    );

    public static final Arguments @Unmodifiable [] nullPrefix_postfix_extendedArguments6 = create6Arguments(
        __nullCharSequenceStringCharacterCharNames, __nullStringCharacterNames, __StringCharacterCharNames, __intIntegerNames, __nullCharSequenceStringCharacterCharNames, __callbackNames,
        __CharSequenceStringCharacterChar,          __StringCharacter,          __StringCharacterChar,      __intInteger,      __CharSequenceStringCharacterChar,          __callbackClasses,
        __3NullsPlusChar,                           __2Nulls,                   __postfixStringValues,      __500AndNull,      __3NullsPlusChar,                           __failCallbackValues
    );

    public static final Arguments @Unmodifiable [] nullPrefix_postfix_extendedArgumentsAdded1 = create3Arguments(
            __nullObjectNames, __nullStringCharacterNames, __StringCharacterCharNames,
            __Object,          __StringCharacter,          __StringCharacterChar,
            __1Nulls,          __2Nulls,                   __postfixStringValues
    );

    public static final Arguments @Unmodifiable [] nullPrefix_postfix_extendedArgumentsAdded2 = create4Arguments(
            __nullObjectNames, __nullStringCharacterNames, __StringCharacterCharNames, __nullArrayEmptyArrayNames,
            __Object,          __StringCharacter,          __StringCharacterChar,      __ObjectArray2x,
            __1Nulls,          __2Nulls,                   __postfixStringValues,      __1NullsPlusEmptyArray
    );

    //#endregion -------------------- Arguments (separator, null prefix, postfix) --------------------
    //#region -------------------- Arguments (separator, prefix, null postfix) --------------------

    public static final Arguments @Unmodifiable [] prefix_nullPostfix_extendedArguments3 = create3Arguments(
        __nullCharSequenceStringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames,
        __CharSequenceStringCharacterChar,          __StringCharacterChar,      __StringCharacter,
        __3NullsPlusChar,                           __prefixStringValues,       __2Nulls
    );

    public static final Arguments @Unmodifiable [] prefix_nullPostfix_extendedArguments4 = create4Arguments(
        __nullCharSequenceStringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __intIntegerNames,
        __CharSequenceStringCharacterChar,          __StringCharacterChar,      __StringCharacter,          __intInteger,
        __3NullsPlusChar,                           __prefixStringValues,       __2Nulls,                   __500AndNull
    );

    public static final Arguments @Unmodifiable [] prefix_nullPostfix_extendedArguments5 = create5Arguments(
        __nullCharSequenceStringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __intIntegerNames, __nullCharSequenceStringCharacterCharNames,
        __CharSequenceStringCharacterChar,          __StringCharacterChar,      __StringCharacter,          __intInteger,      __CharSequenceStringCharacterChar,
        __3NullsPlusChar,                           __prefixStringValues,       __2Nulls,                   __500AndNull,      __3NullsPlusChar
    );

    public static final Arguments @Unmodifiable [] prefix_nullPostfix_extendedArguments6 = create6Arguments(
        __nullCharSequenceStringCharacterCharNames, __StringCharacterCharNames, __nullStringCharacterNames, __intIntegerNames, __nullCharSequenceStringCharacterCharNames, __callbackNames,
        __CharSequenceStringCharacterChar,          __StringCharacterChar,      __StringCharacter,          __intInteger,      __CharSequenceStringCharacterChar,          __callbackClasses,
        __3NullsPlusChar,                           __prefixStringValues,       __2Nulls,                   __500AndNull,      __3NullsPlusChar,                           __failCallbackValues
    );

    public static final Arguments @Unmodifiable [] prefix_nullPostfix_extendedArgumentsAdded1 = create3Arguments(
            __nullObjectNames, __StringCharacterCharNames, __nullStringCharacterNames,
            __Object,          __StringCharacterChar,      __StringCharacter,
            __1Nulls,          __prefixStringValues,       __2Nulls
    );

    public static final Arguments @Unmodifiable [] prefix_nullPostfix_extendedArgumentsAdded2 = create4Arguments(
            __nullObjectNames, __StringCharacterCharNames, __nullStringCharacterNames, __nullArrayEmptyArrayNames,
            __Object,          __StringCharacterChar,      __StringCharacter,          __ObjectArray2x,
            __1Nulls,          __prefixStringValues,       __2Nulls,                   __1NullsPlusEmptyArray
    );

    //#endregion -------------------- Arguments (separator, prefix, null postfix) --------------------
    //#region -------------------- Arguments (separator, prefix, postfix) --------------------

    public static final Arguments @Unmodifiable [] prefix_postfix_extendedArguments3 = create3Arguments(
        __nullCharSequenceStringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames,
        __CharSequenceStringCharacterChar,          __StringCharacterChar,      __StringCharacterChar,
        __3NullsPlusChar,                           __prefix2StringValues,      __postfixStringValues
    );

    public static final Arguments @Unmodifiable [] prefix_postfix_extendedArguments4 = create4Arguments(
        __nullCharSequenceStringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __intIntegerNames,
        __CharSequenceStringCharacterChar,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,
        __3NullsPlusChar,                           __prefix2StringValues,      __postfixStringValues,      __500AndNull
    );

    public static final Arguments @Unmodifiable [] prefix_postfix_extendedArguments5 = create5Arguments(
        __nullCharSequenceStringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __intIntegerNames, __nullCharSequenceStringCharacterCharNames,
        __CharSequenceStringCharacterChar,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,      __CharSequenceStringCharacterChar,
        __3NullsPlusChar,                           __prefix2StringValues,      __postfixStringValues,      __500AndNull,      __3NullsPlusChar
    );

    public static final Arguments @Unmodifiable [] prefix_postfix_extendedArguments6 = create6Arguments(
        __nullCharSequenceStringCharacterCharNames, __StringCharacterCharNames, __StringCharacterCharNames, __intIntegerNames, __nullCharSequenceStringCharacterCharNames, __callbackNames,
        __CharSequenceStringCharacterChar,          __StringCharacterChar,      __StringCharacterChar,      __intInteger,      __CharSequenceStringCharacterChar,          __callbackClasses,
        __3NullsPlusChar,                           __prefix2StringValues,      __postfixStringValues,      __500AndNull,      __3NullsPlusChar,                           __failCallbackValues
    );

    public static final Arguments @Unmodifiable [] prefix_postfix_extendedArgumentsAdded1 = create3Arguments(
            __nullObjectNames, __StringCharacterCharNames, __StringCharacterCharNames,
            __Object,          __StringCharacterChar,      __StringCharacterChar,
            __1Nulls,          __prefix2StringValues,      __postfixStringValues
    );

    public static final Arguments @Unmodifiable [] prefix_postfix_extendedArgumentsAdded2 = create4Arguments(
            __nullObjectNames, __StringCharacterCharNames, __StringCharacterCharNames, __nullArrayEmptyArrayNames,
            __Object,          __StringCharacterChar,      __StringCharacterChar,      __ObjectArray2x,
            __1Nulls,          __prefix2StringValues,      __postfixStringValues,      __1NullsPlusEmptyArray
    );

    //#endregion -------------------- Arguments (separator, prefix, postfix) --------------------

    //#region -------------------- Create arguments --------------------

    private static Arguments @Unmodifiable [] create2Arguments(final String @Unmodifiable [] names1, final String @Unmodifiable [] names2,
                                                               final Class<?> @Unmodifiable [] classes1, final Class<?> @Unmodifiable [] classes2,
                                                               final @Nullable Object @Unmodifiable [] values1, final @Nullable Object @Unmodifiable [] values2) {
        final var size1 = names1.length;
        final var size2 = names2.length;
        final var argumentsSize = size1 * size2;
        final var arguments = new Arguments[argumentsSize];
        var index = -1;
        for (var i = 0; i < size1; i++)
            for (var j = 0; j < size2; j++)
                arguments[++index] = Arguments.of(Named.of(names1[i] + ", " + names2[j],
                        new @Nullable Object[]{values1[i], values2[j],}),
                        new Class<?>[]{classes1[i], classes2[j],});
        return arguments;
    }

    private static Arguments @Unmodifiable [] create3Arguments(final String @Unmodifiable [] names1, final String @Unmodifiable [] names2, final String @Unmodifiable [] names3,
                                                               final Class<?> @Unmodifiable [] classes1, final Class<?> @Unmodifiable [] classes2, final Class<?> @Unmodifiable [] classes3,
                                                               final @Nullable Object @Unmodifiable [] values1, final @Nullable Object @Unmodifiable [] values2, final @Nullable Object @Unmodifiable [] values3) {
        final var size1 = names1.length;
        final var size2 = names2.length;
        final var size3 = names3.length;
        final var argumentsSize = size1 * size2 * size3;
        final var arguments = new Arguments[argumentsSize];
        var index = -1;
        for (var i = 0; i < size1; i++)
            for (var j = 0; j < size2; j++)
                for (var k = 0; k < size3; k++)
                    arguments[++index] = Arguments.of(Named.of(names1[i] + ", " + names2[j] + ", " + names3[k],
                            new @Nullable Object[]{values1[i], values2[j], values3[k],}),
                            new Class<?>[]{classes1[i], classes2[j], classes3[k],});
        return arguments;
    }

    private static Arguments @Unmodifiable [] create4Arguments(final String @Unmodifiable [] names1, final String @Unmodifiable [] names2, final String @Unmodifiable [] names3, final String @Unmodifiable [] names4,
                                                               final Class<?> @Unmodifiable [] classes1, final Class<?> @Unmodifiable [] classes2, final Class<?> @Unmodifiable [] classes3, final Class<?> @Unmodifiable [] classes4,
                                                               final @Nullable Object @Unmodifiable [] values1, final @Nullable Object @Unmodifiable [] values2, final @Nullable Object @Unmodifiable [] values3, final @Nullable Object @Unmodifiable [] values4) {
        final var size1 = names1.length;
        final var size2 = names2.length;
        final var size3 = names3.length;
        final var size4 = names4.length;
        final var argumentsSize = size1 * size2 * size3 * size4;
        final var arguments = new Arguments[argumentsSize];
        var index = -1;
        for (var i = 0; i < size1; i++)
            for (var j = 0; j < size2; j++)
                for (var k = 0; k < size3; k++)
                    for (var l = 0; l < size4; l++)
                        arguments[++index] = Arguments.of(Named.of(names1[i] + ", " + names2[j] + ", " + names3[k] + ", " + names4[l],
                                new @Nullable Object[]{values1[i], values2[j], values3[k], values4[l],}),
                                new Class<?>[]{classes1[i], classes2[j], classes3[k], classes4[l],});
        return arguments;
    }

    private static Arguments @Unmodifiable [] create5Arguments(final String @Unmodifiable [] names1, final String @Unmodifiable [] names2, final String @Unmodifiable [] names3, final String @Unmodifiable [] names4, final String @Unmodifiable [] names5,
                                                               final Class<?> @Unmodifiable [] classes1, final Class<?> @Unmodifiable [] classes2, final Class<?> @Unmodifiable [] classes3, final Class<?> @Unmodifiable [] classes4, final Class<?> @Unmodifiable [] classes5,
                                                               final @Nullable Object @Unmodifiable [] values1, final @Nullable Object @Unmodifiable [] values2, final @Nullable Object @Unmodifiable [] values3, final @Nullable Object @Unmodifiable [] values4, final @Nullable Object @Unmodifiable [] values5) {
        final var size1 = names1.length;
        final var size2 = names2.length;
        final var size3 = names3.length;
        final var size4 = names4.length;
        final var size5 = names5.length;
        final var argumentsSize = size1 * size2 * size3 * size4 * size5;
        final var arguments = new Arguments[argumentsSize];
        var index = -1;
        for (var i = 0; i < size1; i++)
            for (var j = 0; j < size2; j++)
                for (var k = 0; k < size3; k++)
                    for (var l = 0; l < size4; l++)
                        for (var m = 0; m < size5; m++)
                            arguments[++index] = Arguments.of(Named.of(names1[i] + ", " + names2[j] + ", " + names3[k] + ", " + names4[l] + ", " + names5[m],
                                    new @Nullable Object[]{values1[i], values2[j], values3[k], values4[l], values5[m],}),
                                    new Class<?>[]{classes1[i], classes2[j], classes3[k], classes4[l], classes5[m],});
        return arguments;
    }

    private static Arguments @Unmodifiable [] create6Arguments(final String @Unmodifiable [] names1, final String @Unmodifiable [] names2, final String @Unmodifiable [] names3, final String @Unmodifiable [] names4, final String @Unmodifiable [] names5, final String @Unmodifiable [] names6,
                                                               final Class<?> @Unmodifiable [] classes1, final Class<?> @Unmodifiable [] classes2, final Class<?> @Unmodifiable [] classes3, final Class<?> @Unmodifiable [] classes4, final Class<?> @Unmodifiable [] classes5, final Class<?> @Unmodifiable [] classes6,
                                                               final @Nullable Object @Unmodifiable [] values1, final @Nullable Object @Unmodifiable [] values2, final @Nullable Object @Unmodifiable [] values3, final @Nullable Object @Unmodifiable [] values4, final @Nullable Object @Unmodifiable [] values5, final @Nullable Object @Unmodifiable [] values6) {
        final var size1 = names1.length;
        final var size2 = names2.length;
        final var size3 = names3.length;
        final var size4 = names4.length;
        final var size5 = names5.length;
        final var size6 = names6.length;
        final var argumentsSize = size1 * size2 * size3 * size4 * size5 * size6;
        final var arguments = new Arguments[argumentsSize];
        var index = -1;
        for (var i = 0; i < size1; i++)
            for (var j = 0; j < size2; j++)
                for (var k = 0; k < size3; k++)
                    for (var l = 0; l < size4; l++)
                        for (var m = 0; m < size5; m++)
                            for (var n = 0; n < size6; n++)
                                arguments[++index] = Arguments.of(Named.of(names1[i] + ", " + names2[j] + ", " + names3[k] + ", " + names4[l] + ", " + names5[m] + ", " + names6[n],
                                        new @Nullable Object[]{values1[i], values2[j], values3[k], values4[l], values5[m], values6[n],}),
                                        new Class<?>[]{classes1[i], classes2[j], classes3[k], classes4[l], classes5[m], classes6[n],});
        return arguments;
    }

    //#endregion -------------------- Create arguments --------------------

}
