package sample.models.factory;

import sample.models.exercises.Exercise;
import sample.models.exercises.PushUp;

public class PushUpExercise extends ExerciseList {

    @Override
    public Exercise createExercise() {
        return new PushUp();
    }

    @Override
    public String toString() {
        return "PushUpExercise";
    }
}
