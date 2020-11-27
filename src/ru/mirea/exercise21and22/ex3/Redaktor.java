package ru.mirea.exercise21and22.ex3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Redaktor extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        primaryStage.getIcons().add(new Image(Redaktor.class.getResourceAsStream( "ico.png" )));

        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("Carcas.fxml");
        loader.setLocation(xmlUrl);
        Parent root = loader.load();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Редактор");

        primaryStage.show();
    }
}
