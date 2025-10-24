package condition;

import org.jetbrains.annotations.NotNullByDefault;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;

import static joookiwi.collection.java.method.HasNot.hasNot;
import static org.junit.platform.commons.util.ReflectionUtils.findMethod;
import static org.junit.platform.commons.util.ReflectionUtils.invokeMethod;

/// Disable the test if the [instance.CollectionHolderForTest]`#SIMPLIFIED_NAME` is of the type "normal"
///
/// The main reason for this is that an array cannot be proxied or mocked.
/// Hence, no tests about "get() being called" can be tested properly.
@NotNullByDefault
public final class DisableIfNormalCondition
        implements ExecutionCondition {

    /// The method to invoke on the instance having the condition
    static final String METHOD = "disableIfNormal";

    @Override public ConditionEvaluationResult evaluateExecutionCondition(final ExtensionContext context) {
        if (context.getTestMethod().isPresent())
            return ConditionEvaluationResult.enabled("A method is not validated for the disabled condition.");

        final var testClass = context.getTestClass().get();
        if (testParentTestValidation(testClass))
            return ConditionEvaluationResult.enabled("The instance where it has the “ExtendWith(DisableIfNormalCondition.class)” is not disabled since it is about its children.");

        final var parentContext = context.getParent().get();
        final var extendWithAnnotation = parentContext.getTestClass().get().getAnnotation(ExtendWith.class);
        if (extendWithAnnotation == null)
            return ConditionEvaluationResult.enabled("The child test instance is not desire target because it does not have “@ExtendWith” present.");
        if (hasNot(extendWithAnnotation.value(), DisableIfNormalCondition.class))
            return ConditionEvaluationResult.enabled("The child test instance is not desire target because it does not have “@ExtendWith(DisableIfNormalCondition.class)” present.");
        final var testInstance = parentContext.getTestInstance().get();
        if ((boolean) invokeMethod(findMethod(testInstance.getClass(), METHOD).get(), testInstance))
            return ConditionEvaluationResult.disabled("The instance is of type normal.");
        return ConditionEvaluationResult.enabled("The instance is not of type “normal.");
    }

    /// Test the parent instance if it has [ExtendWith] present (otherwise, it is ignored).
    /// Then it test if it has [TestInstance] of type [PER_CLASS][TestInstance.Lifecycle#PER_CLASS].
    ///
    /// @param testClass The test instance class to validate the annotations [ExtendWith] and [TestInstance]
    /// @return `true` if the test is correct. `false` if the test is to ignore
    boolean testParentTestValidation(final Class<?> testClass) {
        final var extendWithClass = testClass.getAnnotation(ExtendWith.class);
        if (extendWithClass == null)
            return false;

        if (hasNot(extendWithClass.value(), DisableIfNormalCondition.class))
            return false;

        final var testInstanceClass = testClass.getAnnotation(TestInstance.class);
        if (testInstanceClass == null)
            throw new RuntimeException("The instance class “" + testClass.getName() + "” did not have the annotation “TestInstance” included. Use “@TestInstance(PER_CLASS)” to work properly.");
        if (testInstanceClass.value() != TestInstance.Lifecycle.PER_CLASS)
            throw new RuntimeException("The instance class “" + testClass.getName() + "” was not annotated with “@TestInstance(PER_CLASS)” included.");

        if (findMethod(testClass, METHOD).isEmpty())
            throw new RuntimeException("No method “" + METHOD +"” was found in “" + testClass.getName() + "”.");
        return true;
    }

}
