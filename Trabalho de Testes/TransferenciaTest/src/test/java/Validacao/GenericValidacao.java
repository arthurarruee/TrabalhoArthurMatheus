package Validacao;

import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Assertions;
import PageObjects.GenericPage;

public class GenericValidacao {

private WebDriver driver;
private GenericPage genericPage;

public GenericValidacao(WebDriver driver){
this.driver = driver;
genericPage = new GenericPage(driver);
}

public void validationTitlePages(String tituloEsperado){
String tituloAtual = genericPage.getTextTitle().getText();
Assertions.assertEquals(tituloEsperado, tituloAtual, "Título da página não corresponde!");
}

public void validationProduto(){
Assertions.assertTrue(genericPage.getTextProduto().isDisplayed(), "Produto não encontrado na página!");
}
}
