/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolvedorsistemaslineares.view;

import resolvedorSistemasLineares.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author aluno
 */
public class cenaPrincipalController {

    @FXML
    private TextField quantVariaveis;
    @FXML
    private Button confirmaQV;
    @FXML
    private Button adicionarEq;
    @FXML
    private TextField novaEquacao;
    @FXML
    private ListView<String> listaSistema;
    
    

    private MainApp mainApp;

    public cenaPrincipalController() {

    }

    @FXML
    private void initialize() {
        listaSistema = new ListView<String>();
    }
    
    @FXML
    private void handleConfirmaQV(){
        
    }

}
