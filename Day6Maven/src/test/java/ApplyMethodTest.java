import entity.AutomatedTest;
import entity.ManualTest;
import entity.Result;
import entity.TestLevel;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import worker.AutomationEngineer;
import worker.Engineer;
import worker.TestEngineer;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ApplyMethodTest {

    private entity.Test test;
    private Engineer engineer;
    private int skill;
    private Result expected;

    public ApplyMethodTest(Engineer engineer, entity.Test test, int skill, Result expected) {
        this.engineer = engineer;
        this.skill = skill;
        this.test = test;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> primeNumbers() {
        return Arrays.asList(new Object[][]{
                {new TestEngineer(), new ManualTest(TestLevel.UNIT, 10), 10, Result.PASSED},
                {new TestEngineer(), new ManualTest(TestLevel.API, 0), 1, Result.PASSED},
                {new AutomationEngineer(), new ManualTest(TestLevel.GUI, 0), 10, Result.PASSED},
                {new TestEngineer(), new AutomatedTest(TestLevel.UNIT, 11), 10, Result.PASSED},
                {new AutomationEngineer(), new AutomatedTest(TestLevel.API, 11), 10, Result.PASSED},
                {new TestEngineer(), new AutomatedTest(TestLevel.GUI, 10), 1, Result.FAILED},
                {new AutomationEngineer(), new AutomatedTest(TestLevel.GUI, 1), 1, Result.PASSED},
                {new AutomationEngineer(), new ManualTest(TestLevel.API, 10), 1, Result.FAILED},
                {new TestEngineer(), new ManualTest(TestLevel.GUI, 1), 10, Result.PASSED},
                {new AutomationEngineer(), new ManualTest(TestLevel.UNIT, 1), 10, Result.PASSED},
                {new AutomationEngineer(), new ManualTest(TestLevel.GUI, 11), 10, Result.PASSED},
                {new AutomationEngineer(), new AutomatedTest(TestLevel.UNIT, 0), 1, Result.PASSED},
                {new TestEngineer(), new ManualTest(TestLevel.UNIT, 11), 10, Result.PASSED},
                {new TestEngineer(), new AutomatedTest(TestLevel.API, 0), 10, Result.PASSED},
                {new AutomationEngineer(), new AutomatedTest(TestLevel.GUI, 10), 1, Result.FAILED},
                {new TestEngineer(), new AutomatedTest(TestLevel.API, 1), 10, Result.PASSED},
        });
    }

    @Test
    public void MethodTesting() {
        engineer.setSkill(skill);
        Assert.assertEquals(expected, test.apply(engineer));
    }
}
