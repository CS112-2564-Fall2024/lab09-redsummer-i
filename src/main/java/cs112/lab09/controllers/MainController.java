package cs112.lab09.controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import cs112.lab09.RedSummer;

public class MainController {

    @FXML
    private Pane mainPane;

    @FXML
    public void handleStartButton() {
        System.out.println("I clicked Start button");
        RedSummer redSummerApp = new RedSummer();
        redSummerApp.changeSceneToMap();
    }
}
