package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.models.users.User;
import sample.utils.FxmlUtils;

public class Main extends Application {

    public static final String BORDER_PANE_MAIN_FXML = "/fxml/BorderPaneMain.fxml";

    @Override
    public void start(Stage stage) throws Exception{

        Pane borderPane = FxmlUtils.fxmlLoader(BORDER_PANE_MAIN_FXML);
        Scene scene = new Scene(borderPane);
        scene.getStylesheets().add("css/StyleTemplate.css");
        stage.setScene(scene);
        stage.setTitle("Okno główne!");
        stage.show();

    }

    public static void main(String[] args) {
        User admin = new User("Kabix", "123");
        launch(args);
    }
}
