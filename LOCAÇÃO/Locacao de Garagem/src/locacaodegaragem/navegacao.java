/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package locacaodegaragem;

import java.io.IOException;
import javafx.stage.Stage;


public interface navegacao {
    void navegue(String fxmlPath) throws IOException;
    void voltar(Stage currentStage);
}
