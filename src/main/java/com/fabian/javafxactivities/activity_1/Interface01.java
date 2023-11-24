package com.fabian.javafxactivities.activity_1;

import com.fabian.javafxactivities.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Interface01 {

    @FXML
    TextField number;

    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("activity_1/interface_1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("ACTIVIDAD 4 - INTERFAZ 1");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void calcular(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("RESULTADO");
        String resultado = "";

        try {
            for (int i = 0;i<=10;i++) {
                resultado += number.getText() + " * " + i + " = " + Float.parseFloat(number.getText()) * i + ".\n";
            }
            alert.setContentText(resultado);
            alert.showAndWait();
        } catch (Exception e) {
            Alert alertError = new Alert(Alert.AlertType.ERROR);
            alertError.setHeaderText(null);
            alertError.setTitle("ERROR");
            alertError.setContentText("Hubo un error realizando la tabla. Favor de verificar la entrada.");
            alertError.showAndWait();
        }

    }
}
