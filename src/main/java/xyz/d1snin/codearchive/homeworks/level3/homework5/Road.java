package xyz.d1snin.codearchive.homeworks.level3.homework5;

public class Road extends Stage {

    public Road(int length) {
        this.length = length;
        this.description = "Дорога " + length + " метров";
    }

    @Override
    public void go(Car c) {
        try {
            MainClass.log(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
            MainClass.log(c.getName() + " закончил этап: " + description);
            MainClass.cdl1.countDown();
            if (isLastStage && !winnerFounded) {
                winnerFounded = true;
                MainClass.log("WIN - " + c.getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
