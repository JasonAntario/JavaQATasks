package DAY_4.Worker;

import DAY_4.Entity.Result;
import DAY_4.Entity.Test;

public abstract class Engineer {
    private static int MAX_SKILL = 9;
    private int anxiety=3;

    public int getAnxiety() {
        return anxiety;
    }

    private int skill;

    public int getSkill() {
        return skill;
    }

    public void setSkill() {
        this.skill = (int) (1 + Math.random() * MAX_SKILL);
    }

    public Result executeTest(Test test) {
        return null;
    }


}
