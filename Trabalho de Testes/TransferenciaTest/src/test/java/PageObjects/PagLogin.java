package PageObjects;

import Framework.Browser.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PagLogin {

private WebDriver driver;
private Esperas esperas;

public PagLogin(WebDriver driver) {
this.driver = driver;
this.esperas = new Esperas(driver);
}

private By inputEmail = By.id("emailLogin"); // trocar pelo ID real
private By inputSenha = By.id("senhaLogin");
private By botaoLogin = By.id("btnLogin");

public void preencherLogin(String email, String senha) {
esperas.aguardarVisibilidade(inputEmail).sendKeys(email);
driver.findElement(inputSenha).sendKeys(senha);
}

public void clicarLogin() {
driver.findElement(botaoLogin).click();
}
}
