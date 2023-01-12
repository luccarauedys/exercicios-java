public class App {
    public static void main(String[] args) throws Exception {
        Feriados feriados = new Feriados();

        System.out.println(feriados.verificarFeriado("12/05/2023"));

        System.out.println(feriados.verificarFeriado("25/12/2023"));

        System.out.println(feriados);
    }
}
