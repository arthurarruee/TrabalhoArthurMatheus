package Framework.Utils;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.ByteArrayInputStream;

public class CapturaTela {

public static void capturarTela(WebDriver driver, String nome) {
byte[] imagem = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
Allure.attachment(nome, new ByteArrayInputStream(imagem));
}
}
