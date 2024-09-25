import java.util.Scanner;
public class Atv1 {
    public static void main(String[] args) throws Exception {
        int [] numeros = new int[10];
        Scanner scan = new Scanner(System.in);
        for(int n=0; n<numeros.length;n++){
            System.out.println("Digite os 10 números:" );
            numeros[n] = scan.nextInt();
        }
        for (int numero:numeros){
        System.out.println(numero);
        }
    }
}
