package DAY_4.Tests;

import DAY_4.Entity.ManualTest;
import DAY_4.Entity.Result;
import DAY_4.Entity.TestLevel;
import DAY_4.Worker.TestEngineer;
import org.junit.Assert;
import org.junit.Test;

public class ManualTestPassed {

    //false false
    @Test
    public void manualTestPassed() {
        ManualTest manualTest = new ManualTest(TestLevel.UNIT, 4);
        TestEngineer testEngineer = new TestEngineer();
        Assert.assertEquals("ManualTest, TestEngineer, UNIT(1), instability 4, anxiety 3: ", Result.PASSED, manualTest.apply(testEngineer));
    }
}
