package servicee;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/main.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        // scene.getStylesheets().add(getClass().getResource("/styles/main.css").toExternalForm());

        // For reuse of css

        String css = this.getClass().getResource("/styles/main.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setTitle("JavaFX Application");

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}