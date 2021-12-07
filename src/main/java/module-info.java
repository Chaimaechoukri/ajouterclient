module com.example.ajouterclient {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ajouterclient to javafx.fxml;
    exports com.example.ajouterclient;
}