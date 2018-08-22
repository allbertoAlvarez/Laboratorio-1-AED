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
    private TextField spaceComplexity;

    @FXML
    private TextField minimumValue;

    @FXML
    private TextField maximumValue;
    

    @FXML
    void generateRandomInOrder(ActionEvent event) {
    	String a = JOptionPane.showInputDialog("Introduce the quantity of numbers that you want to sort: ");
    	if(a == null || a.equals("") || Integer.parseInt(a) == 0|| Integer.parseInt(a) > 1000) {
    		JOptionPane.showMessageDialog(null, "You do not introduce valid value", null, JOptionPane.ERROR_MESSAGE);
    	}
    	else {
    		String b = JOptionPane.showInputDialog("Introduce the minimum value: ");
    		if(b == null || b.equals("") || Integer.parseInt(b) == 0) {
    			JOptionPane.showMessageDialog(null, "You do not introduce valid value", null, JOptionPane.ERROR_MESSAGE);
    		}
    		else {
    			String c = JOptionPane.showInputDialog("Introduce the maximum value:  ");
    			if(c == null || c.equals("") || Integer.parseInt(c) == 0) {
    				JOptionPane.showMessageDialog(null, "You do not introduce valid value", null, JOptionPane.ERROR_MESSAGE);
    			}
    			else {
    	    		test = new Test(Integer.parseInt(a), Integer.parseInt(b), Integer.parseInt(c));
    	    		minimumValue.setText(test.getMinimumValue() + "");
    	    		maximumValue.setText(test.getMaximumValue() + "");
    	    		size.setText(a);
    			}
    		}
    	}
    }

    @FXML
    void generateRandomInverse(ActionEvent event) {
    	String a = JOptionPane.showInputDialog("Introduce the quantity of numbers that you want to sort: ");
    	if(a == null || a.equals("") || Integer.parseInt(a) == 0|| Integer.parseInt(a) > 1000) {
    		JOptionPane.showMessageDialog(null, "You do not introduce valid value", null, JOptionPane.ERROR_MESSAGE);
    	}
    	else {
    		String b = JOptionPane.showInputDialog("Introduce the minimum value: ");
    		if(b == null || b.equals("") || Integer.parseInt(b) == 0) {
    			JOptionPane.showMessageDialog(null, "You do not introduce valid value", null, JOptionPane.ERROR_MESSAGE);
    		}
    		else {
    			String c = JOptionPane.showInputDialog("Introduce the maximum value:  ");
    			if(c == null || c.equals("") || Integer.parseInt(c) == 0) {
    				JOptionPane.showMessageDialog(null, "You do not introduce valid value", null, JOptionPane.ERROR_MESSAGE);
    			}
    			else {
    	    		test = new Test(Integer.parseInt(a), Integer.parseInt(b), Integer.parseInt(c));
    	    		minimumValue.setText(test.getMinimumValue() + "");
    	    		maximumValue.setText(test.getMaximumValue() + "");
    	    		size.setText(a);
    			}
    		}
    	}

    }

    @FXML
    void generateRandomPercentage(ActionEvent event) {
    	String a = JOptionPane.showInputDialog("Introduce the quantity of numbers that you want to sort: ");
    	if(a == null || a.equals("") || Integer.parseInt(a) == 0|| Integer.parseInt(a) > 1000) {
    		JOptionPane.showMessageDialog(null, "You do not introduce valid value", null, JOptionPane.ERROR_MESSAGE);
    	}
    	else {
    		String b = JOptionPane.showInputDialog("Introduce the minimum value: ");
    		if(b == null || b.equals("") || Integer.parseInt(b) == 0) {
    			JOptionPane.showMessageDialog(null, "You do not introduce valid value", null, JOptionPane.ERROR_MESSAGE);
    		}
    		else {
    			String c = JOptionPane.showInputDialog("Introduce the maximum value:  ");
    			if(c == null || c.equals("") || Integer.parseInt(c) == 0) {
    				JOptionPane.showMessageDialog(null, "You do not introduce valid value", null, JOptionPane.ERROR_MESSAGE);
    			}
    			else {
    	    		test = new Test(Integer.parseInt(a), Integer.parseInt(b), Integer.parseInt(c));
    	    		minimumValue.setText(test.getMinimumValue() + "");
    	    		maximumValue.setText(test.getMaximumValue() + "");
    	    		size.setText(a);
    			}
    		}
    	}
 
    }
		
    @FXML
    void generateRandom(ActionEvent event) {
    	String a = JOptionPane.showInputDialog("Introduce the quantity of numbers that you want to sort: ");
    	if(a == null || a.equals("") || Integer.parseInt(a) == 0|| Integer.parseInt(a) > 1000) {
    		JOptionPane.showMessageDialog(null, "You do not introduce valid value", null, JOptionPane.ERROR_MESSAGE);
    	}
    	else {
    		String b = JOptionPane.showInputDialog("Introduce the minimum value: ");
    		if(b == null || b.equals("") || Integer.parseInt(b) == 0) {
    			JOptionPane.showMessageDialog(null, "You do not introduce valid value", null, JOptionPane.ERROR_MESSAGE);
    		}
    		else {
    			String c = JOptionPane.showInputDialog("Introduce the maximum value:  ");
    			if(c == null || c.equals("") || Integer.parseInt(c) == 0) {
    				JOptionPane.showMessageDialog(null, "You do not introduce valid value", null, JOptionPane.ERROR_MESSAGE);
    			}
    			else {
    	    		test = new Test(Integer.parseInt(a), Integer.parseInt(b), Integer.parseInt(c));
    	    		minimumValue.setText(test.getMinimumValue() + "");
    	    		maximumValue.setText(test.getMaximumValue() + "");
    	    		size.setText(a);
    	    		test.imprimir();
    			}
    		}
    	}
    }

	
	
}
