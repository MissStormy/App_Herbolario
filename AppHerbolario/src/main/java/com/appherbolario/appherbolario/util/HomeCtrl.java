package com.appherbolario.appherbolario.util;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeCtrl {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}