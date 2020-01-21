package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.models.ExerciseBase;
import sample.models.PlanBase;
import sample.models.TrainingPlan;
import sample.models.exercises.*;
import sample.models.factory.*;
import sample.models.users.User;
import sample.utils.FactoryBase;
import sample.utils.FxmlUtils;

public class Main extends Application {

    public static final String BORDER_PANE_MAIN_FXML = "/fxml/BorderPaneMain.fxml";

    @Override
    public void start(Stage stage){
        Pane borderPane = FxmlUtils.fxmlLoader(BORDER_PANE_MAIN_FXML);
        Scene scene = new Scene(borderPane);
        scene.getStylesheets().add("css/StyleTemplate.css");
        stage.setScene(scene);
        stage.setTitle("Okno główne!");
        stage.show();
    }

    public static void main(String[] args) {
        addExercisesToBase();
        addPlanToBase();
        launch(args);
    }

    public static void addExercisesToBase() {
        ExerciseBase exerciseBase = ExerciseBase.getInstance();
        exerciseBase.addToArray(FactoryBase.getPushUpFactory().createExercise());
        exerciseBase.addToArray(FactoryBase.getPullUpFactory().createExercise());
        exerciseBase.addToArray(FactoryBase.getSitUpFactory().createExercise());
        exerciseBase.addToArray(FactoryBase.getSquatFactory().createExercise());
        exerciseBase.addToArray(FactoryBase.getStarJumpFactory().createExercise());
    }

    public static void addPlanToBase() {
        PlanBase planBase = PlanBase.getInstance();
        TrainingPlan firstTrainingPlan = new TrainingPlan("Trening nóg");
        firstTrainingPlan.addToArray(FactoryBase.getSquatFactory().createExercise());
        firstTrainingPlan.addToArray(FactoryBase.getStarJumpFactory().createExercise());
        planBase.addToArray(firstTrainingPlan);
        TrainingPlan secondTrainingPlan = new TrainingPlan("Trening góry");
        secondTrainingPlan.addToArray(FactoryBase.getSitUpFactory().createExercise());
        secondTrainingPlan.addToArray(FactoryBase.getPullUpFactory().createExercise());
        secondTrainingPlan.addToArray(FactoryBase.getPushUpFactory().createExercise());
        planBase.addToArray(secondTrainingPlan);
    }
}
