package sample.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.models.PlanBase;
import sample.models.TrainingPlan;

import java.util.List;

public class PlanListController {

    @FXML
    private TreeItem<String> root = new TreeItem<>();
    @FXML
    private TreeView<String> treeView;

    public void initialize() {
        initRoot(getPlans());
        this.treeView.setRoot(root);
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
}
