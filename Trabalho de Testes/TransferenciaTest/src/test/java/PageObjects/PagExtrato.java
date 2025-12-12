package PageObjects;

import Framework.Browser.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PagExtrato {

private WebDriver driver;
private Esperas esperas;

public PagExtrato(WebDriver driver){
this.driver = driver;
this.esperas = new Esperas(driver);
}

public WebElement getListaTransacoes(){
esperas.aguardarVisibilidade(By.id("extrato")); // exemplo
return driver.findElement(By.id("extrato"));
}
}
