package Validacao;

import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Assertions;

public class LoginValidacao {

private WebDriver driver;

public LoginValidacao(WebDriver driver){
this.driver = driver;
}

public void loginValidation(){
String urlAtual = driver.getCurrentUrl();
Assertions.assertTrue(urlAtual.contains("dashboard"), "Login não realizado com sucesso!");
}
}
