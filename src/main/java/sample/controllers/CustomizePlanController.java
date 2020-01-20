package sample.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import sample.models.ExerciseBase;
import sample.models.PlanBase;
import sample.models.TrainingPlan;
import sample.models.exercises.Exercise;

public class CustomizePlanController {

    @FXML
    public ComboBox<TrainingPlan> selectPlanComboBox;
    @FXML
    public TableView<Exercise> selectedPlanTableView;
    @FXML
    public TableColumn<Exercise, String> planExercises;
    private TrainingPlan selectedTrainingPlan;
    @FXML
    private TableView<Exercise> exerciseTableView;
    @FXML
    private TableColumn<Exercise, String> baseExercises;

    private Exercise selectedExercise;

    public void initialize() {
        baseExercises.setCellValueFactory(new PropertyValueFactory<>("name"));
        exerciseTableView.setItems(getExercises());
        setSelectPlanComboBox();
    }

    public void ComboBoxAction() {
        this.selectedTrainingPlan =  this.selectPlanComboBox.getSelectionModel().getSelectedItem();
        planExercises.setCellValueFactory(new PropertyValueFactory<>("name"));
        selectedPlanTableView.setItems(getSelectedPlanExercises());
    }

    public ObservableList<Exercise> getSelectedPlanExercises() {
        ObservableList<Exercise> exercises = FXCollections.observableArrayList();
        exercises.addAll(selectedTrainingPlan.getTrainingPlan());
        return exercises;
    }

    public ObservableList<TrainingPlan> getPlans() {
        ObservableList<TrainingPlan> plans = FXCollections.observableArrayList();
        PlanBase planBase = PlanBase.getInstance();
        plans.addAll(planBase.getArray());
        return plans;
    }

    public void setSelectPlanComboBox() {
        this.selectPlanComboBox.setItems(getPlans());
    }

    public ObservableList<Exercise> getExercises() {
        ObservableList<Exercise> exercises = FXCollections.observableArrayList();
        ExerciseBase exerciseBase = ExerciseBase.getInstance();
        exercises.addAll(exerciseBase.getArray());
        return exercises;
    }

    public void AddExerciseToPlan() {
        selectedExercise = exerciseTableView.getSelectionModel().getSelectedItem();
        selectedTrainingPlan.addToArray(selectedExercise);
        ComboBoxAction();
    }

    public void DeleteExerciseFromPlan() {
        selectedExercise = selectedPlanTableView.getSelectionModel().getSelectedItem();
        selectedTrainingPlan.removeFromArray(selectedExercise);
        ComboBoxAction();
    }
}
