package xyz.d1snin.codearchive.homeworks.level3.homework5;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {

    public static int STAGES_COUNT = 0;

    private ArrayList<Stage> stages;

    public ArrayList<Stage> getStages() {
        return stages;
    }

    public Race(Stage... stages) {
        STAGES_COUNT = stages.length;
        stages[stages.length - 1].isLastStage = true;
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }
}
