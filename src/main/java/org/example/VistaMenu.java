package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class VistaMenu {
    public Button BotonMapa;
    public Button BotonTutorial;

    @FXML
    private void switchToMapa() throws IOException {
        App.setRoot("mapa");
    }

    @FXML
    private void switchToTutorial() throws IOException {
        App.setRoot("tutorial");
    }
}
