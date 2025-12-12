package Framework.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GerenciadorNavegador {

private static WebDriver driver;

public static WebDriver abrirNavegador() {
if (driver == null) {
WebDriverManager.chromedriver().setup();
ChromeOptions options = new ChromeOptions();
options.addArguments("--start-maximized");
options.addArguments("--incognito");
driver = new ChromeDriver(options);
}
return driver;
}

public static void fecharNavegador() {
if (driver != null) {
driver.quit();
driver = null;
}
}
}
