package PageObjects;

import Framework.Browser.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PagTransferencia {

private WebDriver driver;
private Esperas esperas;

public PagTransferencia(WebDriver driver){
this.driver = driver;
this.esperas = new Esperas(driver);
}

public WebElement getInputDestinatario(){
esperas.aguardarVisibilidade(By.id("destinatario")); // exemplo
return driver.findElement(By.id("destinatario"));
}

public WebElement getInputValor(){
return driver.findElement(By.id("valor"));
}

public WebElement getBotaoTransferir(){
return driver.findElement(By.id("btnTransferir"));
}
}
