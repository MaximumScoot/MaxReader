package com.maxscott.pdfreader;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Label("JavaFX is working 🎉"), 400, 200);
        stage.setScene(scene);
        stage.setTitle("JavaFX PDF Reader");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}