package it.polito.tdp.Lab00;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtUtente;

    @FXML
    private TextField txtPassword;

    @FXML
    private Button btnAccedi;

    @FXML
    private Label lblRisultato;
    
    @FXML
    private Label lblTentativiRimasti;
    
    @FXML
    private Button btnRiprova;

    @FXML
    void hadleRiprova(ActionEvent event) {
    	
    	// Azzera numero tentativi    	
    	tentativiEffettuati = 0;
    	// Nascondi pulsante RIPROVA
    	btnRiprova.setVisible(false);
    	// Mostra pulsante Accedi
    	btnAccedi.setVisible(true);
       	// Azzera campi Utente e password
    	txtUtente.setText("");
    	txtPassword.setText("");
    	lblRisultato.setText("");
    	lblTentativiRimasti.setText("Numero tentativi rimasti = 3");
    }

    //numero tentativi = 1 (pubblica)
	// dati corretti = false
    private Integer tentativiEffettuati = 0;
    private Boolean pwdCorretta = false; 
    //private String tentativiRimasti;
    
    @FXML
    void handleAccedi(ActionEvent event) {

    	System.out.println("Hai cliccato il bottone "Accedi"!");
    	System.out.println("Utente vale " + txtUtente.getText());
    	System.out.println("password vale " + txtPassword.getText());
    	System.out.println("Tentativi effettuati: " + tentativiEffettuati);
    	System.out.println("PWD ok? " + pwdCorretta);
    	
    	//leggi e verifica se dati sono completi altrimenti esci
    	
    	if(txtUtente.getText().isEmpty() || txtPassword.getText().isEmpty()) {
    		System.out.println("Devi compilare sia Utente sia Password!");
    		lblRisultato.setText("Devi compilare sia Utente sia Password!");
    		return;
    	}
    	
    	//ripeti fino a che numero tenativi minore 3 oppure pwd corretta
    	if (tentativiEffettuati < 2) {
    	
    		// se password errata invia messaggio relativo
    	  	if(txtPassword.getText().length() < 7) {
        		System.out.println("La password deve essere lunga almeno 7 caratteri!");
        		lblRisultato.setText("La password deve essere lunga almeno 7 caratteri!");
        		
        	}else if(!txtPassword.getText().matches(".*[A-Z]+.*")) {
        		System.out.println("La password deve contenere almeno un carattere maiuscolo!");
        		lblRisultato.setText("La password deve contenere almeno un carattere maiuscolo!");     		
        		
        	}else if(!txtPassword.getText().matches(".*[1-9]+.*")) {
        		System.out.println("La password deve contenere almeno un carattere numerico [1-9]!");
        		lblRisultato.setText("La password deve contenere almeno un carattere numerico [1-9]!");  

        	}else if(!txtPassword.getText().matches(".*[!#?@#]+.*")) {
        		System.out.println("La password deve contenere almeno un carattere speciale [!?@#]!");
        		lblRisultato.setText("La password deve contenere almeno un carattere speciale [!?@#]!");  
        	
        	// altrimenti pwd corretta
        	}else {
        		// Ok per accesso
        		pwdCorretta = true;
        		System.out.println("Bravo accesso consentito");
        		lblRisultato.setText("Bravo accesso consentito");
            	// abilita pulsante "RIPROVA"    
            	btnRiprova.setVisible(true);
            	// Mostra pulsante Accedi
            	btnAccedi.setVisible(false);
            	// Azzera numero tentativi    		
            	lblTentativiRimasti.setText("");
                tentativiEffettuati = 0;
                pwdCorretta = false;
                return ;
            	
        	} 
    	  	
        	if(!pwdCorretta) {
    			// incrementa i tentativi
        		tentativiEffettuati = tentativiEffettuati + 1;
        		// aggiorna lable tentativi rimasti
        		lblTentativiRimasti.setText("Numero tentativi rimasti = " + Integer.toString(3-tentativiEffettuati));  
    			// disabilita nome utente
        		
        	}
        } else { // tentativi esauriti
        	
        	// messaggio esaurimento tentativi
        	lblRisultato.setText("Tentativi esauriti! Riprova");
        	// cancella numero tentativi effettuati
    		lblTentativiRimasti.setText("");
        	// disabilita pulsante "Accedi"
        	btnAccedi.setVisible(false);
        	// abilita pulsante "RIPROVA"    
        	btnRiprova.setVisible(true);
    	}
    		
    }
  
    @FXML
    void initialize() {
        assert txtUtente != null : "fx:id=\"txtUtente\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtPassword != null : "fx:id=\"txtPassword\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnAccedi != null : "fx:id=\"btnAccedi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblRisultato != null : "fx:id=\"lblRisultato\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
