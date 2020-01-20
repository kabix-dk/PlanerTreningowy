package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.models.ExerciseBase;
import sample.models.exercises.*;
import sample.models.users.User;
import sample.utils.FxmlUtils;

public class Main extends Application {

    public static final String BORDER_PANE_MAIN_FXML = "/fxml/BorderPaneMain.fxml";

    @Override
    public void start(Stage stage) throws Exception{

        Pane borderPane = FxmlUtils.fxmlLoader(BORDER_PANE_MAIN_FXML);
        Scene scene = new Scene(borderPane);
        scene.getStylesheets().add("css/StyleTemplate.css");
        stage.setScene(scene);
        stage.setTitle("Okno główne!");
        stage.show();

    }

    public static void main(String[] args) {
        addExercisesToBase();
        User admin = new User("Kabix", "123");
        launch(args);
    }

    public static void addExercisesToBase() {
        ExerciseBase exerciseBase = ExerciseBase.getInstance();
        exerciseBase.addToArray(new PushUp());
        exerciseBase.addToArray(new Squat());
        exerciseBase.addToArray(new SitUp());
        exerciseBase.addToArray(new PullUp());
        exerciseBase.addToArray(new StarJump());
    }
}
