package xyz.d1snin.codearchive.homeworks.level2.homework1;

import java.util.Random;

public class Cat extends UnhumanCompetitor {
    private static final int JUMP_LIMIT;
    private static final int RUN_LIMIT;

    static {
        Random random = new Random();
        JUMP_LIMIT = random.nextInt(10) + 5;
        RUN_LIMIT = random.nextInt(400) + 501;
    }

    public Cat(String name) {
        super("Cat", name, RUN_LIMIT, JUMP_LIMIT);
    }

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        super("Cat", name, maxRunDistance, maxJumpHeight);
    }
}
