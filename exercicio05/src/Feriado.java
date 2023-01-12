public class Feriado {
  private String data;
  private String nome;

  public Feriado(String data, String nome) {
    this.data = data;
    this.nome = nome;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
