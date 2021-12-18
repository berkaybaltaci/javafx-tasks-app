module com.berkaybaltaci.todoapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.berkaybaltaci.todoapp to javafx.fxml;
    exports com.berkaybaltaci.todoapp;
}