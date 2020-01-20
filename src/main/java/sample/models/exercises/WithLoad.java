package sample.models.exercises;

public class WithLoad extends Exercise{
    private Exercise exercise;
    String name="";

    public WithLoad(Exercise exercise, String load) {
        this.exercise = exercise;
        this.name=exercise.name + ": " + load;
    }

    public WithLoad(Endurance exercise, String load) {
        this.exercise = exercise;
        this.name=exercise.name + " powtórzeń, " + load;
    }

    @Override
    public String getName() {
        return name + " kg";
    }

    @Override
    public String toString() {
        return name;
    }
}
