package sample.controllers;

import javafx.event.ActionEvent;
import sample.utils.ActualUser;
import sample.utils.DialogUtils;

public class TopMenuButtonsController {

    public static final String REGISTER_PANEL_FXML = "/fxml/RegisterPanel.fxml";
    public static final String PLAN_LIST_FXML = "/fxml/PlanList.fxml";
    public static final String EXERCISE_BASE_FXML = "/fxml/ExerciseBase.fxml";
    public static final String LOGIN_PANEL_FXML = "/fxml/LoginPanel.fxml";
    public static final String EDIT_PLAN_FXML = "/fxml/CustomizePlan.fxml";
    public static final String VIEW_EXERCISES_FXML = "/fxml/ViewExercises.fxml";
    private MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void showLoginPanel() {
        mainController.setCenter(LOGIN_PANEL_FXML);
    }

    public void showExerciseBase() {

        if(ActualUser.getUser().checkActualState()) mainController.setCenter(EXERCISE_BASE_FXML);
        else DialogUtils.dialogPermission();
    }

    public void showPlanList() {
        if(ActualUser.getUser().checkActualState()) mainController.setCenter(PLAN_LIST_FXML);
        else DialogUtils.dialogPermission();
    }

    public void showRegisterPanel() {
        if(ActualUser.getUser().checkActualState()) mainController.setCenter(REGISTER_PANEL_FXML);
        else DialogUtils.dialogPermission();
    }

    public void showEditPanel() {
        if(ActualUser.getUser().checkActualState()) mainController.setCenter(EDIT_PLAN_FXML);
        else DialogUtils.dialogPermission();
    }

    public void viewExercisesAction() {
        if(ActualUser.getUser().checkActualState()) mainController.setCenter(VIEW_EXERCISES_FXML);
        else DialogUtils.dialogPermission();
    }
}
