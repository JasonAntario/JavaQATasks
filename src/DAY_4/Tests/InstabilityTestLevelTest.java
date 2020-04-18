package DAY_4.Tests;

import DAY_4.Entity.*;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class InstabilityTestLevelTest {

    private DAY_4.Entity.Test test;
    private int expected;

    public InstabilityTestLevelTest(DAY_4.Entity.Test test, int expected) {
        this.expected = expected;
        this.test = test;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> primeNumbers() {
        return Arrays.asList(new Object[][]{
                {new ManualTest(TestLevel.UNIT, 0), 1},
                {new ManualTest(TestLevel.API, 5), 5},
                {new ManualTest(TestLevel.API, 11), 10},
                {new AutomatedTest(TestLevel.GUI, 7), 7},
                {new AutomatedTest(TestLevel.API, 11), 10},
                {new AutomatedTest(TestLevel.UNIT, 0), 1},
        });
    }

    @Test
    public void Instability() {
        Assert.assertEquals(expected, test.getInstability());
    }

    /*if1(false) else if2(true)
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
    }*/
}
