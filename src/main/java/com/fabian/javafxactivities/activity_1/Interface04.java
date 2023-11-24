package com.fabian.javafxactivities.activity_1;

import com.fabian.javafxactivities.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;

public class Interface04 {

    @FXML
    WebView imagen;
    @FXML
    WebView video;

    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("activity_1/interface_4.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("ACTIVIDAD 4 - INTERFAZ 4");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    public void mostrar(String figura){

        switch (figura){
            case("imagen"):
                imagen.setVisible(true);
                imagen.getEngine().load("https://www.ngenespanol.com/wp-content/uploads/2023/04/que-son-las-auroras-boreales-y-por-que-se-forman.jpg");
                video.setVisible(false);
                video.getEngine().load("https://www.google.com/");
                break;

            case("video"):
                video.setVisible(true);
                video.getEngine().load("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4");
                imagen.setVisible(false);
                break;
        }
    }

    public void imagenf() {
        mostrar("imagen");
    }
    public void videof() {
        mostrar("video");
    }
}
