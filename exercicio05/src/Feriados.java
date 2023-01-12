import java.util.ArrayList;

public class Feriados {
  ArrayList<Feriado> listaDeferiados = new ArrayList<>();

  public Feriados() {
    listaDeferiados.add(new Feriado("01/01/2023", "Confraternização Mundial"));
    listaDeferiados.add(new Feriado("21/02/2023", "Carnaval"));
    listaDeferiados.add(new Feriado("17/04/2023", "Páscoa"));
    listaDeferiados.add(new Feriado("21/04/2023", "Tiradentes"));
    listaDeferiados.add(new Feriado("01/05/2023", "Dia do Trabalho"));
    listaDeferiados.add(new Feriado("08/06/2023", "Corpus Christi"));
    listaDeferiados.add(new Feriado("07/09/2023", "Independência do Brasil"));
    listaDeferiados.add(new Feriado("12/10/2023", "Nossa Senhora Aparecida"));
    listaDeferiados.add(new Feriado("02/11/2023", "Finados"));
    listaDeferiados.add(new Feriado("15/11/2023", "Proclamação da República"));
    listaDeferiados.add(new Feriado("25/12/2023", "Natal"));
  }

  public String verificarFeriado(String data) {
    for (Feriado feriado : listaDeferiados) {
      if (feriado.getData().equals(data))
        return "Nome do feriado: " + feriado.getNome();
    }

    return "Não existe feriado com essa data.";
  }

  public String toString() {
    StringBuilder str = new StringBuilder();

    for (Feriado feriado : listaDeferiados) {
      str.append(feriado.getData() + " => " + feriado.getNome() + "\n");
    }

    return str.toString();
  }
}
