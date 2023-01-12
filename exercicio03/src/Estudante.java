public class Estudante {
  private String id;
  private String nome;
  private String email;
  private Curso curso = new Curso();

  public Estudante() {
  }

  public Estudante(String id, String nome, String email) {
    this.id = id;
    this.nome = nome;
    this.email = email;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Curso getCurso() {
    return curso;
  }

  public void setCurso(Curso curso) {
    this.curso = curso;
  }

  @Override
  public String toString() {
    return "Id: " + this.id + ", Nome: " + this.nome +
        ", Email: " + this.email + ", Curso: " + this.curso;
  }
}
