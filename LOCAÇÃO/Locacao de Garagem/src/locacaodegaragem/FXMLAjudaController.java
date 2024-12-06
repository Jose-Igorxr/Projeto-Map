/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package locacaodegaragem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author gusta
 */
public class FXMLAjudaController implements Initializable {
    
    private final navegacao navega = new NavegacaoImCt();

    @FXML
    private Rectangle textExperiencia;
    @FXML
    private Button btnAjuda;
    @FXML
    private Label labelEnviado;
    @FXML
    private ImageView voltaMenu;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    public void exibirEmailEnviado(){
        labelEnviado.setText("Você receberá um email como resposta!");
    }



    @FXML
    public void voltarMenu() throws IOException {
        Stage currentStage = (Stage) voltaMenu.getScene().getWindow();
        navega.voltar(currentStage);
        navega.navegue("menu.fxml");
    }

    
}
