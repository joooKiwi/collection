package condition;

import org.jetbrains.annotations.NotNullByDefault;

/// Disable the test if the [instance.CollectionHolderForTest]`#SIMPLIFIED_NAME` is of the type "minimalist"
@NotNullByDefault
public final class DisableIfMinimalistCondition
        extends AbstractCondition {

    @Override String methodName() { return "disableIfMinimalist"; }
    @Override String isATypeName() { return "The instance is of type “minimalist”."; }
    @Override String isNotATypeName() { return "The instance is not of type “minimalist”."; }

}
