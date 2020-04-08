package DAY_3;

public class Engineer extends Person {
    private boolean inventCode;
    private boolean executeTests;
    private String specialisation;

    public Engineer(String specialisation, boolean executeTests, boolean inventCode, String name, String surName, int age, boolean canSpeak) {
        this.setSpecialisation(specialisation);
        this.setInventCode(inventCode);
        this.setExecuteTests(executeTests);
        this.setName(name);
        this.setSurName(surName);
        this.setAge(age);
        this.setCanSpeak(canSpeak);
    }

    public boolean isExecuteTests() {
        return executeTests;
    }

    public void setExecuteTests(boolean executeTests) {
        this.executeTests = executeTests;
    }

    public boolean isInventCode() {
        return inventCode;
    }

    public void setInventCode(boolean inventCode) {
        this.inventCode = inventCode;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
}
