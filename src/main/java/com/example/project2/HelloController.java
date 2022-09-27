package com.example.project2;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    final static String strX = "X";
    final static String strO = "O";

    boolean xWasLastSelect = true;
    boolean won1 = true;
    boolean won2 = true;
    boolean won3 = true;
    boolean won4 = true;
    boolean won5 = true;
    boolean won6 = true;
    boolean won7 = true;
    boolean won8 = true;
    boolean draw = true;


    private PopupFactory popupFactory;

    @FXML
    private Button press1;

    @FXML
    private Button press2;

    @FXML
    private Button press3;

    @FXML
    private Button press4;

    @FXML
    private Button press5;

    @FXML
    private Button press6;

    @FXML
    private Button press7;

    @FXML
    private Button press8;

    @FXML
    private Button press9;


    public HelloController() {
        popupFactory = new PopupFactory();

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initializePress1Button();
        initializePress2Button();
        initializePress3Button();
        initializePress4Button();
        initializePress5Button();
        initializePress6Button();
        initializePress7Button();
        initializePress8Button();
        initializePress9Button();


    }



    public void winAuthentication() {


        won1 = press1.getText().equals(press2.getText()) && press2.getText().equals(press3.getText()) && press1.getText().equals(press3.getText()) && (!press1.getText().equals(""));
        won2 = press1.getText().equals(press4.getText()) && press1.getText().equals(press7.getText()) && press4.getText().equals(press7.getText()) && (!press1.getText().equals(""));
        won3 = press4.getText().equals(press5.getText()) && press4.getText().equals(press6.getText()) && press5.getText().equals(press6.getText()) && (!press5.getText().equals(""));
        won4 = press2.getText().equals(press5.getText()) && press2.getText().equals(press8.getText()) && press5.getText().equals(press8.getText()) && (!press5.getText().equals(""));
        won5 = press3.getText().equals(press6.getText()) && press3.getText().equals(press9.getText()) && press6.getText().equals(press9.getText()) && (!press3.getText().equals(""));
        won6 = press7.getText().equals(press8.getText()) && press7.getText().equals(press9.getText()) && press8.getText().equals(press9.getText()) && (!press7.getText().equals(""));
        won7 = press9.getText().equals(press5.getText()) && press9.getText().equals(press1.getText()) && press1.getText().equals(press5.getText()) && (!press1.getText().equals(""));
        won8 = press5.getText().equals(press7.getText()) && press5.getText().equals(press3.getText()) && press3.getText().equals(press7.getText()) && (!press3.getText().equals(""));
        draw = press1.isDisabled() && press2.isDisabled() && press3.isDisabled() && press4.isDisabled() && press5.isDisabled() && press6.isDisabled() && press7.isDisabled() && press8.isDisabled() && press9.isDisabled();


        if (won1) {
            Stage waitingPopup = popupFactory.createWaitingPopup("WYGRAŁEŚ! :) ");
            waitingPopup.show();
        } else if (won2) {
            Stage waitingPopup = popupFactory.createWaitingPopup("WYGRAŁEŚ! :) ");
            waitingPopup.show();
        } else if (won3) {
            Stage waitingPopup = popupFactory.createWaitingPopup("WYGRAŁEŚ! :) ");
            waitingPopup.show();
        } else if (won4) {
            Stage waitingPopup = popupFactory.createWaitingPopup("WYGRAŁEŚ! :) ");
            waitingPopup.show();
        } else if (won5) {
            Stage waitingPopup = popupFactory.createWaitingPopup("WYGRAŁEŚ! :) ");
            waitingPopup.show();
        } else if (won6) {
            Stage waitingPopup = popupFactory.createWaitingPopup("WYGRAŁEŚ! :) ");
            waitingPopup.show();
        } else if (won7) {
            Stage waitingPopup = popupFactory.createWaitingPopup("WYGRAŁEŚ! :) ");
            waitingPopup.show();
        } else if (won8) {
            Stage waitingPopup = popupFactory.createWaitingPopup("WYGRAŁEŚ! :) ");
            waitingPopup.show();
        } else if (draw) {
            Stage waitingPopup = popupFactory.createWaitingPopup("REMIS :)");
            waitingPopup.show();
        }


    }



    private void initializePress9Button() {
        press9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


                if (xWasLastSelect) {
                    press9.setText(strO);
                    xWasLastSelect = false;
                    press9.isDisabled();
                    press9.setDisable(true);


                } else {
                    press9.setText(strX);
                    xWasLastSelect = true;
                    press9.setDisable(true);
                }
                winAuthentication();
            }
        });
    }

    private void initializePress8Button() {
        press8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (xWasLastSelect) {
                    press8.setText(strO);
                    xWasLastSelect = false;
                    press8.isDisabled();
                    press8.setDisable(true);


                } else {
                    press8.setText(strX);
                    xWasLastSelect = true;
                    press8.setDisable(true);
                }
                winAuthentication();
            }
        });
    }

    private void initializePress7Button() {
        press7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (xWasLastSelect) {
                    press7.setText(strO);
                    xWasLastSelect = false;
                    press7.isDisabled();
                    press7.setDisable(true);



                } else {
                    press7.setText(strX);
                    xWasLastSelect = true;
                    press7.setDisable(true);
                }
                winAuthentication();
            }
        });
    }

    private void initializePress6Button() {
        press6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (xWasLastSelect) {
                    press6.setText(strO);
                    xWasLastSelect = false;
                    press6.isDisabled();
                    press6.setDisable(true);

                } else {
                    press6.setText(strX);
                    xWasLastSelect = true;
                    press6.setDisable(true);
                }
                winAuthentication();
            }
        });
    }

    private void initializePress5Button() {
        press5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (xWasLastSelect) {
                    press5.setText(strO);
                    xWasLastSelect = false;
                    press5.isDisabled();
                    press5.setDisable(true);

                } else {
                    press5.setText(strX);
                    xWasLastSelect = true;
                    press5.setDisable(true);
                }
                winAuthentication();
            }
        });
    }

    private void initializePress4Button() {
        press4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (xWasLastSelect) {
                    press4.setText(strO);
                    xWasLastSelect = false;
                    press4.isDisabled();
                    press4.setDisable(true);

                } else {
                    press4.setText(strX);
                    xWasLastSelect = true;
                    press4.setDisable(true);
                }
                winAuthentication();

            }
        });
    }

    private void initializePress3Button() {
        press3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


                if (xWasLastSelect) {
                    press1.getText();
                    press3.setText(strO);
                    xWasLastSelect = false;
                    press3.isDisabled();
                    press3.setDisable(true);

                } else {
                    press1.getText();
                    press3.setText(strX);
                    xWasLastSelect = true;
                    press3.setDisable(true);

                }
                winAuthentication();
            }


        });
    }

    private void initializePress2Button() {
        press2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (xWasLastSelect) {
                    press1.getText();
                    press2.setText(strO);
                    xWasLastSelect = false;
                    press2.isDisabled();
                    press2.setDisable(true);

                } else {
                    press1.getText();
                    press2.setText(strX);
                    xWasLastSelect = true;
                    press2.setDisable(true);

                }
                winAuthentication();


            }
        });
    }

    private void initializePress1Button() {
        press1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


                if (xWasLastSelect) {
                    press1.getText();
                    press1.setText(strO);
                    xWasLastSelect = false;
                    press1.isDisabled();
                    press1.setDisable(true);


                } else {
                    press1.getText();
                    press1.setText(strX);
                    xWasLastSelect = true;
                    press1.setDisable(true);

                }
                winAuthentication();
            }


        });


    }



}
