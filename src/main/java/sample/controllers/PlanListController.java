package sample.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import sample.models.PlanBase;
import sample.models.TrainingPlan;

import java.util.List;

public class PlanListController {

    private MainController mainController;
    public Button deletePlanButton;
    @FXML
    private TreeItem<String> root = new TreeItem<>();
    @FXML
    private TreeView<String> treeView;
    @FXML
    private ComboBox<TrainingPlan> selectPlanComboBox;
    @FXML
    private TextField planNameTextField;
    private TrainingPlan selectedTrainingPlan;

    public void initialize() {
        initRoot(getPlans());
        this.treeView.setRoot(root);
        setSelectPlanComboBox();
    }

    public ObservableList<TrainingPlan> getPlans() {
        ObservableList<TrainingPlan> plans = FXCollections.observableArrayList();
        PlanBase planBase = PlanBase.getInstance();
        plans.addAll(planBase.getArray());
        return plans;
    }

    public void initRoot(List<TrainingPlan> plans) {
        this.root.getChildren().clear();
        plans.forEach(c -> {
            TreeItem<String> planItem = new TreeItem<>(c.getName());
            c.getTrainingPlan().forEach(b -> {
                planItem.getChildren().add(new TreeItem<>(b.getName()));
            });
            root.getChildren().add(planItem);
        });
    }

    public void ComboBoxAction() {
        this.selectedTrainingPlan =  this.selectPlanComboBox.getSelectionModel().getSelectedItem();
    }

    public void DeletePlanButtonAction () {
        PlanBase planBase = PlanBase.getInstance();
        planBase.delete(selectedTrainingPlan);
        ObservableList<TrainingPlan> plans = FXCollections.observableArrayList();
        plans.addAll(planBase.getArray());
        initRoot(plans);
        setSelectPlanComboBox();
    }

    public void AddPlanButtonAction() {
        String name = planNameTextField.getText();
        PlanBase planBase = PlanBase.getInstance();
        planBase.addToArray(new TrainingPlan(name));
        ObservableList<TrainingPlan> plans = FXCollections.observableArrayList();
        plans.addAll(planBase.getArray());
        initRoot(plans);
        setSelectPlanComboBox();
    }

    public void setSelectPlanComboBox() {
        this.selectPlanComboBox.setItems(getPlans());
    }


    public void EditPlanButtonAction() {

    }
}
