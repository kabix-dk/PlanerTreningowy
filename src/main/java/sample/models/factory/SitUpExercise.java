package sample.models.factory;

import sample.models.exercises.Exercise;
import sample.models.exercises.SitUp;

public class SitUpExercise extends ExerciseList {

    @Override
    public Exercise createExercise() {
        return new SitUp();
    }

    @Override
    public String toString() {
        return "SitUpExercise";
    }
}
