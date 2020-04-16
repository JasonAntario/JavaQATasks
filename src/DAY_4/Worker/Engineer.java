package DAY_4.Worker;

import DAY_4.Entity.Result;
import DAY_4.Entity.Test;

public abstract class Engineer {
    static int MAX_SKILL = 10;
    int anxiety = 3;

    public int getAnxiety() {
        return anxiety;
    }

    int skill;

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public void setRandomSkill() {
        this.skill = (int) (1 + Math.random() * MAX_SKILL);
    }

    public Result executeTest(Test test) {
        return null;
    }


}
