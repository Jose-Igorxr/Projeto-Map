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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author gusta
 */
public class FXMLMenuController1 implements Initializable {
    
    private final navegacao navega = new NavegacaoImCt();


    @FXML
    private Button btnBuscar;
    @FXML
    private Button btnComentar;
    @FXML
    private Button btnContatoAjuda;
    @FXML
    private Button btnTelaRegistraVeiculo;
    @FXML
    private Button btnSair;
    @FXML
    private Button btnTelaDado;
    
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    @FXML
    public void telaBuscar() throws IOException {
        Stage currentStage = (Stage) btnBuscar.getScene().getWindow();
        navega.voltar(currentStage);
        navega.navegue("buscar.fxml");
    }
    
    @FXML
    public void telaComentar() throws IOException {
        Stage currentStage = (Stage) btnComentar.getScene().getWindow();
        navega.voltar(currentStage);
        navega.navegue("comentar.fxml");
    }
    
    @FXML
    public void telaContato() throws IOException {
        Stage currentStage = (Stage) btnContatoAjuda.getScene().getWindow();
        navega.voltar(currentStage);
        navega.navegue("ajuda.fxml");
    }
    
    @FXML
    public void telaRegistrar() throws IOException {
        Stage currentStage = (Stage) btnTelaRegistraVeiculo.getScene().getWindow();
        navega.voltar(currentStage);
        navega.navegue("Registrar.fxml");
    }
    
    @FXML
    public void telaDados() throws IOException {
        Stage currentStage = (Stage) btnTelaDado.getScene().getWindow();
        navega.voltar(currentStage);
        navega.navegue("Dados.fxml");
    }
    
    @FXML
    public void telaSair() throws IOException {
        Stage currentStage = (Stage) btnSair.getScene().getWindow();
        navega.voltar(currentStage);
        navega.navegue("FXMLDocument.fxml");
    }
}
