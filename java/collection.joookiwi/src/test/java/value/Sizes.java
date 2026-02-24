package value;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class Sizes {

    @Contract(ALWAYS_FAIL_0) private Sizes() { throw new Error("The utility class “Sizes” cannot be constructed."); }

    public static final SizeValueInstance[] SIZE_VALUES = {
            new SizeValueInstance(new Object[]{},                                                        0),
            new SizeValueInstance(new Object[]{new Object(),},                                           1),
            new SizeValueInstance(new Object[]{new Object(), new Object(),},                             2),
            new SizeValueInstance(new Object[]{new Object(), new Object(), new Object(), new Object(),}, 4),
    };

}
