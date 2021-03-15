package xyz.d1snin.codearchive.homeworks.level2.homework1;

public abstract class UnhumanCompetitor extends Competitor {
    public UnhumanCompetitor(String classifier, String name, int maxRunDistance, int maxJumpHeight) {
        super(classifier + " " + name, maxRunDistance, maxJumpHeight);
    }
}
