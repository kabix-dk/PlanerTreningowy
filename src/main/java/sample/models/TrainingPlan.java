package sample.models;

import sample.models.exercises.Exercise;

import java.util.ArrayList;

public class TrainingPlan {
    String name;

    public TrainingPlan(String name) {
        this.name=name;
    }

    public ArrayList<Exercise> trainingPlan = new ArrayList<Exercise>();

    public void addToArray(Exercise exercise) {
        trainingPlan.add(exercise);
    }

    public ArrayList<Exercise> getTrainingPlan() {
        return trainingPlan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void removeFromArray(Exercise exercise) {trainingPlan.remove(exercise);}

    public Exercise getExercise(int index) {
        return this.trainingPlan.get(index);
    }

    public int getSize() {
        return trainingPlan.size();
    }

    @Override
    public String toString() {
        return name;
    }

}
