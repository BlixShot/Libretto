package application.libretto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class LibrettoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonCerca;

    @FXML
    private Button buttonInserisci;

    @FXML
    private TextField txtDocent;

    @FXML
    private TextArea txtMessage;

    // WARNING: fx:id="txtTitolo" cannot be injected: several objects share the same fx:id;


    @FXML
    void handleCerca(ActionEvent event) {
    }

    @FXML
    void handleInserisci(ActionEvent event) {
    	//recupera e verifica i dati inseriti e chiedi al model di effettuare l'inserimento e aggiorna la vista
    }

    @FXML
    void initialize() {
        assert buttonCerca != null : "fx:id=\"buttonCerca\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert buttonInserisci != null : "fx:id=\"buttonInserisci\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtDocent != null : "fx:id=\"txtDocent\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtMessage != null : "fx:id=\"txtMessage\" was not injected: check your FXML file 'Libretto.fxml'.";


    }

}
