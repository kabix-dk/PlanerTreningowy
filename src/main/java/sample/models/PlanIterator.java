package sample.models;

public class PlanIterator<Exercise extends sample.models.exercises.Exercise> extends Iterator {
    private PlanBase planBase = PlanBase.getInstance();
    private TrainingPlan currentTrainingPlan;
    private Exercise currentExercise;
    private int exerciseIndex = 0;
    private int planIndex = 0;

    public PlanIterator() {
        currentTrainingPlan = planBase.getArray().get(planIndex);
        currentExercise = (Exercise) currentTrainingPlan.getExercise(exerciseIndex);
    }

    public Exercise First() {
        return (Exercise) planBase.getArray().get(0).getExercise(0);
    }

    public Exercise Next() {
        if (!isDone(currentExercise)) {
            currentExercise = (Exercise) currentTrainingPlan.getExercise(++exerciseIndex);
        } else {
            if (!isDone(currentTrainingPlan)) {
                currentTrainingPlan = planBase.getArray().get(++planIndex);
                exerciseIndex = 0;
                currentExercise = (Exercise) currentTrainingPlan.getExercise(exerciseIndex);
            } else {
                planIndex = 0;
                exerciseIndex = 0;
                currentTrainingPlan = planBase.getArray().get(planIndex);
                currentExercise = this.First();
            }
        }
        return currentExercise;
    }

    public boolean isDone(TrainingPlan trainingPlan) {
        if(trainingPlan.equals(planBase.getArray().get(planBase.getSize()-1))) return true;
        else return false;
    }

    public boolean isDone(Exercise exercise) {
        if(exercise.equals(currentTrainingPlan.getExercise(currentTrainingPlan.getSize()-1))) return true;
        else return false;
    }

    public Exercise Previous() {
        if(exerciseIndex == 0) {
            if(planIndex == 0) {
                planIndex = planBase.getSize()-1;
                currentTrainingPlan = planBase.getArray().get(planIndex);
            } else {
                currentTrainingPlan = planBase.getArray().get(--planIndex);
            }
            exerciseIndex = currentTrainingPlan.getSize()-1;
            currentExercise = (Exercise) currentTrainingPlan.getExercise(exerciseIndex);
        } else {
            currentExercise = (Exercise) currentTrainingPlan.getExercise(--exerciseIndex);
        }
        return currentExercise;
    }
}
