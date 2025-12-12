package Tasks;

import PageObjects.PagMenu;
import PageObjects.PagTransferencia;
import org.openqa.selenium.WebDriver;

public class TransferenciaTask {

private WebDriver driver;
private PagMenu pagMenu;
private PagTransferencia pagTransferencia;

public TransferenciaTask(WebDriver driver){
this.driver = driver;
pagMenu = new PagMenu(this.driver);
pagTransferencia = new PagTransferencia(this.driver);
}

public void realizarTransferencia(String destinatario, String valor){
pagMenu.getMenuTransferencia().click();
pagTransferencia.getInputDestinatario().sendKeys(destinatario);
pagTransferencia.getInputValor().sendKeys(valor);
pagTransferencia.getBotaoTransferir().click();
}
}
