import java.util.Scanner;

public class exercicio07 {

    // Devolve o texto de trás para frente
    static String inverter(String texto) {
        String invertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }
        return invertido;
    }

    // Verifica se o texto é igual lido de trás para frente,
    // ignorando espaços e maiúsculas
    static boolean ehPalindromo(String texto) {
        String limpo = texto.replace(" ", "").toLowerCase();
        return limpo.equals(inverter(limpo));
    }

    // Mostra o resultado de uma única frase
    static void exibirResultado(String frase) {
        if (ehPalindromo(frase)) {
            System.out.println(frase + " → é palíndromo");
        } else {
            System.out.println(frase + " → não é palíndromo");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] frases = new String[3];

        for (int i = 0; i < frases.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª frase: ");
            frases[i] = sc.nextLine();
        }

        for (int i = 0; i < frases.length; i++) {
            exibirResultado(frases[i]);
        }
        sc.close();
    }
}