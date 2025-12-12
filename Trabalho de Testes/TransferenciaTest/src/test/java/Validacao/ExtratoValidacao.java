package Validacao;

import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Assertions;

public class ExtratoValidacao {

    private WebDriver driver;

public ExtratoValidacao(WebDriver driver){
this.driver = driver;
}

public void validarSaldo(String saldoEsperado, String saldoAtual){
Assertions.assertEquals(saldoEsperado, saldoAtual, "Saldo não confere no extrato!");
}
}
