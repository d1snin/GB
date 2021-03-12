package xyz.d1snin.codearchive.homeworks.level2.homework1;

public class Cat implements RunnableAndJumpable {
    private static int JUMP_LIMIT;
    private static int RUN_LIMIT;
    private static boolean ACCESS = true;
    public Cat(int jumpLimit, int runLimit) {
        setJumpLimit(jumpLimit);
        setRunLimit(runLimit);
    }
    @Override
    public void jump(Obstruction obs) {
        if (ACCESS) {
            if (obs.getSize() > getJumpLimit()) {
                System.out.println("Кот не может прыгнуть выше, чем на " + getJumpLimit());
                ACCESS = false;
            } else {
                System.out.println("Кот перепрыгнул это препятствие");
            }
        }
    }

    @Override
    public void run(Obstruction obs) {
        if (ACCESS) {
            if (obs.getSize() > getRunLimit()) {
                System.out.println("Кот не может пробежать больше чем " + getRunLimit());
                ACCESS = false;
            } else {
                System.out.println("Кот пробежал это препятствие");
            }
        }
    }

    @Override
    public void setJumpLimit(int limit) {
        JUMP_LIMIT = limit;
    }

    @Override
    public void setRunLimit(int limit) {
        RUN_LIMIT = limit;
    }

    @Override
    public int getJumpLimit() {
        return JUMP_LIMIT;
    }

    @Override
    public int getRunLimit() {
        return RUN_LIMIT;
    }
}
