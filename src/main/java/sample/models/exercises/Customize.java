package sample.models.exercises;

public abstract class Customize extends Exercise{
    private Exercise exercise;
    String name="";

    public Customize(Exercise exercise) {
        this.exercise = exercise;
    }
    @Override
    public String getName() {
        return exercise.getName();
    }
}
