package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.AlienDictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class FXMLController {
	
	AlienDictionary dizionario;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Button btnTranslate;
    
    @FXML
    private Button btnReset;
    
    @FXML
    private TextField txtInsert;
    
    @FXML
    private TextArea txtOutput;

    @FXML
    void doTranslate(ActionEvent event) {
    	// TODO - add the button and complete this  
    	
    	String testoInput = txtInsert.getText();
    	txtInsert.clear();
    	
    	String testoOutput = dizionario.aggiungitraduci(testoInput);
    	
    	txtOutput.appendText(testoOutput);
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	// TODO - add the button and complete this 
    	
    	dizionario.reset();
    	
    	txtOutput.clear();
    	
    }
    
    
    @FXML
    void initialize() {	
    	
    	assert txtInsert != null : "fx:id=\"txtInsert\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtOutput != null : "fx:id=\"txtOutput\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

    	
    	dizionario = new AlienDictionary();
    }
}