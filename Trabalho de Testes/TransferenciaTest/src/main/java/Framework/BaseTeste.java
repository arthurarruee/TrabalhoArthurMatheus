package Framework;

import Framework.Browser.GerenciadorNavegador;
import Framework.Utils.OperacoesArquivo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTeste {

protected WebDriver driver;
private static final String URL = OperacoesArquivo.lerPropriedades("url").getProperty("index");

@BeforeEach
public void configurar() {
driver = GerenciadorNavegador.abrirNavegador();
driver.get(URL);
}

@AfterEach
public void finalizar() {
GerenciadorNavegador.fecharNavegador();
}
}


