module org.example.javafxlearningproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens main to javafx.fxml;
    exports main;
    opens controller to javafx.fxml;
    exports controller;
}