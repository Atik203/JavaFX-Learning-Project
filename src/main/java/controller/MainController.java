package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class MainController {

    @FXML
    private Circle circle;
    private double x;
    private double y;

    public void up(ActionEvent e) {

        circle.setCenterY(y=y-10);

    }

    public void down(ActionEvent e) {

        circle.setCenterY(y=y+10);
    }

    public void left(ActionEvent e) {

        circle.setCenterX(x=x-10);
    }

    public void right(ActionEvent e) {

        circle.setCenterX(x=x+10);
    }

}
