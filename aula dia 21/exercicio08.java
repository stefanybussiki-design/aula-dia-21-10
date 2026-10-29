public class exercicio08 {

    // Verifica se o valor já está no array (posições vazias valem 0 e nunca batem com 1 a 60)
    static boolean contem(int[] numeros, int valor) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                return true;
            }
        }
        return false;
    }

    // Sorteia 'quantidade' números de 1 a 'maximo', sem repetir
    static int[] sortear(int quantidade, int maximo) {
        int[] sorteados = new int[quantidade];
        int total = 0; // quantos já foram guardados

        while (total < quantidade) {
            int numero = (int) (Math.random() * maximo) + 1;
            if (!contem(sorteados, numero)) {
                sorteados[total] = numero;
                total++;
            }
        }
        return sorteados;
    }

    // Mostra os números sorteados na mesma linha
    static void exibir(int[] numeros) {
        System.out.print("Números sorteados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" " + numeros[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] resultado = sortear(6, 60);
        exibir(resultado);
    }
}