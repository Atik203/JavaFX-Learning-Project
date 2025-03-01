package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Scene1Controller {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToMain(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/main.fxml")));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

    }

    public void switchToScene1(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/scene1.fxml")));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}