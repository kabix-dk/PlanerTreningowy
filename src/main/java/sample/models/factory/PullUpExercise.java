package sample.models.factory;

import sample.models.exercises.Exercise;
import sample.models.exercises.PullUp;

public class PullUpExercise extends ExerciseList {

    @Override
    public Exercise createExercise() {
        return new PullUp();
    }

    @Override
    public void addToArrayList(Exercise exercise) {
        super.addToArrayList(exercise);
    }
}
