package application;

import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Test;

public class ControllerFirstScene {

	
	private Test test;
	
	public ControllerFirstScene() {
	}
	

    @FXML
    private Button numbersIntroduced;
	
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
    void introduceNumbers(ActionEvent event) throws IOException {
  
        Parent root = FXMLLoader.load(getClass().getResource("SecundaryWindow.fxml"));
        Scene scene = new Scene(root);
        Stage s = new Stage();
        s.setScene(scene);
        s.show();
    }
    
   
    
    @FXML
    void generateRandomInOrder(ActionEvent event) {
    	String a = JOptionPane.showInputDialog("Introduce the quantity of numbers that you want to sort: ");
    	if(a == null || a.equals("") || Integer.parseInt(a) == 0|| Integer.parseInt(a) == 1 || Integer.parseInt(a) > 1000) {
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
//    	    		int[] arreglo =  {8,1,2,23,453,232};
//    	    		for(int i = 0; i < test.getSort().insertionSortReverse(arreglo).length ; i ++) {
//    	    			System.out.println(test.getSort().insertionSortReverse(arreglo)[i]);
//    	    		}
    			}
    		}
    	}
    }

    @FXML
    void generateRandomInverse(ActionEvent event) {
    	String a = JOptionPane.showInputDialog("Introduce the quantity of numbers that you want to sort: ");
    	if(a == null || a.equals("") || Integer.parseInt(a) == 0|| Integer.parseInt(a) == 1 || Integer.parseInt(a) > 1000) {
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
    	if(a == null || a.equals("") || Integer.parseInt(a) == 0||Integer.parseInt(a) == 1 || Integer.parseInt(a) > 1000) {
    		JOptionPane.showMessageDialog(null, "You do not introduce valid value", null, JOptionPane.ERROR_MESSAGE);
    	}
    	else {
    		String b = JOptionPane.showInputDialog("Introduce the minimum value: ");
    		if(b == null || b.equals("") || Integer.parseInt(b) == 0) {
    			JOptionPane.showMessageDialog(null, "You do not introduce valid value", null, JOptionPane.ERROR_MESSAGE);
    		}
    		else {
    			String c = JOptionPane.showInputDialog("Introduce the maximum value:  ");
    			if(c == null || c.equals("") || Integer.parseInt(c) == 0 || Integer.parseInt(b) >= Integer.parseInt(c)) {
    				JOptionPane.showMessageDialog(null, "You do not introduce valid value", null, JOptionPane.ERROR_MESSAGE);
    			}
    			else {
        			String p = JOptionPane.showInputDialog("Enter the percentage that you want to be ordered:  ");
        			if(p == null || p.equals("")) {
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
 
    }
		
    @FXML
    void generateRandom(ActionEvent event) {
    	String a = JOptionPane.showInputDialog("Introduce the quantity of numbers that you want to sort: ");
    	if(a == null || a.equals("") || Integer.parseInt(a) == 0|| Integer.parseInt(a) == 1 || Integer.parseInt(a) > 1000) {
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

	
	
}
