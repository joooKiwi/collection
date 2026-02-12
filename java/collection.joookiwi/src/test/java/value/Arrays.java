package value;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class Arrays {

    @Contract(ALWAYS_FAIL_0) private Arrays() { throw new Error("The utility class “Arrays” cannot be constructed."); }

    public static final String[] EMPTY = {};

    public static final String[] A =              {"a", };
    public static final String[] B =              {"b", };
    public static final String[] C =              {"c", };
    public static final String[] D =              {"d", };
    public static final String[] E =              {"e", };
    public static final String[] UPPER_E =        {"E", };
    public static final @Nullable String[] NULL = {null,};
    public static final int[] _0 =                {0,   };
    public static final Integer[] _0_OBJECT =     {0,   };
    public static final int[] _1 =                {1,   };
    public static final Integer[] _1_OBJECT =     {1,   };
    public static final int[] _2 =                {2,   };
    public static final Integer[] _2_OBJECT =     {2,   };
    public static final int[] _3 =                {3,   };
    public static final Integer[] _3_OBJECT =     {3,   };
    public static final int[] _4 =                {4,   };
    public static final Integer[] _4_OBJECT =     {4,   };

    public static final String[] AA =                {"a",  "a", };
    public static final String[] A_A =               {"a",  "A", };
    public static final String[] AB =                {"a",  "b", };
    public static final String[] AC =                {"a",  "c", };
    public static final String[] BA =                {"b",  "a", };
    public static final String[] BC =                {"b",  "c", };
    public static final String[] BD =                {"b",  "d", };
    public static final String[] CB =                {"c",  "b", };
    public static final String[] CD =                {"c",  "d", };
    public static final String[] DC =                {"d",  "c", };
    public static final String[] UPPER_EE =          {"E",  "E", };
    public static final String[] EF =                {"e",  "f", };
    public static final @Nullable String[] NULL_x2 = {null, null,};
    public static final int[] _01 =                  {0,    1,   };
    public static final Integer[] _01_OBJECT =       {0,    1,   };
    public static final int[] _45 =                  {4,    5,   };
    public static final Integer[] _45_OBJECT =       {4,    5,   };

    public static final @Nullable String[] A_NULL =        {"a",  null,            };
    public static final @Nullable String[] AB_NULL =       {"a",  "b",  null,      };
    public static final @Nullable String[] AB_NULL_NULL =  {"a",  "b",  null, null,};
    public static final @Nullable String[] A_NULL_B =      {"a",  null, "b",       };
    public static final @Nullable String[] NULL_A =        {null, "a",             };
    public static final @Nullable String[] NULL_B =        {null,       "b",       };
    public static final @Nullable String[] NULL_AB =       {null, "a",  "b",       };
    public static final @Nullable String[] NULL_NULL_AB =  {null, null, "a",  "b", };
    public static final @Nullable String[] A_NULL_NULL_B = {"a",  null, null, "b", };
    public static final @Nullable String[] A_NULL_C_NULL = {"a",  null, "c",  null,};
    public static final @Nullable String[] NULL_B_NULL_D = {null, "b",  null, "d", };

    public static final String[] ABC = {"a", "b", "c",};
    public static final String[] ABD = {"a", "b", "d",};
    public static final String[] ACD = {"a", "c", "d",};
    public static final String[] BCD = {"b", "c", "d",};
    public static final String[] CBA = {"c", "b", "a",};
    public static final String[] DCB = {"d", "c", "b",};

    public static final String[] ABAB =              {"a",  "b",  "a",  "b", };
    public static final String[] AB_AB =             {"a",  "b",  "A",  "B", };
    public static final String[] AABC =              {"a",  "a",  "b",  "c", };
    public static final String[] ABCD =              {"a",  "b",  "c",  "d", };
    public static final String[] ABBC =              {"a",  "b",  "b",  "c", };
    public static final String[] ABCC =              {"a",  "b",  "c",  "c", };
    public static final String[] DCBA =              {"d",  "c",  "b",  "a", };
    public static final String[] UPPER_EEEE =        {"E",  "E",  "E",  "E", };
    public static final String[] EFGH =              {"e",  "f",  "g",  "h", };
    public static final @Nullable String[] NULL_x4 = {null, null, null, null,};
    public static final int[] _0123 =                {0,    1,    2,    3,   };
    public static final Integer[] _0123_OBJECT =     {0,    1,    2,    3,   };
    public static final int[] _4567 =                {4,    5,    6,    7,   };
    public static final Integer[] _4567_OBJECT =     {4,    5,    6,    7,   };

}
