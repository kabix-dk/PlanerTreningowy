package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import sample.models.users.User;
import javafx.scene.control.Button;
import sample.utils.ActualUser;

import java.util.ArrayList;

public class LoginController {

    @FXML
    public javafx.scene.control.TextField login_textfield;
    @FXML
    public PasswordField haslo_textfield;
    @FXML
    private Button zaloguj_button;
    @FXML
    private Button wyloguj_button;

    public void initialize() {
        zaloguj_button.disableProperty().bind(login_textfield.textProperty().isEmpty().or(haslo_textfield.textProperty().isEmpty()));
    }

    public void zaloguj() {
        String login = login_textfield.getText();
        String haslo = haslo_textfield.getText();
        ArrayList<User> listOfUsers = ActualUser.getUsers();
        for (User us: listOfUsers) {
            System.out.println(us.toString());
            if(us.getHaslo().equals(haslo) && us.getLogin().equals(login)) {
                ActualUser.setUser(us);
            }
        }
        if(login.equals(ActualUser.getUser().getLogin()) && haslo.equals(ActualUser.getUser().getHaslo())) {
            ActualUser.getUser().logIn();
        } else {
            System.out.println("Wrong!");
        }
        haslo_textfield.clear();
        login_textfield.clear();
    }

    public void wyloguj() {
        ActualUser.getUser().logOut();
    }

}
