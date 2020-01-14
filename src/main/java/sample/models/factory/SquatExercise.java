package sample.models.factory;

import sample.models.exercises.Exercise;
import sample.models.exercises.Squat;

public class SquatExercise extends ExerciseList {

    @Override
    public Exercise createExercise() {
        return new Squat();
    }

    @Override
    public String toString() {
        return "SquatExercise";
    }
}
