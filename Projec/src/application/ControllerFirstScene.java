package application;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Test;

public class ControllerFirstScene {

	
	private Test test;
	
	public ControllerFirstScene() {
		test = new Test();
	}
	
	
    @FXML
    private Button randomNumbers;
    
    @FXML
    private Button randomInverse;

    @FXML
    private Button randomOrder;

    @FXML
    private Button randomPercentage;
    
    @FXML
    private TextField size;
    
    @FXML
    private ComboBox<?> sortAlgoritms;
    
    @FXML
    private TextField complexityTemp;

    @FXML
    void generateRandomInOrder(ActionEvent event) {
    	String a = JOptionPane.showInputDialog("Introduce la cantidad de numeros: ");
    	if(a == null || a.equals("") || Integer.parseInt(a) == 0) {
    		JOptionPane.showMessageDialog(null, "You do not introduce valid value", null, JOptionPane.ERROR_MESSAGE);
    	}
    	else {
    		size.setText(a);
    	}
    }

    @FXML
    void generateRandomInverse(ActionEvent event) {
    	String a = JOptionPane.showInputDialog("Introduce la cantidad de numeros: ");
    	if(a == null || a.equals("") || Integer.parseInt(a) == 0 ) {
    		JOptionPane.showMessageDialog(null, "You do not introduce valid value", null, JOptionPane.ERROR_MESSAGE);
    	}
    	else {
    		size.setText(a);
    		
    	}

    }

    @FXML
    void generateRandomPercentage(ActionEvent event) {
    	String a = JOptionPane.showInputDialog("Introduce la cantidad de numeros: ");
    	if(a == null || a.equals("") || Integer.parseInt(a) == 0) {
    		JOptionPane.showMessageDialog(null, "You do not introduce valid value", null, JOptionPane.ERROR_MESSAGE);
    	}
    	else {
    		size.setText(a);
    	}
    }
		
    @FXML
    void generateRandom(ActionEvent event) {
    	String a = JOptionPane.showInputDialog("Introduce la cantidad de numeros: ");
    	if(a == null || a.equals("") || Integer.parseInt(a) == 0) {
    		JOptionPane.showMessageDialog(null, "You do not introduce valid value", null, JOptionPane.ERROR_MESSAGE);
    	}
    	else {
    		size.setText(a);
    	}
    }

	
	
}
