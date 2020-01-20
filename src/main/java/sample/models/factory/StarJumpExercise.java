package sample.models.factory;

import sample.models.exercises.Exercise;
import sample.models.exercises.StarJump;

public class StarJumpExercise extends ExerciseList {

    @Override
    public Exercise createExercise() {
        return new StarJump();
    }

    @Override
    public void addToArrayList(Exercise exercise) {
        super.addToArrayList(exercise);
    }
}
