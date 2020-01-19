package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sample.Main;
import sample.models.users.User;

import java.io.IOException;

public class MainMenuController extends ChangeSceneController {
    @FXML
    private BorderPane borderPane;

    public void LogoutButtonAction(javafx.event.ActionEvent actionEvent) throws IOException {
        System.out.println("Przejscie do menu logowania");
        User us = User.getUser();
        us.logOut();
        changeScene("/fxml/Logowanie.fxml", 350, 350, "Logowanie");
    }

    public void PlanBaseButtonAction(javafx.event.ActionEvent actionEvent) throws IOException {
        System.out.println("Przejscie do bazy planów");
        borderPane.setCenter(FXMLLoader.load(getClass().getResource("/fxml/PlanBase.fxml")));
    }
}
