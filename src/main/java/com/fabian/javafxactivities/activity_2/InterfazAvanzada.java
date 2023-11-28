package com.fabian.javafxactivities.activity_2;

import com.fabian.javafxactivities.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class InterfazAvanzada {

    @FXML
    TextField num01,num02;

    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("activity_2/interfazAvanzada.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("ACTIVIDAD 5 - INTERFAZ AVANZADA");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void calcular(String operacion) {

        try{
            Double num1 = Double.parseDouble(num01.getText());
            Double num2 = Double.parseDouble(num02.getText());
            Double answer;
            String resultado = "";

            switch (operacion){
                case("suma"):
                    answer = num1 + num2;
                    resultado = "El resultado de la suma: " +num01.getText() +" + " + num02.getText() + " = " + answer + ".";
                    break;
                case("restar"):
                    answer = num1 - num2;
                    resultado = "El resultado de la resta: " +num01.getText() +" - " + num02.getText() + " = " + answer + ".";
                    break;
                case("multiplicar"):
                    answer = num1 * num2;
                    resultado = "El resultado de la multiplicación: " +num01.getText() +" x " + num02.getText() + " = " + answer + ".";
                    break;
                case("dividir"):
                    answer = num1 / num2;
                    resultado = "El resultado de la división: " +num01.getText() +" / " + num02.getText() + " = " + answer + ".";
                    break;
            }

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("RESULTADO");
            alert.setContentText(resultado);
            alert.showAndWait();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Ocurrió un problema con los datos introducidos, validar los números.");
            alert.showAndWait();
        }
    }
    public void suma(ActionEvent actionEvent) {
        calcular("suma");
    }

    public void resta(ActionEvent actionEvent) {
        calcular("restar");
    }

    public void mult(ActionEvent actionEvent) {
        calcular("multiplicar");
    }

    public void division(ActionEvent actionEvent) {
        calcular("dividir");
    }
}
