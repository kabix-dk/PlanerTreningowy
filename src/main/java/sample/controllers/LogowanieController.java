package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import sample.models.users.User;

import java.awt.*;

public class LogowanieController {

    @FXML
    public javafx.scene.control.TextField login_textfield;
    @FXML
    public javafx.scene.control.TextField haslo_textfield;

    User us = User.getUser();

    public void zaloguj(ActionEvent actionEvent) {
        String login = login_textfield.getText();
        String haslo = haslo_textfield.getText();
        if(login.equals(us.getLogin()) && haslo.equals(us.getHaslo())) {
            us.logIn();
        } else {
            System.out.println("Wrong!");
        }
    }

    public void wyloguj(ActionEvent actionEvent) {
        us.logOut();
    }
}
