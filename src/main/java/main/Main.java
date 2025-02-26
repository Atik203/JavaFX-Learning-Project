package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {


//
//        Group root = new Group();
//        Scene scene = new Scene(root,700,700, Color.LIGHTGREEN);
//
//        Image icon = new Image("file:src/main/resources/images/planning.png");
//
//        Text text = new Text();
//        text.setText("Hello, JavaFX!");
//        text.setFont(Font.font("Verdana", 20));
//        text.setFill(Color.BLACK);
//        text.setX(40);
//        text.setY(100);
//
//        Line line = new Line();
//        line.setStartX(40);
//        line.setStartY(105);
//        line.setEndX(180);
//        line.setEndY(105);
//        line.setStrokeWidth(2);
//        line.setStroke(Color.BLACK);
//
//        Rectangle rectangle = new Rectangle();
//        rectangle.setX(50);
//        rectangle.setY(120);
//        rectangle.setWidth(100);
//        rectangle.setHeight(50);
//        rectangle.setFill(Color.BLUE);
//
//        Polygon traingle = new Polygon();
//        traingle.getPoints().addAll(new Double[]{
//                200.0, 200.0,
//                300.0, 200.0,
//                250.0, 100.0
//        });
//        traingle.setFill(Color.RED);
//
//        Circle circle = new Circle();
//        circle.setCenterX(250.0f);
//        circle.setCenterY(250.0f);
//        circle.setRadius(50.0f);
//        circle.setFill(Color.GREEN);
//
//        ImageView imageView = new ImageView(icon);
//        imageView.setX(200);
//        imageView.setY(300);
//
//
//
//        root.getChildren().add(imageView);
//        root.getChildren().add(circle);
//        root.getChildren().add(traingle);
//        root.getChildren().add(rectangle);
//        root.getChildren().add(line);
//        root.getChildren().add(text);
//
//        stage.setTitle("JavaFX Application");
//        stage.getIcons().add(icon);
//        stage.setScene(scene);
//        stage.show();


        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/root-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("JavaFX Application");

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}