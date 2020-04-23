import entity.AutomatedTest;
import entity.ManualTest;
import entity.TestLevel;
import worker.AutomationEngineer;
import worker.TestEngineer;

public class Runner {
    public static void main(String[] args) {
        TestEngineer testEngineer = new TestEngineer();
        AutomatedTest automatedTest = new AutomatedTest(TestLevel.GUI,10);
        AutomationEngineer automationEngineer = new AutomationEngineer();
        ManualTest manualTest = new ManualTest(TestLevel.API, 4);

        System.out.println(automatedTest.apply(testEngineer) + "\n"+manualTest.apply(automationEngineer)+"\n"+manualTest.apply(testEngineer));

    }
}
