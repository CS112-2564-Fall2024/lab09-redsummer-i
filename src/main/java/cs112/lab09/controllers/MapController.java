package cs112.lab09.controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import cs112.lab09.Constants;
import cs112.lab09.models.RevisedHistoricalEvent;

public class MapController {

    @FXML
    private Pane mapPane;

    @FXML
    public void handleSanFranciscoEvent() {
        System.out.println("I clicked San Francisco button");
        RevisedHistoricalEvent event = new RevisedHistoricalEvent(Constants.HISTORICAL_DATA[0]);
        openEventWindow(event);
    }

    @FXML
    public void handleBisbeeEvent() {
        System.out.println("I clicked Bisbee button");
        RevisedHistoricalEvent event = new RevisedHistoricalEvent(Constants.HISTORICAL_DATA[1]);
        openEventWindow(event);
    }

    private void openEventWindow(RevisedHistoricalEvent event) {
        try {
            EventController eventController = new EventController();
            Stage eventStage = new Stage();
            eventController.displayEventInfo(event, eventStage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
