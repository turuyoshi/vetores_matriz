Simport java.util.Scanner;
public class Atv4 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  
            boolean encontrado = false;
            int valor=0;
            while (valor != 100) {
             encontrado = false;   
            
            System.out.print("Digite o valor que deseja procurar no vetor: ");
             valor = scan.nextInt();
            

            for (int v = 0; v < num.length; v++) {
                if (num[v] == valor) {
                    System.out.println("O valor " + valor + " está na posição " + v + " do vetor.");
                    encontrado = true;
                }
            }
            

            if (!encontrado) {
                System.out.println("O valor " + valor + " não existe no vetor.");
            } else{

            }
        }
    }
}