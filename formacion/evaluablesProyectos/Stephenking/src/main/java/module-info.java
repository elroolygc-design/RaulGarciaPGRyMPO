module com.example.stephenking {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.stephenking to javafx.fxml;
    exports com.example.stephenking;
    exports com.example.stephenking.model;
    opens com.example.stephenking.model to javafx.fxml;
    exports com.example.stephenking.controller;
    opens com.example.stephenking.controller to javafx.fxml;
}