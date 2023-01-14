import java.util.HashMap;
import java.util.Map;

public class Holydayzer {
  Map<String, String> feriados = new HashMap<>();

  public Holydayzer() {
    montaFeriados();
  }

  public void montaFeriados() {
    feriados.put("01/01/2023", "Confraternização Mundial");
    feriados.put("21/02/2023", "Carnaval");
    feriados.put("17/04/2023", "Páscoa");
    feriados.put("21/04/2023", "Tiradentes");
    feriados.put("01/05/2023", "Dia do Trabalho");
    feriados.put("08/06/2023", "Corpus Christi");
    feriados.put("07/09/2023", "Independência do Brasil");
    feriados.put("12/10/2023", "Nossa Senhora Aparecida");
    feriados.put("02/11/2023", "Finados");
    feriados.put("15/11/2023", "Proclamação da República");
    feriados.put("25/12/2023", "Natal");
  }

  public void pegaFeriado(String data) {
    String feriado = feriados.get(data);

    if (feriado == null) {
      System.out.println("Não existe feriado com essa data.");
      return;
    }

    System.out.println("Nome do feriado: " + feriado);
  }

  public void listaFeriados() {
    feriados.forEach((String data, String nome) -> {
      System.out.println(data + ": " + nome);
    });
  }
}
