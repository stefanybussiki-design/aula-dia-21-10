import java.util.Scanner;

public class exercicio10 {

    // Total de movimentos para n discos, de forma recursiva (resultado: 2^n - 1)
    static int contarMovimentos(int discos) {
        if (discos == 0) {
            return 0; // sem discos, sem movimentos
        }
        // move n-1 discos, move o maior, move n-1 discos de novo
        return 2 * contarMovimentos(discos - 1) + 1;
    }

    // Mostra os movimentos para levar n discos da origem ao destino
    static void hanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 0) {
            return; // caso base: nada a mover
        }
        hanoi(n - 1, origem, auxiliar, destino);  // tira os n-1 menores do caminho
        System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
        hanoi(n - 1, auxiliar, destino, origem);  // coloca os n-1 menores sobre o maior
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] jogos = new int[3];

        for (int i = 0; i < jogos.length; i++) {
            System.out.print("Quantidade de discos do jogo " + (i + 1) + ": ");
            jogos[i] = sc.nextInt();
        }

        for (int i = 0; i < jogos.length; i++) {
            System.out.println();
            System.out.println("Jogo " + (i + 1) + " (" + jogos[i] + " disco(s)):");
            hanoi(jogos[i], 'A', 'C', 'B');
            System.out.println("Total: " + contarMovimentos(jogos[i]) + " movimentos");
        }
        sc.close();
    }
}