import java.util.Scanner;

public class exercicio03 {

    // Verifica se o número é primo (maior que 1 e divisível só por 1 e por ele mesmo)
    static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false; // 1, 0 e negativos não são primos
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false; // achou um divisor, então não é primo
            }
        }
        return true;
    }

    // Mostra somente os números primos do array
    static void exibirPrimos(int[] numeros) {
        System.out.print("Primos:");
        for (int i = 0; i < numeros.length; i++) {
            if (ehPrimo(numeros[i])) {
                System.out.print(" " + numeros[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = sc.nextInt();
        }

        exibirPrimos(numeros);
        sc.close();
    }
}