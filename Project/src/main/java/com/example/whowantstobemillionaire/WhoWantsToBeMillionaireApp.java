package com.example.whowantstobemillionaire;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.util.Objects;

public class WhoWantsToBeMillionaireApp {

    /*@Override
    public void start(Stage stage) throws Exception {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("regPlayer.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Cine vrea sa fie milionar?");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) {
       // launch();

       ConsoleGame consoleGame = new ConsoleGame();
       consoleGame.launchGame();
    }
}
