package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerFirstScene {

    @FXML
    private Button randomNumbers;
	
	
	
    @FXML
    void showMessage(ActionEvent event) {
    	System.out.println("Hola mundo");
    }

	
	
}
