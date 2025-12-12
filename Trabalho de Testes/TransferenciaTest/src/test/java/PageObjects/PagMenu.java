package PageObjects;

import Framework.Browser.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PagMenu {

private WebDriver driver;
private Esperas esperas;

public PagMenu(WebDriver driver){
this.driver = driver;
this.esperas = new Esperas(driver);
}

public WebElement getMenuTransferencia(){
esperas.aguardarVisibilidade(By.id("menuTransferencia")); // exemplo
return driver.findElement(By.id("menuTransferencia"));
}

public WebElement getMenuExtrato(){
return driver.findElement(By.id("menuExtrato"));
}
}
