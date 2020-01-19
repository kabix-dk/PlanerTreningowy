package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.Main;
import sample.models.users.User;

import java.awt.*;
import java.io.IOException;

public class LogowanieController {

    @FXML
    public javafx.scene.control.TextField login_textfield;
    @FXML
    public javafx.scene.control.TextField haslo_textfield;

    User us = User.getUser();

    public void zaloguj(ActionEvent actionEvent) throws IOException {
        String login = login_textfield.getText();
        String haslo = haslo_textfield.getText();
        if(login.equals(us.getLogin()) && haslo.equals(us.getHaslo())) {
            us.logIn();
            Parent window1;
            window1 = FXMLLoader.load(getClass().getResource("/fxml/MainMenu.fxml"));
            Stage mainStage;
            mainStage = Main.parentWindow;
            mainStage.setWidth(800);
            mainStage.setHeight(600);
            mainStage.getScene().setRoot(window1);
        } else {
            System.out.println("Wrong!");
        }
    }

    public void wyloguj(ActionEvent actionEvent) {
        us.logOut();
    }
}
