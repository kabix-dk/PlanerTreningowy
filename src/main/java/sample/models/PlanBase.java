package sample.models;

import sample.models.factory.ExerciseList;

import java.util.ArrayList;

public class PlanBase {
    private ArrayList<ExerciseList> planBase;

    public ArrayList<ExerciseList> getPlanBase() {
        return planBase;
    }
    public void addPlan(ExerciseList exerciseList) {
        planBase.add(exerciseList);
    }
    public void deletePlan(ExerciseList exerciseList) {
        planBase.remove(exerciseList);
    }
    public ExerciseList getPlan(int index) {
        return planBase.get(index);
    }
    public void createIterator() {

    }
}
