package ru.mirea.exercise13and14;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Igra extends Application {

    private VBox root;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream( "ico.png" )));

        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("game.fxml");
        loader.setLocation(xmlUrl);
        root = loader.load();
        initStorage();

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Игра");

        primaryStage.show();
    }

    private void initStorage() {
        Text nol = new Text(  );
        nol.setId("nolikS");
        nol.setText("0");
        nol.setVisible(false);
        Text kre = new Text();
        kre.setId("krestS");
        kre.setText("0");
        kre.setVisible(false);
        root.getChildren().addAll(nol, kre);
    }
}