package DAY_4.Tests;


import DAY_4.Entity.ManualTest;
import DAY_4.Entity.Result;
import DAY_4.Entity.TestLevel;
import DAY_4.Worker.Engineer;
import DAY_4.Worker.TestEngineer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BaseTest {

    private DAY_4.Entity.Test test;
    private Engineer engineer;
    private int skill;
    private Result expected;

    public BaseTest(Engineer engineer, int skill, DAY_4.Entity.Test test, Result expected) {
        this.engineer = engineer;
        this.skill=skill;
        this.test=test;
        this.expected=expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> primeNumbers() {
        return Arrays.asList(new Object[][]{
                {new TestEngineer(),1,new ManualTest(TestLevel.UNIT, 5), Result.PASSED},
                {new TestEngineer(),10,new ManualTest(TestLevel.UNIT, 5), Result.PASSED},
                {new TestEngineer(),1,new ManualTest(TestLevel.API, 9), Result.PASSED},
                {new TestEngineer(),10,new ManualTest(TestLevel.API, 9), Result.PASSED},
        });
    }

    /*Testing class Test (apply method)
    if1(true || false)->true, if2->true */
    @Test
    public void ApplyMethodTest() {
        engineer.setSkill(skill);
        Assert.assertEquals(expected, test.apply(engineer));
    }

    /* if1(true || false)->true, if2->false
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
        //test = new ManualTest(TestLevel.API, 1);
        //engineer = new TestEngineer();
        //engineer.setSkill(1);
        Assert.assertEquals(test.getClass().toString() + " " + engineer.getClass().toString(), Result.PASSED, test.apply(engineer));
    }*/
}
