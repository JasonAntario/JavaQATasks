package DAY_4.Entity;

import DAY_4.Worker.AutomationEngineer;
import DAY_4.Worker.Engineer;
import DAY_4.Worker.TestEngineer;

import java.util.function.Function;

public abstract class Test implements Function<Engineer, Result> {
    private int complexity;
    private int instability;

    public int getComplexity() {
        return complexity;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    public int getInstability() {
        return instability;
    }

    public void setInstability(int instability) {
        if (instability <= 0)
            this.instability = 1;
        else if (instability > 10)
            this.instability = 10;
        else
            this.instability = instability;
    }

    public Test(TestLevel testLevel, int instability) {
        this.complexity = testLevel.COMPLEXITY;
        this.setInstability(instability);
    }

    @Override
    public Result apply(Engineer engineer) {
        int anxiety;
        if ((this instanceof ManualTest && engineer instanceof AutomationEngineer) || (this instanceof AutomatedTest && engineer instanceof TestEngineer))
            anxiety = engineer.getAnxiety();
        else
            anxiety = 1;
        if ((complexity * instability * anxiety) / engineer.getSkill() > 30)
            return Result.FAILED;
        else
            return Result.PASSED;
    }
}
