package sample.utils;

import javafx.scene.control.Alert;

public class DialogUtils {

    public static void dialogLoginSuccess() {
        Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);
        informationAlert.setTitle("Sukces!");
        informationAlert.setHeaderText("ZALOGOWANO");
        informationAlert.setContentText("Udało Ci się zalogować!");
        informationAlert.showAndWait();
    }

    public static void dialogLogoutSuccess() {
        Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);
        informationAlert.setTitle("Sukces!");
        informationAlert.setHeaderText("WYLOGOWANO");
        informationAlert.setContentText("Udało Ci się wylogować!");
        informationAlert.showAndWait();
    }

    public static void dialogLogin() {
        Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);
        informationAlert.setTitle("Błąd!");
        informationAlert.setHeaderText("ZALOGOWANY");
        informationAlert.setContentText("Jesteś już zalogowany!");
        informationAlert.showAndWait();
    }

    public static void dialogLogout() {
        Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);
        informationAlert.setTitle("Błąd!");
        informationAlert.setHeaderText("WYLOGOWANY");
        informationAlert.setContentText("Nie jesteś zalogowany!");
        informationAlert.showAndWait();
    }

    public static void dialogPermission() {
        Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);
        informationAlert.setTitle("Błąd!");
        informationAlert.setHeaderText("BRAK DOSTĘPU");
        informationAlert.setContentText("Nie masz odpowiednich uprawnień!");
        informationAlert.showAndWait();
    }
}
