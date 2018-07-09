package application.libretto;

package application.libretto;

import java.net.URL;
import java.util.ResourceBundle;

import application.libretto.model.Esame;
import application.libretto.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class LibrettoController {
	
	Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonCerca;

    @FXML
    private Button buttonInserisci;
    
    @FXML
    private TextField txtCodice;
    

    @FXML
    private TextField txtTitolo;

    @FXML
    private TextField txtDocent;

    @FXML
    private TextArea txtMessage;

    // WARNING: fx:id="txtTitolo" cannot be injected: several objects share the same fx:id;


    @FXML
    void handleCerca(ActionEvent event) {
    	String codice = txtCodice.getText();
    	if(codice.length()<5) {
    		txtMessage.appendText("Codice non valido\n");
    		return;
    	}
    	
    	Esame e = model.trovaEsame(codice);
    	
    	if(e==null)
    		txtMessage.appendText("Esame non trovato\n");
    	else {
    		txtMessage.appendText("Esame trovato\n");
    		txtCodice.setText(e.getCodice());
    		txtTitolo.setText(e.getTitolo());
    		txtDocent.setText(e.getDocente());
    	}
    }
    

    @FXML
    void handleInserisci(ActionEvent event) {
    	//recupera e verifica i dati inseriti e chiedi al model di effettuare l'inserimento e aggiorna la vista
    	
    	//recupera i dati dalla vista
    	String codice = txtCodice.getText();
    	String titolo = txtTitolo.getText();
    	String docente = txtDocent.getText();
    	
    	//verifica la validità dei dati
    	if(codice.length()<5 || titolo.length()==0 || docente.length()==0) {
    		txtMessage.appendText("Inserisci dati validi\n");
    		return;
    	}
    		
    	//chiedi al model di effettuare l'operazione
    	Esame e = new Esame(codice, titolo, docente);
    	boolean result = model.addEsame(e);
    	
    	//aggiorna la view
    	if(result) {
    		txtMessage.appendText("Esame aggiunto\n");
    	}
    	else
    		txtMessage.appendText("Esame non aggiunto\n");
    }

    @FXML
    void initialize() {
        assert buttonCerca != null : "fx:id=\"buttonCerca\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert buttonInserisci != null : "fx:id=\"buttonInserisci\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtCodice != null : "fx:id=\"txtCodice\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtDocent != null : "fx:id=\"txtDocent\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtMessage != null : "fx:id=\"txtMessage\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtTitolo != null : "fx:id=\"txtTitolo\" was not injected: check your FXML file 'Libretto.fxml'.";


    }

	public void setModel(Model model2) {
		// TODO Auto-generated method stub
		this.model= model2;
	}
