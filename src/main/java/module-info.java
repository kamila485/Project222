module com.example.project2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires net.rgielen.fxweaver.core;
    requires spring.context;


    opens com.example.project2 to javafx.fxml;
    exports com.example.project2;
}