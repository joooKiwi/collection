package condition;

import org.jetbrains.annotations.NotNullByDefault;
import test.AbstractInstancesTests;

/// Disable the test if the [instance.CollectionHolderForTest]`#SIMPLIFIED_NAME` is of the type "minimalist"
@NotNullByDefault
public final class DisableIfMinimalistCondition
        extends AbstractCondition {

    @Override boolean condition(final AbstractInstancesTests instance) { return instance.isMinimalist(); }
    @Override String disabledMessage(final String name) { return "“" + name + "” is disabled because it is of type “minimalist”."; }
    @Override String enabledMessage(final String name) { return "“" + name + "” is enabled because it is not of type “minimalist”."; }

}
