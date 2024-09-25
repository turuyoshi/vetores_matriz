import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] m = new double[3][3];
        
        // Preenchendo a matriz com valores digitados pelo usuário
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                m[i][j] = scanner.nextDouble();
            }
        }
        
        int linhaNum = 0;
        for (double[] linha : m) {
            double soma = 0;
            for (double valor : linha) {
                soma += valor;
            }
            System.out.println("A soma dos elementos da linha " + linhaNum + " é: " + soma);
            linhaNum++;
        }
    }
}
