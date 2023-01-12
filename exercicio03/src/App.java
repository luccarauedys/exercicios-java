public class App {
    public static void main(String[] args) throws Exception {
        Curso cursoPython = new Curso("1", "Curso de Python", 40, 260, 30);

        Curso cursoJava = new Curso("2", "Curso de Java", 60, 320, 40);

        Estudante estudante = new Estudante("11111111111", "João", "joao@gmail.com");
        estudante.setCurso(cursoJava);

        System.out.println(cursoPython);
        System.out.println(cursoJava);
        System.out.println(estudante);
    }
}
