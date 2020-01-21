package sample.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.models.ExerciseBase;
import sample.models.PlanBase;
import sample.models.TrainingPlan;
import sample.models.exercises.*;

public class CustomizePlanController {

    @FXML
    private ComboBox<TrainingPlan> selectPlanComboBox;
    @FXML
    private TableView<Exercise> exerciseBaseTableView;
    @FXML
    private TableColumn<Exercise, String> baseExercises;
    @FXML
    private TableView<Exercise> selectedPlanTableView;
    @FXML
    private TableColumn<Exercise, String> planExercises;
    @FXML
    private TextField loadTextField;
    @FXML
    private TextField repetitionsTextField;

    private TrainingPlan selectedTrainingPlan;
    private Exercise selectedExercise;


    public void initialize() {
        baseExercises.setCellValueFactory(new PropertyValueFactory<>("name"));
        exerciseBaseTableView.setItems(getExercises());
        setSelectPlanComboBox();
    }

    public void comboBoxAction() {
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

    public void addExerciseToPlan() {
        selectedExercise = exerciseBaseTableView.getSelectionModel().getSelectedItem();
        String loadAmount="";
        String repetitionsAmount="";
        Exercise exercise;
        if((repetitionsTextField.getText() != null || repetitionsTextField.getText().trim().isEmpty()) && Float.parseFloat(repetitionsTextField.getText()) > 0)
        {
            repetitionsAmount = repetitionsTextField.getText();
        }
        if((loadTextField.getText() != null || loadTextField.getText().trim().isEmpty()) && Integer.parseInt(loadTextField.getText()) > 0)
        {
            loadAmount = loadTextField.getText();
        }
        if(loadAmount.equalsIgnoreCase("") && repetitionsAmount.equalsIgnoreCase("")) exercise = selectedExercise;
        else if (loadAmount.equalsIgnoreCase("") && !repetitionsAmount.equalsIgnoreCase("")) exercise = new Endurance(selectedExercise, repetitionsAmount);
        else if (!loadAmount.equalsIgnoreCase("") && repetitionsAmount.equalsIgnoreCase("")) exercise = new WithLoad(selectedExercise, loadAmount);
        else exercise = new WithLoad(new Endurance(selectedExercise, repetitionsAmount), loadAmount);
        selectedTrainingPlan.addToArray(exercise);
        comboBoxAction();
    }

    public void deleteExerciseFromPlan() {
        selectedExercise = selectedPlanTableView.getSelectionModel().getSelectedItem();
        selectedTrainingPlan.removeFromArray(selectedExercise);
        comboBoxAction();
    }
}
