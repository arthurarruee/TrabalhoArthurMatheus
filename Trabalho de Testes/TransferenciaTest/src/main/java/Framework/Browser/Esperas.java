package Framework.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Esperas {

private WebDriver driver;

public Esperas(WebDriver driver) {
this.driver = driver;
}

public WebElement aguardarVisibilidade(By elemento) {
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
return wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
}

public WebElement aguardarElemento(WebElement elemento) {
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
return wait.until(ExpectedConditions.visibilityOf(elemento));
}
}
