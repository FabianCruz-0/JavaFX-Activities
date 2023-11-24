package com.fabian.javafxactivities.activity_1;

import com.fabian.javafxactivities.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Interface03 {

    @FXML
    Button circulo, triangulo, cuadrado, rombo;

    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("activity_1/interface_3.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("ACTIVIDAD 4 - INTERFAZ 3");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    public void calcular(String figura){
        String respuesta = null;

        switch (figura){
            case("circulo"):
                Integer radio = 18;
                double answer = Math.PI * Math.pow(radio,2);
                respuesta = "El área de un círculo (PI * radio al cuadrado) con un radio de 18 es: " +answer+".";
                break;

            case("cuadrado"):
                Integer lado = 23;
                double answer2 = Math.pow(lado,2);
                respuesta = "El área de un cuadrado (lado * lado) con un lado de 23 es: " +answer2+".";
                break;

            case("triangulo"):
                Integer base = 7;
                Integer altura = 41;
                double answer3 = (base * altura) / 2;
                respuesta = "El área de un triángulo (base * altura / 2) con base de 7 y altura de 41 es: " +answer3+".";
                break;

            case("rombo"):
                Integer diag_menor = 10;
                Integer diag_mayor = 19;
                double answer4 = (diag_menor * diag_mayor) / 2;
                respuesta = "El área de un rombo (diagonal Mayor * diagonal Menor / 2) con base de 10 y altura de 19 es: " +answer4+".";
                break;
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("RESULTADO");
        alert.setContentText(respuesta);
        alert.showAndWait();
    }

    public void circulo() {
        calcular("circulo");
    }
    public void triangulo() {
        calcular("triangulo");
    }
    public void cuadrado() {
        calcular("cuadrado");
    }
    public void rombo() {
        calcular("rombo");
    }
}
