package sample.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.models.people.*;

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

    private PeopleBase peopleBase = new PeopleBase();

    public void initialize() {
        loginTableColumn.setCellValueFactory(new PropertyValueFactory<>("username"));
        roleTableColumn.setCellValueFactory(new PropertyValueFactory<>("rola"));

        createAccountButton.disableProperty().bind(loginTextField.textProperty().isEmpty().or(passwordTextField.textProperty().isEmpty()));
    }

    public void createAccount() {
        String login = loginTextField.getText();
        String password = passwordTextField.getText();
        if (adminToggle.isSelected()) {
            peopleBase.addToArray(new Admin(login, password));
        } else if(trenerToggle.isSelected()) {
            peopleBase.addToArray(new Trainer(login, password));
        } else if(userToggle.isSelected()) {
            peopleBase.addToArray(new CommonUser(login, password));
        }
        for (Person person : peopleBase.getArray()) {
            System.out.println(person.username);
        }
        roleTableView.setItems(getPeople());
    }

    public ObservableList<Person> getPeople() {
        ObservableList<Person> people = FXCollections.observableArrayList();
        people.addAll(peopleBase.getArray());
        return people;
    }
}
