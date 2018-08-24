package application;

import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import model.SortNumbers;
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
    private Button aviableAlgortims;
    
    @FXML
    private TextField complexityTemp;
    
    @FXML
    private TextField spaceComplexity;

    @FXML
    private TextField minimumValue;

    @FXML
    private TextField maximumValue;
    
    @FXML
    private Button sortNumbers;
    
    @FXML
    private TextField timeSeconds;

    @FXML
    void introduceNumbers(ActionEvent event) throws IOException {
  
        Parent root = FXMLLoader.load(getClass().getResource("SecundaryWindow.fxml"));
        Scene scene = new Scene(root);
        Stage s = new Stage();
        s.setResizable(false);
        s.setScene(scene);
        s.show();
    }
    

    @FXML
    void showAlgoritms(ActionEvent event) {
    	
    	if(test != null) {
        	String[] a = {"Merge Sort", "Insertion Sort", "Heap sort"};
        	
        	Object optionTypeObject = JOptionPane.showInputDialog(null,"Selecciona un color", "Elegir",JOptionPane.QUESTION_MESSAGE,null,a, null);
        	if(optionTypeObject == null) {
        		
        	}
        	else {
        	
        		String option = (String)optionTypeObject;
        	
        		if(option.equals("Merge Sort")) {
        			complexityTemp.setText(SortNumbers.mergeSortTemporalComplexity);
        			spaceComplexity.setText(SortNumbers.mergeSortSpaceComplexity);
        			
        		}
        		else if(option.equals("Insertion Sort")) {
        			complexityTemp.setText(SortNumbers.insertionSortTemporalComplexity);
        			spaceComplexity.setText(SortNumbers.insertionSortSpaceComplexity);
        			timeSeconds.setText(test.getSecondsForInsertionSort(test.getGenerator().getArrayGenerated()) + "");

        		}
        		else if(option.equals("Heap sort")) {
        			complexityTemp.setText(SortNumbers.heapSortTemporalComplexity);
        			spaceComplexity.setText(SortNumbers.heapSortSpaceComplexity);
        			timeSeconds.setText(test.getSecondsForHeapSort(test.getGenerator().getArrayGenerated()) + "") ;
        		}
        	}
    	}
    	else {
    		JOptionPane.showMessageDialog(null, "You have to choose some generator numbers first", null, JOptionPane.ERROR_MESSAGE);
    	}
    	


    	
    }
    

    @FXML
    void sortNumbers(ActionEvent event) throws IOException {
    	
        Parent root = FXMLLoader.load(getClass().getResource("ThirdScene.fxml"));
        Scene scene = new Scene(root);
        Stage s = new Stage();
        s.setResizable(false);
        s.setScene(scene);
        s.setTitle("SEE ORDERED NUMBERS");
        s.show();
    }
   
    
    @FXML
    void generateRandomInOrder(ActionEvent event) {
    	String a = JOptionPane.showInputDialog("Introduce the quantity of numbers that you want to sort: ");
    	if(a == null || a.equals("") || Integer.parseInt(a) == 0|| Integer.parseInt(a) == 1 || Integer.parseInt(a) > 1000000) {
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
    	    		test.getGenerator().randomNumbersInOrder();
    			}
    		}
    	}
    }

    @FXML
    void generateRandomInverse(ActionEvent event) {
    	String a = JOptionPane.showInputDialog("Introduce the quantity of numbers that you want to sort: ");
    	if(a == null || a.equals("") || Integer.parseInt(a) == 0|| Integer.parseInt(a) == 1 || Integer.parseInt(a) > 1000000) {
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
    	    		test.getGenerator().randomNumbersInReverseOrder();
    			}
    		}
    	}

    }

    @FXML
    void generateRandomPercentage(ActionEvent event) {
    	String a = JOptionPane.showInputDialog("Introduce the quantity of numbers that you want to sort: ");
    	if(a == null || a.equals("") || Integer.parseInt(a) == 0||Integer.parseInt(a) == 1 || Integer.parseInt(a) > 1000000) {
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
    	    			test.getGenerator().percentageRandomNumbers(Double.parseDouble(p));
       
        			}
    			}
    		}
    	}
 
    }
		
    @FXML
    void generateRandom(ActionEvent event) {
    	String a = JOptionPane.showInputDialog("Introduce the quantity of numbers that you want to sort: ");
    	if(a == null || a.equals("") || Integer.parseInt(a) == 0|| Integer.parseInt(a) == 1 || Integer.parseInt(a) > 1000000) {
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
