module org.example.javafxlearningproject {
    requires javafx.controls;
    requires javafx.fxml;



    opens controller to javafx.fxml;
    exports controller;
    exports servicee;
    opens servicee to javafx.fxml;
}