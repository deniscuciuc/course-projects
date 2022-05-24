package com.example.whowantstobemillionaire.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class GameLostController {
    @FXML
    private Button restartBtn;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void restart(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("regPlayer.fxml"));
        root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        RegPlayerController regPlayerController = loader.getController();
        regPlayerController.play(event);

        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Cine vrea sa fie milionar?");
        stage.show();
    }
}
