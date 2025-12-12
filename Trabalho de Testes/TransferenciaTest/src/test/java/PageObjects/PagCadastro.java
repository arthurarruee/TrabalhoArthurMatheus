package PageObjects;

import Framework.Browser.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PagCadastro {

private WebDriver driver;
private Esperas esperas;

public PagCadastro(WebDriver driver){
this.driver = driver;
this.esperas = new Esperas(driver);
}

public WebElement getInputNome(){
esperas.aguardarVisibilidade(By.id("nome")); // exemplo
return driver.findElement(By.id("nome"));
}

public WebElement getInputSobrenome(){
return driver.findElement(By.id("sobrenome"));
}

public WebElement getInputEmail(){
return driver.findElement(By.id("email"));
}

public WebElement getInputSaldo(){
return driver.findElement(By.id("saldo"));
}

public WebElement getBotaoCadastrar(){
return driver.findElement(By.id("cadastrar"));
}
}
