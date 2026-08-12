package test;

import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNullByDefault;

/// The name that would be used in the tests for
/// [ParameterizedTest][org.junit.jupiter.params.ParameterizedTest]
/// or [ParameterizedClass][org.junit.jupiter.params.ParameterizedClass]
///
/// @see InstanceClassUtil
@NotNullByDefault
public final class Types {

    public static final @NonNls String NORMAL =                "normal";
    public static final @NonNls String MINIMALIST =            "minimalist";
    public static final @NonNls String ARRAY =                 "array";

    public static final @NonNls String NORMAL_VIEWER =         "normal viewer";
    public static final @NonNls String MINIMALIST_VIEWER =     "minimalist viewer";

    public static final @NonNls String NORMAL_EXTENSION =      "normal extension";
    public static final @NonNls String MINIMALIST_EXTENSION =  "minimalist extension";
    public static final @NonNls String ARRAY_EXTENSION =       "array extension";

    public static final @NonNls String NULL_NORMAL_EXTENSION =     "null normal extension";
    public static final @NonNls String NULL_MINIMALIST_EXTENSION = "null minimalist extension";
    public static final @NonNls String NULL_ARRAY_EXTENSION =      "null array extension";

}
