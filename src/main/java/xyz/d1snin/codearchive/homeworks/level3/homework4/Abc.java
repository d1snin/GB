package xyz.d1snin.codearchive.homeworks.level3.homework4;

public class Abc {

    private static volatile char current = 'A';
    private static final Object mon = new Object();

    public static void main(String[] args) {

        new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (mon) {
                        while (current != 'A') mon.wait();
                        System.out.print('A');
                        current = 'B';
                        mon.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (mon) {
                        while (current != 'B') mon.wait();
                        System.out.print('B');
                        current = 'C';
                        mon.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (mon) {
                        while (current != 'C') mon.wait();
                        System.out.print('C');
                        current = 'A';
                        mon.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
