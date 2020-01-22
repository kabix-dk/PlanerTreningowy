package sample.models.factory;

import sample.models.exercises.Exercise;
import sample.models.exercises.PullUp;

public class PullUpExercise extends ExerciseList {

    @Override
    public Exercise createExercise() {
        return new PullUp();
    }

    @Override
    public String toString() {
        return "PullUpExercise";
    }
}
