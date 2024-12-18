/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package locacaodegaragem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author gusta
 */
public class FXMLDocumentController implements Initializable {
    
    private final navegacao navega = new NavegacaoImCt();

    @FXML
    private Button btnEntra;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    

    
    @FXML
    public void entraTela() throws IOException {
        Stage currentStage = (Stage) btnEntra.getScene().getWindow();
        navega.voltar(currentStage);
        navega.navegue("menu.fxml");
    }
}
