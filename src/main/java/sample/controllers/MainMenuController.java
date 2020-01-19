package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sample.Main;
import sample.models.users.User;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class MainMenuController {
    @FXML
    private BorderPane borderPane;

    public void LogoutButtonAction(javafx.event.ActionEvent actionEvent) throws IOException {
        System.out.println("Przejscie do menu logowania");
        User us = User.getUser();
        us.logOut();
        Parent window1;
        window1 = FXMLLoader.load(getClass().getResource("/fxml/Logowanie.fxml"));
        Stage mainStage;
        mainStage = Main.parentWindow;
        mainStage.setWidth(350);
        mainStage.setHeight(350);
        mainStage.getScene().setRoot(window1);
    }

    public void PlanBaseButtonAction(javafx.event.ActionEvent actionEvent) throws IOException {
        System.out.println("Przejscie do bazy planów");
        borderPane.setCenter(FXMLLoader.load(getClass().getResource("/fxml/PlanBase.fxml")));
    }
}
