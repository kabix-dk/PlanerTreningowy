package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.models.exercises.Exercise;
import sample.models.factory.ExerciseList;
import sample.models.factory.SitUpExercise;
import sample.models.users.User;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Logowanie.fxml"));
        primaryStage.setTitle("Logowanie");
        Scene scene = new Scene(root, 350, 350);
        scene.getStylesheets().add("css/Logowanie.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        User admin = new User("Kabix", "123");
        launch(args);
    }
}
