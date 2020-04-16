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
    private static Engineer engineer;

    /*Testing class Test (apply method)
    if1(true || false)->true, if2->true */
    @Test
    public void mTestAEngineerFailed() {
        test = new ManualTest(TestLevel.GUI, 10);
        engineer = new AutomationEngineer();
        engineer.setSkill(8);
        Assert.assertEquals(test.getClass().toString() + " " + engineer.getClass().toString(), Result.FAILED, test.apply(engineer));
    }

    // if1(true || false)->true, if2->false
    @Test
    public void mTestAEngineerPassed() {
        test = new ManualTest(TestLevel.API, 4);
        engineer = new AutomationEngineer();
        engineer.setSkill(5);
        Assert.assertEquals(test.getClass().toString() + " " + engineer.getClass().toString(), Result.PASSED, test.apply(engineer));
    }

    //if1(false || true)->true, if2->true
    @Test
    public void aTestTEngineerFailed() {
        test = new AutomatedTest(TestLevel.GUI, 10);
        engineer = new TestEngineer();
        engineer.setSkill(7);
        Assert.assertEquals(test.getClass().toString() + " " + engineer.getClass().toString(), Result.FAILED, test.apply(engineer));
    }

    //if1(false || true)->true, if2->false
    @Test
    public void aTestTEngineerPassed() {
        test = new AutomatedTest(TestLevel.UNIT, 5);
        engineer = new TestEngineer();
        engineer.setSkill(1);
        Assert.assertEquals(test.getClass().toString() + " " + engineer.getClass().toString(), Result.PASSED, test.apply(engineer));
    }

    //if1(false || false)->false, if2->true
    @Test
    public void aTestAEngineerFailed() {
        test = new AutomatedTest(TestLevel.GUI, 5);
        engineer = new AutomationEngineer();
        engineer.setSkill(1);
        Assert.assertEquals(test.getClass().toString() + " " + engineer.getClass().toString(), Result.FAILED, test.apply(engineer));
    }

    //if1(false || false)->false, if2->false
    @Test
    public void mTestTEngineerPassed() {
        test = new ManualTest(TestLevel.API, 1);
        engineer = new TestEngineer();
        engineer.setSkill(1);
        Assert.assertEquals(test.getClass().toString() + " " + engineer.getClass().toString(), Result.PASSED, test.apply(engineer));
    }

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
