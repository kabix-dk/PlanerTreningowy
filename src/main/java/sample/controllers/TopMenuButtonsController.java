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
        getPermission(ActualUser.getUser().getPerson().showExerciseBase(), EXERCISE_BASE_FXML);
    }

    public void showPlanList() {
        getPermission(ActualUser.getUser().getPerson().showPlanList(), PLAN_LIST_FXML);
    }

    public void showRegisterPanel() {
        getPermission(ActualUser.getUser().getPerson().showRegisterPanel(), REGISTER_PANEL_FXML);
    }

    public void showEditPanel() {
        getPermission(ActualUser.getUser().getPerson().showEditPanel(), EDIT_PLAN_FXML);
    }

    public void viewExercisesAction() {
        getPermission(ActualUser.getUser().getPerson().viewExercisesAction(), VIEW_EXERCISES_FXML);
    }

    private void getPermission(boolean b, String fxmlPath) {
        if (ActualUser.getUser().checkActualState()) {
            if (b) mainController.setCenter(fxmlPath);
            else DialogUtils.dialogPermission();
        } else DialogUtils.dialogPermission();
    }
}
