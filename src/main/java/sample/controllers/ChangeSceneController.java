package sample.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;

public class ChangeSceneController {

    public void changeScene(String path, int height, int width, String sceneName) throws IOException {
        Parent window1;
        window1 = FXMLLoader.load(getClass().getResource(path));
        Stage mainStage;
        mainStage = Main.parentWindow;
        mainStage.setWidth(width);
        mainStage.setHeight(height);
        mainStage.setTitle(sceneName);
        mainStage.getScene().setRoot(window1);
    }
}
