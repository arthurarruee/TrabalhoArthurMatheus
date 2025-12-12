package Tasks;

import Framework.Utils.GeradorFaker;
import Framework.Utils.OperacoesArquivo;
import PageObjects.PagCadastro;
import org.openqa.selenium.WebDriver;

public class CadastroTask {

private WebDriver driver;
private PagCadastro pagCadastro;
private GeradorFaker faker;

public CadastroTask(WebDriver driver){
this.driver = driver;
pagCadastro = new PagCadastro(this.driver);
faker = new GeradorFaker();
}

public String[] cadastrarContaComSaldo(String saldo) {

String nome = faker.gerarPrimeiroNome();
String sobrenome = faker.gerarSobrenome();
String email = faker.gerarEmail();

pagCadastro.getInputNome().sendKeys(nome);
pagCadastro.getInputSobrenome().sendKeys(sobrenome);
pagCadastro.getInputEmail().sendKeys(email);
pagCadastro.getInputSaldo().sendKeys(saldo);
pagCadastro.getBotaoCadastrar().click();

OperacoesArquivo.salvarPropriedade("contas", email + "_nome", nome);
OperacoesArquivo.salvarPropriedade("contas", email + "_sobrenome", sobrenome);
OperacoesArquivo.salvarPropriedade("contas", email + "_saldo", saldo);

return new String[]{nome, sobrenome, email, saldo};
}
}
