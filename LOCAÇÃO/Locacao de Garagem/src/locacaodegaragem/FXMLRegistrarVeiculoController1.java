/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package locacaodegaragem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author gusta
 */
public class FXMLRegistrarVeiculoController1 implements Initializable {
    
    private final navegacao navega = new NavegacaoImCt();
    
    


    @FXML
    private ChoiceBox<String> cbTipoVeiculo;
    private String[] veiculos = {"Carro","Moto","Caminhão","Bicicleta"};
    @FXML
    private Button btnRegistrar;
    @FXML
    private Label labelRegistrado;
    @FXML
    private ImageView voltaMenu;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cbTipoVeiculo.getItems().addAll(veiculos);
    }    
    
    @FXML
    public void labelRegistrar(){
        labelRegistrado.setText("Veiculo Registrado!");
    }
    
    @FXML
    public void voltarMenu() throws IOException {
        Stage currentStage = (Stage) voltaMenu.getScene().getWindow();
        navega.voltar(currentStage);
        navega.navegue("menu.fxml");
    }
}
