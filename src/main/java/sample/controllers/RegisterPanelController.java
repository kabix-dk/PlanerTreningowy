package sample.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.models.people.*;
import sample.models.users.User;
import sample.utils.ActualUser;

public class RegisterPanelController {
    @FXML
    public javafx.scene.control.TextField loginTextField;
    public Button createAccountButton;
    public PasswordField passwordTextField;
    public RadioButton adminToggle;
    public RadioButton trenerToggle;
    public RadioButton userToggle;
    public TableView<Person> roleTableView;
    public TableColumn<Person, String> loginTableColumn;
    public TableColumn<Person, String> roleTableColumn;

    public void initialize() {
        roleTableView.setItems(getPeople());
        loginTableColumn.setCellValueFactory(new PropertyValueFactory<>("username"));
        roleTableColumn.setCellValueFactory(new PropertyValueFactory<>("rola"));

        createAccountButton.disableProperty().bind(loginTextField.textProperty().isEmpty().or(passwordTextField.textProperty().isEmpty()));
    }

    public void createAccount() {
        String login = loginTextField.getText();
        String password = passwordTextField.getText();
        Person person;
        if (adminToggle.isSelected()) {
            person = new Admin(login, password);
            addToBase(login, password, person);
        } else if(trenerToggle.isSelected()) {
            person = new Trainer(login, password);
            addToBase(login, password, person);
        } else if(userToggle.isSelected()) {
            person = new CommonUser(login, password);
            addToBase(login, password, person);
        }
        roleTableView.setItems(getPeople());
        loginTextField.clear();
        passwordTextField.clear();
    }

    private void addToBase(String login, String password, Person person) {
        ActualUser.getPeopleBase().addToArray(person);
        ActualUser.addUserToBase(new User(login, password, person));
    }

    public ObservableList<Person> getPeople() {
        ObservableList<Person> people = FXCollections.observableArrayList();
        people.addAll(ActualUser.getPeopleBase().getArray());
        return people;
    }
}
