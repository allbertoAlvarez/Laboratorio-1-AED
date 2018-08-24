package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ControllerSecundaryWindow {

    @FXML
    private Button addNumbers;

    @FXML
    private TextArea numbers;

    @FXML
    void addNumbers(ActionEvent event) {
    	System.out.println("Hola");
    }

}