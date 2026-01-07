package condition;

import org.jetbrains.annotations.NotNullByDefault;

/// Disable the test if the [instance.CollectionHolderForTest]`#SIMPLIFIED_NAME` is of the type "normal|minimalist viewer"
///
/// The main reason for this is that a "viewer" does not test negative indexes
/// Hence, no tests about "get" can be tested properly.
@NotNullByDefault
public final class DisableIfViewerCondition
        extends AbstractCondition {

    @Override Class<DisableIfViewerCondition> conditionType() { return DisableIfViewerCondition.class; }
    @Override String methodName() { return "disableIfViewer"; }
    @Override String disabledMessage(final String name) { return "“" + name + "” is disabled because it is of type “viewer”."; }
    @Override String enabledMessage(final String name) { return "“" + name + "” is enabled because it is not of type “viewer”."; }

}
