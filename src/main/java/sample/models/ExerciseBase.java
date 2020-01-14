package sample.models;

import sample.models.exercises.Exercise;

import java.util.ArrayList;

public class ExerciseBase {

    private ExerciseBase(){}
    private static ExerciseBase exerciseBase = new ExerciseBase();
    private ArrayList<Exercise> exerciseList = new ArrayList<Exercise>();
    public static ExerciseBase getInstance() { return exerciseBase; }
    public ArrayList<Exercise> getArray() { return exerciseList; }
    public void addToArray(Exercise exercise) { exerciseList.add(exercise); }
}
