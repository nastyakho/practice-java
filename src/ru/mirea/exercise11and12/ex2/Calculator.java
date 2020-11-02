package ru.mirea.exercise11and12.ex2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Calculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        primaryStage.getIcons().add(new Image(Calculator.class.getResourceAsStream( "ico.png" )));

        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("calc.fxml");
        loader.setLocation(xmlUrl);
        Parent root = loader.load();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Калькулятор");
        primaryStage.setHeight(280);

        primaryStage.show();
    }
}
