package xyz.d1snin.codearchive.homeworks.level2.homework1;

public abstract class Competitor implements Runner, Jumper {
    private final String name;
    private final int maxRunDistance;
    private final int maxJumpHeight;

    private boolean onDistance = true;

    public Competitor(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " перепрыгнул препятствие.");
        } else {
            System.out.println(name + " не смог перепрыгнуть препятствие и вылетел.");
            onDistance = false;
        }
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал дистанцию.");
        } else {
            System.out.println(name + " не смог пробежать дистанцию и вылетел.");
            onDistance = false;
        }
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    public void printInfo() {
        if (onDistance) {
            System.out.println(name + " прошел дистанцию.");
        } else {
            System.out.println(name + " не прошел дистанцию.");
        }
    }
}
