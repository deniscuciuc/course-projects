package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        String css = this.getClass().getResource("test.css").toExternalForm();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        scene.getStylesheets().add(css);
        stage.setTitle("Learn JavaFX!");
        stage.setScene(scene);
        stage.show();
        /*Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.MIDNIGHTBLUE);
        Stage stage = new Stage();
        stage.setTitle("Learn JavaFX");

        Text text = new Text();
        text.setText("Hello, this is my learning app");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 19));
        text.setFill(Color.WHITE);

        Line line = new Line();
        line.setStartX(50);
        line.setStartY(60);
        line.setEndX(325);
        line.setEndY(60);
        line.setStrokeWidth(3);
        line.setStroke(Color.WHITE);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.WHITE);
        rectangle.setStrokeWidth(3);
        rectangle.setStroke(Color.GOLD);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0, 200.0,
                300.0, 300.0,
                200.0, 200.0
                );
        triangle.setFill(Color.WHITE);

        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.WHITE);

        Image eclair = new Image("D:\\Repositories\\tekwill-javacourse\\Practice\\JavaFX\\src\\eclair.jpg");
        ImageView eclairView = new ImageView(eclair);
        eclairView.setX(400);
        eclairView.setY(400);

        root.getChildren().add(eclairView);
        root.getChildren().add(circle);
        root.getChildren().add(triangle);
        root.getChildren().add(rectangle);
        root.getChildren().add(line);
        root.getChildren().add(text);
        stage.setScene(scene);
        stage.show();*/
    }

    public static void main(String[] args) {
        launch();
    }
}