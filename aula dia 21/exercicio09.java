import java.util.Scanner;

public class exercicio09 {

    // Devolve o n-ésimo termo (posição 0 = 0, posição 1 = 1), de forma recursiva
    static int fibonacci(int n) {
        if (n == 0) {
            return 0; // caso base 1
        }
        if (n == 1) {
            return 1; // caso base 2
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // soma dos dois anteriores
    }

    // Soma todos os termos do array
    static int somar(int[] termos) {
        int soma = 0;
        for (int i = 0; i < termos.length; i++) {
            soma += termos[i];
        }
        return soma;
    }

    // Mostra os termos na mesma linha e a soma no final
    static void exibir(int[] termos) {
        for (int i = 0; i < termos.length; i++) {
            System.out.print(termos[i] + " ");
        }
        System.out.println("e soma " + somar(termos));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Digite N (de 1 a 30): ");
            n = sc.nextInt();
        } while (n < 1 || n > 30);

        int[] termos = new int[n];
        for (int i = 0; i < n; i++) {
            termos[i] = fibonacci(i);
        }

        exibir(termos);
        sc.close();
    }
}