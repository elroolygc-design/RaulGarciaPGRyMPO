package com.example.stephenking.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BibliotecaController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
