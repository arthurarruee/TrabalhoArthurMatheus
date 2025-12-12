package Framework.Utils;

import com.github.javafaker.Faker;
import java.util.Locale;

public class GeradorFaker {

private Faker faker;

public GeradorFaker() {
faker = new Faker(new Locale("pt-BR"));
}

public String gerarPrimeiroNome() {
return faker.name().firstName();
}

public String gerarSobrenome() {
return faker.name().lastName();
}

public String gerarCep() {
return faker.address().zipCode();
}

public String gerarEmail() {
return faker.internet().emailAddress();
}
}
