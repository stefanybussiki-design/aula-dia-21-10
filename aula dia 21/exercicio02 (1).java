import java.util.Scanner;

public class exercicio02 {

    // Inverte os dígitos do número usando % 10 e / 10
    static int inverterNumero(int numero) {
        int invertido = 0;
        while (numero != 0) {
            int ultimoDigito = numero % 10;            // pega o último dígito
            invertido = invertido * 10 + ultimoDigito; // coloca no fim do número invertido
            numero = numero / 10;                      // remove o último dígito
        }
        return invertido;
    }

    // Mostra cada número do array com os dígitos invertidos
    static void exibirInvertidos(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ao contrário: " + inverterNumero(numeros[i]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro positivo: ");
            numeros[i] = sc.nextInt();
        }

        exibirInvertidos(numeros);
        sc.close();
    }
}