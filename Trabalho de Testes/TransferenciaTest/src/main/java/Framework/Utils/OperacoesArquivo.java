package Framework.Utils;

import java.io.*;
import java.util.Properties;

public class OperacoesArquivo {

private static final String CAMINHO_PROPRIEDADES =
System.getProperty("user.dir") + File.separator + "src" +
File.separator + "main" + File.separator + "resources" +
File.separator + "Properties" + File.separator;

public static Properties lerPropriedades(String nomeArquivo) {
Properties prop = new Properties();
try (InputStream input = new FileInputStream(CAMINHO_PROPRIEDADES + nomeArquivo + ".properties")) {
prop.load(input);
return prop;
} catch (Exception e) {
System.out.println("Não foi possível carregar o arquivo de propriedades");
return prop;
}
}

public static void salvarPropriedade(String nomeArquivo, String chave, String valor) {
try {
Properties prop = lerPropriedades(nomeArquivo);
try (OutputStream output = new FileOutputStream(CAMINHO_PROPRIEDADES + nomeArquivo + ".properties")) {
prop.setProperty(chave, valor);
prop.store(output, null);
}
} catch (IOException e) {
e.printStackTrace();
}
}
}
