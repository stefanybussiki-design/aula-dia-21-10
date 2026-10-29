import java.util.Scanner;

public class exercicio01 {

    // Conta quantos dígitos o número tem, dividindo por 10 até chegar a 0
    static int contarDigitos(int numero) {
        if (numero == 0) {
            return 1; // o número 0 tem 1 dígito
        }
        int contador = 0;
        while (numero != 0) {
            numero = numero / 10;
            contador++;
        }
        return contador;
    }

    // Mostra a quantidade de dígitos de cada número do array
    static void exibirDigitos(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " tem " + contarDigitos(numeros[i]) + " dígito(s)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro positivo: ");
            numeros[i] = sc.nextInt();
        }

        exibirDigitos(numeros);
        sc.close();
    }
}