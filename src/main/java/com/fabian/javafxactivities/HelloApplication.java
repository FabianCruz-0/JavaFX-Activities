package com.fabian.javafxactivities;

import com.fabian.javafxactivities.activity_1.*;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Interface01.start(stage);
        //Interface02.start(stage);
        //Interface03.start(stage);
        //Interface04.start(stage);
        Interface05.start(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}