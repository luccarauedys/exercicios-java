public class Curso {
  private String id;
  private String nome;
  private int duracao;
  private int quantidadeDeAulas;
  private int quantidadeDeExercicios;

  public Curso() {
  }

  public Curso(String id, String nome, int duracao, int quantidadeDeAulas, int quantidadeDeExercicios) {
    this.id = id;
    this.nome = nome;
    this.duracao = duracao;
    this.quantidadeDeAulas = quantidadeDeAulas;
    this.quantidadeDeExercicios = quantidadeDeExercicios;
  }

  public String getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getDuracao() {
    return duracao;
  }

  public void setDuracao(int duracao) {
    this.duracao = duracao;
  }

  public int getQuantidadeDeAulas() {
    return quantidadeDeAulas;
  }

  public void setQuantidadeDeAulas(int quantidadeDeAulas) {
    this.quantidadeDeAulas = quantidadeDeAulas;
  }

  public int getQuantidadeDeExercicios() {
    return quantidadeDeExercicios;
  }

  public void setQuantidadeDeExercicios(int quantidadeDeExercicios) {
    this.quantidadeDeExercicios = quantidadeDeExercicios;
  }

  @Override
  public String toString() {
    return "Id: " + this.id + ", Nome: " + this.nome +
        ", Duração: " + this.duracao + " horas" + ", Quantidade de aulas: " + this.quantidadeDeAulas +
        ", Quantidade de exercícios: " + this.quantidadeDeExercicios;
  }
}
