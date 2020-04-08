package DAY_4;

import DAY_4.Entity.AutomatedTest;
import DAY_4.Entity.ManualTest;
import DAY_4.Entity.TestLevel;
import DAY_4.Worker.AutomationEngineer;
import DAY_4.Worker.TestEngineer;

public class Runner {
    public static void main(String[] args) {
        TestEngineer testEngineer = new TestEngineer();
        AutomatedTest automatedTest = new AutomatedTest(TestLevel.GUI,2);
        AutomationEngineer automationEngineer = new AutomationEngineer();
        ManualTest manualTest = new ManualTest(TestLevel.API, 4);

        System.out.println(automatedTest.apply(testEngineer) + "\n"+manualTest.apply(automationEngineer)+"\n"+manualTest.apply(testEngineer));

    }
}
