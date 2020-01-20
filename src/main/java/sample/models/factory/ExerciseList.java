package sample.models.factory;

import sample.models.exercises.Exercise;

import java.util.ArrayList;

public abstract class ExerciseList {
    public ArrayList<Exercise> exerciseList;

    public abstract Exercise createExercise();

    public void addToArrayList(Exercise exercise) {
        exerciseList.add(exercise);
    }
}
