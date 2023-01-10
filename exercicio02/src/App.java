public class App {
    public static void main(String[] args) throws Exception {
        int limite = 9;

        for (int i = 1; i <= limite; i++) {
            String linha = "";

            for (int j = 1; j <= i; j++)
                linha += i;

            System.out.println(linha);
        }
    }
}
