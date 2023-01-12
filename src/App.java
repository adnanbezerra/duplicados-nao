import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String[] arrayUm = { "banana", "jaca", "alemão", "uva", "swiatoslav" };
        String[] arrayDois = { "nanaba", "jacaré", "olimão", "ave", "swiatoslav" };
        ArrayList<String> saida = buscarSemelhantes(arrayUm, arrayDois);

        System.out.println("Os elementos repetidos são");
        for(int i = 0; i < saida.size(); i++) {
            System.out.println(saida.get(i));
        }
    }

    private static ArrayList<String> buscarSemelhantes(String[] arrayUm, String[] arrayDois) {
        ArrayList<String> saida = new ArrayList<>();

        for (int i = 0; i < arrayUm.length; i++) {
            for (int j = 0; j < arrayDois.length; j++) {
                if(arrayUm[i].equals(arrayDois[j])) {
                    saida.add(arrayUm[i]);
                }
            }
        }

        return saida;
    }
}