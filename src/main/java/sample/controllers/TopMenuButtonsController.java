package sample.controllers;

public class TopMenuButtonsController {

    public static final String PLAN_LIST_FXML = "/fxml/PlanList.fxml";
    public static final String EXERCISE_BASE_FXML = "/fxml/ExerciseBase.fxml";
    public static final String LOGIN_PANEL_FXML = "/fxml/LoginPanel.fxml";
    private MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void showLoginPanel() {
        mainController.setCenter(LOGIN_PANEL_FXML);
    }

    public void showExerciseBase() {
        mainController.setCenter(EXERCISE_BASE_FXML);
    }

    public void showPlanList() {
        mainController.setCenter(PLAN_LIST_FXML);
    }
}
