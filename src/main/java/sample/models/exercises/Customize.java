package sample.models.exercises;

public abstract class Customize extends Exercise{
    private Exercise exercise;

    public Customize(Exercise exercise) {
        this.exercise = exercise;
    }
}
