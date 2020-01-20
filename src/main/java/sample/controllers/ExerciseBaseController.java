package sample.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.models.ExerciseBase;
import sample.models.exercises.Exercise;

public class ExerciseBaseController {
    @FXML
    private TableView<Exercise> exerciseTableView;
    @FXML
    private TableColumn<Exercise, String> exerciseColumn;

    public void initialize() {
        exerciseColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        exerciseTableView.setItems(getExercises());
    }

    public ObservableList<Exercise> getExercises() {
        ObservableList<Exercise> exercises = FXCollections.observableArrayList();
        ExerciseBase exerciseBase = ExerciseBase.getInstance();
        exercises.addAll(exerciseBase.getArray());
        return exercises;
    }
}
