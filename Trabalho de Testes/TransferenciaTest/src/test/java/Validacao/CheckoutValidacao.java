package Validacao;

import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Assertions;

public class CheckoutValidacao {

private WebDriver driver;

public CheckoutValidacao(WebDriver driver){
this.driver = driver;
}

public void validationCamposForm(){
Assertions.assertTrue(driver.getPageSource().contains("Your Information"), "Campos do checkout não preenchidos corretamente");
}
}
