import java.util.Scanner;

public class exercicio06 {

    // Gera as iniciais de cada parte do nome, no formato M.D.S.
    static String gerarIniciais(String nomeCompleto) {
        String[] partes = nomeCompleto.trim().split(" ");
        String iniciais = "";
        for (int i = 0; i < partes.length; i++) {
            if (!partes[i].isEmpty()) { // ignora espaços duplicados
                iniciais += Character.toUpperCase(partes[i].charAt(0)) + ".";
            }
        }
        return iniciais;
    }

    // Mostra a chamada numerada com o nome e as iniciais de cada aluno
    static void exibirChamada(String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + ". " + nomes[i] + " (" + gerarIniciais(nomes[i]) + ")");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[4];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome completo do " + (i + 1) + "º aluno: ");
            nomes[i] = sc.nextLine();
        }

        exibirChamada(nomes);
        sc.close();
    }
}