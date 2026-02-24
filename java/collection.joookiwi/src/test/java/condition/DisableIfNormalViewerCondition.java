package condition;

import org.jetbrains.annotations.NotNullByDefault;
import test.AbstractInstancesTests;

/// Disable the test if the [instance.CollectionHolderForTest]`#SIMPLIFIED_NAME` is of the type "normal viewer"
///
/// The main reason for this is that a "normal viewer" does not test negative indexes
/// Hence, no tests about "get() being called" or "get" can be tested properly.
@NotNullByDefault
public final class DisableIfNormalViewerCondition
        extends AbstractCondition {

    @Override boolean condition(final AbstractInstancesTests instance) { return instance.isNormalViewer(); }
    @Override String disabledMessage(final String name) { return "“" + name + "” is disabled because it is of type “normal viewer”."; }
    @Override String enabledMessage(final String name) { return "“" + name + "” is enabled because it is not of type “normal viewer”."; }

}
