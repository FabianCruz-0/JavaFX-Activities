module com.fabian.javafxactivities {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fabian.javafxactivities to javafx.fxml;
    exports com.fabian.javafxactivities;
}