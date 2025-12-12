package Tasks;

import Framework.Utils.OperacoesArquivo;
import PageObjects.PagLogin;
import org.openqa.selenium.WebDriver;

public class LoginTask {

private WebDriver driver;
private PagLogin pagLogin;

public LoginTask(WebDriver driver){
this.driver = driver;
pagLogin = new PagLogin(this.driver);
}

public void efetuarLogin(String email, String senha){
pagLogin.getInputEmail().sendKeys(email);
pagLogin.getInputSenha().sendKeys(senha);
pagLogin.getBotaoLogin().click();
}
}
