import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import javafx.stage.Stage;
import java.io.IOException;
import locacaodegaragem.NavegacaoImCt;

public class NavegacaoImCtTest {

    @Test
    public void testNavegue() {
        NavegacaoImCt navegacao = new NavegacaoImCt();
        try {
            navegacao.navegue("src/locacaodegaragem/buscar.fxml");
        } catch (IOException e) {
            fail("Erro");
        }
    }

    @Test
    public void testVoltar() {
        NavegacaoImCt navegacao = new NavegacaoImCt();
        Stage stage = new Stage();
        try {
            navegacao.voltar(stage);
        } catch (Exception e) {
            fail("Erro");
        }
    }
}
