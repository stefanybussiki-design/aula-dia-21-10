import java.util.Scanner;

public class exercicio04 {

    // IMC = peso / (altura ao quadrado)
    static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Classifica o IMC de acordo com as faixas do enunciado
    static String classificarImc(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    // Mostra o IMC e a classificação de cada pessoa
    static void exibirRelatorio(double[] pesos, double[] alturas) {
        for (int i = 0; i < pesos.length; i++) {
            double imc = calcularImc(pesos[i], alturas[i]);
            System.out.printf("Pessoa %d: IMC %.2f - %s%n", (i + 1), imc, classificarImc(imc));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] pesos = new double[4];
        double[] alturas = new double[4];

        for (int i = 0; i < pesos.length; i++) {
            System.out.print("Pessoa " + (i + 1) + " - peso (kg): ");
            pesos[i] = sc.nextDouble();
            System.out.print("Pessoa " + (i + 1) + " - altura (m): ");
            alturas[i] = sc.nextDouble();
        }
