package DAY_4.Tests;

import DAY_4.Entity.AutomatedTest;
import DAY_4.Entity.ManualTest;
import DAY_4.Entity.Result;
import DAY_4.Entity.TestLevel;
import DAY_4.Worker.AutomationEngineer;
import DAY_4.Worker.TestEngineer;
import org.junit.Assert;
import org.junit.Test;

public class Day4Tests {

    //false true
    @Test
    public void automatedTestFailed() {
        AutomatedTest automatedTest = new AutomatedTest(TestLevel.GUI, 4);
        AutomationEngineer automationEngineer = new AutomationEngineer();
        Assert.assertEquals("AutomationTest, AutomationEngineer, Gui(9), instability 4, anxiety 1: ", Result.FAILED, automatedTest.apply(automationEngineer));
    }

    // OR true false
    @Test
    public void automatedTestPassed() {
        AutomatedTest automatedTest = new AutomatedTest(TestLevel.API, 3);
        TestEngineer testEngineer = new TestEngineer();
        Assert.assertEquals("AutomationTest, TestEngineer, API(3), instability 3, anxiety 3: ", Result.PASSED, automatedTest.apply(testEngineer));
    }

    //true true
    @Test
    public void manualTestFailed() {
        ManualTest manualTest = new ManualTest(TestLevel.GUI, 2);
        AutomationEngineer automationEngineer = new AutomationEngineer();
        Assert.assertEquals("ManualTest, AutomationEngineer, GUI(9), instability 2, anxiety 3: ", Result.FAILED, manualTest.apply(automationEngineer));
    }

    //false false
    @Test
    public void manualTestPassed() {
        ManualTest manualTest = new ManualTest(TestLevel.UNIT, 4);
        TestEngineer testEngineer = new TestEngineer();
        Assert.assertEquals("ManualTest, TestEngineer, UNIT(1), instability 4, anxiety 3: ", Result.PASSED, manualTest.apply(testEngineer));
    }
}
