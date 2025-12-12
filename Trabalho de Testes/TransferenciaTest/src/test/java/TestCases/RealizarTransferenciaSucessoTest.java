package TestCases;

import Framework.TestBase;
import Framework.Utils.TakeScreenshot;
import Tasks.CadastroTask;
import Tasks.LoginTask;
import Tasks.TransferenciaTask;
import Tasks.ExtratoTask;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

@Epic("Teste BugBank")
@Feature("Realizar Transferência com Sucesso")
public class RealizarTransferenciaSucessoTest extends TestBase {

private final WebDriver driver = getDriverManager();

CadastroTask cadastroTask = new CadastroTask(driver);
LoginTask loginTask = new LoginTask(driver);
TransferenciaTask transferenciaTask = new TransferenciaTask(driver);
ExtratoTask extratoTask = new ExtratoTask(driver);

@Test
@Story("Usuário realiza transferência entre duas contas")
@Description("Cria duas contas, realiza a transferência e valida extratos")
public void realizarTransferencia() {

try {
String[] conta1 = cadastroTask.cadastrarContaComSaldo("1000");
String[] conta2 = cadastroTask.cadastrarContaComSaldo("500");

loginTask.efetuarLogin(conta1[2], conta1[3]);
transferenciaTask.realizarTransferencia(conta2[2], "200");

String extratoOrigem = extratoTask.consultarExtrato();
System.out.println("Extrato Conta Origem: " + extratoOrigem);

loginTask.efetuarLogin(conta2[2], conta2[3]);
String extratoDestino = extratoTask.consultarExtrato();
System.out.println("Extrato Conta Destino: " + extratoDestino);

} catch (Exception e){
TakeScreenshot.attachPageScreenshot(driver,"ERRO_TRANSFERENCIA");
throw e;
}
}
}
