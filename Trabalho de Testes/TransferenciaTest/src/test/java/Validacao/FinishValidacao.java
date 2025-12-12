package Validacao;

import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Assertions;
import PageObjects.FinishPage;

public class FinishValidacao {

private WebDriver driver;
private FinishPage finishPage;

public FinishValidacao(WebDriver driver){
this.driver = driver;
finishPage = new FinishPage(driver);
}

public void validationSucessoCompra(){
String texto = finishPage.getFinishTextLabel().getText();
Assertions.assertEquals("THANK YOU FOR YOUR ORDER", texto, "Compra não finalizada com sucesso!");
}
}
