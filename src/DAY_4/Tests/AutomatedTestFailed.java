package DAY_4.Tests;

import DAY_4.Entity.AutomatedTest;
import DAY_4.Entity.Result;
import DAY_4.Entity.TestLevel;
import DAY_4.Worker.AutomationEngineer;
import org.junit.Assert;
import org.junit.Test;

public class AutomatedTestFailed {

    //false true
    @Test
    public void automatedTestFailed() {
        AutomatedTest automatedTest = new AutomatedTest(TestLevel.GUI, 4);
        AutomationEngineer automationEngineer = new AutomationEngineer();
        Assert.assertEquals("AutomationTest, AutomationEngineer, Gui(9), instability 4, anxiety 1: ", Result.FAILED, automatedTest.apply(automationEngineer));
    }
}
