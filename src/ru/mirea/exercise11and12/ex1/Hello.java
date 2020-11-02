package ru.mirea.exercise11and12.ex1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Hello extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        Text text = new Text("Hello from JavaFX!");
        text.setLayoutY(80);    // установка положения надписи по оси Y
        text.setLayoutX(100);   // установка положения надписи по оси X

        Group group = new Group(text);

        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        primaryStage.setTitle("First Application");
        primaryStage.setWidth(300);
        primaryStage.setHeight(250);
        primaryStage.show();
    }
}
