package sample.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.models.PlanBase;
import sample.models.TrainingPlan;

public class PlanListController {
    @FXML
    private TableView<TrainingPlan> planTableView;
    @FXML
    private TableColumn<TrainingPlan, String> planColumn;

    public void initialize() {
        planColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        planTableView.setItems(getPlans());
    }

    public ObservableList<TrainingPlan> getPlans() {
        ObservableList<TrainingPlan> plans = FXCollections.observableArrayList();
        PlanBase planBase = PlanBase.getInstance();
        plans.addAll(planBase.getArray());
        return plans;
    }
}
