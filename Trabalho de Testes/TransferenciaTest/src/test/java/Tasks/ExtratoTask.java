package Tasks;

import PageObjects.PagMenu;
import PageObjects.PagExtrato;
import org.openqa.selenium.WebDriver;

public class ExtratoTask {

private WebDriver driver;
private PagMenu pagMenu;
private PagExtrato pagExtrato;

public ExtratoTask(WebDriver driver){
this.driver = driver;
pagMenu = new PagMenu(this.driver);
pagExtrato = new PagExtrato(this.driver);
}

public String consultarExtrato(){
pagMenu.getMenuExtrato().click();
return pagExtrato.getListaTransacoes().getText();
}
}
