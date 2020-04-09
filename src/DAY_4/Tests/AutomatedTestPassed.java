package DAY_4.Tests;

import DAY_4.Entity.AutomatedTest;
import DAY_4.Entity.Result;
import DAY_4.Entity.TestLevel;
import DAY_4.Worker.TestEngineer;
import org.junit.Assert;
import org.junit.Test;

public class AutomatedTestPassed {

    // OR true false
    @Test
    public void automatedTestPassed() {
        AutomatedTest automatedTest = new AutomatedTest(TestLevel.API, 3);
        TestEngineer testEngineer = new TestEngineer();
        Assert.assertEquals("AutomationTest, AutomationEngineer, API(3), instability 3, anxiety 3: ", Result.PASSED, automatedTest.apply(testEngineer));
    }
}
