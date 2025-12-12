package TestCases;

import Framework.TestBase;
import Framework.Utils.TakeScreenshot;
import Tasks.CadastroTask;
import Tasks.LoginTask;
import Tasks.TransferenciaTask;
import Tasks.ExtratoTask;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

public class RealizarTransferenciaSucessoCSVTest extends TestBase {

private final WebDriver driver = getDriverManager();

CadastroTask cadastroTask = new CadastroTask(driver);
LoginTask loginTask = new LoginTask(driver);
TransferenciaTask transferenciaTask = new TransferenciaTask(driver);
ExtratoTask extratoTask = new ExtratoTask(driver);

@ParameterizedTest
@CsvFileSource(resources = "/CSV/contasCSV.csv", numLinesToSkip = 1)
public void realizarTransferencia(String saldoConta1, String saldoConta2, String valorTransferencia){

try {
String[] conta1 = cadastroTask.cadastrarContaComSaldo(saldoConta1);
String[] conta2 = cadastroTask.cadastrarContaComSaldo(saldoConta2);

loginTask.efetuarLogin(conta1[2], conta1[3]);

transferenciaTask.realizarTransferencia(conta2[2], valorTransferencia);

String extratoOrigem = extratoTask.consultarExtrato();
System.out.println("Extrato Conta Origem: " + extratoOrigem);

driver.navigate().refresh();
loginTask.efetuarLogin(conta2[2], conta2[3]);

String extratoDestino = extratoTask.consultarExtrato();
System.out.println("Extrato Conta Destino: " + extratoDestino);

} catch (Exception e){
TakeScreenshot.attachPageScreenshot(driver, "ERRO_TRANSFERENCIA");
throw e;
}

}
}
