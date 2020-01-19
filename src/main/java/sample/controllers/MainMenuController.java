package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class MainMenuController {
    @FXML
    private BorderPane borderPane;

    @FXML
    private TopMenuButtonsController topMenuButtonsController;

    @FXML
    private void initialize() {
        topMenuButtonsController.setMainMenuController(this);
    }

    public void setCenter(String path) throws IOException {
        borderPane.setCenter(FXMLLoader.load(getClass().getResource(path)));
    }
}
