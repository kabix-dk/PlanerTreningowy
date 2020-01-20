package sample.models.exercises;

public class Endurance extends Exercise{
    private Exercise exercise;
    String name="";

    public Endurance(Exercise exercise, String repetitions) {
        this.exercise = exercise;
        this.name=exercise.name + ": " + repetitions;
    }

    @Override
    public String getName() {
        return name + " powtórzeń";
    }

    @Override
    public String toString() {
        return name;
    }
}
