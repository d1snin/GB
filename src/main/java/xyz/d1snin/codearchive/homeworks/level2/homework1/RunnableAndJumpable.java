package xyz.d1snin.codearchive.homeworks.level2.homework1;

public interface RunnableAndJumpable {
    void jump(Obstruction obs);
    void run(Obstruction obs);
    void setJumpLimit(int limit);
    void setRunLimit(int limit);
    int getJumpLimit();
    int getRunLimit();
}
