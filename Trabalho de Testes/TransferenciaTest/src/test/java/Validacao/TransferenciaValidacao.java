package Validacao;

import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Assertions;

public class TransferenciaValidacao {

private WebDriver driver;

public TransferenciaValidacao(WebDriver driver) {
this.driver = driver;
}

public void validarValorTransferido(String valorEsperado, String valorAtual) {
Assertions.assertEquals(valorEsperado, valorAtual, "O valor transferido não confere!");
}
}
