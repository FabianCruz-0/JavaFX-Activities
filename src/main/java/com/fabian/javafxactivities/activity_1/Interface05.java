package com.fabian.javafxactivities.activity_1;

import com.fabian.javafxactivities.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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

    public void generate() {
        Random r = new Random();
        int low = 0;
        int high = 1000000;
        Integer result = r.nextInt(high-low) + low;
        
        num01.setText(result.toString());
        result = r.nextInt(high-low) + low;
        num02.setText(result.toString());
        
    }

    public void calcular(String operacion) {

        Integer num1 = Integer.parseInt(num01.getText());
        Integer num2 = Integer.parseInt(num02.getText());
        String resultado = "";

        switch (operacion) {
            case("suma"):
                Integer suma = num1+num2;
                resultado = "El resultado de la suma: " +num01.getText() +" + " + num02.getText() + " = " + suma + ".";
                break;
            case("resta"):
                Integer resta = num1-num2;
                resultado = "El resultado de la resta: " +num01.getText() +" - " + num02.getText() + " = " + resta + ".";
                break;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("RESULTADO");
        alert.setContentText(resultado);
        alert.showAndWait();

    }

    public void sumar(ActionEvent actionEvent) {
        calcular("suma");
    }

    public void resta(ActionEvent actionEvent) {
        calcular("resta");
    }
}
