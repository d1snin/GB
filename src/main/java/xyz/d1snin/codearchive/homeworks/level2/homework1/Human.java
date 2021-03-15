package xyz.d1snin.codearchive.homeworks.level2.homework1;

import java.util.Random;

public class Human extends Competitor {
    private static final int RUN_LIMIT;
    private static final int JUMP_LIMIT;

    static {
        Random random = new Random();
        JUMP_LIMIT = random.nextInt(6) + 5;
        RUN_LIMIT = random.nextInt(300) + 501;
    }

    public Human(String name) {
        super(name, RUN_LIMIT, JUMP_LIMIT);
    }

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }
}
