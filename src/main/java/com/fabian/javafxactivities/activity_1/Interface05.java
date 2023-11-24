package com.fabian.javafxactivities.activity_1;

import com.fabian.javafxactivities.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class Interface05 {

    @FXML
    Label num01,num02;

    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("activity_1/interface_5.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("ACTIVIDAD 4 - INTERFAZ 5");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    public void mostrar(String figura){

    }

    public void generate() {
        Random r = new Random();
        int low = 0;
        int high = 1000000;
        Integer result = r.nextInt(high-low) + low;
        
        num01.setText(result.toString());
        result = r.nextInt(high-low) + low;
        num02.setText(result.toString());
        
    }

    public void sumar(ActionEvent actionEvent) {
    }

    public void mult(ActionEvent actionEvent) {
    }
}
