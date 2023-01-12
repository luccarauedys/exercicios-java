import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String[] frutas = { "Morango", "Banana", "Uva", "Kiwi" };
        String[] outrasFrutas = { "Morango", "Acerola", "Laranja", "Kiwi" };

        ArrayList<String> itensEmComum = new ArrayList<>();

        for (int i = 0; i < frutas.length; i++) {
            if (Arrays.asList(outrasFrutas).contains(frutas[i]))
                itensEmComum.add(frutas[i]);
        }

        System.out.println(itensEmComum);
    }
}
