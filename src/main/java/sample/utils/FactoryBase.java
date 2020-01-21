package sample.utils;

import sample.models.exercises.Exercise;
import sample.models.factory.*;

public class FactoryBase {

    private static ExerciseList pullUpFactory = new PullUpExercise();
    private static ExerciseList pushUpFactory = new PushUpExercise();
    private static ExerciseList sitUpFactory = new SitUpExercise();
    private static ExerciseList squatFactory = new SquatExercise();
    private static ExerciseList starJumpFactory = new StarJumpExercise();

    public static ExerciseList getPullUpFactory() {
        return pullUpFactory;
    }

    public static ExerciseList getPushUpFactory() {
        return pushUpFactory;
    }

    public static ExerciseList getSitUpFactory() {
        return sitUpFactory;
    }

    public static ExerciseList getSquatFactory() {
        return squatFactory;
    }

    public static ExerciseList getStarJumpFactory() {
        return starJumpFactory;
    }
}
