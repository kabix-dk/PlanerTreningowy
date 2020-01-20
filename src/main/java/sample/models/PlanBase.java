package sample.models;

import java.util.ArrayList;

public class PlanBase {

    private PlanBase(){}
    private static PlanBase planBase = new PlanBase();
    private ArrayList<TrainingPlan> planList = new ArrayList<TrainingPlan>();
    public static PlanBase getInstance() { return planBase; }
    public ArrayList<TrainingPlan> getArray() { return planList; }
    public void addToArray(TrainingPlan trainingPlan) { planList.add(trainingPlan); }
    public void delete(TrainingPlan trainingPlan) {planList.remove(trainingPlan);}
}
