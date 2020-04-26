package DAY_6.Tests;

import DAY_4.Entity.*;
import DAY_4.Worker.AutomationEngineer;
import DAY_4.Worker.Engineer;
import DAY_4.Worker.TestEngineer;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InstabilityTestLevelTest {

    private DAY_4.Entity.Test test;
    private int expected;
    private Engineer engineer;

    public InstabilityTestLevelTest(DAY_4.Entity.Test test, int expected, Engineer engineer) {
        this.expected = expected;
        this.test = test;
        this.engineer = engineer;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> primeNumbers() {
        return Arrays.asList(new Object[][]{
                {new ManualTest(TestLevel.UNIT, 0), 1, new TestEngineer()},
                {new ManualTest(TestLevel.API, 11), 10, new AutomationEngineer()},
                {new AutomatedTest(TestLevel.API, 11), 10, new TestEngineer()},
                {new AutomatedTest(TestLevel.UNIT, 0), 1, new AutomationEngineer()},
        });
    }

    @Test
    public void skillTesting() {
        Assert.assertTrue(engineer.getSkill() >= 1 && engineer.getSkill() <= 10);
    }
    @Test
    public void instabilityTesting() {
        Assert.assertEquals(expected, test.getInstability());
    }
}
