import java.util.Scanner;

public class exercicio05 {

    // Conta as vogais do texto, sem diferenciar maiúscula de minúscula
    static int contarVogais(String texto) {
        int contador = 0;
        String minusculo = texto.toLowerCase();
        for (int i = 0; i < minusculo.length(); i++) {
            char c = minusculo.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    // Mostra a quantidade de vogais de cada frase do array
    static void exibirContagem(String[] frases) {
        for (int i = 0; i < frases.length; i++) {
            System.out.println(frases[i] + " → " + contarVogais(frases[i]) + " vogais");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] frases = new String[3];

        for (int i = 0; i < frases.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª palavra ou frase: ");
            frases[i] = sc.nextLine();
        }

        exibirContagem(frases);
        sc.close();
    }
}