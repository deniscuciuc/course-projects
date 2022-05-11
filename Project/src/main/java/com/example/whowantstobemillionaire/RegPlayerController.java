package com.example.whowantstobemillionaire;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class RegPlayerController implements Initializable {

    private final String[] cities = {"Chișinău", " Bălți", "Tiraspol", "Tighina", "Rîbnița", "Ungheni",
                                     "Cahul", "Soroca", "Orhei", "Comrat", "Dubăsari", "Strășeni", "Durlești",
                                     "Ceadâr-Lunga", " Căușeni", "Codru", "Edineț", "Alt oraș"};
    @FXML
    private TextField playerNameField;
    @FXML
    private TextField playerAgeField;
    @FXML
    private ChoiceBox<String> citiesChoiceBox;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void play(ActionEvent event) throws IOException {
        String playerName = getPlayerName();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
        root = loader.load();

        GameController gameController = loader.getController();
        gameController.launchGame();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Cine vrea sa fie milionar?");
        stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        citiesChoiceBox.getItems().addAll(cities);
    }

    public String getPlayerName() {
        return playerNameField.getText();
    }

    public int getPlayerAge() {
        return Integer.parseInt(playerAgeField.getText());
    }

    public String getCity() {
        return citiesChoiceBox.getValue();
    }
}
