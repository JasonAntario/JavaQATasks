package DAY_4.Tests;

import DAY_4.Entity.AutomatedTest;
import DAY_4.Entity.ManualTest;
import DAY_4.Entity.Result;
import DAY_4.Entity.TestLevel;
import DAY_4.Worker.AutomationEngineer;
import DAY_4.Worker.Engineer;
import DAY_4.Worker.TestEngineer;
import org.junit.Assert;
import org.junit.Test;

public class Day4Tests {

    private static DAY_4.Entity.Test test;
    /*Testing class Test (setInstability method)
    if1(true) */
    @Test
    public void InstabilityT(){
        test = new ManualTest(TestLevel.GUI, 0);
        Assert.assertEquals(1, test.getInstability());
    }
    //if1(false) else if2(true)
    @Test
    public void InstabilityFT(){
        test = new ManualTest(TestLevel.GUI, 15);
        Assert.assertEquals(10, test.getInstability());
    }

    //if1(false) else if2(false)
    @Test
    public void InstabilityFF(){
        test = new ManualTest(TestLevel.GUI, 8);
        Assert.assertEquals(8, test.getInstability());
    }
}
