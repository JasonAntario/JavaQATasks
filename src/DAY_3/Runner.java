package DAY_3;

public class Runner {
    public static void main(String[] args) {

        Engineer manualEngineer = new Engineer("Manual Engineer", true, false, "Jason", "Born", 34, true);
        Engineer automateEngineer = new Engineer("Automate Engineer", true, true, "Gordon", "Freeman", 39, false);

        System.out.println(" " + manualEngineer.getSpecialisation() + "; Execute Tests: " + manualEngineer.isExecuteTests() + "; Invent Code: " + manualEngineer.isInventCode() + "; " + manualEngineer.getName() + " " + manualEngineer.getSurName() + "; " + manualEngineer.getAge() + "; Can speak: " + manualEngineer.isCanSpeak());
        System.out.println(" " + automateEngineer.getSpecialisation() + "; Execute Tests: " + automateEngineer.isExecuteTests() + "; Invent Code: " + automateEngineer.isInventCode() + "; " + automateEngineer.getName() + " " + automateEngineer.getSurName() + "; " + automateEngineer.getAge() + "; Can speak: " + automateEngineer.isCanSpeak());
    }
}
