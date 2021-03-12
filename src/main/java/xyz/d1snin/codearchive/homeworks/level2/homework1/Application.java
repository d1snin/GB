package xyz.d1snin.codearchive.homeworks.level2.homework1;

public class Application {
    public static void main(String[] args) {
        RunnableAndJumpable[] runnableAndJumpables = {
                new Robot(15, 10),
                new Cat(12, 40),
                new Human(10, 50)
        };
        Obstruction[] obstructions = {
                new Treadmill(20),
                new Wall(12),
                new Wall(20),
                new Treadmill(10),
                new Treadmill(16)
        };

        for (int j = 0; j < runnableAndJumpables.length; j++) {
            for (int i = 0; i < obstructions.length; i++) {
                runnableAndJumpables[j].run(obstructions[i]);
                runnableAndJumpables[j].jump(obstructions[i]);
            }
        }
    }
}
