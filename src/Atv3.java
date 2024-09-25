import java.util.Scanner;
public class Atv3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] num = new int[5][5];
        
        for (int n = 0; n < num.length; n++) {
            for (int j = 0; j < num[n].length; j++) {
                System.out.print("Digite o valor para [" + n + "][" + j + "]: ");
                num[n][j] = scan.nextInt();
            }
        }
        
    
        int maior = num[0][0];
        for (int[] linha : num) {
            for (int valor : linha) {
                if (valor > maior) {
                    maior = valor;
                }
            }
        }
        System.out.println("O maior valor da matriz é: " + maior);
    }
}