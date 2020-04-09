package DAY_4.Tests;

import DAY_4.Entity.ManualTest;
import DAY_4.Entity.Result;
import DAY_4.Entity.TestLevel;
import DAY_4.Worker.AutomationEngineer;
import org.junit.Assert;
import org.junit.Test;

public class ManualTestFailed {

    //true true
    @Test
    public void manualTestFailed() {
        ManualTest manualTest = new ManualTest(TestLevel.GUI, 2);
        AutomationEngineer automationEngineer = new AutomationEngineer();
        Assert.assertEquals("ManualTest, AutomationEngineer, GUI(9), instability 2, anxiety 3: ", Result.FAILED, manualTest.apply(automationEngineer));
    }
}
