package condition;

import org.jetbrains.annotations.NotNullByDefault;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import test.AbstractInstancesTests;

import static joookiwi.collection.java.method.HasNot.hasNot;
import static org.junit.platform.commons.util.ReflectionUtils.findMethod;
import static org.junit.platform.commons.util.ReflectionUtils.invokeMethod;

/// Disable the test if the [instance.CollectionHolderForTest]`#SIMPLIFIED_NAME` is of the type "normal"
///
/// The main reason for this is that an array cannot be proxied or mocked.
/// Hence, no tests about "get() being called" can be tested properly.
@NotNullByDefault
public final class DisableIfNormalCondition
        extends AbstractCondition {

    @Override boolean condition(final AbstractInstancesTests instance) { return instance.isNormal(); }
    @Override String disabledMessage(final String name) { return "“" + name + "” is disabled because it is of type “normal”."; }
    @Override String enabledMessage(final String name) { return "“" + name + "” is enabled because it is is not of type “normal”."; }

}
