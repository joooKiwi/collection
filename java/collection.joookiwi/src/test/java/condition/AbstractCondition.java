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

/// A generalized [ExecutionCondition] for the tests for a specific method to call
@NotNullByDefault
abstract class AbstractCondition
        implements ExecutionCondition {

    /// The condition type (note this should be the current instance type)
    abstract Class<? extends AbstractCondition> conditionType();

    /// The method to invoke on the instance having the condition
    abstract String methodName();

    /// The message to tell it is **disabled** based on the name of the instance
    abstract String disabledMessage(String name);

    /// The message to tell it is **enabled** based on the name of the instance
    abstract String enabledMessage(String name);


    @Override public ConditionEvaluationResult evaluateExecutionCondition(final ExtensionContext context) {
        if (context.getTestMethod().isPresent())
            return ConditionEvaluationResult.enabled("A method is not validated for the disabled condition.");

        final var testClass = context.getTestClass().get();
        if (testParentTestValidation(testClass))
            return ConditionEvaluationResult.enabled("The instance where it has the “ExtendWith(" + getClass().getSimpleName() + ".class)” is not disabled since it is about its children.");

        final var parentContext = context.getParent().get();
        final var extendWithAnnotation = parentContext.getTestClass().get().getAnnotation(ExtendWith.class);
        if (extendWithAnnotation == null)
            return ConditionEvaluationResult.enabled("The child test instance is not desire target because it does not have “@ExtendWith” present.");
        if (hasNot(extendWithAnnotation.value(), conditionType()))
            return ConditionEvaluationResult.enabled("The child test instance is not desire target because it does not have “@ExtendWith(" + getClass().getSimpleName() + ".class)” present.");
        final var testInstance = parentContext.getTestInstance().get();
        final var testInstanceClass = testInstance.getClass();
        final var instanceName = testInstanceClass + "$" + context.getDisplayName();
        if ((boolean) invokeMethod(findMethod(testInstanceClass, methodName()).get(), testInstance))
            return ConditionEvaluationResult.disabled(disabledMessage(instanceName));
        return ConditionEvaluationResult.enabled(enabledMessage(instanceName));
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

        if (hasNot(extendWithClass.value(), conditionType()))
            return false;

        final var testInstanceClass = testClass.getAnnotation(TestInstance.class);
        if (testInstanceClass == null)
            throw new RuntimeException("The instance class “" + testClass.getName() + "” did not have the annotation “TestInstance” included. Use “@TestInstance(PER_CLASS)” to work properly.");
        if (testInstanceClass.value() != TestInstance.Lifecycle.PER_CLASS)
            throw new RuntimeException("The instance class “" + testClass.getName() + "” was not annotated with “@TestInstance(PER_CLASS)” included.");

        if (findMethod(testClass, methodName()).isEmpty())
            throw new RuntimeException("No method “" + methodName() +"” was found in “" + testClass.getName() + "”.");
        return true;
    }

}
