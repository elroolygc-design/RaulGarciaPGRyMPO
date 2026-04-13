module com.example.tiendaapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens com.example.tiendaapp to javafx.fxml;
    exports com.example.tiendaapp;

    exports com.example.tiendaapp.controller;
    opens com.example.tiendaapp.controller to javafx.fxml;

    exports com.example.tiendaapp.model;
    opens com.example.tiendaapp.model to javafx.fxml;
}