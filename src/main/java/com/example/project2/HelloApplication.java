package com.example.project2;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;


public class HelloApplication extends Application {


    @Override
    public void start( Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 340, 400);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("ZAGRAJ!");
        primaryStage.setScene(scene);
        primaryStage.show();



    }



    public static void main(String[] args) {
        launch();

    }

}