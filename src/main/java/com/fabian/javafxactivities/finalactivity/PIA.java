package com.fabian.javafxactivities.finalactivity;

import com.fabian.javafxactivities.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.io.IOException;

public class PIA {

    Double saldo = 0.0d;
    static Stage stage;

    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("finalactivity/PIA.fxml"));
        PIA.stage = stage;
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("PIA - CAJERO");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void consultar() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("CONSULTA DE SALDO");
        alert.setContentText("Tu saldo actual es de: $" + saldo + " MXN.");
        alert.showAndWait();
    }

    public void retirar() {
        TextInputDialog td = new TextInputDialog();
        td.setHeaderText("RETIRAR");
        td.setContentText("Introducir la cantidad a retirar:");
        td.showAndWait();

        try {
            if(Double.parseDouble(td.getEditor().getText()) > saldo)
                throw new RuntimeException();

            saldo -= Double.parseDouble(td.getEditor().getText());
        } catch (Exception ex) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Error con la entrada. Introducir un valor satisfactorio.");
            alert.showAndWait();
        }
    }

    public void depositar() {
        TextInputDialog td = new TextInputDialog();
        td.setHeaderText("DEPOSITAR");
        td.setContentText("Introducir la cantidad a depositar:");
        td.showAndWait();

        try {
            saldo += Double.parseDouble(td.getEditor().getText());
        } catch (Exception ex) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Error con la entrada. Introducir un valor satisfactorio.");
            alert.showAndWait();
        }
    }

    public void salir() {
        stage.close();
    }
}
