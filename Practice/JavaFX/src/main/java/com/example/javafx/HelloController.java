package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene1(ActionEvent event) throws IOException {
        String css = this.getClass().getResource("test.css").toExternalForm();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        String css = this.getClass().getResource("test.css").toExternalForm();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("level2.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

   /* @FXML
    private Circle myCircle;
    private double x;
    private double y;


    public void up(ActionEvent event) {
        myCircle.setCenterY(y -= 10);
    }

    public void down(ActionEvent event) {
        myCircle.setCenterY(y += 10);
    }

    public void left(ActionEvent event) {
        myCircle.setCenterX(y -= 10);
    }

    public void right(ActionEvent event) {
        myCircle.setCenterX(y += 10);
    }*/
}