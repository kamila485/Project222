package com.example.project2;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;


public class PopupFactory extends Stage {


    public Button button1;
    public Button button2;

    public Stage createWaitingPopup(String text){
        Stage stage = new Stage();

        VBox pane = new VBox ();
        Label label = new Label(text);

        stage.initStyle(StageStyle.UNDECORATED);
        Button button1 = new Button("NOWA GRA");
        Button button2 = new Button("ZAMKNIJ OKNO");


        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                button1.isCancelButton();
                button1.setCancelButton(true);
                stage.close();


                if (button1.isCancelButton()) {
                    button1.isPressed();


                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
                    Scene scene;
                    try {
                        scene = new Scene(fxmlLoader.load(), 340, 400);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }


                    stage.setTitle("ZAGRAJ!");
                    stage.setScene(scene);
                    stage.show();

                }

            }
        });




        button2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        button2.isCancelButton();
                        button2.setCancelButton(true);
                        stage.close();


                        if (button2.isCancelButton()) {
                            button2.isPressed();
                            button2.setCancelButton(true);
                            stage.close();
                            Platform.exit();


                        }

                    }
                });

         class ExitButtonListener implements EventHandler<ActionEvent> {

            @Override
            public void handle(ActionEvent arg0) {
                Platform.exit();
            }
        }


        pane.alignmentProperty().set(Pos.CENTER);
        pane.getChildren().addAll(label);
        pane.getChildren().addAll(button1, button2);
        pane.setSpacing(40);
        stage.setScene(new Scene(pane, 300, 200));

        stage.show();

        return stage;

    }
}
