package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {


    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    TextField nameTextField;

    public void login(ActionEvent event) throws IOException {
        String name = nameTextField.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/scene1.fxml"));
        root = loader.load();

        Scene1Controller controller = loader.getController();
        controller.displayName(name);

        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
