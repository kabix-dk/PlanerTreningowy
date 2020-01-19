package sample.controllers;

import javafx.fxml.FXML;
import sample.models.users.User;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class TopMenuButtonsController extends ChangeSceneController{
    private MainMenuController mainMenuController;

    @FXML
    public void LogoutButtonAction(javafx.event.ActionEvent actionEvent) throws IOException {
        User us = User.getUser();
        us.logOut();
        changeScene("/fxml/Logowanie.fxml", 350, 350, "Logowanie");
    }

    @FXML
    public void PlanBaseButtonAction(javafx.event.ActionEvent actionEvent) throws IOException {
        mainMenuController.setCenter("/fxml/PlanBase.fxml");
    }

    public void setMainMenuController(MainMenuController mainMenuController) {
        this.mainMenuController = mainMenuController;
    }
}
