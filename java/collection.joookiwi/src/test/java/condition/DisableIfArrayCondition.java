package condition;

import org.jetbrains.annotations.NotNullByDefault;
import test.AbstractInstancesTests;

/// Disable the test if the [instance.CollectionHolderForTest]`#SIMPLIFIED_NAME` is of the type "array"
///
/// The main reason for this is that an array cannot be proxied or mocked.
/// Hence, no tests about "get() being called" can be tested properly.
@NotNullByDefault
public final class DisableIfArrayCondition
        extends AbstractCondition {

    @Override boolean condition(final AbstractInstancesTests instance) { return instance.isArray(); }
    @Override String disabledMessage(final String name) { return "“" + name + "” is disabled because it is of type “array”."; }
    @Override String enabledMessage(final String name) { return "“" + name + "” is enabled because it is is not of type “array”."; }

}
