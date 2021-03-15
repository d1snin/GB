package xyz.d1snin.codearchive.homeworks.level2.homework1;

import java.util.Random;

public class Robot extends UnhumanCompetitor {
    private static final int JUMP_LIMIT;
    private static final int RUN_LIMIT;

    static {
        Random random = new Random();
        JUMP_LIMIT = random.nextInt(10) + 10;
        RUN_LIMIT = random.nextInt(500) + 501;
    }

    public Robot(String name) {
        super("Robot", name, RUN_LIMIT, JUMP_LIMIT);
    }

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        super("Robot", name, maxRunDistance, maxJumpHeight);
    }
}
