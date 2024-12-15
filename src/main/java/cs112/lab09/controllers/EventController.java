package cs112.lab09.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import cs112.lab09.models.RevisedHistoricalEvent;

public class EventController {

    @FXML
    private Label eventTitleLabel;

    @FXML
    private Label eventDescriptionLabel;

    @FXML
    private ImageView eventImageView;

    @FXML
    private Button closeButton;

    public void displayEventInfo(RevisedHistoricalEvent event, Stage stage) {
        eventTitleLabel.setText(event.getDescription());
        eventDescriptionLabel.setText(event.getRevisedDescription());
        // eventImageView.setImage(new Image(event.getImageName()));
        closeButton.setOnAction(e -> stage.close());
        stage.setTitle(event.getDescription());
        stage.show();
    }

    @FXML
    public void handleCloseButton() {
        System.out.println("I clicked Close button");
    }
}
